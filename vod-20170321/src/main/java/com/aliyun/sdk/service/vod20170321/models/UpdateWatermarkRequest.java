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

        private Builder(UpdateWatermarkRequest response) {
            super(response);
            this.name = response.name;
            this.watermarkConfig = response.watermarkConfig;
            this.watermarkId = response.watermarkId;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * WatermarkConfig.
         */
        public Builder watermarkConfig(String watermarkConfig) {
            this.putQueryParameter("WatermarkConfig", watermarkConfig);
            this.watermarkConfig = watermarkConfig;
            return this;
        }

        /**
         * WatermarkId.
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
