// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GenerateMessageChatTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateMessageChatTokenResponseBody</p>
 */
public class GenerateMessageChatTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AppSign")
    private String appSign;

    @com.aliyun.core.annotation.NameInMap("Nonce")
    private String nonce;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.NameInMap("TimeStamp")
    private Long timeStamp;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private GenerateMessageChatTokenResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.appSign = builder.appSign;
        this.nonce = builder.nonce;
        this.requestId = builder.requestId;
        this.role = builder.role;
        this.timeStamp = builder.timeStamp;
        this.token = builder.token;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateMessageChatTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appSign
     */
    public String getAppSign() {
        return this.appSign;
    }

    /**
     * @return nonce
     */
    public String getNonce() {
        return this.nonce;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return timeStamp
     */
    public Long getTimeStamp() {
        return this.timeStamp;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String appId; 
        private String appSign; 
        private String nonce; 
        private String requestId; 
        private String role; 
        private Long timeStamp; 
        private String token; 
        private String userId; 

        private Builder() {
        } 

        private Builder(GenerateMessageChatTokenResponseBody model) {
            this.appId = model.appId;
            this.appSign = model.appSign;
            this.nonce = model.nonce;
            this.requestId = model.requestId;
            this.role = model.role;
            this.timeStamp = model.timeStamp;
            this.token = model.token;
            this.userId = model.userId;
        } 

        /**
         * <p>The AppID of the user.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>The application signature.</p>
         * 
         * <strong>example:</strong>
         * <p>H4sIAAAAAAAE******************</p>
         */
        public Builder appSign(String appSign) {
            this.appSign = appSign;
            return this;
        }

        /**
         * <p>The nonce used to generate the token.</p>
         * 
         * <strong>example:</strong>
         * <p>AK-***********</p>
         */
        public Builder nonce(String nonce) {
            this.nonce = nonce;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>req_1234567890abcdef</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The role used to generate the token.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * <p>The expiration time. Unit: seconds. Expiration time = Current time + Validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>1700000000</p>
         */
        public Builder timeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }

        /**
         * <p>The generated token.</p>
         * 
         * <strong>example:</strong>
         * <p>acet**********</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * <p>The ID of the user for joining the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>YOURUSERID</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public GenerateMessageChatTokenResponseBody build() {
            return new GenerateMessageChatTokenResponseBody(this);
        } 

    } 

}
