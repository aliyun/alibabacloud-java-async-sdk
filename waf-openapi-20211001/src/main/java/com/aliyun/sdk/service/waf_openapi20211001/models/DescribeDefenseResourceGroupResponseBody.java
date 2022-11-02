// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefenseResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseResourceGroupResponseBody</p>
 */
public class DescribeDefenseResourceGroupResponseBody extends TeaModel {
    @NameInMap("Group")
    private Group group;

    @NameInMap("RequestId")
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
         * Group.
         */
        public Builder group(Group group) {
            this.group = group;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("ResourceList")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * ResourceList.
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
