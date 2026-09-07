// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link QueryEndUserHistoryUsageResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEndUserHistoryUsageResponseBody</p>
 */
public class QueryEndUserHistoryUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("UserUsageInfoList")
    private java.util.List<UserUsageInfoList> userUsageInfoList;

    private QueryEndUserHistoryUsageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.userUsageInfoList = builder.userUsageInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEndUserHistoryUsageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return userUsageInfoList
     */
    public java.util.List<UserUsageInfoList> getUserUsageInfoList() {
        return this.userUsageInfoList;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalCount; 
        private java.util.List<UserUsageInfoList> userUsageInfoList; 

        private Builder() {
        } 

        private Builder(QueryEndUserHistoryUsageResponseBody model) {
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.userUsageInfoList = model.userUsageInfoList;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>269BDB16-2CD8-4865-84BD-11C40BC21DB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of users that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of user usage duration entries on the current page.</p>
         */
        public Builder userUsageInfoList(java.util.List<UserUsageInfoList> userUsageInfoList) {
            this.userUsageInfoList = userUsageInfoList;
            return this;
        }

        public QueryEndUserHistoryUsageResponseBody build() {
            return new QueryEndUserHistoryUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryEndUserHistoryUsageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEndUserHistoryUsageResponseBody</p>
     */
    public static class DesktopUsageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        private DesktopUsageList(Builder builder) {
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.duration = builder.duration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopUsageList create() {
            return builder().build();
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        public static final class Builder {
            private String desktopId; 
            private String desktopName; 
            private Long duration; 

            private Builder() {
            } 

            private Builder(DesktopUsageList model) {
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
                this.duration = model.duration;
            } 

            /**
             * <p>The desktop ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-abc123</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The desktop name.</p>
             * 
             * <strong>example:</strong>
             * <p>DemoDesktop</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The usage duration of the user on the desktop, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1800</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            public DesktopUsageList build() {
                return new DesktopUsageList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryEndUserHistoryUsageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEndUserHistoryUsageResponseBody</p>
     */
    public static class UserGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserGroupId")
        private String userGroupId;

        @com.aliyun.core.annotation.NameInMap("UserGroupName")
        private String userGroupName;

        private UserGroupList(Builder builder) {
            this.userGroupId = builder.userGroupId;
            this.userGroupName = builder.userGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserGroupList create() {
            return builder().build();
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        /**
         * @return userGroupName
         */
        public String getUserGroupName() {
            return this.userGroupName;
        }

        public static final class Builder {
            private String userGroupId; 
            private String userGroupName; 

            private Builder() {
            } 

            private Builder(UserGroupList model) {
                this.userGroupId = model.userGroupId;
                this.userGroupName = model.userGroupName;
            } 

            /**
             * <p>The user group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ug-12345678</p>
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            /**
             * <p>The user group name.</p>
             * 
             * <strong>example:</strong>
             * <p>Default user group</p>
             */
            public Builder userGroupName(String userGroupName) {
                this.userGroupName = userGroupName;
                return this;
            }

            public UserGroupList build() {
                return new UserGroupList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryEndUserHistoryUsageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEndUserHistoryUsageResponseBody</p>
     */
    public static class UserUsageInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DesktopUsageList")
        private java.util.List<DesktopUsageList> desktopUsageList;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("EndUserName")
        private String endUserName;

        @com.aliyun.core.annotation.NameInMap("OrgPathList")
        private java.util.List<String> orgPathList;

        @com.aliyun.core.annotation.NameInMap("UserGroupList")
        private java.util.List<UserGroupList> userGroupList;

        private UserUsageInfoList(Builder builder) {
            this.description = builder.description;
            this.desktopUsageList = builder.desktopUsageList;
            this.displayName = builder.displayName;
            this.duration = builder.duration;
            this.endUserId = builder.endUserId;
            this.endUserName = builder.endUserName;
            this.orgPathList = builder.orgPathList;
            this.userGroupList = builder.userGroupList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserUsageInfoList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return desktopUsageList
         */
        public java.util.List<DesktopUsageList> getDesktopUsageList() {
            return this.desktopUsageList;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return endUserName
         */
        public String getEndUserName() {
            return this.endUserName;
        }

        /**
         * @return orgPathList
         */
        public java.util.List<String> getOrgPathList() {
            return this.orgPathList;
        }

        /**
         * @return userGroupList
         */
        public java.util.List<UserGroupList> getUserGroupList() {
            return this.userGroupList;
        }

        public static final class Builder {
            private String description; 
            private java.util.List<DesktopUsageList> desktopUsageList; 
            private String displayName; 
            private Long duration; 
            private String endUserId; 
            private String endUserName; 
            private java.util.List<String> orgPathList; 
            private java.util.List<UserGroupList> userGroupList; 

            private Builder() {
            } 

            private Builder(UserUsageInfoList model) {
                this.description = model.description;
                this.desktopUsageList = model.desktopUsageList;
                this.displayName = model.displayName;
                this.duration = model.duration;
                this.endUserId = model.endUserId;
                this.endUserName = model.endUserName;
                this.orgPathList = model.orgPathList;
                this.userGroupList = model.userGroupList;
            } 

            /**
             * <p>The remarks of the user. This parameter has a value only for convenience account users.</p>
             * 
             * <strong>example:</strong>
             * <p>Test user</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of usage duration details for each desktop.</p>
             */
            public Builder desktopUsageList(java.util.List<DesktopUsageList> desktopUsageList) {
                this.desktopUsageList = desktopUsageList;
                return this;
            }

            /**
             * <p>The display name of the user. For convenience account users, this is the actual nickname. For AD users, this is the display name.</p>
             * 
             * <strong>example:</strong>
             * <p>John Smith</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The total usage duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The end user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>user01</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The username. For convenience account users, this is the nickname. For AD users, this is the UserPrincipalName.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
             */
            public Builder endUserName(String endUserName) {
                this.endUserName = endUserName;
                return this;
            }

            /**
             * <p>The list of organization paths. For convenience account users, this contains multiple organization paths. For AD users, this is the organizational unit (OU) path.</p>
             */
            public Builder orgPathList(java.util.List<String> orgPathList) {
                this.orgPathList = orgPathList;
                return this;
            }

            /**
             * <p>The list of user groups. This parameter has a value only for convenience account users.</p>
             */
            public Builder userGroupList(java.util.List<UserGroupList> userGroupList) {
                this.userGroupList = userGroupList;
                return this;
            }

            public UserUsageInfoList build() {
                return new UserUsageInfoList(this);
            } 

        } 

    }
}
