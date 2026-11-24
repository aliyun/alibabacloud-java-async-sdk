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
 * {@link StartComputeJobRequest} extends {@link RequestModel}
 *
 * <p>StartComputeJobRequest</p>
 */
public class StartComputeJobRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("JobName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecoveryMode")
    private String recoveryMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private StartComputeJobRequest(Builder builder) {
        super(builder);
        this.cuLimit = builder.cuLimit;
        this.cuReserved = builder.cuReserved;
        this.draftSql = builder.draftSql;
        this.instanceId = builder.instanceId;
        this.jobName = builder.jobName;
        this.recoveryMode = builder.recoveryMode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartComputeJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return recoveryMode
     */
    public String getRecoveryMode() {
        return this.recoveryMode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StartComputeJobRequest, Builder> {
        private Double cuLimit; 
        private Double cuReserved; 
        private String draftSql; 
        private String instanceId; 
        private String jobName; 
        private String recoveryMode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StartComputeJobRequest request) {
            super(request);
            this.cuLimit = request.cuLimit;
            this.cuReserved = request.cuReserved;
            this.draftSql = request.draftSql;
            this.instanceId = request.instanceId;
            this.jobName = request.jobName;
            this.recoveryMode = request.recoveryMode;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The CU limit for the job. Integers and decimals are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        public Builder cuLimit(Double cuLimit) {
            this.putQueryParameter("CuLimit", cuLimit);
            this.cuLimit = cuLimit;
            return this;
        }

        /**
         * <p>The number of reserved CUs for the job. Integers and decimals are supported.</p>
         * <blockquote>
         * <p>The number of reserved CUs cannot exceed the CU limit.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        public Builder cuReserved(Double cuReserved) {
            this.putQueryParameter("CuReserved", cuReserved);
            this.cuReserved = cuReserved;
            return this;
        }

        /**
         * <p><strong>The Flink SQL draft, which must be a self-contained and complete DDL and DML statement.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>CREATE TEMPORARY TABLE src (id BIGINT) WITH (\&quot;connector\&quot; = \&quot;datagen\&quot;); CREATE TEMPORARY TABLE sink (id BIGINT) WITH (\&quot;connector\&quot; = \&quot;print\&quot;); INSERT INTO sink SELECT id FROM src;</p>
         */
        public Builder draftSql(String draftSql) {
            this.putQueryParameter("DraftSql", draftSql);
            this.draftSql = draftSql;
            return this;
        }

        /**
         * <p><strong>The compute instance ID.</strong></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_streaming-cn-pe333xxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p><strong>The name of the compute job.</strong></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>order_enrichment</p>
         */
        public Builder jobName(String jobName) {
            this.putQueryParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * <p><strong>The recovery mode, such as savepoint or stateless.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>savepoint</p>
         */
        public Builder recoveryMode(String recoveryMode) {
            this.putQueryParameter("RecoveryMode", recoveryMode);
            this.recoveryMode = recoveryMode;
            return this;
        }

        /**
         * <p><strong>The region ID.</strong></p>
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

        @Override
        public StartComputeJobRequest build() {
            return new StartComputeJobRequest(this);
        } 

    } 

}
