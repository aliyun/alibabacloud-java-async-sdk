// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyMonitorGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyMonitorGroupRequest</p>
 */
public class ModifyMonitorGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroups")
    private String contactGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    private ModifyMonitorGroupRequest(Builder builder) {
        super(builder);
        this.contactGroups = builder.contactGroups;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMonitorGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactGroups
     */
    public String getContactGroups() {
        return this.contactGroups;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    public static final class Builder extends Request.Builder<ModifyMonitorGroupRequest, Builder> {
        private String contactGroups; 
        private String groupId; 
        private String groupName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMonitorGroupRequest request) {
            super(request);
            this.contactGroups = request.contactGroups;
            this.groupId = request.groupId;
            this.groupName = request.groupName;
        } 

        /**
         * <p>The alert groups that can receive alert notifications for the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>alarm_ecs_group</p>
         */
        public Builder contactGroups(String contactGroups) {
            this.putQueryParameter("ContactGroups", contactGroups);
            this.contactGroups = contactGroups;
            return this;
        }

        /**
         * <p>The ID of the application group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs_group</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        @Override
        public ModifyMonitorGroupRequest build() {
            return new ModifyMonitorGroupRequest(this);
        } 

    } 

}
