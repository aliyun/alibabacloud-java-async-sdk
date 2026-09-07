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
 * {@link ListClientUsersRequest} extends {@link RequestModel}
 *
 * <p>ListClientUsersRequest</p>
 */
public class ListClientUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DepartmentId")
    private String departmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdpConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String idpConfigId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobileNumber")
    private String mobileNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private ListClientUsersRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.departmentId = builder.departmentId;
        this.email = builder.email;
        this.idpConfigId = builder.idpConfigId;
        this.mobileNumber = builder.mobileNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClientUsersRequest create() {
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
     * @return departmentId
     */
    public String getDepartmentId() {
        return this.departmentId;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return idpConfigId
     */
    public String getIdpConfigId() {
        return this.idpConfigId;
    }

    /**
     * @return mobileNumber
     */
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<ListClientUsersRequest, Builder> {
        private Long currentPage; 
        private String departmentId; 
        private String email; 
        private String idpConfigId; 
        private String mobileNumber; 
        private Long pageSize; 
        private String status; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(ListClientUsersRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.departmentId = request.departmentId;
            this.email = request.email;
            this.idpConfigId = request.idpConfigId;
            this.mobileNumber = request.mobileNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.username = request.username;
        } 

        /**
         * <p>Current page number.</p>
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
         * <p>Department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10785</p>
         */
        public Builder departmentId(String departmentId) {
            this.putQueryParameter("DepartmentId", departmentId);
            this.departmentId = departmentId;
            return this;
        }

        /**
         * <p>Email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:johndoe@example.com">johndoe@example.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>Custom identity source configuration ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1071</p>
         */
        public Builder idpConfigId(String idpConfigId) {
            this.putQueryParameter("IdpConfigId", idpConfigId);
            this.idpConfigId = idpConfigId;
            return this;
        }

        /**
         * <p>Mobile phone number without country code.</p>
         * 
         * <strong>example:</strong>
         * <p>18980976559</p>
         */
        public Builder mobileNumber(String mobileNumber) {
            this.putQueryParameter("MobileNumber", mobileNumber);
            this.mobileNumber = mobileNumber;
            return this;
        }

        /**
         * <p>Page size.</p>
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
         * <p>User enable status. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
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
        public ListClientUsersRequest build() {
            return new ListClientUsersRequest(this);
        } 

    } 

}
