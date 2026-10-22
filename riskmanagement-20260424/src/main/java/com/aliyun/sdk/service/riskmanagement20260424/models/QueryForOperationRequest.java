// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link QueryForOperationRequest} extends {@link RequestModel}
 *
 * <p>QueryForOperationRequest</p>
 */
public class QueryForOperationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyTimeEnd")
    private Long applyTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyTimeStart")
    private Long applyTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetType")
    private String assetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditTimeEnd")
    private Long auditTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditTimeStart")
    private Long auditTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerUid")
    private String customerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private QueryForOperationRequest(Builder builder) {
        super(builder);
        this.applyTimeEnd = builder.applyTimeEnd;
        this.applyTimeStart = builder.applyTimeStart;
        this.assetType = builder.assetType;
        this.auditTimeEnd = builder.auditTimeEnd;
        this.auditTimeStart = builder.auditTimeStart;
        this.currentPage = builder.currentPage;
        this.customerUid = builder.customerUid;
        this.ip = builder.ip;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryForOperationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyTimeEnd
     */
    public Long getApplyTimeEnd() {
        return this.applyTimeEnd;
    }

    /**
     * @return applyTimeStart
     */
    public Long getApplyTimeStart() {
        return this.applyTimeStart;
    }

    /**
     * @return assetType
     */
    public String getAssetType() {
        return this.assetType;
    }

    /**
     * @return auditTimeEnd
     */
    public Long getAuditTimeEnd() {
        return this.auditTimeEnd;
    }

    /**
     * @return auditTimeStart
     */
    public Long getAuditTimeStart() {
        return this.auditTimeStart;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return customerUid
     */
    public String getCustomerUid() {
        return this.customerUid;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<QueryForOperationRequest, Builder> {
        private Long applyTimeEnd; 
        private Long applyTimeStart; 
        private String assetType; 
        private Long auditTimeEnd; 
        private Long auditTimeStart; 
        private Integer currentPage; 
        private String customerUid; 
        private String ip; 
        private Integer pageSize; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(QueryForOperationRequest request) {
            super(request);
            this.applyTimeEnd = request.applyTimeEnd;
            this.applyTimeStart = request.applyTimeStart;
            this.assetType = request.assetType;
            this.auditTimeEnd = request.auditTimeEnd;
            this.auditTimeStart = request.auditTimeStart;
            this.currentPage = request.currentPage;
            this.customerUid = request.customerUid;
            this.ip = request.ip;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * <p>The end time of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>1791937232000</p>
         */
        public Builder applyTimeEnd(Long applyTimeEnd) {
            this.putQueryParameter("ApplyTimeEnd", applyTimeEnd);
            this.applyTimeEnd = applyTimeEnd;
            return this;
        }

        /**
         * <p>The start time of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>1791937132000</p>
         */
        public Builder applyTimeStart(Long applyTimeStart) {
            this.putQueryParameter("ApplyTimeStart", applyTimeStart);
            this.applyTimeStart = applyTimeStart;
            return this;
        }

        /**
         * <p>The asset type. Valid values:</p>
         * <ul>
         * <li><strong>EIP</strong>: VPC public IP address.</li>
         * <li><strong>SLB</strong>: load balancing.</li>
         * <li><strong>ECS</strong>: Public IP address in the classic network.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EIP</p>
         */
        public Builder assetType(String assetType) {
            this.putQueryParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        /**
         * <p>The end time of the review.</p>
         * 
         * <strong>example:</strong>
         * <p>1791937232000</p>
         */
        public Builder auditTimeEnd(Long auditTimeEnd) {
            this.putQueryParameter("AuditTimeEnd", auditTimeEnd);
            this.auditTimeEnd = auditTimeEnd;
            return this;
        }

        /**
         * <p>The start time of the review.</p>
         * 
         * <strong>example:</strong>
         * <p>1791937132000</p>
         */
        public Builder auditTimeStart(Long auditTimeStart) {
            this.putQueryParameter("AuditTimeStart", auditTimeStart);
            this.auditTimeStart = auditTimeStart;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * <blockquote>
         * <p>Default value: 1.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The customer UID.</p>
         * 
         * <strong>example:</strong>
         * <p>1647796581073291</p>
         */
        public Builder customerUid(String customerUid) {
            this.putQueryParameter("CustomerUid", customerUid);
            this.customerUid = customerUid;
            return this;
        }

        /**
         * <p>IP</p>
         * 
         * <strong>example:</strong>
         * <p>12.3*.22.11</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><strong>auditing</strong>: Under review.</li>
         * <li><strong>approved</strong>: Approved.</li>
         * <li><strong>rejected</strong>: Rejected.</li>
         * <li><strong>effective</strong>: Effective.</li>
         * <li><strong>ineffective</strong>: Ineffective.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>approved</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public QueryForOperationRequest build() {
            return new QueryForOperationRequest(this);
        } 

    } 

}
