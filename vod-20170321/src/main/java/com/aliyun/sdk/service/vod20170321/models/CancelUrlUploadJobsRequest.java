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
 * {@link CancelUrlUploadJobsRequest} extends {@link RequestModel}
 *
 * <p>CancelUrlUploadJobsRequest</p>
 */
public class CancelUrlUploadJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobIds")
    private String jobIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadUrls")
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
         * <p>The list of task IDs. You can obtain the task ID (JobId) from the PlayInfo struct returned by the <a href="https://help.aliyun.com/document_detail/56124.html">GetPlayInfo</a> operation.</p>
         * <ul>
         * <li>A maximum of 10 IDs are supported.</li>
         * <li>Separate multiple IDs with commas (,).</li>
         * </ul>
         * <blockquote>
         * <p>You must specify either JobIds or UploadUrls. If both are specified, only JobIds is processed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>341c92e6c18dc435ee31253685****,0193d395194a83ad6ee2ef27a5b5****</p>
         */
        public Builder jobIds(String jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        /**
         * <p>The list of source video URLs to upload. Separate multiple URLs with commas (,). A maximum of 10 URLs are supported.</p>
         * <blockquote>
         * <ul>
         * <li>URL-encode the URLs before use.</li>
         * <li>You must specify either JobIds or UploadUrls. If both are specified, only JobIds is processed.</li>
         * </ul>
         * </blockquote>
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
