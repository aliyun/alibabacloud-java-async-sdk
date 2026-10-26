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
 * {@link AttachHostGroupAccountsToUserGroupRequest} extends {@link RequestModel}
 *
 * <p>AttachHostGroupAccountsToUserGroupRequest</p>
 */
public class AttachHostGroupAccountsToUserGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostGroups")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hostGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupId;

    private AttachHostGroupAccountsToUserGroupRequest(Builder builder) {
        super(builder);
        this.hostGroups = builder.hostGroups;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachHostGroupAccountsToUserGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostGroups
     */
    public String getHostGroups() {
        return this.hostGroups;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<AttachHostGroupAccountsToUserGroupRequest, Builder> {
        private String hostGroups; 
        private String instanceId; 
        private String regionId; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AttachHostGroupAccountsToUserGroupRequest request) {
            super(request);
            this.hostGroups = request.hostGroups;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * <p>The IDs of the host groups and the names of the host accounts to which you want to grant the user group access. You can specify up to 10 host group IDs and up to 10 host account names for each host group. If you do not specify host account names, the user group is granted access only to the host groups. For more information about the structure of this parameter, see the HostGroups parameter structure description in the Request parameters section.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/201307.html">ListHostGroups</a> operation to query host group IDs and call the <a href="https://help.aliyun.com/document_detail/204372.html">ListHostAccounts</a> operation to query host account names.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[ {&quot;HostGroupId&quot;:&quot;1&quot;}, {&quot;HostGroupId&quot;:&quot;2&quot;,&quot;HostAccountNames&quot;:[&quot;root&quot;,&quot;111&quot;,&quot;abc&quot;]}, {&quot;HostGroupId&quot;:&quot;3&quot;,&quot;HostAccountNames&quot;:[&quot;root&quot;,&quot;111&quot;,&quot;abc&quot;]}, {&quot;HostGroupId&quot;:&quot;4&quot;,&quot;HostAccountNames&quot;:[&quot;root&quot;,&quot;111&quot;,&quot;abc&quot;]}]</p>
         */
        public Builder hostGroups(String hostGroups) {
            this.putQueryParameter("HostGroups", hostGroups);
            this.hostGroups = hostGroups;
            return this;
        }

        /**
         * <p>The ID of the Bastionhost instance where the user group resides. The user group is to be authorized to access host groups and host accounts.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain the value of this parameter.</p>
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
         * <p>Specifies the region ID of the Bastionhost instance that manages the user group to which you want to grant permissions on host groups and host accounts.</p>
         * <blockquote>
         * <p>For the mappings between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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
         * <p>The ID of the user group to which you want to grant permissions on host groups and host accounts.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/204509.html">ListUserGroups</a> operation to query the user group ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public AttachHostGroupAccountsToUserGroupRequest build() {
            return new AttachHostGroupAccountsToUserGroupRequest(this);
        } 

    } 

}
