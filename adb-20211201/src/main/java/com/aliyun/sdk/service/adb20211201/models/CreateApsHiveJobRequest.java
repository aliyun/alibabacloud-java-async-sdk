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
 * {@link CreateApsHiveJobRequest} extends {@link RequestModel}
 *
 * <p>CreateApsHiveJobRequest</p>
 */
public class CreateApsHiveJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdvancedConfig")
    private String advancedConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConflictStrategy")
    private String conflictStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasourceId")
    private Long datasourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FullComputeUnit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fullComputeUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssLocation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossLocation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parallelism")
    private Integer parallelism;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroup")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SyncAllowExpression")
    private String syncAllowExpression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SyncDenyExpression")
    private String syncDenyExpression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkloadName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workloadName;

    private CreateApsHiveJobRequest(Builder builder) {
        super(builder);
        this.advancedConfig = builder.advancedConfig;
        this.conflictStrategy = builder.conflictStrategy;
        this.DBClusterId = builder.DBClusterId;
        this.datasourceId = builder.datasourceId;
        this.fullComputeUnit = builder.fullComputeUnit;
        this.ossLocation = builder.ossLocation;
        this.parallelism = builder.parallelism;
        this.regionId = builder.regionId;
        this.resourceGroup = builder.resourceGroup;
        this.syncAllowExpression = builder.syncAllowExpression;
        this.syncDenyExpression = builder.syncDenyExpression;
        this.targetType = builder.targetType;
        this.workloadName = builder.workloadName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApsHiveJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return fullComputeUnit
     */
    public String getFullComputeUnit() {
        return this.fullComputeUnit;
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
    public Integer getParallelism() {
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
     * @return workloadName
     */
    public String getWorkloadName() {
        return this.workloadName;
    }

    public static final class Builder extends Request.Builder<CreateApsHiveJobRequest, Builder> {
        private String advancedConfig; 
        private String conflictStrategy; 
        private String DBClusterId; 
        private Long datasourceId; 
        private String fullComputeUnit; 
        private String ossLocation; 
        private Integer parallelism; 
        private String regionId; 
        private String resourceGroup; 
        private String syncAllowExpression; 
        private String syncDenyExpression; 
        private String targetType; 
        private String workloadName; 

        private Builder() {
            super();
        } 

        private Builder(CreateApsHiveJobRequest request) {
            super(request);
            this.advancedConfig = request.advancedConfig;
            this.conflictStrategy = request.conflictStrategy;
            this.DBClusterId = request.DBClusterId;
            this.datasourceId = request.datasourceId;
            this.fullComputeUnit = request.fullComputeUnit;
            this.ossLocation = request.ossLocation;
            this.parallelism = request.parallelism;
            this.regionId = request.regionId;
            this.resourceGroup = request.resourceGroup;
            this.syncAllowExpression = request.syncAllowExpression;
            this.syncDenyExpression = request.syncDenyExpression;
            this.targetType = request.targetType;
            this.workloadName = request.workloadName;
        } 

        /**
         * <p>The advanced configurations.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder advancedConfig(String advancedConfig) {
            this.putBodyParameter("AdvancedConfig", advancedConfig);
            this.advancedConfig = advancedConfig;
            return this;
        }

        /**
         * <p>The policy to handle tables with the same name in the destination cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>Intercept: reports error and aborts.
         * Ignore: ignores and continues migrating the relevant tables.
         * Skip: skips related tables and only migrates other tables.</p>
         */
        public Builder conflictStrategy(String conflictStrategy) {
            this.putBodyParameter("ConflictStrategy", conflictStrategy);
            this.conflictStrategy = conflictStrategy;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder datasourceId(Long datasourceId) {
            this.putBodyParameter("DatasourceId", datasourceId);
            this.datasourceId = datasourceId;
            return this;
        }

        /**
         * <p>The number of AnalyticDB compute units (ACUs) required for data migration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder fullComputeUnit(String fullComputeUnit) {
            this.putBodyParameter("FullComputeUnit", fullComputeUnit);
            this.fullComputeUnit = fullComputeUnit;
            return this;
        }

        /**
         * <p>The path of the destination data lakehouse in an Object Storage Service (OSS) bucket.</p>
         * <p>This parameter is required.</p>
         */
        public Builder ossLocation(String ossLocation) {
            this.putBodyParameter("OssLocation", ossLocation);
            this.ossLocation = ossLocation;
            return this;
        }

        /**
         * <p>The number of tasks that are allowed in parallel.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder parallelism(Integer parallelism) {
            this.putBodyParameter("Parallelism", parallelism);
            this.parallelism = parallelism;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the resource group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user_default</p>
         */
        public Builder resourceGroup(String resourceGroup) {
            this.putBodyParameter("ResourceGroup", resourceGroup);
            this.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * <p>The expression that allows objects to be synchronized.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder syncAllowExpression(String syncAllowExpression) {
            this.putBodyParameter("SyncAllowExpression", syncAllowExpression);
            this.syncAllowExpression = syncAllowExpression;
            return this;
        }

        /**
         * <p>The expression that denies objects to be synchronized.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder syncDenyExpression(String syncDenyExpression) {
            this.putBodyParameter("SyncDenyExpression", syncDenyExpression);
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
            this.putBodyParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The name of the workload.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx-20240224100253</p>
         */
        public Builder workloadName(String workloadName) {
            this.putBodyParameter("WorkloadName", workloadName);
            this.workloadName = workloadName;
            return this;
        }

        @Override
        public CreateApsHiveJobRequest build() {
            return new CreateApsHiveJobRequest(this);
        } 

    } 

}
