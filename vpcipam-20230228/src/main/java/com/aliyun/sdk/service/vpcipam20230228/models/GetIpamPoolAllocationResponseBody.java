// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

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
 * {@link GetIpamPoolAllocationResponseBody} extends {@link TeaModel}
 *
 * <p>GetIpamPoolAllocationResponseBody</p>
 */
public class GetIpamPoolAllocationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cidr")
    private String cidr;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("IpamPoolAllocationDescription")
    private String ipamPoolAllocationDescription;

    @com.aliyun.core.annotation.NameInMap("IpamPoolAllocationId")
    private String ipamPoolAllocationId;

    @com.aliyun.core.annotation.NameInMap("IpamPoolAllocationName")
    private String ipamPoolAllocationName;

    @com.aliyun.core.annotation.NameInMap("IpamPoolId")
    private String ipamPoolId;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
    private String resourceRegionId;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("SourceCidr")
    private String sourceCidr;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetIpamPoolAllocationResponseBody(Builder builder) {
        this.cidr = builder.cidr;
        this.creationTime = builder.creationTime;
        this.ipamPoolAllocationDescription = builder.ipamPoolAllocationDescription;
        this.ipamPoolAllocationId = builder.ipamPoolAllocationId;
        this.ipamPoolAllocationName = builder.ipamPoolAllocationName;
        this.ipamPoolId = builder.ipamPoolId;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceId = builder.resourceId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceRegionId = builder.resourceRegionId;
        this.resourceType = builder.resourceType;
        this.sourceCidr = builder.sourceCidr;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIpamPoolAllocationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidr
     */
    public String getCidr() {
        return this.cidr;
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return ipamPoolAllocationDescription
     */
    public String getIpamPoolAllocationDescription() {
        return this.ipamPoolAllocationDescription;
    }

    /**
     * @return ipamPoolAllocationId
     */
    public String getIpamPoolAllocationId() {
        return this.ipamPoolAllocationId;
    }

    /**
     * @return ipamPoolAllocationName
     */
    public String getIpamPoolAllocationName() {
        return this.ipamPoolAllocationName;
    }

    /**
     * @return ipamPoolId
     */
    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return resourceRegionId
     */
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return sourceCidr
     */
    public String getSourceCidr() {
        return this.sourceCidr;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String cidr; 
        private String creationTime; 
        private String ipamPoolAllocationDescription; 
        private String ipamPoolAllocationId; 
        private String ipamPoolAllocationName; 
        private String ipamPoolId; 
        private String regionId; 
        private String requestId; 
        private String resourceId; 
        private Long resourceOwnerId; 
        private String resourceRegionId; 
        private String resourceType; 
        private String sourceCidr; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetIpamPoolAllocationResponseBody model) {
            this.cidr = model.cidr;
            this.creationTime = model.creationTime;
            this.ipamPoolAllocationDescription = model.ipamPoolAllocationDescription;
            this.ipamPoolAllocationId = model.ipamPoolAllocationId;
            this.ipamPoolAllocationName = model.ipamPoolAllocationName;
            this.ipamPoolId = model.ipamPoolId;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.resourceId = model.resourceId;
            this.resourceOwnerId = model.resourceOwnerId;
            this.resourceRegionId = model.resourceRegionId;
            this.resourceType = model.resourceType;
            this.sourceCidr = model.sourceCidr;
            this.status = model.status;
        } 

        /**
         * <p>The allocated CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        public Builder cidr(String cidr) {
            this.cidr = cidr;
            return this;
        }

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-15T10:24:19+08:00</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The description of the CIDR allocation of the IPAM pool.</p>
         * <p>The description must be 1 to 256 characters in length and start with a letter, but cannot start with a <code>http://</code> or <code>https://</code>. This parameter is empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam pool allocation description</p>
         */
        public Builder ipamPoolAllocationDescription(String ipamPoolAllocationDescription) {
            this.ipamPoolAllocationDescription = ipamPoolAllocationDescription;
            return this;
        }

        /**
         * <p>The ID of the instance to which CIDR blocks are allocated from the IPAM pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-pool-alloc-112za33e4****</p>
         */
        public Builder ipamPoolAllocationId(String ipamPoolAllocationId) {
            this.ipamPoolAllocationId = ipamPoolAllocationId;
            return this;
        }

        /**
         * <p>The name of the CIDR allocation of the IPAM pool.</p>
         * <p>It must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam pool allocation name</p>
         */
        public Builder ipamPoolAllocationName(String ipamPoolAllocationName) {
            this.ipamPoolAllocationName = ipamPoolAllocationName;
            return this;
        }

        /**
         * <p>The ID of the IPAM pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-pool-6rcq3tobayc20t****</p>
         */
        public Builder ipamPoolId(String ipamPoolId) {
            this.ipamPoolId = ipamPoolId;
            return this;
        }

        /**
         * <p>The region of the IPAM pool.</p>
         * <blockquote>
         * <p> If the IPAM pool to which the CIDR block allocation belongs has the region attribute, this parameter is the region of the IPAM pool. If not, this parameter is the IPAM managed region.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3748DEFF-68BE-5EED-9937-7C1D0C21BAB4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource to which the CIDR block is allocated.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp16qjewdsunr41m1****</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1616080591216318</p>
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The effective region ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
            return this;
        }

        /**
         * <p>The type of the resource to which the CIDR block is allocated. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong></li>
         * <li><strong>IpamPool</strong></li>
         * <li><strong>Custom</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The source CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        public Builder sourceCidr(String sourceCidr) {
            this.sourceCidr = sourceCidr;
            return this;
        }

        /**
         * <p>The instance state. Valid values:</p>
         * <ul>
         * <li><strong>Created</strong></li>
         * <li><strong>Deleted</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetIpamPoolAllocationResponseBody build() {
            return new GetIpamPoolAllocationResponseBody(this);
        } 

    } 

}
