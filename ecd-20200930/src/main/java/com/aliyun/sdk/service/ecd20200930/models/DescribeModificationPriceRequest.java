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
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 2)
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

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
    @com.aliyun.core.annotation.NameInMap("UserDiskSizeGib")
    @com.aliyun.core.annotation.Validation(maximum = 32768)
    private Integer userDiskSizeGib;

    private DescribeModificationPriceRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.regionId = builder.regionId;
        this.resellerOwnerUid = builder.resellerOwnerUid;
        this.resourceSpecs = builder.resourceSpecs;
        this.resourceType = builder.resourceType;
        this.rootDiskSizeGib = builder.rootDiskSizeGib;
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
     * @return userDiskSizeGib
     */
    public Integer getUserDiskSizeGib() {
        return this.userDiskSizeGib;
    }

    public static final class Builder extends Request.Builder<DescribeModificationPriceRequest, Builder> {
        private Integer bandwidth; 
        private String instanceId; 
        private String instanceType; 
        private String regionId; 
        private Long resellerOwnerUid; 
        private java.util.List<ResourceSpecs> resourceSpecs; 
        private String resourceType; 
        private Integer rootDiskSizeGib; 
        private Integer userDiskSizeGib; 

        private Builder() {
            super();
        } 

        private Builder(DescribeModificationPriceRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.regionId = request.regionId;
            this.resellerOwnerUid = request.resellerOwnerUid;
            this.resourceSpecs = request.resourceSpecs;
            this.resourceType = request.resourceType;
            this.rootDiskSizeGib = request.rootDiskSizeGib;
            this.userDiskSizeGib = request.userDiskSizeGib;
        } 

        /**
         * <p>The maximum public bandwidth. Unit: Mbit/s.</p>
         * <blockquote>
         * <p> Valid values when PayByTraffic is set to PayByBandwidth: 10 to 1000.</p>
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
         * <p>The ID of either the monthly subscription cloud computer with unlimited hours or the premium bandwidth plan.</p>
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
         * <p>The specifications.</p>
         * <ul>
         * <li><p>Valid values when you set <code>ResourceType</code> to <code>Desktop</code>:</p>
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
         * <li><p>You can skip this parameter if <code>ResourceType</code> is set to <code>NetworkPackage</code>.</p>
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
         * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
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
         * ResourceSpecs.
         */
        public Builder resourceSpecs(java.util.List<ResourceSpecs> resourceSpecs) {
            this.putQueryParameter("ResourceSpecs", resourceSpecs);
            this.resourceSpecs = resourceSpecs;
            return this;
        }

        /**
         * <p>The resource type. The required parameters depend on the resource type.</p>
         * <ul>
         * <li>When <code>ResourceType</code> is set to <code>Desktop</code>, the required parameters are <code>InstanceType</code>, <code>RootDiskSizeGib</code>, and <code>UserDiskSizeGib</code>.</li>
         * <li>When <code>ResourceType</code> is set to <code>NetworkPackage</code>, the required parameter is <code>Bandwidth</code>.</li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li>Desktop (default): cloud computers.</li>
         * <li>NetworkPackage: premium bandwidth plans.</li>
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
         * <p>The size of the system disk. Unit: GiB.</p>
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
         * <p>The size of the data disk. Unit: GiB.</p>
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
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The size of the system disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder rootDiskSizeGib(Integer rootDiskSizeGib) {
                this.rootDiskSizeGib = rootDiskSizeGib;
                return this;
            }

            /**
             * <p>The size of the data disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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
