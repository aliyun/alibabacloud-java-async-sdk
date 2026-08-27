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
 * {@link GetRiskNotificationRequest} extends {@link RequestModel}
 *
 * <p>GetRiskNotificationRequest</p>
 */
public class GetRiskNotificationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("riskCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String riskCode;

    private GetRiskNotificationRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.riskCode = builder.riskCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRiskNotificationRequest create() {
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
     * @return riskCode
     */
    public String getRiskCode() {
        return this.riskCode;
    }

    public static final class Builder extends Request.Builder<GetRiskNotificationRequest, Builder> {
        private String gatewayId; 
        private String riskCode; 

        private Builder() {
            super();
        } 

        private Builder(GetRiskNotificationRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.riskCode = request.riskCode;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder riskCode(String riskCode) {
            this.putQueryParameter("riskCode", riskCode);
            this.riskCode = riskCode;
            return this;
        }

        @Override
        public GetRiskNotificationRequest build() {
            return new GetRiskNotificationRequest(this);
        } 

    } 

}
