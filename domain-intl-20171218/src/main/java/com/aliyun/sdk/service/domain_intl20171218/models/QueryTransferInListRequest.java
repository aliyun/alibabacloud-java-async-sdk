// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTransferInListRequest} extends {@link RequestModel}
 *
 * <p>QueryTransferInListRequest</p>
 */
public class QueryTransferInListRequest extends Request {
    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageNum")
    @Validation(required = true)
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("SimpleTransferInStatus")
    private String simpleTransferInStatus;

    @Query
    @NameInMap("SubmissionEndDate")
    private Long submissionEndDate;

    @Query
    @NameInMap("SubmissionStartDate")
    private Long submissionStartDate;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private QueryTransferInListRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.simpleTransferInStatus = builder.simpleTransferInStatus;
        this.submissionEndDate = builder.submissionEndDate;
        this.submissionStartDate = builder.submissionStartDate;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTransferInListRequest create() {
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
     * @return simpleTransferInStatus
     */
    public String getSimpleTransferInStatus() {
        return this.simpleTransferInStatus;
    }

    /**
     * @return submissionEndDate
     */
    public Long getSubmissionEndDate() {
        return this.submissionEndDate;
    }

    /**
     * @return submissionStartDate
     */
    public Long getSubmissionStartDate() {
        return this.submissionStartDate;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<QueryTransferInListRequest, Builder> {
        private String domainName; 
        private String lang; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String simpleTransferInStatus; 
        private Long submissionEndDate; 
        private Long submissionStartDate; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryTransferInListRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.simpleTransferInStatus = request.simpleTransferInStatus;
            this.submissionEndDate = request.submissionEndDate;
            this.submissionStartDate = request.submissionStartDate;
            this.userClientIp = request.userClientIp;
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
         * SimpleTransferInStatus.
         */
        public Builder simpleTransferInStatus(String simpleTransferInStatus) {
            this.putQueryParameter("SimpleTransferInStatus", simpleTransferInStatus);
            this.simpleTransferInStatus = simpleTransferInStatus;
            return this;
        }

        /**
         * SubmissionEndDate.
         */
        public Builder submissionEndDate(Long submissionEndDate) {
            this.putQueryParameter("SubmissionEndDate", submissionEndDate);
            this.submissionEndDate = submissionEndDate;
            return this;
        }

        /**
         * SubmissionStartDate.
         */
        public Builder submissionStartDate(Long submissionStartDate) {
            this.putQueryParameter("SubmissionStartDate", submissionStartDate);
            this.submissionStartDate = submissionStartDate;
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
        public QueryTransferInListRequest build() {
            return new QueryTransferInListRequest(this);
        } 

    } 

}
