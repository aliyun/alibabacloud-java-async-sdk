// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeCallResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCallResponseBody</p>
 */
public class DescribeCallResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallInfo")
    private CallInfo callInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserDetailList")
    private java.util.List<UserDetailList> userDetailList;

    private DescribeCallResponseBody(Builder builder) {
        this.callInfo = builder.callInfo;
        this.requestId = builder.requestId;
        this.userDetailList = builder.userDetailList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCallResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callInfo
     */
    public CallInfo getCallInfo() {
        return this.callInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userDetailList
     */
    public java.util.List<UserDetailList> getUserDetailList() {
        return this.userDetailList;
    }

    public static final class Builder {
        private CallInfo callInfo; 
        private String requestId; 
        private java.util.List<UserDetailList> userDetailList; 

        private Builder() {
        } 

        private Builder(DescribeCallResponseBody model) {
            this.callInfo = model.callInfo;
            this.requestId = model.requestId;
            this.userDetailList = model.userDetailList;
        } 

        /**
         * CallInfo.
         */
        public Builder callInfo(CallInfo callInfo) {
            this.callInfo = callInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserDetailList.
         */
        public Builder userDetailList(java.util.List<UserDetailList> userDetailList) {
            this.userDetailList = userDetailList;
            return this;
        }

        public DescribeCallResponseBody build() {
            return new DescribeCallResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCallResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCallResponseBody</p>
     */
    public static class CallInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CallStatus")
        private String callStatus;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("CreatedTs")
        private Long createdTs;

        @com.aliyun.core.annotation.NameInMap("DestroyedTs")
        private Long destroyedTs;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        private CallInfo(Builder builder) {
            this.appId = builder.appId;
            this.callStatus = builder.callStatus;
            this.channelId = builder.channelId;
            this.createdTs = builder.createdTs;
            this.destroyedTs = builder.destroyedTs;
            this.duration = builder.duration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallInfo create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return callStatus
         */
        public String getCallStatus() {
            return this.callStatus;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return createdTs
         */
        public Long getCreatedTs() {
            return this.createdTs;
        }

        /**
         * @return destroyedTs
         */
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        public static final class Builder {
            private String appId; 
            private String callStatus; 
            private String channelId; 
            private Long createdTs; 
            private Long destroyedTs; 
            private Long duration; 

            private Builder() {
            } 

            private Builder(CallInfo model) {
                this.appId = model.appId;
                this.callStatus = model.callStatus;
                this.channelId = model.channelId;
                this.createdTs = model.createdTs;
                this.destroyedTs = model.destroyedTs;
                this.duration = model.duration;
            } 

            /**
             * <p>App ID。</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxxxx</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CallStatus.
             */
            public Builder callStatus(String callStatus) {
                this.callStatus = callStatus;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * CreatedTs.
             */
            public Builder createdTs(Long createdTs) {
                this.createdTs = createdTs;
                return this;
            }

            /**
             * DestroyedTs.
             */
            public Builder destroyedTs(Long destroyedTs) {
                this.destroyedTs = destroyedTs;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            public CallInfo build() {
                return new CallInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCallResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCallResponseBody</p>
     */
    public static class DurMetricStatData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PubAudio")
        private Long pubAudio;

        @com.aliyun.core.annotation.NameInMap("PubVideo1080")
        private Long pubVideo1080;

        @com.aliyun.core.annotation.NameInMap("PubVideo360")
        private Long pubVideo360;

        @com.aliyun.core.annotation.NameInMap("PubVideo720")
        private Long pubVideo720;

        @com.aliyun.core.annotation.NameInMap("PubVideoScreenShare")
        private Long pubVideoScreenShare;

        @com.aliyun.core.annotation.NameInMap("SubAudio")
        private Long subAudio;

        @com.aliyun.core.annotation.NameInMap("SubVideo1080")
        private Long subVideo1080;

        @com.aliyun.core.annotation.NameInMap("SubVideo360")
        private Long subVideo360;

        @com.aliyun.core.annotation.NameInMap("SubVideo720")
        private Long subVideo720;

        @com.aliyun.core.annotation.NameInMap("SubVideoScreenShare")
        private Long subVideoScreenShare;

        private DurMetricStatData(Builder builder) {
            this.pubAudio = builder.pubAudio;
            this.pubVideo1080 = builder.pubVideo1080;
            this.pubVideo360 = builder.pubVideo360;
            this.pubVideo720 = builder.pubVideo720;
            this.pubVideoScreenShare = builder.pubVideoScreenShare;
            this.subAudio = builder.subAudio;
            this.subVideo1080 = builder.subVideo1080;
            this.subVideo360 = builder.subVideo360;
            this.subVideo720 = builder.subVideo720;
            this.subVideoScreenShare = builder.subVideoScreenShare;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DurMetricStatData create() {
            return builder().build();
        }

        /**
         * @return pubAudio
         */
        public Long getPubAudio() {
            return this.pubAudio;
        }

        /**
         * @return pubVideo1080
         */
        public Long getPubVideo1080() {
            return this.pubVideo1080;
        }

        /**
         * @return pubVideo360
         */
        public Long getPubVideo360() {
            return this.pubVideo360;
        }

        /**
         * @return pubVideo720
         */
        public Long getPubVideo720() {
            return this.pubVideo720;
        }

        /**
         * @return pubVideoScreenShare
         */
        public Long getPubVideoScreenShare() {
            return this.pubVideoScreenShare;
        }

        /**
         * @return subAudio
         */
        public Long getSubAudio() {
            return this.subAudio;
        }

        /**
         * @return subVideo1080
         */
        public Long getSubVideo1080() {
            return this.subVideo1080;
        }

        /**
         * @return subVideo360
         */
        public Long getSubVideo360() {
            return this.subVideo360;
        }

        /**
         * @return subVideo720
         */
        public Long getSubVideo720() {
            return this.subVideo720;
        }

        /**
         * @return subVideoScreenShare
         */
        public Long getSubVideoScreenShare() {
            return this.subVideoScreenShare;
        }

        public static final class Builder {
            private Long pubAudio; 
            private Long pubVideo1080; 
            private Long pubVideo360; 
            private Long pubVideo720; 
            private Long pubVideoScreenShare; 
            private Long subAudio; 
            private Long subVideo1080; 
            private Long subVideo360; 
            private Long subVideo720; 
            private Long subVideoScreenShare; 

            private Builder() {
            } 

            private Builder(DurMetricStatData model) {
                this.pubAudio = model.pubAudio;
                this.pubVideo1080 = model.pubVideo1080;
                this.pubVideo360 = model.pubVideo360;
                this.pubVideo720 = model.pubVideo720;
                this.pubVideoScreenShare = model.pubVideoScreenShare;
                this.subAudio = model.subAudio;
                this.subVideo1080 = model.subVideo1080;
                this.subVideo360 = model.subVideo360;
                this.subVideo720 = model.subVideo720;
                this.subVideoScreenShare = model.subVideoScreenShare;
            } 

            /**
             * PubAudio.
             */
            public Builder pubAudio(Long pubAudio) {
                this.pubAudio = pubAudio;
                return this;
            }

            /**
             * PubVideo1080.
             */
            public Builder pubVideo1080(Long pubVideo1080) {
                this.pubVideo1080 = pubVideo1080;
                return this;
            }

            /**
             * PubVideo360.
             */
            public Builder pubVideo360(Long pubVideo360) {
                this.pubVideo360 = pubVideo360;
                return this;
            }

            /**
             * PubVideo720.
             */
            public Builder pubVideo720(Long pubVideo720) {
                this.pubVideo720 = pubVideo720;
                return this;
            }

            /**
             * PubVideoScreenShare.
             */
            public Builder pubVideoScreenShare(Long pubVideoScreenShare) {
                this.pubVideoScreenShare = pubVideoScreenShare;
                return this;
            }

            /**
             * SubAudio.
             */
            public Builder subAudio(Long subAudio) {
                this.subAudio = subAudio;
                return this;
            }

            /**
             * SubVideo1080.
             */
            public Builder subVideo1080(Long subVideo1080) {
                this.subVideo1080 = subVideo1080;
                return this;
            }

            /**
             * SubVideo360.
             */
            public Builder subVideo360(Long subVideo360) {
                this.subVideo360 = subVideo360;
                return this;
            }

            /**
             * SubVideo720.
             */
            public Builder subVideo720(Long subVideo720) {
                this.subVideo720 = subVideo720;
                return this;
            }

            /**
             * SubVideoScreenShare.
             */
            public Builder subVideoScreenShare(Long subVideoScreenShare) {
                this.subVideoScreenShare = subVideoScreenShare;
                return this;
            }

            public DurMetricStatData build() {
                return new DurMetricStatData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCallResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCallResponseBody</p>
     */
    public static class OnlinePeriods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JoinTs")
        private Long joinTs;

        @com.aliyun.core.annotation.NameInMap("LeaveTs")
        private Long leaveTs;

        private OnlinePeriods(Builder builder) {
            this.joinTs = builder.joinTs;
            this.leaveTs = builder.leaveTs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OnlinePeriods create() {
            return builder().build();
        }

        /**
         * @return joinTs
         */
        public Long getJoinTs() {
            return this.joinTs;
        }

        /**
         * @return leaveTs
         */
        public Long getLeaveTs() {
            return this.leaveTs;
        }

        public static final class Builder {
            private Long joinTs; 
            private Long leaveTs; 

            private Builder() {
            } 

            private Builder(OnlinePeriods model) {
                this.joinTs = model.joinTs;
                this.leaveTs = model.leaveTs;
            } 

            /**
             * JoinTs.
             */
            public Builder joinTs(Long joinTs) {
                this.joinTs = joinTs;
                return this;
            }

            /**
             * LeaveTs.
             */
            public Builder leaveTs(Long leaveTs) {
                this.leaveTs = leaveTs;
                return this;
            }

            public OnlinePeriods build() {
                return new OnlinePeriods(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCallResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCallResponseBody</p>
     */
    public static class UserDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallExp")
        private String callExp;

        @com.aliyun.core.annotation.NameInMap("CreatedTs")
        private Long createdTs;

        @com.aliyun.core.annotation.NameInMap("DestroyedTs")
        private Long destroyedTs;

        @com.aliyun.core.annotation.NameInMap("DurMetricStatData")
        private DurMetricStatData durMetricStatData;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Network")
        private String network;

        @com.aliyun.core.annotation.NameInMap("NetworkList")
        private java.util.List<String> networkList;

        @com.aliyun.core.annotation.NameInMap("OnlineDuration")
        private Long onlineDuration;

        @com.aliyun.core.annotation.NameInMap("OnlinePeriods")
        private java.util.List<OnlinePeriods> onlinePeriods;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("OsList")
        private java.util.List<String> osList;

        @com.aliyun.core.annotation.NameInMap("Roles")
        private java.util.List<String> roles;

        @com.aliyun.core.annotation.NameInMap("SdkVersion")
        private String sdkVersion;

        @com.aliyun.core.annotation.NameInMap("SdkVersionList")
        private java.util.List<String> sdkVersionList;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private UserDetailList(Builder builder) {
            this.callExp = builder.callExp;
            this.createdTs = builder.createdTs;
            this.destroyedTs = builder.destroyedTs;
            this.durMetricStatData = builder.durMetricStatData;
            this.duration = builder.duration;
            this.location = builder.location;
            this.network = builder.network;
            this.networkList = builder.networkList;
            this.onlineDuration = builder.onlineDuration;
            this.onlinePeriods = builder.onlinePeriods;
            this.os = builder.os;
            this.osList = builder.osList;
            this.roles = builder.roles;
            this.sdkVersion = builder.sdkVersion;
            this.sdkVersionList = builder.sdkVersionList;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserDetailList create() {
            return builder().build();
        }

        /**
         * @return callExp
         */
        public String getCallExp() {
            return this.callExp;
        }

        /**
         * @return createdTs
         */
        public Long getCreatedTs() {
            return this.createdTs;
        }

        /**
         * @return destroyedTs
         */
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        /**
         * @return durMetricStatData
         */
        public DurMetricStatData getDurMetricStatData() {
            return this.durMetricStatData;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return network
         */
        public String getNetwork() {
            return this.network;
        }

        /**
         * @return networkList
         */
        public java.util.List<String> getNetworkList() {
            return this.networkList;
        }

        /**
         * @return onlineDuration
         */
        public Long getOnlineDuration() {
            return this.onlineDuration;
        }

        /**
         * @return onlinePeriods
         */
        public java.util.List<OnlinePeriods> getOnlinePeriods() {
            return this.onlinePeriods;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return osList
         */
        public java.util.List<String> getOsList() {
            return this.osList;
        }

        /**
         * @return roles
         */
        public java.util.List<String> getRoles() {
            return this.roles;
        }

        /**
         * @return sdkVersion
         */
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        /**
         * @return sdkVersionList
         */
        public java.util.List<String> getSdkVersionList() {
            return this.sdkVersionList;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String callExp; 
            private Long createdTs; 
            private Long destroyedTs; 
            private DurMetricStatData durMetricStatData; 
            private Long duration; 
            private String location; 
            private String network; 
            private java.util.List<String> networkList; 
            private Long onlineDuration; 
            private java.util.List<OnlinePeriods> onlinePeriods; 
            private String os; 
            private java.util.List<String> osList; 
            private java.util.List<String> roles; 
            private String sdkVersion; 
            private java.util.List<String> sdkVersionList; 
            private String userId; 

            private Builder() {
            } 

            private Builder(UserDetailList model) {
                this.callExp = model.callExp;
                this.createdTs = model.createdTs;
                this.destroyedTs = model.destroyedTs;
                this.durMetricStatData = model.durMetricStatData;
                this.duration = model.duration;
                this.location = model.location;
                this.network = model.network;
                this.networkList = model.networkList;
                this.onlineDuration = model.onlineDuration;
                this.onlinePeriods = model.onlinePeriods;
                this.os = model.os;
                this.osList = model.osList;
                this.roles = model.roles;
                this.sdkVersion = model.sdkVersion;
                this.sdkVersionList = model.sdkVersionList;
                this.userId = model.userId;
            } 

            /**
             * CallExp.
             */
            public Builder callExp(String callExp) {
                this.callExp = callExp;
                return this;
            }

            /**
             * CreatedTs.
             */
            public Builder createdTs(Long createdTs) {
                this.createdTs = createdTs;
                return this;
            }

            /**
             * DestroyedTs.
             */
            public Builder destroyedTs(Long destroyedTs) {
                this.destroyedTs = destroyedTs;
                return this;
            }

            /**
             * DurMetricStatData.
             */
            public Builder durMetricStatData(DurMetricStatData durMetricStatData) {
                this.durMetricStatData = durMetricStatData;
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
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Network.
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * NetworkList.
             */
            public Builder networkList(java.util.List<String> networkList) {
                this.networkList = networkList;
                return this;
            }

            /**
             * OnlineDuration.
             */
            public Builder onlineDuration(Long onlineDuration) {
                this.onlineDuration = onlineDuration;
                return this;
            }

            /**
             * OnlinePeriods.
             */
            public Builder onlinePeriods(java.util.List<OnlinePeriods> onlinePeriods) {
                this.onlinePeriods = onlinePeriods;
                return this;
            }

            /**
             * Os.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * OsList.
             */
            public Builder osList(java.util.List<String> osList) {
                this.osList = osList;
                return this;
            }

            /**
             * Roles.
             */
            public Builder roles(java.util.List<String> roles) {
                this.roles = roles;
                return this;
            }

            /**
             * SdkVersion.
             */
            public Builder sdkVersion(String sdkVersion) {
                this.sdkVersion = sdkVersion;
                return this;
            }

            /**
             * SdkVersionList.
             */
            public Builder sdkVersionList(java.util.List<String> sdkVersionList) {
                this.sdkVersionList = sdkVersionList;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public UserDetailList build() {
                return new UserDetailList(this);
            } 

        } 

    }
}
