/**
 * Generated by Scrooge
 *   version: 3.14.1
 *   rev: a996c1128a032845c508102d62e65fc0aa7a5f41
 *   built at: 20140501-114733
 */
package com.am.ds.raft.rpc.thrift

import com.twitter.scrooge.{
  TFieldBlob, ThriftException, ThriftStruct, ThriftStructCodec3, ThriftStructFieldInfo, ThriftUtil}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.{TMemoryBuffer, TTransport}
import java.nio.ByteBuffer
import java.util.Arrays
import scala.collection.immutable.{Map => immutable$Map}
import scala.collection.mutable.Builder
import scala.collection.mutable.{
  ArrayBuffer => mutable$ArrayBuffer, Buffer => mutable$Buffer,
  HashMap => mutable$HashMap, HashSet => mutable$HashSet}
import scala.collection.{Map, Set}


object AppendEntriesST extends ThriftStructCodec3[AppendEntriesST] {
  private val NoPassthroughFields = immutable$Map.empty[Short, TFieldBlob]
  val Struct = new TStruct("AppendEntriesST")
  val TermField = new TField("term", TType.I32, 1)
  val TermFieldManifest = implicitly[Manifest[Int]]
  val LeaderIdField = new TField("leaderId", TType.STRING, 2)
  val LeaderIdFieldManifest = implicitly[Manifest[String]]
  val CommitIndexField = new TField("commitIndex", TType.I64, 3)
  val CommitIndexFieldManifest = implicitly[Manifest[Long]]
  val PrevLogIndexField = new TField("prevLogIndex", TType.I64, 4)
  val PrevLogIndexFieldManifest = implicitly[Manifest[Long]]
  val PrevLogTermField = new TField("prevLogTerm", TType.I32, 5)
  val PrevLogTermFieldManifest = implicitly[Manifest[Int]]
  val EntriesField = new TField("entries", TType.LIST, 6)
  val EntriesFieldManifest = implicitly[Manifest[Seq[LogEntryST]]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      TermField,
      false,
      TermFieldManifest,
      None,
      None,
      immutable$Map(
      ),
      immutable$Map(
      )
    ),
    new ThriftStructFieldInfo(
      LeaderIdField,
      false,
      LeaderIdFieldManifest,
      None,
      None,
      immutable$Map(
      ),
      immutable$Map(
      )
    ),
    new ThriftStructFieldInfo(
      CommitIndexField,
      false,
      CommitIndexFieldManifest,
      None,
      None,
      immutable$Map(
      ),
      immutable$Map(
      )
    ),
    new ThriftStructFieldInfo(
      PrevLogIndexField,
      false,
      PrevLogIndexFieldManifest,
      None,
      None,
      immutable$Map(
      ),
      immutable$Map(
      )
    ),
    new ThriftStructFieldInfo(
      PrevLogTermField,
      false,
      PrevLogTermFieldManifest,
      None,
      None,
      immutable$Map(
      ),
      immutable$Map(
      )
    ),
    new ThriftStructFieldInfo(
      EntriesField,
      true,
      EntriesFieldManifest,
      None,
      Some(implicitly[Manifest[LogEntryST]]),
      immutable$Map(
      ),
      immutable$Map(
      )
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map[String, String](
    )

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: AppendEntriesST) {
    if (_item.leaderId == null) throw new TProtocolException("Required field leaderId cannot be null")
  }

  override def encode(_item: AppendEntriesST, _oproto: TProtocol) {
    _item.write(_oproto)
  }

  override def decode(_iprot: TProtocol): AppendEntriesST = {
    var term: Int = 0
    var _got_term = false
    var leaderId: String = null
    var _got_leaderId = false
    var commitIndex: Long = -1L
    var prevLogIndex: Long = -1L
    var prevLogTerm: Int = -1
    var entries: Option[Seq[LogEntryST]] = None
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.I32 => {
                term = readTermValue(_iprot)
                _got_term = true
              }
              case _actualType =>
                val _expectedType = TType.I32
            
                throw new TProtocolException(
                  "Received wrong type for field 'term' (expected=%s, actual=%s).".format(
                    ttypeToHuman(_expectedType),
                    ttypeToHuman(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRING => {
                leaderId = readLeaderIdValue(_iprot)
                _got_leaderId = true
              }
              case _actualType =>
                val _expectedType = TType.STRING
            
                throw new TProtocolException(
                  "Received wrong type for field 'leaderId' (expected=%s, actual=%s).".format(
                    ttypeToHuman(_expectedType),
                    ttypeToHuman(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.I64 => {
                commitIndex = readCommitIndexValue(_iprot)
              }
              case _actualType =>
                val _expectedType = TType.I64
            
                throw new TProtocolException(
                  "Received wrong type for field 'commitIndex' (expected=%s, actual=%s).".format(
                    ttypeToHuman(_expectedType),
                    ttypeToHuman(_actualType)
                  )
                )
            }
          case 4 =>
            _field.`type` match {
              case TType.I64 => {
                prevLogIndex = readPrevLogIndexValue(_iprot)
              }
              case _actualType =>
                val _expectedType = TType.I64
            
                throw new TProtocolException(
                  "Received wrong type for field 'prevLogIndex' (expected=%s, actual=%s).".format(
                    ttypeToHuman(_expectedType),
                    ttypeToHuman(_actualType)
                  )
                )
            }
          case 5 =>
            _field.`type` match {
              case TType.I32 => {
                prevLogTerm = readPrevLogTermValue(_iprot)
              }
              case _actualType =>
                val _expectedType = TType.I32
            
                throw new TProtocolException(
                  "Received wrong type for field 'prevLogTerm' (expected=%s, actual=%s).".format(
                    ttypeToHuman(_expectedType),
                    ttypeToHuman(_actualType)
                  )
                )
            }
          case 6 =>
            _field.`type` match {
              case TType.LIST => {
                entries = Some(readEntriesValue(_iprot))
              }
              case _actualType =>
                val _expectedType = TType.LIST
            
                throw new TProtocolException(
                  "Received wrong type for field 'entries' (expected=%s, actual=%s).".format(
                    ttypeToHuman(_expectedType),
                    ttypeToHuman(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    if (!_got_term) throw new TProtocolException("Required field 'AppendEntriesST' was not found in serialized data for struct AppendEntriesST")
    if (!_got_leaderId) throw new TProtocolException("Required field 'AppendEntriesST' was not found in serialized data for struct AppendEntriesST")
    new Immutable(
      term,
      leaderId,
      commitIndex,
      prevLogIndex,
      prevLogTerm,
      entries,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    term: Int,
    leaderId: String,
    commitIndex: Long = -1L,
    prevLogIndex: Long = -1L,
    prevLogTerm: Int = -1,
    entries: Option[Seq[LogEntryST]] = None
  ): AppendEntriesST =
    new Immutable(
      term,
      leaderId,
      commitIndex,
      prevLogIndex,
      prevLogTerm,
      entries
    )

  def unapply(_item: AppendEntriesST): Option[scala.Product6[Int, String, Long, Long, Int, Option[Seq[LogEntryST]]]] = Some(_item)


  private def readTermValue(_iprot: TProtocol): Int = {
    _iprot.readI32()
  }

  private def writeTermField(term_item: Int, _oprot: TProtocol) {
    _oprot.writeFieldBegin(TermField)
    writeTermValue(term_item, _oprot)
    _oprot.writeFieldEnd()
  }

  private def writeTermValue(term_item: Int, _oprot: TProtocol) {
    _oprot.writeI32(term_item)
  }

  private def readLeaderIdValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  private def writeLeaderIdField(leaderId_item: String, _oprot: TProtocol) {
    _oprot.writeFieldBegin(LeaderIdField)
    writeLeaderIdValue(leaderId_item, _oprot)
    _oprot.writeFieldEnd()
  }

  private def writeLeaderIdValue(leaderId_item: String, _oprot: TProtocol) {
    _oprot.writeString(leaderId_item)
  }

  private def readCommitIndexValue(_iprot: TProtocol): Long = {
    _iprot.readI64()
  }

  private def writeCommitIndexField(commitIndex_item: Long, _oprot: TProtocol) {
    _oprot.writeFieldBegin(CommitIndexField)
    writeCommitIndexValue(commitIndex_item, _oprot)
    _oprot.writeFieldEnd()
  }

  private def writeCommitIndexValue(commitIndex_item: Long, _oprot: TProtocol) {
    _oprot.writeI64(commitIndex_item)
  }

  private def readPrevLogIndexValue(_iprot: TProtocol): Long = {
    _iprot.readI64()
  }

  private def writePrevLogIndexField(prevLogIndex_item: Long, _oprot: TProtocol) {
    _oprot.writeFieldBegin(PrevLogIndexField)
    writePrevLogIndexValue(prevLogIndex_item, _oprot)
    _oprot.writeFieldEnd()
  }

  private def writePrevLogIndexValue(prevLogIndex_item: Long, _oprot: TProtocol) {
    _oprot.writeI64(prevLogIndex_item)
  }

  private def readPrevLogTermValue(_iprot: TProtocol): Int = {
    _iprot.readI32()
  }

  private def writePrevLogTermField(prevLogTerm_item: Int, _oprot: TProtocol) {
    _oprot.writeFieldBegin(PrevLogTermField)
    writePrevLogTermValue(prevLogTerm_item, _oprot)
    _oprot.writeFieldEnd()
  }

  private def writePrevLogTermValue(prevLogTerm_item: Int, _oprot: TProtocol) {
    _oprot.writeI32(prevLogTerm_item)
  }

  private def readEntriesValue(_iprot: TProtocol): Seq[LogEntryST] = {
    val _list = _iprot.readListBegin()
    if (_list.size == 0) {
      _iprot.readListEnd()
      Nil
    } else {
      val _rv = new mutable$ArrayBuffer[LogEntryST](_list.size)
      var _i = 0
      while (_i < _list.size) {
        _rv += {
            LogEntryST.decode(_iprot)
  
        }
        _i += 1
      }
      _iprot.readListEnd()
      _rv
    }
  }

  private def writeEntriesField(entries_item: Seq[LogEntryST], _oprot: TProtocol) {
    _oprot.writeFieldBegin(EntriesField)
    writeEntriesValue(entries_item, _oprot)
    _oprot.writeFieldEnd()
  }

  private def writeEntriesValue(entries_item: Seq[LogEntryST], _oprot: TProtocol) {
    _oprot.writeListBegin(new TList(TType.STRUCT, entries_item.size))
    entries_item.foreach { entries_item_element =>
      entries_item_element.write(_oprot)
    }
    _oprot.writeListEnd()
  }



  private def ttypeToHuman(byte: Byte) = {
    // from https://github.com/apache/thrift/blob/master/lib/java/src/org/apache/thrift/protocol/TType.java
    byte match {
      case TType.STOP   => "STOP"
      case TType.VOID   => "VOID"
      case TType.BOOL   => "BOOL"
      case TType.BYTE   => "BYTE"
      case TType.DOUBLE => "DOUBLE"
      case TType.I16    => "I16"
      case TType.I32    => "I32"
      case TType.I64    => "I64"
      case TType.STRING => "STRING"
      case TType.STRUCT => "STRUCT"
      case TType.MAP    => "MAP"
      case TType.SET    => "SET"
      case TType.LIST   => "LIST"
      case TType.ENUM   => "ENUM"
      case _            => "UNKNOWN"
    }
  }

  object Immutable extends ThriftStructCodec3[AppendEntriesST] {
    override def encode(_item: AppendEntriesST, _oproto: TProtocol) { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): AppendEntriesST = AppendEntriesST.decode(_iprot)
  }

  /**
   * The default read-only implementation of AppendEntriesST.  You typically should not need to
   * directly reference this class; instead, use the AppendEntriesST.apply method to construct
   * new instances.
   */
  class Immutable(
    val term: Int,
    val leaderId: String,
    val commitIndex: Long,
    val prevLogIndex: Long,
    val prevLogTerm: Int,
    val entries: Option[Seq[LogEntryST]],
    override val _passthroughFields: immutable$Map[Short, TFieldBlob]
  ) extends AppendEntriesST {
    def this(
      term: Int,
      leaderId: String,
      commitIndex: Long = -1L,
      prevLogIndex: Long = -1L,
      prevLogTerm: Int = -1,
      entries: Option[Seq[LogEntryST]] = None
    ) = this(
      term,
      leaderId,
      commitIndex,
      prevLogIndex,
      prevLogTerm,
      entries,
      Map.empty
    )
  }

  /**
   * This Proxy trait allows you to extend the AppendEntriesST trait with additional state or
   * behavior and implement the read-only methods from AppendEntriesST using an underlying
   * instance.
   */
  trait Proxy extends AppendEntriesST {
    protected def _underlying_AppendEntriesST: AppendEntriesST
    override def term: Int = _underlying_AppendEntriesST.term
    override def leaderId: String = _underlying_AppendEntriesST.leaderId
    override def commitIndex: Long = _underlying_AppendEntriesST.commitIndex
    override def prevLogIndex: Long = _underlying_AppendEntriesST.prevLogIndex
    override def prevLogTerm: Int = _underlying_AppendEntriesST.prevLogTerm
    override def entries: Option[Seq[LogEntryST]] = _underlying_AppendEntriesST.entries
    override def _passthroughFields = _underlying_AppendEntriesST._passthroughFields
  }
}

trait AppendEntriesST
  extends ThriftStruct
  with scala.Product6[Int, String, Long, Long, Int, Option[Seq[LogEntryST]]]
  with java.io.Serializable
{
  import AppendEntriesST._

  def term: Int
  def leaderId: String
  def commitIndex: Long
  def prevLogIndex: Long
  def prevLogTerm: Int
  def entries: Option[Seq[LogEntryST]]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1 = term
  def _2 = leaderId
  def _3 = commitIndex
  def _4 = prevLogIndex
  def _5 = prevLogTerm
  def _6 = entries

  /**
   * Gets a field value encoded as a binary blob using TCompactProtocol.  If the specified field
   * is present in the passthrough map, that value is returend.  Otherwise, if the specified field
   * is known and not optional and set to None, then the field is serialized and returned.
   */
  def getFieldBlob(_fieldId: Short): Option[TFieldBlob] = {
    lazy val _buff = new TMemoryBuffer(32)
    lazy val _oprot = new TCompactProtocol(_buff)
    _passthroughFields.get(_fieldId) orElse {
      val _fieldOpt: Option[TField] =
        _fieldId match {
          case 1 =>
            if (true) {
              writeTermValue(term, _oprot)
              Some(AppendEntriesST.TermField)
            } else {
              None
            }
          case 2 =>
            if (leaderId ne null) {
              writeLeaderIdValue(leaderId, _oprot)
              Some(AppendEntriesST.LeaderIdField)
            } else {
              None
            }
          case 3 =>
            if (true) {
              writeCommitIndexValue(commitIndex, _oprot)
              Some(AppendEntriesST.CommitIndexField)
            } else {
              None
            }
          case 4 =>
            if (true) {
              writePrevLogIndexValue(prevLogIndex, _oprot)
              Some(AppendEntriesST.PrevLogIndexField)
            } else {
              None
            }
          case 5 =>
            if (true) {
              writePrevLogTermValue(prevLogTerm, _oprot)
              Some(AppendEntriesST.PrevLogTermField)
            } else {
              None
            }
          case 6 =>
            if (entries.isDefined) {
              writeEntriesValue(entries.get, _oprot)
              Some(AppendEntriesST.EntriesField)
            } else {
              None
            }
          case _ => None
        }
      _fieldOpt match {
        case Some(_field) =>
          val _data = Arrays.copyOfRange(_buff.getArray, 0, _buff.length)
          Some(TFieldBlob(_field, _data))
        case None =>
          None
      }
    }
  }

  /**
   * Collects TCompactProtocol-encoded field values according to `getFieldBlob` into a map.
   */
  def getFieldBlobs(ids: TraversableOnce[Short]): immutable$Map[Short, TFieldBlob] =
    (ids flatMap { id => getFieldBlob(id) map { id -> _ } }).toMap

  /**
   * Sets a field using a TCompactProtocol-encoded binary blob.  If the field is a known
   * field, the blob is decoded and the field is set to the decoded value.  If the field
   * is unknown and passthrough fields are enabled, then the blob will be stored in
   * _passthroughFields.
   */
  def setField(_blob: TFieldBlob): AppendEntriesST = {
    var term: Int = this.term
    var leaderId: String = this.leaderId
    var commitIndex: Long = this.commitIndex
    var prevLogIndex: Long = this.prevLogIndex
    var prevLogTerm: Int = this.prevLogTerm
    var entries: Option[Seq[LogEntryST]] = this.entries
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        term = readTermValue(_blob.read)
      case 2 =>
        leaderId = readLeaderIdValue(_blob.read)
      case 3 =>
        commitIndex = readCommitIndexValue(_blob.read)
      case 4 =>
        prevLogIndex = readPrevLogIndexValue(_blob.read)
      case 5 =>
        prevLogTerm = readPrevLogTermValue(_blob.read)
      case 6 =>
        entries = Some(readEntriesValue(_blob.read))
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      term,
      leaderId,
      commitIndex,
      prevLogIndex,
      prevLogTerm,
      entries,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is subtracked
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): AppendEntriesST = {
    var term: Int = this.term
    var leaderId: String = this.leaderId
    var commitIndex: Long = this.commitIndex
    var prevLogIndex: Long = this.prevLogIndex
    var prevLogTerm: Int = this.prevLogTerm
    var entries: Option[Seq[LogEntryST]] = this.entries

    _fieldId match {
      case 1 =>
        term = 0
      case 2 =>
        leaderId = null
      case 3 =>
        commitIndex = -1L
      case 4 =>
        prevLogIndex = -1L
      case 5 =>
        prevLogTerm = -1
      case 6 =>
        entries = None
      case _ =>
    }
    new Immutable(
      term,
      leaderId,
      commitIndex,
      prevLogIndex,
      prevLogTerm,
      entries,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is subtracked
   * from the passthroughFields map, if present.
   */
  def unsetTerm: AppendEntriesST = unsetField(1)

  def unsetLeaderId: AppendEntriesST = unsetField(2)

  def unsetCommitIndex: AppendEntriesST = unsetField(3)

  def unsetPrevLogIndex: AppendEntriesST = unsetField(4)

  def unsetPrevLogTerm: AppendEntriesST = unsetField(5)

  def unsetEntries: AppendEntriesST = unsetField(6)


  override def write(_oprot: TProtocol) {
    AppendEntriesST.validate(this)
    _oprot.writeStructBegin(Struct)
    writeTermField(term, _oprot)
    if (leaderId ne null) writeLeaderIdField(leaderId, _oprot)
    writeCommitIndexField(commitIndex, _oprot)
    writePrevLogIndexField(prevLogIndex, _oprot)
    writePrevLogTermField(prevLogTerm, _oprot)
    if (entries.isDefined) writeEntriesField(entries.get, _oprot)
    _passthroughFields.values foreach { _.write(_oprot) }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    term: Int = this.term,
    leaderId: String = this.leaderId,
    commitIndex: Long = this.commitIndex,
    prevLogIndex: Long = this.prevLogIndex,
    prevLogTerm: Int = this.prevLogTerm,
    entries: Option[Seq[LogEntryST]] = this.entries,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): AppendEntriesST =
    new Immutable(
      term,
      leaderId,
      commitIndex,
      prevLogIndex,
      prevLogTerm,
      entries,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[AppendEntriesST]

  override def equals(other: Any): Boolean =
    _root_.scala.runtime.ScalaRunTime._equals(this, other) &&
      _passthroughFields == other.asInstanceOf[AppendEntriesST]._passthroughFields

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 6

  override def productElement(n: Int): Any = n match {
    case 0 => this.term
    case 1 => this.leaderId
    case 2 => this.commitIndex
    case 3 => this.prevLogIndex
    case 4 => this.prevLogTerm
    case 5 => this.entries
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "AppendEntriesST"
}