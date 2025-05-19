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
 * {@link GetMyGroupsRequest} extends {@link RequestModel}
 *
 * <p>GetMyGroupsRequest</p>
 */
public class GetMyGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindUrl")
    private String bindUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectContactGroups")
    private Boolean selectContactGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GetMyGroupsRequest(Builder builder) {
        super(builder);
        this.bindUrl = builder.bindUrl;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.instanceId = builder.instanceId;
        this.selectContactGroups = builder.selectContactGroups;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMyGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindUrl
     */
    public String getBindUrl() {
        return this.bindUrl;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
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

    public static final class Builder extends Request.Builder<GetMyGroupsRequest, Builder> {
        private String bindUrl; 
        private Long groupId; 
        private String groupName; 
        private String instanceId; 
        private Boolean selectContactGroups; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetMyGroupsRequest request) {
            super(request);
            this.bindUrl = request.bindUrl;
            this.groupId = request.groupId;
            this.groupName = request.groupName;
            this.instanceId = request.instanceId;
            this.selectContactGroups = request.selectContactGroups;
            this.type = request.type;
        } 

        /**
         * BindUrl.
         */
        public Builder bindUrl(String bindUrl) {
            this.putQueryParameter("BindUrl", bindUrl);
            this.bindUrl = bindUrl;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
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
        public GetMyGroupsRequest build() {
            return new GetMyGroupsRequest(this);
        } 

    } 

}
