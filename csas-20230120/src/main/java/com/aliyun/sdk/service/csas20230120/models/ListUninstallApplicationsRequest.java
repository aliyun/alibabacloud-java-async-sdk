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
 * {@link ListUninstallApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListUninstallApplicationsRequest</p>
 */
public class ListUninstallApplicationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationIds")
    private java.util.List<String> applicationIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Department")
    private String department;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mac")
    private String mac;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private java.util.List<String> statuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private ListUninstallApplicationsRequest(Builder builder) {
        super(builder);
        this.applicationIds = builder.applicationIds;
        this.currentPage = builder.currentPage;
        this.department = builder.department;
        this.hostname = builder.hostname;
        this.mac = builder.mac;
        this.pageSize = builder.pageSize;
        this.statuses = builder.statuses;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUninstallApplicationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationIds
     */
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return department
     */
    public String getDepartment() {
        return this.department;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return mac
     */
    public String getMac() {
        return this.mac;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return statuses
     */
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<ListUninstallApplicationsRequest, Builder> {
        private java.util.List<String> applicationIds; 
        private Long currentPage; 
        private String department; 
        private String hostname; 
        private String mac; 
        private Long pageSize; 
        private java.util.List<String> statuses; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(ListUninstallApplicationsRequest request) {
            super(request);
            this.applicationIds = request.applicationIds;
            this.currentPage = request.currentPage;
            this.department = request.department;
            this.hostname = request.hostname;
            this.mac = request.mac;
            this.pageSize = request.pageSize;
            this.statuses = request.statuses;
            this.username = request.username;
        } 

        /**
         * ApplicationIds.
         */
        public Builder applicationIds(java.util.List<String> applicationIds) {
            this.putQueryParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Department.
         */
        public Builder department(String department) {
            this.putQueryParameter("Department", department);
            this.department = department;
            return this;
        }

        /**
         * Hostname.
         */
        public Builder hostname(String hostname) {
            this.putQueryParameter("Hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * Mac.
         */
        public Builder mac(String mac) {
            this.putQueryParameter("Mac", mac);
            this.mac = mac;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Statuses.
         */
        public Builder statuses(java.util.List<String> statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public ListUninstallApplicationsRequest build() {
            return new ListUninstallApplicationsRequest(this);
        } 

    } 

}
