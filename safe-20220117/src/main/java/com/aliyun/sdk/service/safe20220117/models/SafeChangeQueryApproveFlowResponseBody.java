// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

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
 * {@link SafeChangeQueryApproveFlowResponseBody} extends {@link TeaModel}
 *
 * <p>SafeChangeQueryApproveFlowResponseBody</p>
 */
public class SafeChangeQueryApproveFlowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SafeChangeQueryApproveFlowResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SafeChangeQueryApproveFlowResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Integer code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SafeChangeQueryApproveFlowResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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

        public SafeChangeQueryApproveFlowResponseBody build() {
            return new SafeChangeQueryApproveFlowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SafeChangeQueryApproveFlowResponseBody} extends {@link TeaModel}
     *
     * <p>SafeChangeQueryApproveFlowResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApproveStrategy")
        private String approveStrategy;

        @com.aliyun.core.annotation.NameInMap("Approver")
        private String approver;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeStatus")
        private String nodeStatus;

        private Data(Builder builder) {
            this.approveStrategy = builder.approveStrategy;
            this.approver = builder.approver;
            this.nodeName = builder.nodeName;
            this.nodeStatus = builder.nodeStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return approveStrategy
         */
        public String getApproveStrategy() {
            return this.approveStrategy;
        }

        /**
         * @return approver
         */
        public String getApprover() {
            return this.approver;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeStatus
         */
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        public static final class Builder {
            private String approveStrategy; 
            private String approver; 
            private String nodeName; 
            private String nodeStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.approveStrategy = model.approveStrategy;
                this.approver = model.approver;
                this.nodeName = model.nodeName;
                this.nodeStatus = model.nodeStatus;
            } 

            /**
             * ApproveStrategy.
             */
            public Builder approveStrategy(String approveStrategy) {
                this.approveStrategy = approveStrategy;
                return this;
            }

            /**
             * Approver.
             */
            public Builder approver(String approver) {
                this.approver = approver;
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
             * NodeStatus.
             */
            public Builder nodeStatus(String nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
