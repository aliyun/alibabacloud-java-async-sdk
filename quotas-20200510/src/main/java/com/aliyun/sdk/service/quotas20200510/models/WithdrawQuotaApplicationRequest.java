// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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
 * {@link WithdrawQuotaApplicationRequest} extends {@link RequestModel}
 *
 * <p>WithdrawQuotaApplicationRequest</p>
 */
public class WithdrawQuotaApplicationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    private WithdrawQuotaApplicationRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.reason = builder.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WithdrawQuotaApplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    public static final class Builder extends Request.Builder<WithdrawQuotaApplicationRequest, Builder> {
        private String applicationId; 
        private String reason; 

        private Builder() {
            super();
        } 

        private Builder(WithdrawQuotaApplicationRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.reason = request.reason;
        } 

        /**
         * <p>The ID of the quota application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d314d6ae-867d-484c-9009-3d42****</p>
         */
        public Builder applicationId(String applicationId) {
            this.putBodyParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The reason for withdrawing the quota increase request.</p>
         * 
         * <strong>example:</strong>
         * <p>DesireValue is wrong</p>
         */
        public Builder reason(String reason) {
            this.putBodyParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        @Override
        public WithdrawQuotaApplicationRequest build() {
            return new WithdrawQuotaApplicationRequest(this);
        } 

    } 

}
