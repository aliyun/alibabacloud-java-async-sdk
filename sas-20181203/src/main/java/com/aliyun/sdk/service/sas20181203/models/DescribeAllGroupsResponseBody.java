// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAllGroupsResponseBody</p>
 */
public class DescribeAllGroupsResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("Groups")
    private java.util.List < Groups> groups;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAllGroupsResponseBody(Builder builder) {
        this.count = builder.count;
        this.groups = builder.groups;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAllGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
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

    public static final class Builder {
        private Integer count; 
        private java.util.List < Groups> groups; 
        private String requestId; 

        /**
         * The total number of server groups.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * An array that consists of the information about server groups.
         */
        public Builder groups(java.util.List < Groups> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAllGroupsResponseBody build() {
            return new DescribeAllGroupsResponseBody(this);
        } 

    } 

    public static class Groups extends TeaModel {
        @NameInMap("GroupFlag")
        private Integer groupFlag;

        @NameInMap("GroupId")
        private Integer groupId;

        @NameInMap("GroupName")
        private String groupName;

        private Groups(Builder builder) {
            this.groupFlag = builder.groupFlag;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return groupFlag
         */
        public Integer getGroupFlag() {
            return this.groupFlag;
        }

        /**
         * @return groupId
         */
        public Integer getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        public static final class Builder {
            private Integer groupFlag; 
            private Integer groupId; 
            private String groupName; 

            /**
             * The type of the server group. Valid values:
             * <p>
             * 
             * *   **0**: the default group
             * *   **1**: other groups
             */
            public Builder groupFlag(Integer groupFlag) {
                this.groupFlag = groupFlag;
                return this;
            }

            /**
             * The ID of the server group.
             */
            public Builder groupId(Integer groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the server group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
}
