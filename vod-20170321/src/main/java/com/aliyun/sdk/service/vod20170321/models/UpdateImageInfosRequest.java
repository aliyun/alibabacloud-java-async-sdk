// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateImageInfosRequest} extends {@link RequestModel}
 *
 * <p>UpdateImageInfosRequest</p>
 */
public class UpdateImageInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String updateContent;

    private UpdateImageInfosRequest(Builder builder) {
        super(builder);
        this.updateContent = builder.updateContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateImageInfosRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateImageInfosRequest, Builder> {
        private String updateContent; 

        private Builder() {
            super();
        } 

        private Builder(UpdateImageInfosRequest request) {
            super(request);
            this.updateContent = request.updateContent;
        } 

        /**
         * <p>The new information about the one or more images. You can modify the information about up to 20 images at a time. For more information about the parameter structure, see the <strong>UpdateContent</strong> section.</p>
         * <blockquote>
         * <p> The values of the nested parameters Title, Description, and Tags under the UpdateContent parameter cannot contain emoticons.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ImageId&quot;:&quot;ff8fe57e3461416c6a267a4e09****&quot;,&quot;Title&quot;:&quot;test title&quot;,&quot;Description&quot;:&quot;test description&quot;,&quot;Tags&quot;:&quot;tag1,tag2&quot;}]</p>
         */
        public Builder updateContent(String updateContent) {
            this.putQueryParameter("UpdateContent", updateContent);
            this.updateContent = updateContent;
            return this;
        }

        @Override
        public UpdateImageInfosRequest build() {
            return new UpdateImageInfosRequest(this);
        } 

    } 

}
