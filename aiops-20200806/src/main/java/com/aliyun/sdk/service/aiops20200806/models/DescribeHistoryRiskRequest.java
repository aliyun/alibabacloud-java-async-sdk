// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHistoryRiskRequest} extends {@link RequestModel}
 *
 * <p>DescribeHistoryRiskRequest</p>
 */
public class DescribeHistoryRiskRequest extends Request {
    @Body
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Body
    @NameInMap("LastFindTimeEnd")
    private String lastFindTimeEnd;

    @Body
    @NameInMap("LastFindTimeStart")
    private String lastFindTimeStart;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("ProductCode")
    private String productCode;

    @Body
    @NameInMap("Severity")
    private Integer severity;

    private DescribeHistoryRiskRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.lastFindTimeEnd = builder.lastFindTimeEnd;
        this.lastFindTimeStart = builder.lastFindTimeStart;
        this.operaUid = builder.operaUid;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.severity = builder.severity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHistoryRiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return lastFindTimeEnd
     */
    public String getLastFindTimeEnd() {
        return this.lastFindTimeEnd;
    }

    /**
     * @return lastFindTimeStart
     */
    public String getLastFindTimeStart() {
        return this.lastFindTimeStart;
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
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return severity
     */
    public Integer getSeverity() {
        return this.severity;
    }

    public static final class Builder extends Request.Builder<DescribeHistoryRiskRequest, Builder> {
        private Integer currentPage; 
        private String lastFindTimeEnd; 
        private String lastFindTimeStart; 
        private String operaUid; 
        private Integer pageSize; 
        private String productCode; 
        private Integer severity; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHistoryRiskRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.lastFindTimeEnd = request.lastFindTimeEnd;
            this.lastFindTimeStart = request.lastFindTimeStart;
            this.operaUid = request.operaUid;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.severity = request.severity;
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
         * LastFindTimeEnd.
         */
        public Builder lastFindTimeEnd(String lastFindTimeEnd) {
            this.putBodyParameter("LastFindTimeEnd", lastFindTimeEnd);
            this.lastFindTimeEnd = lastFindTimeEnd;
            return this;
        }

        /**
         * LastFindTimeStart.
         */
        public Builder lastFindTimeStart(String lastFindTimeStart) {
            this.putBodyParameter("LastFindTimeStart", lastFindTimeStart);
            this.lastFindTimeStart = lastFindTimeStart;
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
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
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
        public DescribeHistoryRiskRequest build() {
            return new DescribeHistoryRiskRequest(this);
        } 

    } 

}
