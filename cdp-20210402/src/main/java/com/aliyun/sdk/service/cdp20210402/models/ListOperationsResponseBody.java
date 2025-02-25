// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOperationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperationsResponseBody</p>
 */
public class ListOperationsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListOperationsResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private java.util.List < Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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

        public ListOperationsResponseBody build() {
            return new ListOperationsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("HasChildOperationNodes")
        private Boolean hasChildOperationNodes;

        @NameInMap("HasOperationTask")
        private Boolean hasOperationTask;

        @NameInMap("OperationId")
        private String operationId;

        @NameInMap("OperationNodeId")
        private String operationNodeId;

        @NameInMap("OperationNodeName")
        private Integer operationNodeName;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.endTime = builder.endTime;
            this.hasChildOperationNodes = builder.hasChildOperationNodes;
            this.hasOperationTask = builder.hasOperationTask;
            this.operationId = builder.operationId;
            this.operationNodeId = builder.operationNodeId;
            this.operationNodeName = builder.operationNodeName;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return hasChildOperationNodes
         */
        public Boolean getHasChildOperationNodes() {
            return this.hasChildOperationNodes;
        }

        /**
         * @return hasOperationTask
         */
        public Boolean getHasOperationTask() {
            return this.hasOperationTask;
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        /**
         * @return operationNodeId
         */
        public String getOperationNodeId() {
            return this.operationNodeId;
        }

        /**
         * @return operationNodeName
         */
        public Integer getOperationNodeName() {
            return this.operationNodeName;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long endTime; 
            private Boolean hasChildOperationNodes; 
            private Boolean hasOperationTask; 
            private String operationId; 
            private String operationNodeId; 
            private Integer operationNodeName; 
            private Long startTime; 
            private String status; 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * HasChildOperationNodes.
             */
            public Builder hasChildOperationNodes(Boolean hasChildOperationNodes) {
                this.hasChildOperationNodes = hasChildOperationNodes;
                return this;
            }

            /**
             * HasOperationTask.
             */
            public Builder hasOperationTask(Boolean hasOperationTask) {
                this.hasOperationTask = hasOperationTask;
                return this;
            }

            /**
             * OperationId.
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * OperationNodeId.
             */
            public Builder operationNodeId(String operationNodeId) {
                this.operationNodeId = operationNodeId;
                return this;
            }

            /**
             * OperationNodeName.
             */
            public Builder operationNodeName(Integer operationNodeName) {
                this.operationNodeName = operationNodeName;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
