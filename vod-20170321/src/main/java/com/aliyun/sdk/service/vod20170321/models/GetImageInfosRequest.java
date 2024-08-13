// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageInfosRequest} extends {@link RequestModel}
 *
 * <p>GetImageInfosRequest</p>
 */
public class GetImageInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthTimeout")
    private Long authTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputType")
    private String outputType;

    private GetImageInfosRequest(Builder builder) {
        super(builder);
        this.authTimeout = builder.authTimeout;
        this.imageIds = builder.imageIds;
        this.outputType = builder.outputType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageInfosRequest create() {
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
     * @return imageIds
     */
    public String getImageIds() {
        return this.imageIds;
    }

    /**
     * @return outputType
     */
    public String getOutputType() {
        return this.outputType;
    }

    public static final class Builder extends Request.Builder<GetImageInfosRequest, Builder> {
        private Long authTimeout; 
        private String imageIds; 
        private String outputType; 

        private Builder() {
            super();
        } 

        private Builder(GetImageInfosRequest request) {
            super(request);
            this.authTimeout = request.authTimeout;
            this.imageIds = request.imageIds;
            this.outputType = request.outputType;
        } 

        /**
         * The time when the image URL expires. Unit: seconds.
         * <p>
         * 
         * *   If the OutputType parameter is set to cdn:
         * 
         *     *   This parameter takes effect only if URL authentication is enabled. Otherwise, the image URL does not expire.
         *     *   Minimum value: 1.
         *     *   Maximum value: unlimited.
         *     *   Default value: The default validity period that is specified in URL authentication is used.
         * 
         * *   If the OutputType parameter is set to oss:
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
         * The image IDs. Separate multiple IDs with commas (,). You can specify up to 20 image IDs. You can use one of the following methods to obtain the ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com/) and choose **Media Files > Images** in the left-side navigation pane.
         * *   Obtain the value of ImageId from the response to the CreateUploadImage operation that you call to obtain the upload URL and credential.
         * *   Obtain the value of ImageId from the response to the [SearchMedia](~~SearchMedia~~) operation after you upload images.
         */
        public Builder imageIds(String imageIds) {
            this.putQueryParameter("ImageIds", imageIds);
            this.imageIds = imageIds;
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
        public GetImageInfosRequest build() {
            return new GetImageInfosRequest(this);
        } 

    } 

}
