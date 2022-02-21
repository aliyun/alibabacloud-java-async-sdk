// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateFlowRuleRequest</p>
 */
public class CreateFlowRuleRequest extends Request {
    @Query
    @NameInMap("AhasRegionId")
    private String ahasRegionId;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("ControlBehavior")
    @Validation(required = true)
    private Integer controlBehavior;

    @Query
    @NameInMap("Enable")
    private Boolean enable;

    @Query
    @NameInMap("LimitOrigin")
    private String limitOrigin;

    @Query
    @NameInMap("MaxQueueingTimeMs")
    private Integer maxQueueingTimeMs;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("RefResource")
    private String refResource;

    @Query
    @NameInMap("RelationStrategy")
    @Validation(required = true)
    private Integer relationStrategy;

    @Query
    @NameInMap("Resource")
    @Validation(required = true)
    private String resource;

    @Query
    @NameInMap("Threshold")
    @Validation(required = true)
    private Float threshold;

    @Query
    @NameInMap("WarmUpPeriodSec")
    private Integer warmUpPeriodSec;

    private CreateFlowRuleRequest(Builder builder) {
        super(builder);
        this.ahasRegionId = builder.ahasRegionId;
        this.appName = builder.appName;
        this.controlBehavior = builder.controlBehavior;
        this.enable = builder.enable;
        this.limitOrigin = builder.limitOrigin;
        this.maxQueueingTimeMs = builder.maxQueueingTimeMs;
        this.namespace = builder.namespace;
        this.refResource = builder.refResource;
        this.relationStrategy = builder.relationStrategy;
        this.resource = builder.resource;
        this.threshold = builder.threshold;
        this.warmUpPeriodSec = builder.warmUpPeriodSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowRuleRequest create() {
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
     * @return limitOrigin
     */
    public String getLimitOrigin() {
        return this.limitOrigin;
    }

    /**
     * @return maxQueueingTimeMs
     */
    public Integer getMaxQueueingTimeMs() {
        return this.maxQueueingTimeMs;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return refResource
     */
    public String getRefResource() {
        return this.refResource;
    }

    /**
     * @return relationStrategy
     */
    public Integer getRelationStrategy() {
        return this.relationStrategy;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return threshold
     */
    public Float getThreshold() {
        return this.threshold;
    }

    /**
     * @return warmUpPeriodSec
     */
    public Integer getWarmUpPeriodSec() {
        return this.warmUpPeriodSec;
    }

    public static final class Builder extends Request.Builder<CreateFlowRuleRequest, Builder> {
        private String ahasRegionId; 
        private String appName; 
        private Integer controlBehavior; 
        private Boolean enable; 
        private String limitOrigin; 
        private Integer maxQueueingTimeMs; 
        private String namespace; 
        private String refResource; 
        private Integer relationStrategy; 
        private String resource; 
        private Float threshold; 
        private Integer warmUpPeriodSec; 

        private Builder() {
            super();
        } 

        private Builder(CreateFlowRuleRequest response) {
            super(response);
            this.ahasRegionId = response.ahasRegionId;
            this.appName = response.appName;
            this.controlBehavior = response.controlBehavior;
            this.enable = response.enable;
            this.limitOrigin = response.limitOrigin;
            this.maxQueueingTimeMs = response.maxQueueingTimeMs;
            this.namespace = response.namespace;
            this.refResource = response.refResource;
            this.relationStrategy = response.relationStrategy;
            this.resource = response.resource;
            this.threshold = response.threshold;
            this.warmUpPeriodSec = response.warmUpPeriodSec;
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
         * LimitOrigin.
         */
        public Builder limitOrigin(String limitOrigin) {
            this.putQueryParameter("LimitOrigin", limitOrigin);
            this.limitOrigin = limitOrigin;
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
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * RefResource.
         */
        public Builder refResource(String refResource) {
            this.putQueryParameter("RefResource", refResource);
            this.refResource = refResource;
            return this;
        }

        /**
         * RelationStrategy.
         */
        public Builder relationStrategy(Integer relationStrategy) {
            this.putQueryParameter("RelationStrategy", relationStrategy);
            this.relationStrategy = relationStrategy;
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
         * Threshold.
         */
        public Builder threshold(Float threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        /**
         * WarmUpPeriodSec.
         */
        public Builder warmUpPeriodSec(Integer warmUpPeriodSec) {
            this.putQueryParameter("WarmUpPeriodSec", warmUpPeriodSec);
            this.warmUpPeriodSec = warmUpPeriodSec;
            return this;
        }

        @Override
        public CreateFlowRuleRequest build() {
            return new CreateFlowRuleRequest(this);
        } 

    } 

}
