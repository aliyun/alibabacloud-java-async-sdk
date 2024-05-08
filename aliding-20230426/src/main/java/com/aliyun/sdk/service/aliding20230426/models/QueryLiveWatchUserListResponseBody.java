// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryLiveWatchUserListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryLiveWatchUserListResponseBody</p>
 */
public class QueryLiveWatchUserListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("orgUsesList")
    private java.util.List < OrgUsesList> orgUsesList;

    @com.aliyun.core.annotation.NameInMap("outOrgUserList")
    private java.util.List < OutOrgUserList> outOrgUserList;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private QueryLiveWatchUserListResponseBody(Builder builder) {
        this.orgUsesList = builder.orgUsesList;
        this.outOrgUserList = builder.outOrgUserList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLiveWatchUserListResponseBody create() {
        return builder().build();
    }

    /**
     * @return orgUsesList
     */
    public java.util.List < OrgUsesList> getOrgUsesList() {
        return this.orgUsesList;
    }

    /**
     * @return outOrgUserList
     */
    public java.util.List < OutOrgUserList> getOutOrgUserList() {
        return this.outOrgUserList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < OrgUsesList> orgUsesList; 
        private java.util.List < OutOrgUserList> outOrgUserList; 
        private String requestId; 

        /**
         * orgUsesList.
         */
        public Builder orgUsesList(java.util.List < OrgUsesList> orgUsesList) {
            this.orgUsesList = orgUsesList;
            return this;
        }

        /**
         * outOrgUserList.
         */
        public Builder outOrgUserList(java.util.List < OutOrgUserList> outOrgUserList) {
            this.outOrgUserList = outOrgUserList;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryLiveWatchUserListResponseBody build() {
            return new QueryLiveWatchUserListResponseBody(this);
        } 

    } 

    public static class OrgUsesList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeptName")
        private String deptName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("WatchLiveTime")
        private Long watchLiveTime;

        @com.aliyun.core.annotation.NameInMap("WatchPlaybackTime")
        private Long watchPlaybackTime;

        @com.aliyun.core.annotation.NameInMap("WatchProgressMs")
        private Long watchProgressMs;

        private OrgUsesList(Builder builder) {
            this.deptName = builder.deptName;
            this.name = builder.name;
            this.userId = builder.userId;
            this.watchLiveTime = builder.watchLiveTime;
            this.watchPlaybackTime = builder.watchPlaybackTime;
            this.watchProgressMs = builder.watchProgressMs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrgUsesList create() {
            return builder().build();
        }

        /**
         * @return deptName
         */
        public String getDeptName() {
            return this.deptName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return watchLiveTime
         */
        public Long getWatchLiveTime() {
            return this.watchLiveTime;
        }

        /**
         * @return watchPlaybackTime
         */
        public Long getWatchPlaybackTime() {
            return this.watchPlaybackTime;
        }

        /**
         * @return watchProgressMs
         */
        public Long getWatchProgressMs() {
            return this.watchProgressMs;
        }

        public static final class Builder {
            private String deptName; 
            private String name; 
            private String userId; 
            private Long watchLiveTime; 
            private Long watchPlaybackTime; 
            private Long watchProgressMs; 

            /**
             * DeptName.
             */
            public Builder deptName(String deptName) {
                this.deptName = deptName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * WatchLiveTime.
             */
            public Builder watchLiveTime(Long watchLiveTime) {
                this.watchLiveTime = watchLiveTime;
                return this;
            }

            /**
             * WatchPlaybackTime.
             */
            public Builder watchPlaybackTime(Long watchPlaybackTime) {
                this.watchPlaybackTime = watchPlaybackTime;
                return this;
            }

            /**
             * WatchProgressMs.
             */
            public Builder watchProgressMs(Long watchProgressMs) {
                this.watchProgressMs = watchProgressMs;
                return this;
            }

            public OrgUsesList build() {
                return new OrgUsesList(this);
            } 

        } 

    }
    public static class OutOrgUserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("WatchLiveTime")
        private Long watchLiveTime;

        @com.aliyun.core.annotation.NameInMap("WatchPlaybackTime")
        private Long watchPlaybackTime;

        @com.aliyun.core.annotation.NameInMap("WatchProgressMs")
        private Long watchProgressMs;

        private OutOrgUserList(Builder builder) {
            this.name = builder.name;
            this.watchLiveTime = builder.watchLiveTime;
            this.watchPlaybackTime = builder.watchPlaybackTime;
            this.watchProgressMs = builder.watchProgressMs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutOrgUserList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return watchLiveTime
         */
        public Long getWatchLiveTime() {
            return this.watchLiveTime;
        }

        /**
         * @return watchPlaybackTime
         */
        public Long getWatchPlaybackTime() {
            return this.watchPlaybackTime;
        }

        /**
         * @return watchProgressMs
         */
        public Long getWatchProgressMs() {
            return this.watchProgressMs;
        }

        public static final class Builder {
            private String name; 
            private Long watchLiveTime; 
            private Long watchPlaybackTime; 
            private Long watchProgressMs; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * WatchLiveTime.
             */
            public Builder watchLiveTime(Long watchLiveTime) {
                this.watchLiveTime = watchLiveTime;
                return this;
            }

            /**
             * WatchPlaybackTime.
             */
            public Builder watchPlaybackTime(Long watchPlaybackTime) {
                this.watchPlaybackTime = watchPlaybackTime;
                return this;
            }

            /**
             * WatchProgressMs.
             */
            public Builder watchProgressMs(Long watchProgressMs) {
                this.watchProgressMs = watchProgressMs;
                return this;
            }

            public OutOrgUserList build() {
                return new OutOrgUserList(this);
            } 

        } 

    }
}
