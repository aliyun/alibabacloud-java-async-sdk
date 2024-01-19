// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRefundResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyRefundResponseBody</p>
 */
public class ModifyRefundResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RefundApplicationData")
    private RefundApplicationData refundApplicationData;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyRefundResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.refundApplicationData = builder.refundApplicationData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRefundResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return refundApplicationData
     */
    public RefundApplicationData getRefundApplicationData() {
        return this.refundApplicationData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private RefundApplicationData refundApplicationData; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * RefundApplicationData.
         */
        public Builder refundApplicationData(RefundApplicationData refundApplicationData) {
            this.refundApplicationData = refundApplicationData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyRefundResponseBody build() {
            return new ModifyRefundResponseBody(this);
        } 

    } 

    public static class RefundApplicationData extends TeaModel {
        @NameInMap("DisputeStatus")
        private Integer disputeStatus;

        @NameInMap("DisputeType")
        private Integer disputeType;

        @NameInMap("SubLmOrderId")
        private String subLmOrderId;

        private RefundApplicationData(Builder builder) {
            this.disputeStatus = builder.disputeStatus;
            this.disputeType = builder.disputeType;
            this.subLmOrderId = builder.subLmOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundApplicationData create() {
            return builder().build();
        }

        /**
         * @return disputeStatus
         */
        public Integer getDisputeStatus() {
            return this.disputeStatus;
        }

        /**
         * @return disputeType
         */
        public Integer getDisputeType() {
            return this.disputeType;
        }

        /**
         * @return subLmOrderId
         */
        public String getSubLmOrderId() {
            return this.subLmOrderId;
        }

        public static final class Builder {
            private Integer disputeStatus; 
            private Integer disputeType; 
            private String subLmOrderId; 

            /**
             * DisputeStatus.
             */
            public Builder disputeStatus(Integer disputeStatus) {
                this.disputeStatus = disputeStatus;
                return this;
            }

            /**
             * DisputeType.
             */
            public Builder disputeType(Integer disputeType) {
                this.disputeType = disputeType;
                return this;
            }

            /**
             * SubLmOrderId.
             */
            public Builder subLmOrderId(String subLmOrderId) {
                this.subLmOrderId = subLmOrderId;
                return this;
            }

            public RefundApplicationData build() {
                return new RefundApplicationData(this);
            } 

        } 

    }
}
