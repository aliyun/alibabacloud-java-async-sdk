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
 * {@link ModifyElasticPlanRequest} extends {@link RequestModel}
 *
 * <p>ModifyElasticPlanRequest</p>
 */
public class ModifyElasticPlanRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetSize")
    private String targetSize;

    private ModifyElasticPlanRequest(Builder builder) {
        super(builder);
        this.cronExpression = builder.cronExpression;
        this.DBClusterId = builder.DBClusterId;
        this.elasticPlanName = builder.elasticPlanName;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
        this.targetSize = builder.targetSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyElasticPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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

    public static final class Builder extends Request.Builder<ModifyElasticPlanRequest, Builder> {
        private String cronExpression; 
        private String DBClusterId; 
        private String elasticPlanName; 
        private String endTime; 
        private String startTime; 
        private String targetSize; 

        private Builder() {
            super();
        } 

        private Builder(ModifyElasticPlanRequest request) {
            super(request);
            this.cronExpression = request.cronExpression;
            this.DBClusterId = request.DBClusterId;
            this.elasticPlanName = request.elasticPlanName;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
            this.targetSize = request.targetSize;
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
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL clusters within a region.</p>
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
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/601334.html">DescribeElasticPlans</a> operation to query the names of scaling plans.</p>
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

        @Override
        public ModifyElasticPlanRequest build() {
            return new ModifyElasticPlanRequest(this);
        } 

    } 

}
