// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link AllocateCostCenterResourceRequest} extends {@link RequestModel}
 *
 * <p>AllocateCostCenterResourceRequest</p>
 */
public class AllocateCostCenterResourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FromCostCenterId")
    private Long fromCostCenterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FromOwnerAccountId")
    private Long fromOwnerAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceInstanceList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ResourceInstanceList> resourceInstanceList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ToCostCenterId")
    private Long toCostCenterId;

    private AllocateCostCenterResourceRequest(Builder builder) {
        super(builder);
        this.fromCostCenterId = builder.fromCostCenterId;
        this.fromOwnerAccountId = builder.fromOwnerAccountId;
        this.nbid = builder.nbid;
        this.resourceInstanceList = builder.resourceInstanceList;
        this.toCostCenterId = builder.toCostCenterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateCostCenterResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fromCostCenterId
     */
    public Long getFromCostCenterId() {
        return this.fromCostCenterId;
    }

    /**
     * @return fromOwnerAccountId
     */
    public Long getFromOwnerAccountId() {
        return this.fromOwnerAccountId;
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    /**
     * @return resourceInstanceList
     */
    public java.util.List<ResourceInstanceList> getResourceInstanceList() {
        return this.resourceInstanceList;
    }

    /**
     * @return toCostCenterId
     */
    public Long getToCostCenterId() {
        return this.toCostCenterId;
    }

    public static final class Builder extends Request.Builder<AllocateCostCenterResourceRequest, Builder> {
        private Long fromCostCenterId; 
        private Long fromOwnerAccountId; 
        private String nbid; 
        private java.util.List<ResourceInstanceList> resourceInstanceList; 
        private Long toCostCenterId; 

        private Builder() {
            super();
        } 

        private Builder(AllocateCostCenterResourceRequest request) {
            super(request);
            this.fromCostCenterId = request.fromCostCenterId;
            this.fromOwnerAccountId = request.fromOwnerAccountId;
            this.nbid = request.nbid;
            this.resourceInstanceList = request.resourceInstanceList;
            this.toCostCenterId = request.toCostCenterId;
        } 

        /**
         * FromCostCenterId.
         */
        public Builder fromCostCenterId(Long fromCostCenterId) {
            this.putBodyParameter("FromCostCenterId", fromCostCenterId);
            this.fromCostCenterId = fromCostCenterId;
            return this;
        }

        /**
         * FromOwnerAccountId.
         */
        public Builder fromOwnerAccountId(Long fromOwnerAccountId) {
            this.putBodyParameter("FromOwnerAccountId", fromOwnerAccountId);
            this.fromOwnerAccountId = fromOwnerAccountId;
            return this;
        }

        /**
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder resourceInstanceList(java.util.List<ResourceInstanceList> resourceInstanceList) {
            String resourceInstanceListShrink = shrink(resourceInstanceList, "ResourceInstanceList", "json");
            this.putBodyParameter("ResourceInstanceList", resourceInstanceListShrink);
            this.resourceInstanceList = resourceInstanceList;
            return this;
        }

        /**
         * ToCostCenterId.
         */
        public Builder toCostCenterId(Long toCostCenterId) {
            this.putBodyParameter("ToCostCenterId", toCostCenterId);
            this.toCostCenterId = toCostCenterId;
            return this;
        }

        @Override
        public AllocateCostCenterResourceRequest build() {
            return new AllocateCostCenterResourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link AllocateCostCenterResourceRequest} extends {@link TeaModel}
     *
     * <p>AllocateCostCenterResourceRequest</p>
     */
    public static class ResourceInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApportionCode")
        private String apportionCode;

        @com.aliyun.core.annotation.NameInMap("ApportionName")
        private String apportionName;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CommodityName")
        private String commodityName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PipCode")
        private String pipCode;

        @com.aliyun.core.annotation.NameInMap("RelatedResources")
        private String relatedResources;

        @com.aliyun.core.annotation.NameInMap("ResourceGroup")
        private String resourceGroup;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceNick")
        private String resourceNick;

        @com.aliyun.core.annotation.NameInMap("ResourceSource")
        private String resourceSource;

        @com.aliyun.core.annotation.NameInMap("ResourceStatus")
        private String resourceStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceTag")
        private String resourceTag;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("ResourceUserId")
        private Long resourceUserId;

        @com.aliyun.core.annotation.NameInMap("ResourceUserName")
        private String resourceUserName;

        private ResourceInstanceList(Builder builder) {
            this.apportionCode = builder.apportionCode;
            this.apportionName = builder.apportionName;
            this.commodityCode = builder.commodityCode;
            this.commodityName = builder.commodityName;
            this.instanceId = builder.instanceId;
            this.pipCode = builder.pipCode;
            this.relatedResources = builder.relatedResources;
            this.resourceGroup = builder.resourceGroup;
            this.resourceId = builder.resourceId;
            this.resourceNick = builder.resourceNick;
            this.resourceSource = builder.resourceSource;
            this.resourceStatus = builder.resourceStatus;
            this.resourceTag = builder.resourceTag;
            this.resourceType = builder.resourceType;
            this.resourceUserId = builder.resourceUserId;
            this.resourceUserName = builder.resourceUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceInstanceList create() {
            return builder().build();
        }

        /**
         * @return apportionCode
         */
        public String getApportionCode() {
            return this.apportionCode;
        }

        /**
         * @return apportionName
         */
        public String getApportionName() {
            return this.apportionName;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityName
         */
        public String getCommodityName() {
            return this.commodityName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return pipCode
         */
        public String getPipCode() {
            return this.pipCode;
        }

        /**
         * @return relatedResources
         */
        public String getRelatedResources() {
            return this.relatedResources;
        }

        /**
         * @return resourceGroup
         */
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceNick
         */
        public String getResourceNick() {
            return this.resourceNick;
        }

        /**
         * @return resourceSource
         */
        public String getResourceSource() {
            return this.resourceSource;
        }

        /**
         * @return resourceStatus
         */
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        /**
         * @return resourceTag
         */
        public String getResourceTag() {
            return this.resourceTag;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return resourceUserId
         */
        public Long getResourceUserId() {
            return this.resourceUserId;
        }

        /**
         * @return resourceUserName
         */
        public String getResourceUserName() {
            return this.resourceUserName;
        }

        public static final class Builder {
            private String apportionCode; 
            private String apportionName; 
            private String commodityCode; 
            private String commodityName; 
            private String instanceId; 
            private String pipCode; 
            private String relatedResources; 
            private String resourceGroup; 
            private String resourceId; 
            private String resourceNick; 
            private String resourceSource; 
            private String resourceStatus; 
            private String resourceTag; 
            private String resourceType; 
            private Long resourceUserId; 
            private String resourceUserName; 

            private Builder() {
            } 

            private Builder(ResourceInstanceList model) {
                this.apportionCode = model.apportionCode;
                this.apportionName = model.apportionName;
                this.commodityCode = model.commodityCode;
                this.commodityName = model.commodityName;
                this.instanceId = model.instanceId;
                this.pipCode = model.pipCode;
                this.relatedResources = model.relatedResources;
                this.resourceGroup = model.resourceGroup;
                this.resourceId = model.resourceId;
                this.resourceNick = model.resourceNick;
                this.resourceSource = model.resourceSource;
                this.resourceStatus = model.resourceStatus;
                this.resourceTag = model.resourceTag;
                this.resourceType = model.resourceType;
                this.resourceUserId = model.resourceUserId;
                this.resourceUserName = model.resourceUserName;
            } 

            /**
             * ApportionCode.
             */
            public Builder apportionCode(String apportionCode) {
                this.apportionCode = apportionCode;
                return this;
            }

            /**
             * ApportionName.
             */
            public Builder apportionName(String apportionName) {
                this.apportionName = apportionName;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * CommodityName.
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * PipCode.
             */
            public Builder pipCode(String pipCode) {
                this.pipCode = pipCode;
                return this;
            }

            /**
             * RelatedResources.
             */
            public Builder relatedResources(String relatedResources) {
                this.relatedResources = relatedResources;
                return this;
            }

            /**
             * ResourceGroup.
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceNick.
             */
            public Builder resourceNick(String resourceNick) {
                this.resourceNick = resourceNick;
                return this;
            }

            /**
             * ResourceSource.
             */
            public Builder resourceSource(String resourceSource) {
                this.resourceSource = resourceSource;
                return this;
            }

            /**
             * ResourceStatus.
             */
            public Builder resourceStatus(String resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * ResourceTag.
             */
            public Builder resourceTag(String resourceTag) {
                this.resourceTag = resourceTag;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * ResourceUserId.
             */
            public Builder resourceUserId(Long resourceUserId) {
                this.resourceUserId = resourceUserId;
                return this;
            }

            /**
             * ResourceUserName.
             */
            public Builder resourceUserName(String resourceUserName) {
                this.resourceUserName = resourceUserName;
                return this;
            }

            public ResourceInstanceList build() {
                return new ResourceInstanceList(this);
            } 

        } 

    }
}
