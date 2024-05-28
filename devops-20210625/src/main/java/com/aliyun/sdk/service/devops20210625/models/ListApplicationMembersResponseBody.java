// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationMembersResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationMembersResponseBody</p>
 */
public class ListApplicationMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("current")
    private Long current;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("pages")
    private Long pages;

    @com.aliyun.core.annotation.NameInMap("records")
    private java.util.List < Records> records;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListApplicationMembersResponseBody(Builder builder) {
        this.current = builder.current;
        this.pageSize = builder.pageSize;
        this.pages = builder.pages;
        this.records = builder.records;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationMembersResponseBody create() {
        return builder().build();
    }

    /**
     * @return current
     */
    public Long getCurrent() {
        return this.current;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pages
     */
    public Long getPages() {
        return this.pages;
    }

    /**
     * @return records
     */
    public java.util.List < Records> getRecords() {
        return this.records;
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
        private Long current; 
        private Long pageSize; 
        private Long pages; 
        private java.util.List < Records> records; 
        private String requestId; 
        private Long total; 

        /**
         * current.
         */
        public Builder current(Long current) {
            this.current = current;
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
         * pages.
         */
        public Builder pages(Long pages) {
            this.pages = pages;
            return this;
        }

        /**
         * records.
         */
        public Builder records(java.util.List < Records> records) {
            this.records = records;
            return this;
        }

        /**
         * requestId.
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

        public ListApplicationMembersResponseBody build() {
            return new ListApplicationMembersResponseBody(this);
        } 

    } 

    public static class RoleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private RoleList(Builder builder) {
            this.displayName = builder.displayName;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleList create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String displayName; 
            private String name; 

            /**
             * displayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public RoleList build() {
                return new RoleList(this);
            } 

        } 

    }
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("roleList")
        private java.util.List < RoleList> roleList;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Records(Builder builder) {
            this.avatar = builder.avatar;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.roleList = builder.roleList;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return roleList
         */
        public java.util.List < RoleList> getRoleList() {
            return this.roleList;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String avatar; 
            private String description; 
            private String displayName; 
            private String id; 
            private java.util.List < RoleList> roleList; 
            private String type; 

            /**
             * avatar.
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * roleList.
             */
            public Builder roleList(java.util.List < RoleList> roleList) {
                this.roleList = roleList;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
