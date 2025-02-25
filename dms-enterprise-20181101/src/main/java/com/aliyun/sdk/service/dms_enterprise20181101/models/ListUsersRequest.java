// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserState")
    private String userState;

    private ListUsersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.role = builder.role;
        this.searchKey = builder.searchKey;
        this.tid = builder.tid;
        this.userState = builder.userState;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return userState
     */
    public String getUserState() {
        return this.userState;
    }

    public static final class Builder extends Request.Builder<ListUsersRequest, Builder> {
        private String regionId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String role; 
        private String searchKey; 
        private Long tid; 
        private String userState; 

        private Builder() {
            super();
        } 

        private Builder(ListUsersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.role = request.role;
            this.searchKey = request.searchKey;
            this.tid = request.tid;
            this.userState = request.userState;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
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
         * <p>The number of entries to return on each page.</p>
         * <p>**</p>
         * <p>Valid values: 10, 20, 50, and 100.**** Default value: 10.</p>
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
         * <p>The role that is assigned to the user. Valid values:</p>
         * <ul>
         * <li><strong>USER</strong>: a regular user.</li>
         * <li><strong>DBA</strong> : a database administrator (DBA).</li>
         * <li><strong>ADMIN</strong>: a Data Management (DMS) administrator.</li>
         * <li><strong>SECURITY_ADMIN</strong>: a security administrator.</li>
         * <li><strong>STRUCT_READ_ONLY</strong>: a schema read-only user.</li>
         * </ul>
         * <blockquote>
         * <p> To check your role, move the pointer over the profile picture in the upper-right corner of the DMS console.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DBA</p>
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * <p>The search keyword. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to obtain the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * <p>The status of the user. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: The user is normal.</li>
         * <li><strong>DISABLE</strong>: The user is disabled.</li>
         * <li><strong>DELETE</strong>: The user is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder userState(String userState) {
            this.putQueryParameter("UserState", userState);
            this.userState = userState;
            return this;
        }

        @Override
        public ListUsersRequest build() {
            return new ListUsersRequest(this);
        } 

    } 

}
