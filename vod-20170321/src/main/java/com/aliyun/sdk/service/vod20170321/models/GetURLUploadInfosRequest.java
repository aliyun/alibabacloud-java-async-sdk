// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetURLUploadInfosRequest} extends {@link RequestModel}
 *
 * <p>GetURLUploadInfosRequest</p>
 */
public class GetURLUploadInfosRequest extends Request {
    @Query
    @NameInMap("JobIds")
    private String jobIds;

    @Query
    @NameInMap("UploadURLs")
    private String uploadURLs;

    private GetURLUploadInfosRequest(Builder builder) {
        super(builder);
        this.jobIds = builder.jobIds;
        this.uploadURLs = builder.uploadURLs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetURLUploadInfosRequest create() {
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
     * @return uploadURLs
     */
    public String getUploadURLs() {
        return this.uploadURLs;
    }

    public static final class Builder extends Request.Builder<GetURLUploadInfosRequest, Builder> {
        private String jobIds; 
        private String uploadURLs; 

        private Builder() {
            super();
        } 

        private Builder(GetURLUploadInfosRequest request) {
            super(request);
            this.jobIds = request.jobIds;
            this.uploadURLs = request.uploadURLs;
        } 

        /**
         * The one or more IDs of upload jobs. You can obtain the job IDs in the response parameter JobId of the [UploadMediaByURL](~~86311~~) operation.
         * <p>
         * 
         * - You can specify a maximum of 10 IDs.
         * - Separate multiple IDs with commas (,).
         * 
         * > You must set one of the JobIds and the UploadURLs parameters. If you set both the JobIds and UploadURLs parameters, only the value of the JobIds parameter takes effect.
         */
        public Builder jobIds(String jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        /**
         * The one or more upload URLs of the source files. Separate multiple URLs with commas (,). You can specify a maximum of 10 URLs.
         * <p>
         * 
         * > * You must encode the URLs before you use the URLs.
         * > * If a media file is uploaded multiple times, pass the URL of the media file to this parameter only once.
         * > * You must set one of the JobIds and the UploadURLs parameters. If you set both the JobIds and UploadURLs parameters, only the value of the JobIds parameter takes effect.
         */
        public Builder uploadURLs(String uploadURLs) {
            this.putQueryParameter("UploadURLs", uploadURLs);
            this.uploadURLs = uploadURLs;
            return this;
        }

        @Override
        public GetURLUploadInfosRequest build() {
            return new GetURLUploadInfosRequest(this);
        } 

    } 

}
