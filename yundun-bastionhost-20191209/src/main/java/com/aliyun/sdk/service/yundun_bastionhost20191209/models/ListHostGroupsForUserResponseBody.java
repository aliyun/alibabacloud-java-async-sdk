// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ListHostGroupsForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListHostGroupsForUserResponseBody</p>
 */
public class ListHostGroupsForUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HostGroups")
    private java.util.List<HostGroups> hostGroups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListHostGroupsForUserResponseBody(Builder builder) {
        this.hostGroups = builder.hostGroups;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostGroupsForUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostGroups
     */
    public java.util.List<HostGroups> getHostGroups() {
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
        private java.util.List<HostGroups> hostGroups; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListHostGroupsForUserResponseBody model) {
            this.hostGroups = model.hostGroups;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The host groups returned.</p>
         */
        public Builder hostGroups(java.util.List<HostGroups> hostGroups) {
            this.hostGroups = hostGroups;
            return this;
        }

        /**
         * <p>The request ID.</p>
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

        public ListHostGroupsForUserResponseBody build() {
            return new ListHostGroupsForUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHostGroupsForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListHostGroupsForUserResponseBody</p>
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

            private Builder() {
            } 

            private Builder(HostGroups model) {
                this.comment = model.comment;
                this.hostGroupId = model.hostGroupId;
                this.hostGroupName = model.hostGroupName;
            } 

            /**
             * <p>The remarks of the host group.</p>
             * 
             * <strong>example:</strong>
             * <p>comment</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The host group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>１</p>
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
