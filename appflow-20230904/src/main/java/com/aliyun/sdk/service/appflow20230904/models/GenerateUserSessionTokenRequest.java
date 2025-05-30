// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appflow20230904.models;

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
 * {@link GenerateUserSessionTokenRequest} extends {@link RequestModel}
 *
 * <p>GenerateUserSessionTokenRequest</p>
 */
public class GenerateUserSessionTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChatbotId")
    private String chatbotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireSecond")
    private Long expireSecond;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntegrateId")
    private String integrateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAvatar")
    private String userAvatar;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private GenerateUserSessionTokenRequest(Builder builder) {
        super(builder);
        this.chatbotId = builder.chatbotId;
        this.expireSecond = builder.expireSecond;
        this.integrateId = builder.integrateId;
        this.userAvatar = builder.userAvatar;
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateUserSessionTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chatbotId
     */
    public String getChatbotId() {
        return this.chatbotId;
    }

    /**
     * @return expireSecond
     */
    public Long getExpireSecond() {
        return this.expireSecond;
    }

    /**
     * @return integrateId
     */
    public String getIntegrateId() {
        return this.integrateId;
    }

    /**
     * @return userAvatar
     */
    public String getUserAvatar() {
        return this.userAvatar;
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

    public static final class Builder extends Request.Builder<GenerateUserSessionTokenRequest, Builder> {
        private String chatbotId; 
        private Long expireSecond; 
        private String integrateId; 
        private String userAvatar; 
        private String userId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(GenerateUserSessionTokenRequest request) {
            super(request);
            this.chatbotId = request.chatbotId;
            this.expireSecond = request.expireSecond;
            this.integrateId = request.integrateId;
            this.userAvatar = request.userAvatar;
            this.userId = request.userId;
            this.userName = request.userName;
        } 

        /**
         * <p>AI Assistant ID</p>
         * 
         * <strong>example:</strong>
         * <p>cb-069d508f9ab341b1****</p>
         */
        public Builder chatbotId(String chatbotId) {
            this.putQueryParameter("ChatbotId", chatbotId);
            this.chatbotId = chatbotId;
            return this;
        }

        /**
         * <p>Expiration Time, in seconds, default 24 hours</p>
         * 
         * <strong>example:</strong>
         * <p>6000</p>
         */
        public Builder expireSecond(Long expireSecond) {
            this.putQueryParameter("ExpireSecond", expireSecond);
            this.expireSecond = expireSecond;
            return this;
        }

        /**
         * <p>Integration ID</p>
         * 
         * <strong>example:</strong>
         * <p>cit-960f499au184m7****</p>
         */
        public Builder integrateId(String integrateId) {
            this.putQueryParameter("IntegrateId", integrateId);
            this.integrateId = integrateId;
            return this;
        }

        /**
         * <p>User Avatar (URL)</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxx.com/xxx">https://xxxx.com/xxx</a></p>
         */
        public Builder userAvatar(String userAvatar) {
            this.putQueryParameter("UserAvatar", userAvatar);
            this.userAvatar = userAvatar;
            return this;
        }

        /**
         * <p>User ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>929293312213****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>User Nickname</p>
         * 
         * <strong>example:</strong>
         * <p>testxxx</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public GenerateUserSessionTokenRequest build() {
            return new GenerateUserSessionTokenRequest(this);
        } 

    } 

}
