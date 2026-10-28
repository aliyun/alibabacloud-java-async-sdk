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
 * {@link QueryAutomaticWriteOffChangeRecordsRequest} extends {@link RequestModel}
 *
 * <p>QueryAutomaticWriteOffChangeRecordsRequest</p>
 */
public class QueryAutomaticWriteOffChangeRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long customerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    private QueryAutomaticWriteOffChangeRecordsRequest(Builder builder) {
        super(builder);
        this.customerUid = builder.customerUid;
        this.endDate = builder.endDate;
        this.language = builder.language;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAutomaticWriteOffChangeRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customerUid
     */
    public Long getCustomerUid() {
        return this.customerUid;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<QueryAutomaticWriteOffChangeRecordsRequest, Builder> {
        private Long customerUid; 
        private String endDate; 
        private String language; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(QueryAutomaticWriteOffChangeRecordsRequest request) {
            super(request);
            this.customerUid = request.customerUid;
            this.endDate = request.endDate;
            this.language = request.language;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.startDate = request.startDate;
        } 

        /**
         * <p>The customer UID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder customerUid(Long customerUid) {
            this.putQueryParameter("CustomerUid", customerUid);
            this.customerUid = customerUid;
            return this;
        }

        /**
         * <p>The end date.
         * Format: yyyy-MM-dd.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-20</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The language. If you do not specify this parameter, English is used by default. Valid values:</p>
         * <ul>
         * <li>en: English.</li>
         * <li>zh: Chinese.</li>
         * <li>ja: Japanese.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The start date.
         * Format: yyyy-MM-dd.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-20</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public QueryAutomaticWriteOffChangeRecordsRequest build() {
            return new QueryAutomaticWriteOffChangeRecordsRequest(this);
        } 

    } 

}
