// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSynchronizationJobRequest} extends {@link RequestModel}
 *
 * <p>CreateSynchronizationJobRequest</p>
 */
public class CreateSynchronizationJobRequest extends Request {
    @Query
    @NameInMap("DestinationEndpoint")
    private DestinationEndpoint destinationEndpoint;

    @Query
    @NameInMap("SourceEndpoint")
    private SourceEndpoint sourceEndpoint;

    @Query
    @NameInMap("AccountId")
    private String accountId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DBInstanceCount")
    @Validation(maximum = 10000)
    private Integer DBInstanceCount;

    @Query
    @NameInMap("DestRegion")
    @Validation(required = true)
    private String destRegion;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("PayType")
    @Validation(required = true)
    private String payType;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SourceRegion")
    @Validation(required = true)
    private String sourceRegion;

    @Query
    @NameInMap("SynchronizationJobClass")
    @Validation(required = true)
    private String synchronizationJobClass;

    @Query
    @NameInMap("Topology")
    private String topology;

    @Query
    @NameInMap("UsedTime")
    private Integer usedTime;

    @Query
    @NameInMap("networkType")
    private String networkType;

    private CreateSynchronizationJobRequest(Builder builder) {
        super(builder);
        this.destinationEndpoint = builder.destinationEndpoint;
        this.sourceEndpoint = builder.sourceEndpoint;
        this.accountId = builder.accountId;
        this.clientToken = builder.clientToken;
        this.DBInstanceCount = builder.DBInstanceCount;
        this.destRegion = builder.destRegion;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceRegion = builder.sourceRegion;
        this.synchronizationJobClass = builder.synchronizationJobClass;
        this.topology = builder.topology;
        this.usedTime = builder.usedTime;
        this.networkType = builder.networkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSynchronizationJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationEndpoint
     */
    public DestinationEndpoint getDestinationEndpoint() {
        return this.destinationEndpoint;
    }

    /**
     * @return sourceEndpoint
     */
    public SourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstanceCount
     */
    public Integer getDBInstanceCount() {
        return this.DBInstanceCount;
    }

    /**
     * @return destRegion
     */
    public String getDestRegion() {
        return this.destRegion;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
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
     * @return sourceRegion
     */
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * @return synchronizationJobClass
     */
    public String getSynchronizationJobClass() {
        return this.synchronizationJobClass;
    }

    /**
     * @return topology
     */
    public String getTopology() {
        return this.topology;
    }

    /**
     * @return usedTime
     */
    public Integer getUsedTime() {
        return this.usedTime;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    public static final class Builder extends Request.Builder<CreateSynchronizationJobRequest, Builder> {
        private DestinationEndpoint destinationEndpoint; 
        private SourceEndpoint sourceEndpoint; 
        private String accountId; 
        private String clientToken; 
        private Integer DBInstanceCount; 
        private String destRegion; 
        private String ownerId; 
        private String payType; 
        private String period; 
        private String regionId; 
        private String resourceGroupId; 
        private String sourceRegion; 
        private String synchronizationJobClass; 
        private String topology; 
        private Integer usedTime; 
        private String networkType; 

        private Builder() {
            super();
        } 

        private Builder(CreateSynchronizationJobRequest request) {
            super(request);
            this.destinationEndpoint = request.destinationEndpoint;
            this.sourceEndpoint = request.sourceEndpoint;
            this.accountId = request.accountId;
            this.clientToken = request.clientToken;
            this.DBInstanceCount = request.DBInstanceCount;
            this.destRegion = request.destRegion;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.period = request.period;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.sourceRegion = request.sourceRegion;
            this.synchronizationJobClass = request.synchronizationJobClass;
            this.topology = request.topology;
            this.usedTime = request.usedTime;
            this.networkType = request.networkType;
        } 

        /**
         * DestinationEndpoint.
         */
        public Builder destinationEndpoint(DestinationEndpoint destinationEndpoint) {
            this.putQueryParameter("DestinationEndpoint", destinationEndpoint);
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }

        /**
         * SourceEndpoint.
         */
        public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
            this.putQueryParameter("SourceEndpoint", sourceEndpoint);
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The **ClientToken** parameter can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * If you set the **SourceEndpoint.InstanceType** parameter to **DRDS**, you must specify the DBInstanceCount parameter. This parameter specifies the number of private RDS instances attached to the source PolarDB-X instance. Default value: **1**.
         */
        public Builder DBInstanceCount(Integer DBInstanceCount) {
            this.putQueryParameter("DBInstanceCount", DBInstanceCount);
            this.DBInstanceCount = DBInstanceCount;
            return this;
        }

        /**
         * The ID of the region where the destination database resides. For more information, see [List of supported regions](~~141033~~).
         * <p>
         * 
         * >  If the **SourceRegion** parameter is set to the China (Hong Kong) region or a region outside the Chinese mainland, you must set the DestRegion parameter to the same region ID.
         */
        public Builder destRegion(String destRegion) {
            this.putQueryParameter("DestRegion", destRegion);
            this.destRegion = destRegion;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The billing method of the data synchronization instance.
         * <p>
         * 
         * *   **PrePaid**: subscription
         * *   **PostPaid** (default value): pay-as-you-go
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * The billing cycle of the subscription instance. Valid values:
         * <p>
         * 
         * *   **Year**
         * *   **Month**
         * 
         * >  You must specify this parameter only if you set the PayType parameter to **PrePaid**.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the region where the source database resides. For more information, see [List of supported regions](~~141033~~).
         */
        public Builder sourceRegion(String sourceRegion) {
            this.putQueryParameter("SourceRegion", sourceRegion);
            this.sourceRegion = sourceRegion;
            return this;
        }

        /**
         * The specification of the data synchronization instance. Valid values: **micro**, **small**, **medium**, and **large**.
         * <p>
         * 
         * >  For more information about the test performance of each specification, see [Specifications of data synchronization instances](~~26605~~).
         */
        public Builder synchronizationJobClass(String synchronizationJobClass) {
            this.putQueryParameter("SynchronizationJobClass", synchronizationJobClass);
            this.synchronizationJobClass = synchronizationJobClass;
            return this;
        }

        /**
         * The synchronization topology. Valid values:
         * <p>
         * 
         * *   **oneway**: one-way synchronization
         * *   **bidirectional**: two-way synchronization
         * 
         * > 
         * *   The default value is **oneway**.
         * *   This parameter can be set to **bidirectional** only when the **SourceEndpoint.InstanceType** and **DestinationEndpoint.InstanceType** parameters are set to **MySQL**, **PolarDB**, or **Redis**.
         */
        public Builder topology(String topology) {
            this.putQueryParameter("Topology", topology);
            this.topology = topology;
            return this;
        }

        /**
         * The subscription length.
         * <p>
         * 
         * *   If the billing cycle is **Year**, the value range is **1 to 5**.
         * *   If the billing cycle is **Month**, the value range is **1 to 60**.
         * 
         * >  You must specify this parameter only if you set the PayType parameter to **PrePaid**.
         */
        public Builder usedTime(Integer usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * The network type. Valid value: **Intranet**, which indicates virtual private cloud (VPC).
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("networkType", networkType);
            this.networkType = networkType;
            return this;
        }

        @Override
        public CreateSynchronizationJobRequest build() {
            return new CreateSynchronizationJobRequest(this);
        } 

    } 

    public static class DestinationEndpoint extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        private DestinationEndpoint(Builder builder) {
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationEndpoint create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private String instanceType; 

            /**
             * The instance type of the destination database. Valid values:
             * <p>
             * 
             * *   **MySQL**: ApsaraDB RDS for MySQL instance or self-managed MySQL database
             * *   **PolarDB**: PolarDB for MySQL cluster or PolarDB O Edition cluster
             * *   **Redis**: Redis database
             * *   **MaxCompute**: MaxCompute project
             * 
             * > 
             * *   Default value: **MySQL**.
             * *   For more information about the supported source and destination databases, see [Database types, initial synchronization types, and synchronization topologies](~~130744~~).
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public DestinationEndpoint build() {
                return new DestinationEndpoint(this);
            } 

        } 

    }
    public static class SourceEndpoint extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        private SourceEndpoint(Builder builder) {
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private String instanceType; 

            /**
             * The instance type of the source database. Valid values:
             * <p>
             * 
             * *   **MySQL**: ApsaraDB RDS for MySQL instance or self-managed MySQL database
             * *   **PolarDB**: PolarDB for MySQL cluster or PolarDB O Edition cluster
             * *   **Redis**: Redis database
             * *   **DRDS**: PolarDB-X instance V1.0
             * 
             * > 
             * *   Default value: **MySQL**.
             * *   For more information about the supported source and destination databases, see [Database types, initial synchronization types, and synchronization topologies](~~130744~~).
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public SourceEndpoint build() {
                return new SourceEndpoint(this);
            } 

        } 

    }
}
