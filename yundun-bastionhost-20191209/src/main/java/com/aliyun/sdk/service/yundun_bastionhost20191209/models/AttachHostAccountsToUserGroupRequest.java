// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AttachHostAccountsToUserGroupRequest} extends {@link RequestModel}
 *
 * <p>AttachHostAccountsToUserGroupRequest</p>
 */
public class AttachHostAccountsToUserGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hosts")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hosts;

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

    private AttachHostAccountsToUserGroupRequest(Builder builder) {
        super(builder);
        this.hosts = builder.hosts;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachHostAccountsToUserGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hosts
     */
    public String getHosts() {
        return this.hosts;
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

    public static final class Builder extends Request.Builder<AttachHostAccountsToUserGroupRequest, Builder> {
        private String hosts; 
        private String instanceId; 
        private String regionId; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AttachHostAccountsToUserGroupRequest request) {
            super(request);
            this.hosts = request.hosts;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * <p>The IDs of the host and host account that you want to authorize the user group to manage. You can specify up to 10 host IDs and up to 10 host account IDs for each host. You can specify only host IDs. In this case, the user group is authorized to manage only the specified hosts. For more information about this parameter, see the &quot;Description of the Hosts parameter&quot; section of this topic.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/200665.html">ListHosts</a> operation to query the ID of the host and the <a href="https://help.aliyun.com/document_detail/204372.html">ListHostAccounts</a> operation to query the ID of the host account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[ {&quot;HostId&quot;:&quot;1&quot;}, {&quot;HostId&quot;:&quot;2&quot;,&quot;HostAccountIds&quot;:[&quot;1&quot;,&quot;2&quot;,&quot;3&quot;,...]}, {&quot;HostId&quot;:&quot;3&quot;,&quot;HostAccountIds&quot;:[&quot;4&quot;,&quot;5&quot;,&quot;6&quot;,...]}, {&quot;HostId&quot;:&quot;4&quot;,&quot;HostAccountIds&quot;:[&quot;9&quot;,&quot;8&quot;,&quot;7&quot;,...]} ... ]</p>
         */
        public Builder hosts(String hosts) {
            this.putQueryParameter("Hosts", hosts);
            this.hosts = hosts;
            return this;
        }

        /**
         * <p>The ID of the bastion host in which you want to authorize the user group to manage the specified hosts and host accounts.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
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
         * <p>The region ID of the bastion host in which you want to authorize the user group to manage the specified hosts and host accounts.</p>
         * <blockquote>
         * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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
         * <p>The ID of the user group that you want to authorize to manage the specified hosts and host accounts.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/204509.html">ListUserGroups</a> operation to query the ID of the user group.</p>
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
        public AttachHostAccountsToUserGroupRequest build() {
            return new AttachHostAccountsToUserGroupRequest(this);
        } 

    } 

}
