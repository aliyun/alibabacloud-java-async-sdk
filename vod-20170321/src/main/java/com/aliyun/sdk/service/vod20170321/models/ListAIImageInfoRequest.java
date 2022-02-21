// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAIImageInfoRequest} extends {@link RequestModel}
 *
 * <p>ListAIImageInfoRequest</p>
 */
public class ListAIImageInfoRequest extends Request {
    @Query
    @NameInMap("VideoId")
    @Validation(required = true)
    private String videoId;

    private ListAIImageInfoRequest(Builder builder) {
        super(builder);
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIImageInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<ListAIImageInfoRequest, Builder> {
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(ListAIImageInfoRequest response) {
            super(response);
            this.videoId = response.videoId;
        } 

        /**
         * VideoId.
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public ListAIImageInfoRequest build() {
            return new ListAIImageInfoRequest(this);
        } 

    } 

}
