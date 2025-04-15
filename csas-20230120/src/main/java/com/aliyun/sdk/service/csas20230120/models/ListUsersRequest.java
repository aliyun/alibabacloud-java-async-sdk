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
 * {@link ListUsersRequest} extends {@link RequestModel}
 *
 * <p>ListUsersRequest</p>
 */
public class ListUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Department")
    private String department;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FuzzyUsername")
    private String fuzzyUsername;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreciseUsername")
    private String preciseUsername;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaseUserIds")
    private java.util.List<String> saseUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListUsersRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.department = builder.department;
        this.fuzzyUsername = builder.fuzzyUsername;
        this.pageSize = builder.pageSize;
        this.preciseUsername = builder.preciseUsername;
        this.saseUserIds = builder.saseUserIds;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return fuzzyUsername
     */
    public String getFuzzyUsername() {
        return this.fuzzyUsername;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return preciseUsername
     */
    public String getPreciseUsername() {
        return this.preciseUsername;
    }

    /**
     * @return saseUserIds
     */
    public java.util.List<String> getSaseUserIds() {
        return this.saseUserIds;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListUsersRequest, Builder> {
        private Long currentPage; 
        private String department; 
        private String fuzzyUsername; 
        private Long pageSize; 
        private String preciseUsername; 
        private java.util.List<String> saseUserIds; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListUsersRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.department = request.department;
            this.fuzzyUsername = request.fuzzyUsername;
            this.pageSize = request.pageSize;
            this.preciseUsername = request.preciseUsername;
            this.saseUserIds = request.saseUserIds;
            this.status = request.status;
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
         * FuzzyUsername.
         */
        public Builder fuzzyUsername(String fuzzyUsername) {
            this.putQueryParameter("FuzzyUsername", fuzzyUsername);
            this.fuzzyUsername = fuzzyUsername;
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
         * PreciseUsername.
         */
        public Builder preciseUsername(String preciseUsername) {
            this.putQueryParameter("PreciseUsername", preciseUsername);
            this.preciseUsername = preciseUsername;
            return this;
        }

        /**
         * SaseUserIds.
         */
        public Builder saseUserIds(java.util.List<String> saseUserIds) {
            this.putQueryParameter("SaseUserIds", saseUserIds);
            this.saseUserIds = saseUserIds;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListUsersRequest build() {
            return new ListUsersRequest(this);
        } 

    } 

}
