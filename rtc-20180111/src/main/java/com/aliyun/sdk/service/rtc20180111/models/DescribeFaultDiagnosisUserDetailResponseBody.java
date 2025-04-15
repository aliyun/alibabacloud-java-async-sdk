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
 * {@link DescribeFaultDiagnosisUserDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFaultDiagnosisUserDetailResponseBody</p>
 */
public class DescribeFaultDiagnosisUserDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallInfo")
    private CallInfo callInfo;

    @com.aliyun.core.annotation.NameInMap("FactorList")
    private java.util.List<FactorList> factorList;

    @com.aliyun.core.annotation.NameInMap("FaultMetricData")
    private FaultMetricData faultMetricData;

    @com.aliyun.core.annotation.NameInMap("NetworkOperators")
    private java.util.List<String> networkOperators;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserDetail")
    private UserDetail userDetail;

    private DescribeFaultDiagnosisUserDetailResponseBody(Builder builder) {
        this.callInfo = builder.callInfo;
        this.factorList = builder.factorList;
        this.faultMetricData = builder.faultMetricData;
        this.networkOperators = builder.networkOperators;
        this.requestId = builder.requestId;
        this.userDetail = builder.userDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFaultDiagnosisUserDetailResponseBody create() {
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
     * @return factorList
     */
    public java.util.List<FactorList> getFactorList() {
        return this.factorList;
    }

    /**
     * @return faultMetricData
     */
    public FaultMetricData getFaultMetricData() {
        return this.faultMetricData;
    }

    /**
     * @return networkOperators
     */
    public java.util.List<String> getNetworkOperators() {
        return this.networkOperators;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userDetail
     */
    public UserDetail getUserDetail() {
        return this.userDetail;
    }

    public static final class Builder {
        private CallInfo callInfo; 
        private java.util.List<FactorList> factorList; 
        private FaultMetricData faultMetricData; 
        private java.util.List<String> networkOperators; 
        private String requestId; 
        private UserDetail userDetail; 

        private Builder() {
        } 

        private Builder(DescribeFaultDiagnosisUserDetailResponseBody model) {
            this.callInfo = model.callInfo;
            this.factorList = model.factorList;
            this.faultMetricData = model.faultMetricData;
            this.networkOperators = model.networkOperators;
            this.requestId = model.requestId;
            this.userDetail = model.userDetail;
        } 

        /**
         * CallInfo.
         */
        public Builder callInfo(CallInfo callInfo) {
            this.callInfo = callInfo;
            return this;
        }

        /**
         * FactorList.
         */
        public Builder factorList(java.util.List<FactorList> factorList) {
            this.factorList = factorList;
            return this;
        }

        /**
         * FaultMetricData.
         */
        public Builder faultMetricData(FaultMetricData faultMetricData) {
            this.faultMetricData = faultMetricData;
            return this;
        }

        /**
         * NetworkOperators.
         */
        public Builder networkOperators(java.util.List<String> networkOperators) {
            this.networkOperators = networkOperators;
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
         * UserDetail.
         */
        public Builder userDetail(UserDetail userDetail) {
            this.userDetail = userDetail;
            return this;
        }

        public DescribeFaultDiagnosisUserDetailResponseBody build() {
            return new DescribeFaultDiagnosisUserDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFaultDiagnosisUserDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaultDiagnosisUserDetailResponseBody</p>
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
             * <p>0rbd****</p>
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
     * {@link DescribeFaultDiagnosisUserDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaultDiagnosisUserDetailResponseBody</p>
     */
    public static class EventList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("Ts")
        private Long ts;

        private EventList(Builder builder) {
            this.eventName = builder.eventName;
            this.eventType = builder.eventType;
            this.ts = builder.ts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventList create() {
            return builder().build();
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return ts
         */
        public Long getTs() {
            return this.ts;
        }

        public static final class Builder {
            private String eventName; 
            private String eventType; 
            private Long ts; 

            private Builder() {
            } 

            private Builder(EventList model) {
                this.eventName = model.eventName;
                this.eventType = model.eventType;
                this.ts = model.ts;
            } 

            /**
             * EventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * EventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * Ts.
             */
            public Builder ts(Long ts) {
                this.ts = ts;
                return this;
            }

            public EventList build() {
                return new EventList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFaultDiagnosisUserDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaultDiagnosisUserDetailResponseBody</p>
     */
    public static class EventDataItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventList")
        private java.util.List<EventList> eventList;

        @com.aliyun.core.annotation.NameInMap("Ts")
        private Long ts;

        private EventDataItems(Builder builder) {
            this.eventList = builder.eventList;
            this.ts = builder.ts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventDataItems create() {
            return builder().build();
        }

        /**
         * @return eventList
         */
        public java.util.List<EventList> getEventList() {
            return this.eventList;
        }

        /**
         * @return ts
         */
        public Long getTs() {
            return this.ts;
        }

        public static final class Builder {
            private java.util.List<EventList> eventList; 
            private Long ts; 

            private Builder() {
            } 

            private Builder(EventDataItems model) {
                this.eventList = model.eventList;
                this.ts = model.ts;
            } 

            /**
             * EventList.
             */
            public Builder eventList(java.util.List<EventList> eventList) {
                this.eventList = eventList;
                return this;
            }

            /**
             * Ts.
             */
            public Builder ts(Long ts) {
                this.ts = ts;
                return this;
            }

            public EventDataItems build() {
                return new EventDataItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFaultDiagnosisUserDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaultDiagnosisUserDetailResponseBody</p>
     */
    public static class RelatedEventDatas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventDataItems")
        private java.util.List<EventDataItems> eventDataItems;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private RelatedEventDatas(Builder builder) {
            this.eventDataItems = builder.eventDataItems;
            this.role = builder.role;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedEventDatas create() {
            return builder().build();
        }

        /**
         * @return eventDataItems
         */
        public java.util.List<EventDataItems> getEventDataItems() {
            return this.eventDataItems;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List<EventDataItems> eventDataItems; 
            private String role; 
            private String userId; 

            private Builder() {
            } 

            private Builder(RelatedEventDatas model) {
                this.eventDataItems = model.eventDataItems;
                this.role = model.role;
                this.userId = model.userId;
            } 

            /**
             * EventDataItems.
             */
            public Builder eventDataItems(java.util.List<EventDataItems> eventDataItems) {
                this.eventDataItems = eventDataItems;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public RelatedEventDatas build() {
                return new RelatedEventDatas(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFaultDiagnosisUserDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaultDiagnosisUserDetailResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ext")
        private java.util.Map<String, ?> ext;

        @com.aliyun.core.annotation.NameInMap("X")
        private String x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private String y;

        private Nodes(Builder builder) {
            this.ext = builder.ext;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return ext
         */
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

        /**
         * @return x
         */
        public String getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public String getY() {
            return this.y;
        }

        public static final class Builder {
            private java.util.Map<String, ?> ext; 
            private String x; 
            private String y; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.ext = model.ext;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * Ext.
             */
            public Builder ext(java.util.Map<String, ?> ext) {
                this.ext = ext;
                return this;
            }

            /**
             * X.
             */
            public Builder x(String x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(String y) {
                this.y = y;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFaultDiagnosisUserDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaultDiagnosisUserDetailResponseBody</p>
     */
    public static class RelatedMetricDatas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private RelatedMetricDatas(Builder builder) {
            this.nodes = builder.nodes;
            this.role = builder.role;
            this.type = builder.type;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedMetricDatas create() {
            return builder().build();
        }

        /**
         * @return nodes
         */
        public java.util.List<Nodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List<Nodes> nodes; 
            private String role; 
            private String type; 
            private String userId; 

            private Builder() {
            } 

            private Builder(RelatedMetricDatas model) {
                this.nodes = model.nodes;
                this.role = model.role;
                this.type = model.type;
                this.userId = model.userId;
            } 

            /**
             * Nodes.
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public RelatedMetricDatas build() {
                return new RelatedMetricDatas(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFaultDiagnosisUserDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaultDiagnosisUserDetailResponseBody</p>
     */
    public static class FactorList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FactorId")
        private String factorId;

        @com.aliyun.core.annotation.NameInMap("FaultSource")
        private String faultSource;

        @com.aliyun.core.annotation.NameInMap("RelatedEventDatas")
        private java.util.List<RelatedEventDatas> relatedEventDatas;

        @com.aliyun.core.annotation.NameInMap("RelatedMetricDatas")
        private java.util.List<RelatedMetricDatas> relatedMetricDatas;

        private FactorList(Builder builder) {
            this.factorId = builder.factorId;
            this.faultSource = builder.faultSource;
            this.relatedEventDatas = builder.relatedEventDatas;
            this.relatedMetricDatas = builder.relatedMetricDatas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FactorList create() {
            return builder().build();
        }

        /**
         * @return factorId
         */
        public String getFactorId() {
            return this.factorId;
        }

        /**
         * @return faultSource
         */
        public String getFaultSource() {
            return this.faultSource;
        }

        /**
         * @return relatedEventDatas
         */
        public java.util.List<RelatedEventDatas> getRelatedEventDatas() {
            return this.relatedEventDatas;
        }

        /**
         * @return relatedMetricDatas
         */
        public java.util.List<RelatedMetricDatas> getRelatedMetricDatas() {
            return this.relatedMetricDatas;
        }

        public static final class Builder {
            private String factorId; 
            private String faultSource; 
            private java.util.List<RelatedEventDatas> relatedEventDatas; 
            private java.util.List<RelatedMetricDatas> relatedMetricDatas; 

            private Builder() {
            } 

            private Builder(FactorList model) {
                this.factorId = model.factorId;
                this.faultSource = model.faultSource;
                this.relatedEventDatas = model.relatedEventDatas;
                this.relatedMetricDatas = model.relatedMetricDatas;
            } 

            /**
             * FactorId.
             */
            public Builder factorId(String factorId) {
                this.factorId = factorId;
                return this;
            }

            /**
             * FaultSource.
             */
            public Builder faultSource(String faultSource) {
                this.faultSource = faultSource;
                return this;
            }

            /**
             * RelatedEventDatas.
             */
            public Builder relatedEventDatas(java.util.List<RelatedEventDatas> relatedEventDatas) {
                this.relatedEventDatas = relatedEventDatas;
                return this;
            }

            /**
             * RelatedMetricDatas.
             */
            public Builder relatedMetricDatas(java.util.List<RelatedMetricDatas> relatedMetricDatas) {
                this.relatedMetricDatas = relatedMetricDatas;
                return this;
            }

            public FactorList build() {
                return new FactorList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFaultDiagnosisUserDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaultDiagnosisUserDetailResponseBody</p>
     */
    public static class FaultMetricDataNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private String x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private String y;

        private FaultMetricDataNodes(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaultMetricDataNodes create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public String getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public String getY() {
            return this.y;
        }

        public static final class Builder {
            private String x; 
            private String y; 

            private Builder() {
            } 

            private Builder(FaultMetricDataNodes model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * X.
             */
            public Builder x(String x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(String y) {
                this.y = y;
                return this;
            }

            public FaultMetricDataNodes build() {
                return new FaultMetricDataNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFaultDiagnosisUserDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaultDiagnosisUserDetailResponseBody</p>
     */
    public static class FaultMetricData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<FaultMetricDataNodes> nodes;

        private FaultMetricData(Builder builder) {
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaultMetricData create() {
            return builder().build();
        }

        /**
         * @return nodes
         */
        public java.util.List<FaultMetricDataNodes> getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private java.util.List<FaultMetricDataNodes> nodes; 

            private Builder() {
            } 

            private Builder(FaultMetricData model) {
                this.nodes = model.nodes;
            } 

            /**
             * Nodes.
             */
            public Builder nodes(java.util.List<FaultMetricDataNodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            public FaultMetricData build() {
                return new FaultMetricData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFaultDiagnosisUserDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaultDiagnosisUserDetailResponseBody</p>
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
     * {@link DescribeFaultDiagnosisUserDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaultDiagnosisUserDetailResponseBody</p>
     */
    public static class UserDetail extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("OnlineDuration")
        private Long onlineDuration;

        @com.aliyun.core.annotation.NameInMap("OnlinePeriods")
        private java.util.List<OnlinePeriods> onlinePeriods;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("SdkVersion")
        private String sdkVersion;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private UserDetail(Builder builder) {
            this.createdTs = builder.createdTs;
            this.destroyedTs = builder.destroyedTs;
            this.duration = builder.duration;
            this.location = builder.location;
            this.network = builder.network;
            this.onlineDuration = builder.onlineDuration;
            this.onlinePeriods = builder.onlinePeriods;
            this.os = builder.os;
            this.sdkVersion = builder.sdkVersion;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserDetail create() {
            return builder().build();
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
         * @return sdkVersion
         */
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long createdTs; 
            private Long destroyedTs; 
            private Long duration; 
            private String location; 
            private String network; 
            private Long onlineDuration; 
            private java.util.List<OnlinePeriods> onlinePeriods; 
            private String os; 
            private String sdkVersion; 
            private String userId; 

            private Builder() {
            } 

            private Builder(UserDetail model) {
                this.createdTs = model.createdTs;
                this.destroyedTs = model.destroyedTs;
                this.duration = model.duration;
                this.location = model.location;
                this.network = model.network;
                this.onlineDuration = model.onlineDuration;
                this.onlinePeriods = model.onlinePeriods;
                this.os = model.os;
                this.sdkVersion = model.sdkVersion;
                this.userId = model.userId;
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
             * SdkVersion.
             */
            public Builder sdkVersion(String sdkVersion) {
                this.sdkVersion = sdkVersion;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public UserDetail build() {
                return new UserDetail(this);
            } 

        } 

    }
}
