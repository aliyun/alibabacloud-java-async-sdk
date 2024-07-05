// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddWatermarkRequest} extends {@link RequestModel}
 *
 * <p>AddWatermarkRequest</p>
 */
public class AddWatermarkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileUrl")
    private String fileUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String watermarkConfig;

    private AddWatermarkRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.fileUrl = builder.fileUrl;
        this.name = builder.name;
        this.type = builder.type;
        this.watermarkConfig = builder.watermarkConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddWatermarkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return watermarkConfig
     */
    public String getWatermarkConfig() {
        return this.watermarkConfig;
    }

    public static final class Builder extends Request.Builder<AddWatermarkRequest, Builder> {
        private String appId; 
        private String fileUrl; 
        private String name; 
        private String type; 
        private String watermarkConfig; 

        private Builder() {
            super();
        } 

        private Builder(AddWatermarkRequest request) {
            super(request);
            this.appId = request.appId;
            this.fileUrl = request.fileUrl;
            this.name = request.name;
            this.type = request.type;
            this.watermarkConfig = request.watermarkConfig;
        } 

        /**
         * The ID of the application. Default value: **app-1000000**. If you have activated the multi-application service, specify the ID of the application to add the watermark template in the specified application. For more information, see [Overview](~~113600~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The URL of the watermark file. The URL must be an Object Storage Service (OSS) URL and cannot contain the information used for URL signing.
         * <p>
         * 
         * > *   This parameter is required if you set `Type` to `Image`.
         * > *  You can obtain the URL from the `FileURL` parameter in the response to the [CreateUploadAttachedMedia](~~CreateUploadAttachedMedia~~) operation that you call to upload the watermark image to ApsaraVideo VOD.
         */
        public Builder fileUrl(String fileUrl) {
            this.putQueryParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * The name of the watermark template.
         * <p>
         * 
         * *   Only letters and digits are supported.
         * *   The name cannot exceed 128 bytes.
         * *   The value must be encoded in UTF-8.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The type of the watermark template. Valid values:
         * <p>
         * 
         * *   **Image** (default): image watermark template
         * *   **Text**: text watermark template
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The configuration information of the watermark such as the display position and special effects. The value must be a JSON string. The configuration parameters for image and text watermarks are different. For more information about the parameter structure, see [WatermarkConfig](~~98618#section-h01-44s-2lr~~).
         */
        public Builder watermarkConfig(String watermarkConfig) {
            this.putQueryParameter("WatermarkConfig", watermarkConfig);
            this.watermarkConfig = watermarkConfig;
            return this;
        }

        @Override
        public AddWatermarkRequest build() {
            return new AddWatermarkRequest(this);
        } 

    } 

}
