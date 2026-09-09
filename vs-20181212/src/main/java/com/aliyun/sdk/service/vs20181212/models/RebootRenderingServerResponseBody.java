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
 * {@link RebootRenderingServerResponseBody} extends {@link TeaModel}
 *
 * <p>RebootRenderingServerResponseBody</p>
 */
public class RebootRenderingServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedInstanceCount")
    private Integer failedInstanceCount;

    @com.aliyun.core.annotation.NameInMap("FailedInstances")
    private java.util.List<FailedInstances> failedInstances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessInstanceCount")
    private Integer successInstanceCount;

    @com.aliyun.core.annotation.NameInMap("SuccessInstances")
    private java.util.List<SuccessInstances> successInstances;

    private RebootRenderingServerResponseBody(Builder builder) {
        this.failedInstanceCount = builder.failedInstanceCount;
        this.failedInstances = builder.failedInstances;
        this.requestId = builder.requestId;
        this.successInstanceCount = builder.successInstanceCount;
        this.successInstances = builder.successInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootRenderingServerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failedInstanceCount
     */
    public Integer getFailedInstanceCount() {
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
    public Integer getSuccessInstanceCount() {
        return this.successInstanceCount;
    }

    /**
     * @return successInstances
     */
    public java.util.List<SuccessInstances> getSuccessInstances() {
        return this.successInstances;
    }

    public static final class Builder {
        private Integer failedInstanceCount; 
        private java.util.List<FailedInstances> failedInstances; 
        private String requestId; 
        private Integer successInstanceCount; 
        private java.util.List<SuccessInstances> successInstances; 

        private Builder() {
        } 

        private Builder(RebootRenderingServerResponseBody model) {
            this.failedInstanceCount = model.failedInstanceCount;
            this.failedInstances = model.failedInstances;
            this.requestId = model.requestId;
            this.successInstanceCount = model.successInstanceCount;
            this.successInstances = model.successInstances;
        } 

        /**
         * <p>Number of cloud application service instances that failed to restart</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder failedInstanceCount(Integer failedInstanceCount) {
            this.failedInstanceCount = failedInstanceCount;
            return this;
        }

        /**
         * <p>Cloud application service instance IDs and their failure details</p>
         */
        public Builder failedInstances(java.util.List<FailedInstances> failedInstances) {
            this.failedInstances = failedInstances;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Number of successful cloud application service instances</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder successInstanceCount(Integer successInstanceCount) {
            this.successInstanceCount = successInstanceCount;
            return this;
        }

        /**
         * <p>The instance ID of the cloud application service and the description of the result.</p>
         */
        public Builder successInstances(java.util.List<SuccessInstances> successInstances) {
            this.successInstances = successInstances;
            return this;
        }

        public RebootRenderingServerResponseBody build() {
            return new RebootRenderingServerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RebootRenderingServerResponseBody} extends {@link TeaModel}
     *
     * <p>RebootRenderingServerResponseBody</p>
     */
    public static class FailedInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrCode")
        private Integer errCode;

        @com.aliyun.core.annotation.NameInMap("ErrMessage")
        private String errMessage;

        @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
        private String renderingInstanceId;

        private FailedInstances(Builder builder) {
            this.errCode = builder.errCode;
            this.errMessage = builder.errMessage;
            this.renderingInstanceId = builder.renderingInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedInstances create() {
            return builder().build();
        }

        /**
         * @return errCode
         */
        public Integer getErrCode() {
            return this.errCode;
        }

        /**
         * @return errMessage
         */
        public String getErrMessage() {
            return this.errMessage;
        }

        /**
         * @return renderingInstanceId
         */
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        public static final class Builder {
            private Integer errCode; 
            private String errMessage; 
            private String renderingInstanceId; 

            private Builder() {
            } 

            private Builder(FailedInstances model) {
                this.errCode = model.errCode;
                this.errMessage = model.errMessage;
                this.renderingInstanceId = model.renderingInstanceId;
            } 

            /**
             * <p>Error code</p>
             * 
             * <strong>example:</strong>
             * <p>300000</p>
             */
            public Builder errCode(Integer errCode) {
                this.errCode = errCode;
                return this;
            }

            /**
             * <p>Reason for failure</p>
             * 
             * <strong>example:</strong>
             * <p>Rejected due to timeout</p>
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            /**
             * <p>Cloud application service instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>render-421cd2a1125947c19fcd5c7dd2c7d31e</p>
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
     * {@link RebootRenderingServerResponseBody} extends {@link TeaModel}
     *
     * <p>RebootRenderingServerResponseBody</p>
     */
    public static class SuccessInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
        private String renderingInstanceId;

        private SuccessInstances(Builder builder) {
            this.renderingInstanceId = builder.renderingInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessInstances create() {
            return builder().build();
        }

        /**
         * @return renderingInstanceId
         */
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        public static final class Builder {
            private String renderingInstanceId; 

            private Builder() {
            } 

            private Builder(SuccessInstances model) {
                this.renderingInstanceId = model.renderingInstanceId;
            } 

            /**
             * <p>Cloud application service instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>render-e6cf423c787e4e43b460a788da254fe3</p>
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
