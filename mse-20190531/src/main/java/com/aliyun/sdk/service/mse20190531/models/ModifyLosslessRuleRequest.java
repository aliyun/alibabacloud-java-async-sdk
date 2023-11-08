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
    private Integer delayTime;

    @Query
    @NameInMap("Enable")
    @Validation(required = true)
    private Boolean enable;

    @Query
    @NameInMap("FuncType")
    @Validation(required = true)
    private Integer funcType;

    @Query
    @NameInMap("LossLessDetail")
    private Boolean lossLessDetail;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("Notice")
    private Boolean notice;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Related")
    @Validation(required = true)
    private Boolean related;

    @Query
    @NameInMap("WarmupTime")
    @Validation(required = true)
    private Integer warmupTime;

    private ModifyLosslessRuleRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.aligned = builder.aligned;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.delayTime = builder.delayTime;
        this.enable = builder.enable;
        this.funcType = builder.funcType;
        this.lossLessDetail = builder.lossLessDetail;
        this.namespace = builder.namespace;
        this.notice = builder.notice;
        this.regionId = builder.regionId;
        this.related = builder.related;
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
    public Integer getDelayTime() {
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
    public Integer getFuncType() {
        return this.funcType;
    }

    /**
     * @return lossLessDetail
     */
    public Boolean getLossLessDetail() {
        return this.lossLessDetail;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return notice
     */
    public Boolean getNotice() {
        return this.notice;
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
     * @return warmupTime
     */
    public Integer getWarmupTime() {
        return this.warmupTime;
    }

    public static final class Builder extends Request.Builder<ModifyLosslessRuleRequest, Builder> {
        private String acceptLanguage; 
        private Boolean aligned; 
        private String appId; 
        private String appName; 
        private Integer delayTime; 
        private Boolean enable; 
        private Integer funcType; 
        private Boolean lossLessDetail; 
        private String namespace; 
        private Boolean notice; 
        private String regionId; 
        private Boolean related; 
        private Integer warmupTime; 

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
            this.lossLessDetail = request.lossLessDetail;
            this.namespace = request.namespace;
            this.notice = request.notice;
            this.regionId = request.regionId;
            this.related = request.related;
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
        public Builder delayTime(Integer delayTime) {
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
        public Builder funcType(Integer funcType) {
            this.putQueryParameter("FuncType", funcType);
            this.funcType = funcType;
            return this;
        }

        /**
         * Specifies whether to display online and offline processing details.
         */
        public Builder lossLessDetail(Boolean lossLessDetail) {
            this.putQueryParameter("LossLessDetail", lossLessDetail);
            this.lossLessDetail = lossLessDetail;
            return this;
        }

        /**
         * The microservice namespace to which the rule applies.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * Specifies whether to enable notification.
         */
        public Builder notice(Boolean notice) {
            this.putQueryParameter("Notice", notice);
            this.notice = notice;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to associate with service prefetching.
         */
        public Builder related(Boolean related) {
            this.putQueryParameter("Related", related);
            this.related = related;
            return this;
        }

        /**
         * The prefetching duration.
         */
        public Builder warmupTime(Integer warmupTime) {
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
