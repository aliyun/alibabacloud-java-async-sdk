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
         * <p>The audio or video ID, which is the <code>MediaIds</code> value specified when calling the <a href="https://help.aliyun.com/document_detail/431095.html">SubmitMediaRefreshJob</a> operation. Only one audio or video ID can be specified.</p>
         * <p>If this parameter is not specified, task information for all audio or video files under the specified <code>MediaRefreshJobId</code> is returned. If this parameter is specified, only the task information for the specified audio or video ID under the <code>MediaRefreshJobId</code> is returned.</p>
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
         * <p>The ID of the audio or video purge or prefetch task. This is the value of MediaRefreshJobId returned by the <a href="https://help.aliyun.com/document_detail/431095.html">SubmitMediaRefreshJob</a> operation.</p>
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
