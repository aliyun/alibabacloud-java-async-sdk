// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link GetVideoRemakeJobRequest} extends {@link RequestModel}
 *
 * <p>GetVideoRemakeJobRequest</p>
 */
public class GetVideoRemakeJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    private GetVideoRemakeJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoRemakeJobRequest create() {
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
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<GetVideoRemakeJobRequest, Builder> {
        private String regionId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(GetVideoRemakeJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.jobId = request.jobId;
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
         * <p>The task ID returned by SubmitVideoRemakeJob.</p>
         * 
         * <strong>example:</strong>
         * <p>0123456789abcdef0123456789abcdef</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public GetVideoRemakeJobRequest build() {
            return new GetVideoRemakeJobRequest(this);
        } 

    } 

}
