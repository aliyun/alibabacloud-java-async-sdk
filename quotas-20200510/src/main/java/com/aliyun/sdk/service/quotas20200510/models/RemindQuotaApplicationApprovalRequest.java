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
 * {@link RemindQuotaApplicationApprovalRequest} extends {@link RequestModel}
 *
 * <p>RemindQuotaApplicationApprovalRequest</p>
 */
public class RemindQuotaApplicationApprovalRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    private RemindQuotaApplicationApprovalRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemindQuotaApplicationApprovalRequest create() {
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

    public static final class Builder extends Request.Builder<RemindQuotaApplicationApprovalRequest, Builder> {
        private String applicationId; 

        private Builder() {
            super();
        } 

        private Builder(RemindQuotaApplicationApprovalRequest request) {
            super(request);
            this.applicationId = request.applicationId;
        } 

        /**
         * <p>The ID of the quota application.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/440568.html">ListQuotaApplications</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>219f1ff6-6205-495f-bda7-90d2fe945e****</p>
         */
        public Builder applicationId(String applicationId) {
            this.putBodyParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        @Override
        public RemindQuotaApplicationApprovalRequest build() {
            return new RemindQuotaApplicationApprovalRequest(this);
        } 

    } 

}
