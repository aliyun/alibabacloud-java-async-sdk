// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetPipelineLogResponseBody</p>
 */
public class GetPipelineLogResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("Object")
    private java.util.List < Object> object;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetPipelineLogResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.object = builder.object;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return object
     */
    public java.util.List < Object> getObject() {
        return this.object;
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
        private String errorCode; 
        private String errorMessage; 
        private java.util.List < Object> object; 
        private String requestId; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Object.
         */
        public Builder object(java.util.List < Object> object) {
            this.object = object;
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

        public GetPipelineLogResponseBody build() {
            return new GetPipelineLogResponseBody(this);
        } 

    } 

    public static class BuildProcessNodes extends TeaModel {
        @NameInMap("NodeIndex")
        private Integer nodeIndex;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("Status")
        private String status;

        private BuildProcessNodes(Builder builder) {
            this.nodeIndex = builder.nodeIndex;
            this.nodeName = builder.nodeName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildProcessNodes create() {
            return builder().build();
        }

        /**
         * @return nodeIndex
         */
        public Integer getNodeIndex() {
            return this.nodeIndex;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer nodeIndex; 
            private String nodeName; 
            private String status; 

            /**
             * NodeIndex.
             */
            public Builder nodeIndex(Integer nodeIndex) {
                this.nodeIndex = nodeIndex;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public BuildProcessNodes build() {
                return new BuildProcessNodes(this);
            } 

        } 

    }
    public static class Object extends TeaModel {
        @NameInMap("ActionName")
        private String actionName;

        @NameInMap("BuildProcessNodes")
        private java.util.List < BuildProcessNodes> buildProcessNodes;

        @NameInMap("JobId")
        private Long jobId;

        @NameInMap("StartTime")
        private String startTime;

        private Object(Builder builder) {
            this.actionName = builder.actionName;
            this.buildProcessNodes = builder.buildProcessNodes;
            this.jobId = builder.jobId;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Object create() {
            return builder().build();
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
        }

        /**
         * @return buildProcessNodes
         */
        public java.util.List < BuildProcessNodes> getBuildProcessNodes() {
            return this.buildProcessNodes;
        }

        /**
         * @return jobId
         */
        public Long getJobId() {
            return this.jobId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String actionName; 
            private java.util.List < BuildProcessNodes> buildProcessNodes; 
            private Long jobId; 
            private String startTime; 

            /**
             * ActionName.
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * BuildProcessNodes.
             */
            public Builder buildProcessNodes(java.util.List < BuildProcessNodes> buildProcessNodes) {
                this.buildProcessNodes = buildProcessNodes;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Object build() {
                return new Object(this);
            } 

        } 

    }
}
