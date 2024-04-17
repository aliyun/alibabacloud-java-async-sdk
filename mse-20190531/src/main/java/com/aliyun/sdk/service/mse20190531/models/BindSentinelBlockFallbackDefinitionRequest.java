// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindSentinelBlockFallbackDefinitionRequest} extends {@link RequestModel}
 *
 * <p>BindSentinelBlockFallbackDefinitionRequest</p>
 */
public class BindSentinelBlockFallbackDefinitionRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("FallbackId")
    @Validation(required = true)
    private Long fallbackId;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("Resource")
    @Validation(required = true)
    private String resource;

    @Query
    @NameInMap("TargetType")
    @Validation(required = true)
    private String targetType;

    private BindSentinelBlockFallbackDefinitionRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appName = builder.appName;
        this.fallbackId = builder.fallbackId;
        this.namespace = builder.namespace;
        this.resource = builder.resource;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindSentinelBlockFallbackDefinitionRequest create() {
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
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return fallbackId
     */
    public Long getFallbackId() {
        return this.fallbackId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<BindSentinelBlockFallbackDefinitionRequest, Builder> {
        private String acceptLanguage; 
        private String appName; 
        private Long fallbackId; 
        private String namespace; 
        private String resource; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(BindSentinelBlockFallbackDefinitionRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appName = request.appName;
            this.fallbackId = request.fallbackId;
            this.namespace = request.namespace;
            this.resource = request.resource;
            this.targetType = request.targetType;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
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
         * FallbackId.
         */
        public Builder fallbackId(Long fallbackId) {
            this.putQueryParameter("FallbackId", fallbackId);
            this.fallbackId = fallbackId;
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
         * Resource.
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * TargetType.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public BindSentinelBlockFallbackDefinitionRequest build() {
            return new BindSentinelBlockFallbackDefinitionRequest(this);
        } 

    } 

}
