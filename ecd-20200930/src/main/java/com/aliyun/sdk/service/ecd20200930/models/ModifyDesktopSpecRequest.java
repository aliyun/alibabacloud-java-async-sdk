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
         * <p>Specifies whether to enable the auto-payment feature.</p>
         * <p>Default value: true. Valid values:</p>
         * <ul>
         * <li><p>true: enables the auto-payment feature.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <p>Make sure that you have sufficient balance in your Alibaba Cloud account. Otherwise, an exception occurs on your order.</p>
         * <!-- -->
         * </li>
         * <li><p>false: disables the auto-payment feature. In this case, an order is generated, and no payment is automatically made.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <p>You can log on to the Elastic Desktop Service console and complete the payment based on the order ID on the Orders page.</p>
         * <!-- --></li>
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
         * <p>The ID of a cloud computer.</p>
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
         * <p>The destination instance type. You can call the <a href="https://help.aliyun.com/document_detail/188882.html">DescribeDesktopTypes</a> operation to query the instance types supported by cloud computers.</p>
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
         * <p>The ID of the promotional activity.</p>
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
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * ResellerOwnerUid.
         */
        public Builder resellerOwnerUid(Long resellerOwnerUid) {
            this.putQueryParameter("ResellerOwnerUid", resellerOwnerUid);
            this.resellerOwnerUid = resellerOwnerUid;
            return this;
        }

        /**
         * <p>The array of resource specification templates.</p>
         */
        public Builder resourceSpecs(java.util.List<ResourceSpecs> resourceSpecs) {
            this.putQueryParameter("ResourceSpecs", resourceSpecs);
            this.resourceSpecs = resourceSpecs;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * <blockquote>
         * <p>This parameter is optional for non-subscribed cloud computers.</p>
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
         * <p>The size of the new system disk. Unit: GiB. Valid values: 80 to 500 GiB. The value must be a multiple of 10.</p>
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
         * <p>The performance level (PL) of the data disk. Default value: PL0.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>PL1</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>PL0</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>PL3</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>PL2</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
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
         * <p>The destination data disk size. Unit: GiB.</p>
         * <ul>
         * <li>The data disk size of a non-graphical cloud computer ranges from 20 to 1020 GiB and must be a multiple of 10.</li>
         * <li>The data disk size of a graphical cloud computer ranges from 40 to 1020 GiB and must be a multiple of 10.</li>
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
             * <p>The ID of the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-4543qyik164a4****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The target size of the system disk. Valid values: 80-500 GiB. The value must be a multiple of 10.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder rootDiskSizeGib(Integer rootDiskSizeGib) {
                this.rootDiskSizeGib = rootDiskSizeGib;
                return this;
            }

            /**
             * <p>The target size of the data disk. Valid values: 80-500 GiB. The value must be a multiple of 10.</p>
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
