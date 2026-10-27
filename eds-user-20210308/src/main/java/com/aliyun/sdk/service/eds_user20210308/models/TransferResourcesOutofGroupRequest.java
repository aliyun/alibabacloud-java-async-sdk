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
 * {@link TransferResourcesOutofGroupRequest} extends {@link RequestModel}
 *
 * <p>TransferResourcesOutofGroupRequest</p>
 */
public class TransferResourcesOutofGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppRuleId")
    private String appRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<Resources> resources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetResourceGroupId")
    private String targetResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimerId")
    private String timerId;

    private TransferResourcesOutofGroupRequest(Builder builder) {
        super(builder);
        this.appRuleId = builder.appRuleId;
        this.businessChannel = builder.businessChannel;
        this.platform = builder.platform;
        this.policyId = builder.policyId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resources = builder.resources;
        this.targetResourceGroupId = builder.targetResourceGroupId;
        this.timerId = builder.timerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferResourcesOutofGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appRuleId
     */
    public String getAppRuleId() {
        return this.appRuleId;
    }

    /**
     * @return businessChannel
     */
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resources
     */
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    /**
     * @return targetResourceGroupId
     */
    public String getTargetResourceGroupId() {
        return this.targetResourceGroupId;
    }

    /**
     * @return timerId
     */
    public String getTimerId() {
        return this.timerId;
    }

    public static final class Builder extends Request.Builder<TransferResourcesOutofGroupRequest, Builder> {
        private String appRuleId; 
        private String businessChannel; 
        private String platform; 
        private String policyId; 
        private String resourceGroupId; 
        private java.util.List<Resources> resources; 
        private String targetResourceGroupId; 
        private String timerId; 

        private Builder() {
            super();
        } 

        private Builder(TransferResourcesOutofGroupRequest request) {
            super(request);
            this.appRuleId = request.appRuleId;
            this.businessChannel = request.businessChannel;
            this.platform = request.platform;
            this.policyId = request.policyId;
            this.resourceGroupId = request.resourceGroupId;
            this.resources = request.resources;
            this.targetResourceGroupId = request.targetResourceGroupId;
            this.timerId = request.timerId;
        } 

        /**
         * <p>The software blacklists and whitelists rule ID to associate with the resources after they are moved out of the resource group. This parameter is used only for pure move-out operations and cannot be set together with TargetResourceGroupId. If this parameter is left empty, no rule is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>bwr-47wdwfe5x3ql7qwf4</p>
         */
        public Builder appRuleId(String appRuleId) {
            this.putQueryParameter("AppRuleId", appRuleId);
            this.appRuleId = appRuleId;
            return this;
        }

        /**
         * <p>The channel.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE</p>
         */
        public Builder businessChannel(String businessChannel) {
            this.putQueryParameter("BusinessChannel", businessChannel);
            this.businessChannel = businessChannel;
            return this;
        }

        /**
         * <blockquote>
         * <p>Fixed value: AliyunConsole.</p>
         * <ul>
         * <li>For Wuying Enterprise Edition, set this parameter to AliyunConsole. Other platforms are not publicly available.</li>
         * </ul>
         * </blockquote>
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
         * <p>The policy ID to associate with the resources after they are moved out of the resource group. This parameter is used only for pure move-out operations and cannot be specified together with TargetResourceGroupId. If this parameter is left empty, the system default behavior is used.</p>
         * 
         * <strong>example:</strong>
         * <p>system-all-enabled-policy</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-66konqltcpx43****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The list of resources.</p>
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * <p>The ID of the target resource group to which you want to move the resources.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-hcjo6dugpo1****</p>
         */
        public Builder targetResourceGroupId(String targetResourceGroupId) {
            this.putQueryParameter("TargetResourceGroupId", targetResourceGroupId);
            this.targetResourceGroupId = targetResourceGroupId;
            return this;
        }

        /**
         * <p>The scheduled task ID to associate with the resources after they are moved out of the resource group. This parameter is used only for pure move-out operations and cannot be specified together with TargetResourceGroupId. If this parameter is left empty, no scheduled task is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>ccg-0bf5d87dtipve4aqt</p>
         */
        public Builder timerId(String timerId) {
            this.putQueryParameter("TimerId", timerId);
            this.timerId = timerId;
            return this;
        }

        @Override
        public TransferResourcesOutofGroupRequest build() {
            return new TransferResourcesOutofGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link TransferResourcesOutofGroupRequest} extends {@link TeaModel}
     *
     * <p>TransferResourcesOutofGroupRequest</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private Resources(Builder builder) {
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String regionId; 
            private String resourceId; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(Resources model) {
                this.regionId = model.regionId;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The region ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-1shc5sk0vo****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>DESKTOP</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
