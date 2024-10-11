// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyLosslessRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyLosslessRuleRequest</p>
 */
public class ModifyLosslessRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Aligned")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean aligned;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DelayTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer delayTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FuncType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer funcType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LossLessDetail")
    private Boolean lossLessDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Notice")
    private Boolean notice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Related")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean related;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarmupTime")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>Specifies whether to align the lifecycle of the application in the Kubernetes cluster with that of the microservice.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder aligned(Boolean aligned) {
            this.putQueryParameter("Aligned", aligned);
            this.aligned = aligned;
            return this;
        }

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c644n5frmc@3e75f25fd4*****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>wx-work-api</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The registration latency.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder delayTime(Integer delayTime) {
            this.putQueryParameter("DelayTime", delayTime);
            this.delayTime = delayTime;
            return this;
        }

        /**
         * <p>Specifies whether to enable the alert rule. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enables the rule.</li>
         * <li><code>false</code>: disables the rule.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The slope of the prefetching curve.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder funcType(Integer funcType) {
            this.putQueryParameter("FuncType", funcType);
            this.funcType = funcType;
            return this;
        }

        /**
         * <p>Specifies whether to display online and offline processing details.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder lossLessDetail(Boolean lossLessDetail) {
            this.putQueryParameter("LossLessDetail", lossLessDetail);
            this.lossLessDetail = lossLessDetail;
            return this;
        }

        /**
         * <p>The microservice namespace to which the rule applies.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>Specifies whether to enable notification.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder notice(Boolean notice) {
            this.putQueryParameter("Notice", notice);
            this.notice = notice;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to associate with service prefetching.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder related(Boolean related) {
            this.putQueryParameter("Related", related);
            this.related = related;
            return this;
        }

        /**
         * <p>The prefetching duration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
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
