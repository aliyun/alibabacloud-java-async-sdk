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
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Body
    @NameInMap("CategoryIds")
    private String categoryIds;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private LinkInstanceCategoryRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.categoryIds = builder.categoryIds;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<LinkInstanceCategoryRequest, Builder> {
        private String agentKey; 
        private String categoryIds; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(LinkInstanceCategoryRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.categoryIds = request.categoryIds;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * ????????????key,???????????????????????????????????????key???????????????????????????????????????
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * ????????????Id
         */
        public Builder categoryIds(String categoryIds) {
            this.putBodyParameter("CategoryIds", categoryIds);
            this.categoryIds = categoryIds;
            return this;
        }

        /**
         * ?????????????????????
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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

        @Override
        public LinkInstanceCategoryRequest build() {
            return new LinkInstanceCategoryRequest(this);
        } 

    } 

}
