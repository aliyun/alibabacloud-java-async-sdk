// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInspectionResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeInspectionResultRequest</p>
 */
public class DescribeInspectionResultRequest extends Request {
    @Body
    @NameInMap("ContinuousDays")
    private Integer continuousDays;

    @Body
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("RiskCode")
    private String riskCode;

    @Body
    @NameInMap("Severity")
    private Integer severity;

    private DescribeInspectionResultRequest(Builder builder) {
        super(builder);
        this.continuousDays = builder.continuousDays;
        this.currentPage = builder.currentPage;
        this.operaUid = builder.operaUid;
        this.pageSize = builder.pageSize;
        this.riskCode = builder.riskCode;
        this.severity = builder.severity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInspectionResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return continuousDays
     */
    public Integer getContinuousDays() {
        return this.continuousDays;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return riskCode
     */
    public String getRiskCode() {
        return this.riskCode;
    }

    /**
     * @return severity
     */
    public Integer getSeverity() {
        return this.severity;
    }

    public static final class Builder extends Request.Builder<DescribeInspectionResultRequest, Builder> {
        private Integer continuousDays; 
        private Integer currentPage; 
        private String operaUid; 
        private Integer pageSize; 
        private String riskCode; 
        private Integer severity; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInspectionResultRequest request) {
            super(request);
            this.continuousDays = request.continuousDays;
            this.currentPage = request.currentPage;
            this.operaUid = request.operaUid;
            this.pageSize = request.pageSize;
            this.riskCode = request.riskCode;
            this.severity = request.severity;
        } 

        /**
         * ContinuousDays.
         */
        public Builder continuousDays(Integer continuousDays) {
            this.putBodyParameter("ContinuousDays", continuousDays);
            this.continuousDays = continuousDays;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RiskCode.
         */
        public Builder riskCode(String riskCode) {
            this.putBodyParameter("RiskCode", riskCode);
            this.riskCode = riskCode;
            return this;
        }

        /**
         * Severity.
         */
        public Builder severity(Integer severity) {
            this.putBodyParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        @Override
        public DescribeInspectionResultRequest build() {
            return new DescribeInspectionResultRequest(this);
        } 

    } 

}
