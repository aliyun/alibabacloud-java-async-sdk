// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link UpdateImageLibFreeInspectionRequest} extends {@link RequestModel}
 *
 * <p>UpdateImageLibFreeInspectionRequest</p>
 */
public class UpdateImageLibFreeInspectionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private java.util.Map<String, Integer> config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    private UpdateImageLibFreeInspectionRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.regionId = builder.regionId;
        this.serviceCode = builder.serviceCode;
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
    public java.util.Map<String, Integer> getConfig() {
        return this.config;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    public static final class Builder extends Request.Builder<UpdateImageLibFreeInspectionRequest, Builder> {
        private java.util.Map<String, Integer> config; 
        private String regionId; 
        private String serviceCode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateImageLibFreeInspectionRequest request) {
            super(request);
            this.config = request.config;
            this.regionId = request.regionId;
            this.serviceCode = request.serviceCode;
        } 

        /**
         * <p>Configuration.</p>
         */
        public Builder config(java.util.Map<String, Integer> config) {
            String configShrink = shrink(config, "Config", "json");
            this.putBodyParameter("Config", configShrink);
            this.config = config;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ServiceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        @Override
        public UpdateImageLibFreeInspectionRequest build() {
            return new UpdateImageLibFreeInspectionRequest(this);
        } 

    } 

}
