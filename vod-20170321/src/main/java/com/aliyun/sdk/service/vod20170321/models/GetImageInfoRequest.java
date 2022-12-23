// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageInfoRequest} extends {@link RequestModel}
 *
 * <p>GetImageInfoRequest</p>
 */
public class GetImageInfoRequest extends Request {
    @Query
    @NameInMap("AuthTimeout")
    private Long authTimeout;

    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("OutputType")
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
         * The validity period of the image URL. Unit: seconds.
         * <p>
         * 
         * > *   If the OutputType parameter is set to **cdn**:
         * >     *   The image URL has a validity period only if URL signing is enabled. Otherwise, the image URL is permanently valid.
         * >     *   Minimum value: **1**.
         * >     *   Maximum value: unlimited.
         * >     *   Default value: If you do not set this parameter, the default validity period that is specified in URL signing is used.
         * > *   If the OutputType parameter is set to **oss**:
         * >     *   The image URL has a validity period only if the permissions on the Object Storage Service (OSS) bucket are private. Otherwise, the image URL is permanently valid.
         * >     *   Minimum value: **1**.
         * >     *   Maximum value: **2592000** (30 days). The maximum value is limited to reduce security risks of the origin.
         * >     *   Default value: If you do not set this parameter, the default value is **3600**.
         */
        public Builder authTimeout(Long authTimeout) {
            this.putQueryParameter("AuthTimeout", authTimeout);
            this.authTimeout = authTimeout;
            return this;
        }

        /**
         * The ID of the image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The type of the image URL. Valid values:
         * <p>
         * 
         * *   **oss**: OSS URL
         * *   **cdn** (default): Content Delivery Network (CDN) URL
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
