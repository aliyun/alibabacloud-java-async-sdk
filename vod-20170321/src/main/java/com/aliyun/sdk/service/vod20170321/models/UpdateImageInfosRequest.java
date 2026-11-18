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
         * <p>The update content. You can modify the information of up to 20 images at a time. For the parameter structure, refer to the <strong>UpdateContent</strong> table below.</p>
         * <blockquote>
         * <ul>
         * <li>The Title, Description, and Tags fields cannot contain emojis.</li>
         * <li>If a parameter is passed, the corresponding field is updated. Otherwise, the corresponding field is not overwritten or updated.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ImageId&quot;:&quot;ff8fe57e3461416c6a267a4e09****&quot;,&quot;Title&quot;:&quot;Title&quot;,&quot;Description&quot;:&quot;Description&quot;,&quot;Tags&quot;:&quot;Tag1,Tag2&quot;}]</p>
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
