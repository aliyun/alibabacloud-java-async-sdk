// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateMonitorGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateMonitorGroupRequest</p>
 */
public class CreateMonitorGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroups")
    private String contactGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    private CreateMonitorGroupRequest(Builder builder) {
        super(builder);
        this.contactGroups = builder.contactGroups;
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorGroupRequest create() {
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
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    public static final class Builder extends Request.Builder<CreateMonitorGroupRequest, Builder> {
        private String contactGroups; 
        private String groupName; 

        private Builder() {
            super();
        } 

        private Builder(CreateMonitorGroupRequest request) {
            super(request);
            this.contactGroups = request.contactGroups;
            this.groupName = request.groupName;
        } 

        /**
         * <p>The alert contact group. The alert notifications of the application group are sent to the alert contacts that belong to the alert contact group.</p>
         * <blockquote>
         * <p> An alert contact group can contain one or more alert contacts. For information about how to create alert contacts and alert contact groups, see <a href="~~PutContact~~">PutContact</a> and <a href="~~PutContactGroup~~">PutContactGroup</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ECS_Alert_Group</p>
         */
        public Builder contactGroups(String contactGroups) {
            this.putQueryParameter("ContactGroups", contactGroups);
            this.contactGroups = contactGroups;
            return this;
        }

        /**
         * <p>The name of the application group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_Group</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        @Override
        public CreateMonitorGroupRequest build() {
            return new CreateMonitorGroupRequest(this);
        } 

    } 

}
