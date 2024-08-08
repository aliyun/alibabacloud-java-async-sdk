// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailadvqa20230417.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MemberPointChangeRequest} extends {@link RequestModel}
 *
 * <p>MemberPointChangeRequest</p>
 */
public class MemberPointChangeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("body")
    private MemberPointChangeRequestBody body;

    private MemberPointChangeRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MemberPointChangeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public MemberPointChangeRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<MemberPointChangeRequest, Builder> {
        private MemberPointChangeRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(MemberPointChangeRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(MemberPointChangeRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putQueryParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public MemberPointChangeRequest build() {
            return new MemberPointChangeRequest(this);
        } 

    } 

    public static class MemberPointChangeRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("ChannelCode")
        private String channelCode;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("OpenMerchantId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String openMerchantId;

        @com.aliyun.core.annotation.NameInMap("OperateType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String operateType;

        @com.aliyun.core.annotation.NameInMap("OuterMemberId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String outerMemberId;

        @com.aliyun.core.annotation.NameInMap("PlatFormType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String platFormType;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        @com.aliyun.core.annotation.Validation(required = true)
        private String quantity;

        @com.aliyun.core.annotation.NameInMap("SerialNo")
        @com.aliyun.core.annotation.Validation(required = true)
        private String serialNo;

        private MemberPointChangeRequestBody(Builder builder) {
            this.accountType = builder.accountType;
            this.channelCode = builder.channelCode;
            this.extra = builder.extra;
            this.openMerchantId = builder.openMerchantId;
            this.operateType = builder.operateType;
            this.outerMemberId = builder.outerMemberId;
            this.platFormType = builder.platFormType;
            this.quantity = builder.quantity;
            this.serialNo = builder.serialNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemberPointChangeRequestBody create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return channelCode
         */
        public String getChannelCode() {
            return this.channelCode;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return openMerchantId
         */
        public String getOpenMerchantId() {
            return this.openMerchantId;
        }

        /**
         * @return operateType
         */
        public String getOperateType() {
            return this.operateType;
        }

        /**
         * @return outerMemberId
         */
        public String getOuterMemberId() {
            return this.outerMemberId;
        }

        /**
         * @return platFormType
         */
        public String getPlatFormType() {
            return this.platFormType;
        }

        /**
         * @return quantity
         */
        public String getQuantity() {
            return this.quantity;
        }

        /**
         * @return serialNo
         */
        public String getSerialNo() {
            return this.serialNo;
        }

        public static final class Builder {
            private String accountType; 
            private String channelCode; 
            private String extra; 
            private String openMerchantId; 
            private String operateType; 
            private String outerMemberId; 
            private String platFormType; 
            private String quantity; 
            private String serialNo; 

            /**
             * AccountType.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * ChannelCode.
             */
            public Builder channelCode(String channelCode) {
                this.channelCode = channelCode;
                return this;
            }

            /**
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * OpenMerchantId.
             */
            public Builder openMerchantId(String openMerchantId) {
                this.openMerchantId = openMerchantId;
                return this;
            }

            /**
             * OperateType.
             */
            public Builder operateType(String operateType) {
                this.operateType = operateType;
                return this;
            }

            /**
             * OuterMemberId.
             */
            public Builder outerMemberId(String outerMemberId) {
                this.outerMemberId = outerMemberId;
                return this;
            }

            /**
             * PlatFormType.
             */
            public Builder platFormType(String platFormType) {
                this.platFormType = platFormType;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(String quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * SerialNo.
             */
            public Builder serialNo(String serialNo) {
                this.serialNo = serialNo;
                return this;
            }

            public MemberPointChangeRequestBody build() {
                return new MemberPointChangeRequestBody(this);
            } 

        } 

    }
}
