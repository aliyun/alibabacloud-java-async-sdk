// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDefenseResourceGroupResponseBody model) {
            this.group = model.group;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the protected object group.</p>
         */
        public Builder group(Group group) {
            this.group = group;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E67D21C6-5376-5F94-B745-70E08D03E3CB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDefenseResourceGroupResponseBody build() {
            return new DescribeDefenseResourceGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDefenseResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDefenseResourceGroupResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Group model) {
                this.description = model.description;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.groupName = model.groupName;
                this.resourceList = model.resourceList;
            } 

            /**
             * <p>The description of the protected object group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the protected object group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>23242312312</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The most recent time when the protected object group was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>23242312312</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The name of the protected object group.</p>
             * 
             * <strong>example:</strong>
             * <p>group1</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The protected objects in the protected object group. The protected objects are separated with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>test1.aliyundoc.com,test2.aliyundoc.com</p>
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
