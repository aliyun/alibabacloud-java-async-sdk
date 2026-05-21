// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link ListOperationEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperationEventsResponseBody</p>
 */
public class ListOperationEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListOperationEventsResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationEventsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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

    public static final class Builder {
        private java.util.List<Data> data; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListOperationEventsResponseBody model) {
            this.data = model.data;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D3AE84AB-0873-5FC7-A4C4-8CF869D2FA70</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOperationEventsResponseBody build() {
            return new ListOperationEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOperationEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationEventsResponseBody</p>
     */
    public static class FollowerInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        private FollowerInstances(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FollowerInstances create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        public static final class Builder {
            private String instanceId; 
            private String instanceName; 

            private Builder() {
            } 

            private Builder(FollowerInstances model) {
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            public FollowerInstances build() {
                return new FollowerInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOperationEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationEventsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cancelable")
        private Boolean cancelable;

        @com.aliyun.core.annotation.NameInMap("ChangeScheduleTime")
        private Boolean changeScheduleTime;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("FollowerInstances")
        private java.util.List<FollowerInstances> followerInstances;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("MaintainWindow")
        private String maintainWindow;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ScheduleTime")
        private String scheduleTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Data(Builder builder) {
            this.cancelable = builder.cancelable;
            this.changeScheduleTime = builder.changeScheduleTime;
            this.detail = builder.detail;
            this.eventName = builder.eventName;
            this.eventType = builder.eventType;
            this.followerInstances = builder.followerInstances;
            this.id = builder.id;
            this.instanceName = builder.instanceName;
            this.maintainWindow = builder.maintainWindow;
            this.resourceId = builder.resourceId;
            this.scheduleTime = builder.scheduleTime;
            this.state = builder.state;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cancelable
         */
        public Boolean getCancelable() {
            return this.cancelable;
        }

        /**
         * @return changeScheduleTime
         */
        public Boolean getChangeScheduleTime() {
            return this.changeScheduleTime;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
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
         * @return followerInstances
         */
        public java.util.List<FollowerInstances> getFollowerInstances() {
            return this.followerInstances;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return maintainWindow
         */
        public String getMaintainWindow() {
            return this.maintainWindow;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return scheduleTime
         */
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Boolean cancelable; 
            private Boolean changeScheduleTime; 
            private String detail; 
            private String eventName; 
            private String eventType; 
            private java.util.List<FollowerInstances> followerInstances; 
            private String id; 
            private String instanceName; 
            private String maintainWindow; 
            private String resourceId; 
            private String scheduleTime; 
            private String state; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cancelable = model.cancelable;
                this.changeScheduleTime = model.changeScheduleTime;
                this.detail = model.detail;
                this.eventName = model.eventName;
                this.eventType = model.eventType;
                this.followerInstances = model.followerInstances;
                this.id = model.id;
                this.instanceName = model.instanceName;
                this.maintainWindow = model.maintainWindow;
                this.resourceId = model.resourceId;
                this.scheduleTime = model.scheduleTime;
                this.state = model.state;
                this.zoneId = model.zoneId;
            } 

            /**
             * Cancelable.
             */
            public Builder cancelable(Boolean cancelable) {
                this.cancelable = cancelable;
                return this;
            }

            /**
             * ChangeScheduleTime.
             */
            public Builder changeScheduleTime(Boolean changeScheduleTime) {
                this.changeScheduleTime = changeScheduleTime;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
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
             * FollowerInstances.
             */
            public Builder followerInstances(java.util.List<FollowerInstances> followerInstances) {
                this.followerInstances = followerInstances;
                return this;
            }

            /**
             * <p>Id</p>
             * 
             * <strong>example:</strong>
             * <p>1826503661244379138</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * MaintainWindow.
             */
            public Builder maintainWindow(String maintainWindow) {
                this.maintainWindow = maintainWindow;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>ScheduleTime</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-22 15:49:28</p>
             */
            public Builder scheduleTime(String scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * <p>State</p>
             * 
             * <strong>example:</strong>
             * <p>queued</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
