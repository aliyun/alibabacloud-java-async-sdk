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
 * {@link DescribePubUserListBySubUserResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePubUserListBySubUserResponseBody</p>
 */
public class DescribePubUserListBySubUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallStatus")
    private String callStatus;

    @com.aliyun.core.annotation.NameInMap("PubUserDetailList")
    private java.util.List<PubUserDetailList> pubUserDetailList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubUserDetail")
    private SubUserDetail subUserDetail;

    private DescribePubUserListBySubUserResponseBody(Builder builder) {
        this.callStatus = builder.callStatus;
        this.pubUserDetailList = builder.pubUserDetailList;
        this.requestId = builder.requestId;
        this.subUserDetail = builder.subUserDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePubUserListBySubUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callStatus
     */
    public String getCallStatus() {
        return this.callStatus;
    }

    /**
     * @return pubUserDetailList
     */
    public java.util.List<PubUserDetailList> getPubUserDetailList() {
        return this.pubUserDetailList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subUserDetail
     */
    public SubUserDetail getSubUserDetail() {
        return this.subUserDetail;
    }

    public static final class Builder {
        private String callStatus; 
        private java.util.List<PubUserDetailList> pubUserDetailList; 
        private String requestId; 
        private SubUserDetail subUserDetail; 

        private Builder() {
        } 

        private Builder(DescribePubUserListBySubUserResponseBody model) {
            this.callStatus = model.callStatus;
            this.pubUserDetailList = model.pubUserDetailList;
            this.requestId = model.requestId;
            this.subUserDetail = model.subUserDetail;
        } 

        /**
         * CallStatus.
         */
        public Builder callStatus(String callStatus) {
            this.callStatus = callStatus;
            return this;
        }

        /**
         * PubUserDetailList.
         */
        public Builder pubUserDetailList(java.util.List<PubUserDetailList> pubUserDetailList) {
            this.pubUserDetailList = pubUserDetailList;
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
         * SubUserDetail.
         */
        public Builder subUserDetail(SubUserDetail subUserDetail) {
            this.subUserDetail = subUserDetail;
            return this;
        }

        public DescribePubUserListBySubUserResponseBody build() {
            return new DescribePubUserListBySubUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePubUserListBySubUserResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePubUserListBySubUserResponseBody</p>
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
     * {@link DescribePubUserListBySubUserResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePubUserListBySubUserResponseBody</p>
     */
    public static class PubUserDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallIdList")
        private java.util.List<String> callIdList;

        @com.aliyun.core.annotation.NameInMap("ClientType")
        private String clientType;

        @com.aliyun.core.annotation.NameInMap("CreatedTs")
        private Long createdTs;

        @com.aliyun.core.annotation.NameInMap("DestroyedTs")
        private Long destroyedTs;

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

        @com.aliyun.core.annotation.NameInMap("UserIdAlias")
        private String userIdAlias;

        private PubUserDetailList(Builder builder) {
            this.callIdList = builder.callIdList;
            this.clientType = builder.clientType;
            this.createdTs = builder.createdTs;
            this.destroyedTs = builder.destroyedTs;
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
            this.userIdAlias = builder.userIdAlias;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PubUserDetailList create() {
            return builder().build();
        }

        /**
         * @return callIdList
         */
        public java.util.List<String> getCallIdList() {
            return this.callIdList;
        }

        /**
         * @return clientType
         */
        public String getClientType() {
            return this.clientType;
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

        /**
         * @return userIdAlias
         */
        public String getUserIdAlias() {
            return this.userIdAlias;
        }

        public static final class Builder {
            private java.util.List<String> callIdList; 
            private String clientType; 
            private Long createdTs; 
            private Long destroyedTs; 
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
            private String userIdAlias; 

            private Builder() {
            } 

            private Builder(PubUserDetailList model) {
                this.callIdList = model.callIdList;
                this.clientType = model.clientType;
                this.createdTs = model.createdTs;
                this.destroyedTs = model.destroyedTs;
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
                this.userIdAlias = model.userIdAlias;
            } 

            /**
             * CallIdList.
             */
            public Builder callIdList(java.util.List<String> callIdList) {
                this.callIdList = callIdList;
                return this;
            }

            /**
             * ClientType.
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
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

            /**
             * UserIdAlias.
             */
            public Builder userIdAlias(String userIdAlias) {
                this.userIdAlias = userIdAlias;
                return this;
            }

            public PubUserDetailList build() {
                return new PubUserDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePubUserListBySubUserResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePubUserListBySubUserResponseBody</p>
     */
    public static class SubUserDetailOnlinePeriods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JoinTs")
        private Long joinTs;

        @com.aliyun.core.annotation.NameInMap("LeaveTs")
        private Long leaveTs;

        private SubUserDetailOnlinePeriods(Builder builder) {
            this.joinTs = builder.joinTs;
            this.leaveTs = builder.leaveTs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubUserDetailOnlinePeriods create() {
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

            private Builder(SubUserDetailOnlinePeriods model) {
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

            public SubUserDetailOnlinePeriods build() {
                return new SubUserDetailOnlinePeriods(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePubUserListBySubUserResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePubUserListBySubUserResponseBody</p>
     */
    public static class SubUserDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientType")
        private String clientType;

        @com.aliyun.core.annotation.NameInMap("CreatedTs")
        private Long createdTs;

        @com.aliyun.core.annotation.NameInMap("DestroyedTs")
        private Long destroyedTs;

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
        private java.util.List<SubUserDetailOnlinePeriods> onlinePeriods;

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

        @com.aliyun.core.annotation.NameInMap("UserIdAlias")
        private String userIdAlias;

        private SubUserDetail(Builder builder) {
            this.clientType = builder.clientType;
            this.createdTs = builder.createdTs;
            this.destroyedTs = builder.destroyedTs;
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
            this.userIdAlias = builder.userIdAlias;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubUserDetail create() {
            return builder().build();
        }

        /**
         * @return clientType
         */
        public String getClientType() {
            return this.clientType;
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
        public java.util.List<SubUserDetailOnlinePeriods> getOnlinePeriods() {
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

        /**
         * @return userIdAlias
         */
        public String getUserIdAlias() {
            return this.userIdAlias;
        }

        public static final class Builder {
            private String clientType; 
            private Long createdTs; 
            private Long destroyedTs; 
            private Long duration; 
            private String location; 
            private String network; 
            private java.util.List<String> networkList; 
            private Long onlineDuration; 
            private java.util.List<SubUserDetailOnlinePeriods> onlinePeriods; 
            private String os; 
            private java.util.List<String> osList; 
            private java.util.List<String> roles; 
            private String sdkVersion; 
            private java.util.List<String> sdkVersionList; 
            private String userId; 
            private String userIdAlias; 

            private Builder() {
            } 

            private Builder(SubUserDetail model) {
                this.clientType = model.clientType;
                this.createdTs = model.createdTs;
                this.destroyedTs = model.destroyedTs;
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
                this.userIdAlias = model.userIdAlias;
            } 

            /**
             * ClientType.
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
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
            public Builder onlinePeriods(java.util.List<SubUserDetailOnlinePeriods> onlinePeriods) {
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

            /**
             * UserIdAlias.
             */
            public Builder userIdAlias(String userIdAlias) {
                this.userIdAlias = userIdAlias;
                return this;
            }

            public SubUserDetail build() {
                return new SubUserDetail(this);
            } 

        } 

    }
}
