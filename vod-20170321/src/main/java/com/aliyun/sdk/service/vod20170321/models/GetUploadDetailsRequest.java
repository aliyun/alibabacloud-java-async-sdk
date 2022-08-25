// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUploadDetailsRequest} extends {@link RequestModel}
 *
 * <p>GetUploadDetailsRequest</p>
 */
public class GetUploadDetailsRequest extends Request {
    @Query
    @NameInMap("MediaIds")
    @Validation(required = true)
    private String mediaIds;

    @Query
    @NameInMap("MediaType")
    private String mediaType;

    private GetUploadDetailsRequest(Builder builder) {
        super(builder);
        this.mediaIds = builder.mediaIds;
        this.mediaType = builder.mediaType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadDetailsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaIds
     */
    public String getMediaIds() {
        return this.mediaIds;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    public static final class Builder extends Request.Builder<GetUploadDetailsRequest, Builder> {
        private String mediaIds; 
        private String mediaType; 

        private Builder() {
            super();
        } 

        private Builder(GetUploadDetailsRequest request) {
            super(request);
            this.mediaIds = request.mediaIds;
            this.mediaType = request.mediaType;
        } 

        /**
         * MediaIds.
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
            return this;
        }

        /**
         * MediaType.
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        @Override
        public GetUploadDetailsRequest build() {
            return new GetUploadDetailsRequest(this);
        } 

    } 

}
