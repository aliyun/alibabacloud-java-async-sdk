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

        private Builder(GetTranscodeSummaryRequest request) {
            super(request);
            this.videoIds = request.videoIds;
        } 

        /**
         * The ID of the audio or video file. You can specify up to 10 IDs. Separate the IDs with commas (,). You can use one of the following methods to obtain the ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.
         * *   Obtain the value of VideoId from the response to the [CreateUploadVideo](~~55407~~) operation that you call to obtain the upload URL and credential.
         * *   Obtain the value of VideoId by calling the [SearchMedia](~~86044~~) operation. This method is applicable to files that have been uploaded.
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
