// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAttachedMediaInfosRequest} extends {@link RequestModel}
 *
 * <p>UpdateAttachedMediaInfosRequest</p>
 */
public class UpdateAttachedMediaInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String updateContent;

    private UpdateAttachedMediaInfosRequest(Builder builder) {
        super(builder);
        this.updateContent = builder.updateContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAttachedMediaInfosRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateAttachedMediaInfosRequest, Builder> {
        private String updateContent; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAttachedMediaInfosRequest request) {
            super(request);
            this.updateContent = request.updateContent;
        } 

        /**
         * The new information about the one or more images. You can modify the information about up to 20 auxiliary media assets at a time. For more information, see the **UpdateContent** section of this topic.
         * <p>
         * 
         * > *   You cannot specify emojis for `Title`, `Description`, or `Tags`.
         * > *   The specific parameter of a video is updated only when a new value is passed in the parameter.
         */
        public Builder updateContent(String updateContent) {
            this.putQueryParameter("UpdateContent", updateContent);
            this.updateContent = updateContent;
            return this;
        }

        @Override
        public UpdateAttachedMediaInfosRequest build() {
            return new UpdateAttachedMediaInfosRequest(this);
        } 

    } 

}
