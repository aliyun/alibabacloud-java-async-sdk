// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIsolationRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateIsolationRuleRequest</p>
 */
public class CreateIsolationRuleRequest extends Request {
    @Query
    @NameInMap("AhasRegionId")
    private String ahasRegionId;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("Enable")
    private Boolean enable;

    @Query
    @NameInMap("LimitOrigin")
    private String limitOrigin;

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

    private CreateIsolationRuleRequest(Builder builder) {
        super(builder);
        this.ahasRegionId = builder.ahasRegionId;
        this.appName = builder.appName;
        this.enable = builder.enable;
        this.limitOrigin = builder.limitOrigin;
        this.namespace = builder.namespace;
        this.refResource = builder.refResource;
        this.relationStrategy = builder.relationStrategy;
        this.resource = builder.resource;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIsolationRuleRequest create() {
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

    public static final class Builder extends Request.Builder<CreateIsolationRuleRequest, Builder> {
        private String ahasRegionId; 
        private String appName; 
        private Boolean enable; 
        private String limitOrigin; 
        private String namespace; 
        private String refResource; 
        private Integer relationStrategy; 
        private String resource; 
        private Float threshold; 

        private Builder() {
            super();
        } 

        private Builder(CreateIsolationRuleRequest response) {
            super(response);
            this.ahasRegionId = response.ahasRegionId;
            this.appName = response.appName;
            this.enable = response.enable;
            this.limitOrigin = response.limitOrigin;
            this.namespace = response.namespace;
            this.refResource = response.refResource;
            this.relationStrategy = response.relationStrategy;
            this.resource = response.resource;
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

        @Override
        public CreateIsolationRuleRequest build() {
            return new CreateIsolationRuleRequest(this);
        } 

    } 

}
