// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefenseResourceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseResourceGroupsResponseBody</p>
 */
public class DescribeDefenseResourceGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Groups")
    private java.util.List < Groups> groups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDefenseResourceGroupsResponseBody(Builder builder) {
        this.groups = builder.groups;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseResourceGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return groups
     */
    public java.util.List < Groups> getGroups() {
        return this.groups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Groups> groups; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The list of protected object groups.
         */
        public Builder groups(java.util.List < Groups> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDefenseResourceGroupsResponseBody build() {
            return new DescribeDefenseResourceGroupsResponseBody(this);
        } 

    } 

    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ResourceList")
        private String resourceList;

        private Groups(Builder builder) {
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.groupName = builder.groupName;
            this.resourceList = builder.resourceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return resourceList
         */
        public String getResourceList() {
            return this.resourceList;
        }

        public static final class Builder {
            private String description; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String groupName; 
            private String resourceList; 

            /**
             * The description of the protected object group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the protected object group was created. Unit: milliseconds.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The most recent time when the protected object group was modified. Unit: milliseconds.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The name of the protected object group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The names of the protected objects that are added to the protected object group. Separate multiple protected objects with commas (,).
             */
            public Builder resourceList(String resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
}
