// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateUserAccessTokenRequest} extends {@link RequestModel}
 *
 * <p>GenerateUserAccessTokenRequest</p>
 */
public class GenerateUserAccessTokenRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("ExpireTime")
    private Integer expireTime;

    @Query
    @NameInMap("ExtraInfo")
    private String extraInfo;

    @Query
    @NameInMap("ForeignId")
    private String foreignId;

    @Query
    @NameInMap("Nick")
    private String nick;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Telephone")
    private String telephone;

    private GenerateUserAccessTokenRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.email = builder.email;
        this.expireTime = builder.expireTime;
        this.extraInfo = builder.extraInfo;
        this.foreignId = builder.foreignId;
        this.nick = builder.nick;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return telephone
     */
    public String getTelephone() {
        return this.telephone;
    }

    public static final class Builder extends Request.Builder<GenerateUserAccessTokenRequest, Builder> {
        private String agentKey; 
        private String email; 
        private Integer expireTime; 
        private String extraInfo; 
        private String foreignId; 
        private String nick; 
        private String regionId; 
        private String telephone; 

        private Builder() {
            super();
        } 

        private Builder(GenerateUserAccessTokenRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.email = request.email;
            this.expireTime = request.expireTime;
            this.extraInfo = request.extraInfo;
            this.foreignId = request.foreignId;
            this.nick = request.nick;
            this.regionId = request.regionId;
            this.telephone = request.telephone;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
