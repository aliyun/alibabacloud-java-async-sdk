// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IssueCouponForCustomerResponseBody} extends {@link TeaModel}
 *
 * <p>IssueCouponForCustomerResponseBody</p>
 */
public class IssueCouponForCustomerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    private IssueCouponForCustomerResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IssueCouponForCustomerResponseBody create() {
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

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Data data; 

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
         * Id of the request
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

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public IssueCouponForCustomerResponseBody build() {
            return new IssueCouponForCustomerResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CouponTemplateId")
        private Long couponTemplateId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Uidlist")
        private String uidlist;

        private Data(Builder builder) {
            this.couponTemplateId = builder.couponTemplateId;
            this.createTime = builder.createTime;
            this.uidlist = builder.uidlist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return couponTemplateId
         */
        public Long getCouponTemplateId() {
            return this.couponTemplateId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return uidlist
         */
        public String getUidlist() {
            return this.uidlist;
        }

        public static final class Builder {
            private Long couponTemplateId; 
            private String createTime; 
            private String uidlist; 

            /**
             * CouponTemplateId.
             */
            public Builder couponTemplateId(Long couponTemplateId) {
                this.couponTemplateId = couponTemplateId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Uidlist.
             */
            public Builder uidlist(String uidlist) {
                this.uidlist = uidlist;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
