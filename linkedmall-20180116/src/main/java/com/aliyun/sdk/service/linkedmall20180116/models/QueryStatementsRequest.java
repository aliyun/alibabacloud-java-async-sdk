// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link QueryStatementsRequest} extends {@link RequestModel}
 *
 * <p>QueryStatementsRequest</p>
 */
public class QueryStatementsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Currency")
    private String currency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtInfo")
    private String extInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayeeIds")
    private String payeeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SettleNoes")
    private String settleNoes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SettleStatus")
    private String settleStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SettleType")
    private String settleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private QueryStatementsRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.currency = builder.currency;
        this.endTime = builder.endTime;
        this.extInfo = builder.extInfo;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.payeeIds = builder.payeeIds;
        this.settleNoes = builder.settleNoes;
        this.settleStatus = builder.settleStatus;
        this.settleType = builder.settleType;
        this.startTime = builder.startTime;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStatementsRequest create() {
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
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return extInfo
     */
    public String getExtInfo() {
        return this.extInfo;
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

    /**
     * @return payeeIds
     */
    public String getPayeeIds() {
        return this.payeeIds;
    }

    /**
     * @return settleNoes
     */
    public String getSettleNoes() {
        return this.settleNoes;
    }

    /**
     * @return settleStatus
     */
    public String getSettleStatus() {
        return this.settleStatus;
    }

    /**
     * @return settleType
     */
    public String getSettleType() {
        return this.settleType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QueryStatementsRequest, Builder> {
        private String bizId; 
        private String currency; 
        private String endTime; 
        private String extInfo; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String payeeIds; 
        private String settleNoes; 
        private String settleStatus; 
        private String settleType; 
        private String startTime; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryStatementsRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.currency = request.currency;
            this.endTime = request.endTime;
            this.extInfo = request.extInfo;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.payeeIds = request.payeeIds;
            this.settleNoes = request.settleNoes;
            this.settleStatus = request.settleStatus;
            this.settleType = request.settleType;
            this.startTime = request.startTime;
            this.tenantId = request.tenantId;
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
         * Currency.
         */
        public Builder currency(String currency) {
            this.putQueryParameter("Currency", currency);
            this.currency = currency;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ExtInfo.
         */
        public Builder extInfo(String extInfo) {
            this.putQueryParameter("ExtInfo", extInfo);
            this.extInfo = extInfo;
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

        /**
         * PayeeIds.
         */
        public Builder payeeIds(String payeeIds) {
            this.putQueryParameter("PayeeIds", payeeIds);
            this.payeeIds = payeeIds;
            return this;
        }

        /**
         * SettleNoes.
         */
        public Builder settleNoes(String settleNoes) {
            this.putQueryParameter("SettleNoes", settleNoes);
            this.settleNoes = settleNoes;
            return this;
        }

        /**
         * SettleStatus.
         */
        public Builder settleStatus(String settleStatus) {
            this.putQueryParameter("SettleStatus", settleStatus);
            this.settleStatus = settleStatus;
            return this;
        }

        /**
         * SettleType.
         */
        public Builder settleType(String settleType) {
            this.putQueryParameter("SettleType", settleType);
            this.settleType = settleType;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>18******263</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public QueryStatementsRequest build() {
            return new QueryStatementsRequest(this);
        } 

    } 

}
