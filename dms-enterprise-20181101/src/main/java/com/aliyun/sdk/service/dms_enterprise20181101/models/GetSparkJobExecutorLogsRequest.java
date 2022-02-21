// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkJobExecutorLogsRequest} extends {@link RequestModel}
 *
 * <p>GetSparkJobExecutorLogsRequest</p>
 */
public class GetSparkJobExecutorLogsRequest extends Request {
    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private Long jobId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private GetSparkJobExecutorLogsRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.regionId = builder.regionId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkJobExecutorLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetSparkJobExecutorLogsRequest, Builder> {
        private Long jobId; 
        private String regionId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetSparkJobExecutorLogsRequest response) {
            super(response);
            this.jobId = response.jobId;
            this.regionId = response.regionId;
            this.tid = response.tid;
        } 

        /**
         * JobId.
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public GetSparkJobExecutorLogsRequest build() {
            return new GetSparkJobExecutorLogsRequest(this);
        } 

    } 

}
