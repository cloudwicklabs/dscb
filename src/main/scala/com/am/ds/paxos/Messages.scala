package com.am.ds.paxos

import akka.actor.ActorRef

/**
 * Messages passed among actors
 * @author ashrith 
 */
case class Proposal(n: Int, v: Int)

// system -> Proposer messages
case class Proposers(proposers: Seq[ActorRef])

// Proposer -> Proposer messages
case class StandForElection(name: String)

// Proposer -> self messages
case object StartPreparation

// Proposer -> Acceptor messages
case class PrepareRequest(n: Int)
case class AcceptRequest(proposal: Proposal)

// Acceptor -> Proposer messages
case class PrepareResponse(n: Int, prevProposal: Option[Proposal])
case class AcceptResponse(proposal: Proposal)

// Acceptor -> Learner messages
case class Learn(value: Int)
