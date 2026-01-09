// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20220913.models;

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
 * {@link CreateInstanceTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceTaskRequest</p>
 */
public class CreateInstanceTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CalbackUrl")
    private String calbackUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private Long clientId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MonitorType")
    private String monitorType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutputConfig")
    private String outputConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScoreStrategyConfig")
    private String scoreStrategyConfig;

    private CreateInstanceTaskRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.calbackUrl = builder.calbackUrl;
        this.clientId = builder.clientId;
        this.datasetIds = builder.datasetIds;
        this.monitorType = builder.monitorType;
        this.name = builder.name;
        this.outputConfig = builder.outputConfig;
        this.requestId = builder.requestId;
        this.scoreStrategyConfig = builder.scoreStrategyConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return calbackUrl
     */
    public String getCalbackUrl() {
        return this.calbackUrl;
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return datasetIds
     */
    public String getDatasetIds() {
        return this.datasetIds;
    }

    /**
     * @return monitorType
     */
    public String getMonitorType() {
        return this.monitorType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return outputConfig
     */
    public String getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scoreStrategyConfig
     */
    public String getScoreStrategyConfig() {
        return this.scoreStrategyConfig;
    }

    public static final class Builder extends Request.Builder<CreateInstanceTaskRequest, Builder> {
        private Long appId; 
        private String calbackUrl; 
        private Long clientId; 
        private String datasetIds; 
        private String monitorType; 
        private String name; 
        private String outputConfig; 
        private String requestId; 
        private String scoreStrategyConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceTaskRequest request) {
            super(request);
            this.appId = request.appId;
            this.calbackUrl = request.calbackUrl;
            this.clientId = request.clientId;
            this.datasetIds = request.datasetIds;
            this.monitorType = request.monitorType;
            this.name = request.name;
            this.outputConfig = request.outputConfig;
            this.requestId = request.requestId;
            this.scoreStrategyConfig = request.scoreStrategyConfig;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appId(Long appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * CalbackUrl.
         */
        public Builder calbackUrl(String calbackUrl) {
            this.putBodyParameter("CalbackUrl", calbackUrl);
            this.calbackUrl = calbackUrl;
            return this;
        }

        /**
         * ClientId.
         */
        public Builder clientId(Long clientId) {
            this.putBodyParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder datasetIds(String datasetIds) {
            this.putBodyParameter("DatasetIds", datasetIds);
            this.datasetIds = datasetIds;
            return this;
        }

        /**
         * MonitorType.
         */
        public Builder monitorType(String monitorType) {
            this.putBodyParameter("MonitorType", monitorType);
            this.monitorType = monitorType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OutputConfig.
         */
        public Builder outputConfig(String outputConfig) {
            this.putBodyParameter("OutputConfig", outputConfig);
            this.outputConfig = outputConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * ScoreStrategyConfig.
         */
        public Builder scoreStrategyConfig(String scoreStrategyConfig) {
            this.putBodyParameter("ScoreStrategyConfig", scoreStrategyConfig);
            this.scoreStrategyConfig = scoreStrategyConfig;
            return this;
        }

        @Override
        public CreateInstanceTaskRequest build() {
            return new CreateInstanceTaskRequest(this);
        } 

    } 

}
