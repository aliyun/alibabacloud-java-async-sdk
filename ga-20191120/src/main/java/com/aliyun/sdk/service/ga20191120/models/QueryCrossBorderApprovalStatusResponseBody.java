// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link QueryCrossBorderApprovalStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCrossBorderApprovalStatusResponseBody</p>
 */
public class QueryCrossBorderApprovalStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApprovalStatus")
    private String approvalStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryCrossBorderApprovalStatusResponseBody(Builder builder) {
        this.approvalStatus = builder.approvalStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCrossBorderApprovalStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approvalStatus
     */
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String approvalStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryCrossBorderApprovalStatusResponseBody model) {
            this.approvalStatus = model.approvalStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Cross border permissions of Alibaba Cloud account (main account).</p>
         * <ul>
         * <li>UNAPPLIED : No cross-border permission application has been submitted or application records cannot be found.</li>
         * <li>APPLIED : Cross-border permission review in progress.</li>
         * <li>REJECTED : Cross-border permission review failed.</li>
         * <li>PASSED : Cross-border permission review passed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UNAPPLIED</p>
         */
        public Builder approvalStatus(String approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F96E634B-A523-587F-9A09-AE8B2FD04B9C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryCrossBorderApprovalStatusResponseBody build() {
            return new QueryCrossBorderApprovalStatusResponseBody(this);
        } 

    } 

}
