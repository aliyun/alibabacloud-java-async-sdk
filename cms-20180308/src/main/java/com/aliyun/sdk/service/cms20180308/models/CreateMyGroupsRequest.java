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
 * {@link CreateMyGroupsRequest} extends {@link RequestModel}
 *
 * <p>CreateMyGroupsRequest</p>
 */
public class CreateMyGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindUrl")
    private String bindUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroups")
    private String contactGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private Long serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CreateMyGroupsRequest(Builder builder) {
        super(builder);
        this.bindUrl = builder.bindUrl;
        this.contactGroups = builder.contactGroups;
        this.groupName = builder.groupName;
        this.options = builder.options;
        this.serviceId = builder.serviceId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMyGroupsRequest create() {
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

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateMyGroupsRequest, Builder> {
        private String bindUrl; 
        private String contactGroups; 
        private String groupName; 
        private String options; 
        private Long serviceId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateMyGroupsRequest request) {
            super(request);
            this.bindUrl = request.bindUrl;
            this.contactGroups = request.contactGroups;
            this.groupName = request.groupName;
            this.options = request.options;
            this.serviceId = request.serviceId;
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
         * ContactGroups.
         */
        public Builder contactGroups(String contactGroups) {
            this.putQueryParameter("ContactGroups", contactGroups);
            this.contactGroups = contactGroups;
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
         * Options.
         */
        public Builder options(String options) {
            this.putQueryParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(Long serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
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
        public CreateMyGroupsRequest build() {
            return new CreateMyGroupsRequest(this);
        } 

    } 

}
