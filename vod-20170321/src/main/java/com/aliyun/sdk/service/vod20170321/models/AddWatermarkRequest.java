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
         * <p>The ID of the application. Default value: <strong>app-1000000</strong>. If you have activated the multi-application service, specify the ID of the application to add the watermark template in the specified application. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The URL of the watermark file. The URL must be an Object Storage Service (OSS) URL and cannot contain the information used for URL signing.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required if you set <code>Type</code> to <code>Image</code>.</li>
         * <li>You can obtain the URL from the <code>FileURL</code> parameter in the response to the <a href="~~CreateUploadAttachedMedia~~">CreateUploadAttachedMedia</a> operation that you call to upload the watermark image to ApsaraVideo VOD.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://outin-326268*****63e1403e7.oss-cn-shanghai.aliyuncs.com/image/cover/C99345*****E7FDEC-6-2.png">http://outin-326268*****63e1403e7.oss-cn-shanghai.aliyuncs.com/image/cover/C99345*****E7FDEC-6-2.png</a></p>
         */
        public Builder fileUrl(String fileUrl) {
            this.putQueryParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * <p>The name of the watermark template.</p>
         * <ul>
         * <li>Only letters and digits are supported.</li>
         * <li>The name cannot exceed 128 bytes.</li>
         * <li>The value must be encoded in UTF-8.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>watermark</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The type of the watermark template. Valid values:</p>
         * <ul>
         * <li><strong>Image</strong> (default): image watermark template</li>
         * <li><strong>Text</strong>: text watermark template</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Text</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The configuration information of the watermark such as the display position and special effects. The value must be a JSON string. The configuration parameters for image and text watermarks are different. For more information about the parameter structure, see <a href="~~98618#section-h01-44s-2lr~~">WatermarkConfig</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Width&quot;:&quot;55&quot;,&quot;Height&quot;:&quot;55&quot;,&quot;Dx&quot;:&quot;9&quot;,&quot;Dy&quot;:&quot;9&quot;,&quot;ReferPos&quot;:&quot;BottonLeft&quot;}</p>
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
