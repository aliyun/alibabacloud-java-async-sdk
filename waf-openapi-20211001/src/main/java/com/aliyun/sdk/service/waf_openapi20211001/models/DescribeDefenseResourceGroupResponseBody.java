// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefenseResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseResourceGroupResponseBody</p>
 */
public class DescribeDefenseResourceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Group")
    private Group group;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDefenseResourceGroupResponseBody(Builder builder) {
        this.group = builder.group;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseResourceGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return group
     */
    public Group getGroup() {
        return this.group;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Group group; 
        private String requestId; 

        /**
         * The information about the protected object group.
         */
        public Builder group(Group group) {
            this.group = group;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDefenseResourceGroupResponseBody build() {
            return new DescribeDefenseResourceGroupResponseBody(this);
        } 

    } 

    public static class Group extends TeaModel {
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

        private Group(Builder builder) {
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.groupName = builder.groupName;
            this.resourceList = builder.resourceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Group create() {
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
             * The time when the protected object group was created.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The most recent time when the protected object group was modified.
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
             * The protected objects in the protected object group. The protected objects are separated with commas (,).
             */
            public Builder resourceList(String resourceList) {
                this.resourceList = resourceList;
                return this;
            }

            public Group build() {
                return new Group(this);
            } 

        } 

    }
}
