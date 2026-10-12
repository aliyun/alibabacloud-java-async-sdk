// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetApiPathFieldConfigRequest} extends {@link RequestModel}
 *
 * <p>GetApiPathFieldConfigRequest</p>
 */
public class GetApiPathFieldConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    private String httpApiId;

    private GetApiPathFieldConfigRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.httpApiId = builder.httpApiId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApiPathFieldConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    public static final class Builder extends Request.Builder<GetApiPathFieldConfigRequest, Builder> {
        private String gatewayId; 
        private String httpApiId; 

        private Builder() {
            super();
        } 

        private Builder(GetApiPathFieldConfigRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.httpApiId = request.httpApiId;
        } 

        /**
         * <p>The ID of the cloud-native API gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-123456</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The ID of the HTTP API.</p>
         * 
         * <strong>example:</strong>
         * <p>api-123456</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.putQueryParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        @Override
        public GetApiPathFieldConfigRequest build() {
            return new GetApiPathFieldConfigRequest(this);
        } 

    } 

}
