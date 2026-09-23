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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ParseBatchTaskDependencyResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.parseResult = model.parseResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. A value of OK indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The parsing result.</p>
         */
        public Builder parseResult(ParseResult parseResult) {
            this.parseResult = parseResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
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

            private Builder() {
            } 

            private Builder(ScheduleNodeInfoList model) {
                this.fieldList = model.fieldList;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.outputName = model.outputName;
                this.ownerName = model.ownerName;
                this.ownerUserId = model.ownerUserId;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The list of fields. This parameter applies only to logical table dependencies.</p>
             */
            public Builder fieldList(java.util.List<String> fieldList) {
                this.fieldList = fieldList;
                return this;
            }

            /**
             * <p>The node ID. A value of -1 is returned if no node is found for the corresponding input table.</p>
             * 
             * <strong>example:</strong>
             * <p>n_11013121</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The node name. This parameter is empty if no node is found for the corresponding input table.</p>
             * 
             * <strong>example:</strong>
             * <p>test11</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The output name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>t_test</p>
             */
            public Builder outputName(String outputName) {
                this.outputName = outputName;
                return this;
            }

            /**
             * <p>The owner of the node. This parameter is empty if no node is found for the corresponding input table.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * <p>The owner of the node. This parameter is empty if no node is found for the corresponding input table.</p>
             * 
             * <strong>example:</strong>
             * <p>201122301</p>
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * <p>The output table name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>t_test</p>
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

            private Builder() {
            } 

            private Builder(DependNodeList model) {
                this.nodeIoType = model.nodeIoType;
                this.scheduleNodeInfoList = model.scheduleNodeInfoList;
            } 

            /**
             * <p>The input/output type. Valid values: input (dependent node) and output (node output name).</p>
             * 
             * <strong>example:</strong>
             * <p>input</p>
             */
            public Builder nodeIoType(String nodeIoType) {
                this.nodeIoType = nodeIoType;
                return this;
            }

            /**
             * <p>The list of schedule nodes.</p>
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

            private Builder() {
            } 

            private Builder(ParseResult model) {
                this.dependNodeList = model.dependNodeList;
            } 

            /**
             * <p>The list of dependent nodes.</p>
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
