// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIncidentDetailEscalationPlansResponseBody} extends {@link TeaModel}
 *
 * <p>ListIncidentDetailEscalationPlansResponseBody</p>
 */
public class ListIncidentDetailEscalationPlansResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
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
        @com.aliyun.core.annotation.NameInMap("noticeObjectId")
        private Long noticeObjectId;

        @com.aliyun.core.annotation.NameInMap("noticeObjectName")
        private String noticeObjectName;

        @com.aliyun.core.annotation.NameInMap("noticeObjectPhone")
        private String noticeObjectPhone;

        @com.aliyun.core.annotation.NameInMap("roleNameList")
        private java.util.List < String > roleNameList;

        private NoticeObjectList(Builder builder) {
            this.noticeObjectId = builder.noticeObjectId;
            this.noticeObjectName = builder.noticeObjectName;
            this.noticeObjectPhone = builder.noticeObjectPhone;
            this.roleNameList = builder.roleNameList;
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

        /**
         * @return roleNameList
         */
        public java.util.List < String > getRoleNameList() {
            return this.roleNameList;
        }

        public static final class Builder {
            private Long noticeObjectId; 
            private String noticeObjectName; 
            private String noticeObjectPhone; 
            private java.util.List < String > roleNameList; 

            /**
             * noticeObjectId.
             */
            public Builder noticeObjectId(Long noticeObjectId) {
                this.noticeObjectId = noticeObjectId;
                return this;
            }

            /**
             * noticeObjectName.
             */
            public Builder noticeObjectName(String noticeObjectName) {
                this.noticeObjectName = noticeObjectName;
                return this;
            }

            /**
             * noticeObjectPhone.
             */
            public Builder noticeObjectPhone(String noticeObjectPhone) {
                this.noticeObjectPhone = noticeObjectPhone;
                return this;
            }

            /**
             * roleNameList.
             */
            public Builder roleNameList(java.util.List < String > roleNameList) {
                this.roleNameList = roleNameList;
                return this;
            }

            public NoticeObjectList build() {
                return new NoticeObjectList(this);
            } 

        } 

    }
    public static class ServiceGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
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
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
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
    public static class ConvergenceEscalationPlan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("escalationPlanType")
        private String escalationPlanType;

        @com.aliyun.core.annotation.NameInMap("noticeChannels")
        private java.util.List < String > noticeChannels;

        @com.aliyun.core.annotation.NameInMap("noticeObjectList")
        private java.util.List < NoticeObjectList> noticeObjectList;

        @com.aliyun.core.annotation.NameInMap("noticeTime")
        private Long noticeTime;

        @com.aliyun.core.annotation.NameInMap("serviceGroupList")
        private java.util.List < ServiceGroupList> serviceGroupList;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private ConvergenceEscalationPlan(Builder builder) {
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

        public static ConvergenceEscalationPlan create() {
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
             * escalationPlanType.
             */
            public Builder escalationPlanType(String escalationPlanType) {
                this.escalationPlanType = escalationPlanType;
                return this;
            }

            /**
             * noticeChannels.
             */
            public Builder noticeChannels(java.util.List < String > noticeChannels) {
                this.noticeChannels = noticeChannels;
                return this;
            }

            /**
             * noticeObjectList.
             */
            public Builder noticeObjectList(java.util.List < NoticeObjectList> noticeObjectList) {
                this.noticeObjectList = noticeObjectList;
                return this;
            }

            /**
             * noticeTime.
             */
            public Builder noticeTime(Long noticeTime) {
                this.noticeTime = noticeTime;
                return this;
            }

            /**
             * serviceGroupList.
             */
            public Builder serviceGroupList(java.util.List < ServiceGroupList> serviceGroupList) {
                this.serviceGroupList = serviceGroupList;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ConvergenceEscalationPlan build() {
                return new ConvergenceEscalationPlan(this);
            } 

        } 

    }
    public static class NuAcknowledgeEscalationPlanNoticeObjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("noticeObjectId")
        private Long noticeObjectId;

        @com.aliyun.core.annotation.NameInMap("noticeObjectName")
        private String noticeObjectName;

        @com.aliyun.core.annotation.NameInMap("noticeObjectPhone")
        private String noticeObjectPhone;

        @com.aliyun.core.annotation.NameInMap("roleNameList")
        private java.util.List < String > roleNameList;

        private NuAcknowledgeEscalationPlanNoticeObjectList(Builder builder) {
            this.noticeObjectId = builder.noticeObjectId;
            this.noticeObjectName = builder.noticeObjectName;
            this.noticeObjectPhone = builder.noticeObjectPhone;
            this.roleNameList = builder.roleNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NuAcknowledgeEscalationPlanNoticeObjectList create() {
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

        /**
         * @return roleNameList
         */
        public java.util.List < String > getRoleNameList() {
            return this.roleNameList;
        }

        public static final class Builder {
            private Long noticeObjectId; 
            private String noticeObjectName; 
            private String noticeObjectPhone; 
            private java.util.List < String > roleNameList; 

            /**
             * noticeObjectId.
             */
            public Builder noticeObjectId(Long noticeObjectId) {
                this.noticeObjectId = noticeObjectId;
                return this;
            }

            /**
             * noticeObjectName.
             */
            public Builder noticeObjectName(String noticeObjectName) {
                this.noticeObjectName = noticeObjectName;
                return this;
            }

            /**
             * noticeObjectPhone.
             */
            public Builder noticeObjectPhone(String noticeObjectPhone) {
                this.noticeObjectPhone = noticeObjectPhone;
                return this;
            }

            /**
             * roleNameList.
             */
            public Builder roleNameList(java.util.List < String > roleNameList) {
                this.roleNameList = roleNameList;
                return this;
            }

            public NuAcknowledgeEscalationPlanNoticeObjectList build() {
                return new NuAcknowledgeEscalationPlanNoticeObjectList(this);
            } 

        } 

    }
    public static class NoticeRoleObjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private NoticeRoleObjectList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NoticeRoleObjectList create() {
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
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public NoticeRoleObjectList build() {
                return new NoticeRoleObjectList(this);
            } 

        } 

    }
    public static class NuAcknowledgeEscalationPlanServiceGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private NuAcknowledgeEscalationPlanServiceGroupList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NuAcknowledgeEscalationPlanServiceGroupList create() {
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
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public NuAcknowledgeEscalationPlanServiceGroupList build() {
                return new NuAcknowledgeEscalationPlanServiceGroupList(this);
            } 

        } 

    }
    public static class NuAcknowledgeEscalationPlan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("escalationPlanType")
        private String escalationPlanType;

        @com.aliyun.core.annotation.NameInMap("noticeChannels")
        private java.util.List < String > noticeChannels;

        @com.aliyun.core.annotation.NameInMap("noticeObjectList")
        private java.util.List < NuAcknowledgeEscalationPlanNoticeObjectList> noticeObjectList;

        @com.aliyun.core.annotation.NameInMap("noticeRoleList")
        private java.util.List < Long > noticeRoleList;

        @com.aliyun.core.annotation.NameInMap("noticeRoleObjectList")
        private java.util.List < NoticeRoleObjectList> noticeRoleObjectList;

        @com.aliyun.core.annotation.NameInMap("noticeTime")
        private Long noticeTime;

        @com.aliyun.core.annotation.NameInMap("serviceGroupList")
        private java.util.List < NuAcknowledgeEscalationPlanServiceGroupList> serviceGroupList;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private NuAcknowledgeEscalationPlan(Builder builder) {
            this.escalationPlanType = builder.escalationPlanType;
            this.noticeChannels = builder.noticeChannels;
            this.noticeObjectList = builder.noticeObjectList;
            this.noticeRoleList = builder.noticeRoleList;
            this.noticeRoleObjectList = builder.noticeRoleObjectList;
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
        public java.util.List < NuAcknowledgeEscalationPlanNoticeObjectList> getNoticeObjectList() {
            return this.noticeObjectList;
        }

        /**
         * @return noticeRoleList
         */
        public java.util.List < Long > getNoticeRoleList() {
            return this.noticeRoleList;
        }

        /**
         * @return noticeRoleObjectList
         */
        public java.util.List < NoticeRoleObjectList> getNoticeRoleObjectList() {
            return this.noticeRoleObjectList;
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
        public java.util.List < NuAcknowledgeEscalationPlanServiceGroupList> getServiceGroupList() {
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
            private java.util.List < NuAcknowledgeEscalationPlanNoticeObjectList> noticeObjectList; 
            private java.util.List < Long > noticeRoleList; 
            private java.util.List < NoticeRoleObjectList> noticeRoleObjectList; 
            private Long noticeTime; 
            private java.util.List < NuAcknowledgeEscalationPlanServiceGroupList> serviceGroupList; 
            private Long startTime; 
            private String status; 

            /**
             * escalationPlanType.
             */
            public Builder escalationPlanType(String escalationPlanType) {
                this.escalationPlanType = escalationPlanType;
                return this;
            }

            /**
             * noticeChannels.
             */
            public Builder noticeChannels(java.util.List < String > noticeChannels) {
                this.noticeChannels = noticeChannels;
                return this;
            }

            /**
             * noticeObjectList.
             */
            public Builder noticeObjectList(java.util.List < NuAcknowledgeEscalationPlanNoticeObjectList> noticeObjectList) {
                this.noticeObjectList = noticeObjectList;
                return this;
            }

            /**
             * noticeRoleList.
             */
            public Builder noticeRoleList(java.util.List < Long > noticeRoleList) {
                this.noticeRoleList = noticeRoleList;
                return this;
            }

            /**
             * noticeRoleObjectList.
             */
            public Builder noticeRoleObjectList(java.util.List < NoticeRoleObjectList> noticeRoleObjectList) {
                this.noticeRoleObjectList = noticeRoleObjectList;
                return this;
            }

            /**
             * noticeTime.
             */
            public Builder noticeTime(Long noticeTime) {
                this.noticeTime = noticeTime;
                return this;
            }

            /**
             * serviceGroupList.
             */
            public Builder serviceGroupList(java.util.List < NuAcknowledgeEscalationPlanServiceGroupList> serviceGroupList) {
                this.serviceGroupList = serviceGroupList;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * status.
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
        @com.aliyun.core.annotation.NameInMap("noticeObjectId")
        private Long noticeObjectId;

        @com.aliyun.core.annotation.NameInMap("noticeObjectName")
        private String noticeObjectName;

        @com.aliyun.core.annotation.NameInMap("noticeObjectPhone")
        private String noticeObjectPhone;

        @com.aliyun.core.annotation.NameInMap("roleNameList")
        private java.util.List < String > roleNameList;

        private UnFinishEscalationPlanNoticeObjectList(Builder builder) {
            this.noticeObjectId = builder.noticeObjectId;
            this.noticeObjectName = builder.noticeObjectName;
            this.noticeObjectPhone = builder.noticeObjectPhone;
            this.roleNameList = builder.roleNameList;
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

        /**
         * @return roleNameList
         */
        public java.util.List < String > getRoleNameList() {
            return this.roleNameList;
        }

        public static final class Builder {
            private Long noticeObjectId; 
            private String noticeObjectName; 
            private String noticeObjectPhone; 
            private java.util.List < String > roleNameList; 

            /**
             * noticeObjectId.
             */
            public Builder noticeObjectId(Long noticeObjectId) {
                this.noticeObjectId = noticeObjectId;
                return this;
            }

            /**
             * noticeObjectName.
             */
            public Builder noticeObjectName(String noticeObjectName) {
                this.noticeObjectName = noticeObjectName;
                return this;
            }

            /**
             * noticeObjectPhone.
             */
            public Builder noticeObjectPhone(String noticeObjectPhone) {
                this.noticeObjectPhone = noticeObjectPhone;
                return this;
            }

            /**
             * roleNameList.
             */
            public Builder roleNameList(java.util.List < String > roleNameList) {
                this.roleNameList = roleNameList;
                return this;
            }

            public UnFinishEscalationPlanNoticeObjectList build() {
                return new UnFinishEscalationPlanNoticeObjectList(this);
            } 

        } 

    }
    public static class UnFinishEscalationPlanNoticeRoleObjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private UnFinishEscalationPlanNoticeRoleObjectList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnFinishEscalationPlanNoticeRoleObjectList create() {
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
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public UnFinishEscalationPlanNoticeRoleObjectList build() {
                return new UnFinishEscalationPlanNoticeRoleObjectList(this);
            } 

        } 

    }
    public static class UnFinishEscalationPlanServiceGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
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
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
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
        @com.aliyun.core.annotation.NameInMap("escalationPlanType")
        private String escalationPlanType;

        @com.aliyun.core.annotation.NameInMap("noticeChannels")
        private java.util.List < String > noticeChannels;

        @com.aliyun.core.annotation.NameInMap("noticeObjectList")
        private java.util.List < UnFinishEscalationPlanNoticeObjectList> noticeObjectList;

        @com.aliyun.core.annotation.NameInMap("noticeRoleList")
        private java.util.List < Long > noticeRoleList;

        @com.aliyun.core.annotation.NameInMap("noticeRoleObjectList")
        private java.util.List < UnFinishEscalationPlanNoticeRoleObjectList> noticeRoleObjectList;

        @com.aliyun.core.annotation.NameInMap("noticeTime")
        private Integer noticeTime;

        @com.aliyun.core.annotation.NameInMap("serviceGroupList")
        private java.util.List < UnFinishEscalationPlanServiceGroupList> serviceGroupList;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private UnFinishEscalationPlan(Builder builder) {
            this.escalationPlanType = builder.escalationPlanType;
            this.noticeChannels = builder.noticeChannels;
            this.noticeObjectList = builder.noticeObjectList;
            this.noticeRoleList = builder.noticeRoleList;
            this.noticeRoleObjectList = builder.noticeRoleObjectList;
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
         * @return noticeRoleList
         */
        public java.util.List < Long > getNoticeRoleList() {
            return this.noticeRoleList;
        }

        /**
         * @return noticeRoleObjectList
         */
        public java.util.List < UnFinishEscalationPlanNoticeRoleObjectList> getNoticeRoleObjectList() {
            return this.noticeRoleObjectList;
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
            private java.util.List < Long > noticeRoleList; 
            private java.util.List < UnFinishEscalationPlanNoticeRoleObjectList> noticeRoleObjectList; 
            private Integer noticeTime; 
            private java.util.List < UnFinishEscalationPlanServiceGroupList> serviceGroupList; 
            private Long startTime; 
            private String status; 

            /**
             * escalationPlanType.
             */
            public Builder escalationPlanType(String escalationPlanType) {
                this.escalationPlanType = escalationPlanType;
                return this;
            }

            /**
             * noticeChannels.
             */
            public Builder noticeChannels(java.util.List < String > noticeChannels) {
                this.noticeChannels = noticeChannels;
                return this;
            }

            /**
             * noticeObjectList.
             */
            public Builder noticeObjectList(java.util.List < UnFinishEscalationPlanNoticeObjectList> noticeObjectList) {
                this.noticeObjectList = noticeObjectList;
                return this;
            }

            /**
             * noticeRoleList.
             */
            public Builder noticeRoleList(java.util.List < Long > noticeRoleList) {
                this.noticeRoleList = noticeRoleList;
                return this;
            }

            /**
             * noticeRoleObjectList.
             */
            public Builder noticeRoleObjectList(java.util.List < UnFinishEscalationPlanNoticeRoleObjectList> noticeRoleObjectList) {
                this.noticeRoleObjectList = noticeRoleObjectList;
                return this;
            }

            /**
             * noticeTime.
             */
            public Builder noticeTime(Integer noticeTime) {
                this.noticeTime = noticeTime;
                return this;
            }

            /**
             * serviceGroupList.
             */
            public Builder serviceGroupList(java.util.List < UnFinishEscalationPlanServiceGroupList> serviceGroupList) {
                this.serviceGroupList = serviceGroupList;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * status.
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
        @com.aliyun.core.annotation.NameInMap("convergenceEscalationPlan")
        private java.util.List < ConvergenceEscalationPlan> convergenceEscalationPlan;

        @com.aliyun.core.annotation.NameInMap("escalationPlanId")
        private Long escalationPlanId;

        @com.aliyun.core.annotation.NameInMap("escalationPlanName")
        private String escalationPlanName;

        @com.aliyun.core.annotation.NameInMap("nuAcknowledgeEscalationPlan")
        private java.util.List < NuAcknowledgeEscalationPlan> nuAcknowledgeEscalationPlan;

        @com.aliyun.core.annotation.NameInMap("unFinishEscalationPlan")
        private java.util.List < UnFinishEscalationPlan> unFinishEscalationPlan;

        private Data(Builder builder) {
            this.convergenceEscalationPlan = builder.convergenceEscalationPlan;
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
         * @return convergenceEscalationPlan
         */
        public java.util.List < ConvergenceEscalationPlan> getConvergenceEscalationPlan() {
            return this.convergenceEscalationPlan;
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
            private java.util.List < ConvergenceEscalationPlan> convergenceEscalationPlan; 
            private Long escalationPlanId; 
            private String escalationPlanName; 
            private java.util.List < NuAcknowledgeEscalationPlan> nuAcknowledgeEscalationPlan; 
            private java.util.List < UnFinishEscalationPlan> unFinishEscalationPlan; 

            /**
             * convergenceEscalationPlan.
             */
            public Builder convergenceEscalationPlan(java.util.List < ConvergenceEscalationPlan> convergenceEscalationPlan) {
                this.convergenceEscalationPlan = convergenceEscalationPlan;
                return this;
            }

            /**
             * escalationPlanId.
             */
            public Builder escalationPlanId(Long escalationPlanId) {
                this.escalationPlanId = escalationPlanId;
                return this;
            }

            /**
             * escalationPlanName.
             */
            public Builder escalationPlanName(String escalationPlanName) {
                this.escalationPlanName = escalationPlanName;
                return this;
            }

            /**
             * nuAcknowledgeEscalationPlan.
             */
            public Builder nuAcknowledgeEscalationPlan(java.util.List < NuAcknowledgeEscalationPlan> nuAcknowledgeEscalationPlan) {
                this.nuAcknowledgeEscalationPlan = nuAcknowledgeEscalationPlan;
                return this;
            }

            /**
             * unFinishEscalationPlan.
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
