// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLosslessRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyLosslessRuleRequest</p>
 */
public class ModifyLosslessRuleRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("Aligned")
    @Validation(required = true)
    private Boolean aligned;

    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("DelayTime")
    @Validation(required = true)
    private Long delayTime;

    @Query
    @NameInMap("Enable")
    @Validation(required = true)
    private Boolean enable;

    @Query
    @NameInMap("FuncType")
    @Validation(required = true)
    private Long funcType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Related")
    @Validation(required = true)
    private Boolean related;

    @Query
    @NameInMap("ShutdownWaitSeconds")
    private Integer shutdownWaitSeconds;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("WarmupTime")
    @Validation(required = true)
    private Long warmupTime;

    private ModifyLosslessRuleRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.aligned = builder.aligned;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.delayTime = builder.delayTime;
        this.enable = builder.enable;
        this.funcType = builder.funcType;
        this.regionId = builder.regionId;
        this.related = builder.related;
        this.shutdownWaitSeconds = builder.shutdownWaitSeconds;
        this.source = builder.source;
        this.warmupTime = builder.warmupTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLosslessRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return aligned
     */
    public Boolean getAligned() {
        return this.aligned;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return delayTime
     */
    public Long getDelayTime() {
        return this.delayTime;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return funcType
     */
    public Long getFuncType() {
        return this.funcType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return related
     */
    public Boolean getRelated() {
        return this.related;
    }

    /**
     * @return shutdownWaitSeconds
     */
    public Integer getShutdownWaitSeconds() {
        return this.shutdownWaitSeconds;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return warmupTime
     */
    public Long getWarmupTime() {
        return this.warmupTime;
    }

    public static final class Builder extends Request.Builder<ModifyLosslessRuleRequest, Builder> {
        private String acceptLanguage; 
        private Boolean aligned; 
        private String appId; 
        private String appName; 
        private Long delayTime; 
        private Boolean enable; 
        private Long funcType; 
        private String regionId; 
        private Boolean related; 
        private Integer shutdownWaitSeconds; 
        private String source; 
        private Long warmupTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLosslessRuleRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.aligned = request.aligned;
            this.appId = request.appId;
            this.appName = request.appName;
            this.delayTime = request.delayTime;
            this.enable = request.enable;
            this.funcType = request.funcType;
            this.regionId = request.regionId;
            this.related = request.related;
            this.shutdownWaitSeconds = request.shutdownWaitSeconds;
            this.source = request.source;
            this.warmupTime = request.warmupTime;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Specifies whether to align the lifecycle of the application in the Kubernetes cluster with that of the microservice.
         */
        public Builder aligned(Boolean aligned) {
            this.putQueryParameter("Aligned", aligned);
            this.aligned = aligned;
            return this;
        }

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The name of the application.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * The registration latency.
         */
        public Builder delayTime(Long delayTime) {
            this.putQueryParameter("DelayTime", delayTime);
            this.delayTime = delayTime;
            return this;
        }

        /**
         * Specifies whether to enable the alert rule. Valid values:
         * <p>
         * 
         * *   `true`: enables the rule.
         * *   `false`: disables the rule.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * The slope of the prefetching curve.
         */
        public Builder funcType(Long funcType) {
            this.putQueryParameter("FuncType", funcType);
            this.funcType = funcType;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to associate readiness probe with service prefetching.
         */
        public Builder related(Boolean related) {
            this.putQueryParameter("Related", related);
            this.related = related;
            return this;
        }

        /**
         * The cooldown duration. Unit: seconds.
         */
        public Builder shutdownWaitSeconds(Integer shutdownWaitSeconds) {
            this.putQueryParameter("ShutdownWaitSeconds", shutdownWaitSeconds);
            this.shutdownWaitSeconds = shutdownWaitSeconds;
            return this;
        }

        /**
         * The service source. Valid values:
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The prefetching duration.
         */
        public Builder warmupTime(Long warmupTime) {
            this.putQueryParameter("WarmupTime", warmupTime);
            this.warmupTime = warmupTime;
            return this;
        }

        @Override
        public ModifyLosslessRuleRequest build() {
            return new ModifyLosslessRuleRequest(this);
        } 

    } 

}
