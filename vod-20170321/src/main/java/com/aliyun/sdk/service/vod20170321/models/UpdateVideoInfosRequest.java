// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVideoInfosRequest} extends {@link RequestModel}
 *
 * <p>UpdateVideoInfosRequest</p>
 */
public class UpdateVideoInfosRequest extends Request {
    @Query
    @NameInMap("UpdateContent")
    @Validation(required = true)
    private String updateContent;

    private UpdateVideoInfosRequest(Builder builder) {
        super(builder);
        this.updateContent = builder.updateContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVideoInfosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return updateContent
     */
    public String getUpdateContent() {
        return this.updateContent;
    }

    public static final class Builder extends Request.Builder<UpdateVideoInfosRequest, Builder> {
        private String updateContent; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVideoInfosRequest request) {
            super(request);
            this.updateContent = request.updateContent;
        } 

        /**
         * ## UpdateContent
         * <p>
         * 
         * >  You must convert the UpdateContent[] parameter to a string before you pass it in.
         * 
         * | Parameter | Type | Required | Description |
         * | --------- | ---- | -------- | ----------- |
         * | VideoId | String | Yes | The ID of the video. |
         * | Title | String | No | The title of the video. |
         * | Description | String | No | The description of the video. |
         * | Tags | String | No | The tag of the video. |
         * | CoverURL | String | No | The URL of the video thumbnail. |
         * | CateId | Long | No | The ID of the category. |
         */
        public Builder updateContent(String updateContent) {
            this.putQueryParameter("UpdateContent", updateContent);
            this.updateContent = updateContent;
            return this;
        }

        @Override
        public UpdateVideoInfosRequest build() {
            return new UpdateVideoInfosRequest(this);
        } 

    } 

}
