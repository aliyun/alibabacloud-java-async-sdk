// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
         * <p>The one or more IDs of upload jobs. You can obtain the job IDs in the response parameter JobId of the <a href="https://help.aliyun.com/document_detail/86311.html">UploadMediaByURL</a> operation.</p>
         * <ul>
         * <li>You can specify a maximum of 10 IDs.</li>
         * <li>Separate multiple IDs with commas (,).</li>
         * </ul>
         * <blockquote>
         * <p>You must set one of the JobIds and the UploadURLs parameters. If you set both the JobIds and UploadURLs parameters, only the value of the JobIds parameter takes effect.</p>
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
         * <p>The one or more upload URLs of the source files. Separate multiple URLs with commas (,). You can specify a maximum of 10 URLs.</p>
         * <blockquote>
         * <ul>
         * <li>You must encode the URLs before you use the URLs.</li>
         * <li>If a media file is uploaded multiple times, pass the URL of the media file to this parameter only once.</li>
         * <li>You must set one of the JobIds and the UploadURLs parameters. If you set both the JobIds and UploadURLs parameters, only the value of the JobIds parameter takes effect.</li>
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
