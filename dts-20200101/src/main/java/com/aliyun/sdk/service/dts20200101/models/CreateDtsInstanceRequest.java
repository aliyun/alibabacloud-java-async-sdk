// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDtsInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateDtsInstanceRequest</p>
 */
public class CreateDtsInstanceRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("AutoStart")
    private Boolean autoStart;

    @Query
    @NameInMap("ComputeUnit")
    @Validation(maximum = 999999, minimum = 1)
    private Integer computeUnit;

    @Query
    @NameInMap("DatabaseCount")
    @Validation(maximum = 10000, minimum = 1)
    private Integer databaseCount;

    @Query
    @NameInMap("DestinationEndpointEngineName")
    private String destinationEndpointEngineName;

    @Query
    @NameInMap("DestinationRegion")
    private String destinationRegion;

    @Query
    @NameInMap("Du")
    private Integer du;

    @Query
    @NameInMap("FeeType")
    private String feeType;

    @Query
    @NameInMap("InstanceClass")
    private String instanceClass;

    @Query
    @NameInMap("JobId")
    private String jobId;

    @Query
    @NameInMap("PayType")
    private String payType;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("Quantity")
    @Validation(maximum = 9999999, minimum = 1)
    private Integer quantity;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SourceEndpointEngineName")
    private String sourceEndpointEngineName;

    @Query
    @NameInMap("SourceRegion")
    private String sourceRegion;

    @Query
    @NameInMap("SyncArchitecture")
    private String syncArchitecture;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("UsedTime")
    @Validation(maximum = 10000, minimum = 1)
    private Integer usedTime;

    private CreateDtsInstanceRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoStart = builder.autoStart;
        this.computeUnit = builder.computeUnit;
        this.databaseCount = builder.databaseCount;
        this.destinationEndpointEngineName = builder.destinationEndpointEngineName;
        this.destinationRegion = builder.destinationRegion;
        this.du = builder.du;
        this.feeType = builder.feeType;
        this.instanceClass = builder.instanceClass;
        this.jobId = builder.jobId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.quantity = builder.quantity;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceEndpointEngineName = builder.sourceEndpointEngineName;
        this.sourceRegion = builder.sourceRegion;
        this.syncArchitecture = builder.syncArchitecture;
        this.type = builder.type;
        this.usedTime = builder.usedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDtsInstanceRequest create() {
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
     * @return autoStart
     */
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    /**
     * @return computeUnit
     */
    public Integer getComputeUnit() {
        return this.computeUnit;
    }

    /**
     * @return databaseCount
     */
    public Integer getDatabaseCount() {
        return this.databaseCount;
    }

    /**
     * @return destinationEndpointEngineName
     */
    public String getDestinationEndpointEngineName() {
        return this.destinationEndpointEngineName;
    }

    /**
     * @return destinationRegion
     */
    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    /**
     * @return du
     */
    public Integer getDu() {
        return this.du;
    }

    /**
     * @return feeType
     */
    public String getFeeType() {
        return this.feeType;
    }

    /**
     * @return instanceClass
     */
    public String getInstanceClass() {
        return this.instanceClass;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
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
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
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
     * @return sourceEndpointEngineName
     */
    public String getSourceEndpointEngineName() {
        return this.sourceEndpointEngineName;
    }

    /**
     * @return sourceRegion
     */
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * @return syncArchitecture
     */
    public String getSyncArchitecture() {
        return this.syncArchitecture;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return usedTime
     */
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public static final class Builder extends Request.Builder<CreateDtsInstanceRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoStart; 
        private Integer computeUnit; 
        private Integer databaseCount; 
        private String destinationEndpointEngineName; 
        private String destinationRegion; 
        private Integer du; 
        private String feeType; 
        private String instanceClass; 
        private String jobId; 
        private String payType; 
        private String period; 
        private Integer quantity; 
        private String regionId; 
        private String resourceGroupId; 
        private String sourceEndpointEngineName; 
        private String sourceRegion; 
        private String syncArchitecture; 
        private String type; 
        private Integer usedTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateDtsInstanceRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoStart = request.autoStart;
            this.computeUnit = request.computeUnit;
            this.databaseCount = request.databaseCount;
            this.destinationEndpointEngineName = request.destinationEndpointEngineName;
            this.destinationRegion = request.destinationRegion;
            this.du = request.du;
            this.feeType = request.feeType;
            this.instanceClass = request.instanceClass;
            this.jobId = request.jobId;
            this.payType = request.payType;
            this.period = request.period;
            this.quantity = request.quantity;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.sourceEndpointEngineName = request.sourceEndpointEngineName;
            this.sourceRegion = request.sourceRegion;
            this.syncArchitecture = request.syncArchitecture;
            this.type = request.type;
            this.usedTime = request.usedTime;
        } 

        /**
         * Specifies whether to automatically renew the DTS instance when it expires. Valid values:
         * <p>
         * 
         * *   **false**: does not automatically renew the DTS instance when it expires. This is the default value.
         * *   **true**: automatically renews the DTS instance when it expires.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Specifies whether to automatically start the task after the DTS instance is purchased. Valid values:
         * <p>
         * 
         * *   **false**: does not automatically start the task after the DTS instance is purchased. This is the default value.
         * *   **true**: automatically starts the task after the DTS instance is purchased.
         */
        public Builder autoStart(Boolean autoStart) {
            this.putQueryParameter("AutoStart", autoStart);
            this.autoStart = autoStart;
            return this;
        }

        /**
         * The specifications of the extract, transform, and load (ETL) instance. The unit is compute unit (CU). One CU is equal to 1 vCPU and 4 GB of memory. The value of this parameter must be an integer greater than or equal to 2.
         */
        public Builder computeUnit(Integer computeUnit) {
            this.putQueryParameter("ComputeUnit", computeUnit);
            this.computeUnit = computeUnit;
            return this;
        }

        /**
         * The number of private custom ApsaraDB RDS instances in a PolarDB-X instance. Default value: **1**.
         * <p>
         * 
         * >  You must specify this parameter only if the **SourceEndpointEngineName** parameter is set to **drds**.
         */
        public Builder databaseCount(Integer databaseCount) {
            this.putQueryParameter("DatabaseCount", databaseCount);
            this.databaseCount = databaseCount;
            return this;
        }

        /**
         * The database engine of the destination instance.
         * <p>
         * 
         * *   **MySQL**: ApsaraDB RDS for MySQL instance or self-managed MySQL database
         * *   **PolarDB**: PolarDB for MySQL cluster
         * *   **polardb_o**: PolarDB for Oracle cluster
         * *   **polardb_pg**: PolarDB for PostgreSQL cluster
         * *   **Redis**: ApsaraDB for Redis instance or self-managed Redis database
         * *   **DRDS**: PolarDB-X 1.0 or PolarDB-X 2.0 instance
         * *   **PostgreSQL**: self-managed PostgreSQL database
         * *   **odps**: MaxCompute project
         * *   **oracle**: self-managed Oracle database
         * *   **mongodb**: ApsaraDB for MongoDB instance or self-managed MongoDB database
         * *   **tidb**: TiDB database
         * *   **ADS**: AnalyticDB for MySQL V2.0 cluster
         * *   **ADB30**: AnalyticDB for MySQL V3.0 cluster
         * *   **Greenplum**: AnalyticDB for PostgreSQL instance
         * *   **MSSQL**: ApsaraDB RDS for SQL Server instance or self-managed SQL Server database
         * *   **kafka**: Message Queue for Apache Kafka instance or self-managed Kafka cluster
         * *   **DataHub**: DataHub project
         * *   **DB2**: self-managed Db2 for LUW database
         * *   **as400**: AS/400
         * *   **Tablestore**: Tablestore instance
         * 
         * > 
         * *   The default value is **MySQL**.
         * *   For more information about the supported source and destination databases, see [Overview of data synchronization scenarios](~~130744~~) and [Overview of data migration scenarios](~~26618~~).
         * *   You must specify one of this parameter and the **JobId** parameter.
         */
        public Builder destinationEndpointEngineName(String destinationEndpointEngineName) {
            this.putQueryParameter("DestinationEndpointEngineName", destinationEndpointEngineName);
            this.destinationEndpointEngineName = destinationEndpointEngineName;
            return this;
        }

        /**
         * The ID of the region in which the destination instance resides. For more information, see [List of supported regions](~~141033~~).
         * <p>
         * 
         * >  You must specify one of this parameter and the **JobId** parameter.
         */
        public Builder destinationRegion(String destinationRegion) {
            this.putQueryParameter("DestinationRegion", destinationRegion);
            this.destinationRegion = destinationRegion;
            return this;
        }

        /**
         * The number of DTS units (DUs) that are assigned to a DTS task that is run on a DTS dedicated cluster. Valid values: **1** to **100**.
         * <p>
         * 
         * > 
         * *   The value of this parameter must be within the range of the number of DUs available for the DTS dedicated cluster.
         */
        public Builder du(Integer du) {
            this.putQueryParameter("Du", du);
            this.du = du;
            return this;
        }

        /**
         * The billing type for a change tracking instance. Valid values: ONLY_CONFIGURATION_FEE and CONFIGURATION_FEE_AND_DATA_FEE. ONLY_CONFIGURATION_FEE: charges only configuration fees. CONFIGURATION_FEE_AND_DATA_FEE: charges configuration fees and data traffic fees.
         */
        public Builder feeType(String feeType) {
            this.putQueryParameter("FeeType", feeType);
            this.feeType = feeType;
            return this;
        }

        /**
         * The instance class.
         * <p>
         * 
         * *   DTS supports the following instance classes for a data migration instance: **xxlarge**, **xlarge**, **large**, **medium**, and **small**.
         * *   DTS supports the following instance classes for a data synchronization instance: **large**, **medium**, **small**, and **micro**.
         * 
         * >  For more information about the test performance of each instance class, see [Specifications of data migration instances](~~26606~~) and [Specifications of data synchronization instances](~~26605~~).
         */
        public Builder instanceClass(String instanceClass) {
            this.putQueryParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * The ID of the task. You can call the **ConfigureDtsJob** operation to obtain the task ID from the **DtsJobId** parameter.
         * <p>
         * 
         * >  If this parameter is specified, you do not need to specify the **SourceRegion**, **DestinationRegion**, **Type**, **SourceEndpointEngineName**, or **DestinationEndpointEngineName** parameter. Even if these parameters are specified, the value of the **JobId** parameter takes precedence.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * The billing method. Valid values:
         * <p>
         * 
         * *   **PrePaid**: subscription
         * *   **PostPaid**: pay-as-you-go
         * 
         * >  This parameter must be specified.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * The unit of the subscription duration. Valid values: **Year** and **Month**.
         * <p>
         * 
         * >  You must specify this parameter only if the **PayType** parameter is set to **PrePaid**.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The number of DTS instances that you want to purchase.
         * <p>
         * 
         * >  Only a single instance can be purchased each time.
         */
        public Builder quantity(Integer quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
            return this;
        }

        /**
         * The ID of the region in which the DTS instance resides. For more information, see [List of supported regions](~~141033~~).
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
         * The database engine of the source instance.
         * <p>
         * 
         * *   **MySQL**: ApsaraDB RDS for MySQL instance or self-managed MySQL database
         * *   **PolarDB**: PolarDB for MySQL cluster
         * *   **polardb_o**: PolarDB for Oracle cluster
         * *   **polardb_pg**: PolarDB for PostgreSQL cluster
         * *   **Redis**: ApsaraDB for Redis instance or self-managed Redis database
         * *   **DRDS**: PolarDB-X 1.0 or PolarDB-X 2.0 instance
         * *   **PostgreSQL**: self-managed PostgreSQL database
         * *   **odps**: MaxCompute project
         * *   **oracle**: self-managed Oracle database
         * *   **mongodb**: ApsaraDB for MongoDB instance or self-managed MongoDB database
         * *   **tidb**: TiDB database
         * *   **ADS**: AnalyticDB for MySQL V2.0 cluster
         * *   **ADB30**: AnalyticDB for MySQL V3.0 cluster
         * *   **Greenplum**: AnalyticDB for PostgreSQL instance
         * *   **MSSQL**: ApsaraDB RDS for SQL Server instance or self-managed SQL Server database
         * *   **kafka**: Message Queue for Apache Kafka instance or self-managed Kafka cluster
         * *   **DataHub**: DataHub project
         * *   **DB2**: self-managed Db2 for LUW database
         * *   **as400**: AS/400
         * *   **Tablestore**: Tablestore instance
         * 
         * > 
         * *   The default value is **MySQL**.
         * *   For more information about the supported source and destination databases, see [Overview of data synchronization scenarios](~~130744~~) and [Overview of data migration scenarios](~~26618~~).
         * *   You must specify one of this parameter and the **JobId** parameter.
         */
        public Builder sourceEndpointEngineName(String sourceEndpointEngineName) {
            this.putQueryParameter("SourceEndpointEngineName", sourceEndpointEngineName);
            this.sourceEndpointEngineName = sourceEndpointEngineName;
            return this;
        }

        /**
         * The ID of the region in which the source instance resides. For more information, see [List of supported regions](~~141033~~).
         * <p>
         * 
         * >  You must specify one of this parameter and the **JobId** parameter.
         */
        public Builder sourceRegion(String sourceRegion) {
            this.putQueryParameter("SourceRegion", sourceRegion);
            this.sourceRegion = sourceRegion;
            return this;
        }

        /**
         * The synchronization topology. Valid values:
         * <p>
         * 
         * *   **oneway**: one-way synchronization. This is the default value.
         * *   **bidirectional**: two-way synchronization.
         */
        public Builder syncArchitecture(String syncArchitecture) {
            this.putQueryParameter("SyncArchitecture", syncArchitecture);
            this.syncArchitecture = syncArchitecture;
            return this;
        }

        /**
         * The type of the DTS instance. Valid values:
         * <p>
         * 
         * *   **MIGRATION**: data migration instance
         * 
         * *   **SYNC**: data synchronization instance
         * 
         * *   **SUBSCRIBE**: change tracking instance
         * 
         * > You must specify one of this parameter and the **JobId** parameter.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The subscription duration.
         * <p>
         * 
         * *   Valid values if the **Period** parameter is set to **Month**: 1, 2, 3, 4, 5, 6, 7, 8, and 9.
         * 
         * *   Valid values if the **Period** parameter is set to **Year**: 1, 2, 3, and 5.
         * 
         * > *   You must specify this parameter only if the **PayType** parameter is set to **PrePaid**.
         *    *   You can set the **Period** parameter to specify the unit of the subscription duration.
         */
        public Builder usedTime(Integer usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        @Override
        public CreateDtsInstanceRequest build() {
            return new CreateDtsInstanceRequest(this);
        } 

    } 

}
