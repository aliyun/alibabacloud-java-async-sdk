// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddWatermarkRequest} extends {@link RequestModel}
 *
 * <p>AddWatermarkRequest</p>
 */
public class AddWatermarkRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("FileUrl")
    private String fileUrl;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("WatermarkConfig")
    @Validation(required = true)
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

        private Builder(AddWatermarkRequest response) {
            super(response);
            this.appId = response.appId;
            this.fileUrl = response.fileUrl;
            this.name = response.name;
            this.type = response.type;
            this.watermarkConfig = response.watermarkConfig;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * FileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.putQueryParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
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
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
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

        @Override
        public AddWatermarkRequest build() {
            return new AddWatermarkRequest(this);
        } 

    } 

}
