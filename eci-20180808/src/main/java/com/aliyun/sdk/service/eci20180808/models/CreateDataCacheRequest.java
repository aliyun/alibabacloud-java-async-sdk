// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataCacheRequest} extends {@link RequestModel}
 *
 * <p>CreateDataCacheRequest</p>
 */
public class CreateDataCacheRequest extends Request {
    @Query
    @NameInMap("Bucket")
    private String bucket;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DataSource")
    private DataSource dataSource;

    @Query
    @NameInMap("EipCreateParam")
    private EipCreateParam eipCreateParam;

    @Query
    @NameInMap("EipInstanceId")
    private String eipInstanceId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Path")
    private String path;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RetentionDays")
    private Integer retentionDays;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("Size")
    private Integer size;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    private CreateDataCacheRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.clientToken = builder.clientToken;
        this.dataSource = builder.dataSource;
        this.eipCreateParam = builder.eipCreateParam;
        this.eipInstanceId = builder.eipInstanceId;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.path = builder.path;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.retentionDays = builder.retentionDays;
        this.securityGroupId = builder.securityGroupId;
        this.size = builder.size;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataCacheRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dataSource
     */
    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * @return eipCreateParam
     */
    public EipCreateParam getEipCreateParam() {
        return this.eipCreateParam;
    }

    /**
     * @return eipInstanceId
     */
    public String getEipInstanceId() {
        return this.eipInstanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateDataCacheRequest, Builder> {
        private String bucket; 
        private String clientToken; 
        private DataSource dataSource; 
        private EipCreateParam eipCreateParam; 
        private String eipInstanceId; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String path; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer retentionDays; 
        private String securityGroupId; 
        private Integer size; 
        private java.util.List < Tag> tag; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataCacheRequest request) {
            super(request);
            this.bucket = request.bucket;
            this.clientToken = request.clientToken;
            this.dataSource = request.dataSource;
            this.eipCreateParam = request.eipCreateParam;
            this.eipInstanceId = request.eipInstanceId;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.path = request.path;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.retentionDays = request.retentionDays;
            this.securityGroupId = request.securityGroupId;
            this.size = request.size;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * The bucket in which the data is stored. By default, the default bucket is used. You can use a custom bucket for business grouping and to prevent path conflicts.
         * <p>
         * 
         * >  eci-system is the reserved bucket of the ECI and cannot be used.
         */
        public Builder bucket(String bucket) {
            this.putQueryParameter("Bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The data source.
         */
        public Builder dataSource(DataSource dataSource) {
            this.putQueryParameter("DataSource", dataSource);
            this.dataSource = dataSource;
            return this;
        }

        /**
         * The elastic IP address (EIP) to be created and associated. If no NAT gateway is configured for the virtual private cloud (VPC), you can associate an EIP to pull data from the Internet.
         */
        public Builder eipCreateParam(EipCreateParam eipCreateParam) {
            this.putQueryParameter("EipCreateParam", eipCreateParam);
            this.eipCreateParam = eipCreateParam;
            return this;
        }

        /**
         * The existing elastic IP address (EIP) to be associated. If no NAT gateway is configured for the virtual private cloud (VPC), you can associate an EIP to pull data from the Internet.
         */
        public Builder eipInstanceId(String eipInstanceId) {
            this.putQueryParameter("EipInstanceId", eipInstanceId);
            this.eipInstanceId = eipInstanceId;
            return this;
        }

        /**
         * The DataCache name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The storage path of the data.
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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
         * The number of days for which the DataCache is retained. When the retention days end, the DataCache is deleted. By default, DataCaches do not expire.
         */
        public Builder retentionDays(Integer retentionDays) {
            this.putQueryParameter("RetentionDays", retentionDays);
            this.retentionDays = retentionDays;
            return this;
        }

        /**
         * The ID of the security group to which the generated ECI belongs during the creation of the data cache.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The size of the data cache. Unit: GiB. Default value: 20. Evaluate the required size based on the actual data size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * The tags to be bound to the data cache.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the vSwitch to which the generated ECI belongs during the creation of the data cache.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateDataCacheRequest build() {
            return new CreateDataCacheRequest(this);
        } 

    } 

    public static class DataSource extends TeaModel {
        @NameInMap("Options")
        private java.util.Map < String, String > options;

        @NameInMap("Type")
        private String type;

        private DataSource(Builder builder) {
            this.options = builder.options;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSource create() {
            return builder().build();
        }

        /**
         * @return options
         */
        public java.util.Map < String, String > getOptions() {
            return this.options;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.Map < String, String > options; 
            private String type; 

            /**
             * The parameters that are configured for the data source.
             */
            public Builder options(java.util.Map < String, String > options) {
                this.options = options;
                return this;
            }

            /**
             * The type of the data source. Valid values:
             * <p>
             * 
             * *   URL
             * *   NAS
             * *   OSS
             * *   SNAPSHOT
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataSource build() {
                return new DataSource(this);
            } 

        } 

    }
    public static class EipCreateParam extends TeaModel {
        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("CommonBandwidthPackage")
        private String commonBandwidthPackage;

        @NameInMap("ISP")
        private String ISP;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("PublicIpAddressPoolId")
        private String publicIpAddressPoolId;

        private EipCreateParam(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.commonBandwidthPackage = builder.commonBandwidthPackage;
            this.ISP = builder.ISP;
            this.internetChargeType = builder.internetChargeType;
            this.publicIpAddressPoolId = builder.publicIpAddressPoolId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipCreateParam create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return commonBandwidthPackage
         */
        public String getCommonBandwidthPackage() {
            return this.commonBandwidthPackage;
        }

        /**
         * @return ISP
         */
        public String getISP() {
            return this.ISP;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return publicIpAddressPoolId
         */
        public String getPublicIpAddressPoolId() {
            return this.publicIpAddressPoolId;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private String commonBandwidthPackage; 
            private String ISP; 
            private String internetChargeType; 
            private String publicIpAddressPoolId; 

            /**
             * The bandwidth of the EIP. Unit: Mbit/s. Default value: 5.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The EIP bandwidth plan to be associated.
             */
            public Builder commonBandwidthPackage(String commonBandwidthPackage) {
                this.commonBandwidthPackage = commonBandwidthPackage;
                return this;
            }

            /**
             * The line type of the EIP. Valid values:
             * <p>
             * 
             * *   BGP: BGP (Multi-ISP) line
             * *   BGP_PRO: BGP (Multi-ISP) Pro line
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * The metering method of the EIP. Valid values:
             * <p>
             * 
             * *   PayByBandwidth: pay-by-bandwidth
             * *   PayByTraffic: pay-by-data-transfer
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The ID of the IP address pool. The EIP is allocated from the IP address pool. You cannot use the IP address pool feature by default. To use this feature, you must apply for the privilege in the Quota Center console.
             */
            public Builder publicIpAddressPoolId(String publicIpAddressPoolId) {
                this.publicIpAddressPoolId = publicIpAddressPoolId;
                return this;
            }

            public EipCreateParam build() {
                return new EipCreateParam(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
