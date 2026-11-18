// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetURLUploadInfosRequest} extends {@link RequestModel}
 *
 * <p>GetURLUploadInfosRequest</p>
 */
public class GetURLUploadInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobIds")
    private String jobIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadURLs")
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
         * <p>The list of upload task IDs (JobIds). It consists of one or more JobIds. A JobId is the value of the JobId response parameter returned when you call the <a href="https://help.aliyun.com/document_detail/86311.html">UploadMediaByURL</a> operation.</p>
         * <ul>
         * <li>A maximum of 10 IDs are supported.</li>
         * <li>Separate multiple IDs with commas (,).</li>
         * </ul>
         * <blockquote>
         * <p>You must specify either JobIds or UploadURLs. If both are specified, only JobIds is processed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86c1925fba0****,7afb201e7fa****,2cc4997378****</p>
         */
        public Builder jobIds(String jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        /**
         * <p>The list of URLs of the video source files to upload. Separate multiple URLs with commas (,). A maximum of 10 URLs are supported.</p>
         * <blockquote>
         * <ul>
         * <li>URL-encode the URLs before you use them.</li>
         * <li>If the same video URL is uploaded multiple times, specify a single URL for the query.</li>
         * <li>You must specify either JobIds or UploadURLs. If both are specified, only JobIds is processed.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>http://****.mp4</p>
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
