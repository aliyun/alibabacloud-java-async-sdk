// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCrossBorderApprovalStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCrossBorderApprovalStatusResponseBody</p>
 */
public class QueryCrossBorderApprovalStatusResponseBody extends TeaModel {
    @NameInMap("ApprovalStatus")
    private String approvalStatus;

    @NameInMap("RequestId")
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
         * ApprovalStatus.
         */
        public Builder approvalStatus(String approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }

        /**
         * RequestId.
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
