// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

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
 * {@link BindProduceAuthorizationResponseBody} extends {@link TeaModel}
 *
 * <p>BindProduceAuthorizationResponseBody</p>
 */
public class BindProduceAuthorizationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BindProduceAuthorizationResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindProduceAuthorizationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(BindProduceAuthorizationResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BindProduceAuthorizationResponseBody build() {
            return new BindProduceAuthorizationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BindProduceAuthorizationResponseBody} extends {@link TeaModel}
     *
     * <p>BindProduceAuthorizationResponseBody</p>
     */
    public static class AuthorizedUserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountValidType")
        private Integer accountValidType;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private AuthorizedUserList(Builder builder) {
            this.accountValidType = builder.accountValidType;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizedUserList create() {
            return builder().build();
        }

        /**
         * @return accountValidType
         */
        public Integer getAccountValidType() {
            return this.accountValidType;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Integer accountValidType; 
            private String userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(AuthorizedUserList model) {
                this.accountValidType = model.accountValidType;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * AccountValidType.
             */
            public Builder accountValidType(Integer accountValidType) {
                this.accountValidType = accountValidType;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public AuthorizedUserList build() {
                return new AuthorizedUserList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BindProduceAuthorizationResponseBody} extends {@link TeaModel}
     *
     * <p>BindProduceAuthorizationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizedUserList")
        private java.util.List<AuthorizedUserList> authorizedUserList;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.authorizedUserList = builder.authorizedUserList;
            this.message = builder.message;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authorizedUserList
         */
        public java.util.List<AuthorizedUserList> getAuthorizedUserList() {
            return this.authorizedUserList;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private java.util.List<AuthorizedUserList> authorizedUserList; 
            private String message; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authorizedUserList = model.authorizedUserList;
                this.message = model.message;
                this.success = model.success;
            } 

            /**
             * AuthorizedUserList.
             */
            public Builder authorizedUserList(java.util.List<AuthorizedUserList> authorizedUserList) {
                this.authorizedUserList = authorizedUserList;
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
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
