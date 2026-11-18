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
         * <p>The update content. You can update the information of up to 20 auxiliary media assets at a time. For the parameter structure, refer to the <strong>UpdateContent</strong> table below.</p>
         * <blockquote>
         * <ul>
         * <li>The update content for <code>Title</code>, <code>Description</code>, and <code>Tags</code> cannot contain emojis.</li>
         * <li>If a parameter is passed, the corresponding field is updated. Otherwise, the field is not overwritten or updated.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;MediaId&quot;:&quot;bbc65bba53f6ed90de118a7849****&quot;,&quot;Title&quot;:&quot;Title 1&quot;,&quot;Description&quot;:&quot;Description 1&quot;,&quot;Tags&quot;:&quot;Tag 1,Tag 2&quot;},{&quot;MediaId&quot;:&quot;f45cf4eba5cb90233389558c39****&quot;,&quot;Title2&quot;:&quot;Title&quot;,&quot;Description2&quot;:&quot;Description&quot;,&quot;Tags&quot;:&quot;Tag 3,Tag 4&quot;}]</p>
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
