// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceUserId")
    private String sourceUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    private String userGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserState")
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
         * <p>The display name of the user that you want to query. Only exact match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>testuser</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The instance ID of the bastion host for which you want to query the user list.</p>
         * <blockquote>
         * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The mobile phone number of the user that you want to query. Only exact match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1359999****</p>
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>The page number of the current page in a paging query. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The maximum number of entries per page in a paging query.<br>The maximum value of the PageSize parameter is 100. The default number of entries per page is 20. If PageSize is left empty, 20 entries are returned by default.</p>
         * <blockquote>
         * <p>Do not leave PageSize empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the bastion host for which you want to query the user list.</p>
         * <blockquote>
         * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The source of the user that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>Local</strong>: local user</li>
         * <li><strong>Ram</strong>: Resource Access Management (RAM) user</li>
         * <li><strong>AD</strong>: AD user</li>
         * <li><strong>LDAP</strong>: LDAP user</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Local</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The unique identity of the user that you want to query. Only exact match is supported.</p>
         * <blockquote>
         * <p>This parameter is the unique identity of the Resource Access Management (RAM) user that corresponds to the bastion host user. This parameter takes effect when the source of the newly created user is a RAM user (that is, <strong>Source</strong> is set to <strong>Ram</strong>). You can invoke the <a href="https://help.aliyun.com/document_detail/28684.html">ListUsers</a> operation of access control and obtain this parameter from the <strong>UserId</strong> field in the response.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>122748924538****</p>
         */
        public Builder sourceUserId(String sourceUserId) {
            this.putQueryParameter("SourceUserId", sourceUserId);
            this.sourceUserId = sourceUserId;
            return this;
        }

        /**
         * <p>The ID of the user group that you want to query.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/204509.html">ListUserGroups</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        /**
         * <p>The logon name of the user that you want to query. Only exact match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>The status of the user that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: normal</li>
         * <li><strong>Frozen</strong>: locked</li>
         * <li><strong>Expired</strong>: expired</li>
         * <li><strong>RemoteDeleted</strong>: user source deleted</li>
         * <li><strong>Inactive</strong>: inactive due to prolonged absence of logon</li>
         * <li><strong>PasswordExpired</strong>: password expired</li>
         * <li><strong>RemoteDNChanged</strong>: user DN updated</li>
         * <li><strong>RemoteFrozen</strong>: frozen on the RAM side</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
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
