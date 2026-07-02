// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link GetVideoGenerationJobRequest} extends {@link RequestModel}
 *
 * <p>GetVideoGenerationJobRequest</p>
 */
public class GetVideoGenerationJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    private GetVideoGenerationJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoGenerationJobRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<GetVideoGenerationJobRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(GetVideoGenerationJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public GetVideoGenerationJobRequest build() {
            return new GetVideoGenerationJobRequest(this);
        } 

    } 

}
