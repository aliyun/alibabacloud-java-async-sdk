// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelUrlUploadJobsRequest} extends {@link RequestModel}
 *
 * <p>CancelUrlUploadJobsRequest</p>
 */
public class CancelUrlUploadJobsRequest extends Request {
    @Query
    @NameInMap("JobIds")
    private String jobIds;

    @Query
    @NameInMap("UploadUrls")
    private String uploadUrls;

    private CancelUrlUploadJobsRequest(Builder builder) {
        super(builder);
        this.jobIds = builder.jobIds;
        this.uploadUrls = builder.uploadUrls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelUrlUploadJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobIds
     */
    public String getJobIds() {
        return this.jobIds;
    }

    /**
     * @return uploadUrls
     */
    public String getUploadUrls() {
        return this.uploadUrls;
    }

    public static final class Builder extends Request.Builder<CancelUrlUploadJobsRequest, Builder> {
        private String jobIds; 
        private String uploadUrls; 

        private Builder() {
            super();
        } 

        private Builder(CancelUrlUploadJobsRequest request) {
            super(request);
            this.jobIds = request.jobIds;
            this.uploadUrls = request.uploadUrls;
        } 

        /**
         * The ID of the request.
         */
        public Builder jobIds(String jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **CancelUrlUploadJobs**.
         */
        public Builder uploadUrls(String uploadUrls) {
            this.putQueryParameter("UploadUrls", uploadUrls);
            this.uploadUrls = uploadUrls;
            return this;
        }

        @Override
        public CancelUrlUploadJobsRequest build() {
            return new CancelUrlUploadJobsRequest(this);
        } 

    } 

}
