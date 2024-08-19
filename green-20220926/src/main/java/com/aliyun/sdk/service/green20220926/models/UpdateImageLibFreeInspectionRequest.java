// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateImageLibFreeInspectionRequest} extends {@link RequestModel}
 *
 * <p>UpdateImageLibFreeInspectionRequest</p>
 */
public class UpdateImageLibFreeInspectionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private java.util.Map < String, Integer > config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private UpdateImageLibFreeInspectionRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateImageLibFreeInspectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public java.util.Map < String, Integer > getConfig() {
        return this.config;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateImageLibFreeInspectionRequest, Builder> {
        private java.util.Map < String, Integer > config; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateImageLibFreeInspectionRequest request) {
            super(request);
            this.config = request.config;
            this.regionId = request.regionId;
        } 

        /**
         * Config.
         */
        public Builder config(java.util.Map < String, Integer > config) {
            String configShrink = shrink(config, "Config", "json");
            this.putBodyParameter("Config", configShrink);
            this.config = config;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateImageLibFreeInspectionRequest build() {
            return new UpdateImageLibFreeInspectionRequest(this);
        } 

    } 

}
