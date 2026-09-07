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
 * {@link ListEnterpriseAccelerateLogsRequest} extends {@link RequestModel}
 *
 * <p>ListEnterpriseAccelerateLogsRequest</p>
 */
public class ListEnterpriseAccelerateLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Department")
    private String department;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstAddr")
    private String dstAddr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchMode")
    private String searchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private ListEnterpriseAccelerateLogsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.department = builder.department;
        this.dstAddr = builder.dstAddr;
        this.endTime = builder.endTime;
        this.pageSize = builder.pageSize;
        this.searchMode = builder.searchMode;
        this.startTime = builder.startTime;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnterpriseAccelerateLogsRequest create() {
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
     * @return department
     */
    public String getDepartment() {
        return this.department;
    }

    /**
     * @return dstAddr
     */
    public String getDstAddr() {
        return this.dstAddr;
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
     * @return searchMode
     */
    public String getSearchMode() {
        return this.searchMode;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<ListEnterpriseAccelerateLogsRequest, Builder> {
        private Integer currentPage; 
        private String department; 
        private String dstAddr; 
        private Long endTime; 
        private Integer pageSize; 
        private String searchMode; 
        private Long startTime; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(ListEnterpriseAccelerateLogsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.department = request.department;
            this.dstAddr = request.dstAddr;
            this.endTime = request.endTime;
            this.pageSize = request.pageSize;
            this.searchMode = request.searchMode;
            this.startTime = request.startTime;
            this.username = request.username;
        } 

        /**
         * <p>The current page number displayed during paged queries. Value range: 1 to 10000.</p>
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
         * <p>Department.</p>
         * 
         * <strong>example:</strong>
         * <p>测试部</p>
         */
        public Builder department(String department) {
            this.putQueryParameter("Department", department);
            this.department = department;
            return this;
        }

        /**
         * <p>Endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>jfrog.cea.vwah.vwgroup.com</p>
         */
        public Builder dstAddr(String dstAddr) {
            this.putQueryParameter("DstAddr", dstAddr);
            this.dstAddr = dstAddr;
            return this;
        }

        /**
         * <p>End time, UNIX timestamp, in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1748422694</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The number of items per page for paged queries. Value range: 1 to 1000.</p>
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
         * <p>Query mode. Only the DstAddr field supports the following modes:</p>
         * <ul>
         * <li><p><strong>Exact</strong>: Term query</p>
         * </li>
         * <li><p><strong>Fuzzy</strong>: Fuzzy query</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Exact</p>
         */
        public Builder searchMode(String searchMode) {
            this.putQueryParameter("SearchMode", searchMode);
            this.searchMode = searchMode;
            return this;
        }

        /**
         * <p>Start time, UNIX timestamp, in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1748419094</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Username.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public ListEnterpriseAccelerateLogsRequest build() {
            return new ListEnterpriseAccelerateLogsRequest(this);
        } 

    } 

}
