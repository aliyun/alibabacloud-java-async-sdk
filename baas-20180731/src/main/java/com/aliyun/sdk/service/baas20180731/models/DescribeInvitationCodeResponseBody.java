// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInvitationCodeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInvitationCodeResponseBody</p>
 */
public class DescribeInvitationCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeInvitationCodeResponseBody(Builder builder) {
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvitationCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
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
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer errorCode; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
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
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeInvitationCodeResponseBody build() {
            return new DescribeInvitationCodeResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accepted")
        private Boolean accepted;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ConsortiumId")
        private String consortiumId;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("SendTime")
        private String sendTime;

        @com.aliyun.core.annotation.NameInMap("SenderBid")
        private String senderBid;

        @com.aliyun.core.annotation.NameInMap("SenderId")
        private Long senderId;

        @com.aliyun.core.annotation.NameInMap("SenderName")
        private String senderName;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Result(Builder builder) {
            this.accepted = builder.accepted;
            this.code = builder.code;
            this.consortiumId = builder.consortiumId;
            this.email = builder.email;
            this.expireTime = builder.expireTime;
            this.id = builder.id;
            this.sendTime = builder.sendTime;
            this.senderBid = builder.senderBid;
            this.senderId = builder.senderId;
            this.senderName = builder.senderName;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return accepted
         */
        public Boolean getAccepted() {
            return this.accepted;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return consortiumId
         */
        public String getConsortiumId() {
            return this.consortiumId;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return sendTime
         */
        public String getSendTime() {
            return this.sendTime;
        }

        /**
         * @return senderBid
         */
        public String getSenderBid() {
            return this.senderBid;
        }

        /**
         * @return senderId
         */
        public Long getSenderId() {
            return this.senderId;
        }

        /**
         * @return senderName
         */
        public String getSenderName() {
            return this.senderName;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Boolean accepted; 
            private String code; 
            private String consortiumId; 
            private String email; 
            private String expireTime; 
            private Integer id; 
            private String sendTime; 
            private String senderBid; 
            private Long senderId; 
            private String senderName; 
            private String url; 

            /**
             * Accepted.
             */
            public Builder accepted(Boolean accepted) {
                this.accepted = accepted;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ConsortiumId.
             */
            public Builder consortiumId(String consortiumId) {
                this.consortiumId = consortiumId;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
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
             * Id
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * SendTime.
             */
            public Builder sendTime(String sendTime) {
                this.sendTime = sendTime;
                return this;
            }

            /**
             * SenderBid.
             */
            public Builder senderBid(String senderBid) {
                this.senderBid = senderBid;
                return this;
            }

            /**
             * SenderId.
             */
            public Builder senderId(Long senderId) {
                this.senderId = senderId;
                return this;
            }

            /**
             * SenderName.
             */
            public Builder senderName(String senderName) {
                this.senderName = senderName;
                return this;
            }

            /**
             * URL
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
