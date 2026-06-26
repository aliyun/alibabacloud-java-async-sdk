// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link CreateResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceGroupRequest</p>
 */
public class CreateResourceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentType")
    private String agentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAliyunResourceGroup")
    private Boolean enableAliyunResourceGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsResourceGroupWithOfficeSite")
    private Long isResourceGroupWithOfficeSite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceClassification")
    private String resourceClassification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    private String resourceGroupName;

    private CreateResourceGroupRequest(Builder builder) {
        super(builder);
        this.agentType = builder.agentType;
        this.businessChannel = builder.businessChannel;
        this.enableAliyunResourceGroup = builder.enableAliyunResourceGroup;
        this.isResourceGroupWithOfficeSite = builder.isResourceGroupWithOfficeSite;
        this.platform = builder.platform;
        this.resourceClassification = builder.resourceClassification;
        this.resourceGroupName = builder.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentType
     */
    public String getAgentType() {
        return this.agentType;
    }

    /**
     * @return businessChannel
     */
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    /**
     * @return enableAliyunResourceGroup
     */
    public Boolean getEnableAliyunResourceGroup() {
        return this.enableAliyunResourceGroup;
    }

    /**
     * @return isResourceGroupWithOfficeSite
     */
    public Long getIsResourceGroupWithOfficeSite() {
        return this.isResourceGroupWithOfficeSite;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return resourceClassification
     */
    public String getResourceClassification() {
        return this.resourceClassification;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public static final class Builder extends Request.Builder<CreateResourceGroupRequest, Builder> {
        private String agentType; 
        private String businessChannel; 
        private Boolean enableAliyunResourceGroup; 
        private Long isResourceGroupWithOfficeSite; 
        private String platform; 
        private String resourceClassification; 
        private String resourceGroupName; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceGroupRequest request) {
            super(request);
            this.agentType = request.agentType;
            this.businessChannel = request.businessChannel;
            this.enableAliyunResourceGroup = request.enableAliyunResourceGroup;
            this.isResourceGroupWithOfficeSite = request.isResourceGroupWithOfficeSite;
            this.platform = request.platform;
            this.resourceClassification = request.resourceClassification;
            this.resourceGroupName = request.resourceGroupName;
        } 

        /**
         * AgentType.
         */
        public Builder agentType(String agentType) {
            this.putQueryParameter("AgentType", agentType);
            this.agentType = agentType;
            return this;
        }

        /**
         * BusinessChannel.
         */
        public Builder businessChannel(String businessChannel) {
            this.putQueryParameter("BusinessChannel", businessChannel);
            this.businessChannel = businessChannel;
            return this;
        }

        /**
         * EnableAliyunResourceGroup.
         */
        public Builder enableAliyunResourceGroup(Boolean enableAliyunResourceGroup) {
            this.putQueryParameter("EnableAliyunResourceGroup", enableAliyunResourceGroup);
            this.enableAliyunResourceGroup = enableAliyunResourceGroup;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isResourceGroupWithOfficeSite(Long isResourceGroupWithOfficeSite) {
            this.putQueryParameter("IsResourceGroupWithOfficeSite", isResourceGroupWithOfficeSite);
            this.isResourceGroupWithOfficeSite = isResourceGroupWithOfficeSite;
            return this;
        }

        /**
         * <blockquote>
         * <p> Set the value to AliyunConsole.</p>
         * </blockquote>
         * <ul>
         * <li>This parameter is not publicly available in other platforms.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunConsole</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * ResourceClassification.
         */
        public Builder resourceClassification(String resourceClassification) {
            this.putQueryParameter("ResourceClassification", resourceClassification);
            this.resourceClassification = resourceClassification;
            return this;
        }

        /**
         * <p>The name of the resource group.</p>
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putQueryParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        @Override
        public CreateResourceGroupRequest build() {
            return new CreateResourceGroupRequest(this);
        } 

    } 

}
