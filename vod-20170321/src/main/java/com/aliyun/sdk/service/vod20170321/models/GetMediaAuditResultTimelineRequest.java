// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMediaAuditResultTimelineRequest} extends {@link RequestModel}
 *
 * <p>GetMediaAuditResultTimelineRequest</p>
 */
public class GetMediaAuditResultTimelineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaId;

    private GetMediaAuditResultTimelineRequest(Builder builder) {
        super(builder);
        this.mediaId = builder.mediaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaAuditResultTimelineRequest create() {
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

    public static final class Builder extends Request.Builder<GetMediaAuditResultTimelineRequest, Builder> {
        private String mediaId; 

        private Builder() {
            super();
        } 

        private Builder(GetMediaAuditResultTimelineRequest request) {
            super(request);
            this.mediaId = request.mediaId;
        } 

        /**
         * <p>The ID of the video.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>93ab850b4f6f*****54b6e91d24d81d4</p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        @Override
        public GetMediaAuditResultTimelineRequest build() {
            return new GetMediaAuditResultTimelineRequest(this);
        } 

    } 

}
