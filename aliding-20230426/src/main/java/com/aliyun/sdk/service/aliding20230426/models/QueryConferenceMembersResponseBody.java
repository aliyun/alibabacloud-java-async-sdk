// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryConferenceMembersResponseBody} extends {@link TeaModel}
 *
 * <p>QueryConferenceMembersResponseBody</p>
 */
public class QueryConferenceMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("memberModels")
    private java.util.List < MemberModels> memberModels;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private QueryConferenceMembersResponseBody(Builder builder) {
        this.memberModels = builder.memberModels;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryConferenceMembersResponseBody create() {
        return builder().build();
    }

    /**
     * @return memberModels
     */
    public java.util.List < MemberModels> getMemberModels() {
        return this.memberModels;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List < MemberModels> memberModels; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * memberModels.
         */
        public Builder memberModels(java.util.List < MemberModels> memberModels) {
            this.memberModels = memberModels;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryConferenceMembersResponseBody build() {
            return new QueryConferenceMembersResponseBody(this);
        } 

    } 

    public static class MemberModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttendStatus")
        private Integer attendStatus;

        @com.aliyun.core.annotation.NameInMap("CoHost")
        private Boolean coHost;

        @com.aliyun.core.annotation.NameInMap("ConferenceId")
        private String conferenceId;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Host")
        private Boolean host;

        @com.aliyun.core.annotation.NameInMap("JoinTime")
        private Long joinTime;

        @com.aliyun.core.annotation.NameInMap("LeaveTime")
        private Long leaveTime;

        @com.aliyun.core.annotation.NameInMap("OuterOrgMember")
        private Boolean outerOrgMember;

        @com.aliyun.core.annotation.NameInMap("PstnJoin")
        private Boolean pstnJoin;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserNick")
        private String userNick;

        private MemberModels(Builder builder) {
            this.attendStatus = builder.attendStatus;
            this.coHost = builder.coHost;
            this.conferenceId = builder.conferenceId;
            this.duration = builder.duration;
            this.host = builder.host;
            this.joinTime = builder.joinTime;
            this.leaveTime = builder.leaveTime;
            this.outerOrgMember = builder.outerOrgMember;
            this.pstnJoin = builder.pstnJoin;
            this.userId = builder.userId;
            this.userNick = builder.userNick;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemberModels create() {
            return builder().build();
        }

        /**
         * @return attendStatus
         */
        public Integer getAttendStatus() {
            return this.attendStatus;
        }

        /**
         * @return coHost
         */
        public Boolean getCoHost() {
            return this.coHost;
        }

        /**
         * @return conferenceId
         */
        public String getConferenceId() {
            return this.conferenceId;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return host
         */
        public Boolean getHost() {
            return this.host;
        }

        /**
         * @return joinTime
         */
        public Long getJoinTime() {
            return this.joinTime;
        }

        /**
         * @return leaveTime
         */
        public Long getLeaveTime() {
            return this.leaveTime;
        }

        /**
         * @return outerOrgMember
         */
        public Boolean getOuterOrgMember() {
            return this.outerOrgMember;
        }

        /**
         * @return pstnJoin
         */
        public Boolean getPstnJoin() {
            return this.pstnJoin;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userNick
         */
        public String getUserNick() {
            return this.userNick;
        }

        public static final class Builder {
            private Integer attendStatus; 
            private Boolean coHost; 
            private String conferenceId; 
            private Long duration; 
            private Boolean host; 
            private Long joinTime; 
            private Long leaveTime; 
            private Boolean outerOrgMember; 
            private Boolean pstnJoin; 
            private String userId; 
            private String userNick; 

            /**
             * AttendStatus.
             */
            public Builder attendStatus(Integer attendStatus) {
                this.attendStatus = attendStatus;
                return this;
            }

            /**
             * CoHost.
             */
            public Builder coHost(Boolean coHost) {
                this.coHost = coHost;
                return this;
            }

            /**
             * ConferenceId.
             */
            public Builder conferenceId(String conferenceId) {
                this.conferenceId = conferenceId;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(Boolean host) {
                this.host = host;
                return this;
            }

            /**
             * JoinTime.
             */
            public Builder joinTime(Long joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * LeaveTime.
             */
            public Builder leaveTime(Long leaveTime) {
                this.leaveTime = leaveTime;
                return this;
            }

            /**
             * OuterOrgMember.
             */
            public Builder outerOrgMember(Boolean outerOrgMember) {
                this.outerOrgMember = outerOrgMember;
                return this;
            }

            /**
             * PstnJoin.
             */
            public Builder pstnJoin(Boolean pstnJoin) {
                this.pstnJoin = pstnJoin;
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
             * UserNick.
             */
            public Builder userNick(String userNick) {
                this.userNick = userNick;
                return this;
            }

            public MemberModels build() {
                return new MemberModels(this);
            } 

        } 

    }
}
