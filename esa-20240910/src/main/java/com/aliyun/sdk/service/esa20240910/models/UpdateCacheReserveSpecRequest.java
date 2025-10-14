// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateCacheReserveSpecRequest} extends {@link RequestModel}
 *
 * <p>UpdateCacheReserveSpecRequest</p>
 */
public class UpdateCacheReserveSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetQuotaGb")
    private Long targetQuotaGb;

    private UpdateCacheReserveSpecRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.chargeType = builder.chargeType;
        this.instanceId = builder.instanceId;
        this.targetQuotaGb = builder.targetQuotaGb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCacheReserveSpecRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return targetQuotaGb
     */
    public Long getTargetQuotaGb() {
        return this.targetQuotaGb;
    }

    public static final class Builder extends Request.Builder<UpdateCacheReserveSpecRequest, Builder> {
        private Boolean autoPay; 
        private String chargeType; 
        private String instanceId; 
        private Long targetQuotaGb; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCacheReserveSpecRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.chargeType = request.chargeType;
            this.instanceId = request.instanceId;
            this.targetQuotaGb = request.targetQuotaGb;
        } 

        /**
         * <p>Automatic payment.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Billing type. Valid values:</p>
         * <ul>
         * <li>PREPAY</li>
         * <li>POSTPAY</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-cr-9tuv*********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Cache requested size, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder targetQuotaGb(Long targetQuotaGb) {
            this.putQueryParameter("TargetQuotaGb", targetQuotaGb);
            this.targetQuotaGb = targetQuotaGb;
            return this;
        }

        @Override
        public UpdateCacheReserveSpecRequest build() {
            return new UpdateCacheReserveSpecRequest(this);
        } 

    } 

}
