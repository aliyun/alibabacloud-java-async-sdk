// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link InvalidateApprovalResponseBody} extends {@link TeaModel}
 *
 * <p>InvalidateApprovalResponseBody</p>
 */
public class InvalidateApprovalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApprovalId")
    private String approvalId;

    @com.aliyun.core.annotation.NameInMap("EffectStatus")
    private String effectStatus;

    @com.aliyun.core.annotation.NameInMap("ReportType")
    private String reportType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private InvalidateApprovalResponseBody(Builder builder) {
        this.approvalId = builder.approvalId;
        this.effectStatus = builder.effectStatus;
        this.reportType = builder.reportType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvalidateApprovalResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approvalId
     */
    public String getApprovalId() {
        return this.approvalId;
    }

    /**
     * @return effectStatus
     */
    public String getEffectStatus() {
        return this.effectStatus;
    }

    /**
     * @return reportType
     */
    public String getReportType() {
        return this.reportType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String approvalId; 
        private String effectStatus; 
        private String reportType; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(InvalidateApprovalResponseBody model) {
            this.approvalId = model.approvalId;
            this.effectStatus = model.effectStatus;
            this.reportType = model.reportType;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the invalidated approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-6b5188a28634****</p>
         */
        public Builder approvalId(String approvalId) {
            this.approvalId = approvalId;
            return this;
        }

        /**
         * <p>The effective status of the approval. When the invalidation succeeds, the value is fixed as Expired, which indicates that the approval has been invalidated.</p>
         * 
         * <strong>example:</strong>
         * <p>Expired</p>
         */
        public Builder effectStatus(String effectStatus) {
            this.effectStatus = effectStatus;
            return this;
        }

        /**
         * <p>The approval type. Valid values:</p>
         * <ul>
         * <li>ApprovalReport: approval.</li>
         * <li>BackendReport: backend approval.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BackendReport</p>
         */
        public Builder reportType(String reportType) {
            this.reportType = reportType;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D6707286-A50E-57B1-B2CF-EFAC59E8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InvalidateApprovalResponseBody build() {
            return new InvalidateApprovalResponseBody(this);
        } 

    } 

}
