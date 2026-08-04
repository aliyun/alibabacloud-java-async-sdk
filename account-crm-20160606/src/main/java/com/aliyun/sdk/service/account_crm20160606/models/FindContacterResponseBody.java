// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link FindContacterResponseBody} extends {@link TeaModel}
 *
 * <p>FindContacterResponseBody</p>
 */
public class FindContacterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private FindContacterResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindContacterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(FindContacterResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
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

        public FindContacterResponseBody build() {
            return new FindContacterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FindContacterResponseBody} extends {@link TeaModel}
     *
     * <p>FindContacterResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContacterAddress")
        private String contacterAddress;

        @com.aliyun.core.annotation.NameInMap("ContacterDingding")
        private String contacterDingding;

        @com.aliyun.core.annotation.NameInMap("ContacterEmail")
        private String contacterEmail;

        @com.aliyun.core.annotation.NameInMap("ContacterId")
        private Long contacterId;

        @com.aliyun.core.annotation.NameInMap("ContacterMobile")
        private String contacterMobile;

        @com.aliyun.core.annotation.NameInMap("ContacterName")
        private String contacterName;

        @com.aliyun.core.annotation.NameInMap("ContacterPosition")
        private String contacterPosition;

        @com.aliyun.core.annotation.NameInMap("ContacterStaffNo")
        private String contacterStaffNo;

        @com.aliyun.core.annotation.NameInMap("ContacterType")
        private String contacterType;

        @com.aliyun.core.annotation.NameInMap("ContacterWangwang")
        private String contacterWangwang;

        @com.aliyun.core.annotation.NameInMap("EmailConfirmed")
        private Boolean emailConfirmed;

        @com.aliyun.core.annotation.NameInMap("MobileConfirmed")
        private Boolean mobileConfirmed;

        private Data(Builder builder) {
            this.contacterAddress = builder.contacterAddress;
            this.contacterDingding = builder.contacterDingding;
            this.contacterEmail = builder.contacterEmail;
            this.contacterId = builder.contacterId;
            this.contacterMobile = builder.contacterMobile;
            this.contacterName = builder.contacterName;
            this.contacterPosition = builder.contacterPosition;
            this.contacterStaffNo = builder.contacterStaffNo;
            this.contacterType = builder.contacterType;
            this.contacterWangwang = builder.contacterWangwang;
            this.emailConfirmed = builder.emailConfirmed;
            this.mobileConfirmed = builder.mobileConfirmed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return contacterAddress
         */
        public String getContacterAddress() {
            return this.contacterAddress;
        }

        /**
         * @return contacterDingding
         */
        public String getContacterDingding() {
            return this.contacterDingding;
        }

        /**
         * @return contacterEmail
         */
        public String getContacterEmail() {
            return this.contacterEmail;
        }

        /**
         * @return contacterId
         */
        public Long getContacterId() {
            return this.contacterId;
        }

        /**
         * @return contacterMobile
         */
        public String getContacterMobile() {
            return this.contacterMobile;
        }

        /**
         * @return contacterName
         */
        public String getContacterName() {
            return this.contacterName;
        }

        /**
         * @return contacterPosition
         */
        public String getContacterPosition() {
            return this.contacterPosition;
        }

        /**
         * @return contacterStaffNo
         */
        public String getContacterStaffNo() {
            return this.contacterStaffNo;
        }

        /**
         * @return contacterType
         */
        public String getContacterType() {
            return this.contacterType;
        }

        /**
         * @return contacterWangwang
         */
        public String getContacterWangwang() {
            return this.contacterWangwang;
        }

        /**
         * @return emailConfirmed
         */
        public Boolean getEmailConfirmed() {
            return this.emailConfirmed;
        }

        /**
         * @return mobileConfirmed
         */
        public Boolean getMobileConfirmed() {
            return this.mobileConfirmed;
        }

        public static final class Builder {
            private String contacterAddress; 
            private String contacterDingding; 
            private String contacterEmail; 
            private Long contacterId; 
            private String contacterMobile; 
            private String contacterName; 
            private String contacterPosition; 
            private String contacterStaffNo; 
            private String contacterType; 
            private String contacterWangwang; 
            private Boolean emailConfirmed; 
            private Boolean mobileConfirmed; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.contacterAddress = model.contacterAddress;
                this.contacterDingding = model.contacterDingding;
                this.contacterEmail = model.contacterEmail;
                this.contacterId = model.contacterId;
                this.contacterMobile = model.contacterMobile;
                this.contacterName = model.contacterName;
                this.contacterPosition = model.contacterPosition;
                this.contacterStaffNo = model.contacterStaffNo;
                this.contacterType = model.contacterType;
                this.contacterWangwang = model.contacterWangwang;
                this.emailConfirmed = model.emailConfirmed;
                this.mobileConfirmed = model.mobileConfirmed;
            } 

            /**
             * ContacterAddress.
             */
            public Builder contacterAddress(String contacterAddress) {
                this.contacterAddress = contacterAddress;
                return this;
            }

            /**
             * ContacterDingding.
             */
            public Builder contacterDingding(String contacterDingding) {
                this.contacterDingding = contacterDingding;
                return this;
            }

            /**
             * ContacterEmail.
             */
            public Builder contacterEmail(String contacterEmail) {
                this.contacterEmail = contacterEmail;
                return this;
            }

            /**
             * ContacterId.
             */
            public Builder contacterId(Long contacterId) {
                this.contacterId = contacterId;
                return this;
            }

            /**
             * ContacterMobile.
             */
            public Builder contacterMobile(String contacterMobile) {
                this.contacterMobile = contacterMobile;
                return this;
            }

            /**
             * ContacterName.
             */
            public Builder contacterName(String contacterName) {
                this.contacterName = contacterName;
                return this;
            }

            /**
             * ContacterPosition.
             */
            public Builder contacterPosition(String contacterPosition) {
                this.contacterPosition = contacterPosition;
                return this;
            }

            /**
             * ContacterStaffNo.
             */
            public Builder contacterStaffNo(String contacterStaffNo) {
                this.contacterStaffNo = contacterStaffNo;
                return this;
            }

            /**
             * ContacterType.
             */
            public Builder contacterType(String contacterType) {
                this.contacterType = contacterType;
                return this;
            }

            /**
             * ContacterWangwang.
             */
            public Builder contacterWangwang(String contacterWangwang) {
                this.contacterWangwang = contacterWangwang;
                return this;
            }

            /**
             * EmailConfirmed.
             */
            public Builder emailConfirmed(Boolean emailConfirmed) {
                this.emailConfirmed = emailConfirmed;
                return this;
            }

            /**
             * MobileConfirmed.
             */
            public Builder mobileConfirmed(Boolean mobileConfirmed) {
                this.mobileConfirmed = mobileConfirmed;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
