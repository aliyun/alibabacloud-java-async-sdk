// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWatermarkRequest} extends {@link RequestModel}
 *
 * <p>UpdateWatermarkRequest</p>
 */
public class UpdateWatermarkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String watermarkConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String watermarkId;

    private UpdateWatermarkRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.watermarkConfig = builder.watermarkConfig;
        this.watermarkId = builder.watermarkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWatermarkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return watermarkConfig
     */
    public String getWatermarkConfig() {
        return this.watermarkConfig;
    }

    /**
     * @return watermarkId
     */
    public String getWatermarkId() {
        return this.watermarkId;
    }

    public static final class Builder extends Request.Builder<UpdateWatermarkRequest, Builder> {
        private String name; 
        private String watermarkConfig; 
        private String watermarkId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWatermarkRequest request) {
            super(request);
            this.name = request.name;
            this.watermarkConfig = request.watermarkConfig;
            this.watermarkId = request.watermarkId;
        } 

        /**
         * The name of the watermark template to which you want to change.
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
         * The configuration information of the watermark such as the display position and special effects. The value must be a JSON string. The configuration parameters for image and text watermarks are different. For more information about the parameter structure, see [WatermarkConfig](~~98618#section-h01-44s-2lr~~).
         */
        public Builder watermarkConfig(String watermarkConfig) {
            this.putQueryParameter("WatermarkConfig", watermarkConfig);
            this.watermarkConfig = watermarkConfig;
            return this;
        }

        /**
         * The ID of the watermark template. You can specify only one watermark template ID. You can obtain the ID by using one of the following methods:
         * <p>
         * 
         * *   Obtain the watermark template ID from the response to the [AddWatermark](~~AddWatermark~~) operation that you call to create a watermark template.
         * *   Obtain the watermark template ID from the response to the [ListWatermark](~~ListWatermark~~) operation that you call to query all watermark templates within your account.
         */
        public Builder watermarkId(String watermarkId) {
            this.putQueryParameter("WatermarkId", watermarkId);
            this.watermarkId = watermarkId;
            return this;
        }

        @Override
        public UpdateWatermarkRequest build() {
            return new UpdateWatermarkRequest(this);
        } 

    } 

}
