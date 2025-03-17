// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetUrlUploadInfosRequest} extends {@link RequestModel}
 *
 * <p>GetUrlUploadInfosRequest</p>
 */
public class GetUrlUploadInfosRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobIds")
    private String jobIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadURLs")
    private String uploadURLs;

    private GetUrlUploadInfosRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.jobIds = builder.jobIds;
        this.uploadURLs = builder.uploadURLs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUrlUploadInfosRequest create() {
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

    public static final class Builder extends Request.Builder<GetUrlUploadInfosRequest, Builder> {
        private String regionId; 
        private String jobIds; 
        private String uploadURLs; 

        private Builder() {
            super();
        } 

        private Builder(GetUrlUploadInfosRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.jobIds = request.jobIds;
            this.uploadURLs = request.uploadURLs;
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
         * <p>The IDs of the upload jobs. You can specify one or more job IDs. You can obtain the job IDs from the response parameter JobId of the <a href="https://help.aliyun.com/document_detail/86311.html">UploadMediaByURL</a> operation.</p>
         * <ul>
         * <li>You can specify a maximum of 10 job IDs.</li>
         * <li>Separate the job IDs with commas (,).</li>
         * </ul>
         * <blockquote>
         * <p> You must specify either JobIds or UploadURLs. If you specify both parameters, only the value of JobIds takes effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>df2ac80b481346daa1db6a7c40edc7f8</p>
         */
        public Builder jobIds(String jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        /**
         * <p>The upload URLs of the source files. You can specify a maximum of 10 URLs. Separate the URLs with commas (,).</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The URLs must be encoded.</p>
         * </li>
         * <li><p>If a media file is uploaded multiple times, we recommend that you specify the URL of the media file only once in this parameter.</p>
         * </li>
         * <li><p>You must specify either JobIds or UploadURLs. If you specify both parameters, only the value of JobIds takes effect.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="https://media.w3.org/2010/05/sintel/trailer.mp4">https://media.w3.org/2010/05/sintel/trailer.mp4</a></p>
         */
        public Builder uploadURLs(String uploadURLs) {
            this.putQueryParameter("UploadURLs", uploadURLs);
            this.uploadURLs = uploadURLs;
            return this;
        }

        @Override
        public GetUrlUploadInfosRequest build() {
            return new GetUrlUploadInfosRequest(this);
        } 

    } 

}
