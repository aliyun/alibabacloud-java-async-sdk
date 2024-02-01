// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaApplicationApprovalRequest} extends {@link RequestModel}
 *
 * <p>GetQuotaApplicationApprovalRequest</p>
 */
public class GetQuotaApplicationApprovalRequest extends Request {
    @Body
    @NameInMap("ApplicationId")
    private String applicationId;

    private GetQuotaApplicationApprovalRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaApplicationApprovalRequest create() {
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

    public static final class Builder extends Request.Builder<GetQuotaApplicationApprovalRequest, Builder> {
        private String applicationId; 

        private Builder() {
            super();
        } 

        private Builder(GetQuotaApplicationApprovalRequest request) {
            super(request);
            this.applicationId = request.applicationId;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.putBodyParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        @Override
        public GetQuotaApplicationApprovalRequest build() {
            return new GetQuotaApplicationApprovalRequest(this);
        } 

    } 

}
