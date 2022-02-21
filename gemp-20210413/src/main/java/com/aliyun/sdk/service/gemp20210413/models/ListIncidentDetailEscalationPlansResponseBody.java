// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIncidentDetailEscalationPlansResponseBody} extends {@link TeaModel}
 *
 * <p>ListIncidentDetailEscalationPlansResponseBody</p>
 */
public class ListIncidentDetailEscalationPlansResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private ListIncidentDetailEscalationPlansResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIncidentDetailEscalationPlansResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListIncidentDetailEscalationPlansResponseBody build() {
            return new ListIncidentDetailEscalationPlansResponseBody(this);
        } 

    } 

    public static class NoticeObjectList extends TeaModel {
        @NameInMap("noticeObjectId")
        private Long noticeObjectId;

        @NameInMap("noticeObjectName")
        private String noticeObjectName;

        @NameInMap("noticeObjectPhone")
        private String noticeObjectPhone;

        private NoticeObjectList(Builder builder) {
            this.noticeObjectId = builder.noticeObjectId;
            this.noticeObjectName = builder.noticeObjectName;
            this.noticeObjectPhone = builder.noticeObjectPhone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NoticeObjectList create() {
            return builder().build();
        }

        /**
         * @return noticeObjectId
         */
        public Long getNoticeObjectId() {
            return this.noticeObjectId;
        }

        /**
         * @return noticeObjectName
         */
        public String getNoticeObjectName() {
            return this.noticeObjectName;
        }

        /**
         * @return noticeObjectPhone
         */
        public String getNoticeObjectPhone() {
            return this.noticeObjectPhone;
        }

        public static final class Builder {
            private Long noticeObjectId; 
            private String noticeObjectName; 
            private String noticeObjectPhone; 

            /**
             * 分配对象id
             */
            public Builder noticeObjectId(Long noticeObjectId) {
                this.noticeObjectId = noticeObjectId;
                return this;
            }

            /**
             * 分配对象名称
             */
            public Builder noticeObjectName(String noticeObjectName) {
                this.noticeObjectName = noticeObjectName;
                return this;
            }

            /**
             * 分配对象手机号
             */
            public Builder noticeObjectPhone(String noticeObjectPhone) {
                this.noticeObjectPhone = noticeObjectPhone;
                return this;
            }

            public NoticeObjectList build() {
                return new NoticeObjectList(this);
            } 

        } 

    }
    public static class ServiceGroupList extends TeaModel {
        @NameInMap("id")
        private Long id;

        @NameInMap("name")
        private String name;

        private ServiceGroupList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceGroupList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            /**
             * 服务组id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 服务组名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ServiceGroupList build() {
                return new ServiceGroupList(this);
            } 

        } 

    }
    public static class NuAcknowledgeEscalationPlan extends TeaModel {
        @NameInMap("escalationPlanType")
        private String escalationPlanType;

        @NameInMap("noticeChannels")
        private java.util.List < String > noticeChannels;

        @NameInMap("noticeObjectList")
        private java.util.List < NoticeObjectList> noticeObjectList;

        @NameInMap("noticeTime")
        private Long noticeTime;

        @NameInMap("serviceGroupList")
        private java.util.List < ServiceGroupList> serviceGroupList;

        @NameInMap("startTime")
        private Long startTime;

        @NameInMap("status")
        private String status;

        private NuAcknowledgeEscalationPlan(Builder builder) {
            this.escalationPlanType = builder.escalationPlanType;
            this.noticeChannels = builder.noticeChannels;
            this.noticeObjectList = builder.noticeObjectList;
            this.noticeTime = builder.noticeTime;
            this.serviceGroupList = builder.serviceGroupList;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NuAcknowledgeEscalationPlan create() {
            return builder().build();
        }

        /**
         * @return escalationPlanType
         */
        public String getEscalationPlanType() {
            return this.escalationPlanType;
        }

        /**
         * @return noticeChannels
         */
        public java.util.List < String > getNoticeChannels() {
            return this.noticeChannels;
        }

        /**
         * @return noticeObjectList
         */
        public java.util.List < NoticeObjectList> getNoticeObjectList() {
            return this.noticeObjectList;
        }

        /**
         * @return noticeTime
         */
        public Long getNoticeTime() {
            return this.noticeTime;
        }

        /**
         * @return serviceGroupList
         */
        public java.util.List < ServiceGroupList> getServiceGroupList() {
            return this.serviceGroupList;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String escalationPlanType; 
            private java.util.List < String > noticeChannels; 
            private java.util.List < NoticeObjectList> noticeObjectList; 
            private Long noticeTime; 
            private java.util.List < ServiceGroupList> serviceGroupList; 
            private Long startTime; 
            private String status; 

            /**
             * 升级策略类型 UN_ACKNOWLEDGE
             */
            public Builder escalationPlanType(String escalationPlanType) {
                this.escalationPlanType = escalationPlanType;
                return this;
            }

            /**
             * 分配渠道
             */
            public Builder noticeChannels(java.util.List < String > noticeChannels) {
                this.noticeChannels = noticeChannels;
                return this;
            }

            /**
             * 用户信息
             */
            public Builder noticeObjectList(java.util.List < NoticeObjectList> noticeObjectList) {
                this.noticeObjectList = noticeObjectList;
                return this;
            }

            /**
             * 延迟时间
             */
            public Builder noticeTime(Long noticeTime) {
                this.noticeTime = noticeTime;
                return this;
            }

            /**
             * 通知群
             */
            public Builder serviceGroupList(java.util.List < ServiceGroupList> serviceGroupList) {
                this.serviceGroupList = serviceGroupList;
                return this;
            }

            /**
             * 开始时间
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * 规则触发状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public NuAcknowledgeEscalationPlan build() {
                return new NuAcknowledgeEscalationPlan(this);
            } 

        } 

    }
    public static class UnFinishEscalationPlanNoticeObjectList extends TeaModel {
        @NameInMap("noticeObjectId")
        private Long noticeObjectId;

        @NameInMap("noticeObjectName")
        private String noticeObjectName;

        @NameInMap("noticeObjectPhone")
        private String noticeObjectPhone;

        private UnFinishEscalationPlanNoticeObjectList(Builder builder) {
            this.noticeObjectId = builder.noticeObjectId;
            this.noticeObjectName = builder.noticeObjectName;
            this.noticeObjectPhone = builder.noticeObjectPhone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnFinishEscalationPlanNoticeObjectList create() {
            return builder().build();
        }

        /**
         * @return noticeObjectId
         */
        public Long getNoticeObjectId() {
            return this.noticeObjectId;
        }

        /**
         * @return noticeObjectName
         */
        public String getNoticeObjectName() {
            return this.noticeObjectName;
        }

        /**
         * @return noticeObjectPhone
         */
        public String getNoticeObjectPhone() {
            return this.noticeObjectPhone;
        }

        public static final class Builder {
            private Long noticeObjectId; 
            private String noticeObjectName; 
            private String noticeObjectPhone; 

            /**
             * 分配对象id
             */
            public Builder noticeObjectId(Long noticeObjectId) {
                this.noticeObjectId = noticeObjectId;
                return this;
            }

            /**
             * 分配对象名称
             */
            public Builder noticeObjectName(String noticeObjectName) {
                this.noticeObjectName = noticeObjectName;
                return this;
            }

            /**
             * 手机号
             */
            public Builder noticeObjectPhone(String noticeObjectPhone) {
                this.noticeObjectPhone = noticeObjectPhone;
                return this;
            }

            public UnFinishEscalationPlanNoticeObjectList build() {
                return new UnFinishEscalationPlanNoticeObjectList(this);
            } 

        } 

    }
    public static class UnFinishEscalationPlanServiceGroupList extends TeaModel {
        @NameInMap("id")
        private Long id;

        @NameInMap("name")
        private String name;

        private UnFinishEscalationPlanServiceGroupList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnFinishEscalationPlanServiceGroupList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            /**
             * 服务组id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 服务组名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public UnFinishEscalationPlanServiceGroupList build() {
                return new UnFinishEscalationPlanServiceGroupList(this);
            } 

        } 

    }
    public static class UnFinishEscalationPlan extends TeaModel {
        @NameInMap("escalationPlanType")
        private String escalationPlanType;

        @NameInMap("noticeChannels")
        private java.util.List < String > noticeChannels;

        @NameInMap("noticeObjectList")
        private java.util.List < UnFinishEscalationPlanNoticeObjectList> noticeObjectList;

        @NameInMap("noticeTime")
        private Integer noticeTime;

        @NameInMap("serviceGroupList")
        private java.util.List < UnFinishEscalationPlanServiceGroupList> serviceGroupList;

        @NameInMap("startTime")
        private Long startTime;

        @NameInMap("status")
        private String status;

        private UnFinishEscalationPlan(Builder builder) {
            this.escalationPlanType = builder.escalationPlanType;
            this.noticeChannels = builder.noticeChannels;
            this.noticeObjectList = builder.noticeObjectList;
            this.noticeTime = builder.noticeTime;
            this.serviceGroupList = builder.serviceGroupList;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnFinishEscalationPlan create() {
            return builder().build();
        }

        /**
         * @return escalationPlanType
         */
        public String getEscalationPlanType() {
            return this.escalationPlanType;
        }

        /**
         * @return noticeChannels
         */
        public java.util.List < String > getNoticeChannels() {
            return this.noticeChannels;
        }

        /**
         * @return noticeObjectList
         */
        public java.util.List < UnFinishEscalationPlanNoticeObjectList> getNoticeObjectList() {
            return this.noticeObjectList;
        }

        /**
         * @return noticeTime
         */
        public Integer getNoticeTime() {
            return this.noticeTime;
        }

        /**
         * @return serviceGroupList
         */
        public java.util.List < UnFinishEscalationPlanServiceGroupList> getServiceGroupList() {
            return this.serviceGroupList;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String escalationPlanType; 
            private java.util.List < String > noticeChannels; 
            private java.util.List < UnFinishEscalationPlanNoticeObjectList> noticeObjectList; 
            private Integer noticeTime; 
            private java.util.List < UnFinishEscalationPlanServiceGroupList> serviceGroupList; 
            private Long startTime; 
            private String status; 

            /**
             * 升级策略类型 UN_ACKNOWLEDGE
             */
            public Builder escalationPlanType(String escalationPlanType) {
                this.escalationPlanType = escalationPlanType;
                return this;
            }

            /**
             * 分配渠道
             */
            public Builder noticeChannels(java.util.List < String > noticeChannels) {
                this.noticeChannels = noticeChannels;
                return this;
            }

            /**
             * 用户信息
             */
            public Builder noticeObjectList(java.util.List < UnFinishEscalationPlanNoticeObjectList> noticeObjectList) {
                this.noticeObjectList = noticeObjectList;
                return this;
            }

            /**
             * 延迟时间
             */
            public Builder noticeTime(Integer noticeTime) {
                this.noticeTime = noticeTime;
                return this;
            }

            /**
             * 消息群
             */
            public Builder serviceGroupList(java.util.List < UnFinishEscalationPlanServiceGroupList> serviceGroupList) {
                this.serviceGroupList = serviceGroupList;
                return this;
            }

            /**
             * 开始时间
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * 规则触发状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public UnFinishEscalationPlan build() {
                return new UnFinishEscalationPlan(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("escalationPlanId")
        private Long escalationPlanId;

        @NameInMap("escalationPlanName")
        private String escalationPlanName;

        @NameInMap("nuAcknowledgeEscalationPlan")
        private java.util.List < NuAcknowledgeEscalationPlan> nuAcknowledgeEscalationPlan;

        @NameInMap("unFinishEscalationPlan")
        private java.util.List < UnFinishEscalationPlan> unFinishEscalationPlan;

        private Data(Builder builder) {
            this.escalationPlanId = builder.escalationPlanId;
            this.escalationPlanName = builder.escalationPlanName;
            this.nuAcknowledgeEscalationPlan = builder.nuAcknowledgeEscalationPlan;
            this.unFinishEscalationPlan = builder.unFinishEscalationPlan;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return escalationPlanId
         */
        public Long getEscalationPlanId() {
            return this.escalationPlanId;
        }

        /**
         * @return escalationPlanName
         */
        public String getEscalationPlanName() {
            return this.escalationPlanName;
        }

        /**
         * @return nuAcknowledgeEscalationPlan
         */
        public java.util.List < NuAcknowledgeEscalationPlan> getNuAcknowledgeEscalationPlan() {
            return this.nuAcknowledgeEscalationPlan;
        }

        /**
         * @return unFinishEscalationPlan
         */
        public java.util.List < UnFinishEscalationPlan> getUnFinishEscalationPlan() {
            return this.unFinishEscalationPlan;
        }

        public static final class Builder {
            private Long escalationPlanId; 
            private String escalationPlanName; 
            private java.util.List < NuAcknowledgeEscalationPlan> nuAcknowledgeEscalationPlan; 
            private java.util.List < UnFinishEscalationPlan> unFinishEscalationPlan; 

            /**
             * 升级策略ID
             */
            public Builder escalationPlanId(Long escalationPlanId) {
                this.escalationPlanId = escalationPlanId;
                return this;
            }

            /**
             * 升级策略名称
             */
            public Builder escalationPlanName(String escalationPlanName) {
                this.escalationPlanName = escalationPlanName;
                return this;
            }

            /**
             * 未响应升级策略
             */
            public Builder nuAcknowledgeEscalationPlan(java.util.List < NuAcknowledgeEscalationPlan> nuAcknowledgeEscalationPlan) {
                this.nuAcknowledgeEscalationPlan = nuAcknowledgeEscalationPlan;
                return this;
            }

            /**
             * 未完结升级策略规则列表
             */
            public Builder unFinishEscalationPlan(java.util.List < UnFinishEscalationPlan> unFinishEscalationPlan) {
                this.unFinishEscalationPlan = unFinishEscalationPlan;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
