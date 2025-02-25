// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateGatewayNameRequest} extends {@link RequestModel}
 *
 * <p>ValidateGatewayNameRequest</p>
 */
public class ValidateGatewayNameRequest extends Request {
    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("StorageBundleId")
    private String storageBundleId;

    private ValidateGatewayNameRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.storageBundleId = builder.storageBundleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateGatewayNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return storageBundleId
     */
    public String getStorageBundleId() {
        return this.storageBundleId;
    }

    public static final class Builder extends Request.Builder<ValidateGatewayNameRequest, Builder> {
        private String name; 
        private String storageBundleId; 

        private Builder() {
            super();
        } 

        private Builder(ValidateGatewayNameRequest request) {
            super(request);
            this.name = request.name;
            this.storageBundleId = request.storageBundleId;
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
         * StorageBundleId.
         */
        public Builder storageBundleId(String storageBundleId) {
            this.putQueryParameter("StorageBundleId", storageBundleId);
            this.storageBundleId = storageBundleId;
            return this;
        }

        @Override
        public ValidateGatewayNameRequest build() {
            return new ValidateGatewayNameRequest(this);
        } 

    } 

}
