// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHotParamRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateHotParamRuleRequest</p>
 */
public class CreateHotParamRuleRequest extends Request {
    @Query
    @NameInMap("AhasRegionId")
    private String ahasRegionId;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("BurstCount")
    private Integer burstCount;

    @Query
    @NameInMap("ControlBehavior")
    @Validation(required = true)
    private Integer controlBehavior;

    @Query
    @NameInMap("Enable")
    private Boolean enable;

    @Query
    @NameInMap("MaxQueueingTimeMs")
    private Integer maxQueueingTimeMs;

    @Query
    @NameInMap("MetricType")
    @Validation(required = true)
    private Integer metricType;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("ParamIdx")
    @Validation(required = true)
    private Integer paramIdx;

    @Query
    @NameInMap("Resource")
    @Validation(required = true)
    private String resource;

    @Query
    @NameInMap("StatDurationSec")
    @Validation(required = true)
    private Long statDurationSec;

    @Query
    @NameInMap("Threshold")
    @Validation(required = true)
    private Float threshold;

    private CreateHotParamRuleRequest(Builder builder) {
        super(builder);
        this.ahasRegionId = builder.ahasRegionId;
        this.appName = builder.appName;
        this.burstCount = builder.burstCount;
        this.controlBehavior = builder.controlBehavior;
        this.enable = builder.enable;
        this.maxQueueingTimeMs = builder.maxQueueingTimeMs;
        this.metricType = builder.metricType;
        this.namespace = builder.namespace;
        this.paramIdx = builder.paramIdx;
        this.resource = builder.resource;
        this.statDurationSec = builder.statDurationSec;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHotParamRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ahasRegionId
     */
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return burstCount
     */
    public Integer getBurstCount() {
        return this.burstCount;
    }

    /**
     * @return controlBehavior
     */
    public Integer getControlBehavior() {
        return this.controlBehavior;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return maxQueueingTimeMs
     */
    public Integer getMaxQueueingTimeMs() {
        return this.maxQueueingTimeMs;
    }

    /**
     * @return metricType
     */
    public Integer getMetricType() {
        return this.metricType;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return paramIdx
     */
    public Integer getParamIdx() {
        return this.paramIdx;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return statDurationSec
     */
    public Long getStatDurationSec() {
        return this.statDurationSec;
    }

    /**
     * @return threshold
     */
    public Float getThreshold() {
        return this.threshold;
    }

    public static final class Builder extends Request.Builder<CreateHotParamRuleRequest, Builder> {
        private String ahasRegionId; 
        private String appName; 
        private Integer burstCount; 
        private Integer controlBehavior; 
        private Boolean enable; 
        private Integer maxQueueingTimeMs; 
        private Integer metricType; 
        private String namespace; 
        private Integer paramIdx; 
        private String resource; 
        private Long statDurationSec; 
        private Float threshold; 

        private Builder() {
            super();
        } 

        private Builder(CreateHotParamRuleRequest response) {
            super(response);
            this.ahasRegionId = response.ahasRegionId;
            this.appName = response.appName;
            this.burstCount = response.burstCount;
            this.controlBehavior = response.controlBehavior;
            this.enable = response.enable;
            this.maxQueueingTimeMs = response.maxQueueingTimeMs;
            this.metricType = response.metricType;
            this.namespace = response.namespace;
            this.paramIdx = response.paramIdx;
            this.resource = response.resource;
            this.statDurationSec = response.statDurationSec;
            this.threshold = response.threshold;
        } 

        /**
         * AhasRegionId.
         */
        public Builder ahasRegionId(String ahasRegionId) {
            this.putQueryParameter("AhasRegionId", ahasRegionId);
            this.ahasRegionId = ahasRegionId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * BurstCount.
         */
        public Builder burstCount(Integer burstCount) {
            this.putQueryParameter("BurstCount", burstCount);
            this.burstCount = burstCount;
            return this;
        }

        /**
         * ControlBehavior.
         */
        public Builder controlBehavior(Integer controlBehavior) {
            this.putQueryParameter("ControlBehavior", controlBehavior);
            this.controlBehavior = controlBehavior;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * MaxQueueingTimeMs.
         */
        public Builder maxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.putQueryParameter("MaxQueueingTimeMs", maxQueueingTimeMs);
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }

        /**
         * MetricType.
         */
        public Builder metricType(Integer metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * ParamIdx.
         */
        public Builder paramIdx(Integer paramIdx) {
            this.putQueryParameter("ParamIdx", paramIdx);
            this.paramIdx = paramIdx;
            return this;
        }

        /**
         * Resource.
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * StatDurationSec.
         */
        public Builder statDurationSec(Long statDurationSec) {
            this.putQueryParameter("StatDurationSec", statDurationSec);
            this.statDurationSec = statDurationSec;
            return this;
        }

        /**
         * Threshold.
         */
        public Builder threshold(Float threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        @Override
        public CreateHotParamRuleRequest build() {
            return new CreateHotParamRuleRequest(this);
        } 

    } 

}
