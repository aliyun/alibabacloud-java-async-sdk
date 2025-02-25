// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
         * <p>The new information about the one or more images. You can modify the information about up to 20 auxiliary media assets at a time. For more information, see the <strong>UpdateContent</strong> section of this topic.</p>
         * <blockquote>
         * <ul>
         * <li>You cannot specify emojis for <code>Title</code>, <code>Description</code>, or <code>Tags</code>.</li>
         * <li>The specific parameter of a video is updated only when a new value is passed in the parameter.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;MediaId &quot;:&quot;bbc65bba53f6ed90de118a7849****&quot;,&quot;Title&quot;:&quot; test title1&quot;,&quot;Description&quot;:&quot;test description1&quot;,&quot;Tags&quot;:&quot;tag1,tag2&quot;},{&quot;MediaId &quot;:&quot;f45cf4eba5cb90233389558c39****&quot;,&quot;Title2&quot;:&quot;test title2&quot;,&quot;Description2&quot;:&quot;test description2&quot;,&quot;Tags&quot;:&quot;tag3,tag4&quot;}]</p>
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
