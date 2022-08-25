// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVideoRequest} extends {@link RequestModel}
 *
 * <p>DeleteVideoRequest</p>
 */
public class DeleteVideoRequest extends Request {
    @Query
    @NameInMap("VideoIds")
    @Validation(required = true)
    private String videoIds;

    private DeleteVideoRequest(Builder builder) {
        super(builder);
        this.videoIds = builder.videoIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVideoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return videoIds
     */
    public String getVideoIds() {
        return this.videoIds;
    }

    public static final class Builder extends Request.Builder<DeleteVideoRequest, Builder> {
        private String videoIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVideoRequest request) {
            super(request);
            this.videoIds = request.videoIds;
        } 

        /**
         * VideoIds.
         */
        public Builder videoIds(String videoIds) {
            this.putQueryParameter("VideoIds", videoIds);
            this.videoIds = videoIds;
            return this;
        }

        @Override
        public DeleteVideoRequest build() {
            return new DeleteVideoRequest(this);
        } 

    } 

}
