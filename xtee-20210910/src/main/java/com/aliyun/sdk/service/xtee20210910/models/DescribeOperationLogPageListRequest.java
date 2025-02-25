// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOperationLogPageListRequest} extends {@link RequestModel}
 *
 * <p>DescribeOperationLogPageListRequest</p>
 */
public class DescribeOperationLogPageListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endDate")
    private Long endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startDate")
    private Long startDate;

    private DescribeOperationLogPageListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.currentPage = builder.currentPage;
        this.endDate = builder.endDate;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOperationLogPageListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<DescribeOperationLogPageListRequest, Builder> {
        private String lang; 
        private Integer currentPage; 
        private Long endDate; 
        private Integer pageSize; 
        private String regId; 
        private Long startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOperationLogPageListRequest request) {
            super(request);
            this.lang = request.lang;
            this.currentPage = request.currentPage;
            this.endDate = request.endDate;
            this.pageSize = request.pageSize;
            this.regId = request.regId;
            this.startDate = request.startDate;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * currentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * endDate.
         */
        public Builder endDate(Long endDate) {
            this.putQueryParameter("endDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * startDate.
         */
        public Builder startDate(Long startDate) {
            this.putQueryParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public DescribeOperationLogPageListRequest build() {
            return new DescribeOperationLogPageListRequest(this);
        } 

    } 

}
