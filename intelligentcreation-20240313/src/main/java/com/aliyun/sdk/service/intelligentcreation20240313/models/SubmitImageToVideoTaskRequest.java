// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link SubmitImageToVideoTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitImageToVideoTaskRequest</p>
 */
public class SubmitImageToVideoTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("imageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("posPrompt")
    private String posPrompt;

    private SubmitImageToVideoTaskRequest(Builder builder) {
        super(builder);
        this.imageUrl = builder.imageUrl;
        this.posPrompt = builder.posPrompt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitImageToVideoTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return posPrompt
     */
    public String getPosPrompt() {
        return this.posPrompt;
    }

    public static final class Builder extends Request.Builder<SubmitImageToVideoTaskRequest, Builder> {
        private String imageUrl; 
        private String posPrompt; 

        private Builder() {
            super();
        } 

        private Builder(SubmitImageToVideoTaskRequest request) {
            super(request);
            this.imageUrl = request.imageUrl;
            this.posPrompt = request.posPrompt;
        } 

        /**
         * imageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.putBodyParameter("imageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * posPrompt.
         */
        public Builder posPrompt(String posPrompt) {
            this.putBodyParameter("posPrompt", posPrompt);
            this.posPrompt = posPrompt;
            return this;
        }

        @Override
        public SubmitImageToVideoTaskRequest build() {
            return new SubmitImageToVideoTaskRequest(this);
        } 

    } 

}
