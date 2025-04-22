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
         * <p>The time when the image URL expires. Unit: seconds.</p>
         * <ul>
         * <li><p>If you set OutputType to cdn:</p>
         * <ul>
         * <li>This parameter takes effect only if URL authentication is enabled. Otherwise, the image URL does not expire.</li>
         * <li>Minimum value: 1.</li>
         * <li>Maximum value: unlimited.</li>
         * <li>Default value: If you leave this parameter empty, the default validity period that is specified in URL signing is used.</li>
         * </ul>
         * </li>
         * <li><p>If you set OutputType to oss:</p>
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
         * <p>The ID of the image. You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com/">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose Media Files &gt; Image. On the Image page, view the image ID.</li>
         * <li>Obtain the image ID from the response to the <a href="~~CreateUploadImage~~">CreateUploadImage</a> operation that you call to obtain the upload URL and credential.</li>
         * <li>Obtain the image ID from the response to the <a href="~~SearchMedia~~">SearchMedia</a> operation that you call to query the image.</li>
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
        public GetImageInfoRequest build() {
            return new GetImageInfoRequest(this);
        } 

    } 

}
