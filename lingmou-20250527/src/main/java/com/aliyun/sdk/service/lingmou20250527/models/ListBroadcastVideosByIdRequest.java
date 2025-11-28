// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527.models;

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
 * {@link ListBroadcastVideosByIdRequest} extends {@link RequestModel}
 *
 * <p>ListBroadcastVideosByIdRequest</p>
 */
public class ListBroadcastVideosByIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("videoIds")
    private java.util.List<String> videoIds;

    private ListBroadcastVideosByIdRequest(Builder builder) {
        super(builder);
        this.videoIds = builder.videoIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBroadcastVideosByIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return videoIds
     */
    public java.util.List<String> getVideoIds() {
        return this.videoIds;
    }

    public static final class Builder extends Request.Builder<ListBroadcastVideosByIdRequest, Builder> {
        private java.util.List<String> videoIds; 

        private Builder() {
            super();
        } 

        private Builder(ListBroadcastVideosByIdRequest request) {
            super(request);
            this.videoIds = request.videoIds;
        } 

        /**
         * videoIds.
         */
        public Builder videoIds(java.util.List<String> videoIds) {
            String videoIdsShrink = shrink(videoIds, "videoIds", "json");
            this.putQueryParameter("videoIds", videoIdsShrink);
            this.videoIds = videoIds;
            return this;
        }

        @Override
        public ListBroadcastVideosByIdRequest build() {
            return new ListBroadcastVideosByIdRequest(this);
        } 

    } 

}
