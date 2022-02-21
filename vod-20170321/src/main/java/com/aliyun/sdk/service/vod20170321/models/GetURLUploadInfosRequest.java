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

        private Builder(GetURLUploadInfosRequest response) {
            super(response);
            this.jobIds = response.jobIds;
            this.uploadURLs = response.uploadURLs;
        } 

        /**
         * JobIds.
         */
        public Builder jobIds(String jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        /**
         * UploadURLs.
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
