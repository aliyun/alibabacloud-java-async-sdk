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
         * <p>The capability type of the category. Valid values:</p>
         * <ul>
         * <li>FAQ: Frequently asked questions.</li>
         * <li>MRC: Document-based machine reading comprehension.</li>
         * </ul>
         * <p>Default value: FAQ.</p>
         * 
         * <strong>example:</strong>
         * <p>FAQ,MRC</p>
         */
        public Builder abilityType(String abilityType) {
            this.putQueryParameter("AbilityType", abilityType);
            this.abilityType = abilityType;
            return this;
        }

        /**
         * <p>The business space key. If this parameter is not specified, the default business space is accessed. You can obtain the key on the business management page of the Alibaba Cloud account.</p>
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
         * <p>The array of FAQ category IDs to associate with the chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;30000065789\&quot;]</p>
         */
        public Builder categoryIds(String categoryIds) {
            this.putBodyParameter("CategoryIds", categoryIds);
            this.categoryIds = categoryIds;
            return this;
        }

        /**
         * <p>The unique identifier of the chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-mp90s2lrk00050</p>
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
