// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGatewayCacheDiskRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewayCacheDiskRequest</p>
 */
public class CreateGatewayCacheDiskRequest extends Request {
    @Query
    @NameInMap("CacheDiskCategory")
    private String cacheDiskCategory;

    @Query
    @NameInMap("CacheDiskSizeInGB")
    @Validation(required = true)
    private Long cacheDiskSizeInGB;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("PerformanceLevel")
    private String performanceLevel;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private CreateGatewayCacheDiskRequest(Builder builder) {
        super(builder);
        this.cacheDiskCategory = builder.cacheDiskCategory;
        this.cacheDiskSizeInGB = builder.cacheDiskSizeInGB;
        this.gatewayId = builder.gatewayId;
        this.performanceLevel = builder.performanceLevel;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayCacheDiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheDiskCategory
     */
    public String getCacheDiskCategory() {
        return this.cacheDiskCategory;
    }

    /**
     * @return cacheDiskSizeInGB
     */
    public Long getCacheDiskSizeInGB() {
        return this.cacheDiskSizeInGB;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return performanceLevel
     */
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<CreateGatewayCacheDiskRequest, Builder> {
        private String cacheDiskCategory; 
        private Long cacheDiskSizeInGB; 
        private String gatewayId; 
        private String performanceLevel; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateGatewayCacheDiskRequest request) {
            super(request);
            this.cacheDiskCategory = request.cacheDiskCategory;
            this.cacheDiskSizeInGB = request.cacheDiskSizeInGB;
            this.gatewayId = request.gatewayId;
            this.performanceLevel = request.performanceLevel;
            this.securityToken = request.securityToken;
        } 

        /**
         * CacheDiskCategory.
         */
        public Builder cacheDiskCategory(String cacheDiskCategory) {
            this.putQueryParameter("CacheDiskCategory", cacheDiskCategory);
            this.cacheDiskCategory = cacheDiskCategory;
            return this;
        }

        /**
         * CacheDiskSizeInGB.
         */
        public Builder cacheDiskSizeInGB(Long cacheDiskSizeInGB) {
            this.putQueryParameter("CacheDiskSizeInGB", cacheDiskSizeInGB);
            this.cacheDiskSizeInGB = cacheDiskSizeInGB;
            return this;
        }

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * PerformanceLevel.
         */
        public Builder performanceLevel(String performanceLevel) {
            this.putQueryParameter("PerformanceLevel", performanceLevel);
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public CreateGatewayCacheDiskRequest build() {
            return new CreateGatewayCacheDiskRequest(this);
        } 

    } 

}
