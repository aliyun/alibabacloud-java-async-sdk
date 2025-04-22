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
 * {@link UpdateVideoInfosRequest} extends {@link RequestModel}
 *
 * <p>UpdateVideoInfosRequest</p>
 */
public class UpdateVideoInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateContent")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The new information about audios or videos. You can modify the information about up to 20 audios or videos at a time. Separate multiple audios or videos with commas (,). When you modify the information exceed 20 audios or videos at a time, the update will fail with an error code <strong>CountExceededMax</strong>.</p>
         * <p>The value is a JSON string. For more information, see the <strong>UpdateContent</strong> section of this topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;VideoId&quot;:&quot;f45cf4eba5cb90233389558c39****&quot;,&quot;Title&quot;:&quot;test title1&quot;},{&quot;VideoId&quot;:&quot;f45cf4eba5c84233389558c36****&quot;,&quot;Title&quot;:&quot;test title2&quot;}]</p>
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
