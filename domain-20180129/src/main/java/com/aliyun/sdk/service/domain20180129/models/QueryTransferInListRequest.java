// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link QueryTransferInListRequest} extends {@link RequestModel}
 *
 * <p>QueryTransferInListRequest</p>
 */
public class QueryTransferInListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SimpleTransferInStatus")
    private String simpleTransferInStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubmissionEndDate")
    private Long submissionEndDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubmissionStartDate")
    private Long submissionStartDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
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
         * <p>The domain name, which supports prefix matching (fuzzy query).</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The language of error messages returned by the API. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <p>Default value: <strong>en</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The page number of the domain name list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The page size for paging the domain name list.</p>
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
         * <p>Transfer status. Valid values:  </p>
         * <ul>
         * <li><strong>INIT</strong>: Submit transfer-in.  </li>
         * <li><strong>AUTHORIZATION</strong>: Authorize transfer-in (email verification).  </li>
         * <li><strong>NAME_VERIFICATION</strong>: Name review.  </li>
         * <li><strong>PASSWORD_VERIFICATION</strong>: Transfer password verification.  </li>
         * <li><strong>PENDING</strong>: Transfer-in in progress.  </li>
         * <li><strong>SUCCESS</strong>: Transfer-in succeeded.  </li>
         * <li><strong>FAIL</strong>: Transfer-in failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INIT</p>
         */
        public Builder simpleTransferInStatus(String simpleTransferInStatus) {
            this.putQueryParameter("SimpleTransferInStatus", simpleTransferInStatus);
            this.simpleTransferInStatus = simpleTransferInStatus;
            return this;
        }

        /**
         * <p>End time for submitting the domain name list for transfer-in.</p>
         * 
         * <strong>example:</strong>
         * <p>1514428524669</p>
         */
        public Builder submissionEndDate(Long submissionEndDate) {
            this.putQueryParameter("SubmissionEndDate", submissionEndDate);
            this.submissionEndDate = submissionEndDate;
            return this;
        }

        /**
         * <p>The start time for submitting the domain name list for transfer-in.</p>
         * 
         * <strong>example:</strong>
         * <p>1514428524669</p>
         */
        public Builder submissionStartDate(Long submissionStartDate) {
            this.putQueryParameter("SubmissionStartDate", submissionStartDate);
            this.submissionStartDate = submissionStartDate;
            return this;
        }

        /**
         * <p>The user IP address, which can be set to <strong>127.0.0.1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
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
