// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateRateLimitPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateRateLimitPolicyRequest</p>
 */
public class CreateRateLimitPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gwClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RateLimitRpm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rateLimitRpm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RateLimitTpm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rateLimitTpm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopeRefId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scopeRefId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scopeType;

    private CreateRateLimitPolicyRequest(Builder builder) {
        super(builder);
        this.gwClusterId = builder.gwClusterId;
        this.rateLimitRpm = builder.rateLimitRpm;
        this.rateLimitTpm = builder.rateLimitTpm;
        this.regionId = builder.regionId;
        this.scopeRefId = builder.scopeRefId;
        this.scopeType = builder.scopeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRateLimitPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gwClusterId
     */
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    /**
     * @return rateLimitRpm
     */
    public String getRateLimitRpm() {
        return this.rateLimitRpm;
    }

    /**
     * @return rateLimitTpm
     */
    public String getRateLimitTpm() {
        return this.rateLimitTpm;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scopeRefId
     */
    public String getScopeRefId() {
        return this.scopeRefId;
    }

    /**
     * @return scopeType
     */
    public String getScopeType() {
        return this.scopeType;
    }

    public static final class Builder extends Request.Builder<CreateRateLimitPolicyRequest, Builder> {
        private String gwClusterId; 
        private String rateLimitRpm; 
        private String rateLimitTpm; 
        private String regionId; 
        private String scopeRefId; 
        private String scopeType; 

        private Builder() {
            super();
        } 

        private Builder(CreateRateLimitPolicyRequest request) {
            super(request);
            this.gwClusterId = request.gwClusterId;
            this.rateLimitRpm = request.rateLimitRpm;
            this.rateLimitTpm = request.rateLimitTpm;
            this.regionId = request.regionId;
            this.scopeRefId = request.scopeRefId;
            this.scopeType = request.scopeType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxxxx</p>
         */
        public Builder gwClusterId(String gwClusterId) {
            this.putQueryParameter("GwClusterId", gwClusterId);
            this.gwClusterId = gwClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder rateLimitRpm(String rateLimitRpm) {
            this.putQueryParameter("RateLimitRpm", rateLimitRpm);
            this.rateLimitRpm = rateLimitRpm;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder rateLimitTpm(String rateLimitTpm) {
            this.putQueryParameter("RateLimitTpm", rateLimitTpm);
            this.rateLimitTpm = rateLimitTpm;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cg-xxxxxxx</p>
         */
        public Builder scopeRefId(String scopeRefId) {
            this.putQueryParameter("ScopeRefId", scopeRefId);
            this.scopeRefId = scopeRefId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ConsumerGroup</p>
         */
        public Builder scopeType(String scopeType) {
            this.putQueryParameter("ScopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        @Override
        public CreateRateLimitPolicyRequest build() {
            return new CreateRateLimitPolicyRequest(this);
        } 

    } 

}
