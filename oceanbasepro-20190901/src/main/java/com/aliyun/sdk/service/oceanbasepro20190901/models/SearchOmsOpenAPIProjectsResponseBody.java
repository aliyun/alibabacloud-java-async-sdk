// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchOmsOpenAPIProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>SearchOmsOpenAPIProjectsResponseBody</p>
 */
public class SearchOmsOpenAPIProjectsResponseBody extends TeaModel {
    @NameInMap("Advice")
    private String advice;

    @NameInMap("Code")
    private String code;

    @NameInMap("Cost")
    private String cost;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorDetail")
    private ErrorDetail errorDetail;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private SearchOmsOpenAPIProjectsResponseBody(Builder builder) {
        this.advice = builder.advice;
        this.code = builder.code;
        this.cost = builder.cost;
        this.data = builder.data;
        this.errorDetail = builder.errorDetail;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchOmsOpenAPIProjectsResponseBody create() {
        return builder().build();
    }

    /**
     * @return advice
     */
    public String getAdvice() {
        return this.advice;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return cost
     */
    public String getCost() {
        return this.cost;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorDetail
     */
    public ErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String advice; 
        private String code; 
        private String cost; 
        private java.util.List < Data> data; 
        private ErrorDetail errorDetail; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * 建议（旧）
         */
        public Builder advice(String advice) {
            this.advice = advice;
            return this;
        }

        /**
         * 错误码（旧）
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 耗时，单位为秒
         */
        public Builder cost(String cost) {
            this.cost = cost;
            return this;
        }

        /**
         * 返回的业务数据
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 错误详情
         */
        public Builder errorDetail(ErrorDetail errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }

        /**
         * 错误描述（旧）
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 页序号，分页查询时生效
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 页大小，分页查询时生效
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 请求 ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 是否调用成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * 总数，分页查询时生效
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SearchOmsOpenAPIProjectsResponseBody build() {
            return new SearchOmsOpenAPIProjectsResponseBody(this);
        } 

    } 

    public static class DestConfig extends TeaModel {
        @NameInMap("EnableMsgTrace")
        private Boolean enableMsgTrace;

        @NameInMap("EndpointId")
        private String endpointId;

        @NameInMap("EndpointType")
        private String endpointType;

        @NameInMap("MsgTags")
        private String msgTags;

        @NameInMap("Partition")
        private Integer partition;

        @NameInMap("PartitionMode")
        private String partitionMode;

        @NameInMap("ProducerGroup")
        private String producerGroup;

        @NameInMap("SendMsgTimeout")
        private Long sendMsgTimeout;

        @NameInMap("SequenceEnable")
        private Boolean sequenceEnable;

        @NameInMap("SequenceStartTimestamp")
        private Long sequenceStartTimestamp;

        @NameInMap("SerializerType")
        private String serializerType;

        @NameInMap("TopicType")
        private String topicType;

        private DestConfig(Builder builder) {
            this.enableMsgTrace = builder.enableMsgTrace;
            this.endpointId = builder.endpointId;
            this.endpointType = builder.endpointType;
            this.msgTags = builder.msgTags;
            this.partition = builder.partition;
            this.partitionMode = builder.partitionMode;
            this.producerGroup = builder.producerGroup;
            this.sendMsgTimeout = builder.sendMsgTimeout;
            this.sequenceEnable = builder.sequenceEnable;
            this.sequenceStartTimestamp = builder.sequenceStartTimestamp;
            this.serializerType = builder.serializerType;
            this.topicType = builder.topicType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestConfig create() {
            return builder().build();
        }

        /**
         * @return enableMsgTrace
         */
        public Boolean getEnableMsgTrace() {
            return this.enableMsgTrace;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return msgTags
         */
        public String getMsgTags() {
            return this.msgTags;
        }

        /**
         * @return partition
         */
        public Integer getPartition() {
            return this.partition;
        }

        /**
         * @return partitionMode
         */
        public String getPartitionMode() {
            return this.partitionMode;
        }

        /**
         * @return producerGroup
         */
        public String getProducerGroup() {
            return this.producerGroup;
        }

        /**
         * @return sendMsgTimeout
         */
        public Long getSendMsgTimeout() {
            return this.sendMsgTimeout;
        }

        /**
         * @return sequenceEnable
         */
        public Boolean getSequenceEnable() {
            return this.sequenceEnable;
        }

        /**
         * @return sequenceStartTimestamp
         */
        public Long getSequenceStartTimestamp() {
            return this.sequenceStartTimestamp;
        }

        /**
         * @return serializerType
         */
        public String getSerializerType() {
            return this.serializerType;
        }

        /**
         * @return topicType
         */
        public String getTopicType() {
            return this.topicType;
        }

        public static final class Builder {
            private Boolean enableMsgTrace; 
            private String endpointId; 
            private String endpointType; 
            private String msgTags; 
            private Integer partition; 
            private String partitionMode; 
            private String producerGroup; 
            private Long sendMsgTimeout; 
            private Boolean sequenceEnable; 
            private Long sequenceStartTimestamp; 
            private String serializerType; 
            private String topicType; 

            /**
             * 目标端为 RocketMQ 时，此参数表示是否开启消息追踪
             */
            public Builder enableMsgTrace(Boolean enableMsgTrace) {
                this.enableMsgTrace = enableMsgTrace;
                return this;
            }

            /**
             * 指定数据源 id
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * 数据源类型 (MYSQL, MARIADB, OB_MYSQL, OB_MYSQL_CE, OB_ORACLE, ORACLE, DB2_LUW, KAFKA, ROCKETMQ, DATAHUB, SYBASE, LOGPROXY, ADB, DBP_OP_ROUTE, DMS, IDB, TIDB)
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * 目标端为 RocketMQ 时，设置投递消息的 tag（标签）
             */
            public Builder msgTags(String msgTags) {
                this.msgTags = msgTags;
                return this;
            }

            /**
             * 目标端为消息队列（Kafka/DataHub/RocketMQ）时，若 partitionMode 为 ONE 模式，此参数表示分区索引
             */
            public Builder partition(Integer partition) {
                this.partition = partition;
                return this;
            }

            /**
             * 目标端为消息队列（Kafka/DataHub/RocketMQ）时，选择分区模式 (ONE, HASH, TABLE)
             */
            public Builder partitionMode(String partitionMode) {
                this.partitionMode = partitionMode;
                return this;
            }

            /**
             * 目标端为 RocketMQ 时，指定投递消息的生产者组
             */
            public Builder producerGroup(String producerGroup) {
                this.producerGroup = producerGroup;
                return this;
            }

            /**
             * 目标端为 RocketMQ 时，设置单次投递消息的超时时间，单位为秒
             */
            public Builder sendMsgTimeout(Long sendMsgTimeout) {
                this.sendMsgTimeout = sendMsgTimeout;
                return this;
            }

            /**
             * 目标端为 DataHub 时，此参数表示是否开启消息序列
             */
            public Builder sequenceEnable(Boolean sequenceEnable) {
                this.sequenceEnable = sequenceEnable;
                return this;
            }

            /**
             * 目标端为 DataHub 时，若开启消息序列，设置序列起始时间，单位为秒级时间戳
             */
            public Builder sequenceStartTimestamp(Long sequenceStartTimestamp) {
                this.sequenceStartTimestamp = sequenceStartTimestamp;
                return this;
            }

            /**
             * 目标端为消息队列（Kafka/DataHub/RocketMQ）时，选择文本序列化类型 (DEFAULT, CANAL, DATAWORKS_V2, SHAREPLEX, DEFAULT_WITH_SCHEMA)
             */
            public Builder serializerType(String serializerType) {
                this.serializerType = serializerType;
                return this;
            }

            /**
             * 目标端为 DataHub 时，投递消息所属 topic 的类型 (TUPLE, BLOB)
             */
            public Builder topicType(String topicType) {
                this.topicType = topicType;
                return this;
            }

            public DestConfig build() {
                return new DestConfig(this);
            } 

        } 

    }
    public static class Labels extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        private Labels(Builder builder) {
            this.count = builder.count;
            this.creator = builder.creator;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer count; 
            private String creator; 
            private String id; 
            private String name; 

            /**
             * 使用此标签的项目数量
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * 创建人(只有在管理员视角下才进行返回)
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * 标签id
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 标签名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    public static class SourceConfig extends TeaModel {
        @NameInMap("EnableMsgTrace")
        private Boolean enableMsgTrace;

        @NameInMap("EndpointId")
        private String endpointId;

        @NameInMap("EndpointType")
        private String endpointType;

        @NameInMap("MsgTags")
        private String msgTags;

        @NameInMap("Partition")
        private Integer partition;

        @NameInMap("PartitionMode")
        private String partitionMode;

        @NameInMap("ProducerGroup")
        private String producerGroup;

        @NameInMap("SendMsgTimeout")
        private Long sendMsgTimeout;

        @NameInMap("SequenceEnable")
        private Boolean sequenceEnable;

        @NameInMap("SequenceStartTimestamp")
        private Long sequenceStartTimestamp;

        @NameInMap("SerializerType")
        private String serializerType;

        @NameInMap("TopicType")
        private String topicType;

        private SourceConfig(Builder builder) {
            this.enableMsgTrace = builder.enableMsgTrace;
            this.endpointId = builder.endpointId;
            this.endpointType = builder.endpointType;
            this.msgTags = builder.msgTags;
            this.partition = builder.partition;
            this.partitionMode = builder.partitionMode;
            this.producerGroup = builder.producerGroup;
            this.sendMsgTimeout = builder.sendMsgTimeout;
            this.sequenceEnable = builder.sequenceEnable;
            this.sequenceStartTimestamp = builder.sequenceStartTimestamp;
            this.serializerType = builder.serializerType;
            this.topicType = builder.topicType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceConfig create() {
            return builder().build();
        }

        /**
         * @return enableMsgTrace
         */
        public Boolean getEnableMsgTrace() {
            return this.enableMsgTrace;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return msgTags
         */
        public String getMsgTags() {
            return this.msgTags;
        }

        /**
         * @return partition
         */
        public Integer getPartition() {
            return this.partition;
        }

        /**
         * @return partitionMode
         */
        public String getPartitionMode() {
            return this.partitionMode;
        }

        /**
         * @return producerGroup
         */
        public String getProducerGroup() {
            return this.producerGroup;
        }

        /**
         * @return sendMsgTimeout
         */
        public Long getSendMsgTimeout() {
            return this.sendMsgTimeout;
        }

        /**
         * @return sequenceEnable
         */
        public Boolean getSequenceEnable() {
            return this.sequenceEnable;
        }

        /**
         * @return sequenceStartTimestamp
         */
        public Long getSequenceStartTimestamp() {
            return this.sequenceStartTimestamp;
        }

        /**
         * @return serializerType
         */
        public String getSerializerType() {
            return this.serializerType;
        }

        /**
         * @return topicType
         */
        public String getTopicType() {
            return this.topicType;
        }

        public static final class Builder {
            private Boolean enableMsgTrace; 
            private String endpointId; 
            private String endpointType; 
            private String msgTags; 
            private Integer partition; 
            private String partitionMode; 
            private String producerGroup; 
            private Long sendMsgTimeout; 
            private Boolean sequenceEnable; 
            private Long sequenceStartTimestamp; 
            private String serializerType; 
            private String topicType; 

            /**
             * 目标端为 RocketMQ 时，此参数表示是否开启消息追踪
             */
            public Builder enableMsgTrace(Boolean enableMsgTrace) {
                this.enableMsgTrace = enableMsgTrace;
                return this;
            }

            /**
             * 指定数据源 id
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * 数据源类型 (MYSQL, MARIADB, OB_MYSQL, OB_MYSQL_CE, OB_ORACLE, ORACLE, DB2_LUW, KAFKA, ROCKETMQ, DATAHUB, SYBASE, LOGPROXY, ADB, DBP_OP_ROUTE, DMS, IDB, TIDB)
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * 目标端为 RocketMQ 时，设置投递消息的 tag（标签）
             */
            public Builder msgTags(String msgTags) {
                this.msgTags = msgTags;
                return this;
            }

            /**
             * 目标端为消息队列（Kafka/DataHub/RocketMQ）时，若 partitionMode 为 ONE 模式，此参数表示分区索引
             */
            public Builder partition(Integer partition) {
                this.partition = partition;
                return this;
            }

            /**
             * 目标端为消息队列（Kafka/DataHub/RocketMQ）时，选择分区模式 (ONE, HASH, TABLE)
             */
            public Builder partitionMode(String partitionMode) {
                this.partitionMode = partitionMode;
                return this;
            }

            /**
             * 目标端为 RocketMQ 时，指定投递消息的生产者组
             */
            public Builder producerGroup(String producerGroup) {
                this.producerGroup = producerGroup;
                return this;
            }

            /**
             * 目标端为 RocketMQ 时，设置单次投递消息的超时时间，单位为秒
             */
            public Builder sendMsgTimeout(Long sendMsgTimeout) {
                this.sendMsgTimeout = sendMsgTimeout;
                return this;
            }

            /**
             * 目标端为 DataHub 时，此参数表示是否开启消息序列
             */
            public Builder sequenceEnable(Boolean sequenceEnable) {
                this.sequenceEnable = sequenceEnable;
                return this;
            }

            /**
             * 目标端为 DataHub 时，若开启消息序列，设置序列起始时间，单位为秒级时间戳
             */
            public Builder sequenceStartTimestamp(Long sequenceStartTimestamp) {
                this.sequenceStartTimestamp = sequenceStartTimestamp;
                return this;
            }

            /**
             * 目标端为消息队列（Kafka/DataHub/RocketMQ）时，选择文本序列化类型 (DEFAULT, CANAL, DATAWORKS_V2, SHAREPLEX, DEFAULT_WITH_SCHEMA)
             */
            public Builder serializerType(String serializerType) {
                this.serializerType = serializerType;
                return this;
            }

            /**
             * 目标端为 DataHub 时，投递消息所属 topic 的类型 (TUPLE, BLOB)
             */
            public Builder topicType(String topicType) {
                this.topicType = topicType;
                return this;
            }

            public SourceConfig build() {
                return new SourceConfig(this);
            } 

        } 

    }
    public static class ErrorDetails extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Level")
        private String level;

        @NameInMap("Message")
        private String message;

        @NameInMap("Proposal")
        private String proposal;

        private ErrorDetails(Builder builder) {
            this.code = builder.code;
            this.level = builder.level;
            this.message = builder.message;
            this.proposal = builder.proposal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorDetails create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return proposal
         */
        public String getProposal() {
            return this.proposal;
        }

        public static final class Builder {
            private String code; 
            private String level; 
            private String message; 
            private String proposal; 

            /**
             * 错误码（旧）
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CRITICAL, ERROR, WARN
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * 错误描述（旧）
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Proposal.
             */
            public Builder proposal(String proposal) {
                this.proposal = proposal;
                return this;
            }

            public ErrorDetails build() {
                return new ErrorDetails(this);
            } 

        } 

    }
    public static class ExtraInfo extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorDetails")
        private java.util.List < ErrorDetails> errorDetails;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("ErrorParam")
        private java.util.Map < String, String > errorParam;

        @NameInMap("FailedTime")
        private String failedTime;

        private ExtraInfo(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorDetails = builder.errorDetails;
            this.errorMsg = builder.errorMsg;
            this.errorParam = builder.errorParam;
            this.failedTime = builder.failedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtraInfo create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorDetails
         */
        public java.util.List < ErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return errorParam
         */
        public java.util.Map < String, String > getErrorParam() {
            return this.errorParam;
        }

        /**
         * @return failedTime
         */
        public String getFailedTime() {
            return this.failedTime;
        }

        public static final class Builder {
            private String errorCode; 
            private java.util.List < ErrorDetails> errorDetails; 
            private String errorMsg; 
            private java.util.Map < String, String > errorParam; 
            private String failedTime; 

            /**
             * 错误码（旧） (AUTHENTICATION_ERROR, PARAM_ERROR, PARAM_ERROR_MESSAGE, NOT_IMPLEMENTED_ERROR, SHARD_COLUMNS_CONFLICT_MESSAGE, FAILED_PARSE_TOKEN_MESSAGE, CONNECT_CHECK_ERROR, NOT_SUPPORT_ERROR, CE_NOT_SUPPORT_ERROR, NOT_FOUND_ERROR, SHARDING_COLUMN_NOT_INCLUDED_ERROR, INNER_ERROR, DB_QUERY_ERROR, DATAHUB_QUERY_ERROR, USER_LACK_SYS_PRIV_ERROR, USER_LACK_TABLE_PRIV_ERROR, RM_API_ERROR, RM_TASK_ERROR, CM_API_ERROR, CM_API_NOT_SUCCESS, BAGUALU_API_ERROR, IDB_API_ERROR, SUPERVISOR_API_ERROR, OCP_API_ERROR, OCP_SERVICE_ERROR, OCP_QUERY_VERSION_FAILED, OCP_VERSION_INCORRECT_ERROR, OCP_VERSION_NOT_SUPPORTED_ERROR, OCP_API_USER_PASSWORD_INCORRECT_ERROR, OBSCHEMA_ERROR, EXECUTOR_THREAD_POOL_BUSY, NO_TABLE_SELECTED, NO_VIEW_SELECTED, SOURCE_CRAWLER_START_FAILED, SOURCE_CRAWLER_START_FAILED_DATA_EXPIRED, SOURCE_CRAWLER_START_TIMEOUT, DEST_WRITER_START_FAILED, WRITER_UNKNOWN_STATUS, DRC_TOPIC_EXISTS_ERROR, TOPIC_EMPTY_ERROR, REACH_WRITER_LIMIT_ERROR, FOUND_NO_FEASIBLE_STORE_ERROR, TOO_MANY_STORES_FOR_SUBTOPIC, TIMEOUT_EXCEPTION, KIPP_API_ERROR: KIPP 相关错误信息, KIPP_API_RESOURCE_NOT_FOUND, KIPP_API_INVALID_PARAM, KIPP_API_UNKNOWN_ERROR, KIPP_API_INTERNAL_ERROR, KIPP_API_SERVICE_UNAVAILABLE, OMS_AGENT_API_ERROR, KMS_API_ERROR, OMS_ENCRYPT_API_ERROR, OMS_DECRYPT_API_ERROR, ALIYUN_SDK_ERROR, YAOCHI_API_ERROR, RESOURCE_WITHOUT_STOCK_ERROR, RESOURCE_NO_AVAILABLE_ZONE, CM_SDK_ERROR, MIGRATION_PROJECT_STEP_PRECHECK_FAILED, PRE_CHECK_ERROR, FAILURES_CORRECT_ERROR, EXECUTE_DDL_FAILURE, EXECUTE_DDL_UNSUPPORTED_OR_FAILURE, STRUCT_RECORD_DDL_NOT_FOUND, STRUCT_RECORD_INDEX_NOT_FOUND, STRUCT_RECORD_NOT_FOUND, STRUCT_RECORD_NOT_FOUND_IN_DBCAT, SCHEMA_OBJECT_TYPE_NOT_SUPPORT_ERROR, POLAR_MYSQL_NETWORK_TYPE_NOT_SUPPORT_ERROR, RDS_NETWORK_TYPE_NOT_SUPPORT_ERROR, RDS_VPC_NETWORK_NOT_SUPPORT_ERROR, DB_TYPE_NOT_SUPPORT_ERROR, SYNC_TYPE_NOT_SUPPORT_ERROR, SLAVE_OPERATION_STEP_NOT_SUPPORT_ERROR, BYTE_USED_TYPE_NOT_SUPPORT_ERROR, MANY_TO_ONE_SCHEMA_TABLE_REVERSE_INCR_NOT_SUPPORT_ERROR, DUPLICATE_SCHEMA_TABLE_ERROR, OMS_STEP_NOT_SUPPORT_ERROR, ORACLE_DATABASE_ROLE_NOT_SUPPORT_ERROR, OLD_PRE_CHECK_NOT_SUPPORT_ERROR, SCHEMA_ONE_TO_MANY_NOT_SUPPORT_ERROR, PROJECT_NOT_FOUND_ERROR, ENDPOINT_NOT_FOUND_ERROR, ENDPOINT_NAME_ALREADY_EXIST_ERROR, ENDPOINT_QUERY_ERROR, ENDPOINT_SQL_QUERY_ERROR, PROJECT_NAME_ALREADY_EXIST_ERROR, CHECKER_NOT_FOUND_ERROR, CHECKER_FAILED_ERROR, CHECKER_STATUS_UNEXPECTED_ERROR, CHECKER_NO_TASK_TYPE_ERROR, WORKER_INSTANCE_NOT_FOUND_ERROR, WORKER_INSTANCE_ALLOCATING_ERROR, LOG_SERVICE_TOPIC_NOT_FOUND_ERROR, CLUSTER_NOT_FOUND_ERROR, TENANT_NOT_FOUND_ERROR, DATABASE_NOT_FOUND_ERROR, TABLE_NOT_FOUND_ERROR, COLUMN_NOT_FOUND_ERROR, TABLE_META_NOT_FOUND_ERROR, SYBASE_CHARSET_NOT_FOUND_ERROR, OCP_NOT_FOUND_ERROR, REGION_NOT_FOUND_ERROR, OCP_ALREADY_EXIST_ERROR, ALARM_CHANNEL_NAME_ALREADY_EXIST_ERROR, SEND_MARKDOWN_TEXT_TO_WEBHOOK_FAILED_EXCEPTION_RESPONSE, SEND_MARKDOWN_TEXT_TO_WEBHOOK_FAILED_EXCEPTION_STATUS, LABEL_ALREADY_EXIST_ERROR, LABEL_NOT_EXIST_ERROR, OCP_ALREADY_USED_ERROR, REGION_INFO_INCONSISTENT_ERROR, OCP_NAME_EMPTY_ERROR, MASTER_SLAVE_ENDPOINT_NAME_INCONSISTENT_ERROR, LOG_FILE_NOT_FOUND_ERROR, OPERATION_NOT_ALLOWED_ERROR, PROJECT_OPERATION_NOT_ALLOWED_ERROR, PROJECT_RELEASE_FAILED, STRUCT_MIGRATION_RETRY_NOT_ALLOWED_ERROR, WORKER_INSTANCE_OPERATION_NOT_ALLOWED_ERROR, USER_OPERATION_NOT_ALLOWED_ERROR, OCP_NAME_OR_REGION_NOT_ALLOWED_UPDATE, UPDATE_CONFIG_WITH_NEWLINE_NOT_ALLOWED, EXIST_UNRELEASED_PROJECT_ERROR, EXIST_UNRELEASED_TOPIC_ERROR, LABEL_CREATE_NOT_ALLOWED_ERROR, LABEL_UPDATE_NOT_ALLOWED_ERROR, LABEL_DELETE_NOT_ALLOWED_ERROR, TOPIC_NAME_INVALID_ERROR, INVALID_STATUS_ERROR, INVALID_CSV_HEAD_ERROR, INVALID_CSV_BODY_ERROR, DUPLICATE_SCHEMA_TABLE_SETTING_ERROR, PROJECT_INVALID_STATUS_ERROR, PROJECT_INVALID_CONNECTOR_COUNT_ERROR, WORKER_INSTANCE_INVALID_STATUS_ERROR, LOG_SERVICE_INVALID_STATUS_ERROR, STEP_INVALID_STATUS_ERROR, UPDATE_ALLOW_DEST_TABLE_NOT_EMPTY_NOT_ALLOWED_ERROR, EXIST_INCONSISTENCY_ERROR, OMS_SWITCH_SUBSTEP_FAILED_ERROR, ENDPOINT_ID_INVALID_ERROR, DB_QUERY_VERSION_EMPTY_ERROR, ENDPOINT_NAME_INVALID_ERROR, ENDPOINT_SCHEMA_NOT_ALLOWED_ERROR, ENDPOINT_SCHEMA_CHAR_NOT_ALLOWED_ERROR, NAME_HAS_SPACE_EXCEPTION, CONFIG_CONVERT_VALUE_ERROR, CONFIG_VALUE_EXCEEDS_LIMIT_ERROR, CONFIG_KEY_NOT_FOUND_KEY_ERROR, CONFIG_VALUE_NOT_EMPTY_ERROR, SCHEMA_HAS_CONVERT_INFO, TIME_SERIES_QUERY_SERVICE_ERROR, ETL_VERIFY_ERROR, ETL_SYNTAX_UNSUPPORTED, ETL_FIELD_NOTFOUND, ETL_FAILED_PARSE_SQL, ETL_VAL_TYPE_ERROR, NOT_SUPPORT_GENERATE_COLUMNS, NOT_SUPPORT_UPDATE_ETL, LOCK_FAILED, OMS_USER_EXIST_ERROR, OMS_USER_NOT_FOUND_ERROR, OMS_USER_NAME_LENGTH_CONSTRAINT, OMS_USER_PASSWORD_ERROR, USER_NAME_OR_PASSWORD_ERROR, OMS_USER_PASSWORD_VALIDATION_ERROR, OMS_USER_PASSWORD_DEFAULT_ERROR, OMS_USER_PERMISSION_DENIED_ERROR, OMS_USER_EDIT_ADMIN_ROLE_INFO_PERMISSION_DENIED_ERROR, OMS_USER_ILLEGAL_DELETED_ERROR, CONNECTOR_TASK_NOT_FOUND_ERROR, CONNECTOR_TASK_NUM_LIMIT_ERROR, CONNECTOR_TASK_DELETE_ERROR, METRIC_SERVICE_ERROR, SYNC_PROJECT_TYPE_INVALID_ERROR, SYNC_SHARDING_COLUMNS_INVALID_ERROR, SYNC_PROJECT_PRODUCER_GROUP_INVALID_ERROR, SYNC_PROJECT_PRODUCER_GROUP_LIMIT_EXCEEDS_ERROR, SYNC_PROJECT_COMPLEMENT_CONFIG_ERROR, META_SCHEMA_CREATE_FAILED, RESUME_STEP_FAILED, SCHEMA_INCONSISTENCY, SCHEMA_CASCADE_MAPPING_NOT_SUPPORT_ERROR, SCHEMA_NOT_EXISTED, SCHEMA_EXISTED, SCHEMA_NOT_EXIST, BLACK_LIST_MATCH_ALL, BLACK_LIST_CONTAIN_NON_WHITE_SCHEMA, BLACK_WHITE_LIST_PARAM_INVALID_ERROR, OPERATOR_ERROR, OPERATOR_DIMENSION_NOT_SUPPORT, OPERATOR_PULL_LOG_ERROR, OPERATOR_UPDATE_CONFIG_NOT_SUPPORT, KAFKA_CREATE_TOPIC_ERROR, KAFKA_QUERY_TOPIC_ERROR, KAFKA_BUILD_PROPERTIES_ERROR, ROCKETMQ_CREATE_TOPIC_ERROR, ROCKETMQ_QUERY_TOPIC_ERROR, SYNC_OBJECT_EMPTY_ERROR, WRITER_NUMBER_NOT_UNIQUE, WRITER_NOT_ACTIVE, PROJECT_NAME_DUPLICATE_ERROR, EMPTY_FAILED_STRUCT_MIGRATION_TABLES_ERROR, LOGIC_TABLE_NOT_SUPPORT_UPDATE_OBJECT_ERROR, LOGIC_REQUEST_ERROR, LOGIC_DTO_BUILD_ERROR, UNEXPECTED_REMOTE_API_RESULT, OCEANBASE_USER_UNEXPECTED, STORE_CREATE_FAILED_ERROR, STORE_START_FAILED, STORE_NOT_PULL_LOG_ERROR, ALL_HOSTS_STATUS_ERROR, WORKER_ECS_NOT_FOUND_ERROR, WORKER_ECS_NOT_FOUND_FOR_USER_ERROR, WORKER_POD_NOT_FOUND_ERROR, WORKER_POD_NOT_FOUND_FOR_USER_ERROR, WORKER_INSTANCE_NOT_FOUND_ERROR_V2, WORKER_INSTANCE_NOT_FOUND_FOR_USER_ERROR)
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * 错误详情
             */
            public Builder errorDetails(java.util.List < ErrorDetails> errorDetails) {
                this.errorDetails = errorDetails;
                return this;
            }

            /**
             * 错误消息
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * 错误相关参数
             */
            public Builder errorParam(java.util.Map < String, String > errorParam) {
                this.errorParam = errorParam;
                return this;
            }

            /**
             * 错误时间格式："yyyy-MM-ddTHH:mm:ss"
             */
            public Builder failedTime(String failedTime) {
                this.failedTime = failedTime;
                return this;
            }

            public ExtraInfo build() {
                return new ExtraInfo(this);
            } 

        } 

    }
    public static class ConnectorFullProgressOverview extends TeaModel {
        @NameInMap("EstimatedRemainingTimeOfSec")
        private Long estimatedRemainingTimeOfSec;

        @NameInMap("EstimatedTotalCount")
        private Long estimatedTotalCount;

        @NameInMap("FinishedCount")
        private Long finishedCount;

        @NameInMap("Progress")
        private Integer progress;

        private ConnectorFullProgressOverview(Builder builder) {
            this.estimatedRemainingTimeOfSec = builder.estimatedRemainingTimeOfSec;
            this.estimatedTotalCount = builder.estimatedTotalCount;
            this.finishedCount = builder.finishedCount;
            this.progress = builder.progress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectorFullProgressOverview create() {
            return builder().build();
        }

        /**
         * @return estimatedRemainingTimeOfSec
         */
        public Long getEstimatedRemainingTimeOfSec() {
            return this.estimatedRemainingTimeOfSec;
        }

        /**
         * @return estimatedTotalCount
         */
        public Long getEstimatedTotalCount() {
            return this.estimatedTotalCount;
        }

        /**
         * @return finishedCount
         */
        public Long getFinishedCount() {
            return this.finishedCount;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        public static final class Builder {
            private Long estimatedRemainingTimeOfSec; 
            private Long estimatedTotalCount; 
            private Long finishedCount; 
            private Integer progress; 

            /**
             * 预计剩余时间，秒单位(MAX)
             */
            public Builder estimatedRemainingTimeOfSec(Long estimatedRemainingTimeOfSec) {
                this.estimatedRemainingTimeOfSec = estimatedRemainingTimeOfSec;
                return this;
            }

            /**
             * 预估迁移数据量(SUM)
             */
            public Builder estimatedTotalCount(Long estimatedTotalCount) {
                this.estimatedTotalCount = estimatedTotalCount;
                return this;
            }

            /**
             * 已完成迁移数据量(SUM)
             */
            public Builder finishedCount(Long finishedCount) {
                this.finishedCount = finishedCount;
                return this;
            }

            /**
             * finishedCount / estimatedTotalCount
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            public ConnectorFullProgressOverview build() {
                return new ConnectorFullProgressOverview(this);
            } 

        } 

    }
    public static class StepInfo extends TeaModel {
        @NameInMap("Capacity")
        private Long capacity;

        @NameInMap("Checkpoint")
        private String checkpoint;

        @NameInMap("ConnectorFullProgressOverview")
        private ConnectorFullProgressOverview connectorFullProgressOverview;

        @NameInMap("DeployId")
        private String deployId;

        @NameInMap("DstIops")
        private Long dstIops;

        @NameInMap("DstRps")
        private Long dstRps;

        @NameInMap("DstRpsRef")
        private Long dstRpsRef;

        @NameInMap("DstRt")
        private Long dstRt;

        @NameInMap("DstRtRef")
        private Long dstRtRef;

        @NameInMap("Gmt")
        private Long gmt;

        @NameInMap("Inconsistencies")
        private Long inconsistencies;

        @NameInMap("IncrTimestampCheckpoint")
        private Long incrTimestampCheckpoint;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("ProcessedRecords")
        private Long processedRecords;

        @NameInMap("Skipped")
        private Boolean skipped;

        @NameInMap("SrcIops")
        private Long srcIops;

        @NameInMap("SrcIopsRef")
        private Long srcIopsRef;

        @NameInMap("SrcRps")
        private Long srcRps;

        @NameInMap("SrcRpsRef")
        private Long srcRpsRef;

        @NameInMap("SrcRt")
        private Long srcRt;

        @NameInMap("SrcRtRef")
        private Long srcRtRef;

        @NameInMap("Validated")
        private Boolean validated;

        private StepInfo(Builder builder) {
            this.capacity = builder.capacity;
            this.checkpoint = builder.checkpoint;
            this.connectorFullProgressOverview = builder.connectorFullProgressOverview;
            this.deployId = builder.deployId;
            this.dstIops = builder.dstIops;
            this.dstRps = builder.dstRps;
            this.dstRpsRef = builder.dstRpsRef;
            this.dstRt = builder.dstRt;
            this.dstRtRef = builder.dstRtRef;
            this.gmt = builder.gmt;
            this.inconsistencies = builder.inconsistencies;
            this.incrTimestampCheckpoint = builder.incrTimestampCheckpoint;
            this.jobId = builder.jobId;
            this.processedRecords = builder.processedRecords;
            this.skipped = builder.skipped;
            this.srcIops = builder.srcIops;
            this.srcIopsRef = builder.srcIopsRef;
            this.srcRps = builder.srcRps;
            this.srcRpsRef = builder.srcRpsRef;
            this.srcRt = builder.srcRt;
            this.srcRtRef = builder.srcRtRef;
            this.validated = builder.validated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StepInfo create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return connectorFullProgressOverview
         */
        public ConnectorFullProgressOverview getConnectorFullProgressOverview() {
            return this.connectorFullProgressOverview;
        }

        /**
         * @return deployId
         */
        public String getDeployId() {
            return this.deployId;
        }

        /**
         * @return dstIops
         */
        public Long getDstIops() {
            return this.dstIops;
        }

        /**
         * @return dstRps
         */
        public Long getDstRps() {
            return this.dstRps;
        }

        /**
         * @return dstRpsRef
         */
        public Long getDstRpsRef() {
            return this.dstRpsRef;
        }

        /**
         * @return dstRt
         */
        public Long getDstRt() {
            return this.dstRt;
        }

        /**
         * @return dstRtRef
         */
        public Long getDstRtRef() {
            return this.dstRtRef;
        }

        /**
         * @return gmt
         */
        public Long getGmt() {
            return this.gmt;
        }

        /**
         * @return inconsistencies
         */
        public Long getInconsistencies() {
            return this.inconsistencies;
        }

        /**
         * @return incrTimestampCheckpoint
         */
        public Long getIncrTimestampCheckpoint() {
            return this.incrTimestampCheckpoint;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return processedRecords
         */
        public Long getProcessedRecords() {
            return this.processedRecords;
        }

        /**
         * @return skipped
         */
        public Boolean getSkipped() {
            return this.skipped;
        }

        /**
         * @return srcIops
         */
        public Long getSrcIops() {
            return this.srcIops;
        }

        /**
         * @return srcIopsRef
         */
        public Long getSrcIopsRef() {
            return this.srcIopsRef;
        }

        /**
         * @return srcRps
         */
        public Long getSrcRps() {
            return this.srcRps;
        }

        /**
         * @return srcRpsRef
         */
        public Long getSrcRpsRef() {
            return this.srcRpsRef;
        }

        /**
         * @return srcRt
         */
        public Long getSrcRt() {
            return this.srcRt;
        }

        /**
         * @return srcRtRef
         */
        public Long getSrcRtRef() {
            return this.srcRtRef;
        }

        /**
         * @return validated
         */
        public Boolean getValidated() {
            return this.validated;
        }

        public static final class Builder {
            private Long capacity; 
            private String checkpoint; 
            private ConnectorFullProgressOverview connectorFullProgressOverview; 
            private String deployId; 
            private Long dstIops; 
            private Long dstRps; 
            private Long dstRpsRef; 
            private Long dstRt; 
            private Long dstRtRef; 
            private Long gmt; 
            private Long inconsistencies; 
            private Long incrTimestampCheckpoint; 
            private String jobId; 
            private Long processedRecords; 
            private Boolean skipped; 
            private Long srcIops; 
            private Long srcIopsRef; 
            private Long srcRps; 
            private Long srcRpsRef; 
            private Long srcRt; 
            private Long srcRtRef; 
            private Boolean validated; 

            /**
             * 预估总行数。
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * 位点时间，unix timestamp，单位秒
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * 项目为同步项目时，表示同步项目的全量同步进度信息
             */
            public Builder connectorFullProgressOverview(ConnectorFullProgressOverview connectorFullProgressOverview) {
                this.connectorFullProgressOverview = connectorFullProgressOverview;
                return this;
            }

            /**
             * 资源部署Id
             */
            public Builder deployId(String deployId) {
                this.deployId = deployId;
                return this;
            }

            /**
             * 目标端读取/写入流量，单位：字节数/秒。
             */
            public Builder dstIops(Long dstIops) {
                this.dstIops = dstIops;
                return this;
            }

            /**
             * 目标端读取/写入 rps，单位：记录数/秒。
             */
            public Builder dstRps(Long dstRps) {
                this.dstRps = dstRps;
                return this;
            }

            /**
             * 目标端读取/写入 rps 基准值。
             */
            public Builder dstRpsRef(Long dstRpsRef) {
                this.dstRpsRef = dstRpsRef;
                return this;
            }

            /**
             * 目标端读取/写入 rt，单位：毫秒/条。
             */
            public Builder dstRt(Long dstRt) {
                this.dstRt = dstRt;
                return this;
            }

            /**
             * 目标端读取/写入 rt 基准值。
             */
            public Builder dstRtRef(Long dstRtRef) {
                this.dstRtRef = dstRtRef;
                return this;
            }

            /**
             * 位点采集时间，unix timestamp，单位秒
             */
            public Builder gmt(Long gmt) {
                this.gmt = gmt;
                return this;
            }

            /**
             * 全量校验不一致的数量
             */
            public Builder inconsistencies(Long inconsistencies) {
                this.inconsistencies = inconsistencies;
                return this;
            }

            /**
             * 如果是增量场景，会是位点时间，unix timestamp, 单位秒
             */
            public Builder incrTimestampCheckpoint(Long incrTimestampCheckpoint) {
                this.incrTimestampCheckpoint = incrTimestampCheckpoint;
                return this;
            }

            /**
             * 步骤的当前子 job id
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * 已完成迁移行数/实际行数。
             */
            public Builder processedRecords(Long processedRecords) {
                this.processedRecords = processedRecords;
                return this;
            }

            /**
             * 子状态，skipped 标识这一步骤是否跳过
             */
            public Builder skipped(Boolean skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * 源端读取流量，单位：字节数/秒。
             */
            public Builder srcIops(Long srcIops) {
                this.srcIops = srcIops;
                return this;
            }

            /**
             * 源端读取流量，基准值。
             */
            public Builder srcIopsRef(Long srcIopsRef) {
                this.srcIopsRef = srcIopsRef;
                return this;
            }

            /**
             * 源端读取 rps，单位：记录数/秒。
             */
            public Builder srcRps(Long srcRps) {
                this.srcRps = srcRps;
                return this;
            }

            /**
             * 源端读取 rps 基准值。
             */
            public Builder srcRpsRef(Long srcRpsRef) {
                this.srcRpsRef = srcRpsRef;
                return this;
            }

            /**
             * 源端读取 rt，单位：毫秒/条。
             */
            public Builder srcRt(Long srcRt) {
                this.srcRt = srcRt;
                return this;
            }

            /**
             * 源端读取 rt 基准值。
             */
            public Builder srcRtRef(Long srcRtRef) {
                this.srcRtRef = srcRtRef;
                return this;
            }

            /**
             * 子状态，validated 标识全量校验 checker 是否已完成
             */
            public Builder validated(Boolean validated) {
                this.validated = validated;
                return this;
            }

            public StepInfo build() {
                return new StepInfo(this);
            } 

        } 

    }
    public static class Steps extends TeaModel {
        @NameInMap("EstimatedRemainingSeconds")
        private Long estimatedRemainingSeconds;

        @NameInMap("ExtraInfo")
        private ExtraInfo extraInfo;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("Interactive")
        private Boolean interactive;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("StepDescription")
        private String stepDescription;

        @NameInMap("StepInfo")
        private StepInfo stepInfo;

        @NameInMap("StepName")
        private String stepName;

        @NameInMap("StepOrder")
        private Integer stepOrder;

        @NameInMap("StepProgress")
        private Integer stepProgress;

        @NameInMap("StepStatus")
        private String stepStatus;

        private Steps(Builder builder) {
            this.estimatedRemainingSeconds = builder.estimatedRemainingSeconds;
            this.extraInfo = builder.extraInfo;
            this.finishTime = builder.finishTime;
            this.interactive = builder.interactive;
            this.startTime = builder.startTime;
            this.stepDescription = builder.stepDescription;
            this.stepInfo = builder.stepInfo;
            this.stepName = builder.stepName;
            this.stepOrder = builder.stepOrder;
            this.stepProgress = builder.stepProgress;
            this.stepStatus = builder.stepStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Steps create() {
            return builder().build();
        }

        /**
         * @return estimatedRemainingSeconds
         */
        public Long getEstimatedRemainingSeconds() {
            return this.estimatedRemainingSeconds;
        }

        /**
         * @return extraInfo
         */
        public ExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return interactive
         */
        public Boolean getInteractive() {
            return this.interactive;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return stepDescription
         */
        public String getStepDescription() {
            return this.stepDescription;
        }

        /**
         * @return stepInfo
         */
        public StepInfo getStepInfo() {
            return this.stepInfo;
        }

        /**
         * @return stepName
         */
        public String getStepName() {
            return this.stepName;
        }

        /**
         * @return stepOrder
         */
        public Integer getStepOrder() {
            return this.stepOrder;
        }

        /**
         * @return stepProgress
         */
        public Integer getStepProgress() {
            return this.stepProgress;
        }

        /**
         * @return stepStatus
         */
        public String getStepStatus() {
            return this.stepStatus;
        }

        public static final class Builder {
            private Long estimatedRemainingSeconds; 
            private ExtraInfo extraInfo; 
            private String finishTime; 
            private Boolean interactive; 
            private String startTime; 
            private String stepDescription; 
            private StepInfo stepInfo; 
            private String stepName; 
            private Integer stepOrder; 
            private Integer stepProgress; 
            private String stepStatus; 

            /**
             * 预计剩余时间，全量步骤时生效
             */
            public Builder estimatedRemainingSeconds(Long estimatedRemainingSeconds) {
                this.estimatedRemainingSeconds = estimatedRemainingSeconds;
                return this;
            }

            /**
             * 补充信息（json）
             */
            public Builder extraInfo(ExtraInfo extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * 步骤结束时间，格式："yyyy-MM-ddTHH:mm:ss"
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * 当前步骤是否需要用户确认执行，不由后台调度推进。
             */
            public Builder interactive(Boolean interactive) {
                this.interactive = interactive;
                return this;
            }

            /**
             * 步骤开始时间，格式："yyyy-MM-ddTHH:mm:ss"
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * 步骤描述（结构迁移/全量迁移/全量校验/增量日志拉取/增量同步/增量校验）
             */
            public Builder stepDescription(String stepDescription) {
                this.stepDescription = stepDescription;
                return this;
            }

            /**
             * 步骤详情（json）
             */
            public Builder stepInfo(StepInfo stepInfo) {
                this.stepInfo = stepInfo;
                return this;
            }

            /**
             * 步骤名（struct_migration/full_migration/full_validation/incr_log_pull/incr_sync/incr_validation） (PRE_CHECK, PREPARE, STRUCT_MIGRATION, INDEX_MIGRATION, STRUCT_SYNC, FULL_MIGRATION, APP_SWITCH, REVERSE_INCR_SYNC, FULL_VALIDATION, INCR_LOG_PULL, INCR_SYNC, INCR_VALIDATION, SYNC_PREPARE, SYNC_INCR_LOG_PULL, CONNECTOR_FULL_SYNC, CONNECTOR_INCR_SYNC)
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            /**
             * 步骤顺序
             */
            public Builder stepOrder(Integer stepOrder) {
                this.stepOrder = stepOrder;
                return this;
            }

            /**
             * 步骤进度, 整数单位为 %
             */
            public Builder stepProgress(Integer stepProgress) {
                this.stepProgress = stepProgress;
                return this;
            }

            /**
             * 步骤状态 (INIT: 初始化, RUNNING: 运行中, FAILED: 失败, FINISHED: 已完成, SUSPEND: 暂停中, MONITORING: 持续监控状态，用于增量同步和增量校验的持续监控态)
             */
            public Builder stepStatus(String stepStatus) {
                this.stepStatus = stepStatus;
                return this;
            }

            public Steps build() {
                return new Steps(this);
            } 

        } 

    }
    public static class AdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        private java.util.List < String > distributedKeys;

        @NameInMap("PartitionLifeCycle")
        private Integer partitionLifeCycle;

        @NameInMap("PartitionStatement")
        private String partitionStatement;

        @NameInMap("PrimaryKeys")
        private java.util.List < String > primaryKeys;

        private AdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List < String > getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public Integer getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List < String > getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List < String > distributedKeys; 
            private Integer partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List < String > primaryKeys; 

            /**
             * 分布键列
             */
            public Builder distributedKeys(java.util.List < String > distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * 表的生命周期
             */
            public Builder partitionLifeCycle(Integer partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * 分区表达式
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * 主键列
             */
            public Builder primaryKeys(java.util.List < String > primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public AdbTableSchema build() {
                return new AdbTableSchema(this);
            } 

        } 

    }
    public static class Tables extends TeaModel {
        @NameInMap("AdbTableSchema")
        private AdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        private java.util.List < String > filterColumns;

        @NameInMap("MappedName")
        private String mappedName;

        @NameInMap("ShardColumns")
        private java.util.List < String > shardColumns;

        @NameInMap("TableId")
        private String tableId;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("Type")
        private String type;

        @NameInMap("WhereClause")
        private String whereClause;

        private Tables(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.mappedName = builder.mappedName;
            this.shardColumns = builder.shardColumns;
            this.tableId = builder.tableId;
            this.tableName = builder.tableName;
            this.type = builder.type;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public AdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List < String > getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return shardColumns
         */
        public java.util.List < String > getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return tableId
         */
        public String getTableId() {
            return this.tableId;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private AdbTableSchema adbTableSchema; 
            private java.util.List < String > filterColumns; 
            private String mappedName; 
            private java.util.List < String > shardColumns; 
            private String tableId; 
            private String tableName; 
            private String type; 
            private String whereClause; 

            /**
             * ADB table schema，目标端为 ADB 时，额外配置信息，用于结构同步
             */
            public Builder adbTableSchema(AdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * 过滤列列表，即指定同步哪些列
             */
            public Builder filterColumns(java.util.List < String > filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * 映射对象 table/topic，目的端为数据库时，此参数为映射表名，目的端为消息队列时，此参数为映射 topic
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * 分片键列列表，用于目标端为消息队列的场景，安
             */
            public Builder shardColumns(java.util.List < String > shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * 表 ID，源端为逻辑数据源 IDB 时生效
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * 表名
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * DATABASE, TABLE
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * 行过滤表
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
    public static class Databases extends TeaModel {
        @NameInMap("DatabaseId")
        private String databaseId;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("MappedName")
        private String mappedName;

        @NameInMap("Tables")
        private java.util.List < Tables> tables;

        @NameInMap("TenantName")
        private String tenantName;

        @NameInMap("Type")
        private String type;

        private Databases(Builder builder) {
            this.databaseId = builder.databaseId;
            this.databaseName = builder.databaseName;
            this.mappedName = builder.mappedName;
            this.tables = builder.tables;
            this.tenantName = builder.tenantName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return databaseId
         */
        public String getDatabaseId() {
            return this.databaseId;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return tables
         */
        public java.util.List < Tables> getTables() {
            return this.tables;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String databaseId; 
            private String databaseName; 
            private String mappedName; 
            private java.util.List < Tables> tables; 
            private String tenantName; 
            private String type; 

            /**
             * 库 ID，源端为逻辑数据源 IDB 时生效
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            /**
             * 库名
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * 映射对象 database，目标端为数据库时生效
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * 当前库下的传输表对象配置
             */
            public Builder tables(java.util.List < Tables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * 映射对象租户，源端为 OceanBase 时生效
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * DATABASE, TABLE
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
    public static class TransferMapping extends TeaModel {
        @NameInMap("Databases")
        private java.util.List < Databases> databases;

        @NameInMap("Mode")
        private String mode;

        private TransferMapping(Builder builder) {
            this.databases = builder.databases;
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferMapping create() {
            return builder().build();
        }

        /**
         * @return databases
         */
        public java.util.List < Databases> getDatabases() {
            return this.databases;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        public static final class Builder {
            private java.util.List < Databases> databases; 
            private String mode; 

            /**
             * 传统映射（源端库表映射），当且仅当 mode 为 NORMAL 是生效
             */
            public Builder databases(java.util.List < Databases> databases) {
                this.databases = databases;
                return this;
            }

            /**
             * 映射类型 (NORMAL, WHITE_AND_BLACK_LIST)
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            public TransferMapping build() {
                return new TransferMapping(this);
            } 

        } 

    }
    public static class IncrSyncStepTransferConfig extends TeaModel {
        @NameInMap("RecordTypeList")
        private java.util.List < String > recordTypeList;

        @NameInMap("StartTimestamp")
        private Long startTimestamp;

        @NameInMap("StoreLogKeptHour")
        private Long storeLogKeptHour;

        @NameInMap("StoreTransactionEnabled")
        private Boolean storeTransactionEnabled;

        @NameInMap("TransferStepType")
        private String transferStepType;

        private IncrSyncStepTransferConfig(Builder builder) {
            this.recordTypeList = builder.recordTypeList;
            this.startTimestamp = builder.startTimestamp;
            this.storeLogKeptHour = builder.storeLogKeptHour;
            this.storeTransactionEnabled = builder.storeTransactionEnabled;
            this.transferStepType = builder.transferStepType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IncrSyncStepTransferConfig create() {
            return builder().build();
        }

        /**
         * @return recordTypeList
         */
        public java.util.List < String > getRecordTypeList() {
            return this.recordTypeList;
        }

        /**
         * @return startTimestamp
         */
        public Long getStartTimestamp() {
            return this.startTimestamp;
        }

        /**
         * @return storeLogKeptHour
         */
        public Long getStoreLogKeptHour() {
            return this.storeLogKeptHour;
        }

        /**
         * @return storeTransactionEnabled
         */
        public Boolean getStoreTransactionEnabled() {
            return this.storeTransactionEnabled;
        }

        /**
         * @return transferStepType
         */
        public String getTransferStepType() {
            return this.transferStepType;
        }

        public static final class Builder {
            private java.util.List < String > recordTypeList; 
            private Long startTimestamp; 
            private Long storeLogKeptHour; 
            private Boolean storeTransactionEnabled; 
            private String transferStepType; 

            /**
             * 有增量同步阶段时，同步的增量数据类型
             */
            public Builder recordTypeList(java.util.List < String > recordTypeList) {
                this.recordTypeList = recordTypeList;
                return this;
            }

            /**
             * 有增量同步阶段时，增量起始位点，秒级时间戳
             */
            public Builder startTimestamp(Long startTimestamp) {
                this.startTimestamp = startTimestamp;
                return this;
            }

            /**
             * 有增量同步阶段，且增量日志拉取组件为 Store 时，日志保存时间
             */
            public Builder storeLogKeptHour(Long storeLogKeptHour) {
                this.storeLogKeptHour = storeLogKeptHour;
                return this;
            }

            /**
             * 有增量同步阶段时，且增量日志拉取组件为 Store 时，是否开启事务内序号编排
             */
            public Builder storeTransactionEnabled(Boolean storeTransactionEnabled) {
                this.storeTransactionEnabled = storeTransactionEnabled;
                return this;
            }

            /**
             * STRUCT, FULL, INCR
             */
            public Builder transferStepType(String transferStepType) {
                this.transferStepType = transferStepType;
                return this;
            }

            public IncrSyncStepTransferConfig build() {
                return new IncrSyncStepTransferConfig(this);
            } 

        } 

    }
    public static class TransferStepConfig extends TeaModel {
        @NameInMap("EnableFullSync")
        private Boolean enableFullSync;

        @NameInMap("EnableIncrSync")
        private Boolean enableIncrSync;

        @NameInMap("EnableStructSync")
        private Boolean enableStructSync;

        @NameInMap("IncrSyncStepTransferConfig")
        private IncrSyncStepTransferConfig incrSyncStepTransferConfig;

        private TransferStepConfig(Builder builder) {
            this.enableFullSync = builder.enableFullSync;
            this.enableIncrSync = builder.enableIncrSync;
            this.enableStructSync = builder.enableStructSync;
            this.incrSyncStepTransferConfig = builder.incrSyncStepTransferConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferStepConfig create() {
            return builder().build();
        }

        /**
         * @return enableFullSync
         */
        public Boolean getEnableFullSync() {
            return this.enableFullSync;
        }

        /**
         * @return enableIncrSync
         */
        public Boolean getEnableIncrSync() {
            return this.enableIncrSync;
        }

        /**
         * @return enableStructSync
         */
        public Boolean getEnableStructSync() {
            return this.enableStructSync;
        }

        /**
         * @return incrSyncStepTransferConfig
         */
        public IncrSyncStepTransferConfig getIncrSyncStepTransferConfig() {
            return this.incrSyncStepTransferConfig;
        }

        public static final class Builder {
            private Boolean enableFullSync; 
            private Boolean enableIncrSync; 
            private Boolean enableStructSync; 
            private IncrSyncStepTransferConfig incrSyncStepTransferConfig; 

            /**
             * 开启全量迁移
             */
            public Builder enableFullSync(Boolean enableFullSync) {
                this.enableFullSync = enableFullSync;
                return this;
            }

            /**
             * 开启增量同步
             */
            public Builder enableIncrSync(Boolean enableIncrSync) {
                this.enableIncrSync = enableIncrSync;
                return this;
            }

            /**
             * 开启结构同步
             */
            public Builder enableStructSync(Boolean enableStructSync) {
                this.enableStructSync = enableStructSync;
                return this;
            }

            /**
             * 增量同步步骤配置
             */
            public Builder incrSyncStepTransferConfig(IncrSyncStepTransferConfig incrSyncStepTransferConfig) {
                this.incrSyncStepTransferConfig = incrSyncStepTransferConfig;
                return this;
            }

            public TransferStepConfig build() {
                return new TransferStepConfig(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("BusinessName")
        private String businessName;

        @NameInMap("DestConfig")
        private DestConfig destConfig;

        @NameInMap("Labels")
        private java.util.List < Labels> labels;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("ProjectOwner")
        private String projectOwner;

        @NameInMap("SourceConfig")
        private SourceConfig sourceConfig;

        @NameInMap("Steps")
        private java.util.List < Steps> steps;

        @NameInMap("TransferMapping")
        private TransferMapping transferMapping;

        @NameInMap("TransferStepConfig")
        private TransferStepConfig transferStepConfig;

        private Data(Builder builder) {
            this.businessName = builder.businessName;
            this.destConfig = builder.destConfig;
            this.labels = builder.labels;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.projectOwner = builder.projectOwner;
            this.sourceConfig = builder.sourceConfig;
            this.steps = builder.steps;
            this.transferMapping = builder.transferMapping;
            this.transferStepConfig = builder.transferStepConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return businessName
         */
        public String getBusinessName() {
            return this.businessName;
        }

        /**
         * @return destConfig
         */
        public DestConfig getDestConfig() {
            return this.destConfig;
        }

        /**
         * @return labels
         */
        public java.util.List < Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return projectOwner
         */
        public String getProjectOwner() {
            return this.projectOwner;
        }

        /**
         * @return sourceConfig
         */
        public SourceConfig getSourceConfig() {
            return this.sourceConfig;
        }

        /**
         * @return steps
         */
        public java.util.List < Steps> getSteps() {
            return this.steps;
        }

        /**
         * @return transferMapping
         */
        public TransferMapping getTransferMapping() {
            return this.transferMapping;
        }

        /**
         * @return transferStepConfig
         */
        public TransferStepConfig getTransferStepConfig() {
            return this.transferStepConfig;
        }

        public static final class Builder {
            private String businessName; 
            private DestConfig destConfig; 
            private java.util.List < Labels> labels; 
            private String projectId; 
            private String projectName; 
            private String projectOwner; 
            private SourceConfig sourceConfig; 
            private java.util.List < Steps> steps; 
            private TransferMapping transferMapping; 
            private TransferStepConfig transferStepConfig; 

            /**
             * 业务系统标识(可选), 投递消息带上的特定字段
             */
            public Builder businessName(String businessName) {
                this.businessName = businessName;
                return this;
            }

            /**
             * 目标端传输配置
             */
            public Builder destConfig(DestConfig destConfig) {
                this.destConfig = destConfig;
                return this;
            }

            /**
             * 标签id集合
             */
            public Builder labels(java.util.List < Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * 项目id
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * 项目名称
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * 项目 Owner
             */
            public Builder projectOwner(String projectOwner) {
                this.projectOwner = projectOwner;
                return this;
            }

            /**
             * 源端传输配置
             */
            public Builder sourceConfig(SourceConfig sourceConfig) {
                this.sourceConfig = sourceConfig;
                return this;
            }

            /**
             * 项目步骤详情
             */
            public Builder steps(java.util.List < Steps> steps) {
                this.steps = steps;
                return this;
            }

            /**
             * 传输对象的映射关系
             */
            public Builder transferMapping(TransferMapping transferMapping) {
                this.transferMapping = transferMapping;
                return this;
            }

            /**
             * 传输步骤配置
             */
            public Builder transferStepConfig(TransferStepConfig transferStepConfig) {
                this.transferStepConfig = transferStepConfig;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class ErrorDetail extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Level")
        private String level;

        @NameInMap("Message")
        private String message;

        @NameInMap("Proposal")
        private String proposal;

        private ErrorDetail(Builder builder) {
            this.code = builder.code;
            this.level = builder.level;
            this.message = builder.message;
            this.proposal = builder.proposal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorDetail create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return proposal
         */
        public String getProposal() {
            return this.proposal;
        }

        public static final class Builder {
            private String code; 
            private String level; 
            private String message; 
            private String proposal; 

            /**
             * 错误码（新）
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * 错误等级（CRITICAL, ERROR, WARN）
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * 错误描述（新）
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * 建议（新）
             */
            public Builder proposal(String proposal) {
                this.proposal = proposal;
                return this;
            }

            public ErrorDetail build() {
                return new ErrorDetail(this);
            } 

        } 

    }
}
