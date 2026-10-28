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
         * <p>The ID of the application form.</p>
         * 
         * <strong>example:</strong>
         * <p>d54ca949-9b88-4514-add3-c6029c4027f4</p>
         */
        public Builder applicationSheetId(String applicationSheetId) {
            this.putQueryParameter("ApplicationSheetId", applicationSheetId);
            this.applicationSheetId = applicationSheetId;
            return this;
        }

        /**
         * <p>The approval status. Valid values:</p>
         * <ul>
         * <li>1: Revoked.</li>
         * <li>2: Under review.</li>
         * <li>3: Rejected.</li>
         * <li>4: Approved.</li>
         * <li>5: Approved but issuance failed.</li>
         * <li>8: Pending.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder approvalStatus(String approvalStatus) {
            this.putQueryParameter("ApprovalStatus", approvalStatus);
            this.approvalStatus = approvalStatus;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1.</p>
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
         * <p>The number of entries per page.</p>
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
         * <p>The name of the secondary distributor.</p>
         * 
         * <strong>example:</strong>
         * <p>test account</p>
         */
        public Builder t2PartnerName(String t2PartnerName) {
            this.putQueryParameter("T2PartnerName", t2PartnerName);
            this.t2PartnerName = t2PartnerName;
            return this;
        }

        /**
         * <p>The UID of the secondary distributor.</p>
         * 
         * <strong>example:</strong>
         * <p>5248516956402795</p>
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
