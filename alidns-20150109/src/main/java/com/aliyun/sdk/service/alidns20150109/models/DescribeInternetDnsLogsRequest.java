// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeInternetDnsLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInternetDnsLogsRequest</p>
 */
public class DescribeInternetDnsLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private Long accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimestamp")
    private Long endTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Module")
    private String module;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryCondition")
    private String queryCondition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimestamp")
    private Long startTimestamp;

    private DescribeInternetDnsLogsRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.domainName = builder.domainName;
        this.endTimestamp = builder.endTimestamp;
        this.lang = builder.lang;
        this.module = builder.module;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryCondition = builder.queryCondition;
        this.startTimestamp = builder.startTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInternetDnsLogsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTimestamp
     */
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return module
     */
    public String getModule() {
        return this.module;
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
     * @return queryCondition
     */
    public String getQueryCondition() {
        return this.queryCondition;
    }

    /**
     * @return startTimestamp
     */
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public static final class Builder extends Request.Builder<DescribeInternetDnsLogsRequest, Builder> {
        private Long accountId; 
        private String domainName; 
        private Long endTimestamp; 
        private String lang; 
        private String module; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryCondition; 
        private Long startTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInternetDnsLogsRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.domainName = request.domainName;
            this.endTimestamp = request.endTimestamp;
            this.lang = request.lang;
            this.module = request.module;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryCondition = request.queryCondition;
            this.startTimestamp = request.startTimestamp;
        } 

        /**
         * <p>The account ID displayed on the Recursive Resolution (Public DNS) page after you activate Alibaba Cloud Public DNS.</p>
         * 
         * <strong>example:</strong>
         * <p>51**4</p>
         */
        public Builder accountId(Long accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The domain name.</p>
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
         * <p>The end time of the query (timestamp, unit: milliseconds). &gt;Warning: If the query time span is too large and the amount of resolution logs for the queried domain is excessive, it may lead to a query timeout or inaccurate query results.</p>
         * 
         * <strong>example:</strong>
         * <p>1709196299999</p>
         */
        public Builder endTimestamp(Long endTimestamp) {
            this.putQueryParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * <p>Return value language, options: </p>
         * <ul>
         * <li>zh: Chinese </li>
         * <li>en: English</li>
         * </ul>
         * <p>Default: en</p>
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
         * <p>Module type </p>
         * <ul>
         * <li>AUTHORITY (default): Public Authoritative DNS </li>
         * <li>RECURSION: Public Recursive DNS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AUTHORITY</p>
         */
        public Builder module(String module) {
            this.putQueryParameter("Module", module);
            this.module = module;
            return this;
        }

        /**
         * <p>Page number, default value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Page size for query.</p>
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
         * <p>Query parameters </p>
         * <ul>
         * <li>sourceIp: Source IP address </li>
         * <li>queryNameFuzzy: Domain name (fuzzy value) </li>
         * <li>queryType: Record type </li>
         * <li>value: Resolution result </li>
         * <li>status: Status </li>
         * <li>serverIp: Resolution server IP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sourceIp&quot;:&quot;59.82.XX.XX&quot;,&quot;queryType&quot;:&quot;A&quot;}</p>
         */
        public Builder queryCondition(String queryCondition) {
            this.putQueryParameter("QueryCondition", queryCondition);
            this.queryCondition = queryCondition;
            return this;
        }

        /**
         * <p>The start time of the query (timestamp, unit: milliseconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1709192640000</p>
         */
        public Builder startTimestamp(Long startTimestamp) {
            this.putQueryParameter("StartTimestamp", startTimestamp);
            this.startTimestamp = startTimestamp;
            return this;
        }

        @Override
        public DescribeInternetDnsLogsRequest build() {
            return new DescribeInternetDnsLogsRequest(this);
        } 

    } 

}
