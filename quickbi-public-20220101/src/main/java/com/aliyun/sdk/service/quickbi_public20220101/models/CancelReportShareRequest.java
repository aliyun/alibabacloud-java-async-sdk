// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link CancelReportShareRequest} extends {@link RequestModel}
 *
 * <p>CancelReportShareRequest</p>
 */
public class CancelReportShareRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reportId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareToIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shareToIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareToType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer shareToType;

    private CancelReportShareRequest(Builder builder) {
        super(builder);
        this.reportId = builder.reportId;
        this.shareToIds = builder.shareToIds;
        this.shareToType = builder.shareToType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelReportShareRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return shareToIds
     */
    public String getShareToIds() {
        return this.shareToIds;
    }

    /**
     * @return shareToType
     */
    public Integer getShareToType() {
        return this.shareToType;
    }

    public static final class Builder extends Request.Builder<CancelReportShareRequest, Builder> {
        private String reportId; 
        private String shareToIds; 
        private Integer shareToType; 

        private Builder() {
            super();
        } 

        private Builder(CancelReportShareRequest request) {
            super(request);
            this.reportId = request.reportId;
            this.shareToIds = request.shareToIds;
            this.shareToType = request.shareToType;
        } 

        /**
         * <p>The ID of the data work. Data works include data portals, dashboards, workbooks, and ad hoc queries.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6b407e50-e774-406b-9956-da2425c2****</p>
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The ID of the sharee. It can be a Quick BI user ID or a user group ID.</p>
         * <ul>
         * <li>If ShareToType is set to 0 (user), the value is the user ID.</li>
         * <li>If ShareToType is set to 1 (user group), the value is the user group ID.</li>
         * <li>If ShareToType is set to 2 (organization), the value is the organization ID.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>de4bc5f9429141cc8091cdd1c15b****</p>
         */
        public Builder shareToIds(String shareToIds) {
            this.putQueryParameter("ShareToIds", shareToIds);
            this.shareToIds = shareToIds;
            return this;
        }

        /**
         * <p>The deletion method. Valid values:</p>
         * <ul>
         * <li>0: Delete by user.</li>
         * <li>1: Delete by user group.</li>
         * <li>2: Delete by organization.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder shareToType(Integer shareToType) {
            this.putQueryParameter("ShareToType", shareToType);
            this.shareToType = shareToType;
            return this;
        }

        @Override
        public CancelReportShareRequest build() {
            return new CancelReportShareRequest(this);
        } 

    } 

}
