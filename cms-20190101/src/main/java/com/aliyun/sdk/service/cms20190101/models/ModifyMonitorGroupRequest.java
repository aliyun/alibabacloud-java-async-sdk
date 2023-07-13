// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMonitorGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyMonitorGroupRequest</p>
 */
public class ModifyMonitorGroupRequest extends Request {
    @Query
    @NameInMap("ContactGroups")
    private String contactGroups;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("GroupName")
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
         * The alert groups that can receive alert notifications for the application group.
         */
        public Builder contactGroups(String contactGroups) {
            this.putQueryParameter("ContactGroups", contactGroups);
            this.contactGroups = contactGroups;
            return this;
        }

        /**
         * The ID of the application group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The name of the application group.
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
