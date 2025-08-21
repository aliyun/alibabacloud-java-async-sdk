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
 * {@link LinkInstanceCategoryRequest} extends {@link RequestModel}
 *
 * <p>LinkInstanceCategoryRequest</p>
 */
public class LinkInstanceCategoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AbilityType")
    private String abilityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryIds")
    private String categoryIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private LinkInstanceCategoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.abilityType = builder.abilityType;
        this.agentKey = builder.agentKey;
        this.categoryIds = builder.categoryIds;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LinkInstanceCategoryRequest create() {
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
     * @return abilityType
     */
    public String getAbilityType() {
        return this.abilityType;
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return categoryIds
     */
    public String getCategoryIds() {
        return this.categoryIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<LinkInstanceCategoryRequest, Builder> {
        private String regionId; 
        private String abilityType; 
        private String agentKey; 
        private String categoryIds; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(LinkInstanceCategoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.abilityType = request.abilityType;
            this.agentKey = request.agentKey;
            this.categoryIds = request.categoryIds;
            this.instanceId = request.instanceId;
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
         * AbilityType.
         */
        public Builder abilityType(String abilityType) {
            this.putQueryParameter("AbilityType", abilityType);
            this.abilityType = abilityType;
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
         * CategoryIds.
         */
        public Builder categoryIds(String categoryIds) {
            this.putBodyParameter("CategoryIds", categoryIds);
            this.categoryIds = categoryIds;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public LinkInstanceCategoryRequest build() {
            return new LinkInstanceCategoryRequest(this);
        } 

    } 

}
