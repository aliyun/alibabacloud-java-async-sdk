// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushMeteringDataRequest} extends {@link RequestModel}
 *
 * <p>PushMeteringDataRequest</p>
 */
public class PushMeteringDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Metering")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metering;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceInstanceId;

    private PushMeteringDataRequest(Builder builder) {
        super(builder);
        this.metering = builder.metering;
        this.serviceInstanceId = builder.serviceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushMeteringDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metering
     */
    public String getMetering() {
        return this.metering;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public static final class Builder extends Request.Builder<PushMeteringDataRequest, Builder> {
        private String metering; 
        private String serviceInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(PushMeteringDataRequest request) {
            super(request);
            this.metering = request.metering;
            this.serviceInstanceId = request.serviceInstanceId;
        } 

        /**
         * Metering.
         */
        public Builder metering(String metering) {
            this.putQueryParameter("Metering", metering);
            this.metering = metering;
            return this;
        }

        /**
         * ServiceInstanceId.
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        @Override
        public PushMeteringDataRequest build() {
            return new PushMeteringDataRequest(this);
        } 

    } 

}
