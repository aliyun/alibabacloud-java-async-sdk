// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link CreateAgentRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentRequest</p>
 */
public class CreateAgentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String agentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentType")
    private String agentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 512)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireAfterSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 31536000, minimum = 1)
    private Integer expireAfterSeconds;

    private CreateAgentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentName = builder.agentName;
        this.agentType = builder.agentType;
        this.description = builder.description;
        this.expireAfterSeconds = builder.expireAfterSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentRequest create() {
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
     * @return agentType
     */
    public String getAgentType() {
        return this.agentType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return expireAfterSeconds
     */
    public Integer getExpireAfterSeconds() {
        return this.expireAfterSeconds;
    }

    public static final class Builder extends Request.Builder<CreateAgentRequest, Builder> {
        private String regionId; 
        private String agentName; 
        private String agentType; 
        private String description; 
        private Integer expireAfterSeconds; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentName = request.agentName;
            this.agentType = request.agentType;
            this.description = request.description;
            this.expireAfterSeconds = request.expireAfterSeconds;
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
         * <p>The agent name. The name must be unique within the same tenant. Maximum length: 128 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>order-analysis-agent</p>
         */
        public Builder agentName(String agentName) {
            this.putQueryParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * <p>The permission inheritance type of the agent, which specifies the permission source. Default value: HUMAN_BOUND.</p>
         * 
         * <strong>example:</strong>
         * <p>HUMAN_BOUND</p>
         */
        public Builder agentType(String agentType) {
            this.putQueryParameter("AgentType", agentType);
            this.agentType = agentType;
            return this;
        }

        /**
         * <p>The description of the agent. Maximum length: 512 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>An agent for querying and analyzing order data</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The validity period of the automatically issued API key, in seconds. Valid values: 1 to 31536000 (up to 1 year).</p>
         * 
         * <strong>example:</strong>
         * <p>2592000</p>
         */
        public Builder expireAfterSeconds(Integer expireAfterSeconds) {
            this.putQueryParameter("ExpireAfterSeconds", expireAfterSeconds);
            this.expireAfterSeconds = expireAfterSeconds;
            return this;
        }

        @Override
        public CreateAgentRequest build() {
            return new CreateAgentRequest(this);
        } 

    } 

}
