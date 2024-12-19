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

        /**
         * Cidr.
         */
        public Builder cidr(String cidr) {
            this.cidr = cidr;
            return this;
        }

        /**
         * CreationTime.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * IpamPoolAllocationDescription.
         */
        public Builder ipamPoolAllocationDescription(String ipamPoolAllocationDescription) {
            this.ipamPoolAllocationDescription = ipamPoolAllocationDescription;
            return this;
        }

        /**
         * IpamPoolAllocationId.
         */
        public Builder ipamPoolAllocationId(String ipamPoolAllocationId) {
            this.ipamPoolAllocationId = ipamPoolAllocationId;
            return this;
        }

        /**
         * IpamPoolAllocationName.
         */
        public Builder ipamPoolAllocationName(String ipamPoolAllocationName) {
            this.ipamPoolAllocationName = ipamPoolAllocationName;
            return this;
        }

        /**
         * IpamPoolId.
         */
        public Builder ipamPoolId(String ipamPoolId) {
            this.ipamPoolId = ipamPoolId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ResourceRegionId.
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
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
         * SourceCidr.
         */
        public Builder sourceCidr(String sourceCidr) {
            this.sourceCidr = sourceCidr;
            return this;
        }

        /**
         * Status.
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
