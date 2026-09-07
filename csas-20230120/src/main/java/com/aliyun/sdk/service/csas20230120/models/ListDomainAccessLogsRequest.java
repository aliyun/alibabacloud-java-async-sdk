// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListDomainAccessLogsRequest} extends {@link RequestModel}
 *
 * <p>ListDomainAccessLogsRequest</p>
 */
public class ListDomainAccessLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BlockAction")
    private String blockAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Department")
    private String department;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    private String policyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoteHost")
    private String remoteHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private ListDomainAccessLogsRequest(Builder builder) {
        super(builder);
        this.blockAction = builder.blockAction;
        this.currentPage = builder.currentPage;
        this.department = builder.department;
        this.endTime = builder.endTime;
        this.pageSize = builder.pageSize;
        this.policyType = builder.policyType;
        this.remoteHost = builder.remoteHost;
        this.startTime = builder.startTime;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDomainAccessLogsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blockAction
     */
    public String getBlockAction() {
        return this.blockAction;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return department
     */
    public String getDepartment() {
        return this.department;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * @return remoteHost
     */
    public String getRemoteHost() {
        return this.remoteHost;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<ListDomainAccessLogsRequest, Builder> {
        private String blockAction; 
        private Integer currentPage; 
        private String department; 
        private Long endTime; 
        private Integer pageSize; 
        private String policyType; 
        private String remoteHost; 
        private Long startTime; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(ListDomainAccessLogsRequest request) {
            super(request);
            this.blockAction = request.blockAction;
            this.currentPage = request.currentPage;
            this.department = request.department;
            this.endTime = request.endTime;
            this.pageSize = request.pageSize;
            this.policyType = request.policyType;
            this.remoteHost = request.remoteHost;
            this.startTime = request.startTime;
            this.userName = request.userName;
        } 

        /**
         * <p>The action taken upon a rule hit. Exact match is used. Valid values:</p>
         * <ul>
         * <li>Audit: Audit.</li>
         * <li>Observe: Observe only.</li>
         * <li>WhiteList: Allowed by whitelist.</li>
         * <li>Block: Blocked.</li>
         * <li>Redirect: Redirected to a prompt page.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Block</p>
         */
        public Builder blockAction(String blockAction) {
            this.putQueryParameter("BlockAction", blockAction);
            this.blockAction = blockAction;
            return this;
        }

        /**
         * <p>The current page number.</p>
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
         * <p>The department. Exact match is used.</p>
         * 
         * <strong>example:</strong>
         * <p>IT department</p>
         */
        public Builder department(String department) {
            this.putQueryParameter("Department", department);
            this.department = department;
            return this;
        }

        /**
         * <p>The end time of the query. This value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1754956800</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The number of entries per page in paging. Valid values: 1 to 1000.</p>
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
         * <p>The policy type used to filter results.</p>
         * 
         * <strong>example:</strong>
         * <p>la_domain_white</p>
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * <p>The destination domain name accessed. Exact match is used.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder remoteHost(String remoteHost) {
            this.putQueryParameter("RemoteHost", remoteHost);
            this.remoteHost = remoteHost;
            return this;
        }

        /**
         * <p>The start time of the query. This value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1754870400</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The username. Exact match is used.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public ListDomainAccessLogsRequest build() {
            return new ListDomainAccessLogsRequest(this);
        } 

    } 

}
