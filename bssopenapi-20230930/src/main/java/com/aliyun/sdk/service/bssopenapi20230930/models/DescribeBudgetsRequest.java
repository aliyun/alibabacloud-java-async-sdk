// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link DescribeBudgetsRequest} extends {@link RequestModel}
 *
 * <p>DescribeBudgetsRequest</p>
 */
public class DescribeBudgetsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BudgetName")
    private String budgetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BudgetType")
    private String budgetType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpireStatus")
    private String expireStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private DescribeBudgetsRequest(Builder builder) {
        super(builder);
        this.budgetName = builder.budgetName;
        this.budgetType = builder.budgetType;
        this.expireStatus = builder.expireStatus;
        this.nbid = builder.nbid;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBudgetsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return budgetName
     */
    public String getBudgetName() {
        return this.budgetName;
    }

    /**
     * @return budgetType
     */
    public String getBudgetType() {
        return this.budgetType;
    }

    /**
     * @return expireStatus
     */
    public String getExpireStatus() {
        return this.expireStatus;
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeBudgetsRequest, Builder> {
        private String budgetName; 
        private String budgetType; 
        private String expireStatus; 
        private String nbid; 
        private Integer pageNo; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBudgetsRequest request) {
            super(request);
            this.budgetName = request.budgetName;
            this.budgetType = request.budgetType;
            this.expireStatus = request.expireStatus;
            this.nbid = request.nbid;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
        } 

        /**
         * BudgetName.
         */
        public Builder budgetName(String budgetName) {
            this.putBodyParameter("BudgetName", budgetName);
            this.budgetName = budgetName;
            return this;
        }

        /**
         * BudgetType.
         */
        public Builder budgetType(String budgetType) {
            this.putBodyParameter("BudgetType", budgetType);
            this.budgetType = budgetType;
            return this;
        }

        /**
         * ExpireStatus.
         */
        public Builder expireStatus(String expireStatus) {
            this.putBodyParameter("ExpireStatus", expireStatus);
            this.expireStatus = expireStatus;
            return this;
        }

        /**
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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

        @Override
        public DescribeBudgetsRequest build() {
            return new DescribeBudgetsRequest(this);
        } 

    } 

}
