// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunEvaluationRequest} extends {@link RequestModel}
 *
 * <p>RunEvaluationRequest</p>
 */
public class RunEvaluationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private Long accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    private RunEvaluationRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.regionId = builder.regionId;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunEvaluationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<RunEvaluationRequest, Builder> {
        private Long accountId; 
        private String regionId; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(RunEvaluationRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.regionId = request.regionId;
            this.scope = request.scope;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(Long accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
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
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public RunEvaluationRequest build() {
            return new RunEvaluationRequest(this);
        } 

    } 

}
