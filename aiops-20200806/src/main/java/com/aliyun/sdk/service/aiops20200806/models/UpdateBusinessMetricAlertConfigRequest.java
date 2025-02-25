// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBusinessMetricAlertConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateBusinessMetricAlertConfigRequest</p>
 */
public class UpdateBusinessMetricAlertConfigRequest extends Request {
    @Query
    @NameInMap("AlertConfigId")
    private Long alertConfigId;

    @Query
    @NameInMap("Configs")
    private String configs;

    @Query
    @NameInMap("MetricId")
    private Long metricId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private UpdateBusinessMetricAlertConfigRequest(Builder builder) {
        super(builder);
        this.alertConfigId = builder.alertConfigId;
        this.configs = builder.configs;
        this.metricId = builder.metricId;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBusinessMetricAlertConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertConfigId
     */
    public Long getAlertConfigId() {
        return this.alertConfigId;
    }

    /**
     * @return configs
     */
    public String getConfigs() {
        return this.configs;
    }

    /**
     * @return metricId
     */
    public Long getMetricId() {
        return this.metricId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<UpdateBusinessMetricAlertConfigRequest, Builder> {
        private Long alertConfigId; 
        private String configs; 
        private Long metricId; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBusinessMetricAlertConfigRequest request) {
            super(request);
            this.alertConfigId = request.alertConfigId;
            this.configs = request.configs;
            this.metricId = request.metricId;
            this.operaUid = request.operaUid;
        } 

        /**
         * AlertConfigId.
         */
        public Builder alertConfigId(Long alertConfigId) {
            this.putQueryParameter("AlertConfigId", alertConfigId);
            this.alertConfigId = alertConfigId;
            return this;
        }

        /**
         * Configs.
         */
        public Builder configs(String configs) {
            this.putQueryParameter("Configs", configs);
            this.configs = configs;
            return this;
        }

        /**
         * MetricId.
         */
        public Builder metricId(Long metricId) {
            this.putQueryParameter("MetricId", metricId);
            this.metricId = metricId;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public UpdateBusinessMetricAlertConfigRequest build() {
            return new UpdateBusinessMetricAlertConfigRequest(this);
        } 

    } 

}
