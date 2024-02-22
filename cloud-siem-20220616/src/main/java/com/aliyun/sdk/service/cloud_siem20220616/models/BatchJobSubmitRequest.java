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
         * The detail config of task.
         */
        public Builder jsonConfig(String jsonConfig) {
            this.putBodyParameter("JsonConfig", jsonConfig);
            this.jsonConfig = jsonConfig;
            return this;
        }

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
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
