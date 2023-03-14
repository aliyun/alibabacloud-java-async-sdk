// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsersRequest} extends {@link RequestModel}
 *
 * <p>ListUsersRequest</p>
 */
public class ListUsersRequest extends Request {
    @Query
    @NameInMap("DisplayName")
    private String displayName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Mobile")
    private String mobile;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("SourceUserId")
    private String sourceUserId;

    @Query
    @NameInMap("UserGroupId")
    private String userGroupId;

    @Query
    @NameInMap("UserName")
    private String userName;

    @Query
    @NameInMap("UserState")
    private String userState;

    private ListUsersRequest(Builder builder) {
        super(builder);
        this.displayName = builder.displayName;
        this.instanceId = builder.instanceId;
        this.mobile = builder.mobile;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.source = builder.source;
        this.sourceUserId = builder.sourceUserId;
        this.userGroupId = builder.userGroupId;
        this.userName = builder.userName;
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
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourceUserId
     */
    public String getSourceUserId() {
        return this.sourceUserId;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return userState
     */
    public String getUserState() {
        return this.userState;
    }

    public static final class Builder extends Request.Builder<ListUsersRequest, Builder> {
        private String displayName; 
        private String instanceId; 
        private String mobile; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 
        private String source; 
        private String sourceUserId; 
        private String userGroupId; 
        private String userName; 
        private String userState; 

        private Builder() {
            super();
        } 

        private Builder(ListUsersRequest request) {
            super(request);
            this.displayName = request.displayName;
            this.instanceId = request.instanceId;
            this.mobile = request.mobile;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.source = request.source;
            this.sourceUserId = request.sourceUserId;
            this.userGroupId = request.userGroupId;
            this.userName = request.userName;
            this.userState = request.userState;
        } 

        /**
         * The display name of the user to be queried. Only exact match is supported.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * The ID of the Bastionhost instance to which the users to be queried belong.
         * <p>
         * 
         * >  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the Bastionhost instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The mobile number of the user to be queried. Only exact match is supported.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * The value of the PageSize parameter must not exceed 100. By default, the number of entries on each page is 20. If you do not set the PageSize parameter, 20 entries are returned per page by default.
         * 
         * >  We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the Bastionhost instance to which the users to be queried belong.
         * <p>
         * 
         * >  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The source of the user to be queried. Valid values:
         * <p>
         * 
         * *   **Local**: a local user
         * *   **Ram**: a RAM user
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The unique ID of the user to be queried. Only exact match is supported.
         * <p>
         * 
         * >  This parameter uniquely identifies a RAM user of the Bastionhost instance. This parameter takes effect only when the **Source** parameter is set to **Ram**. You can call the [ListUsers](~~28684~~) operation to obtain the unique ID of the user from the **UserId** response parameter.
         */
        public Builder sourceUserId(String sourceUserId) {
            this.putQueryParameter("SourceUserId", sourceUserId);
            this.sourceUserId = sourceUserId;
            return this;
        }

        /**
         * The ID of the user group to be queried.
         * <p>
         * 
         * >  You can call the [ListUserGroups](~~204509~~) operation to query the ID of the user group.
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        /**
         * The logon name of the user to be queried. Only exact match is supported.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * The status of the user to be queried. Valid values:
         * <p>
         * 
         * *   **Normal**: The user can access the Bastionhost instance.
         * *   **Frozen**: The user is locked and cannot access the Bastionhost instance.
         * *   **Expired**: The user has expired and cannot access the Bastionhost instance.
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
