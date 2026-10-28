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
 * {@link GetQuotaApplicationApprovalRequest} extends {@link RequestModel}
 *
 * <p>GetQuotaApplicationApprovalRequest</p>
 */
public class GetQuotaApplicationApprovalRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
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
         * <p>The ID of the quota application.</p>
         * <p>For information about how to obtain the ID of a quota application, see <a href="https://help.aliyun.com/document_detail/440568.html">ListQuotaApplications</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>d314d6ae-867d-484c-9009-3d42****</p>
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
