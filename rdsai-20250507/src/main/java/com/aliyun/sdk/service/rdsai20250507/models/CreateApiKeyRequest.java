// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link CreateApiKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateApiKeyRequest</p>
 */
public class CreateApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DailyTokenQuota")
    private Long dailyTokenQuota;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyName")
    private String keyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LimitRate")
    @com.aliyun.core.annotation.Validation(maximum = 1)
    private Double limitRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LimitType")
    private String limitType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quantity")
    private Integer quantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenQuota")
    private Long tokenQuota;

    private CreateApiKeyRequest(Builder builder) {
        super(builder);
        this.dailyTokenQuota = builder.dailyTokenQuota;
        this.instanceId = builder.instanceId;
        this.keyName = builder.keyName;
        this.limitRate = builder.limitRate;
        this.limitType = builder.limitType;
        this.quantity = builder.quantity;
        this.tokenQuota = builder.tokenQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApiKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dailyTokenQuota
     */
    public Long getDailyTokenQuota() {
        return this.dailyTokenQuota;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return keyName
     */
    public String getKeyName() {
        return this.keyName;
    }

    /**
     * @return limitRate
     */
    public Double getLimitRate() {
        return this.limitRate;
    }

    /**
     * @return limitType
     */
    public String getLimitType() {
        return this.limitType;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * @return tokenQuota
     */
    public Long getTokenQuota() {
        return this.tokenQuota;
    }

    public static final class Builder extends Request.Builder<CreateApiKeyRequest, Builder> {
        private Long dailyTokenQuota; 
        private String instanceId; 
        private String keyName; 
        private Double limitRate; 
        private String limitType; 
        private Integer quantity; 
        private Long tokenQuota; 

        private Builder() {
            super();
        } 

        private Builder(CreateApiKeyRequest request) {
            super(request);
            this.dailyTokenQuota = request.dailyTokenQuota;
            this.instanceId = request.instanceId;
            this.keyName = request.keyName;
            this.limitRate = request.limitRate;
            this.limitType = request.limitType;
            this.quantity = request.quantity;
            this.tokenQuota = request.tokenQuota;
        } 

        /**
         * DailyTokenQuota.
         */
        public Builder dailyTokenQuota(Long dailyTokenQuota) {
            this.putQueryParameter("DailyTokenQuota", dailyTokenQuota);
            this.dailyTokenQuota = dailyTokenQuota;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * KeyName.
         */
        public Builder keyName(String keyName) {
            this.putQueryParameter("KeyName", keyName);
            this.keyName = keyName;
            return this;
        }

        /**
         * LimitRate.
         */
        public Builder limitRate(Double limitRate) {
            this.putQueryParameter("LimitRate", limitRate);
            this.limitRate = limitRate;
            return this;
        }

        /**
         * LimitType.
         */
        public Builder limitType(String limitType) {
            this.putQueryParameter("LimitType", limitType);
            this.limitType = limitType;
            return this;
        }

        /**
         * Quantity.
         */
        public Builder quantity(Integer quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
            return this;
        }

        /**
         * TokenQuota.
         */
        public Builder tokenQuota(Long tokenQuota) {
            this.putQueryParameter("TokenQuota", tokenQuota);
            this.tokenQuota = tokenQuota;
            return this;
        }

        @Override
        public CreateApiKeyRequest build() {
            return new CreateApiKeyRequest(this);
        } 

    } 

}
