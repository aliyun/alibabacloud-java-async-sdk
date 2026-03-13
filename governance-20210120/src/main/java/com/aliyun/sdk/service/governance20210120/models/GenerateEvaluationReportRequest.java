// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

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
 * {@link GenerateEvaluationReportRequest} extends {@link RequestModel}
 *
 * <p>GenerateEvaluationReportRequest</p>
 */
public class GenerateEvaluationReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private Long accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountIds")
    private java.util.List<Long> accountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportType")
    private String reportType;

    private GenerateEvaluationReportRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.accountIds = builder.accountIds;
        this.regionId = builder.regionId;
        this.reportType = builder.reportType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateEvaluationReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     * @return accountIds
     */
    public java.util.List<Long> getAccountIds() {
        return this.accountIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reportType
     */
    public String getReportType() {
        return this.reportType;
    }

    public static final class Builder extends Request.Builder<GenerateEvaluationReportRequest, Builder> {
        private Long accountId; 
        private java.util.List<Long> accountIds; 
        private String regionId; 
        private String reportType; 

        private Builder() {
            super();
        } 

        private Builder(GenerateEvaluationReportRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.accountIds = request.accountIds;
            this.regionId = request.regionId;
            this.reportType = request.reportType;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(Long accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * AccountIds.
         */
        public Builder accountIds(java.util.List<Long> accountIds) {
            String accountIdsShrink = shrink(accountIds, "AccountIds", "json");
            this.putQueryParameter("AccountIds", accountIdsShrink);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * <p>RegionId</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ReportType.
         */
        public Builder reportType(String reportType) {
            this.putQueryParameter("ReportType", reportType);
            this.reportType = reportType;
            return this;
        }

        @Override
        public GenerateEvaluationReportRequest build() {
            return new GenerateEvaluationReportRequest(this);
        } 

    } 

}
