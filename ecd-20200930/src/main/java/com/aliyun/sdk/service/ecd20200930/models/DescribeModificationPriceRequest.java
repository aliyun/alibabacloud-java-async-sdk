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
 * {@link DescribeModificationPriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeModificationPriceRequest</p>
 */
public class DescribeModificationPriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    @com.aliyun.core.annotation.Validation(maximum = 3072, minimum = 2)
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

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
    @com.aliyun.core.annotation.NameInMap("RootDiskPerformanceLevel")
    private String rootDiskPerformanceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RootDiskSizeGib")
    @com.aliyun.core.annotation.Validation(maximum = 32768)
    private Integer rootDiskSizeGib;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDiskPerformanceLevel")
    private String userDiskPerformanceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDiskSizeGib")
    @com.aliyun.core.annotation.Validation(maximum = 32768)
    private Integer userDiskSizeGib;

    private DescribeModificationPriceRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.promotionId = builder.promotionId;
        this.regionId = builder.regionId;
        this.resellerOwnerUid = builder.resellerOwnerUid;
        this.resourceSpecs = builder.resourceSpecs;
        this.resourceType = builder.resourceType;
        this.rootDiskPerformanceLevel = builder.rootDiskPerformanceLevel;
        this.rootDiskSizeGib = builder.rootDiskSizeGib;
        this.userDiskPerformanceLevel = builder.userDiskPerformanceLevel;
        this.userDiskSizeGib = builder.userDiskSizeGib;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModificationPriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
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
     * @return rootDiskPerformanceLevel
     */
    public String getRootDiskPerformanceLevel() {
        return this.rootDiskPerformanceLevel;
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

    public static final class Builder extends Request.Builder<DescribeModificationPriceRequest, Builder> {
        private Integer bandwidth; 
        private String instanceId; 
        private String instanceType; 
        private String promotionId; 
        private String regionId; 
        private Long resellerOwnerUid; 
        private java.util.List<ResourceSpecs> resourceSpecs; 
        private String resourceType; 
        private String rootDiskPerformanceLevel; 
        private Integer rootDiskSizeGib; 
        private String userDiskPerformanceLevel; 
        private Integer userDiskSizeGib; 

        private Builder() {
            super();
        } 

        private Builder(DescribeModificationPriceRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.promotionId = request.promotionId;
            this.regionId = request.regionId;
            this.resellerOwnerUid = request.resellerOwnerUid;
            this.resourceSpecs = request.resourceSpecs;
            this.resourceType = request.resourceType;
            this.rootDiskPerformanceLevel = request.rootDiskPerformanceLevel;
            this.rootDiskSizeGib = request.rootDiskSizeGib;
            this.userDiskPerformanceLevel = request.userDiskPerformanceLevel;
            this.userDiskSizeGib = request.userDiskSizeGib;
        } 

        /**
         * <p>The peak Internet bandwidth. Unit: Mbit/s.</p>
         * <blockquote>
         * <p>If you use the pay-by-fixed-bandwidth billing method, valid values are 10 to 1000.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The instance ID. The value can be the ID of a monthly subscription (unlimited duration) cloud computer or the ID of a premium Internet bandwidth instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-0gfv2z3sf95zvt****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The resource specification.</p>
         * <ul>
         * <li><p>If ResourceType is set to Desktop, valid values include:</p>
         * <ul>
         * <li>ecd.basic.small</li>
         * <li>ecd.basic.large</li>
         * <li>ecd.advanced.large</li>
         * <li>ecd.advanced.xlarge</li>
         * <li>ecd.performance.2xlarge</li>
         * <li>ecd.graphics.xlarge</li>
         * <li>ecd.graphics.2xlarge</li>
         * <li>ecd.advanced.xlarge_s8d2</li>
         * <li>ecd.advanced.xlarge_s8d7</li>
         * <li>ecd.graphics.1g72c</li>
         * <li>eds.general.2c2g</li>
         * <li>eds.general.2c4g</li>
         * <li>eds.general.2c8g</li>
         * <li>eds.general.4c8g</li>
         * <li>eds.general.4c16g</li>
         * <li>eds.general.8c16g</li>
         * <li>eds.general.8c32g</li>
         * <li>eds.general.16c32g</li>
         * </ul>
         * </li>
         * <li><p>If ResourceType is set to NetworkPackage, you do not need to specify this parameter.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eds.enterprise_office.8c16g</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_for_blank</p>
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the list of regions supported by Elastic Desktop Service.</p>
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
         * <p>The resource ownership user ID in the reseller pattern. You do not need to specify this parameter in non-reseller pattern.</p>
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
         * <p>The list of resource specification templates.</p>
         */
        public Builder resourceSpecs(java.util.List<ResourceSpecs> resourceSpecs) {
            this.putQueryParameter("ResourceSpecs", resourceSpecs);
            this.resourceSpecs = resourceSpecs;
            return this;
        }

        /**
         * <p>The resource type. The required parameters vary based on the resource type for which you want to query the upgrade/downgrade price:</p>
         * <ul>
         * <li>If ResourceType is set to Desktop, you must specify the InstanceType, RootDiskSizeGib, and UserDiskSizeGib parameters.</li>
         * <li>If ResourceType is set to NetworkPackage, you must specify the Bandwidth parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Desktop</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The performance level (PL) of the system cloud disk. You can set the disk performance level when the cloud computer specification in Settings is Graphics or High Frequency. For more information about the differences between disk performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>. standard SSD and ESSD have different performance levels.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        public Builder rootDiskPerformanceLevel(String rootDiskPerformanceLevel) {
            this.putQueryParameter("RootDiskPerformanceLevel", rootDiskPerformanceLevel);
            this.rootDiskPerformanceLevel = rootDiskPerformanceLevel;
            return this;
        }

        /**
         * <p>The size of the system cloud disk. Unit: GiB.</p>
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
         * <p>The performance level (PL) of the data cloud disk. You can set the disk performance level when the cloud computer specification in Settings is Graphics or High Frequency. For more information about the differences between disk performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>. standard SSD and ESSD have different performance levels.</p>
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
         * <p>The size of the data cloud disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder userDiskSizeGib(Integer userDiskSizeGib) {
            this.putQueryParameter("UserDiskSizeGib", userDiskSizeGib);
            this.userDiskSizeGib = userDiskSizeGib;
            return this;
        }

        @Override
        public DescribeModificationPriceRequest build() {
            return new DescribeModificationPriceRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeModificationPriceRequest} extends {@link TeaModel}
     *
     * <p>DescribeModificationPriceRequest</p>
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
             * <p>ecd-6ghhzivgmnzgeyXXX</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The size of the system cloud disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder rootDiskSizeGib(Integer rootDiskSizeGib) {
                this.rootDiskSizeGib = rootDiskSizeGib;
                return this;
            }

            /**
             * <p>The size of the data cloud disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
