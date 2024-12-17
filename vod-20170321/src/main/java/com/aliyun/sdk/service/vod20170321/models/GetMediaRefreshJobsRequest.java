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
 * {@link GetMediaRefreshJobsRequest} extends {@link RequestModel}
 *
 * <p>GetMediaRefreshJobsRequest</p>
 */
public class GetMediaRefreshJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaRefreshJobId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the media file. It is the value of the <code>MediaIds</code> parameter that you specify when you call the <a href="~~RefreshMediaPlayUrls~~">RefreshMediaPlayUrls</a> operation. You can specify only one media ID.</p>
         * <p>If you leave this parameter empty, information about all media files in the refresh or prefetch job specified by <code>MediaRefreshJobId</code> is returned. If you set this parameter, only the information about the specified media file is returned.``</p>
         * 
         * <strong>example:</strong>
         * <p>ca3a8f6e4957b658067095869****</p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The ID of the refresh or prefetch job. It is the value of the MediaRefreshJobId parameter that is returned from the call to the <a href="~~RefreshMediaPlayUrls~~">RefreshMediaPlayUrls</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>41d465e31957****</p>
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
