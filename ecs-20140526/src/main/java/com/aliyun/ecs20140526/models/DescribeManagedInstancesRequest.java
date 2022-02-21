// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeManagedInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeManagedInstancesRequest</p>
 */
public class DescribeManagedInstancesRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ActivationId")
    private String activationId;

    @Query
    @NameInMap("InstanceId")
    private java.util.List < String > instanceId;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("OsType")
    private String osType;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("InstanceIp")
    private String instanceIp;

    private DescribeManagedInstancesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.activationId = builder.activationId;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.pageNumber = builder.pageNumber;
        this.osType = builder.osType;
        this.instanceName = builder.instanceName;
        this.instanceIp = builder.instanceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeManagedInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return activationId
     */
    public String getActivationId() {
        return this.activationId;
    }

    /**
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceIp
     */
    public String getInstanceIp() {
        return this.instanceIp;
    }

    public static final class Builder extends Request.Builder<DescribeManagedInstancesRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String activationId; 
        private java.util.List < String > instanceId; 
        private Long pageSize; 
        private Long pageNumber; 
        private String osType; 
        private String instanceName; 
        private String instanceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeManagedInstancesRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.regionId = response.regionId;
            this.activationId = response.activationId;
            this.instanceId = response.instanceId;
            this.pageSize = response.pageSize;
            this.pageNumber = response.pageNumber;
            this.osType = response.osType;
            this.instanceName = response.instanceName;
            this.instanceIp = response.instanceIp;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the region. Supported regions: China (Qingdao), China (Beijing), China (Zhangjiakou), China (Hohhot), China (Hangzhou), and China (Shanghai) china (Shenzhen), China (Heyuan), and China (Hong Kong).
         * <p>
         * 
         * You can call [DescribeRegions](~~ 25609 ~~) to view the region ID and other information.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Activation Code ID.
         */
        public Builder activationId(String activationId) {
            this.putQueryParameter("ActivationId", activationId);
            this.activationId = activationId;
            return this;
        }

        /**
         * The ID of the managed instance. Valid values of N: 1 to 50.
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Maximum Value: 50.
         * 
         * Default value: 10.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The page number of the managed instance list.
         * <p>
         * 
         * The start value is 1.
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The operating system type of the managed instance. Valid values:
         * <p>
         * 
         * -windows.
         * -linux.
         * 
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * The name of the managed instance.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The internal or public IP address of the managed instance.
         */
        public Builder instanceIp(String instanceIp) {
            this.putQueryParameter("InstanceIp", instanceIp);
            this.instanceIp = instanceIp;
            return this;
        }

        @Override
        public DescribeManagedInstancesRequest build() {
            return new DescribeManagedInstancesRequest(this);
        } 

    } 

}
