// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * Cross border permissions of Alibaba Cloud account (main account).
         * <p>
         * 
         * -  UNAPPLIED : No cross-border permission application has been submitted or application records cannot be found.
         * -  APPLIED : Cross-border permission review in progress.
         * -  REJECTED : Cross-border permission review failed.
         * -  PASSED : Cross-border permission review passed.
         */
        public Builder approvalStatus(String approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }

        /**
         * The ID of the request.
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
