// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link CreateElasticRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateElasticRuleRequest</p>
 */
public class CreateElasticRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticRuleStartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String elasticRuleStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutionPeriod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String executionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateElasticRuleRequest(Builder builder) {
        super(builder);
        this.clusterClass = builder.clusterClass;
        this.clusterId = builder.clusterId;
        this.dbInstanceId = builder.dbInstanceId;
        this.elasticRuleStartTime = builder.elasticRuleStartTime;
        this.executionPeriod = builder.executionPeriod;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateElasticRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterClass
     */
    public String getClusterClass() {
        return this.clusterClass;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * @return elasticRuleStartTime
     */
    public String getElasticRuleStartTime() {
        return this.elasticRuleStartTime;
    }

    /**
     * @return executionPeriod
     */
    public String getExecutionPeriod() {
        return this.executionPeriod;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<CreateElasticRuleRequest, Builder> {
        private String clusterClass; 
        private String clusterId; 
        private String dbInstanceId; 
        private String elasticRuleStartTime; 
        private String executionPeriod; 
        private String regionId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateElasticRuleRequest request) {
            super(request);
            this.clusterClass = request.clusterClass;
            this.clusterId = request.clusterId;
            this.dbInstanceId = request.dbInstanceId;
            this.elasticRuleStartTime = request.elasticRuleStartTime;
            this.executionPeriod = request.executionPeriod;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb.2xlarge</p>
         */
        public Builder clusterClass(String clusterClass) {
            this.putQueryParameter("ClusterClass", clusterClass);
            this.clusterClass = clusterClass;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-xxxb9f2w-be</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****</p>
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putQueryParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        public Builder elasticRuleStartTime(String elasticRuleStartTime) {
            this.putQueryParameter("ElasticRuleStartTime", elasticRuleStartTime);
            this.elasticRuleStartTime = elasticRuleStartTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Day</p>
         */
        public Builder executionPeriod(String executionPeriod) {
            this.putQueryParameter("ExecutionPeriod", executionPeriod);
            this.executionPeriod = executionPeriod;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public CreateElasticRuleRequest build() {
            return new CreateElasticRuleRequest(this);
        } 

    } 

}
