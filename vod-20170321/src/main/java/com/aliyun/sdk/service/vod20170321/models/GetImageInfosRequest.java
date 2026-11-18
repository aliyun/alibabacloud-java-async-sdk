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
         * <p>The expiration time of the image access URL. Unit: seconds.</p>
         * <ul>
         * <li>If OutputType is set to cdn:<ul>
         * <li>Only image URLs for which URL authentication is enabled expire. Otherwise, the URLs are permanently valid.</li>
         * <li>Minimum value: 1.</li>
         * <li>Maximum value: unlimited.</li>
         * <li>Default value: If this parameter is not specified, the default validity period configured for URL authentication is used.</li>
         * </ul>
         * </li>
         * <li>If OutputType is set to oss:<ul>
         * <li>Only playback URLs for images stored in private buckets expire. Otherwise, the URLs are permanently valid.</li>
         * <li>Minimum value: 1.</li>
         * <li>Maximum value: To reduce security risks to the origin server, the maximum value is <strong>2592000</strong> (30 days) if the image is stored in an ApsaraVideo VOD bucket, and <strong>129600</strong> (36 hours) if the image is stored in a custom OSS bucket.</li>
         * <li>Default value: If this parameter is not specified, the value is 3600.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder authTimeout(Long authTimeout) {
            this.putQueryParameter("AuthTimeout", authTimeout);
            this.authTimeout = authTimeout;
            return this;
        }

        /**
         * <p>The list of image IDs. Separate multiple IDs with commas (,). You can specify up to 20 IDs. You can obtain the image IDs by using one of the following methods:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com/">ApsaraVideo VOD console</a> and choose <strong>Media Files &gt; Images</strong> to view the IDs.</li>
         * <li>Call the <a href="~~CreateUploadImage~~">CreateUploadImage</a> operation to obtain the upload URL and credential. The image ID is returned in the response.</li>
         * <li>Call the <a href="~~SearchMedia~~">SearchMedia</a> operation to query images. The image ID is returned in the response.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bbc65bba53fed90de118a7849****,594228cdd14b4d069fc17a8c4a****</p>
         */
        public Builder imageIds(String imageIds) {
            this.putQueryParameter("ImageIds", imageIds);
            this.imageIds = imageIds;
            return this;
        }

        /**
         * <p>The type of the output image access URL. Valid values:</p>
         * <ul>
         * <li>oss: back-to-origin URL.</li>
         * <li>cdn (default): accelerated URL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cdn</p>
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
