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
 * {@link UpdateApiKeyQuotaRequest} extends {@link RequestModel}
 *
 * <p>UpdateApiKeyQuotaRequest</p>
 */
public class UpdateApiKeyQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keys")
    private java.util.List<Keys> keys;

    private UpdateApiKeyQuotaRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.keys = builder.keys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApiKeyQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return keys
     */
    public java.util.List<Keys> getKeys() {
        return this.keys;
    }

    public static final class Builder extends Request.Builder<UpdateApiKeyQuotaRequest, Builder> {
        private String instanceId; 
        private java.util.List<Keys> keys; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApiKeyQuotaRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.keys = request.keys;
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
         * Keys.
         */
        public Builder keys(java.util.List<Keys> keys) {
            String keysShrink = shrink(keys, "Keys", "json");
            this.putQueryParameter("Keys", keysShrink);
            this.keys = keys;
            return this;
        }

        @Override
        public UpdateApiKeyQuotaRequest build() {
            return new UpdateApiKeyQuotaRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateApiKeyQuotaRequest} extends {@link TeaModel}
     *
     * <p>UpdateApiKeyQuotaRequest</p>
     */
    public static class Keys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("LimitRate")
        private Double limitRate;

        @com.aliyun.core.annotation.NameInMap("LimitType")
        private String limitType;

        @com.aliyun.core.annotation.NameInMap("TokenQuota")
        private Long tokenQuota;

        private Keys(Builder builder) {
            this.apiKey = builder.apiKey;
            this.limitRate = builder.limitRate;
            this.limitType = builder.limitType;
            this.tokenQuota = builder.tokenQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Keys create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
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
         * @return tokenQuota
         */
        public Long getTokenQuota() {
            return this.tokenQuota;
        }

        public static final class Builder {
            private String apiKey; 
            private Double limitRate; 
            private String limitType; 
            private Long tokenQuota; 

            private Builder() {
            } 

            private Builder(Keys model) {
                this.apiKey = model.apiKey;
                this.limitRate = model.limitRate;
                this.limitType = model.limitType;
                this.tokenQuota = model.tokenQuota;
            } 

            /**
             * <p>API KEY</p>
             * 
             * <strong>example:</strong>
             * <p>sk-rds-xxx</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * LimitRate.
             */
            public Builder limitRate(Double limitRate) {
                this.limitRate = limitRate;
                return this;
            }

            /**
             * LimitType.
             */
            public Builder limitType(String limitType) {
                this.limitType = limitType;
                return this;
            }

            /**
             * TokenQuota.
             */
            public Builder tokenQuota(Long tokenQuota) {
                this.tokenQuota = tokenQuota;
                return this;
            }

            public Keys build() {
                return new Keys(this);
            } 

        } 

    }
}
