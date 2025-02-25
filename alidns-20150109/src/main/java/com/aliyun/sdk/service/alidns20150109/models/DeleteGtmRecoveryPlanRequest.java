// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DeleteGtmRecoveryPlanRequest} extends {@link RequestModel}
 *
 * <p>DeleteGtmRecoveryPlanRequest</p>
 */
public class DeleteGtmRecoveryPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecoveryPlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long recoveryPlanId;

    private DeleteGtmRecoveryPlanRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.recoveryPlanId = builder.recoveryPlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGtmRecoveryPlanRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteGtmRecoveryPlanRequest, Builder> {
        private String lang; 
        private Long recoveryPlanId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGtmRecoveryPlanRequest request) {
            super(request);
            this.lang = request.lang;
            this.recoveryPlanId = request.recoveryPlanId;
        } 

        /**
         * <p>The language used by the user.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the disaster recovery plan that you want to delete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder recoveryPlanId(Long recoveryPlanId) {
            this.putQueryParameter("RecoveryPlanId", recoveryPlanId);
            this.recoveryPlanId = recoveryPlanId;
            return this;
        }

        @Override
        public DeleteGtmRecoveryPlanRequest build() {
            return new DeleteGtmRecoveryPlanRequest(this);
        } 

    } 

}
