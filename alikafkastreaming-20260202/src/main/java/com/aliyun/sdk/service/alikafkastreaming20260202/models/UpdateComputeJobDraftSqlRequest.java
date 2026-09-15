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
 * {@link UpdateComputeJobDraftSqlRequest} extends {@link RequestModel}
 *
 * <p>UpdateComputeJobDraftSqlRequest</p>
 */
public class UpdateComputeJobDraftSqlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DraftSql")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateComputeJobDraftSqlRequest(Builder builder) {
        super(builder);
        this.draftSql = builder.draftSql;
        this.instanceId = builder.instanceId;
        this.jobName = builder.jobName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateComputeJobDraftSqlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateComputeJobDraftSqlRequest, Builder> {
        private String draftSql; 
        private String instanceId; 
        private String jobName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateComputeJobDraftSqlRequest request) {
            super(request);
            this.draftSql = request.draftSql;
            this.instanceId = request.instanceId;
            this.jobName = request.jobName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INSERT INTO sink_table SELECT * FROM source_table;</p>
         */
        public Builder draftSql(String draftSql) {
            this.putQueryParameter("DraftSql", draftSql);
            this.draftSql = draftSql;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_streaming-cn-a1b2c3d4</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
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
        public UpdateComputeJobDraftSqlRequest build() {
            return new UpdateComputeJobDraftSqlRequest(this);
        } 

    } 

}
