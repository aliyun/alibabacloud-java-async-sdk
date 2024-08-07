// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateUserAccessTokenRequest} extends {@link RequestModel}
 *
 * <p>GenerateUserAccessTokenRequest</p>
 */
public class GenerateUserAccessTokenRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    @com.aliyun.core.annotation.Validation(maximum = 3600)
    private Integer expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private String extraInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForeignId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String foreignId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nick")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String nick;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Telephone")
    @com.aliyun.core.annotation.Validation(maxLength = 30)
    private String telephone;

    private GenerateUserAccessTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.email = builder.email;
        this.expireTime = builder.expireTime;
        this.extraInfo = builder.extraInfo;
        this.foreignId = builder.foreignId;
        this.nick = builder.nick;
        this.telephone = builder.telephone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateUserAccessTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
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
    public Integer getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return foreignId
     */
    public String getForeignId() {
        return this.foreignId;
    }

    /**
     * @return nick
     */
    public String getNick() {
        return this.nick;
    }

    /**
     * @return telephone
     */
    public String getTelephone() {
        return this.telephone;
    }

    public static final class Builder extends Request.Builder<GenerateUserAccessTokenRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String email; 
        private Integer expireTime; 
        private String extraInfo; 
        private String foreignId; 
        private String nick; 
        private String telephone; 

        private Builder() {
            super();
        } 

        private Builder(GenerateUserAccessTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.email = request.email;
            this.expireTime = request.expireTime;
            this.extraInfo = request.extraInfo;
            this.foreignId = request.foreignId;
            this.nick = request.nick;
            this.telephone = request.telephone;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(Integer expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * ExtraInfo.
         */
        public Builder extraInfo(String extraInfo) {
            this.putQueryParameter("ExtraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * ForeignId.
         */
        public Builder foreignId(String foreignId) {
            this.putQueryParameter("ForeignId", foreignId);
            this.foreignId = foreignId;
            return this;
        }

        /**
         * Nick.
         */
        public Builder nick(String nick) {
            this.putQueryParameter("Nick", nick);
            this.nick = nick;
            return this;
        }

        /**
         * Telephone.
         */
        public Builder telephone(String telephone) {
            this.putQueryParameter("Telephone", telephone);
            this.telephone = telephone;
            return this;
        }

        @Override
        public GenerateUserAccessTokenRequest build() {
            return new GenerateUserAccessTokenRequest(this);
        } 

    } 

}
