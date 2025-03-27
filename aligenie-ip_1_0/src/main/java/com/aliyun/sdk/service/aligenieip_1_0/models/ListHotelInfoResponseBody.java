// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link ListHotelInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListHotelInfoResponseBody</p>
 */
public class ListHotelInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Extentions")
    private java.util.Map<String, ?> extentions;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("StatusCode")
    private Integer statusCode;

    private ListHotelInfoResponseBody(Builder builder) {
        this.extentions = builder.extentions;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotelInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extentions
     */
    public java.util.Map<String, ?> getExtentions() {
        return this.extentions;
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
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder {
        private java.util.Map<String, ?> extentions; 
        private String message; 
        private String requestId; 
        private java.util.List<Result> result; 
        private Integer statusCode; 

        private Builder() {
        } 

        private Builder(ListHotelInfoResponseBody model) {
            this.extentions = model.extentions;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.statusCode = model.statusCode;
        } 

        /**
         * Extentions.
         */
        public Builder extentions(java.util.Map<String, ?> extentions) {
            this.extentions = extentions;
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
         * Result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public ListHotelInfoResponseBody build() {
            return new ListHotelInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHotelInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotelInfoResponseBody</p>
     */
    public static class AuthAccount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private AuthAccount(Builder builder) {
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthAccount create() {
            return builder().build();
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String userName; 

            private Builder() {
            } 

            private Builder(AuthAccount model) {
                this.userName = model.userName;
            } 

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public AuthAccount build() {
                return new AuthAccount(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHotelInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotelInfoResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAccount")
        private java.util.List<AuthAccount> authAccount;

        @com.aliyun.core.annotation.NameInMap("HotelAddress")
        private String hotelAddress;

        @com.aliyun.core.annotation.NameInMap("HotelId")
        private String hotelId;

        @com.aliyun.core.annotation.NameInMap("HotelName")
        private String hotelName;

        private Result(Builder builder) {
            this.authAccount = builder.authAccount;
            this.hotelAddress = builder.hotelAddress;
            this.hotelId = builder.hotelId;
            this.hotelName = builder.hotelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return authAccount
         */
        public java.util.List<AuthAccount> getAuthAccount() {
            return this.authAccount;
        }

        /**
         * @return hotelAddress
         */
        public String getHotelAddress() {
            return this.hotelAddress;
        }

        /**
         * @return hotelId
         */
        public String getHotelId() {
            return this.hotelId;
        }

        /**
         * @return hotelName
         */
        public String getHotelName() {
            return this.hotelName;
        }

        public static final class Builder {
            private java.util.List<AuthAccount> authAccount; 
            private String hotelAddress; 
            private String hotelId; 
            private String hotelName; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.authAccount = model.authAccount;
                this.hotelAddress = model.hotelAddress;
                this.hotelId = model.hotelId;
                this.hotelName = model.hotelName;
            } 

            /**
             * AuthAccount.
             */
            public Builder authAccount(java.util.List<AuthAccount> authAccount) {
                this.authAccount = authAccount;
                return this;
            }

            /**
             * HotelAddress.
             */
            public Builder hotelAddress(String hotelAddress) {
                this.hotelAddress = hotelAddress;
                return this;
            }

            /**
             * HotelId.
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            /**
             * HotelName.
             */
            public Builder hotelName(String hotelName) {
                this.hotelName = hotelName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
