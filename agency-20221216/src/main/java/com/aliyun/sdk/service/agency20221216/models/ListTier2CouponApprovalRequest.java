// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link ListTier2CouponApprovalRequest} extends {@link RequestModel}
 *
 * <p>ListTier2CouponApprovalRequest</p>
 */
public class ListTier2CouponApprovalRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationSheetId")
    private String applicationSheetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovalStatus")
    private String approvalStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("T2PartnerName")
    private String t2PartnerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("T2PartnerUid")
    private Long t2PartnerUid;

    private ListTier2CouponApprovalRequest(Builder builder) {
        super(builder);
        this.applicationSheetId = builder.applicationSheetId;
        this.approvalStatus = builder.approvalStatus;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.t2PartnerName = builder.t2PartnerName;
        this.t2PartnerUid = builder.t2PartnerUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTier2CouponApprovalRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationSheetId
     */
    public String getApplicationSheetId() {
        return this.applicationSheetId;
    }

    /**
     * @return approvalStatus
     */
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return t2PartnerName
     */
    public String getT2PartnerName() {
        return this.t2PartnerName;
    }

    /**
     * @return t2PartnerUid
     */
    public Long getT2PartnerUid() {
        return this.t2PartnerUid;
    }

    public static final class Builder extends Request.Builder<ListTier2CouponApprovalRequest, Builder> {
        private String applicationSheetId; 
        private String approvalStatus; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String t2PartnerName; 
        private Long t2PartnerUid; 

        private Builder() {
            super();
        } 

        private Builder(ListTier2CouponApprovalRequest request) {
            super(request);
            this.applicationSheetId = request.applicationSheetId;
            this.approvalStatus = request.approvalStatus;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.t2PartnerName = request.t2PartnerName;
            this.t2PartnerUid = request.t2PartnerUid;
        } 

        /**
         * ApplicationSheetId.
         */
        public Builder applicationSheetId(String applicationSheetId) {
            this.putQueryParameter("ApplicationSheetId", applicationSheetId);
            this.applicationSheetId = applicationSheetId;
            return this;
        }

        /**
         * ApprovalStatus.
         */
        public Builder approvalStatus(String approvalStatus) {
            this.putQueryParameter("ApprovalStatus", approvalStatus);
            this.approvalStatus = approvalStatus;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * T2PartnerName.
         */
        public Builder t2PartnerName(String t2PartnerName) {
            this.putQueryParameter("T2PartnerName", t2PartnerName);
            this.t2PartnerName = t2PartnerName;
            return this;
        }

        /**
         * T2PartnerUid.
         */
        public Builder t2PartnerUid(Long t2PartnerUid) {
            this.putQueryParameter("T2PartnerUid", t2PartnerUid);
            this.t2PartnerUid = t2PartnerUid;
            return this;
        }

        @Override
        public ListTier2CouponApprovalRequest build() {
            return new ListTier2CouponApprovalRequest(this);
        } 

    } 

}
