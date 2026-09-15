// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetAiAppDetailStatResponseBody} extends {@link TeaModel}
 *
 * <p>GetAiAppDetailStatResponseBody</p>
 */
public class GetAiAppDetailStatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AvgModelDuration")
    private Float avgModelDuration;

    @com.aliyun.core.annotation.NameInMap("AvgModelDurationDau")
    private Float avgModelDurationDau;

    @com.aliyun.core.annotation.NameInMap("ModelCount")
    private Long modelCount;

    @com.aliyun.core.annotation.NameInMap("ModelCountDau")
    private Float modelCountDau;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskEventCount")
    private Long riskEventCount;

    @com.aliyun.core.annotation.NameInMap("TokenCount")
    private Long tokenCount;

    @com.aliyun.core.annotation.NameInMap("TokenCountDau")
    private Float tokenCountDau;

    private GetAiAppDetailStatResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.avgModelDuration = builder.avgModelDuration;
        this.avgModelDurationDau = builder.avgModelDurationDau;
        this.modelCount = builder.modelCount;
        this.modelCountDau = builder.modelCountDau;
        this.requestId = builder.requestId;
        this.riskEventCount = builder.riskEventCount;
        this.tokenCount = builder.tokenCount;
        this.tokenCountDau = builder.tokenCountDau;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiAppDetailStatResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return avgModelDuration
     */
    public Float getAvgModelDuration() {
        return this.avgModelDuration;
    }

    /**
     * @return avgModelDurationDau
     */
    public Float getAvgModelDurationDau() {
        return this.avgModelDurationDau;
    }

    /**
     * @return modelCount
     */
    public Long getModelCount() {
        return this.modelCount;
    }

    /**
     * @return modelCountDau
     */
    public Float getModelCountDau() {
        return this.modelCountDau;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskEventCount
     */
    public Long getRiskEventCount() {
        return this.riskEventCount;
    }

    /**
     * @return tokenCount
     */
    public Long getTokenCount() {
        return this.tokenCount;
    }

    /**
     * @return tokenCountDau
     */
    public Float getTokenCountDau() {
        return this.tokenCountDau;
    }

    public static final class Builder {
        private String appId; 
        private Float avgModelDuration; 
        private Float avgModelDurationDau; 
        private Long modelCount; 
        private Float modelCountDau; 
        private String requestId; 
        private Long riskEventCount; 
        private Long tokenCount; 
        private Float tokenCountDau; 

        private Builder() {
        } 

        private Builder(GetAiAppDetailStatResponseBody model) {
            this.appId = model.appId;
            this.avgModelDuration = model.avgModelDuration;
            this.avgModelDurationDau = model.avgModelDurationDau;
            this.modelCount = model.modelCount;
            this.modelCountDau = model.modelCountDau;
            this.requestId = model.requestId;
            this.riskEventCount = model.riskEventCount;
            this.tokenCount = model.tokenCount;
            this.tokenCountDau = model.tokenCountDau;
        } 

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>id-xxx</p>
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>The average duration of model calls.</p>
         * 
         * <strong>example:</strong>
         * <p>2.55</p>
         */
        public Builder avgModelDuration(Float avgModelDuration) {
            this.avgModelDuration = avgModelDuration;
            return this;
        }

        /**
         * <p>The day-over-day change ratio of average model call duration.</p>
         * 
         * <strong>example:</strong>
         * <p>0.05</p>
         */
        public Builder avgModelDurationDau(Float avgModelDurationDau) {
            this.avgModelDurationDau = avgModelDurationDau;
            return this;
        }

        /**
         * <p>The number of model calls.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder modelCount(Long modelCount) {
            this.modelCount = modelCount;
            return this;
        }

        /**
         * <p>The day-over-day change ratio of model call count.</p>
         * 
         * <strong>example:</strong>
         * <p>0.15</p>
         */
        public Builder modelCountDau(Float modelCountDau) {
            this.modelCountDau = modelCountDau;
            return this;
        }

        /**
         * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder riskEventCount(Long riskEventCount) {
            this.riskEventCount = riskEventCount;
            return this;
        }

        /**
         * <p>The number of tokens consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>11000</p>
         */
        public Builder tokenCount(Long tokenCount) {
            this.tokenCount = tokenCount;
            return this;
        }

        /**
         * <p>The day-over-day change ratio of token consumption count.</p>
         * 
         * <strong>example:</strong>
         * <p>-0.15</p>
         */
        public Builder tokenCountDau(Float tokenCountDau) {
            this.tokenCountDau = tokenCountDau;
            return this;
        }

        public GetAiAppDetailStatResponseBody build() {
            return new GetAiAppDetailStatResponseBody(this);
        } 

    } 

}
