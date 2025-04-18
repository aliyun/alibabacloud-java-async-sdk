// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link GetDeviceListRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceListRequest</p>
 */
public class GetDeviceListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("factoryId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the site.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pn_95</p>
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
