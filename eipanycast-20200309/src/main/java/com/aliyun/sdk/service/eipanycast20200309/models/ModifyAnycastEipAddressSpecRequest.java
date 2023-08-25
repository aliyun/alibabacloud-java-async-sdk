// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAnycastEipAddressSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyAnycastEipAddressSpecRequest</p>
 */
public class ModifyAnycastEipAddressSpecRequest extends Request {
    @Query
    @NameInMap("AnycastId")
    @Validation(required = true)
    private String anycastId;

    @Query
    @NameInMap("Bandwidth")
    @Validation(required = true)
    private String bandwidth;

    private ModifyAnycastEipAddressSpecRequest(Builder builder) {
        super(builder);
        this.anycastId = builder.anycastId;
        this.bandwidth = builder.bandwidth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAnycastEipAddressSpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anycastId
     */
    public String getAnycastId() {
        return this.anycastId;
    }

    /**
     * @return bandwidth
     */
    public String getBandwidth() {
        return this.bandwidth;
    }

    public static final class Builder extends Request.Builder<ModifyAnycastEipAddressSpecRequest, Builder> {
        private String anycastId; 
        private String bandwidth; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAnycastEipAddressSpecRequest request) {
            super(request);
            this.anycastId = request.anycastId;
            this.bandwidth = request.bandwidth;
        } 

        /**
         * The ID of the Anycast EIP.
         */
        public Builder anycastId(String anycastId) {
            this.putQueryParameter("AnycastId", anycastId);
            this.anycastId = anycastId;
            return this;
        }

        /**
         * The maximum bandwidth of the Anycast EIP. Unit: Mbit/s.
         * <p>
         * 
         * Valid values: **200** to **1000**.
         */
        public Builder bandwidth(String bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        @Override
        public ModifyAnycastEipAddressSpecRequest build() {
            return new ModifyAnycastEipAddressSpecRequest(this);
        } 

    } 

}
