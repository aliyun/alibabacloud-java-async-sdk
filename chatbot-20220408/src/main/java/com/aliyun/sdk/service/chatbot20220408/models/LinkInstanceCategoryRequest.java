// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LinkInstanceCategoryRequest} extends {@link RequestModel}
 *
 * <p>LinkInstanceCategoryRequest</p>
 */
public class LinkInstanceCategoryRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Body
    @NameInMap("CategoryIds")
    private String categoryIds;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private LinkInstanceCategoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
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
        private String agentKey; 
        private String categoryIds; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(LinkInstanceCategoryRequest request) {
            super(request);
            this.regionId = request.regionId;
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
