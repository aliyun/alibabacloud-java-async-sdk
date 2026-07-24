// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkastreaming20260202.models;

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
 * {@link CreateComputeJobRequest} extends {@link RequestModel}
 *
 * <p>CreateComputeJobRequest</p>
 */
public class CreateComputeJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CuLimit")
    private Double cuLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CuReserved")
    private Double cuReserved;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DraftSql")
    private String draftSql;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobConfig")
    private String jobConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeMode")
    private String upgradeMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private CreateComputeJobRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.cuLimit = builder.cuLimit;
        this.cuReserved = builder.cuReserved;
        this.draftSql = builder.draftSql;
        this.instanceId = builder.instanceId;
        this.jobConfig = builder.jobConfig;
        this.jobName = builder.jobName;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
        this.upgradeMode = builder.upgradeMode;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateComputeJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cuLimit
     */
    public Double getCuLimit() {
        return this.cuLimit;
    }

    /**
     * @return cuReserved
     */
    public Double getCuReserved() {
        return this.cuReserved;
    }

    /**
     * @return draftSql
     */
    public String getDraftSql() {
        return this.draftSql;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobConfig
     */
    public String getJobConfig() {
        return this.jobConfig;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return upgradeMode
     */
    public String getUpgradeMode() {
        return this.upgradeMode;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateComputeJobRequest, Builder> {
        private String clientToken; 
        private Double cuLimit; 
        private Double cuReserved; 
        private String draftSql; 
        private String instanceId; 
        private String jobConfig; 
        private String jobName; 
        private String regionId; 
        private String remark; 
        private String upgradeMode; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateComputeJobRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.cuLimit = request.cuLimit;
            this.cuReserved = request.cuReserved;
            this.draftSql = request.draftSql;
            this.instanceId = request.instanceId;
            this.jobConfig = request.jobConfig;
            this.jobName = request.jobName;
            this.regionId = request.regionId;
            this.remark = request.remark;
            this.upgradeMode = request.upgradeMode;
            this.userId = request.userId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * CuLimit.
         */
        public Builder cuLimit(Double cuLimit) {
            this.putQueryParameter("CuLimit", cuLimit);
            this.cuLimit = cuLimit;
            return this;
        }

        /**
         * CuReserved.
         */
        public Builder cuReserved(Double cuReserved) {
            this.putQueryParameter("CuReserved", cuReserved);
            this.cuReserved = cuReserved;
            return this;
        }

        /**
         * DraftSql.
         */
        public Builder draftSql(String draftSql) {
            this.putQueryParameter("DraftSql", draftSql);
            this.draftSql = draftSql;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * JobConfig.
         */
        public Builder jobConfig(String jobConfig) {
            this.putQueryParameter("JobConfig", jobConfig);
            this.jobConfig = jobConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder jobName(String jobName) {
            this.putQueryParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * UpgradeMode.
         */
        public Builder upgradeMode(String upgradeMode) {
            this.putQueryParameter("UpgradeMode", upgradeMode);
            this.upgradeMode = upgradeMode;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateComputeJobRequest build() {
            return new CreateComputeJobRequest(this);
        } 

    } 

}
