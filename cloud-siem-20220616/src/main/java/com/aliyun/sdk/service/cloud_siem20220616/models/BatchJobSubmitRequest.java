// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchJobSubmitRequest} extends {@link RequestModel}
 *
 * <p>BatchJobSubmitRequest</p>
 */
public class BatchJobSubmitRequest extends Request {
    @Body
    @NameInMap("JsonConfig")
    private String jsonConfig;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private BatchJobSubmitRequest(Builder builder) {
        super(builder);
        this.jsonConfig = builder.jsonConfig;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchJobSubmitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jsonConfig
     */
    public String getJsonConfig() {
        return this.jsonConfig;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<BatchJobSubmitRequest, Builder> {
        private String jsonConfig; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(BatchJobSubmitRequest request) {
            super(request);
            this.jsonConfig = request.jsonConfig;
            this.regionId = request.regionId;
        } 

        /**
         * JsonConfig.
         */
        public Builder jsonConfig(String jsonConfig) {
            this.putBodyParameter("JsonConfig", jsonConfig);
            this.jsonConfig = jsonConfig;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public BatchJobSubmitRequest build() {
            return new BatchJobSubmitRequest(this);
        } 

    } 

}
