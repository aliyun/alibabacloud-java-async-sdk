// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitIMConnectRequest} extends {@link RequestModel}
 *
 * <p>InitIMConnectRequest</p>
 */
public class InitIMConnectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    @com.aliyun.core.annotation.Validation(required = true)
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAccessToken")
    private String userAccessToken;

    private InitIMConnectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.from = builder.from;
        this.userAccessToken = builder.userAccessToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitIMConnectRequest create() {
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
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return userAccessToken
     */
    public String getUserAccessToken() {
        return this.userAccessToken;
    }

    public static final class Builder extends Request.Builder<InitIMConnectRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String from; 
        private String userAccessToken; 

        private Builder() {
            super();
        } 

        private Builder(InitIMConnectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.from = request.from;
            this.userAccessToken = request.userAccessToken;
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
         * From.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * UserAccessToken.
         */
        public Builder userAccessToken(String userAccessToken) {
            this.putQueryParameter("UserAccessToken", userAccessToken);
            this.userAccessToken = userAccessToken;
            return this;
        }

        @Override
        public InitIMConnectRequest build() {
            return new InitIMConnectRequest(this);
        } 

    } 

}
