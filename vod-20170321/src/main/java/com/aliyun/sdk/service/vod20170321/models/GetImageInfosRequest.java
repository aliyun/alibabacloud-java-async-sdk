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
         * <p>The time when the image URL expires. Unit: seconds.</p>
         * <ul>
         * <li><p>If the OutputType parameter is set to cdn:</p>
         * <ul>
         * <li>This parameter takes effect only if URL authentication is enabled. Otherwise, the image URL does not expire.</li>
         * <li>Minimum value: 1.</li>
         * <li>Maximum value: unlimited.</li>
         * <li>Default value: The default validity period that is specified in URL authentication is used.</li>
         * </ul>
         * </li>
         * <li><p>If the OutputType parameter is set to oss:</p>
         * <ul>
         * <li>This parameter takes effect only when the ACL of the Object Storage Service (OSS) bucket is private. Otherwise, the image URL does not expire.</li>
         * <li>Minimum value: 1.</li>
         * <li>If you store the image in the VOD bucket, the maximum value of this parameter is <strong>2592000</strong> (30 days). If you store the image in an OSS bucket, the maximum value of this parameter is <strong>129600</strong> (36 hours). The maximum value is limited to reduce security risks of the origin.</li>
         * <li>Default value: 3600.</li>
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
         * <p>The image IDs. Separate multiple IDs with commas (,). You can specify up to 20 image IDs. You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com/">ApsaraVideo VOD console</a> and choose <strong>Media Files &gt; Images</strong> in the left-side navigation pane.</li>
         * <li>Obtain the value of ImageId from the response to the CreateUploadImage operation that you call to obtain the upload URL and credential.</li>
         * <li>Obtain the value of ImageId from the response to the <a href="~~SearchMedia~~">SearchMedia</a> operation after you upload images.</li>
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
         * <p>The type of the output image URL. Valid values:</p>
         * <ul>
         * <li>oss: OSS URL</li>
         * <li>cdn: CDN URL</li>
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
