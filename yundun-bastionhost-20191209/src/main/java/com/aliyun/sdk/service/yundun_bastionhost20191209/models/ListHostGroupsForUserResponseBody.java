// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostGroupsForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListHostGroupsForUserResponseBody</p>
 */
public class ListHostGroupsForUserResponseBody extends TeaModel {
    @NameInMap("HostGroups")
    private java.util.List < HostGroups> hostGroups;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * ListHostGroupsForUser
         */
        public Builder hostGroups(java.util.List < HostGroups> hostGroups) {
            this.hostGroups = hostGroups;
            return this;
        }

        /**
         * Queries the host groups that a specified user is authorized or not authorized to manage.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * All Bastionhost API requests must include common request parameters. For more information about common request parameters, see [Common parameters](~~148139~~).
         * <p>
         * 
         * For more information about sample requests, see the "Examples" section of this topic.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHostGroupsForUserResponseBody build() {
            return new ListHostGroupsForUserResponseBody(this);
        } 

    } 

    public static class HostGroups extends TeaModel {
        @NameInMap("Comment")
        private String comment;

        @NameInMap("HostGroupId")
        private String hostGroupId;

        @NameInMap("HostGroupName")
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
             * ListHostGroupsForUser
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * WB662865
             */
            public Builder hostGroupId(String hostGroupId) {
                this.hostGroupId = hostGroupId;
                return this;
            }

            /**
             * HostGroupName.
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
