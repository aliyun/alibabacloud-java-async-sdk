// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ModifyDesktopSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopSpecRequest</p>
 */
public class ModifyDesktopSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private String desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResellerOwnerUid")
    private Long resellerOwnerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceSpecs")
    private java.util.List<ResourceSpecs> resourceSpecs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RootDiskSizeGib")
    @com.aliyun.core.annotation.Validation(maximum = 32768)
    private Integer rootDiskSizeGib;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDiskPerformanceLevel")
    private String userDiskPerformanceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDiskSizeGib")
    @com.aliyun.core.annotation.Validation(maximum = 65536)
    private Integer userDiskSizeGib;

    private ModifyDesktopSpecRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.desktopId = builder.desktopId;
        this.desktopType = builder.desktopType;
        this.promotionId = builder.promotionId;
        this.regionId = builder.regionId;
        this.resellerOwnerUid = builder.resellerOwnerUid;
        this.resourceSpecs = builder.resourceSpecs;
        this.resourceType = builder.resourceType;
        this.rootDiskSizeGib = builder.rootDiskSizeGib;
        this.userDiskPerformanceLevel = builder.userDiskPerformanceLevel;
        this.userDiskSizeGib = builder.userDiskSizeGib;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopSpecRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return desktopType
     */
    public String getDesktopType() {
        return this.desktopType;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resellerOwnerUid
     */
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    /**
     * @return resourceSpecs
     */
    public java.util.List<ResourceSpecs> getResourceSpecs() {
        return this.resourceSpecs;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return rootDiskSizeGib
     */
    public Integer getRootDiskSizeGib() {
        return this.rootDiskSizeGib;
    }

    /**
     * @return userDiskPerformanceLevel
     */
    public String getUserDiskPerformanceLevel() {
        return this.userDiskPerformanceLevel;
    }

    /**
     * @return userDiskSizeGib
     */
    public Integer getUserDiskSizeGib() {
        return this.userDiskSizeGib;
    }

    public static final class Builder extends Request.Builder<ModifyDesktopSpecRequest, Builder> {
        private Boolean autoPay; 
        private String desktopId; 
        private String desktopType; 
        private String promotionId; 
        private String regionId; 
        private Long resellerOwnerUid; 
        private java.util.List<ResourceSpecs> resourceSpecs; 
        private String resourceType; 
        private Integer rootDiskSizeGib; 
        private String userDiskPerformanceLevel; 
        private Integer userDiskSizeGib; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesktopSpecRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.desktopId = request.desktopId;
            this.desktopType = request.desktopType;
            this.promotionId = request.promotionId;
            this.regionId = request.regionId;
            this.resellerOwnerUid = request.resellerOwnerUid;
            this.resourceSpecs = request.resourceSpecs;
            this.resourceType = request.resourceType;
            this.rootDiskSizeGib = request.rootDiskSizeGib;
            this.userDiskPerformanceLevel = request.userDiskPerformanceLevel;
            this.userDiskSizeGib = request.userDiskSizeGib;
        } 

        /**
         * <p>Specifies whether to enable automatic payment.</p>
         * <p>Default value: true. Valid values:</p>
         * <ul>
         * <li>true: Automatic payment is enabled. Make sure that your Alibaba Cloud account balance is sufficient. Otherwise, abnormal orders may be generated.</li>
         * <li>false: Only an order is generated. Automatic payment is not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The cloud computer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-4543qyik164a4****</p>
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The target instance type. You can call <a href="https://help.aliyun.com/document_detail/188882.html">DescribeDesktopTypes</a> to query the instance types supported by cloud computers.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eds.general.2c8g</p>
         */
        public Builder desktopType(String desktopType) {
            this.putQueryParameter("DesktopType", desktopType);
            this.desktopType = desktopType;
            return this;
        }

        /**
         * <p>The promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>500033080110596</p>
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The user ID of the resource ownership in the reseller pattern. This parameter is not required in the non-reseller pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>1422724566551XXX</p>
         */
        public Builder resellerOwnerUid(Long resellerOwnerUid) {
            this.putQueryParameter("ResellerOwnerUid", resellerOwnerUid);
            this.resellerOwnerUid = resellerOwnerUid;
            return this;
        }

        /**
         * <p>The resource specification templates.</p>
         */
        public Builder resourceSpecs(java.util.List<ResourceSpecs> resourceSpecs) {
            this.putQueryParameter("ResourceSpecs", resourceSpecs);
            this.resourceSpecs = resourceSpecs;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * <blockquote>
         * <p>This parameter is not required for non-subscription cloud computers.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DesktopMonthPackage</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The system cloud disk size after the change. Unit: GiB. Valid values: 80 to 500. The value must be a multiple of 10.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder rootDiskSizeGib(Integer rootDiskSizeGib) {
            this.putQueryParameter("RootDiskSizeGib", rootDiskSizeGib);
            this.rootDiskSizeGib = rootDiskSizeGib;
            return this;
        }

        /**
         * <p>The performance level (PL) of the data cloud disk. Default value: PL0.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PL0</li>
         * <li>PL1</li>
         * <li>PL2</li>
         * <li>PL3</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        public Builder userDiskPerformanceLevel(String userDiskPerformanceLevel) {
            this.putQueryParameter("UserDiskPerformanceLevel", userDiskPerformanceLevel);
            this.userDiskPerformanceLevel = userDiskPerformanceLevel;
            return this;
        }

        /**
         * <p>The data cloud disk size after the change. Unit: GiB.</p>
         * <ul>
         * <li>For non-graphics cloud computers, valid values: 20 to 1020. The value must be a multiple of 10.</li>
         * <li>For graphics cloud computers, valid values: 40 to 1020. The value must be a multiple of 10.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder userDiskSizeGib(Integer userDiskSizeGib) {
            this.putQueryParameter("UserDiskSizeGib", userDiskSizeGib);
            this.userDiskSizeGib = userDiskSizeGib;
            return this;
        }

        @Override
        public ModifyDesktopSpecRequest build() {
            return new ModifyDesktopSpecRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyDesktopSpecRequest} extends {@link TeaModel}
     *
     * <p>ModifyDesktopSpecRequest</p>
     */
    public static class ResourceSpecs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("RootDiskSizeGib")
        private Integer rootDiskSizeGib;

        @com.aliyun.core.annotation.NameInMap("UserDiskSizeGib")
        private Integer userDiskSizeGib;

        private ResourceSpecs(Builder builder) {
            this.desktopId = builder.desktopId;
            this.rootDiskSizeGib = builder.rootDiskSizeGib;
            this.userDiskSizeGib = builder.userDiskSizeGib;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSpecs create() {
            return builder().build();
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return rootDiskSizeGib
         */
        public Integer getRootDiskSizeGib() {
            return this.rootDiskSizeGib;
        }

        /**
         * @return userDiskSizeGib
         */
        public Integer getUserDiskSizeGib() {
            return this.userDiskSizeGib;
        }

        public static final class Builder {
            private String desktopId; 
            private Integer rootDiskSizeGib; 
            private Integer userDiskSizeGib; 

            private Builder() {
            } 

            private Builder(ResourceSpecs model) {
                this.desktopId = model.desktopId;
                this.rootDiskSizeGib = model.rootDiskSizeGib;
                this.userDiskSizeGib = model.userDiskSizeGib;
            } 

            /**
             * <p>The cloud computer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-4543qyik164a4****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The target system cloud disk size. Valid values: 80 to 500 GiB. The value must be a multiple of 10.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder rootDiskSizeGib(Integer rootDiskSizeGib) {
                this.rootDiskSizeGib = rootDiskSizeGib;
                return this;
            }

            /**
             * <p>The target data cloud disk size. Valid values: 80 to 500 GiB. The value must be a multiple of 10.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder userDiskSizeGib(Integer userDiskSizeGib) {
                this.userDiskSizeGib = userDiskSizeGib;
                return this;
            }

            public ResourceSpecs build() {
                return new ResourceSpecs(this);
            } 

        } 

    }
}
