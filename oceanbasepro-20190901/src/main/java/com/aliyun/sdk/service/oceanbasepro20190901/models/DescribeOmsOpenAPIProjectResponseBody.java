// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOmsOpenAPIProjectResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOmsOpenAPIProjectResponseBody</p>
 */
public class DescribeOmsOpenAPIProjectResponseBody extends TeaModel {
    @NameInMap("Advice")
    private String advice;

    @NameInMap("Code")
    private String code;

    @NameInMap("Cost")
    private String cost;

    @NameInMap("Data")
    private Data data;

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

    private DescribeOmsOpenAPIProjectResponseBody(Builder builder) {
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

    public static DescribeOmsOpenAPIProjectResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
        private ErrorDetail errorDetail; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * The suggestions (old).
         */
        public Builder advice(String advice) {
            this.advice = advice;
            return this;
        }

        /**
         * The error code (old).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The time spent in processing the request, in seconds.
         */
        public Builder cost(String cost) {
            this.cost = cost;
            return this;
        }

        /**
         * The business data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error details.
         */
        public Builder errorDetail(ErrorDetail errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }

        /**
         * The error description (old).
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The page number, which takes effect in a pagination query.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The page size, which takes effect in a pagination query.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total count, which takes effect in a pagination query.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOmsOpenAPIProjectResponseBody build() {
            return new DescribeOmsOpenAPIProjectResponseBody(this);
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
             * Indicates whether message tracing is enabled when the destination data source is RocketMQ.
             */
            public Builder enableMsgTrace(Boolean enableMsgTrace) {
                this.enableMsgTrace = enableMsgTrace;
                return this;
            }

            /**
             * The ID of the data source.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * The type of the data source. Valid values: `MYSQL`, `MARIADB`, `OB_MYSQL`, `OB_MYSQL_CE`, `OB_ORACLE`, `ORACLE`, `DB2_LUW`, `KAFKA`, `ROCKETMQ`, `DATAHUB`, `SYBASE`, `LOGPROXY`, `ADB`, `DBP_OP_ROUTE`, `DMS`, `IDB`, and `TIDB`.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * The tag of the Post message when the destination data source is RocketMQ.
             */
            public Builder msgTags(String msgTags) {
                this.msgTags = msgTags;
                return this;
            }

            /**
             * The partitioned index, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ, and the partitioning mode is set to ONE.
             */
            public Builder partition(Integer partition) {
                this.partition = partition;
                return this;
            }

            /**
             * The partitioning mode, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ. Valid values: ONE, HASH, and TABLE.
             */
            public Builder partitionMode(String partitionMode) {
                this.partitionMode = partitionMode;
                return this;
            }

            /**
             * The producer group of the Post message when the destination data source is RocketMQ.
             */
            public Builder producerGroup(String producerGroup) {
                this.producerGroup = producerGroup;
                return this;
            }

            /**
             * The timeout period in seconds for a single Post message when the destination data source is RocketMQ.
             */
            public Builder sendMsgTimeout(Long sendMsgTimeout) {
                this.sendMsgTimeout = sendMsgTimeout;
                return this;
            }

            /**
             * Indicates whether message sequencing is enabled when the destination data source is DataHub.
             */
            public Builder sequenceEnable(Boolean sequenceEnable) {
                this.sequenceEnable = sequenceEnable;
                return this;
            }

            /**
             * The start time of the sequence, which must be specified if the destination data source is DataHub and message sequencing is enabled. The value is a timestamp in seconds.
             */
            public Builder sequenceStartTimestamp(Long sequenceStartTimestamp) {
                this.sequenceStartTimestamp = sequenceStartTimestamp;
                return this;
            }

            /**
             * The text serialization type, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ. Valid values: Default, DefaultExtendColumnType, Canal, Dataworks, and SharePlex.
             */
            public Builder serializerType(String serializerType) {
                this.serializerType = serializerType;
                return this;
            }

            /**
             * The type of the topic to which the Post message belongs when the destination data source is DataHub. Valid values: Tuple and Blob.
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
             * The number of projects that use this label.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The creator. This parameter value is returned only when you log on as the administrator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * The ID of a label.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the label.
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
             * Indicates whether message tracing is enabled when the destination data source is RocketMQ.
             */
            public Builder enableMsgTrace(Boolean enableMsgTrace) {
                this.enableMsgTrace = enableMsgTrace;
                return this;
            }

            /**
             * The ID of the data source.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * The type of the data source. Valid values: `MYSQL`, `MARIADB`, `OB_MYSQL`, `OB_MYSQL_CE`, `OB_ORACLE`, `ORACLE`, `DB2_LUW`, `KAFKA`, `ROCKETMQ`, `DATAHUB`, `SYBASE`, `LOGPROXY`, `ADB`, `DBP_OP_ROUTE`, `DMS`, `IDB`, and `TIDB`.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * The tag of the Post message when the destination data source is RocketMQ.
             */
            public Builder msgTags(String msgTags) {
                this.msgTags = msgTags;
                return this;
            }

            /**
             * The partitioned index, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ, and the partitioning mode is set to ONE.
             */
            public Builder partition(Integer partition) {
                this.partition = partition;
                return this;
            }

            /**
             * The partitioning mode, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ. Valid values: ONE, HASH, and TABLE.
             */
            public Builder partitionMode(String partitionMode) {
                this.partitionMode = partitionMode;
                return this;
            }

            /**
             * The producer group of the Post message when the destination data source is RocketMQ.
             */
            public Builder producerGroup(String producerGroup) {
                this.producerGroup = producerGroup;
                return this;
            }

            /**
             * The timeout period in seconds for a single Post message when the destination data source is RocketMQ.
             */
            public Builder sendMsgTimeout(Long sendMsgTimeout) {
                this.sendMsgTimeout = sendMsgTimeout;
                return this;
            }

            /**
             * Indicates whether message sequencing is enabled when the destination data source is DataHub.
             */
            public Builder sequenceEnable(Boolean sequenceEnable) {
                this.sequenceEnable = sequenceEnable;
                return this;
            }

            /**
             * The start time of the sequence, which must be specified if the destination data source is DataHub and message sequencing is enabled. The value is a timestamp in seconds.
             */
            public Builder sequenceStartTimestamp(Long sequenceStartTimestamp) {
                this.sequenceStartTimestamp = sequenceStartTimestamp;
                return this;
            }

            /**
             * The text serialization type, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ. Valid values: Default, DefaultExtendColumnType, Canal, Dataworks, and SharePlex.
             */
            public Builder serializerType(String serializerType) {
                this.serializerType = serializerType;
                return this;
            }

            /**
             * The type of the topic to which the Post message belongs when the destination data source is DataHub. Valid values: Tuple and Blob.
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
             * The error code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Valid values: CRITICAL, ERROR, and WARN.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The error message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The suggestions (new).
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
             * The error code, such as AUTHENTICATION_ERROR, PARAM_ERROR, PARAM_ERROR_MESSAGE, NOT_IMPLEMENTED_ERROR, SHARD_COLUMNS_CONFLICT_MESSAGE, FAILED_PARSE_TOKEN_MESSAGE, CONNECT_CHECK_ERROR, NOT_SUPPORT_ERROR, CE_NOT_SUPPORT_ERROR, NOT_FOUND_ERROR, SHARDING_COLUMN_NOT_INCLUDED_ERROR, INNER_ERROR, DB_QUERY_ERROR, DATAHUB_QUERY_ERROR, USER_LACK_SYS_PRIV_ERROR, USER_LACK_TABLE_PRIV_ERROR, RM_API_ERROR, RM_TASK_ERROR, CM_API_ERROR, CM_API_NOT_SUCCESS, BAGUALU_API_ERROR, IDB_API_ERROR, SUPERVISOR_API_ERROR, OCP_API_ERROR, OCP_SERVICE_ERROR, OCP_QUERY_VERSION_FAILED, OCP_VERSION_INCORRECT_ERROR, OCP_VERSION_NOT_SUPPORTED_ERROR, OCP_API_USER_PASSWORD_INCORRECT_ERROR, OBSCHEMA_ERROR, EXECUTOR_THREAD_POOL_BUSY, NO_TABLE_SELECTED, NO_VIEW_SELECTED, SOURCE_CRAWLER_START_FAILED, SOURCE_CRAWLER_START_FAILED_DATA_EXPIRED, SOURCE_CRAWLER_START_TIMEOUT, DEST_WRITER_START_FAILED, WRITER_UNKNOWN_STATUS, DRC_TOPIC_EXISTS_ERROR, TOPIC_EMPTY_ERROR, REACH_WRITER_LIMIT_ERROR, FOUND_NO_FEASIBLE_STORE_ERROR, TOO_MANY_STORES_FOR_SUBTOPIC, TIMEOUT_EXCEPTION, KIPP_API_ERROR, KIPP_API_RESOURCE_NOT_FOUND, KIPP_API_INVALID_PARAM, KIPP_API_UNKNOWN_ERROR, KIPP_API_INTERNAL_ERROR, KIPP_API_SERVICE_UNAVAILABLE, OMS_AGENT_API_ERROR, KMS_API_ERROR, OMS_ENCRYPT_API_ERROR, OMS_DECRYPT_API_ERROR, ALIYUN_SDK_ERROR, YAOCHI_API_ERROR, RESOURCE_WITHOUT_STOCK_ERROR, RESOURCE_NO_AVAILABLE_ZONE, CM_SDK_ERROR, MIGRATION_PROJECT_STEP_PRECHECK_FAILED, PRE_CHECK_ERROR, FAILURES_CORRECT_ERROR, EXECUTE_DDL_FAILURE, EXECUTE_DDL_UNSUPPORTED_OR_FAILURE, STRUCT_RECORD_DDL_NOT_FOUND, STRUCT_RECORD_INDEX_NOT_FOUND, STRUCT_RECORD_NOT_FOUND, STRUCT_RECORD_NOT_FOUND_IN_DBCAT, SCHEMA_OBJECT_TYPE_NOT_SUPPORT_ERROR, POLAR_MYSQL_NETWORK_TYPE_NOT_SUPPORT_ERROR, RDS_NETWORK_TYPE_NOT_SUPPORT_ERROR, RDS_VPC_NETWORK_NOT_SUPPORT_ERROR, DB_TYPE_NOT_SUPPORT_ERROR, SYNC_TYPE_NOT_SUPPORT_ERROR, SLAVE_OPERATION_STEP_NOT_SUPPORT_ERROR, BYTE_USED_TYPE_NOT_SUPPORT_ERROR, MANY_TO_ONE_SCHEMA_TABLE_REVERSE_INCR_NOT_SUPPORT_ERROR, DUPLICATE_SCHEMA_TABLE_ERROR, OMS_STEP_NOT_SUPPORT_ERROR, ORACLE_DATABASE_ROLE_NOT_SUPPORT_ERROR, OLD_PRE_CHECK_NOT_SUPPORT_ERROR, SCHEMA_ONE_TO_MANY_NOT_SUPPORT_ERROR, PROJECT_NOT_FOUND_ERROR, ENDPOINT_NOT_FOUND_ERROR, ENDPOINT_NAME_ALREADY_EXIST_ERROR, ENDPOINT_QUERY_ERROR, ENDPOINT_SQL_QUERY_ERROR, PROJECT_NAME_ALREADY_EXIST_ERROR, CHECKER_NOT_FOUND_ERROR, CHECKER_FAILED_ERROR, CHECKER_STATUS_UNEXPECTED_ERROR, CHECKER_NO_TASK_TYPE_ERROR, WORKER_INSTANCE_NOT_FOUND_ERROR, WORKER_INSTANCE_ALLOCATING_ERROR, LOG_SERVICE_TOPIC_NOT_FOUND_ERROR, CLUSTER_NOT_FOUND_ERROR, TENANT_NOT_FOUND_ERROR, DATABASE_NOT_FOUND_ERROR, TABLE_NOT_FOUND_ERROR, COLUMN_NOT_FOUND_ERROR, TABLE_META_NOT_FOUND_ERROR, SYBASE_CHARSET_NOT_FOUND_ERROR, OCP_NOT_FOUND_ERROR, REGION_NOT_FOUND_ERROR, OCP_ALREADY_EXIST_ERROR, ALARM_CHANNEL_NAME_ALREADY_EXIST_ERROR, SEND_MARKDOWN_TEXT_TO_WEBHOOK_FAILED_EXCEPTION_RESPONSE, SEND_MARKDOWN_TEXT_TO_WEBHOOK_FAILED_EXCEPTION_STATUS, LABEL_ALREADY_EXIST_ERROR, LABEL_NOT_EXIST_ERROR, OCP_ALREADY_USED_ERROR, REGION_INFO_INCONSISTENT_ERROR, OCP_NAME_EMPTY_ERROR, MASTER_SLAVE_ENDPOINT_NAME_INCONSISTENT_ERROR, LOG_FILE_NOT_FOUND_ERROR, OPERATION_NOT_ALLOWED_ERROR, PROJECT_OPERATION_NOT_ALLOWED_ERROR, PROJECT_RELEASE_FAILED, STRUCT_MIGRATION_RETRY_NOT_ALLOWED_ERROR, WORKER_INSTANCE_OPERATION_NOT_ALLOWED_ERROR, USER_OPERATION_NOT_ALLOWED_ERROR, OCP_NAME_OR_REGION_NOT_ALLOWED_UPDATE, UPDATE_CONFIG_WITH_NEWLINE_NOT_ALLOWED, EXIST_UNRELEASED_PROJECT_ERROR, EXIST_UNRELEASED_TOPIC_ERROR, LABEL_CREATE_NOT_ALLOWED_ERROR, LABEL_UPDATE_NOT_ALLOWED_ERROR, LABEL_DELETE_NOT_ALLOWED_ERROR, TOPIC_NAME_INVALID_ERROR, INVALID_STATUS_ERROR, INVALID_CSV_HEAD_ERROR, INVALID_CSV_BODY_ERROR, DUPLICATE_SCHEMA_TABLE_SETTING_ERROR, PROJECT_INVALID_STATUS_ERROR, PROJECT_INVALID_CONNECTOR_COUNT_ERROR, WORKER_INSTANCE_INVALID_STATUS_ERROR, LOG_SERVICE_INVALID_STATUS_ERROR, STEP_INVALID_STATUS_ERROR, UPDATE_ALLOW_DEST_TABLE_NOT_EMPTY_NOT_ALLOWED_ERROR, EXIST_INCONSISTENCY_ERROR, OMS_SWITCH_SUBSTEP_FAILED_ERROR, ENDPOINT_ID_INVALID_ERROR, DB_QUERY_VERSION_EMPTY_ERROR, ENDPOINT_NAME_INVALID_ERROR, ENDPOINT_SCHEMA_NOT_ALLOWED_ERROR, ENDPOINT_SCHEMA_CHAR_NOT_ALLOWED_ERROR, NAME_HAS_SPACE_EXCEPTION, CONFIG_CONVERT_VALUE_ERROR, CONFIG_VALUE_EXCEEDS_LIMIT_ERROR, CONFIG_KEY_NOT_FOUND_KEY_ERROR, CONFIG_VALUE_NOT_EMPTY_ERROR, SCHEMA_HAS_CONVERT_INFO, TIME_SERIES_QUERY_SERVICE_ERROR, ETL_VERIFY_ERROR, ETL_SYNTAX_UNSUPPORTED, ETL_FIELD_NOTFOUND, ETL_FAILED_PARSE_SQL, ETL_VAL_TYPE_ERROR, NOT_SUPPORT_GENERATE_COLUMNS, NOT_SUPPORT_UPDATE_ETL, LOCK_FAILED, OMS_USER_EXIST_ERROR, OMS_USER_NOT_FOUND_ERROR, OMS_USER_NAME_LENGTH_CONSTRAINT, OMS_USER_PASSWORD_ERROR, USER_NAME_OR_PASSWORD_ERROR, OMS_USER_PASSWORD_VALIDATION_ERROR, OMS_USER_PASSWORD_DEFAULT_ERROR, OMS_USER_PERMISSION_DENIED_ERROR, OMS_USER_EDIT_ADMIN_ROLE_INFO_PERMISSION_DENIED_ERROR, OMS_USER_ILLEGAL_DELETED_ERROR, CONNECTOR_TASK_NOT_FOUND_ERROR, CONNECTOR_TASK_NUM_LIMIT_ERROR, CONNECTOR_TASK_DELETE_ERROR, METRIC_SERVICE_ERROR, SYNC_PROJECT_TYPE_INVALID_ERROR, SYNC_SHARDING_COLUMNS_INVALID_ERROR, SYNC_PROJECT_PRODUCER_GROUP_INVALID_ERROR, SYNC_PROJECT_PRODUCER_GROUP_LIMIT_EXCEEDS_ERROR, SYNC_PROJECT_COMPLEMENT_CONFIG_ERROR, META_SCHEMA_CREATE_FAILED, RESUME_STEP_FAILED, SCHEMA_INCONSISTENCY, SCHEMA_CASCADE_MAPPING_NOT_SUPPORT_ERROR, SCHEMA_NOT_EXISTED, SCHEMA_EXISTED, SCHEMA_NOT_EXIST, BLACK_LIST_MATCH_ALL, BLACK_LIST_CONTAIN_NON_WHITE_SCHEMA, BLACK_WHITE_LIST_PARAM_INVALID_ERROR, OPERATOR_ERROR, OPERATOR_DIMENSION_NOT_SUPPORT, OPERATOR_PULL_LOG_ERROR, OPERATOR_UPDATE_CONFIG_NOT_SUPPORT, KAFKA_CREATE_TOPIC_ERROR, KAFKA_QUERY_TOPIC_ERROR, KAFKA_BUILD_PROPERTIES_ERROR, ROCKETMQ_CREATE_TOPIC_ERROR, ROCKETMQ_QUERY_TOPIC_ERROR, SYNC_OBJECT_EMPTY_ERROR, WRITER_NUMBER_NOT_UNIQUE, WRITER_NOT_ACTIVE, PROJECT_NAME_DUPLICATE_ERROR, EMPTY_FAILED_STRUCT_MIGRATION_TABLES_ERROR, LOGIC_TABLE_NOT_SUPPORT_UPDATE_OBJECT_ERROR, LOGIC_REQUEST_ERROR, LOGIC_DTO_BUILD_ERROR, UNEXPECTED_REMOTE_API_RESULT, OCEANBASE_USER_UNEXPECTED, STORE_CREATE_FAILED_ERROR, STORE_START_FAILED, STORE_NOT_PULL_LOG_ERROR, ALL_HOSTS_STATUS_ERROR, WORKER_ECS_NOT_FOUND_ERROR, WORKER_ECS_NOT_FOUND_FOR_USER_ERROR, WORKER_POD_NOT_FOUND_ERROR, WORKER_POD_NOT_FOUND_FOR_USER_ERROR, WORKER_INSTANCE_NOT_FOUND_ERROR_V2, and WORKER_INSTANCE_NOT_FOUND_FOR_USER_ERROR.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error details.
             */
            public Builder errorDetails(java.util.List < ErrorDetails> errorDetails) {
                this.errorDetails = errorDetails;
                return this;
            }

            /**
             * The error message.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * The error related parameters.
             */
            public Builder errorParam(java.util.Map < String, String > errorParam) {
                this.errorParam = errorParam;
                return this;
            }

            /**
             * The time when the error occurred.
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
             * The estimated maximum time remained, in seconds.
             */
            public Builder estimatedRemainingTimeOfSec(Long estimatedRemainingTimeOfSec) {
                this.estimatedRemainingTimeOfSec = estimatedRemainingTimeOfSec;
                return this;
            }

            /**
             * The estimated amount of data to migrate.
             */
            public Builder estimatedTotalCount(Long estimatedTotalCount) {
                this.estimatedTotalCount = estimatedTotalCount;
                return this;
            }

            /**
             * The amount of data migrated.
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
             * The estimated total number of rows.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * The checkpoint. The value is a unix timestamp in seconds.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * The full synchronization progress.
             */
            public Builder connectorFullProgressOverview(ConnectorFullProgressOverview connectorFullProgressOverview) {
                this.connectorFullProgressOverview = connectorFullProgressOverview;
                return this;
            }

            /**
             * The resource deployment ID.
             */
            public Builder deployId(String deployId) {
                this.deployId = deployId;
                return this;
            }

            /**
             * The read/write throughput of the destination data source, in bytes per second.
             */
            public Builder dstIops(Long dstIops) {
                this.dstIops = dstIops;
                return this;
            }

            /**
             * The read/write RPS of the destination data source.
             */
            public Builder dstRps(Long dstRps) {
                this.dstRps = dstRps;
                return this;
            }

            /**
             * The read/write RPS baseline of the destination data source.
             */
            public Builder dstRpsRef(Long dstRpsRef) {
                this.dstRpsRef = dstRpsRef;
                return this;
            }

            /**
             * The read/write RT per record of the destination data source, in ms.
             */
            public Builder dstRt(Long dstRt) {
                this.dstRt = dstRt;
                return this;
            }

            /**
             * The read/write RT baseline of the destination data source.
             */
            public Builder dstRtRef(Long dstRtRef) {
                this.dstRtRef = dstRtRef;
                return this;
            }

            /**
             * The checkpoint collection time. The value is a unix timestamp in seconds.
             */
            public Builder gmt(Long gmt) {
                this.gmt = gmt;
                return this;
            }

            /**
             * The amount of inconsistent data found during full verification.
             */
            public Builder inconsistencies(Long inconsistencies) {
                this.inconsistencies = inconsistencies;
                return this;
            }

            /**
             * The checkpoint in incremental synchronization. The value is a unix timestamp in seconds.
             */
            public Builder incrTimestampCheckpoint(Long incrTimestampCheckpoint) {
                this.incrTimestampCheckpoint = incrTimestampCheckpoint;
                return this;
            }

            /**
             * The job ID.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The number of migrated rows.
             */
            public Builder processedRecords(Long processedRecords) {
                this.processedRecords = processedRecords;
                return this;
            }

            /**
             * A sub-status that indicates whether this step is skipped.
             */
            public Builder skipped(Boolean skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * The read throughput of the source data source, in bytes per second.
             */
            public Builder srcIops(Long srcIops) {
                this.srcIops = srcIops;
                return this;
            }

            /**
             * The read throughput baseline of the source data source.
             */
            public Builder srcIopsRef(Long srcIopsRef) {
                this.srcIopsRef = srcIopsRef;
                return this;
            }

            /**
             * The read requests per second (RPS) of the source data source.
             */
            public Builder srcRps(Long srcRps) {
                this.srcRps = srcRps;
                return this;
            }

            /**
             * The read RPS baseline of the source data source.
             */
            public Builder srcRpsRef(Long srcRpsRef) {
                this.srcRpsRef = srcRpsRef;
                return this;
            }

            /**
             * The read response time (RT) per record of the source data source, in ms.
             */
            public Builder srcRt(Long srcRt) {
                this.srcRt = srcRt;
                return this;
            }

            /**
             * The read RT baseline of the source data source.
             */
            public Builder srcRtRef(Long srcRtRef) {
                this.srcRtRef = srcRtRef;
                return this;
            }

            /**
             * A sub-status that indicates whether the checker has completed full verification.
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
             * The estimated time remained.
             */
            public Builder estimatedRemainingSeconds(Long estimatedRemainingSeconds) {
                this.estimatedRemainingSeconds = estimatedRemainingSeconds;
                return this;
            }

            /**
             * The additional information. The value is a JSON string.
             */
            public Builder extraInfo(ExtraInfo extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * The end time, in the format of "2020-05-22T17:04:18".
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * Indicates whether the current step must be confirmed by the user, rather than scheduled in the backend.
             */
            public Builder interactive(Boolean interactive) {
                this.interactive = interactive;
                return this;
            }

            /**
             * The start time, in the format of "2020-05-22T17:04:18".
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The description of the step, for example, schema migration, full migration, full verification, incremental log pull, incremental synchronization, or incremental verification.
             */
            public Builder stepDescription(String stepDescription) {
                this.stepDescription = stepDescription;
                return this;
            }

            /**
             * The step details. The value is a JSON string.
             */
            public Builder stepInfo(StepInfo stepInfo) {
                this.stepInfo = stepInfo;
                return this;
            }

            /**
             * The step name. Valid values: struct_migration, full_migration, full_validation, incr_log_pull, incr_sync/incr_validation, PRE_CHECK, PREPARE, STRUCT_MIGRATION, INDEX_MIGRATION, STRUCT_SYNC, FULL_MIGRATION, APP_SWITCH, REVERSE_INCR_SYNC, FULL_VALIDATION, INCR_LOG_PULL, INCR_SYNC, INCR_VALIDATION, SYNC_PREPARE, SYNC_INCR_LOG_PULL, CONNECTOR_FULL_SYNC, or CONNECTOR_INCR_SYNC.
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            /**
             * The sequence of steps.
             */
            public Builder stepOrder(Integer stepOrder) {
                this.stepOrder = stepOrder;
                return this;
            }

            /**
             * The step progress.
             */
            public Builder stepProgress(Integer stepProgress) {
                this.stepProgress = stepProgress;
                return this;
            }

            /**
             * The step status. Valid values: INIT, RUNNING, FAILED, FINISHED, SUSPEND, and MONITORING. The value MONITORING indicates the continuous monitoring of incremental synchronization and incremental verification.
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
             * The list of distribution key columns.
             */
            public Builder distributedKeys(java.util.List < String > distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * The lifecycle of the table.
             */
            public Builder partitionLifeCycle(Integer partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * The partitioning expression.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * The list of primary key columns.
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
             * The schema of the ADB table. If the destination data source is ADB, you need to configure additional information for schema synchronization.
             */
            public Builder adbTableSchema(AdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * The list of filter columns, which are the columns to be synchronized.
             */
            public Builder filterColumns(java.util.List < String > filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * The name of the mapped-to table or topic. If the destination data source is a database, this parameter specifies the name of the mapped-to table. If the destination data source is a message queue system, this parameter specifies the name of the mapped-to topic.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * The list of sharding key columns. This parameter applies to scenarios where the destination data source is a message queue system.
             */
            public Builder shardColumns(java.util.List < String > shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * The ID of the table. This parameter takes effect when the source data source is IDB.
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * The name of the table.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * Valid values: DATABASE and TABLE.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The row filter conditions.
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
             * The ID of the database. This parameter takes effect when the source data source is IDB.
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The mapped-to database. This parameter takes effect when the destination data source is a database.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * The settings for the target table objects in the current database.
             */
            public Builder tables(java.util.List < Tables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * The mapped-to tenant. This parameter takes effect when the source data source is OceanBase Database.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * Valid values: DATABASE and TABLE.
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
             * The table mapping in the source data source, which is a conventional mapping scheme and takes effect only when Mode is set to NORMAL.
             */
            public Builder databases(java.util.List < Databases> databases) {
                this.databases = databases;
                return this;
            }

            /**
             * The mapping type. Valid values: \"NORMAL\" and \"WHITE_AND_BLACK_LIST\".
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
             * The list of data types of incremental data synchronized in incremental synchronization.
             */
            public Builder recordTypeList(java.util.List < String > recordTypeList) {
                this.recordTypeList = recordTypeList;
                return this;
            }

            /**
             * The start time for incremental synchronization. The value is a timestamp in seconds.
             */
            public Builder startTimestamp(Long startTimestamp) {
                this.startTimestamp = startTimestamp;
                return this;
            }

            /**
             * The retention time of logs when incremental synchronization is enabled and the incremental log pull component is Store.
             */
            public Builder storeLogKeptHour(Long storeLogKeptHour) {
                this.storeLogKeptHour = storeLogKeptHour;
                return this;
            }

            /**
             * Indicates whether intra-transaction sequencing is enabled when incremental synchronization is enabled and the incremental log pull component is Store.
             */
            public Builder storeTransactionEnabled(Boolean storeTransactionEnabled) {
                this.storeTransactionEnabled = storeTransactionEnabled;
                return this;
            }

            /**
             * Valid values: STRUCT, FULL, and INCR.
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
             * Indicates whether full migration is enabled.
             */
            public Builder enableFullSync(Boolean enableFullSync) {
                this.enableFullSync = enableFullSync;
                return this;
            }

            /**
             * Indicates whether incremental synchronization is enabled.
             */
            public Builder enableIncrSync(Boolean enableIncrSync) {
                this.enableIncrSync = enableIncrSync;
                return this;
            }

            /**
             * Indicates whether schema synchronization is enabled.
             */
            public Builder enableStructSync(Boolean enableStructSync) {
                this.enableStructSync = enableStructSync;
                return this;
            }

            /**
             * The settings of incremental synchronization steps.
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
             * The business system identifier, which is optional and is a specific field of the Post message.
             */
            public Builder businessName(String businessName) {
                this.businessName = businessName;
                return this;
            }

            /**
             * The settings of the destination data source.
             */
            public Builder destConfig(DestConfig destConfig) {
                this.destConfig = destConfig;
                return this;
            }

            /**
             * A collection of label IDs.
             */
            public Builder labels(java.util.List < Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * The project ID.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The name of the project.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * The project owner.
             */
            public Builder projectOwner(String projectOwner) {
                this.projectOwner = projectOwner;
                return this;
            }

            /**
             * The settings of the source data source.
             */
            public Builder sourceConfig(SourceConfig sourceConfig) {
                this.sourceConfig = sourceConfig;
                return this;
            }

            /**
             * The detailed project steps.
             */
            public Builder steps(java.util.List < Steps> steps) {
                this.steps = steps;
                return this;
            }

            /**
             * The mappings for the synchronization objects.
             */
            public Builder transferMapping(TransferMapping transferMapping) {
                this.transferMapping = transferMapping;
                return this;
            }

            /**
             * The settings of synchronization steps
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
             * The error code (new).
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The error level. Valid values: CRITICAL, ERROR, and WARN.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The error description (new).
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The suggestions (new).
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
