// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMonitorGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateMonitorGroupRequest</p>
 */
public class CreateMonitorGroupRequest extends Request {
    @Query
    @NameInMap("ContactGroups")
    private String contactGroups;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
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
         * The ID of the request.
         */
        public Builder contactGroups(String contactGroups) {
            this.putQueryParameter("ContactGroups", contactGroups);
            this.contactGroups = contactGroups;
            return this;
        }

        /**
         * The error message.
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
