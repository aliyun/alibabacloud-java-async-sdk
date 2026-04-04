// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link CreateAppAssistantAgentRequest} extends {@link RequestModel}
 *
 * <p>CreateAppAssistantAgentRequest</p>
 */
public class CreateAppAssistantAgentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentName")
    private String agentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlatformType")
    private String platformType;

    private CreateAppAssistantAgentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentName = builder.agentName;
        this.bizId = builder.bizId;
        this.platformType = builder.platformType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppAssistantAgentRequest create() {
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
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return platformType
     */
    public String getPlatformType() {
        return this.platformType;
    }

    public static final class Builder extends Request.Builder<CreateAppAssistantAgentRequest, Builder> {
        private String regionId; 
        private String agentName; 
        private String bizId; 
        private String platformType; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppAssistantAgentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentName = request.agentName;
            this.bizId = request.bizId;
            this.platformType = request.platformType;
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
         * AgentName.
         */
        public Builder agentName(String agentName) {
            this.putQueryParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * PlatformType.
         */
        public Builder platformType(String platformType) {
            this.putQueryParameter("PlatformType", platformType);
            this.platformType = platformType;
            return this;
        }

        @Override
        public CreateAppAssistantAgentRequest build() {
            return new CreateAppAssistantAgentRequest(this);
        } 

    } 

}
