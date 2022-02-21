// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTranscodeSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetTranscodeSummaryRequest</p>
 */
public class GetTranscodeSummaryRequest extends Request {
    @Query
    @NameInMap("VideoIds")
    @Validation(required = true)
    private String videoIds;

    private GetTranscodeSummaryRequest(Builder builder) {
        super(builder);
        this.videoIds = builder.videoIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTranscodeSummaryRequest create() {
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

    public static final class Builder extends Request.Builder<GetTranscodeSummaryRequest, Builder> {
        private String videoIds; 

        private Builder() {
            super();
        } 

        private Builder(GetTranscodeSummaryRequest response) {
            super(response);
            this.videoIds = response.videoIds;
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
        public GetTranscodeSummaryRequest build() {
            return new GetTranscodeSummaryRequest(this);
        } 

    } 

}
