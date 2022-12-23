// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAttachedMediaRequest} extends {@link RequestModel}
 *
 * <p>DeleteAttachedMediaRequest</p>
 */
public class DeleteAttachedMediaRequest extends Request {
    @Query
    @NameInMap("MediaIds")
    private String mediaIds;

    private DeleteAttachedMediaRequest(Builder builder) {
        super(builder);
        this.mediaIds = builder.mediaIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAttachedMediaRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAttachedMediaRequest, Builder> {
        private String mediaIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAttachedMediaRequest request) {
            super(request);
            this.mediaIds = request.mediaIds;
        } 

        /**
         * The list of auxiliary media asset IDs.
         * <p>
         * 
         * *   Separate multiple IDs with commas (,).
         * *   A maximum of 20 IDs can be specified.
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
            return this;
        }

        @Override
        public DeleteAttachedMediaRequest build() {
            return new DeleteAttachedMediaRequest(this);
        } 

    } 

}
