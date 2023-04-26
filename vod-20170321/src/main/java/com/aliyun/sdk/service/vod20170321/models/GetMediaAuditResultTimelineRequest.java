// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaAuditResultTimelineRequest} extends {@link RequestModel}
 *
 * <p>GetMediaAuditResultTimelineRequest</p>
 */
public class GetMediaAuditResultTimelineRequest extends Request {
    @Query
    @NameInMap("MediaId")
    @Validation(required = true)
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
         * The category of the review result. Valid values:
         * <p>
         * 
         * *   **normal**
         * *   **logo**
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
