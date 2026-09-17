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
 * {@link UpgradeRenderingInstanceImageResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeRenderingInstanceImageResponseBody</p>
 */
public class UpgradeRenderingInstanceImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedCount")
    private Long failedCount;

    @com.aliyun.core.annotation.NameInMap("FailedItems")
    private java.util.List<FailedItems> failedItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Long successCount;

    @com.aliyun.core.annotation.NameInMap("SuccessItems")
    private java.util.List<SuccessItems> successItems;

    private UpgradeRenderingInstanceImageResponseBody(Builder builder) {
        this.failedCount = builder.failedCount;
        this.failedItems = builder.failedItems;
        this.requestId = builder.requestId;
        this.successCount = builder.successCount;
        this.successItems = builder.successItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeRenderingInstanceImageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failedCount
     */
    public Long getFailedCount() {
        return this.failedCount;
    }

    /**
     * @return failedItems
     */
    public java.util.List<FailedItems> getFailedItems() {
        return this.failedItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successCount
     */
    public Long getSuccessCount() {
        return this.successCount;
    }

    /**
     * @return successItems
     */
    public java.util.List<SuccessItems> getSuccessItems() {
        return this.successItems;
    }

    public static final class Builder {
        private Long failedCount; 
        private java.util.List<FailedItems> failedItems; 
        private String requestId; 
        private Long successCount; 
        private java.util.List<SuccessItems> successItems; 

        private Builder() {
        } 

        private Builder(UpgradeRenderingInstanceImageResponseBody model) {
            this.failedCount = model.failedCount;
            this.failedItems = model.failedItems;
            this.requestId = model.requestId;
            this.successCount = model.successCount;
            this.successItems = model.successItems;
        } 

        /**
         * <p>The number of failed instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder failedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * <p>The information about failed instances.</p>
         */
        public Builder failedItems(java.util.List<FailedItems> failedItems) {
            this.failedItems = failedItems;
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
         * <p>The number of successful instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder successCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * <p>The information about successful instances.</p>
         */
        public Builder successItems(java.util.List<SuccessItems> successItems) {
            this.successItems = successItems;
            return this;
        }

        public UpgradeRenderingInstanceImageResponseBody build() {
            return new UpgradeRenderingInstanceImageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpgradeRenderingInstanceImageResponseBody} extends {@link TeaModel}
     *
     * <p>UpgradeRenderingInstanceImageResponseBody</p>
     */
    public static class FailedItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrCode")
        private String errCode;

        @com.aliyun.core.annotation.NameInMap("ErrMessage")
        private String errMessage;

        @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
        private String renderingInstanceId;

        private FailedItems(Builder builder) {
            this.errCode = builder.errCode;
            this.errMessage = builder.errMessage;
            this.renderingInstanceId = builder.renderingInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedItems create() {
            return builder().build();
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
         * @return renderingInstanceId
         */
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        public static final class Builder {
            private String errCode; 
            private String errMessage; 
            private String renderingInstanceId; 

            private Builder() {
            } 

            private Builder(FailedItems model) {
                this.errCode = model.errCode;
                this.errMessage = model.errMessage;
                this.renderingInstanceId = model.renderingInstanceId;
            } 

            /**
             * <p>The error code of the failure.</p>
             * 
             * <strong>example:</strong>
             * <p>200302</p>
             */
            public Builder errCode(String errCode) {
                this.errCode = errCode;
                return this;
            }

            /**
             * <p>The error message of the failure.</p>
             * 
             * <strong>example:</strong>
             * <p>Not Applied</p>
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            /**
             * <p>The cloud application service instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>render-072da95539d3402da90353b244191722</p>
             */
            public Builder renderingInstanceId(String renderingInstanceId) {
                this.renderingInstanceId = renderingInstanceId;
                return this;
            }

            public FailedItems build() {
                return new FailedItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpgradeRenderingInstanceImageResponseBody} extends {@link TeaModel}
     *
     * <p>UpgradeRenderingInstanceImageResponseBody</p>
     */
    public static class SuccessItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
        private String renderingInstanceId;

        private SuccessItems(Builder builder) {
            this.renderingInstanceId = builder.renderingInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessItems create() {
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

            private Builder(SuccessItems model) {
                this.renderingInstanceId = model.renderingInstanceId;
            } 

            /**
             * <p>The cloud application service instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>render-1ada8cd82783407b99fa202826fc6447</p>
             */
            public Builder renderingInstanceId(String renderingInstanceId) {
                this.renderingInstanceId = renderingInstanceId;
                return this;
            }

            public SuccessItems build() {
                return new SuccessItems(this);
            } 

        } 

    }
}
