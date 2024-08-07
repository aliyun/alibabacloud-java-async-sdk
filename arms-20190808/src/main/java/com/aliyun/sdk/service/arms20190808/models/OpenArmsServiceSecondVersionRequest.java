// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenArmsServiceSecondVersionRequest} extends {@link RequestModel}
 *
 * <p>OpenArmsServiceSecondVersionRequest</p>
 */
public class OpenArmsServiceSecondVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private OpenArmsServiceSecondVersionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenArmsServiceSecondVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<OpenArmsServiceSecondVersionRequest, Builder> {
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(OpenArmsServiceSecondVersionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.type = request.type;
        } 

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the service. Valid values:
         * <p>
         * 
         * *   `arms`: ARMS
         * *   `arms_app`: Application Monitoring
         * *   `arms_web`: Browser Monitoring
         * *   `prometheus_monitor`: Managed Service for Prometheus
         * *   `synthetic_post`: Synthetic Monitoring
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public OpenArmsServiceSecondVersionRequest build() {
            return new OpenArmsServiceSecondVersionRequest(this);
        } 

    } 

}
