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
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

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
        private String extend; 
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
            this.extend = request.extend;
            this.isRoot = request.isRoot;
            this.lastLoginTimeEnd = request.lastLoginTimeEnd;
            this.lastLoginTimeStart = request.lastLoginTimeStart;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.user = request.user;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
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
         * <p>Specifies whether the fuzzy search by account name is supported. If you want to use fuzzy search, set the parameter to <strong>1</strong>. If you set the parameter to a different value or leave the parameter empty, fuzzy search is not supported.</p>
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
         * <p>Specifies whether the account has root permissions. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
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
         * <p>The timestamp of the last logoff from the account. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>164922523600</p>
         */
        public Builder lastLoginTimeEnd(Long lastLoginTimeEnd) {
            this.putQueryParameter("LastLoginTimeEnd", lastLoginTimeEnd);
            this.lastLoginTimeEnd = lastLoginTimeEnd;
            return this;
        }

        /**
         * <p>The timestamp of the last logon to the account. Unit: milliseconds.</p>
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
         * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
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
         * <p>The name or IP address of the server.</p>
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
         * <p>The name of the account to which the server belongs.</p>
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
         * <p>The UUID of the server.</p>
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
