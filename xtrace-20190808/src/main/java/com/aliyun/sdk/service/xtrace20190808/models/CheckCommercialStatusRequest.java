// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckCommercialStatusRequest} extends {@link RequestModel}
 *
 * <p>CheckCommercialStatusRequest</p>
 */
public class CheckCommercialStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Service")
    @com.aliyun.core.annotation.Validation(required = true)
    private String service;

    private CheckCommercialStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.service = builder.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCommercialStatusRequest create() {
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
     * @return service
     */
    public String getService() {
        return this.service;
    }

    public static final class Builder extends Request.Builder<CheckCommercialStatusRequest, Builder> {
        private String regionId; 
        private String service; 

        private Builder() {
            super();
        } 

        private Builder(CheckCommercialStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.service = request.service;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Service.
         */
        public Builder service(String service) {
            this.putQueryParameter("Service", service);
            this.service = service;
            return this;
        }

        @Override
        public CheckCommercialStatusRequest build() {
            return new CheckCommercialStatusRequest(this);
        } 

    } 

}
