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
 * {@link ConfigureSynchronizationJobRequest} extends {@link RequestModel}
 *
 * <p>ConfigureSynchronizationJobRequest</p>
 */
public class ConfigureSynchronizationJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpoint")
    private DestinationEndpoint destinationEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PartitionKey")
    private PartitionKey partitionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpoint")
    private SourceEndpoint sourceEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Checkpoint")
    private String checkpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataInitialization")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean dataInitialization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MigrationReserved")
    private String migrationReserved;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StructureInitialization")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean structureInitialization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SynchronizationJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String synchronizationJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SynchronizationJobName")
    private String synchronizationJobName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SynchronizationObjects")
    @com.aliyun.core.annotation.Validation(required = true)
    private String synchronizationObjects;

    private ConfigureSynchronizationJobRequest(Builder builder) {
        super(builder);
        this.destinationEndpoint = builder.destinationEndpoint;
        this.partitionKey = builder.partitionKey;
        this.sourceEndpoint = builder.sourceEndpoint;
        this.accountId = builder.accountId;
        this.checkpoint = builder.checkpoint;
        this.dataInitialization = builder.dataInitialization;
        this.migrationReserved = builder.migrationReserved;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.structureInitialization = builder.structureInitialization;
        this.synchronizationDirection = builder.synchronizationDirection;
        this.synchronizationJobId = builder.synchronizationJobId;
        this.synchronizationJobName = builder.synchronizationJobName;
        this.synchronizationObjects = builder.synchronizationObjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigureSynchronizationJobRequest create() {
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
     * @return partitionKey
     */
    public PartitionKey getPartitionKey() {
        return this.partitionKey;
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
     * @return checkpoint
     */
    public String getCheckpoint() {
        return this.checkpoint;
    }

    /**
     * @return dataInitialization
     */
    public Boolean getDataInitialization() {
        return this.dataInitialization;
    }

    /**
     * @return migrationReserved
     */
    public String getMigrationReserved() {
        return this.migrationReserved;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
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
     * @return structureInitialization
     */
    public Boolean getStructureInitialization() {
        return this.structureInitialization;
    }

    /**
     * @return synchronizationDirection
     */
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    /**
     * @return synchronizationJobId
     */
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    /**
     * @return synchronizationJobName
     */
    public String getSynchronizationJobName() {
        return this.synchronizationJobName;
    }

    /**
     * @return synchronizationObjects
     */
    public String getSynchronizationObjects() {
        return this.synchronizationObjects;
    }

    public static final class Builder extends Request.Builder<ConfigureSynchronizationJobRequest, Builder> {
        private DestinationEndpoint destinationEndpoint; 
        private PartitionKey partitionKey; 
        private SourceEndpoint sourceEndpoint; 
        private String accountId; 
        private String checkpoint; 
        private Boolean dataInitialization; 
        private String migrationReserved; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private Boolean structureInitialization; 
        private String synchronizationDirection; 
        private String synchronizationJobId; 
        private String synchronizationJobName; 
        private String synchronizationObjects; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureSynchronizationJobRequest request) {
            super(request);
            this.destinationEndpoint = request.destinationEndpoint;
            this.partitionKey = request.partitionKey;
            this.sourceEndpoint = request.sourceEndpoint;
            this.accountId = request.accountId;
            this.checkpoint = request.checkpoint;
            this.dataInitialization = request.dataInitialization;
            this.migrationReserved = request.migrationReserved;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.structureInitialization = request.structureInitialization;
            this.synchronizationDirection = request.synchronizationDirection;
            this.synchronizationJobId = request.synchronizationJobId;
            this.synchronizationJobName = request.synchronizationJobName;
            this.synchronizationObjects = request.synchronizationObjects;
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
         * PartitionKey.
         */
        public Builder partitionKey(PartitionKey partitionKey) {
            this.putQueryParameter("PartitionKey", partitionKey);
            this.partitionKey = partitionKey;
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
         * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because it will be discontinued.</p>
         * 
         * <strong>example:</strong>
         * <p>12323344****</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The synchronization checkpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>1610540493</p>
         */
        public Builder checkpoint(String checkpoint) {
            this.putQueryParameter("Checkpoint", checkpoint);
            this.checkpoint = checkpoint;
            return this;
        }

        /**
         * <p>Specifies whether to perform initial full data synchronization. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * <blockquote>
         * <p>Default value: <strong>true</strong>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dataInitialization(Boolean dataInitialization) {
            this.putQueryParameter("DataInitialization", dataInitialization);
            this.dataInitialization = dataInitialization;
            return this;
        }

        /**
         * <p>The reserved parameter of DTS. The value is a JSON string. You can specify this parameter to meet special requirements, such as specifying whether to automatically start the precheck. For more information, see <a href="https://help.aliyun.com/document_detail/176470.html">MigrationReserved parameter description</a>.</p>
         * <blockquote>
         * <p>For example, you can use this parameter for data synchronization between ApsaraDB for Redis Enhanced Edition (Tair) instances. For more information, see <a href="https://help.aliyun.com/document_detail/155967.html">Use OpenAPI to configure one-way or bidirectional data synchronization between ApsaraDB for Redis Enhanced Edition instances</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;autoStartModulesAfterConfig&quot;: &quot;none&quot;,     &quot;targetTableMode&quot;: 2 }</p>
         */
        public Builder migrationReserved(String migrationReserved) {
            this.putQueryParameter("MigrationReserved", migrationReserved);
            this.migrationReserved = migrationReserved;
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
         * <p>The ID of the region where the data synchronization instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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
         * <p>The resource group ID.</p>
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
         * <p>Specifies whether to perform initial schema synchronization. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong>: no.</li>
         * </ul>
         * <blockquote>
         * <p>Default value: <strong>true</strong>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder structureInitialization(Boolean structureInitialization) {
            this.putQueryParameter("StructureInitialization", structureInitialization);
            this.structureInitialization = structureInitialization;
            return this;
        }

        /**
         * <p>The synchronization direction. Valid values:</p>
         * <ul>
         * <li><strong>Forward</strong>: forward.</li>
         * <li><strong>Reverse</strong>: reverse.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Default value: <strong>Forward</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>This parameter takes effect only if you set it to <strong>Reverse</strong> and the synchronization topology of the data synchronization instance is two-way synchronization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Forward</p>
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.putQueryParameter("SynchronizationDirection", synchronizationDirection);
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        /**
         * <p>The ID of the data synchronization instance. You can call the <a href="https://help.aliyun.com/document_detail/49454.html">DescribeSynchronizationJobs</a> operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsz4ao1dor13d****</p>
         */
        public Builder synchronizationJobId(String synchronizationJobId) {
            this.putQueryParameter("SynchronizationJobId", synchronizationJobId);
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }

        /**
         * <p>The name of the synchronization task.</p>
         * <blockquote>
         * <p>Specify a descriptive name that makes it easy to identify the task. It does not need to be unique.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MySQL同步</p>
         */
        public Builder synchronizationJobName(String synchronizationJobName) {
            this.putQueryParameter("SynchronizationJobName", synchronizationJobName);
            this.synchronizationJobName = synchronizationJobName;
            return this;
        }

        /**
         * <p>The objects to be synchronized. The value is a JSON string and supports certain regular expressions. For more information, see <a href="https://help.aliyun.com/document_detail/141901.html">Synchronization object configuration</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;DBName&quot;:&quot;dtstestdata&quot;,&quot;TableIncludes&quot;:[{&quot;TableName&quot;:&quot;customer&quot;}]}]</p>
         */
        public Builder synchronizationObjects(String synchronizationObjects) {
            this.putBodyParameter("SynchronizationObjects", synchronizationObjects);
            this.synchronizationObjects = synchronizationObjects;
            return this;
        }

        @Override
        public ConfigureSynchronizationJobRequest build() {
            return new ConfigureSynchronizationJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link ConfigureSynchronizationJobRequest} extends {@link TeaModel}
     *
     * <p>ConfigureSynchronizationJobRequest</p>
     */
    public static class DestinationEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataBaseName")
        private String dataBaseName;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private DestinationEndpoint(Builder builder) {
            this.dataBaseName = builder.dataBaseName;
            this.ip = builder.ip;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.password = builder.password;
            this.port = builder.port;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationEndpoint create() {
            return builder().build();
        }

        /**
         * @return dataBaseName
         */
        public String getDataBaseName() {
            return this.dataBaseName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
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
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String dataBaseName; 
            private String ip; 
            private String instanceId; 
            private String instanceType; 
            private String password; 
            private String port; 
            private String userName; 

            private Builder() {
            } 

            private Builder(DestinationEndpoint model) {
                this.dataBaseName = model.dataBaseName;
                this.ip = model.ip;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.password = model.password;
                this.port = model.port;
                this.userName = model.userName;
            } 

            /**
             * <p>目标实例中的同步对象所属数据库名称。</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder dataBaseName(String dataBaseName) {
                this.dataBaseName = dataBaseName;
                return this;
            }

            /**
             * <p>目标库的IP地址。</p>
             * <blockquote>
             * <p>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>Express</strong>、<strong>dg</strong>或<strong>cen</strong>时，本参数必须传入本参数才可用且必须传入。</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>172.16.88.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>同步目标实例的实例ID</p>
             * <blockquote>
             * <p>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>MaxCompute</strong>或<strong>DataHub</strong>时，本参数传入MaxCompute实例或DataHub的Project名称。
             * 当目标实例为阿里云分析型数据库MySQL版时，传入分析型数据库MySQL版的集群ID。</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1r46452ai50****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>目标实例类型，取值为：</p>
             * <ul>
             * <li><strong>Redis</strong>：阿里云Redis实例。</li>
             * <li><strong>RDS</strong>：阿里云RDS实例。</li>
             * <li><strong>PolarDB</strong>：阿里云PolarDB集群（仅支持MySQL或兼容Oracle语法的引擎）。</li>
             * <li><strong>ECS</strong>：ECS上的自建数据库。</li>
             * <li><strong>Express</strong>：通过专线接入的本地数据库。</li>
             * <li><strong>DataHub</strong>：阿里云DataHub实例。</li>
             * <li><strong>MaxCompute</strong>：阿里云MaxCompute实例。</li>
             * <li><strong>AnalyticDB</strong>：云原生数据仓库AnalyticDB MySQL  3.0和2.0版本。</li>
             * <li><strong>Greenplum</strong>：云原生数据仓库ADB PostgreSQL版（原分析型数据库PostgreSQL版）。</li>
             * </ul>
             * <blockquote>
             * <p>默认取值为<strong>RDS</strong>。</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>目标库数据库账号密码。</p>
             * <blockquote>
             * <ul>
             * <li>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>ECS</strong>、<strong>Express</strong>、<strong>dg</strong>或<strong>cen</strong>时，本参数必须传入。</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Test654321</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>目标库的数据库服务端口。</p>
             * <blockquote>
             * <p>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>ECS</strong>、<strong>Express</strong>、<strong>dg</strong>或<strong>cen</strong>时，本参数才可用且必须传入。</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>目标库的数据库账号。</p>
             * <blockquote>
             * <ul>
             * <li>同步不同的数据库所需的权限有所差异，详情请参见<a href="https://help.aliyun.com/document_detail/140954.html">DTS数据同步方案概览</a>中对应的配置案例。</li>
             * </ul>
             * </blockquote>
             * <ul>
             * <li>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>ECS</strong>、<strong>Express</strong>、<strong>dg</strong>或<strong>cen</strong>时，本参数必须传入。</li>
             * <li>当<strong>DestinationEndpoint.InstanceType</strong>取值为RDS且数据库版本为MySQL 5.5或MySQL 5.6，无需传入本参数和<strong>DestinationEndpoint.Password</strong>参数。</li>
             * <li>当<strong>DestinationEndpoint.InstanceType</strong>取值为<strong>Redis</strong>时，无需传入本参数。</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dtstestaccount</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public DestinationEndpoint build() {
                return new DestinationEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConfigureSynchronizationJobRequest} extends {@link TeaModel}
     *
     * <p>ConfigureSynchronizationJobRequest</p>
     */
    public static class PartitionKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModifyTime_Day")
        private Boolean modifyTimeDay;

        @com.aliyun.core.annotation.NameInMap("ModifyTime_Hour")
        private Boolean modifyTimeHour;

        @com.aliyun.core.annotation.NameInMap("ModifyTime_Minute")
        private Boolean modifyTimeMinute;

        @com.aliyun.core.annotation.NameInMap("ModifyTime_Month")
        private Boolean modifyTimeMonth;

        @com.aliyun.core.annotation.NameInMap("ModifyTime_Year")
        private Boolean modifyTimeYear;

        private PartitionKey(Builder builder) {
            this.modifyTimeDay = builder.modifyTimeDay;
            this.modifyTimeHour = builder.modifyTimeHour;
            this.modifyTimeMinute = builder.modifyTimeMinute;
            this.modifyTimeMonth = builder.modifyTimeMonth;
            this.modifyTimeYear = builder.modifyTimeYear;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartitionKey create() {
            return builder().build();
        }

        /**
         * @return modifyTimeDay
         */
        public Boolean getModifyTimeDay() {
            return this.modifyTimeDay;
        }

        /**
         * @return modifyTimeHour
         */
        public Boolean getModifyTimeHour() {
            return this.modifyTimeHour;
        }

        /**
         * @return modifyTimeMinute
         */
        public Boolean getModifyTimeMinute() {
            return this.modifyTimeMinute;
        }

        /**
         * @return modifyTimeMonth
         */
        public Boolean getModifyTimeMonth() {
            return this.modifyTimeMonth;
        }

        /**
         * @return modifyTimeYear
         */
        public Boolean getModifyTimeYear() {
            return this.modifyTimeYear;
        }

        public static final class Builder {
            private Boolean modifyTimeDay; 
            private Boolean modifyTimeHour; 
            private Boolean modifyTimeMinute; 
            private Boolean modifyTimeMonth; 
            private Boolean modifyTimeYear; 

            private Builder() {
            } 

            private Builder(PartitionKey model) {
                this.modifyTimeDay = model.modifyTimeDay;
                this.modifyTimeHour = model.modifyTimeHour;
                this.modifyTimeMinute = model.modifyTimeMinute;
                this.modifyTimeMonth = model.modifyTimeMonth;
                this.modifyTimeYear = model.modifyTimeYear;
            } 

            /**
             * <p>设置增量日志表是否包含以增量更新时间对应日期信息定义的分区，取值：<strong>true</strong>或<strong>false</strong>。</p>
             * <blockquote>
             * <p>当<strong>DestinationEndpoint.InstanceType</strong>参数取值为<strong>Maxcompute</strong>时，本参数才可用。</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder modifyTimeDay(Boolean modifyTimeDay) {
                this.modifyTimeDay = modifyTimeDay;
                return this;
            }

            /**
             * <p>设置增量日志表是否包含以增量更新时间对应小时信息定义的分区，取值：<strong>true</strong>或<strong>false</strong>。</p>
             * <blockquote>
             * <p>当<strong>DestinationEndpoint.InstanceType</strong>参数取值为<strong>Maxcompute</strong>时，本参数才可用。</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder modifyTimeHour(Boolean modifyTimeHour) {
                this.modifyTimeHour = modifyTimeHour;
                return this;
            }

            /**
             * <p>设置增量日志表是否包含以增量更新时间对应分钟信息定义的分区，取值：<strong>true</strong>或<strong>false</strong>。</p>
             * <blockquote>
             * <p>当<strong>DestinationEndpoint.InstanceType</strong>参数取值为<strong>Maxcompute</strong>时，本参数才可用。</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder modifyTimeMinute(Boolean modifyTimeMinute) {
                this.modifyTimeMinute = modifyTimeMinute;
                return this;
            }

            /**
             * <p>设置增量日志表是否包含以增量更新时间对应月份信息定义的分区，取值：<strong>true</strong>或<strong>false</strong>。</p>
             * <blockquote>
             * <p>当<strong>DestinationEndpoint.InstanceType</strong>参数取值为<strong>Maxcompute</strong>时，本参数才可用。</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder modifyTimeMonth(Boolean modifyTimeMonth) {
                this.modifyTimeMonth = modifyTimeMonth;
                return this;
            }

            /**
             * <p>设置增量日志表是否包含以增量更新时间对应年份信息定义的分区，取值：<strong>true</strong>或<strong>false</strong>。</p>
             * <blockquote>
             * <p>当<strong>DestinationEndpoint.InstanceType</strong>参数取值为<strong>Maxcompute</strong>时，本参数才可用。</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder modifyTimeYear(Boolean modifyTimeYear) {
                this.modifyTimeYear = modifyTimeYear;
                return this;
            }

            public PartitionKey build() {
                return new PartitionKey(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConfigureSynchronizationJobRequest} extends {@link TeaModel}
     *
     * <p>ConfigureSynchronizationJobRequest</p>
     */
    public static class SourceEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("OwnerID")
        private String ownerID;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private SourceEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.ip = builder.ip;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.ownerID = builder.ownerID;
            this.password = builder.password;
            this.port = builder.port;
            this.role = builder.role;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
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
         * @return ownerID
         */
        public String getOwnerID() {
            return this.ownerID;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String databaseName; 
            private String ip; 
            private String instanceId; 
            private String instanceType; 
            private String ownerID; 
            private String password; 
            private String port; 
            private String role; 
            private String userName; 

            private Builder() {
            } 

            private Builder(SourceEndpoint model) {
                this.databaseName = model.databaseName;
                this.ip = model.ip;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.ownerID = model.ownerID;
                this.password = model.password;
                this.port = model.port;
                this.role = model.role;
                this.userName = model.userName;
            } 

            /**
             * <p>源实例中的同步对象所属数据库名称。</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>源库的IP地址。</p>
             * <blockquote>
             * <p>当<strong>SourceEndpoint.InstanceType</strong>取值为<strong>ECS</strong>、<strong>Express</strong>、<strong>dg</strong>或<strong>cen</strong>时，本参数才可用且必须传入。</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>172.16.88.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>源实例ID。</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1i99e8l7913****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>源实例类型，取值为：</p>
             * <ul>
             * <li><strong>RDS</strong>：阿里云RDS实例。</li>
             * <li><strong>Redis</strong>：阿里云Redis实例。</li>
             * <li><strong>PolarDB</strong>：阿里云PolarDB集群（仅支持MySQL或兼容Oracle语法的引擎）。</li>
             * <li><strong>ECS</strong>：ECS上的自建数据库。</li>
             * <li><strong>Express</strong>：通过专线接入的自建数据库。</li>
             * <li><strong>dg</strong>：通过数据库网关DG接入的自建数据库。</li>
             * <li><strong>cen</strong>：通过云企业网CEN接入的自建数据库。</li>
             * </ul>
             * <blockquote>
             * <p>默认取值为<strong>RDS</strong>。</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>源RDS实例所属的阿里云账号ID。</p>
             * <blockquote>
             * <p>传入本参数即代表执行跨阿里云账号的数据同步，同时您还需要传入<strong>SourceEndpoint.Role</strong>参数。</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>140692647406****</p>
             */
            public Builder ownerID(String ownerID) {
                this.ownerID = ownerID;
                return this;
            }

            /**
             * <p>源库数据库账号密码。</p>
             * <blockquote>
             * <p>当<strong>SourceEndpoint.InstanceType</strong>取值为<strong>ECS</strong>、<strong>Express</strong>、<strong>dg</strong>或<strong>cen</strong>时，本参数必须传入。</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Test123456</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>源库的数据库服务端口。</p>
             * <blockquote>
             * <p>当<strong>SourceEndpoint.InstanceType</strong>取值为<strong>ECS</strong>、<strong>Express</strong>、<strong>dg</strong>或<strong>cen</strong>时，本参数才可用且必须传入。</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>源实例所属云账号配置的角色名称。</p>
             * <blockquote>
             * <p>执行跨阿里云账号的数据同步时须传入本参数，该角色所需的权限及授权方式请参见<a href="https://help.aliyun.com/document_detail/48468.html">跨阿里云账号数据迁移或同步时如何配置RAM授权</a>。</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ram-for-dts</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>源库的数据库账号。</p>
             * <blockquote>
             * <ul>
             * <li>当<strong>SourceEndpoint.InstanceType</strong>取值为<strong>ECS</strong>、<strong>Express</strong>、<strong>dg</strong>或<strong>cen</strong>时，本参数才可用且必须传入。</li>
             * </ul>
             * </blockquote>
             * <ul>
             * <li>当<strong>SourceEndpoint.InstanceType</strong>取值为<strong>Redis</strong>时，本参数无需传入。</li>
             * <li>同步不同的数据库所需的权限有所差异，详情请参见<a href="https://help.aliyun.com/document_detail/140954.html">DTS数据同步方案概览</a>中对应的配置案例。</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dtstestaccount</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SourceEndpoint build() {
                return new SourceEndpoint(this);
            } 

        } 

    }
}
