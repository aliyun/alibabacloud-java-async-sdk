// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link NodeStatusListResponseBody} extends {@link TeaModel}
 *
 * <p>NodeStatusListResponseBody</p>
 */
public class NodeStatusListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("NodeStatusList")
    private NodeStatusList nodeStatusList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private NodeStatusListResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.nodeStatusList = builder.nodeStatusList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeStatusListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return nodeStatusList
     */
    public NodeStatusList getNodeStatusList() {
        return this.nodeStatusList;
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
        private Integer errorCode; 
        private String errorMessage; 
        private NodeStatusList nodeStatusList; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(NodeStatusListResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.nodeStatusList = model.nodeStatusList;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
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
         * NodeStatusList.
         */
        public Builder nodeStatusList(NodeStatusList nodeStatusList) {
            this.nodeStatusList = nodeStatusList;
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

        public NodeStatusListResponseBody build() {
            return new NodeStatusListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link NodeStatusListResponseBody} extends {@link TeaModel}
     *
     * <p>NodeStatusListResponseBody</p>
     */
    public static class NodeStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoInstall")
        private Boolean autoInstall;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private NodeStatus(Builder builder) {
            this.autoInstall = builder.autoInstall;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeStatus create() {
            return builder().build();
        }

        /**
         * @return autoInstall
         */
        public Boolean getAutoInstall() {
            return this.autoInstall;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean autoInstall; 
            private String instanceId; 
            private String status; 

            private Builder() {
            } 

            private Builder(NodeStatus model) {
                this.autoInstall = model.autoInstall;
                this.instanceId = model.instanceId;
                this.status = model.status;
            } 

            /**
             * AutoInstall.
             */
            public Builder autoInstall(Boolean autoInstall) {
                this.autoInstall = autoInstall;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public NodeStatus build() {
                return new NodeStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link NodeStatusListResponseBody} extends {@link TeaModel}
     *
     * <p>NodeStatusListResponseBody</p>
     */
    public static class NodeStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeStatus")
        private java.util.List<NodeStatus> nodeStatus;

        private NodeStatusList(Builder builder) {
            this.nodeStatus = builder.nodeStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeStatusList create() {
            return builder().build();
        }

        /**
         * @return nodeStatus
         */
        public java.util.List<NodeStatus> getNodeStatus() {
            return this.nodeStatus;
        }

        public static final class Builder {
            private java.util.List<NodeStatus> nodeStatus; 

            private Builder() {
            } 

            private Builder(NodeStatusList model) {
                this.nodeStatus = model.nodeStatus;
            } 

            /**
             * NodeStatus.
             */
            public Builder nodeStatus(java.util.List<NodeStatus> nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            public NodeStatusList build() {
                return new NodeStatusList(this);
            } 

        } 

    }
}
