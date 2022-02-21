// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaAuditResultRequest} extends {@link RequestModel}
 *
 * <p>GetMediaAuditResultRequest</p>
 */
public class GetMediaAuditResultRequest extends Request {
    @Query
    @NameInMap("MediaId")
    @Validation(required = true)
    private String mediaId;

    private GetMediaAuditResultRequest(Builder builder) {
        super(builder);
        this.mediaId = builder.mediaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaAuditResultRequest create() {
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

    public static final class Builder extends Request.Builder<GetMediaAuditResultRequest, Builder> {
        private String mediaId; 

        private Builder() {
            super();
        } 

        private Builder(GetMediaAuditResultRequest response) {
            super(response);
            this.mediaId = response.mediaId;
        } 

        /**
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        @Override
        public GetMediaAuditResultRequest build() {
            return new GetMediaAuditResultRequest(this);
        } 

    } 

}
