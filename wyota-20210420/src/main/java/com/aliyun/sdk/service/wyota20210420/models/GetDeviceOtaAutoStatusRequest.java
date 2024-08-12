// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceOtaAutoStatusRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceOtaAutoStatusRequest</p>
 */
public class GetDeviceOtaAutoStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private Integer clientType;

    private GetDeviceOtaAutoStatusRequest(Builder builder) {
        super(builder);
        this.clientType = builder.clientType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceOtaAutoStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientType
     */
    public Integer getClientType() {
        return this.clientType;
    }

    public static final class Builder extends Request.Builder<GetDeviceOtaAutoStatusRequest, Builder> {
        private Integer clientType; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceOtaAutoStatusRequest request) {
            super(request);
            this.clientType = request.clientType;
        } 

        /**
         * ClientType.
         */
        public Builder clientType(Integer clientType) {
            this.putBodyParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        @Override
        public GetDeviceOtaAutoStatusRequest build() {
            return new GetDeviceOtaAutoStatusRequest(this);
        } 

    } 

}
