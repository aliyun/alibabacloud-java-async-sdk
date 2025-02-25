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
 * {@link GenerateMessageChatTokenRequest} extends {@link RequestModel}
 *
 * <p>GenerateMessageChatTokenRequest</p>
 */
public class GenerateMessageChatTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AIAgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String AIAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expire")
    private Integer expire;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private GenerateMessageChatTokenRequest(Builder builder) {
        super(builder);
        this.AIAgentId = builder.AIAgentId;
        this.expire = builder.expire;
        this.role = builder.role;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateMessageChatTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIAgentId
     */
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    /**
     * @return expire
     */
    public Integer getExpire() {
        return this.expire;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GenerateMessageChatTokenRequest, Builder> {
        private String AIAgentId; 
        private Integer expire; 
        private String role; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateMessageChatTokenRequest request) {
            super(request);
            this.AIAgentId = request.AIAgentId;
            this.expire = request.expire;
            this.role = request.role;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>19de81b3b3d94abda22******</p>
         */
        public Builder AIAgentId(String AIAgentId) {
            this.putQueryParameter("AIAgentId", AIAgentId);
            this.AIAgentId = AIAgentId;
            return this;
        }

        /**
         * Expire.
         */
        public Builder expire(Integer expire) {
            this.putQueryParameter("Expire", expire);
            this.expire = expire;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>YOURUSERID</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GenerateMessageChatTokenRequest build() {
            return new GenerateMessageChatTokenRequest(this);
        } 

    } 

}
