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
         * <p>The expiration time of the image access URL. Unit: seconds.</p>
         * <ul>
         * <li>If OutputType is set to cdn:<ul>
         * <li>The image URL expires only if URL authentication is enabled. Otherwise, the URL is permanently valid.</li>
         * <li>Minimum value: 1.</li>
         * <li>Maximum value: unlimited.</li>
         * <li>Default value: If this parameter is not specified, the default validity period configured for URL authentication is used.</li>
         * </ul>
         * </li>
         * <li>If OutputType is set to oss:<ul>
         * <li>The playback URL expires only if the storage permission is set to private. Otherwise, the URL is permanently valid.</li>
         * <li>Minimum value: 1.</li>
         * <li>Maximum value: To reduce security risks of the origin server, the maximum value is <strong>2592000</strong> (30 days) if the image is stored in an ApsaraVideo VOD bucket, and <strong>129600</strong> (36 hours) if the image is stored in a custom OSS bucket.</li>
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
         * <p>The image ID. You can obtain the image ID by using one of the following methods:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com/">ApsaraVideo VOD console</a> and choose <strong>Media Assets</strong> &gt; <strong>Images</strong> to view the ID.</li>
         * <li>Call the <a href="~~CreateUploadImage~~">CreateUploadImage</a> operation to obtain the upload URL and credential. The image ID is returned in the response.</li>
         * <li>Call the <a href="~~SearchMedia~~">SearchMedia</a> operation to query images. The image ID is returned in the response.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3e34733b40b9a96ccf5c1ff6f69****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The type of the output image access URL. Valid values:</p>
         * <ul>
         * <li>oss: the back-to-origin URL.</li>
         * <li>cdn: the accelerated URL. This is the default value.</li>
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
        public GetImageInfoRequest build() {
            return new GetImageInfoRequest(this);
        } 

    } 

}
