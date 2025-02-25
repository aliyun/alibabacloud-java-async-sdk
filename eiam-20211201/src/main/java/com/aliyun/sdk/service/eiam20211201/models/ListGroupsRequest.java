// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListGroupsRequest</p>
 */
public class ListGroupsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupExternalId")
    private String groupExternalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupIds")
    private java.util.List<String> groupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupNameStartsWith")
    private String groupNameStartsWith;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    private ListGroupsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.groupExternalId = builder.groupExternalId;
        this.groupIds = builder.groupIds;
        this.groupName = builder.groupName;
        this.groupNameStartsWith = builder.groupNameStartsWith;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupsRequest create() {
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
     * @return groupExternalId
     */
    public String getGroupExternalId() {
        return this.groupExternalId;
    }

    /**
     * @return groupIds
     */
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return groupNameStartsWith
     */
    public String getGroupNameStartsWith() {
        return this.groupNameStartsWith;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListGroupsRequest, Builder> {
        private String regionId; 
        private String groupExternalId; 
        private java.util.List<String> groupIds; 
        private String groupName; 
        private String groupNameStartsWith; 
        private String instanceId; 
        private Long pageNumber; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListGroupsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.groupExternalId = request.groupExternalId;
            this.groupIds = request.groupIds;
            this.groupName = request.groupName;
            this.groupNameStartsWith = request.groupNameStartsWith;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
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
         * <p>The external ID of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>group_external_id</p>
         */
        public Builder groupExternalId(String groupExternalId) {
            this.putQueryParameter("GroupExternalId", groupExternalId);
            this.groupExternalId = groupExternalId;
            return this;
        }

        /**
         * <p>The group IDs.</p>
         */
        public Builder groupIds(java.util.List<String> groupIds) {
            this.putQueryParameter("GroupIds", groupIds);
            this.groupIds = groupIds;
            return this;
        }

        /**
         * <p>The name of the group. If you specify this parameter, the query is based on an exact match.</p>
         * 
         * <strong>example:</strong>
         * <p>name_test</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The prefix of the group name. If you specify this parameter, the query follows the leftmost matching principle.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder groupNameStartsWith(String groupNameStartsWith) {
            this.putQueryParameter("GroupNameStartsWith", groupNameStartsWith);
            this.groupNameStartsWith = groupNameStartsWith;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListGroupsRequest build() {
            return new ListGroupsRequest(this);
        } 

    } 

}
