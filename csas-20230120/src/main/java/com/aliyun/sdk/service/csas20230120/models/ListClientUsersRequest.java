// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * CurrentPage.
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DepartmentId.
         */
        public Builder departmentId(String departmentId) {
            this.putQueryParameter("DepartmentId", departmentId);
            this.departmentId = departmentId;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * IdpConfigId.
         */
        public Builder idpConfigId(String idpConfigId) {
            this.putQueryParameter("IdpConfigId", idpConfigId);
            this.idpConfigId = idpConfigId;
            return this;
        }

        /**
         * MobileNumber.
         */
        public Builder mobileNumber(String mobileNumber) {
            this.putQueryParameter("MobileNumber", mobileNumber);
            this.mobileNumber = mobileNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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

        /**
         * Username.
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
