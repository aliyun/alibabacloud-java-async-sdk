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
 * {@link ListBroadcastAudiosByIdRequest} extends {@link RequestModel}
 *
 * <p>ListBroadcastAudiosByIdRequest</p>
 */
public class ListBroadcastAudiosByIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("audioIds")
    private java.util.List<String> audioIds;

    private ListBroadcastAudiosByIdRequest(Builder builder) {
        super(builder);
        this.audioIds = builder.audioIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBroadcastAudiosByIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioIds
     */
    public java.util.List<String> getAudioIds() {
        return this.audioIds;
    }

    public static final class Builder extends Request.Builder<ListBroadcastAudiosByIdRequest, Builder> {
        private java.util.List<String> audioIds; 

        private Builder() {
            super();
        } 

        private Builder(ListBroadcastAudiosByIdRequest request) {
            super(request);
            this.audioIds = request.audioIds;
        } 

        /**
         * audioIds.
         */
        public Builder audioIds(java.util.List<String> audioIds) {
            String audioIdsShrink = shrink(audioIds, "audioIds", "json");
            this.putQueryParameter("audioIds", audioIdsShrink);
            this.audioIds = audioIds;
            return this;
        }

        @Override
        public ListBroadcastAudiosByIdRequest build() {
            return new ListBroadcastAudiosByIdRequest(this);
        } 

    } 

}
