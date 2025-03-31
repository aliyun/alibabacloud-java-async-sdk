// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeApsHiveWorkloadResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApsHiveWorkloadResponseBody</p>
 */
public class DescribeApsHiveWorkloadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApsWorkload")
    private ApsWorkload apsWorkload;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeApsHiveWorkloadResponseBody(Builder builder) {
        this.apsWorkload = builder.apsWorkload;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApsHiveWorkloadResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apsWorkload
     */
    public ApsWorkload getApsWorkload() {
        return this.apsWorkload;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApsWorkload apsWorkload; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeApsHiveWorkloadResponseBody model) {
            this.apsWorkload = model.apsWorkload;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried job.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder apsWorkload(ApsWorkload apsWorkload) {
            this.apsWorkload = apsWorkload;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>86F92D26-B774-5FA1-8E53-******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApsHiveWorkloadResponseBody build() {
            return new DescribeApsHiveWorkloadResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApsHiveWorkloadResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApsHiveWorkloadResponseBody</p>
     */
    public static class ApsWorkload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvancedConfig")
        private String advancedConfig;

        @com.aliyun.core.annotation.NameInMap("ConflictStrategy")
        private String conflictStrategy;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DatasourceId")
        private Long datasourceId;

        @com.aliyun.core.annotation.NameInMap("DatasourceName")
        private String datasourceName;

        @com.aliyun.core.annotation.NameInMap("EmrClusterId")
        private String emrClusterId;

        @com.aliyun.core.annotation.NameInMap("FullComputeUnit")
        private String fullComputeUnit;

        @com.aliyun.core.annotation.NameInMap("MetaStoreUri")
        private String metaStoreUri;

        @com.aliyun.core.annotation.NameInMap("OssLocation")
        private String ossLocation;

        @com.aliyun.core.annotation.NameInMap("Parallelism")
        private Long parallelism;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroup")
        private String resourceGroup;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("SyncAllowExpression")
        private String syncAllowExpression;

        @com.aliyun.core.annotation.NameInMap("SyncDenyExpression")
        private String syncDenyExpression;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("Vswitch")
        private String vswitch;

        @com.aliyun.core.annotation.NameInMap("WorkloadId")
        private String workloadId;

        @com.aliyun.core.annotation.NameInMap("WorkloadName")
        private String workloadName;

        @com.aliyun.core.annotation.NameInMap("WorkloadTypeName")
        private String workloadTypeName;

        private ApsWorkload(Builder builder) {
            this.advancedConfig = builder.advancedConfig;
            this.conflictStrategy = builder.conflictStrategy;
            this.createTime = builder.createTime;
            this.DBClusterId = builder.DBClusterId;
            this.datasourceId = builder.datasourceId;
            this.datasourceName = builder.datasourceName;
            this.emrClusterId = builder.emrClusterId;
            this.fullComputeUnit = builder.fullComputeUnit;
            this.metaStoreUri = builder.metaStoreUri;
            this.ossLocation = builder.ossLocation;
            this.parallelism = builder.parallelism;
            this.regionId = builder.regionId;
            this.resourceGroup = builder.resourceGroup;
            this.state = builder.state;
            this.syncAllowExpression = builder.syncAllowExpression;
            this.syncDenyExpression = builder.syncDenyExpression;
            this.targetType = builder.targetType;
            this.vswitch = builder.vswitch;
            this.workloadId = builder.workloadId;
            this.workloadName = builder.workloadName;
            this.workloadTypeName = builder.workloadTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApsWorkload create() {
            return builder().build();
        }

        /**
         * @return advancedConfig
         */
        public String getAdvancedConfig() {
            return this.advancedConfig;
        }

        /**
         * @return conflictStrategy
         */
        public String getConflictStrategy() {
            return this.conflictStrategy;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return datasourceId
         */
        public Long getDatasourceId() {
            return this.datasourceId;
        }

        /**
         * @return datasourceName
         */
        public String getDatasourceName() {
            return this.datasourceName;
        }

        /**
         * @return emrClusterId
         */
        public String getEmrClusterId() {
            return this.emrClusterId;
        }

        /**
         * @return fullComputeUnit
         */
        public String getFullComputeUnit() {
            return this.fullComputeUnit;
        }

        /**
         * @return metaStoreUri
         */
        public String getMetaStoreUri() {
            return this.metaStoreUri;
        }

        /**
         * @return ossLocation
         */
        public String getOssLocation() {
            return this.ossLocation;
        }

        /**
         * @return parallelism
         */
        public Long getParallelism() {
            return this.parallelism;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroup
         */
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return syncAllowExpression
         */
        public String getSyncAllowExpression() {
            return this.syncAllowExpression;
        }

        /**
         * @return syncDenyExpression
         */
        public String getSyncDenyExpression() {
            return this.syncDenyExpression;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return vswitch
         */
        public String getVswitch() {
            return this.vswitch;
        }

        /**
         * @return workloadId
         */
        public String getWorkloadId() {
            return this.workloadId;
        }

        /**
         * @return workloadName
         */
        public String getWorkloadName() {
            return this.workloadName;
        }

        /**
         * @return workloadTypeName
         */
        public String getWorkloadTypeName() {
            return this.workloadTypeName;
        }

        public static final class Builder {
            private String advancedConfig; 
            private String conflictStrategy; 
            private String createTime; 
            private String DBClusterId; 
            private Long datasourceId; 
            private String datasourceName; 
            private String emrClusterId; 
            private String fullComputeUnit; 
            private String metaStoreUri; 
            private String ossLocation; 
            private Long parallelism; 
            private String regionId; 
            private String resourceGroup; 
            private String state; 
            private String syncAllowExpression; 
            private String syncDenyExpression; 
            private String targetType; 
            private String vswitch; 
            private String workloadId; 
            private String workloadName; 
            private String workloadTypeName; 

            private Builder() {
            } 

            private Builder(ApsWorkload model) {
                this.advancedConfig = model.advancedConfig;
                this.conflictStrategy = model.conflictStrategy;
                this.createTime = model.createTime;
                this.DBClusterId = model.DBClusterId;
                this.datasourceId = model.datasourceId;
                this.datasourceName = model.datasourceName;
                this.emrClusterId = model.emrClusterId;
                this.fullComputeUnit = model.fullComputeUnit;
                this.metaStoreUri = model.metaStoreUri;
                this.ossLocation = model.ossLocation;
                this.parallelism = model.parallelism;
                this.regionId = model.regionId;
                this.resourceGroup = model.resourceGroup;
                this.state = model.state;
                this.syncAllowExpression = model.syncAllowExpression;
                this.syncDenyExpression = model.syncDenyExpression;
                this.targetType = model.targetType;
                this.vswitch = model.vswitch;
                this.workloadId = model.workloadId;
                this.workloadName = model.workloadName;
                this.workloadTypeName = model.workloadTypeName;
            } 

            /**
             * <p>The advanced configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>test.adv.config=value</p>
             */
            public Builder advancedConfig(String advancedConfig) {
                this.advancedConfig = advancedConfig;
                return this;
            }

            /**
             * <p>The policy to handle tables with the same name in the destination cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>Intercept</p>
             */
            public Builder conflictStrategy(String conflictStrategy) {
                this.conflictStrategy = conflictStrategy;
                return this;
            }

            /**
             * <p>The time when the workload was created.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>amv-*******</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder datasourceId(Long datasourceId) {
                this.datasourceId = datasourceId;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>sls-******</p>
             */
            public Builder datasourceName(String datasourceName) {
                this.datasourceName = datasourceName;
                return this;
            }

            /**
             * <p>The ID of the E-MapReduce (EMR) cluster.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder emrClusterId(String emrClusterId) {
                this.emrClusterId = emrClusterId;
                return this;
            }

            /**
             * <p>The number of AnalyticDB compute units (ACUs) required for migration.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder fullComputeUnit(String fullComputeUnit) {
                this.fullComputeUnit = fullComputeUnit;
                return this;
            }

            /**
             * <p>The URL of the Hive Metastore.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder metaStoreUri(String metaStoreUri) {
                this.metaStoreUri = metaStoreUri;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) URL of the AnalyticDB for MySQL cluster data.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://******</p>
             */
            public Builder ossLocation(String ossLocation) {
                this.ossLocation = ossLocation;
                return this;
            }

            /**
             * <p>The number of tasks that are allowed in parallel.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder parallelism(Long parallelism) {
                this.parallelism = parallelism;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource group to which the SQL statement belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * <p>The status of the workload.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETED</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The expression that manually matches the source database table whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder syncAllowExpression(String syncAllowExpression) {
                this.syncAllowExpression = syncAllowExpression;
                return this;
            }

            /**
             * <p>Manually match the blacklist expressions for source database tables.</p>
             * 
             * <strong>example:</strong>
             * <p>def</p>
             */
            public Builder syncDenyExpression(String syncDenyExpression) {
                this.syncDenyExpression = syncDenyExpression;
                return this;
            }

            /**
             * <p>The destination type.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The name of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-******</p>
             */
            public Builder vswitch(String vswitch) {
                this.vswitch = vswitch;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>aps-******</p>
             */
            public Builder workloadId(String workloadId) {
                this.workloadId = workloadId;
                return this;
            }

            /**
             * <p>The name of the workload.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder workloadName(String workloadName) {
                this.workloadName = workloadName;
                return this;
            }

            /**
             * <p>The name of the workload.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder workloadTypeName(String workloadTypeName) {
                this.workloadTypeName = workloadTypeName;
                return this;
            }

            public ApsWorkload build() {
                return new ApsWorkload(this);
            } 

        } 

    }
}
