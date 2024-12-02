// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListHostGroupsForUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListHostGroupsForUserGroupResponseBody</p>
 */
public class ListHostGroupsForUserGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HostGroups")
    private java.util.List < HostGroups> hostGroups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListHostGroupsForUserGroupResponseBody(Builder builder) {
        this.hostGroups = builder.hostGroups;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostGroupsForUserGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostGroups
     */
    public java.util.List < HostGroups> getHostGroups() {
        return this.hostGroups;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < HostGroups> hostGroups; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The host groups returned.</p>
         */
        public Builder hostGroups(java.util.List < HostGroups> hostGroups) {
            this.hostGroups = hostGroups;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of host groups returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHostGroupsForUserGroupResponseBody build() {
            return new ListHostGroupsForUserGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHostGroupsForUserGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListHostGroupsForUserGroupResponseBody</p>
     */
    public static class HostGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("HostGroupId")
        private String hostGroupId;

        @com.aliyun.core.annotation.NameInMap("HostGroupName")
        private String hostGroupName;

        private HostGroups(Builder builder) {
            this.comment = builder.comment;
            this.hostGroupId = builder.hostGroupId;
            this.hostGroupName = builder.hostGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostGroups create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return hostGroupId
         */
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        /**
         * @return hostGroupName
         */
        public String getHostGroupName() {
            return this.hostGroupName;
        }

        public static final class Builder {
            private String comment; 
            private String hostGroupId; 
            private String hostGroupName; 

            /**
             * <p>The description of the host group.</p>
             * 
             * <strong>example:</strong>
             * <p>comment</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The ID of the host group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hostGroupId(String hostGroupId) {
                this.hostGroupId = hostGroupId;
                return this;
            }

            /**
             * <p>The name of the host group.</p>
             * 
             * <strong>example:</strong>
             * <p>group</p>
             */
            public Builder hostGroupName(String hostGroupName) {
                this.hostGroupName = hostGroupName;
                return this;
            }

            public HostGroups build() {
                return new HostGroups(this);
            } 

        } 

    }
}
