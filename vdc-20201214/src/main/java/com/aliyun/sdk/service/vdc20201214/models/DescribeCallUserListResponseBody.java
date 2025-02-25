// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCallUserListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCallUserListResponseBody</p>
 */
public class DescribeCallUserListResponseBody extends TeaModel {
    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCnt")
    private Integer totalCnt;

    @NameInMap("UserDetailList")
    private java.util.List < UserDetailList> userDetailList;

    private DescribeCallUserListResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCnt = builder.totalCnt;
        this.userDetailList = builder.userDetailList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCallUserListResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCnt
     */
    public Integer getTotalCnt() {
        return this.totalCnt;
    }

    /**
     * @return userDetailList
     */
    public java.util.List < UserDetailList> getUserDetailList() {
        return this.userDetailList;
    }

    public static final class Builder {
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCnt; 
        private java.util.List < UserDetailList> userDetailList; 

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCnt.
         */
        public Builder totalCnt(Integer totalCnt) {
            this.totalCnt = totalCnt;
            return this;
        }

        /**
         * UserDetailList.
         */
        public Builder userDetailList(java.util.List < UserDetailList> userDetailList) {
            this.userDetailList = userDetailList;
            return this;
        }

        public DescribeCallUserListResponseBody build() {
            return new DescribeCallUserListResponseBody(this);
        } 

    } 

    public static class DurMetricStatData extends TeaModel {
        @NameInMap("PubAudio")
        private Long pubAudio;

        @NameInMap("PubVideo360")
        private Long pubVideo360;

        @NameInMap("PubVideo720")
        private Long pubVideo720;

        @NameInMap("PubVideoScreenShare")
        private Long pubVideoScreenShare;

        @NameInMap("SubAudio")
        private Long subAudio;

        @NameInMap("SubVideo1080")
        private Long subVideo1080;

        @NameInMap("SubVideo360")
        private Long subVideo360;

        @NameInMap("SubVideo720")
        private Long subVideo720;

        @NameInMap("SubVideoScreenShare")
        private Long subVideoScreenShare;

        private DurMetricStatData(Builder builder) {
            this.pubAudio = builder.pubAudio;
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
            private Long pubVideo360; 
            private Long pubVideo720; 
            private Long pubVideoScreenShare; 
            private Long subAudio; 
            private Long subVideo1080; 
            private Long subVideo360; 
            private Long subVideo720; 
            private Long subVideoScreenShare; 

            /**
             * PubAudio.
             */
            public Builder pubAudio(Long pubAudio) {
                this.pubAudio = pubAudio;
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
    public static class OnlinePeriods extends TeaModel {
        @NameInMap("JoinTs")
        private Long joinTs;

        @NameInMap("LeaveTs")
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
    public static class UserDetailList extends TeaModel {
        @NameInMap("CallExp")
        private String callExp;

        @NameInMap("CreatedTs")
        private Long createdTs;

        @NameInMap("DestroyedTs")
        private Long destroyedTs;

        @NameInMap("DurMetricStatData")
        private DurMetricStatData durMetricStatData;

        @NameInMap("Duration")
        private Long duration;

        @NameInMap("Location")
        private String location;

        @NameInMap("LocationCn")
        private String locationCn;

        @NameInMap("LocationEn")
        private String locationEn;

        @NameInMap("Network")
        private String network;

        @NameInMap("NetworkList")
        private java.util.List < String > networkList;

        @NameInMap("OnlineDuration")
        private Long onlineDuration;

        @NameInMap("OnlinePeriods")
        private java.util.List < OnlinePeriods> onlinePeriods;

        @NameInMap("Os")
        private String os;

        @NameInMap("OsList")
        private java.util.List < String > osList;

        @NameInMap("Roles")
        private java.util.List < String > roles;

        @NameInMap("SdkVersion")
        private String sdkVersion;

        @NameInMap("SdkVersionList")
        private java.util.List < String > sdkVersionList;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserIdAlias")
        private String userIdAlias;

        private UserDetailList(Builder builder) {
            this.callExp = builder.callExp;
            this.createdTs = builder.createdTs;
            this.destroyedTs = builder.destroyedTs;
            this.durMetricStatData = builder.durMetricStatData;
            this.duration = builder.duration;
            this.location = builder.location;
            this.locationCn = builder.locationCn;
            this.locationEn = builder.locationEn;
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
            this.userIdAlias = builder.userIdAlias;
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
         * @return locationCn
         */
        public String getLocationCn() {
            return this.locationCn;
        }

        /**
         * @return locationEn
         */
        public String getLocationEn() {
            return this.locationEn;
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
        public java.util.List < String > getNetworkList() {
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
        public java.util.List < OnlinePeriods> getOnlinePeriods() {
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
        public java.util.List < String > getOsList() {
            return this.osList;
        }

        /**
         * @return roles
         */
        public java.util.List < String > getRoles() {
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
        public java.util.List < String > getSdkVersionList() {
            return this.sdkVersionList;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userIdAlias
         */
        public String getUserIdAlias() {
            return this.userIdAlias;
        }

        public static final class Builder {
            private String callExp; 
            private Long createdTs; 
            private Long destroyedTs; 
            private DurMetricStatData durMetricStatData; 
            private Long duration; 
            private String location; 
            private String locationCn; 
            private String locationEn; 
            private String network; 
            private java.util.List < String > networkList; 
            private Long onlineDuration; 
            private java.util.List < OnlinePeriods> onlinePeriods; 
            private String os; 
            private java.util.List < String > osList; 
            private java.util.List < String > roles; 
            private String sdkVersion; 
            private java.util.List < String > sdkVersionList; 
            private String userId; 
            private String userIdAlias; 

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
             * LocationCn.
             */
            public Builder locationCn(String locationCn) {
                this.locationCn = locationCn;
                return this;
            }

            /**
             * LocationEn.
             */
            public Builder locationEn(String locationEn) {
                this.locationEn = locationEn;
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
            public Builder networkList(java.util.List < String > networkList) {
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
            public Builder onlinePeriods(java.util.List < OnlinePeriods> onlinePeriods) {
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
            public Builder osList(java.util.List < String > osList) {
                this.osList = osList;
                return this;
            }

            /**
             * Roles.
             */
            public Builder roles(java.util.List < String > roles) {
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
            public Builder sdkVersionList(java.util.List < String > sdkVersionList) {
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

            /**
             * UserIdAlias.
             */
            public Builder userIdAlias(String userIdAlias) {
                this.userIdAlias = userIdAlias;
                return this;
            }

            public UserDetailList build() {
                return new UserDetailList(this);
            } 

        } 

    }
}
