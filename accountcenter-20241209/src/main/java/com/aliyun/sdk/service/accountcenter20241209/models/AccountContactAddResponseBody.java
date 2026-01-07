// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link AccountContactAddResponseBody} extends {@link TeaModel}
 *
 * <p>AccountContactAddResponseBody</p>
 */
public class AccountContactAddResponseBody extends TeaModel {
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

    private AccountContactAddResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AccountContactAddResponseBody create() {
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

        private Builder(AccountContactAddResponseBody model) {
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

        public AccountContactAddResponseBody build() {
            return new AccountContactAddResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AccountContactAddResponseBody} extends {@link TeaModel}
     *
     * <p>AccountContactAddResponseBody</p>
     */
    public static class ErrorList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorDesc")
        private String errorDesc;

        @com.aliyun.core.annotation.NameInMap("Item")
        private String item;

        private ErrorList(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorDesc = builder.errorDesc;
            this.item = builder.item;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorList create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorDesc
         */
        public String getErrorDesc() {
            return this.errorDesc;
        }

        /**
         * @return item
         */
        public String getItem() {
            return this.item;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorDesc; 
            private String item; 

            private Builder() {
            } 

            private Builder(ErrorList model) {
                this.errorCode = model.errorCode;
                this.errorDesc = model.errorDesc;
                this.item = model.item;
            } 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorDesc.
             */
            public Builder errorDesc(String errorDesc) {
                this.errorDesc = errorDesc;
                return this;
            }

            /**
             * Item.
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            public ErrorList build() {
                return new ErrorList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AccountContactAddResponseBody} extends {@link TeaModel}
     *
     * <p>AccountContactAddResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactId")
        private Long contactId;

        @com.aliyun.core.annotation.NameInMap("ErrorList")
        private java.util.List<ErrorList> errorList;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Boolean result;

        private Data(Builder builder) {
            this.contactId = builder.contactId;
            this.errorList = builder.errorList;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return contactId
         */
        public Long getContactId() {
            return this.contactId;
        }

        /**
         * @return errorList
         */
        public java.util.List<ErrorList> getErrorList() {
            return this.errorList;
        }

        /**
         * @return result
         */
        public Boolean getResult() {
            return this.result;
        }

        public static final class Builder {
            private Long contactId; 
            private java.util.List<ErrorList> errorList; 
            private Boolean result; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.contactId = model.contactId;
                this.errorList = model.errorList;
                this.result = model.result;
            } 

            /**
             * ContactId.
             */
            public Builder contactId(Long contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * ErrorList.
             */
            public Builder errorList(java.util.List<ErrorList> errorList) {
                this.errorList = errorList;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(Boolean result) {
                this.result = result;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
