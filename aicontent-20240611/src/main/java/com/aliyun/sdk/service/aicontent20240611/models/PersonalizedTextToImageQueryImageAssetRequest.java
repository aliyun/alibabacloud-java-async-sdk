// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link PersonalizedTextToImageQueryImageAssetRequest} extends {@link RequestModel}
 *
 * <p>PersonalizedTextToImageQueryImageAssetRequest</p>
 */
public class PersonalizedTextToImageQueryImageAssetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("encodeFormat")
    private String encodeFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("imageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    private PersonalizedTextToImageQueryImageAssetRequest(Builder builder) {
        super(builder);
        this.encodeFormat = builder.encodeFormat;
        this.imageId = builder.imageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PersonalizedTextToImageQueryImageAssetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encodeFormat
     */
    public String getEncodeFormat() {
        return this.encodeFormat;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    public static final class Builder extends Request.Builder<PersonalizedTextToImageQueryImageAssetRequest, Builder> {
        private String encodeFormat; 
        private String imageId; 

        private Builder() {
            super();
        } 

        private Builder(PersonalizedTextToImageQueryImageAssetRequest request) {
            super(request);
            this.encodeFormat = request.encodeFormat;
            this.imageId = request.imageId;
        } 

        /**
         * encodeFormat.
         */
        public Builder encodeFormat(String encodeFormat) {
            this.putQueryParameter("encodeFormat", encodeFormat);
            this.encodeFormat = encodeFormat;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0000.png</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("imageId", imageId);
            this.imageId = imageId;
            return this;
        }

        @Override
        public PersonalizedTextToImageQueryImageAssetRequest build() {
            return new PersonalizedTextToImageQueryImageAssetRequest(this);
        } 

    } 

}
