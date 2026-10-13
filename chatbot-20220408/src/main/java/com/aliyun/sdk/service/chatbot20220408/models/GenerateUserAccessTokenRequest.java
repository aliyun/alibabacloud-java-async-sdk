// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    @com.aliyun.core.annotation.Validation(maximum = 3600)
    private Integer expireTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private String extraInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ForeignId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String foreignId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Nick")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nick;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Telephone")
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
         * <p>The key of the business space. If you do not specify this parameter, the default business space is accessed. You can obtain the key value on the business management page of the primary account.</p>
         * 
         * <strong>example:</strong>
         * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
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
            this.putBodyParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>Reserved parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder expireTime(Integer expireTime) {
            this.putBodyParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The additional information in JSON string format.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;xx&quot;: 123,
         *     &quot;yy&quot;: 22332,
         *     &quot;customerNameCard&quot;: [
         *         {
         *             &quot;key&quot;: &quot;Name&quot;,
         *             &quot;value&quot;: &quot;John&quot;
         *         },
         *         {
         *             &quot;key&quot;: &quot;Level&quot;,
         *             &quot;value&quot;: &quot;v2&quot;
         *         },
         *         {
         *             &quot;key&quot;: &quot;Contact&quot;,
         *             &quot;value&quot;: &quot;123&quot;
         *         }
         *     ]
         * }</p>
         */
        public Builder extraInfo(String extraInfo) {
            this.putBodyParameter("ExtraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * <p>The external user ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8882022040000000171</p>
         */
        public Builder foreignId(String foreignId) {
            this.putBodyParameter("ForeignId", foreignId);
            this.foreignId = foreignId;
            return this;
        }

        /**
         * <p>The nickname of the visitor.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        public Builder nick(String nick) {
            this.putBodyParameter("Nick", nick);
            this.nick = nick;
            return this;
        }

        /**
         * Telephone.
         */
        public Builder telephone(String telephone) {
            this.putBodyParameter("Telephone", telephone);
            this.telephone = telephone;
            return this;
        }

        @Override
        public GenerateUserAccessTokenRequest build() {
            return new GenerateUserAccessTokenRequest(this);
        } 

    } 

}
