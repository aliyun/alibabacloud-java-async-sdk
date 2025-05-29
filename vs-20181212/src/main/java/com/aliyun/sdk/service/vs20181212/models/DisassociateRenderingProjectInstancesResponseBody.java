// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DisassociateRenderingProjectInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DisassociateRenderingProjectInstancesResponseBody</p>
 */
public class DisassociateRenderingProjectInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedInstanceCount")
    private String failedInstanceCount;

    @com.aliyun.core.annotation.NameInMap("FailedInstances")
    private java.util.List<FailedInstances> failedInstances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessInstanceCount")
    private String successInstanceCount;

    @com.aliyun.core.annotation.NameInMap("SuccessInstances")
    private java.util.List<SuccessInstances> successInstances;

    private DisassociateRenderingProjectInstancesResponseBody(Builder builder) {
        this.failedInstanceCount = builder.failedInstanceCount;
        this.failedInstances = builder.failedInstances;
        this.requestId = builder.requestId;
        this.successInstanceCount = builder.successInstanceCount;
        this.successInstances = builder.successInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisassociateRenderingProjectInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failedInstanceCount
     */
    public String getFailedInstanceCount() {
        return this.failedInstanceCount;
    }

    /**
     * @return failedInstances
     */
    public java.util.List<FailedInstances> getFailedInstances() {
        return this.failedInstances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successInstanceCount
     */
    public String getSuccessInstanceCount() {
        return this.successInstanceCount;
    }

    /**
     * @return successInstances
     */
    public java.util.List<SuccessInstances> getSuccessInstances() {
        return this.successInstances;
    }

    public static final class Builder {
        private String failedInstanceCount; 
        private java.util.List<FailedInstances> failedInstances; 
        private String requestId; 
        private String successInstanceCount; 
        private java.util.List<SuccessInstances> successInstances; 

        private Builder() {
        } 

        private Builder(DisassociateRenderingProjectInstancesResponseBody model) {
            this.failedInstanceCount = model.failedInstanceCount;
            this.failedInstances = model.failedInstances;
            this.requestId = model.requestId;
            this.successInstanceCount = model.successInstanceCount;
            this.successInstances = model.successInstances;
        } 

        /**
         * FailedInstanceCount.
         */
        public Builder failedInstanceCount(String failedInstanceCount) {
            this.failedInstanceCount = failedInstanceCount;
            return this;
        }

        /**
         * FailedInstances.
         */
        public Builder failedInstances(java.util.List<FailedInstances> failedInstances) {
            this.failedInstances = failedInstances;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SuccessInstanceCount.
         */
        public Builder successInstanceCount(String successInstanceCount) {
            this.successInstanceCount = successInstanceCount;
            return this;
        }

        /**
         * SuccessInstances.
         */
        public Builder successInstances(java.util.List<SuccessInstances> successInstances) {
            this.successInstances = successInstances;
            return this;
        }

        public DisassociateRenderingProjectInstancesResponseBody build() {
            return new DisassociateRenderingProjectInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DisassociateRenderingProjectInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DisassociateRenderingProjectInstancesResponseBody</p>
     */
    public static class FailedInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
        private String renderingInstanceId;

        private FailedInstances(Builder builder) {
            this.message = builder.message;
            this.renderingInstanceId = builder.renderingInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedInstances create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return renderingInstanceId
         */
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        public static final class Builder {
            private String message; 
            private String renderingInstanceId; 

            private Builder() {
            } 

            private Builder(FailedInstances model) {
                this.message = model.message;
                this.renderingInstanceId = model.renderingInstanceId;
            } 

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * RenderingInstanceId.
             */
            public Builder renderingInstanceId(String renderingInstanceId) {
                this.renderingInstanceId = renderingInstanceId;
                return this;
            }

            public FailedInstances build() {
                return new FailedInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link DisassociateRenderingProjectInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DisassociateRenderingProjectInstancesResponseBody</p>
     */
    public static class SuccessInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
        private String renderingInstanceId;

        private SuccessInstances(Builder builder) {
            this.message = builder.message;
            this.renderingInstanceId = builder.renderingInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessInstances create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return renderingInstanceId
         */
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        public static final class Builder {
            private String message; 
            private String renderingInstanceId; 

            private Builder() {
            } 

            private Builder(SuccessInstances model) {
                this.message = model.message;
                this.renderingInstanceId = model.renderingInstanceId;
            } 

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * RenderingInstanceId.
             */
            public Builder renderingInstanceId(String renderingInstanceId) {
                this.renderingInstanceId = renderingInstanceId;
                return this;
            }

            public SuccessInstances build() {
                return new SuccessInstances(this);
            } 

        } 

    }
}
