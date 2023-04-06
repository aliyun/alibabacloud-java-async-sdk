// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListGroupsRequest</p>
 */
public class ListGroupsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("GroupExternalId")
    private String groupExternalId;

    @Query
    @NameInMap("GroupIds")
    private java.util.List < String > groupIds;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("GroupNameStartsWith")
    private String groupNameStartsWith;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
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
    public java.util.List < String > getGroupIds() {
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
        private java.util.List < String > groupIds; 
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
         * 组外部ID。
         */
        public Builder groupExternalId(String groupExternalId) {
            this.putQueryParameter("GroupExternalId", groupExternalId);
            this.groupExternalId = groupExternalId;
            return this;
        }

        /**
         * 组ID列表，size最大限制100。
         */
        public Builder groupIds(java.util.List < String > groupIds) {
            this.putQueryParameter("GroupIds", groupIds);
            this.groupIds = groupIds;
            return this;
        }

        /**
         * 组名称，长度最大限制64。
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * 组名称，长度最大限制64。
         */
        public Builder groupNameStartsWith(String groupNameStartsWith) {
            this.putQueryParameter("GroupNameStartsWith", groupNameStartsWith);
            this.groupNameStartsWith = groupNameStartsWith;
            return this;
        }

        /**
         * IDaaS EIAM实例的ID。
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 当前查询的列表页码，默认为1。
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 当前查询的列表页码，默认为20。
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
