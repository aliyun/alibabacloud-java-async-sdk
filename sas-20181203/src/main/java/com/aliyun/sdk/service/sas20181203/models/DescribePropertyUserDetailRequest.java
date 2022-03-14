// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyUserDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyUserDetailRequest</p>
 */
public class DescribePropertyUserDetailRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("IsRoot")
    private String isRoot;

    @Query
    @NameInMap("LastLoginTimeEnd")
    private Long lastLoginTimeEnd;

    @Query
    @NameInMap("LastLoginTimeStart")
    private Long lastLoginTimeStart;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("User")
    private String user;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    private DescribePropertyUserDetailRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.isRoot = builder.isRoot;
        this.lastLoginTimeEnd = builder.lastLoginTimeEnd;
        this.lastLoginTimeStart = builder.lastLoginTimeStart;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
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
        private String isRoot; 
        private Long lastLoginTimeEnd; 
        private Long lastLoginTimeStart; 
        private Integer pageSize; 
        private String remark; 
        private String user; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribePropertyUserDetailRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.isRoot = request.isRoot;
            this.lastLoginTimeEnd = request.lastLoginTimeEnd;
            this.lastLoginTimeStart = request.lastLoginTimeStart;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.user = request.user;
            this.uuid = request.uuid;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * IsRoot.
         */
        public Builder isRoot(String isRoot) {
            this.putQueryParameter("IsRoot", isRoot);
            this.isRoot = isRoot;
            return this;
        }

        /**
         * LastLoginTimeEnd.
         */
        public Builder lastLoginTimeEnd(Long lastLoginTimeEnd) {
            this.putQueryParameter("LastLoginTimeEnd", lastLoginTimeEnd);
            this.lastLoginTimeEnd = lastLoginTimeEnd;
            return this;
        }

        /**
         * LastLoginTimeStart.
         */
        public Builder lastLoginTimeStart(Long lastLoginTimeStart) {
            this.putQueryParameter("LastLoginTimeStart", lastLoginTimeStart);
            this.lastLoginTimeStart = lastLoginTimeStart;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * User.
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        /**
         * Uuid.
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
