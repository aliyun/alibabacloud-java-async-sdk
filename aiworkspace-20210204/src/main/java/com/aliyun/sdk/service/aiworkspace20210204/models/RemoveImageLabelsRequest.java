// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putPathParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * LabelKey.
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
