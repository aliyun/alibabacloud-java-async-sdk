// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetDingtalkMeetingMemberListResponseBody} extends {@link TeaModel}
 *
 * <p>GetDingtalkMeetingMemberListResponseBody</p>
 */
public class GetDingtalkMeetingMemberListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetDingtalkMeetingMemberListResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDingtalkMeetingMemberListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Data> data; 
        private String requestId; 
        private Integer totalCount; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(GetDingtalkMeetingMemberListResponseBody model) {
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * currentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
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

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetDingtalkMeetingMemberListResponseBody build() {
            return new GetDingtalkMeetingMemberListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDingtalkMeetingMemberListResponseBody} extends {@link TeaModel}
     *
     * <p>GetDingtalkMeetingMemberListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("channelName")
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("conferenceId")
        private String conferenceId;

        @com.aliyun.core.annotation.NameInMap("deviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("joinTime")
        private Long joinTime;

        @com.aliyun.core.annotation.NameInMap("leaveTime")
        private Long leaveTime;

        @com.aliyun.core.annotation.NameInMap("networkQuality")
        private String networkQuality;

        @com.aliyun.core.annotation.NameInMap("nick")
        private String nick;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("unionId")
        private String unionId;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("workNo")
        private String workNo;

        private Data(Builder builder) {
            this.channelName = builder.channelName;
            this.conferenceId = builder.conferenceId;
            this.deviceType = builder.deviceType;
            this.duration = builder.duration;
            this.joinTime = builder.joinTime;
            this.leaveTime = builder.leaveTime;
            this.networkQuality = builder.networkQuality;
            this.nick = builder.nick;
            this.role = builder.role;
            this.sessionId = builder.sessionId;
            this.status = builder.status;
            this.unionId = builder.unionId;
            this.version = builder.version;
            this.workNo = builder.workNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
        }

        /**
         * @return conferenceId
         */
        public String getConferenceId() {
            return this.conferenceId;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
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
         * @return networkQuality
         */
        public String getNetworkQuality() {
            return this.networkQuality;
        }

        /**
         * @return nick
         */
        public String getNick() {
            return this.nick;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return unionId
         */
        public String getUnionId() {
            return this.unionId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return workNo
         */
        public String getWorkNo() {
            return this.workNo;
        }

        public static final class Builder {
            private String channelName; 
            private String conferenceId; 
            private String deviceType; 
            private Long duration; 
            private Long joinTime; 
            private Long leaveTime; 
            private String networkQuality; 
            private String nick; 
            private String role; 
            private String sessionId; 
            private String status; 
            private String unionId; 
            private String version; 
            private String workNo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.channelName = model.channelName;
                this.conferenceId = model.conferenceId;
                this.deviceType = model.deviceType;
                this.duration = model.duration;
                this.joinTime = model.joinTime;
                this.leaveTime = model.leaveTime;
                this.networkQuality = model.networkQuality;
                this.nick = model.nick;
                this.role = model.role;
                this.sessionId = model.sessionId;
                this.status = model.status;
                this.unionId = model.unionId;
                this.version = model.version;
                this.workNo = model.workNo;
            } 

            /**
             * channelName.
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * conferenceId.
             */
            public Builder conferenceId(String conferenceId) {
                this.conferenceId = conferenceId;
                return this;
            }

            /**
             * deviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * joinTime.
             */
            public Builder joinTime(Long joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * leaveTime.
             */
            public Builder leaveTime(Long leaveTime) {
                this.leaveTime = leaveTime;
                return this;
            }

            /**
             * networkQuality.
             */
            public Builder networkQuality(String networkQuality) {
                this.networkQuality = networkQuality;
                return this;
            }

            /**
             * nick.
             */
            public Builder nick(String nick) {
                this.nick = nick;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * sessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * unionId.
             */
            public Builder unionId(String unionId) {
                this.unionId = unionId;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * workNo.
             */
            public Builder workNo(String workNo) {
                this.workNo = workNo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
