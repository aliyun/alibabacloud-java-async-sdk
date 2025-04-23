// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paillmtrace20240311.models;

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
 * {@link EvaluateTraceRequest} extends {@link RequestModel}
 *
 * <p>EvaluateTraceRequest</p>
 */
public class EvaluateTraceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TraceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String traceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EvaluationConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private EvaluationConfig evaluationConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EvaluationId")
    private String evaluationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxTime")
    private String maxTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MinTime")
    private String minTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelConfig")
    private ModelConfig modelConfig;

    private EvaluateTraceRequest(Builder builder) {
        super(builder);
        this.traceId = builder.traceId;
        this.appName = builder.appName;
        this.evaluationConfig = builder.evaluationConfig;
        this.evaluationId = builder.evaluationId;
        this.maxTime = builder.maxTime;
        this.minTime = builder.minTime;
        this.modelConfig = builder.modelConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EvaluateTraceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return evaluationConfig
     */
    public EvaluationConfig getEvaluationConfig() {
        return this.evaluationConfig;
    }

    /**
     * @return evaluationId
     */
    public String getEvaluationId() {
        return this.evaluationId;
    }

    /**
     * @return maxTime
     */
    public String getMaxTime() {
        return this.maxTime;
    }

    /**
     * @return minTime
     */
    public String getMinTime() {
        return this.minTime;
    }

    /**
     * @return modelConfig
     */
    public ModelConfig getModelConfig() {
        return this.modelConfig;
    }

    public static final class Builder extends Request.Builder<EvaluateTraceRequest, Builder> {
        private String traceId; 
        private String appName; 
        private EvaluationConfig evaluationConfig; 
        private String evaluationId; 
        private String maxTime; 
        private String minTime; 
        private ModelConfig modelConfig; 

        private Builder() {
            super();
        } 

        private Builder(EvaluateTraceRequest request) {
            super(request);
            this.traceId = request.traceId;
            this.appName = request.appName;
            this.evaluationConfig = request.evaluationConfig;
            this.evaluationId = request.evaluationId;
            this.maxTime = request.maxTime;
            this.minTime = request.minTime;
            this.modelConfig = request.modelConfig;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c43793673a384d39daa0a351b1000000</p>
         */
        public Builder traceId(String traceId) {
            this.putPathParameter("TraceId", traceId);
            this.traceId = traceId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder evaluationConfig(EvaluationConfig evaluationConfig) {
            this.putBodyParameter("EvaluationConfig", evaluationConfig);
            this.evaluationConfig = evaluationConfig;
            return this;
        }

        /**
         * EvaluationId.
         */
        public Builder evaluationId(String evaluationId) {
            this.putBodyParameter("EvaluationId", evaluationId);
            this.evaluationId = evaluationId;
            return this;
        }

        /**
         * MaxTime.
         */
        public Builder maxTime(String maxTime) {
            this.putBodyParameter("MaxTime", maxTime);
            this.maxTime = maxTime;
            return this;
        }

        /**
         * MinTime.
         */
        public Builder minTime(String minTime) {
            this.putBodyParameter("MinTime", minTime);
            this.minTime = minTime;
            return this;
        }

        /**
         * ModelConfig.
         */
        public Builder modelConfig(ModelConfig modelConfig) {
            this.putBodyParameter("ModelConfig", modelConfig);
            this.modelConfig = modelConfig;
            return this;
        }

        @Override
        public EvaluateTraceRequest build() {
            return new EvaluateTraceRequest(this);
        } 

    } 

}
