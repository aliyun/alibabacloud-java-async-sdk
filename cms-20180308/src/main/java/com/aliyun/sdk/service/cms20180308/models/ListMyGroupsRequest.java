// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link ListMyGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListMyGroupsRequest</p>
 */
public class ListMyGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindUrls")
    private String bindUrls;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectContactGroups")
    private Boolean selectContactGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListMyGroupsRequest(Builder builder) {
        super(builder);
        this.bindUrls = builder.bindUrls;
        this.groupName = builder.groupName;
        this.instanceId = builder.instanceId;
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.selectContactGroups = builder.selectContactGroups;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMyGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindUrls
     */
    public String getBindUrls() {
        return this.bindUrls;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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
     * @return selectContactGroups
     */
    public Boolean getSelectContactGroups() {
        return this.selectContactGroups;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListMyGroupsRequest, Builder> {
        private String bindUrls; 
        private String groupName; 
        private String instanceId; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean selectContactGroups; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListMyGroupsRequest request) {
            super(request);
            this.bindUrls = request.bindUrls;
            this.groupName = request.groupName;
            this.instanceId = request.instanceId;
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.selectContactGroups = request.selectContactGroups;
            this.type = request.type;
        } 

        /**
         * BindUrls.
         */
        public Builder bindUrls(String bindUrls) {
            this.putQueryParameter("BindUrls", bindUrls);
            this.bindUrls = bindUrls;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * SelectContactGroups.
         */
        public Builder selectContactGroups(Boolean selectContactGroups) {
            this.putQueryParameter("SelectContactGroups", selectContactGroups);
            this.selectContactGroups = selectContactGroups;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListMyGroupsRequest build() {
            return new ListMyGroupsRequest(this);
        } 

    } 

}
