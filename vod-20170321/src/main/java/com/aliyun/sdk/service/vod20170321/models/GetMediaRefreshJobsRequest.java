// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaRefreshJobsRequest} extends {@link RequestModel}
 *
 * <p>GetMediaRefreshJobsRequest</p>
 */
public class GetMediaRefreshJobsRequest extends Request {
    @Query
    @NameInMap("MediaId")
    private String mediaId;

    @Query
    @NameInMap("MediaRefreshJobId")
    @Validation(required = true)
    private String mediaRefreshJobId;

    private GetMediaRefreshJobsRequest(Builder builder) {
        super(builder);
        this.mediaId = builder.mediaId;
        this.mediaRefreshJobId = builder.mediaRefreshJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaRefreshJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return mediaRefreshJobId
     */
    public String getMediaRefreshJobId() {
        return this.mediaRefreshJobId;
    }

    public static final class Builder extends Request.Builder<GetMediaRefreshJobsRequest, Builder> {
        private String mediaId; 
        private String mediaRefreshJobId; 

        private Builder() {
            super();
        } 

        private Builder(GetMediaRefreshJobsRequest request) {
            super(request);
            this.mediaId = request.mediaId;
            this.mediaRefreshJobId = request.mediaRefreshJobId;
        } 

        /**
         * 媒资ID
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * 媒资刷新预热任务ID
         */
        public Builder mediaRefreshJobId(String mediaRefreshJobId) {
            this.putQueryParameter("MediaRefreshJobId", mediaRefreshJobId);
            this.mediaRefreshJobId = mediaRefreshJobId;
            return this;
        }

        @Override
        public GetMediaRefreshJobsRequest build() {
            return new GetMediaRefreshJobsRequest(this);
        } 

    } 

}
