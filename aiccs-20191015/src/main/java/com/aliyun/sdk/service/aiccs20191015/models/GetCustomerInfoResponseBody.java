// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomerInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomerInfoResponseBody</p>
 */
public class GetCustomerInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        /**
         * 错误码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 会员信息
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 是否请求成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCustomerInfoResponseBody build() {
            return new GetCustomerInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CustomizeFields")
        private java.util.Map < String, ? > customizeFields;

        @NameInMap("Nick")
        private String nick;

        @NameInMap("OuterId")
        private String outerId;

        @NameInMap("Photo")
        private String photo;

        @NameInMap("RealName")
        private String realName;

        @NameInMap("UserId")
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
        public java.util.Map < String, ? > getCustomizeFields() {
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
            private java.util.Map < String, ? > customizeFields; 
            private String nick; 
            private String outerId; 
            private String photo; 
            private String realName; 
            private Long userId; 

            /**
             * 自定义字段
             */
            public Builder customizeFields(java.util.Map < String, ? > customizeFields) {
                this.customizeFields = customizeFields;
                return this;
            }

            /**
             * 昵称
             */
            public Builder nick(String nick) {
                this.nick = nick;
                return this;
            }

            /**
             * 外部ID
             */
            public Builder outerId(String outerId) {
                this.outerId = outerId;
                return this;
            }

            /**
             * 头像
             */
            public Builder photo(String photo) {
                this.photo = photo;
                return this;
            }

            /**
             * 真实姓名
             */
            public Builder realName(String realName) {
                this.realName = realName;
                return this;
            }

            /**
             * 会员ID
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
