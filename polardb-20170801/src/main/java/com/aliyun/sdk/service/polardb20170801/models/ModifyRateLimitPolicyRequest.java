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
 * {@link ModifyRateLimitPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyRateLimitPolicyRequest</p>
 */
public class ModifyRateLimitPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gwClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RateLimitRpm")
    private String rateLimitRpm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RateLimitTpm")
    private String rateLimitTpm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyRateLimitPolicyRequest(Builder builder) {
        super(builder);
        this.gwClusterId = builder.gwClusterId;
        this.policyId = builder.policyId;
        this.rateLimitRpm = builder.rateLimitRpm;
        this.rateLimitTpm = builder.rateLimitTpm;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRateLimitPolicyRequest create() {
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
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
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

    public static final class Builder extends Request.Builder<ModifyRateLimitPolicyRequest, Builder> {
        private String gwClusterId; 
        private String policyId; 
        private String rateLimitRpm; 
        private String rateLimitTpm; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRateLimitPolicyRequest request) {
            super(request);
            this.gwClusterId = request.gwClusterId;
            this.policyId = request.policyId;
            this.rateLimitRpm = request.rateLimitRpm;
            this.rateLimitTpm = request.rateLimitTpm;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxxxxx</p>
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
         * <p>02eccf7c61cf4d05a543075ee907f3**</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * RateLimitRpm.
         */
        public Builder rateLimitRpm(String rateLimitRpm) {
            this.putQueryParameter("RateLimitRpm", rateLimitRpm);
            this.rateLimitRpm = rateLimitRpm;
            return this;
        }

        /**
         * RateLimitTpm.
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

        @Override
        public ModifyRateLimitPolicyRequest build() {
            return new ModifyRateLimitPolicyRequest(this);
        } 

    } 

}
