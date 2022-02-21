// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStreamInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateStreamInfoRequest</p>
 */
public class UpdateStreamInfoRequest extends Request {
    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("MediaId")
    @Validation(required = true)
    private String mediaId;

    private UpdateStreamInfoRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.mediaId = builder.mediaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStreamInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    public static final class Builder extends Request.Builder<UpdateStreamInfoRequest, Builder> {
        private String jobId; 
        private String mediaId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStreamInfoRequest response) {
            super(response);
            this.jobId = response.jobId;
            this.mediaId = response.mediaId;
        } 

        /**
         * 视频流ID
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * 视频ID
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        @Override
        public UpdateStreamInfoRequest build() {
            return new UpdateStreamInfoRequest(this);
        } 

    } 

}
