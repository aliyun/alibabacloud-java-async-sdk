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
 * {@link UpdateMOQuotaAlertThresholdRequest} extends {@link RequestModel}
 *
 * <p>UpdateMOQuotaAlertThresholdRequest</p>
 */
public class UpdateMOQuotaAlertThresholdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Apikey")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Apikey> apikey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private UpdateMOQuotaAlertThresholdRequest(Builder builder) {
        super(builder);
        this.apikey = builder.apikey;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMOQuotaAlertThresholdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apikey
     */
    public java.util.List<Apikey> getApikey() {
        return this.apikey;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateMOQuotaAlertThresholdRequest, Builder> {
        private java.util.List<Apikey> apikey; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMOQuotaAlertThresholdRequest request) {
            super(request);
            this.apikey = request.apikey;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apikey(java.util.List<Apikey> apikey) {
            String apikeyShrink = shrink(apikey, "Apikey", "json");
            this.putQueryParameter("Apikey", apikeyShrink);
            this.apikey = apikey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_copilot***_public_cn-*********6</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public UpdateMOQuotaAlertThresholdRequest build() {
            return new UpdateMOQuotaAlertThresholdRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMOQuotaAlertThresholdRequest} extends {@link TeaModel}
     *
     * <p>UpdateMOQuotaAlertThresholdRequest</p>
     */
    public static class Apikey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Apikey")
        private String apikey;

        @com.aliyun.core.annotation.NameInMap("ThresholdPercent")
        private Integer thresholdPercent;

        private Apikey(Builder builder) {
            this.apikey = builder.apikey;
            this.thresholdPercent = builder.thresholdPercent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Apikey create() {
            return builder().build();
        }

        /**
         * @return apikey
         */
        public String getApikey() {
            return this.apikey;
        }

        /**
         * @return thresholdPercent
         */
        public Integer getThresholdPercent() {
            return this.thresholdPercent;
        }

        public static final class Builder {
            private String apikey; 
            private Integer thresholdPercent; 

            private Builder() {
            } 

            private Builder(Apikey model) {
                this.apikey = model.apikey;
                this.thresholdPercent = model.thresholdPercent;
            } 

            /**
             * <p>ApiKey</p>
             * 
             * <strong>example:</strong>
             * <p>sk-rds-*****</p>
             */
            public Builder apikey(String apikey) {
                this.apikey = apikey;
                return this;
            }

            /**
             * ThresholdPercent.
             */
            public Builder thresholdPercent(Integer thresholdPercent) {
                this.thresholdPercent = thresholdPercent;
                return this;
            }

            public Apikey build() {
                return new Apikey(this);
            } 

        } 

    }
}
