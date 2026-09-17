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
 * {@link GetGatewayResourceQuotaUsageRequest} extends {@link RequestModel}
 *
 * <p>GetGatewayResourceQuotaUsageRequest</p>
 */
public class GetGatewayResourceQuotaUsageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    private GetGatewayResourceQuotaUsageRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayResourceQuotaUsageRequest create() {
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

    public static final class Builder extends Request.Builder<GetGatewayResourceQuotaUsageRequest, Builder> {
        private String gatewayId; 

        private Builder() {
            super();
        } 

        private Builder(GetGatewayResourceQuotaUsageRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
        } 

        /**
         * <p>目标网关的唯一标识，通过请求路径 gatewayId 传入。可调用 ListGateways 查询；请将示例替换为当前地域内有权限访问的实际网关ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-d5be0s9q5z6f1234567g</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        @Override
        public GetGatewayResourceQuotaUsageRequest build() {
            return new GetGatewayResourceQuotaUsageRequest(this);
        } 

    } 

}
