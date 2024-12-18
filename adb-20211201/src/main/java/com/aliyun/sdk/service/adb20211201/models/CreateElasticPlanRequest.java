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
 * {@link CreateElasticPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateElasticPlanRequest</p>
 */
public class CreateElasticPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoScale")
    private Boolean autoScale;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CronExpression")
    private String cronExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticPlanName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String elasticPlanName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    private String resourceGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetSize")
    private String targetSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateElasticPlanRequest(Builder builder) {
        super(builder);
        this.autoScale = builder.autoScale;
        this.cronExpression = builder.cronExpression;
        this.DBClusterId = builder.DBClusterId;
        this.elasticPlanName = builder.elasticPlanName;
        this.enabled = builder.enabled;
        this.endTime = builder.endTime;
        this.resourceGroupName = builder.resourceGroupName;
        this.startTime = builder.startTime;
        this.targetSize = builder.targetSize;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateElasticPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoScale
     */
    public Boolean getAutoScale() {
        return this.autoScale;
    }

    /**
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return elasticPlanName
     */
    public String getElasticPlanName() {
        return this.elasticPlanName;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return targetSize
     */
    public String getTargetSize() {
        return this.targetSize;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateElasticPlanRequest, Builder> {
        private Boolean autoScale; 
        private String cronExpression; 
        private String DBClusterId; 
        private String elasticPlanName; 
        private Boolean enabled; 
        private String endTime; 
        private String resourceGroupName; 
        private String startTime; 
        private String targetSize; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateElasticPlanRequest request) {
            super(request);
            this.autoScale = request.autoScale;
            this.cronExpression = request.cronExpression;
            this.DBClusterId = request.DBClusterId;
            this.elasticPlanName = request.elasticPlanName;
            this.enabled = request.enabled;
            this.endTime = request.endTime;
            this.resourceGroupName = request.resourceGroupName;
            this.startTime = request.startTime;
            this.targetSize = request.targetSize;
            this.type = request.type;
        } 

        /**
         * <p>Specifies whether to enable <strong>Default Proportional Scaling for EIUs</strong>. Valid values:</p>
         * <ul>
         * <li>true. In this case, storage resources are scaled along with computing resources, and the TargetSize and CronExpression parameters are not supported.</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter must be specified when Type is set to WORKER. This parameter is not required when Type is set to EXECUTOR.</p>
         * </li>
         * <li><p>You can enable Default Proportional Scaling for EIUs for only a single scaling plan of a cluster.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoScale(Boolean autoScale) {
            this.putQueryParameter("AutoScale", autoScale);
            this.autoScale = autoScale;
            return this;
        }

        /**
         * <p>A CORN expression that specifies the scaling cycle and time for the scaling plan.</p>
         * 
         * <strong>example:</strong>
         * <p>0 20 14 * * ?</p>
         */
        public Builder cronExpression(String cronExpression) {
            this.putQueryParameter("CronExpression", cronExpression);
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-wz9509beptiz****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The name of the scaling plan.</p>
         * <blockquote>
         * <p> The name must be 2 to 30 characters in length and can contain letters, digits, and underscores (_). The name must start with a letter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder elasticPlanName(String elasticPlanName) {
            this.putQueryParameter("ElasticPlanName", elasticPlanName);
            this.elasticPlanName = elasticPlanName;
            return this;
        }

        /**
         * <p>Specifies whether to immediately enable the scaling plan after the plan is created. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The end time of the scaling plan.</p>
         * <blockquote>
         * <p> Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T12:01:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The name of the resource group.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you want to create a scaling plan that uses interactive resource groups, you must specify this parameter. If you want to create a scaling plan that uses elastic I/O units (EIUs), you do not need to specify this parameter.</p>
         * </li>
         * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/459446.html">DescribeDBResourceGroup</a> operation to query the resource group name for a cluster.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putQueryParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * <p>The start time of the scaling plan.</p>
         * <blockquote>
         * <p> Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01T12:01:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The desired specifications of elastic resources after scaling.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If the scaling plan uses <strong>EIUs</strong> and <strong>Default Proportional Scaling for EIUs</strong> is enabled, you do not need to specify this parameter. In other cases, you must specify this parameter.</p>
         * </li>
         * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/601278.html">DescribeElasticPlanSpecifications</a> operation to query the specifications that are supported for scaling plans.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>32ACU</p>
         */
        public Builder targetSize(String targetSize) {
            this.putQueryParameter("TargetSize", targetSize);
            this.targetSize = targetSize;
            return this;
        }

        /**
         * <p>The type of the scaling plan. Valid values:</p>
         * <ul>
         * <li>EXECUTOR: the interactive resource group type, which indicates the computing resource type.</li>
         * <li>WORKER: the EIU type.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EXECUTOR</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateElasticPlanRequest build() {
            return new CreateElasticPlanRequest(this);
        } 

    } 

}
