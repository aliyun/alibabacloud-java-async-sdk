// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageInfoRequest} extends {@link RequestModel}
 *
 * <p>GetImageInfoRequest</p>
 */
public class GetImageInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthTimeout")
    private Long authTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputType")
    private String outputType;

    private GetImageInfoRequest(Builder builder) {
        super(builder);
        this.authTimeout = builder.authTimeout;
        this.imageId = builder.imageId;
        this.outputType = builder.outputType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authTimeout
     */
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return outputType
     */
    public String getOutputType() {
        return this.outputType;
    }

    public static final class Builder extends Request.Builder<GetImageInfoRequest, Builder> {
        private Long authTimeout; 
        private String imageId; 
        private String outputType; 

        private Builder() {
            super();
        } 

        private Builder(GetImageInfoRequest request) {
            super(request);
            this.authTimeout = request.authTimeout;
            this.imageId = request.imageId;
            this.outputType = request.outputType;
        } 

        /**
         * The time when the image URL expires. Unit: seconds.
         * <p>
         * 
         * *   If you set OutputType to cdn:
         * 
         *     *   This parameter takes effect only if URL authentication is enabled. Otherwise, the image URL does not expire.
         *     *   Minimum value: 1.
         *     *   Maximum value: unlimited.
         *     *   Default value: If you leave this parameter empty, the default validity period that is specified in URL signing is used.
         * 
         * *   If you set OutputType to oss:
         * 
         *     *   This parameter takes effect only when the ACL of the Object Storage Service (OSS) bucket is private. Otherwise, the image URL does not expire.
         *     *   Minimum value: 1.
         *     *   If you store the image in the VOD bucket, the maximum value of this parameter is **2592000** (30 days). If you store the image in an OSS bucket, the maximum value of this parameter is **129600** (36 hours). The maximum value is limited to reduce security risks of the origin.
         *     *   Default value: 3600.
         */
        public Builder authTimeout(Long authTimeout) {
            this.putQueryParameter("AuthTimeout", authTimeout);
            this.authTimeout = authTimeout;
            return this;
        }

        /**
         * The ID of the image. You can use one of the following methods to obtain the ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com/). In the left-side navigation pane, choose Media Files > Image. On the Image page, view the image ID.
         * *   Obtain the image ID from the response to the [CreateUploadImage](~~CreateUploadImage~~) operation that you call to obtain the upload URL and credential.
         * *   Obtain the image ID from the response to the [SearchMedia](~~SearchMedia~~) operation that you call to query the image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The type of the output image URL. Valid values:
         * <p>
         * 
         * *   oss: OSS URL
         * *   cdn: CDN URL
         */
        public Builder outputType(String outputType) {
            this.putQueryParameter("OutputType", outputType);
            this.outputType = outputType;
            return this;
        }

        @Override
        public GetImageInfoRequest build() {
            return new GetImageInfoRequest(this);
        } 

    } 

}
