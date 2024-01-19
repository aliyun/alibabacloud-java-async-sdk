// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBudgetTicketItemListByBizIdRequest} extends {@link RequestModel}
 *
 * <p>QueryBudgetTicketItemListByBizIdRequest</p>
 */
public class QueryBudgetTicketItemListByBizIdRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("BudgetTicketNo")
    private String budgetTicketNo;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    private QueryBudgetTicketItemListByBizIdRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.budgetTicketNo = builder.budgetTicketNo;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBudgetTicketItemListByBizIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return budgetTicketNo
     */
    public String getBudgetTicketNo() {
        return this.budgetTicketNo;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<QueryBudgetTicketItemListByBizIdRequest, Builder> {
        private String bizId; 
        private String budgetTicketNo; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryBudgetTicketItemListByBizIdRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.budgetTicketNo = request.budgetTicketNo;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * BudgetTicketNo.
         */
        public Builder budgetTicketNo(String budgetTicketNo) {
            this.putQueryParameter("BudgetTicketNo", budgetTicketNo);
            this.budgetTicketNo = budgetTicketNo;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public QueryBudgetTicketItemListByBizIdRequest build() {
            return new QueryBudgetTicketItemListByBizIdRequest(this);
        } 

    } 

}
