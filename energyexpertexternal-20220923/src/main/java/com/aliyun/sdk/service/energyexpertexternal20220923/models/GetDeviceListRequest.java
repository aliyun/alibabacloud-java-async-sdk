// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceListRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceListRequest</p>
 */
public class GetDeviceListRequest extends Request {
    @Query
    @NameInMap("factoryId")
    @Validation(required = true)
    private String factoryId;

    private GetDeviceListRequest(Builder builder) {
        super(builder);
        this.factoryId = builder.factoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return factoryId
     */
    public String getFactoryId() {
        return this.factoryId;
    }

    public static final class Builder extends Request.Builder<GetDeviceListRequest, Builder> {
        private String factoryId; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceListRequest request) {
            super(request);
            this.factoryId = request.factoryId;
        } 

        /**
         * factoryId.
         */
        public Builder factoryId(String factoryId) {
            this.putQueryParameter("factoryId", factoryId);
            this.factoryId = factoryId;
            return this;
        }

        @Override
        public GetDeviceListRequest build() {
            return new GetDeviceListRequest(this);
        } 

    } 

}
