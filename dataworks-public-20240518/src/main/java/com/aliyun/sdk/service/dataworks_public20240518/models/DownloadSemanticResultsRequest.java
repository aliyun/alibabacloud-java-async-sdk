// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link DownloadSemanticResultsRequest} extends {@link RequestModel}
 *
 * <p>DownloadSemanticResultsRequest</p>
 */
public class DownloadSemanticResultsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobRunId")
    private String jobRunId;

    private DownloadSemanticResultsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.jobName = builder.jobName;
        this.jobRunId = builder.jobRunId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadSemanticResultsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return jobRunId
     */
    public String getJobRunId() {
        return this.jobRunId;
    }

    public static final class Builder extends Request.Builder<DownloadSemanticResultsRequest, Builder> {
        private String regionId; 
        private String jobName; 
        private String jobRunId; 

        private Builder() {
            super();
        } 

        private Builder(DownloadSemanticResultsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.jobName = request.jobName;
            this.jobRunId = request.jobRunId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>semantic-job-demo</p>
         */
        public Builder jobName(String jobName) {
            this.putBodyParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * JobRunId.
         */
        public Builder jobRunId(String jobRunId) {
            this.putBodyParameter("JobRunId", jobRunId);
            this.jobRunId = jobRunId;
            return this;
        }

        @Override
        public DownloadSemanticResultsRequest build() {
            return new DownloadSemanticResultsRequest(this);
        } 

    } 

}
