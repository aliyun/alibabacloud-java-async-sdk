// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayServiceVersionRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayServiceVersionRequest</p>
 */
public class UpdateGatewayServiceVersionRequest extends Request {
    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("ServiceId")
    private Long serviceId;

    @Query
    @NameInMap("ServiceVersion")
    private String serviceVersion;

    private UpdateGatewayServiceVersionRequest(Builder builder) {
        super(builder);
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.serviceId = builder.serviceId;
        this.serviceVersion = builder.serviceVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayServiceVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayServiceVersionRequest, Builder> {
        private String gatewayUniqueId; 
        private Long serviceId; 
        private String serviceVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayServiceVersionRequest response) {
            super(response);
            this.gatewayUniqueId = response.gatewayUniqueId;
            this.serviceId = response.serviceId;
            this.serviceVersion = response.serviceVersion;
        } 

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(Long serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * ServiceVersion.
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        @Override
        public UpdateGatewayServiceVersionRequest build() {
            return new UpdateGatewayServiceVersionRequest(this);
        } 

    } 

}
