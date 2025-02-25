// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dybaseapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTokenForMnsQueueResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTokenForMnsQueueResponseBody</p>
 */
public class QueryTokenForMnsQueueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("MessageTokenDTO")
    private MessageTokenDTO messageTokenDTO;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryTokenForMnsQueueResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.messageTokenDTO = builder.messageTokenDTO;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTokenForMnsQueueResponseBody create() {
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
     * @return messageTokenDTO
     */
    public MessageTokenDTO getMessageTokenDTO() {
        return this.messageTokenDTO;
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
        private MessageTokenDTO messageTokenDTO; 
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
         * MessageTokenDTO.
         */
        public Builder messageTokenDTO(MessageTokenDTO messageTokenDTO) {
            this.messageTokenDTO = messageTokenDTO;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryTokenForMnsQueueResponseBody build() {
            return new QueryTokenForMnsQueueResponseBody(this);
        } 

    } 

    public static class MessageTokenDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("SecurityToken")
        private String securityToken;

        private MessageTokenDTO(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.securityToken = builder.securityToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageTokenDTO create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeySecret; 
            private String createTime; 
            private String expireTime; 
            private String securityToken; 

            /**
             * AccessKeyId.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * AccessKeySecret.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
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
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * SecurityToken.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            public MessageTokenDTO build() {
                return new MessageTokenDTO(this);
            } 

        } 

    }
}
