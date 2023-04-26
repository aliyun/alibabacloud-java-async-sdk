// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWatermarkRequest} extends {@link RequestModel}
 *
 * <p>UpdateWatermarkRequest</p>
 */
public class UpdateWatermarkRequest extends Request {
    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("WatermarkConfig")
    @Validation(required = true)
    private String watermarkConfig;

    @Query
    @NameInMap("WatermarkId")
    @Validation(required = true)
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
         * The ID of the watermark.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The name of the watermark.
         */
        public Builder watermarkConfig(String watermarkConfig) {
            this.putQueryParameter("WatermarkConfig", watermarkConfig);
            this.watermarkConfig = watermarkConfig;
            return this;
        }

        /**
         * The configurations such as the position and effect of the text watermark or image watermark. The value is a JSON-formatted string.
         * <p>
         * 
         * > The value of this parameter varies with the watermark type. For more information about the data structure, see the "WatermarkConfig" section of the [Media processing parameters](~~98618~~) topic.
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
