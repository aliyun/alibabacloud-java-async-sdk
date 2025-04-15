// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetCustomerInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomerInfoResponseBody</p>
 */
public class GetCustomerInfoResponseBody extends TeaModel {
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

    private GetCustomerInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomerInfoResponseBody create() {
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

        private Builder(GetCustomerInfoResponseBody model) {
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

        public GetCustomerInfoResponseBody build() {
            return new GetCustomerInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCustomerInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomerInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomizeFields")
        private java.util.Map<String, ?> customizeFields;

        @com.aliyun.core.annotation.NameInMap("Nick")
        private String nick;

        @com.aliyun.core.annotation.NameInMap("OuterId")
        private String outerId;

        @com.aliyun.core.annotation.NameInMap("Photo")
        private String photo;

        @com.aliyun.core.annotation.NameInMap("RealName")
        private String realName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private Data(Builder builder) {
            this.customizeFields = builder.customizeFields;
            this.nick = builder.nick;
            this.outerId = builder.outerId;
            this.photo = builder.photo;
            this.realName = builder.realName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customizeFields
         */
        public java.util.Map<String, ?> getCustomizeFields() {
            return this.customizeFields;
        }

        /**
         * @return nick
         */
        public String getNick() {
            return this.nick;
        }

        /**
         * @return outerId
         */
        public String getOuterId() {
            return this.outerId;
        }

        /**
         * @return photo
         */
        public String getPhoto() {
            return this.photo;
        }

        /**
         * @return realName
         */
        public String getRealName() {
            return this.realName;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.Map<String, ?> customizeFields; 
            private String nick; 
            private String outerId; 
            private String photo; 
            private String realName; 
            private Long userId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.customizeFields = model.customizeFields;
                this.nick = model.nick;
                this.outerId = model.outerId;
                this.photo = model.photo;
                this.realName = model.realName;
                this.userId = model.userId;
            } 

            /**
             * CustomizeFields.
             */
            public Builder customizeFields(java.util.Map<String, ?> customizeFields) {
                this.customizeFields = customizeFields;
                return this;
            }

            /**
             * Nick.
             */
            public Builder nick(String nick) {
                this.nick = nick;
                return this;
            }

            /**
             * OuterId.
             */
            public Builder outerId(String outerId) {
                this.outerId = outerId;
                return this;
            }

            /**
             * Photo.
             */
            public Builder photo(String photo) {
                this.photo = photo;
                return this;
            }

            /**
             * RealName.
             */
            public Builder realName(String realName) {
                this.realName = realName;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
