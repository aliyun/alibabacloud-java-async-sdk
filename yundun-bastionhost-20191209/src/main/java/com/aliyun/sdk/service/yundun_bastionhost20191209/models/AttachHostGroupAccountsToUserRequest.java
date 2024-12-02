// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AttachHostGroupAccountsToUserRequest} extends {@link RequestModel}
 *
 * <p>AttachHostGroupAccountsToUserRequest</p>
 */
public class AttachHostGroupAccountsToUserRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private AttachHostGroupAccountsToUserRequest(Builder builder) {
        super(builder);
        this.hostGroups = builder.hostGroups;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachHostGroupAccountsToUserRequest create() {
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<AttachHostGroupAccountsToUserRequest, Builder> {
        private String hostGroups; 
        private String instanceId; 
        private String regionId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(AttachHostGroupAccountsToUserRequest request) {
            super(request);
            this.hostGroups = request.hostGroups;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.userId = request.userId;
        } 

        /**
         * <p>The ID of the host group and the name of the host account that you want to authorize the user to manage. You can specify up to 10 host group IDs and up to 10 host account names for each host group. You can specify only host group IDs. In this case, the user is authorized to manage only the specified host groups. For more information about this parameter, see the &quot;Description of the HostGroups parameter&quot; section of this topic.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/201307.html">ListHostGroups</a> operation to query the ID of the host group and the <a href="https://help.aliyun.com/document_detail/204372.html">ListHostAccounts</a> operation to query the name of the host account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[ {&quot;HostGroupId&quot;:&quot;1&quot;}, {&quot;HostGroupId&quot;:&quot;2&quot;,&quot;HostAccountNames&quot;:[&quot;root&quot;,&quot;111&quot;,&quot;abc&quot;]}, {&quot;HostGroupId&quot;:&quot;3&quot;,&quot;HostAccountNames&quot;:[&quot;root&quot;,&quot;111&quot;,&quot;abc&quot;]}, {&quot;HostGroupId&quot;:&quot;4&quot;,&quot;HostAccountNames&quot;:[&quot;root&quot;,&quot;111&quot;,&quot;abc&quot;]} ]</p>
         */
        public Builder hostGroups(String hostGroups) {
            this.putQueryParameter("HostGroups", hostGroups);
            this.hostGroups = hostGroups;
            return this;
        }

        /**
         * <p>The ID of the bastion host for which you want to authorize the user to manage the host groups and host accounts.</p>
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
         * <p>The region ID of the bastion host for which you want to authorize the user to manage the host groups and host accounts.</p>
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
         * <p>The ID of the user that you want to authorize to manage the host groups and host accounts.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/204522.html">ListUsers</a> operation to query the ID of the user.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public AttachHostGroupAccountsToUserRequest build() {
            return new AttachHostGroupAccountsToUserRequest(this);
        } 

    } 

}
