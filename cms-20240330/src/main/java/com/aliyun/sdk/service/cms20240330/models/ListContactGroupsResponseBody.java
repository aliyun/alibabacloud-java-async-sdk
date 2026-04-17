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
 * {@link ListContactGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListContactGroupsResponseBody</p>
 */
public class ListContactGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contactGroups")
    private java.util.List<ContactGroups> contactGroups;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListContactGroupsResponseBody(Builder builder) {
        this.contactGroups = builder.contactGroups;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContactGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactGroups
     */
    public java.util.List<ContactGroups> getContactGroups() {
        return this.contactGroups;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<ContactGroups> contactGroups; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListContactGroupsResponseBody model) {
            this.contactGroups = model.contactGroups;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * contactGroups.
         */
        public Builder contactGroups(java.util.List<ContactGroups> contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListContactGroupsResponseBody build() {
            return new ListContactGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListContactGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListContactGroupsResponseBody</p>
     */
    public static class ContactGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contactGroupId")
        private String contactGroupId;

        @com.aliyun.core.annotation.NameInMap("contactIds")
        private java.util.List<String> contactIds;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private ContactGroups(Builder builder) {
            this.contactGroupId = builder.contactGroupId;
            this.contactIds = builder.contactIds;
            this.name = builder.name;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactGroups create() {
            return builder().build();
        }

        /**
         * @return contactGroupId
         */
        public String getContactGroupId() {
            return this.contactGroupId;
        }

        /**
         * @return contactIds
         */
        public java.util.List<String> getContactIds() {
            return this.contactIds;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String contactGroupId; 
            private java.util.List<String> contactIds; 
            private String name; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(ContactGroups model) {
                this.contactGroupId = model.contactGroupId;
                this.contactIds = model.contactIds;
                this.name = model.name;
                this.workspace = model.workspace;
            } 

            /**
             * contactGroupId.
             */
            public Builder contactGroupId(String contactGroupId) {
                this.contactGroupId = contactGroupId;
                return this;
            }

            /**
             * contactIds.
             */
            public Builder contactIds(java.util.List<String> contactIds) {
                this.contactIds = contactIds;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public ContactGroups build() {
                return new ContactGroups(this);
            } 

        } 

    }
}
