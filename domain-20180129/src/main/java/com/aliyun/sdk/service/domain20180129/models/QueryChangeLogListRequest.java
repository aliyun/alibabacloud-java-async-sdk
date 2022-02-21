// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryChangeLogListRequest} extends {@link RequestModel}
 *
 * <p>QueryChangeLogListRequest</p>
 */
public class QueryChangeLogListRequest extends Request {
    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("EndDate")
    private Long endDate;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageNum")
    @Validation(required = true, minimum = 1)
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("StartDate")
    private Long startDate;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private QueryChangeLogListRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endDate = builder.endDate;
        this.lang = builder.lang;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryChangeLogListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
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
    public Long getStartDate() {
        return this.startDate;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<QueryChangeLogListRequest, Builder> {
        private String domainName; 
        private Long endDate; 
        private String lang; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Long startDate; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryChangeLogListRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.endDate = response.endDate;
            this.lang = response.lang;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.startDate = response.startDate;
            this.userClientIp = response.userClientIp;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(Long endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
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
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * StartDate.
         */
        public Builder startDate(Long startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public QueryChangeLogListRequest build() {
            return new QueryChangeLogListRequest(this);
        } 

    } 

}
