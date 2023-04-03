// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RollbackGtmRecoveryPlanRequest} extends {@link RequestModel}
 *
 * <p>RollbackGtmRecoveryPlanRequest</p>
 */
public class RollbackGtmRecoveryPlanRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RecoveryPlanId")
    @Validation(required = true)
    private Long recoveryPlanId;

    private RollbackGtmRecoveryPlanRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.recoveryPlanId = builder.recoveryPlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackGtmRecoveryPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return recoveryPlanId
     */
    public Long getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

    public static final class Builder extends Request.Builder<RollbackGtmRecoveryPlanRequest, Builder> {
        private String lang; 
        private Long recoveryPlanId; 

        private Builder() {
            super();
        } 

        private Builder(RollbackGtmRecoveryPlanRequest request) {
            super(request);
            this.lang = request.lang;
            this.recoveryPlanId = request.recoveryPlanId;
        } 

        /**
         * The language used by the user.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the disaster recovery plan that you want to roll back.
         */
        public Builder recoveryPlanId(Long recoveryPlanId) {
            this.putQueryParameter("RecoveryPlanId", recoveryPlanId);
            this.recoveryPlanId = recoveryPlanId;
            return this;
        }

        @Override
        public RollbackGtmRecoveryPlanRequest build() {
            return new RollbackGtmRecoveryPlanRequest(this);
        } 

    } 

}
