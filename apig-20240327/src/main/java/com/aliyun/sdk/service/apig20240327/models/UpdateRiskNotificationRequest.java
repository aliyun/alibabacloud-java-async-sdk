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
 * {@link UpdateRiskNotificationRequest} extends {@link RequestModel}
 *
 * <p>UpdateRiskNotificationRequest</p>
 */
public class UpdateRiskNotificationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isMute")
    private Boolean isMute;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("riskCode")
    private String riskCode;

    private UpdateRiskNotificationRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.isMute = builder.isMute;
        this.riskCode = builder.riskCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRiskNotificationRequest create() {
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
     * @return isMute
     */
    public Boolean getIsMute() {
        return this.isMute;
    }

    /**
     * @return riskCode
     */
    public String getRiskCode() {
        return this.riskCode;
    }

    public static final class Builder extends Request.Builder<UpdateRiskNotificationRequest, Builder> {
        private String gatewayId; 
        private Boolean isMute; 
        private String riskCode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRiskNotificationRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.isMute = request.isMute;
            this.riskCode = request.riskCode;
        } 

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * isMute.
         */
        public Builder isMute(Boolean isMute) {
            this.putBodyParameter("isMute", isMute);
            this.isMute = isMute;
            return this;
        }

        /**
         * riskCode.
         */
        public Builder riskCode(String riskCode) {
            this.putBodyParameter("riskCode", riskCode);
            this.riskCode = riskCode;
            return this;
        }

        @Override
        public UpdateRiskNotificationRequest build() {
            return new UpdateRiskNotificationRequest(this);
        } 

    } 

}
