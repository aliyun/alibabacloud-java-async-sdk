// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListContactsRequest} extends {@link RequestModel}
 *
 * <p>ListContactsRequest</p>
 */
public class ListContactsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("contactIds")
    private java.util.List<String> contactIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("queryUngroupedContacts")
    private Boolean queryUngroupedContacts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private ListContactsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.contactIds = builder.contactIds;
        this.email = builder.email;
        this.groupId = builder.groupId;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.phone = builder.phone;
        this.queryUngroupedContacts = builder.queryUngroupedContacts;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContactsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return contactIds
     */
    public java.util.List<String> getContactIds() {
        return this.contactIds;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return queryUngroupedContacts
     */
    public Boolean getQueryUngroupedContacts() {
        return this.queryUngroupedContacts;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<ListContactsRequest, Builder> {
        private String regionId; 
        private java.util.List<String> contactIds; 
        private String email; 
        private String groupId; 
        private String name; 
        private Long pageNumber; 
        private Long pageSize; 
        private String phone; 
        private Boolean queryUngroupedContacts; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ListContactsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.contactIds = request.contactIds;
            this.email = request.email;
            this.groupId = request.groupId;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.phone = request.phone;
            this.queryUngroupedContacts = request.queryUngroupedContacts;
            this.workspace = request.workspace;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * contactIds.
         */
        public Builder contactIds(java.util.List<String> contactIds) {
            String contactIdsShrink = shrink(contactIds, "contactIds", "json");
            this.putQueryParameter("contactIds", contactIdsShrink);
            this.contactIds = contactIds;
            return this;
        }

        /**
         * email.
         */
        public Builder email(String email) {
            this.putQueryParameter("email", email);
            this.email = email;
            return this;
        }

        /**
         * groupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * phone.
         */
        public Builder phone(String phone) {
            this.putQueryParameter("phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * queryUngroupedContacts.
         */
        public Builder queryUngroupedContacts(Boolean queryUngroupedContacts) {
            this.putQueryParameter("queryUngroupedContacts", queryUngroupedContacts);
            this.queryUngroupedContacts = queryUngroupedContacts;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public ListContactsRequest build() {
            return new ListContactsRequest(this);
        } 

    } 

}
