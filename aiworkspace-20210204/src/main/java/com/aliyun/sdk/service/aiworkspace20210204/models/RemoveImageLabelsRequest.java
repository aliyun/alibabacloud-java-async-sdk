// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveImageLabelsRequest} extends {@link RequestModel}
 *
 * <p>RemoveImageLabelsRequest</p>
 */
public class RemoveImageLabelsRequest extends Request {
    @Path
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Path
    @NameInMap("LabelKeys")
    @Validation(required = true)
    private String labelKeys;

    private RemoveImageLabelsRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.labelKeys = builder.labelKeys;
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
     * @return labelKeys
     */
    public String getLabelKeys() {
        return this.labelKeys;
    }

    public static final class Builder extends Request.Builder<RemoveImageLabelsRequest, Builder> {
        private String imageId; 
        private String labelKeys; 

        private Builder() {
            super();
        } 

        private Builder(RemoveImageLabelsRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.labelKeys = request.labelKeys;
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
         * LabelKeys.
         */
        public Builder labelKeys(String labelKeys) {
            this.putPathParameter("LabelKeys", labelKeys);
            this.labelKeys = labelKeys;
            return this;
        }

        @Override
        public RemoveImageLabelsRequest build() {
            return new RemoveImageLabelsRequest(this);
        } 

    } 

}
