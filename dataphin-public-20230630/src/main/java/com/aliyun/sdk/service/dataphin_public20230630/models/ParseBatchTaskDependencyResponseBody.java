// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ParseBatchTaskDependencyResponseBody} extends {@link TeaModel}
 *
 * <p>ParseBatchTaskDependencyResponseBody</p>
 */
public class ParseBatchTaskDependencyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ParseResult")
    private ParseResult parseResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ParseBatchTaskDependencyResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.parseResult = builder.parseResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ParseBatchTaskDependencyResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return parseResult
     */
    public ParseResult getParseResult() {
        return this.parseResult;
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

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private ParseResult parseResult; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * ParseResult.
         */
        public Builder parseResult(ParseResult parseResult) {
            this.parseResult = parseResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ParseBatchTaskDependencyResponseBody build() {
            return new ParseBatchTaskDependencyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ParseBatchTaskDependencyResponseBody} extends {@link TeaModel}
     *
     * <p>ParseBatchTaskDependencyResponseBody</p>
     */
    public static class ScheduleNodeInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldList")
        private java.util.List<String> fieldList;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("OutputName")
        private String outputName;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        private String ownerUserId;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private ScheduleNodeInfoList(Builder builder) {
            this.fieldList = builder.fieldList;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.outputName = builder.outputName;
            this.ownerName = builder.ownerName;
            this.ownerUserId = builder.ownerUserId;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleNodeInfoList create() {
            return builder().build();
        }

        /**
         * @return fieldList
         */
        public java.util.List<String> getFieldList() {
            return this.fieldList;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return outputName
         */
        public String getOutputName() {
            return this.outputName;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return ownerUserId
         */
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private java.util.List<String> fieldList; 
            private String nodeId; 
            private String nodeName; 
            private String outputName; 
            private String ownerName; 
            private String ownerUserId; 
            private String tableName; 

            /**
             * FieldList.
             */
            public Builder fieldList(java.util.List<String> fieldList) {
                this.fieldList = fieldList;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * OutputName.
             */
            public Builder outputName(String outputName) {
                this.outputName = outputName;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * OwnerUserId.
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public ScheduleNodeInfoList build() {
                return new ScheduleNodeInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ParseBatchTaskDependencyResponseBody} extends {@link TeaModel}
     *
     * <p>ParseBatchTaskDependencyResponseBody</p>
     */
    public static class DependNodeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeIoType")
        private String nodeIoType;

        @com.aliyun.core.annotation.NameInMap("ScheduleNodeInfoList")
        private java.util.List<ScheduleNodeInfoList> scheduleNodeInfoList;

        private DependNodeList(Builder builder) {
            this.nodeIoType = builder.nodeIoType;
            this.scheduleNodeInfoList = builder.scheduleNodeInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DependNodeList create() {
            return builder().build();
        }

        /**
         * @return nodeIoType
         */
        public String getNodeIoType() {
            return this.nodeIoType;
        }

        /**
         * @return scheduleNodeInfoList
         */
        public java.util.List<ScheduleNodeInfoList> getScheduleNodeInfoList() {
            return this.scheduleNodeInfoList;
        }

        public static final class Builder {
            private String nodeIoType; 
            private java.util.List<ScheduleNodeInfoList> scheduleNodeInfoList; 

            /**
             * NodeIoType.
             */
            public Builder nodeIoType(String nodeIoType) {
                this.nodeIoType = nodeIoType;
                return this;
            }

            /**
             * ScheduleNodeInfoList.
             */
            public Builder scheduleNodeInfoList(java.util.List<ScheduleNodeInfoList> scheduleNodeInfoList) {
                this.scheduleNodeInfoList = scheduleNodeInfoList;
                return this;
            }

            public DependNodeList build() {
                return new DependNodeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ParseBatchTaskDependencyResponseBody} extends {@link TeaModel}
     *
     * <p>ParseBatchTaskDependencyResponseBody</p>
     */
    public static class ParseResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DependNodeList")
        private java.util.List<DependNodeList> dependNodeList;

        private ParseResult(Builder builder) {
            this.dependNodeList = builder.dependNodeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParseResult create() {
            return builder().build();
        }

        /**
         * @return dependNodeList
         */
        public java.util.List<DependNodeList> getDependNodeList() {
            return this.dependNodeList;
        }

        public static final class Builder {
            private java.util.List<DependNodeList> dependNodeList; 

            /**
             * DependNodeList.
             */
            public Builder dependNodeList(java.util.List<DependNodeList> dependNodeList) {
                this.dependNodeList = dependNodeList;
                return this;
            }

            public ParseResult build() {
                return new ParseResult(this);
            } 

        } 

    }
}
