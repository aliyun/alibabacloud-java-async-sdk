// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link CreateDtsInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateDtsInstanceRequest</p>
 */
public class CreateDtsInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoStart")
    private Boolean autoStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputeUnit")
    @com.aliyun.core.annotation.Validation(maximum = 999999, minimum = 1)
    private Integer computeUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseCount")
    @com.aliyun.core.annotation.Validation(maximum = 10000, minimum = 1)
    private Integer databaseCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpointEngineName")
    private String destinationEndpointEngineName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationRegion")
    private String destinationRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsRegion")
    private String dtsRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Du")
    private Integer du;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeeType")
    private String feeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InsightModule")
    private Boolean insightModule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceClass")
    private String instanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxDu")
    private Double maxDu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinDu")
    private Double minDu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quantity")
    @com.aliyun.core.annotation.Validation(maximum = 9999999, minimum = 1)
    private Integer quantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointEngineName")
    private String sourceEndpointEngineName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRegion")
    private String sourceRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncArchitecture")
    private String syncArchitecture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    @com.aliyun.core.annotation.Validation(maximum = 10000, minimum = 1)
    private Integer usedTime;

    private CreateDtsInstanceRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoStart = builder.autoStart;
        this.computeUnit = builder.computeUnit;
        this.databaseCount = builder.databaseCount;
        this.destinationEndpointEngineName = builder.destinationEndpointEngineName;
        this.destinationRegion = builder.destinationRegion;
        this.dtsRegion = builder.dtsRegion;
        this.du = builder.du;
        this.feeType = builder.feeType;
        this.insightModule = builder.insightModule;
        this.instanceClass = builder.instanceClass;
        this.jobId = builder.jobId;
        this.maxDu = builder.maxDu;
        this.minDu = builder.minDu;
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
     * @return dtsRegion
     */
    public String getDtsRegion() {
        return this.dtsRegion;
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
     * @return insightModule
     */
    public Boolean getInsightModule() {
        return this.insightModule;
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
     * @return maxDu
     */
    public Double getMaxDu() {
        return this.maxDu;
    }

    /**
     * @return minDu
     */
    public Double getMinDu() {
        return this.minDu;
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
        private String dtsRegion; 
        private Integer du; 
        private String feeType; 
        private Boolean insightModule; 
        private String instanceClass; 
        private String jobId; 
        private Double maxDu; 
        private Double minDu; 
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
            this.dtsRegion = request.dtsRegion;
            this.du = request.du;
            this.feeType = request.feeType;
            this.insightModule = request.insightModule;
            this.instanceClass = request.instanceClass;
            this.jobId = request.jobId;
            this.maxDu = request.maxDu;
            this.minDu = request.minDu;
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
         * <p>Specifies whether to enable auto-renewal upon expiration. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: no. This is the default value.</li>
         * <li><strong>true</strong>: yes.</li>
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
         * <p>Specifies whether to automatically start the task after the purchase is completed. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: no. This is the default value.</li>
         * <li><strong>true</strong>: yes.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when a valid task ID is specified for the <strong>JobId</strong> parameter and this parameter is set to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoStart(Boolean autoStart) {
            this.putQueryParameter("AutoStart", autoStart);
            this.autoStart = autoStart;
            return this;
        }

        /**
         * <p>The specifications of the ETL node. Unit: compute unit (CU). 1 CU equals 1 vCPU and 4 GB of memory. The value must be an integer greater than or equal to 2.
         * &lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>If you specify this parameter, the <a href="https://help.aliyun.com/document_detail/212324.html">ETL feature</a> is enabled to perform data cleaning and transformation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder computeUnit(Integer computeUnit) {
            this.putQueryParameter("ComputeUnit", computeUnit);
            this.computeUnit = computeUnit;
            return this;
        }

        /**
         * <p>The number of private custom ApsaraDB RDS instances in PolarDB-X. Default value: <strong>1</strong>.</p>
         * <blockquote>
         * <p>This parameter is required only when the <strong>SourceEndpointEngineName</strong> parameter is set to <strong>drds</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder databaseCount(Integer databaseCount) {
            this.putQueryParameter("DatabaseCount", databaseCount);
            this.databaseCount = databaseCount;
            return this;
        }

        /**
         * <p>The database engine type of the destination instance. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong>: MySQL database, including ApsaraDB RDS for MySQL and self-managed MySQL databases.</li>
         * <li><strong>PolarDB</strong>: PolarDB for MySQL.</li>
         * <li><strong>polardb_o</strong>: PolarDB O DPI engine.</li>
         * <li><strong>polardb_pg</strong>: PolarDB for PostgreSQL.</li>
         * <li><strong>Redis</strong>: Redis database, including Tair (Redis OSS-Compatible) and self-managed Redis databases.</li>
         * <li><strong>DRDS</strong>: cloud-native distributed database PolarDB-X 1.0 and 2.0.</li>
         * <li><strong>PostgreSQL</strong>: self-managed PostgreSQL database.</li>
         * <li><strong>odps</strong>: MaxCompute.</li>
         * <li><strong>oracle</strong>: self-managed Oracle database.</li>
         * <li><strong>mongodb</strong>: MongoDB database, including ApsaraDB for MongoDB and self-managed MongoDB databases.</li>
         * <li><strong>tidb</strong>: TiDB database.</li>
         * <li><strong>ADS</strong>: cloud-native data warehouse AnalyticDB MySQL 2.0.</li>
         * <li><strong>ADB30</strong>: cloud-native data warehouse AnalyticDB MySQL 3.0.</li>
         * <li><strong>Greenplum</strong>: cloud-native data warehouse AnalyticDB PostgreSQL.</li>
         * <li><strong>MSSQL</strong>: SQL Server database, including ApsaraDB RDS for SQL Server and self-managed SQL Server databases.</li>
         * <li><strong>kafka</strong>: Kafka database, including MSMQ Kafka Edition and self-managed Kafka clusters.</li>
         * <li><strong>DataHub</strong>: DataHub.</li>
         * <li><strong>DB2</strong>: self-managed Db2 for LUW database.</li>
         * <li><strong>as400</strong>: AS/400.</li>
         * <li><strong>Tablestore</strong>: Tablestore.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Default value: <strong>MySQL</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>For more information about the supported source and destination databases, see <a href="https://help.aliyun.com/document_detail/130744.html">Supported databases, initial synchronization types, and synchronization topology</a> and <a href="https://help.aliyun.com/document_detail/26618.html">Supported databases and migration types</a>.</li>
         * <li>You must specify this parameter or the <strong>JobId</strong> parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder destinationEndpointEngineName(String destinationEndpointEngineName) {
            this.putQueryParameter("DestinationEndpointEngineName", destinationEndpointEngineName);
            this.destinationEndpointEngineName = destinationEndpointEngineName;
            return this;
        }

        /**
         * <p>The region of the destination instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * <blockquote>
         * <p>You must specify this parameter or the <strong>JobId</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder destinationRegion(String destinationRegion) {
            this.putQueryParameter("DestinationRegion", destinationRegion);
            this.destinationRegion = destinationRegion;
            return this;
        }

        /**
         * <p>The region to which the instance belongs. The value must be the same as the value of the <strong>RegionId</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder dtsRegion(String dtsRegion) {
            this.putQueryParameter("DtsRegion", dtsRegion);
            this.dtsRegion = dtsRegion;
            return this;
        }

        /**
         * <p>The number of DUs allocated to the DTS task in the dedicated DTS cluster. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>The specified value must not exceed the number of available DUs in the dedicated DTS cluster.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>For more information about dedicated DTS clusters, see <a href="https://help.aliyun.com/document_detail/417481.html">What is a dedicated DTS cluster?</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder du(Integer du) {
            this.putQueryParameter("Du", du);
            this.du = du;
            return this;
        }

        /**
         * <p>The billing type for change tracking. Valid values:</p>
         * <ul>
         * <li><strong>ONLY_CONFIGURATION_FEE</strong>: Only configuration fees are charged, and data traffic fees are waived.</li>
         * <li><strong>CONFIGURATION_FEE_AND_DATA_FEE</strong>: Data traffic fees are charged in addition to configuration fees.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLY_CONFIGURATION_FEE</p>
         */
        public Builder feeType(String feeType) {
            this.putQueryParameter("FeeType", feeType);
            this.feeType = feeType;
            return this;
        }

        /**
         * InsightModule.
         */
        public Builder insightModule(Boolean insightModule) {
            this.putQueryParameter("InsightModule", insightModule);
            this.insightModule = insightModule;
            return this;
        }

        /**
         * <p>The specifications of the data migration or data synchronization instance.</p>
         * <ul>
         * <li>Valid values for data migration instances: <strong>xxlarge</strong>, <strong>xlarge</strong>, <strong>large</strong>, <strong>medium</strong>, and <strong>small</strong>.</li>
         * <li>Valid values for data synchronization instances: <strong>large</strong>, <strong>medium</strong>, <strong>small</strong>, and <strong>micro</strong>.</li>
         * </ul>
         * <blockquote>
         * <p>For more information about the performance of different specifications, see <a href="https://help.aliyun.com/document_detail/26606.html">Specifications of data migration links</a> and <a href="https://help.aliyun.com/document_detail/26605.html">Specifications of data synchronization links</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>xxlarge</p>
         */
        public Builder instanceClass(String instanceClass) {
            this.putQueryParameter("InstanceClass", instanceClass);
            this.instanceClass = instanceClass;
            return this;
        }

        /**
         * <p>The task ID (<strong>DtsJobId</strong>) returned by the <strong>ConfigureDtsJob</strong> operation.</p>
         * <blockquote>
         * <p>If you specify this parameter, you do not need to specify the <strong>SourceRegion</strong>, <strong>DestinationRegion</strong>, <strong>Type</strong>, <strong>SourceEndpointEngineName</strong>, or <strong>DestinationEndpointEngineName</strong> parameters. Even if you specify them, the configurations in the <strong>JobId</strong> parameter prevail.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>bi6e22ay243****</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The maximum number of DUs.</p>
         * <blockquote>
         * <p>This parameter is supported only for serverless instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder maxDu(Double maxDu) {
            this.putQueryParameter("MaxDu", maxDu);
            this.maxDu = maxDu;
            return this;
        }

        /**
         * <p>The minimum number of DUs.</p>
         * <blockquote>
         * <p>This parameter is supported only for serverless instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minDu(Double minDu) {
            this.putQueryParameter("MinDu", minDu);
            this.minDu = minDu;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription.</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
         * </ul>
         * <blockquote>
         * <p>Note: This parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The billing method for a subscription instance. Valid values: <strong>Year</strong> and <strong>Month</strong>.</p>
         * <blockquote>
         * <p>This parameter is valid and required only when the <strong>PayType</strong> parameter is set to <strong>PrePaid</strong> (upfront).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The number of instances that you want to purchase.</p>
         * <blockquote>
         * <p>You can purchase only one instance in a single call.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder quantity(Integer quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
            return this;
        }

        /**
         * <p>The region of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The database engine type of the source instance. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong>: MySQL database, including ApsaraDB RDS for MySQL and self-managed MySQL databases.</li>
         * <li><strong>PolarDB</strong>: PolarDB for MySQL.</li>
         * <li><strong>polardb_o</strong>: PolarDB O DPI engine.</li>
         * <li><strong>polardb_pg</strong>: PolarDB for PostgreSQL.</li>
         * <li><strong>Redis</strong>: Redis database, including Tair (Redis OSS-Compatible) and self-managed Redis databases.</li>
         * <li><strong>DRDS</strong>: cloud-native distributed database PolarDB-X 1.0 and 2.0.</li>
         * <li><strong>PostgreSQL</strong>: self-managed PostgreSQL database.</li>
         * <li><strong>odps</strong>: MaxCompute.</li>
         * <li><strong>oracle</strong>: self-managed Oracle database.</li>
         * <li><strong>mongodb</strong>: MongoDB database, including ApsaraDB for MongoDB and self-managed MongoDB databases.</li>
         * <li><strong>tidb</strong>: TiDB database.</li>
         * <li><strong>ADS</strong>: cloud-native data warehouse AnalyticDB MySQL 2.0.</li>
         * <li><strong>ADB30</strong>: cloud-native data warehouse AnalyticDB MySQL 3.0.</li>
         * <li><strong>Greenplum</strong>: cloud-native data warehouse AnalyticDB PostgreSQL.</li>
         * <li><strong>MSSQL</strong>: SQL Server database, including ApsaraDB RDS for SQL Server and self-managed SQL Server databases.</li>
         * <li><strong>kafka</strong>: Kafka database, including MSMQ Kafka Edition and self-managed Kafka clusters.</li>
         * <li><strong>DataHub</strong>: DataHub.</li>
         * <li><strong>DB2</strong>: self-managed Db2 for LUW database.</li>
         * <li><strong>as400</strong>: AS/400.</li>
         * <li><strong>Tablestore</strong>: Tablestore.</li>
         * <li><strong>OceanBase</strong>: OceanBase (MySQL mode). Only data migration instances are supported.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Default value: <strong>MySQL</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>For more information about the supported source and destination databases, see <a href="https://help.aliyun.com/document_detail/130744.html">Supported databases, initial synchronization types, and synchronization topology</a> and <a href="https://help.aliyun.com/document_detail/26618.html">Supported databases and migration types</a>.</li>
         * <li>You must specify this parameter or the <strong>JobId</strong> parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder sourceEndpointEngineName(String sourceEndpointEngineName) {
            this.putQueryParameter("SourceEndpointEngineName", sourceEndpointEngineName);
            this.sourceEndpointEngineName = sourceEndpointEngineName;
            return this;
        }

        /**
         * <p>The region of the source instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * <blockquote>
         * <p>You must specify this parameter or the <strong>JobId</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder sourceRegion(String sourceRegion) {
            this.putQueryParameter("SourceRegion", sourceRegion);
            this.sourceRegion = sourceRegion;
            return this;
        }

        /**
         * <p>The synchronization topology. Valid values:</p>
         * <ul>
         * <li><strong>oneway</strong>: one-way synchronization. This is the default value.</li>
         * <li><strong>bidirectional</strong>: two-way synchronization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oneway</p>
         */
        public Builder syncArchitecture(String syncArchitecture) {
            this.putQueryParameter("SyncArchitecture", syncArchitecture);
            this.syncArchitecture = syncArchitecture;
            return this;
        }

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li><strong>MIGRATION</strong>: data migration.</li>
         * <li><strong>SYNC</strong>: data synchronization.</li>
         * <li><strong>SUBSCRIBE</strong>: change tracking.<blockquote>
         * <p>You must specify this parameter or the <strong>JobId</strong> parameter.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYNC</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The subscription duration of the instance.</p>
         * <ul>
         * <li>Valid values when the <strong>Period</strong> parameter is set to <strong>Month</strong>: 1, 2, 3, 4, 5, 6, 7, 8, and 9.</li>
         * <li>Valid values when the <strong>Period</strong> parameter is set to <strong>Year</strong>: 1, 2, 3, and 5.<blockquote>
         * <ul>
         * <li>This parameter is valid and required only when the <strong>PayType</strong> parameter is set to <strong>PrePaid</strong> (upfront).</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>You can specify the billing method for the subscription instance in the <strong>Period</strong> parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
