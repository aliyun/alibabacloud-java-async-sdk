// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribePropertyUserDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyUserDetailRequest</p>
 */
public class DescribePropertyUserDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extend")
    private String extend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsRoot")
    private String isRoot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LastLoginTimeEnd")
    private Long lastLoginTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LastLoginTimeStart")
    private Long lastLoginTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseNextToken")
    private Boolean useNextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    private String user;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private DescribePropertyUserDetailRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.extend = builder.extend;
        this.isRoot = builder.isRoot;
        this.lastLoginTimeEnd = builder.lastLoginTimeEnd;
        this.lastLoginTimeStart = builder.lastLoginTimeStart;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.useNextToken = builder.useNextToken;
        this.user = builder.user;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyUserDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return isRoot
     */
    public String getIsRoot() {
        return this.isRoot;
    }

    /**
     * @return lastLoginTimeEnd
     */
    public Long getLastLoginTimeEnd() {
        return this.lastLoginTimeEnd;
    }

    /**
     * @return lastLoginTimeStart
     */
    public Long getLastLoginTimeStart() {
        return this.lastLoginTimeStart;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return useNextToken
     */
    public Boolean getUseNextToken() {
        return this.useNextToken;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribePropertyUserDetailRequest, Builder> {
        private Integer currentPage; 
        private String extend; 
        private String isRoot; 
        private Long lastLoginTimeEnd; 
        private Long lastLoginTimeStart; 
        private String nextToken; 
        private Integer pageSize; 
        private String remark; 
        private Boolean useNextToken; 
        private String user; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribePropertyUserDetailRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.extend = request.extend;
            this.isRoot = request.isRoot;
            this.lastLoginTimeEnd = request.lastLoginTimeEnd;
            this.lastLoginTimeStart = request.lastLoginTimeStart;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.useNextToken = request.useNextToken;
            this.user = request.user;
            this.uuid = request.uuid;
        } 

        /**
         * <p>Set which page of the returned results to start displaying the query results. The default value is <strong>1</strong>, indicating that the display starts from the first page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Whether the account name supports fuzzy search. To enable fuzzy search, set this parameter&quot;s value to <strong>1</strong>; other values or an empty value indicate that fuzzy search is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * <p>Whether the queried account has ROOT privileges. Possible values include:</p>
         * <ul>
         * <li><strong>0</strong>: No</li>
         * <li><strong>1</strong>: Yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isRoot(String isRoot) {
            this.putQueryParameter("IsRoot", isRoot);
            this.isRoot = isRoot;
            return this;
        }

        /**
         * <p>The end timestamp for the last login retrieval. The unit is milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1651298836000</p>
         */
        public Builder lastLoginTimeEnd(Long lastLoginTimeEnd) {
            this.putQueryParameter("LastLoginTimeEnd", lastLoginTimeEnd);
            this.lastLoginTimeEnd = lastLoginTimeEnd;
            return this;
        }

        /**
         * <p>The start timestamp for the last login retrieval. The unit is milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>164922523600</p>
         */
        public Builder lastLoginTimeStart(Long lastLoginTimeStart) {
            this.putQueryParameter("LastLoginTimeStart", lastLoginTimeStart);
            this.lastLoginTimeStart = lastLoginTimeStart;
            return this;
        }

        /**
         * <p>Used to mark the starting position for reading. Leave it empty to start from the beginning.</p>
         * <blockquote>
         * <p>For the first call, you do not need to fill in this field. The response will include the NextToken for the second call, and each subsequent call will include the NextToken for the next call.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>E17B501887A2D3AA5E8360A6EFA3B***</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Set the number of account asset fingerprint information items to display per page during pagination. The default value is <strong>10</strong>, indicating that 10 items of account asset fingerprint information are displayed per page.</p>
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
         * <p>The name or IP address of the server to be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>Whether to use the NextToken method to fetch vulnerability list data. If this parameter is used, TotalCount will no longer be returned. Possible values:</p>
         * <ul>
         * <li><strong>true</strong>: Use the NextToken method.</li>
         * <li><strong>false</strong>: Do not use the NextToken method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder useNextToken(Boolean useNextToken) {
            this.putQueryParameter("UseNextToken", useNextToken);
            this.useNextToken = useNextToken;
            return this;
        }

        /**
         * <p>The account name of the server to be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>bin</p>
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        /**
         * <p>The UUID of the server to be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>50d213b4-3a35-427a-b8a5-04b0c7e1****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribePropertyUserDetailRequest build() {
            return new DescribePropertyUserDetailRequest(this);
        } 

    } 

}
