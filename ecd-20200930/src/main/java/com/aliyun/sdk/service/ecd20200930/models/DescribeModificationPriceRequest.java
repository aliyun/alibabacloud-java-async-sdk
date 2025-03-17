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
            this.resourceType = request.resourceType;
            this.rootDiskSizeGib = request.rootDiskSizeGib;
            this.userDiskSizeGib = request.userDiskSizeGib;
        } 

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
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

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
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
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * RootDiskSizeGib.
         */
        public Builder rootDiskSizeGib(Integer rootDiskSizeGib) {
            this.putQueryParameter("RootDiskSizeGib", rootDiskSizeGib);
            this.rootDiskSizeGib = rootDiskSizeGib;
            return this;
        }

        /**
         * UserDiskSizeGib.
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

}
