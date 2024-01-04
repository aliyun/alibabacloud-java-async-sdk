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
         * The IDs of the upload jobs. You can obtain the job IDs from PlayInfo in the response to the [GetPlayInfo](~~56124~~) operation.
         * <p>
         * 
         * *   You can specify a maximum of 10 IDs.
         * *   Separate multiple IDs with commas (,).
         * 
         * >  You must specify either JobIds or UploadUrls. If you specify both the JobIds and UploadUrls parameters, only the value of the JobIds parameter takes effect.
         */
        public Builder jobIds(String jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        /**
         * The upload URLs of source video files. Separate multiple URLs with commas (,). You can specify a maximum of 10 URLs.
         * <p>
         * 
         * > *   You must encode the URLs before you use the URLs.
         * > *   You must specify either JobIds or UploadUrls. If you specify both the JobIds and UploadUrls parameters, only the value of the JobIds parameter takes effect.
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
