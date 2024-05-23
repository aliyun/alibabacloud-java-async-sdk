// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLdpsComputeGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLdpsComputeGroupsResponseBody</p>
 */
public class ListLdpsComputeGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupList")
    private java.util.List < GroupList> groupList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListLdpsComputeGroupsResponseBody(Builder builder) {
        this.groupList = builder.groupList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLdpsComputeGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupList
     */
    public java.util.List < GroupList> getGroupList() {
        return this.groupList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < GroupList> groupList; 
        private String requestId; 

        /**
         * GroupList.
         */
        public Builder groupList(java.util.List < GroupList> groupList) {
            this.groupList = groupList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListLdpsComputeGroupsResponseBody build() {
            return new ListLdpsComputeGroupsResponseBody(this);
        } 

    } 

    public static class GroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.Map < String, ? > properties;

        private GroupList(Builder builder) {
            this.groupName = builder.groupName;
            this.properties = builder.properties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupList create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return properties
         */
        public java.util.Map < String, ? > getProperties() {
            return this.properties;
        }

        public static final class Builder {
            private String groupName; 
            private java.util.Map < String, ? > properties; 

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(java.util.Map < String, ? > properties) {
                this.properties = properties;
                return this;
            }

            public GroupList build() {
                return new GroupList(this);
            } 

        } 

    }
}
