// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link QuerySmsQualificationRecordRequest} extends {@link RequestModel}
 *
 * <p>QuerySmsQualificationRecordRequest</p>
 */
public class QuerySmsQualificationRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompanyName")
    private String companyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LegalPersonName")
    private String legalPersonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualificationGroupName")
    private String qualificationGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseBySelf")
    private Boolean useBySelf;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkOrderId")
    private Long workOrderId;

    private QuerySmsQualificationRecordRequest(Builder builder) {
        super(builder);
        this.companyName = builder.companyName;
        this.legalPersonName = builder.legalPersonName;
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.qualificationGroupName = builder.qualificationGroupName;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.state = builder.state;
        this.useBySelf = builder.useBySelf;
        this.workOrderId = builder.workOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsQualificationRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyName
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * @return legalPersonName
     */
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return qualificationGroupName
     */
    public String getQualificationGroupName() {
        return this.qualificationGroupName;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return useBySelf
     */
    public Boolean getUseBySelf() {
        return this.useBySelf;
    }

    /**
     * @return workOrderId
     */
    public Long getWorkOrderId() {
        return this.workOrderId;
    }

    public static final class Builder extends Request.Builder<QuerySmsQualificationRecordRequest, Builder> {
        private String companyName; 
        private String legalPersonName; 
        private Long ownerId; 
        private Long pageNo; 
        private Long pageSize; 
        private String qualificationGroupName; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String state; 
        private Boolean useBySelf; 
        private Long workOrderId; 

        private Builder() {
            super();
        } 

        private Builder(QuerySmsQualificationRecordRequest request) {
            super(request);
            this.companyName = request.companyName;
            this.legalPersonName = request.legalPersonName;
            this.ownerId = request.ownerId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.qualificationGroupName = request.qualificationGroupName;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.state = request.state;
            this.useBySelf = request.useBySelf;
            this.workOrderId = request.workOrderId;
        } 

        /**
         * <p>公司名</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder companyName(String companyName) {
            this.putQueryParameter("CompanyName", companyName);
            this.companyName = companyName;
            return this;
        }

        /**
         * <p>法人姓名</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder legalPersonName(String legalPersonName) {
            this.putQueryParameter("LegalPersonName", legalPersonName);
            this.legalPersonName = legalPersonName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>资质组名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder qualificationGroupName(String qualificationGroupName) {
            this.putQueryParameter("QualificationGroupName", qualificationGroupName);
            this.qualificationGroupName = qualificationGroupName;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>审核状态。INT:审核中FAILED:审核失败,PASSED:审核通过,NOT_FINISH:资料待补充,CANCELED:已撤回</p>
         * 
         * <strong>example:</strong>
         * <p>PASSED</p>
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * <p>是否自用</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder useBySelf(Boolean useBySelf) {
            this.putQueryParameter("UseBySelf", useBySelf);
            this.useBySelf = useBySelf;
            return this;
        }

        /**
         * <p>工单ID</p>
         * 
         * <strong>example:</strong>
         * <p>2001****</p>
         */
        public Builder workOrderId(Long workOrderId) {
            this.putQueryParameter("WorkOrderId", workOrderId);
            this.workOrderId = workOrderId;
            return this;
        }

        @Override
        public QuerySmsQualificationRecordRequest build() {
            return new QuerySmsQualificationRecordRequest(this);
        } 

    } 

}
