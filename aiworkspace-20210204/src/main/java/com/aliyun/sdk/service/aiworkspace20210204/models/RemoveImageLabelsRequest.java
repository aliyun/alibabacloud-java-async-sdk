// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link RemoveImageLabelsRequest} extends {@link RequestModel}
 *
 * <p>RemoveImageLabelsRequest</p>
 */
public class RemoveImageLabelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("LabelKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String labelKey;

    private RemoveImageLabelsRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.labelKey = builder.labelKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveImageLabelsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return labelKey
     */
    public String getLabelKey() {
        return this.labelKey;
    }

    public static final class Builder extends Request.Builder<RemoveImageLabelsRequest, Builder> {
        private String imageId; 
        private String labelKey; 

        private Builder() {
            super();
        } 

        private Builder(RemoveImageLabelsRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.labelKey = request.labelKey;
        } 

        /**
         * <p>The image ID. You can call <a href="https://help.aliyun.com/document_detail/449118.html">ListImages</a> to obtain the image ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>image-d8df******dsjfd</p>
         */
        public Builder imageId(String imageId) {
            this.putPathParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The tag key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        public Builder labelKey(String labelKey) {
            this.putPathParameter("LabelKey", labelKey);
            this.labelKey = labelKey;
            return this;
        }

        @Override
        public RemoveImageLabelsRequest build() {
            return new RemoveImageLabelsRequest(this);
        } 

    } 

}
