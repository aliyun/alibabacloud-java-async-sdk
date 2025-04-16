// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeDisksFullStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDisksFullStatusResponseBody</p>
 */
public class DescribeDisksFullStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiskFullStatusSet")
    private DiskFullStatusSet diskFullStatusSet;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDisksFullStatusResponseBody(Builder builder) {
        this.diskFullStatusSet = builder.diskFullStatusSet;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDisksFullStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diskFullStatusSet
     */
    public DiskFullStatusSet getDiskFullStatusSet() {
        return this.diskFullStatusSet;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private DiskFullStatusSet diskFullStatusSet; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDisksFullStatusResponseBody model) {
            this.diskFullStatusSet = model.diskFullStatusSet;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The collection of full status information of the EBS devices.</p>
         */
        public Builder diskFullStatusSet(DiskFullStatusSet diskFullStatusSet) {
            this.diskFullStatusSet = diskFullStatusSet;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of EBS devices for which full status information is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDisksFullStatusResponseBody build() {
            return new DescribeDisksFullStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDisksFullStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisksFullStatusResponseBody</p>
     */
    public static class EventType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private EventType(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventType create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer code; 
            private String name; 

            private Builder() {
            } 

            private Builder(EventType model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * <p>The code of the event type.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The name of the event type. Valid values:</p>
             * <ul>
             * <li>Degraded: The performance of the EBS device is degraded.</li>
             * <li>SeverelyDegraded: The performance of the EBS device is severely degraded.</li>
             * <li>Stalled: The performance of the EBS device is severely affected.</li>
             * <li>ErrorDetected: The local disk is damaged.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Stalled</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public EventType build() {
                return new EventType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDisksFullStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisksFullStatusResponseBody</p>
     */
    public static class DiskEventType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventEndTime")
        private String eventEndTime;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private String eventTime;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private EventType eventType;

        @com.aliyun.core.annotation.NameInMap("ImpactLevel")
        private String impactLevel;

        private DiskEventType(Builder builder) {
            this.eventEndTime = builder.eventEndTime;
            this.eventId = builder.eventId;
            this.eventTime = builder.eventTime;
            this.eventType = builder.eventType;
            this.impactLevel = builder.impactLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskEventType create() {
            return builder().build();
        }

        /**
         * @return eventEndTime
         */
        public String getEventEndTime() {
            return this.eventEndTime;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventTime
         */
        public String getEventTime() {
            return this.eventTime;
        }

        /**
         * @return eventType
         */
        public EventType getEventType() {
            return this.eventType;
        }

        /**
         * @return impactLevel
         */
        public String getImpactLevel() {
            return this.impactLevel;
        }

        public static final class Builder {
            private String eventEndTime; 
            private String eventId; 
            private String eventTime; 
            private EventType eventType; 
            private String impactLevel; 

            private Builder() {
            } 

            private Builder(DiskEventType model) {
                this.eventEndTime = model.eventEndTime;
                this.eventId = model.eventId;
                this.eventTime = model.eventTime;
                this.eventType = model.eventType;
                this.impactLevel = model.impactLevel;
            } 

            /**
             * <p>The time when the event ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-05-06T02:48:52Z</p>
             */
            public Builder eventEndTime(String eventEndTime) {
                this.eventEndTime = eventEndTime;
                return this;
            }

            /**
             * <p>The ID of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>e-bp67acfmxazb4p****</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The time when the event occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-05-08T02:43:10Z</p>
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * <p>The type of the event.</p>
             */
            public Builder eventType(EventType eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The impact level of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder impactLevel(String impactLevel) {
                this.impactLevel = impactLevel;
                return this;
            }

            public DiskEventType build() {
                return new DiskEventType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDisksFullStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisksFullStatusResponseBody</p>
     */
    public static class DiskEventSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskEventType")
        private java.util.List<DiskEventType> diskEventType;

        private DiskEventSet(Builder builder) {
            this.diskEventType = builder.diskEventType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskEventSet create() {
            return builder().build();
        }

        /**
         * @return diskEventType
         */
        public java.util.List<DiskEventType> getDiskEventType() {
            return this.diskEventType;
        }

        public static final class Builder {
            private java.util.List<DiskEventType> diskEventType; 

            private Builder() {
            } 

            private Builder(DiskEventSet model) {
                this.diskEventType = model.diskEventType;
            } 

            /**
             * DiskEventType.
             */
            public Builder diskEventType(java.util.List<DiskEventType> diskEventType) {
                this.diskEventType = diskEventType;
                return this;
            }

            public DiskEventSet build() {
                return new DiskEventSet(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDisksFullStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisksFullStatusResponseBody</p>
     */
    public static class HealthStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private HealthStatus(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthStatus create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer code; 
            private String name; 

            private Builder() {
            } 

            private Builder(HealthStatus model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * <p>The code of the health status of the EBS device.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The name of the health status of the EBS device.</p>
             * 
             * <strong>example:</strong>
             * <p>Impaired</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public HealthStatus build() {
                return new HealthStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDisksFullStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisksFullStatusResponseBody</p>
     */
    public static class Status extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Status(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Status create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer code; 
            private String name; 

            private Builder() {
            } 

            private Builder(Status model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * <p>The code of the lifecycle status of the EBS device.</p>
             * 
             * <strong>example:</strong>
             * <p>129</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The name of the lifecycle status of the EBS device.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Status build() {
                return new Status(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDisksFullStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisksFullStatusResponseBody</p>
     */
    public static class DiskFullStatusType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("DiskEventSet")
        private DiskEventSet diskEventSet;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("HealthStatus")
        private HealthStatus healthStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Status status;

        private DiskFullStatusType(Builder builder) {
            this.device = builder.device;
            this.diskEventSet = builder.diskEventSet;
            this.diskId = builder.diskId;
            this.healthStatus = builder.healthStatus;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskFullStatusType create() {
            return builder().build();
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return diskEventSet
         */
        public DiskEventSet getDiskEventSet() {
            return this.diskEventSet;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return healthStatus
         */
        public HealthStatus getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public Status getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String device; 
            private DiskEventSet diskEventSet; 
            private String diskId; 
            private HealthStatus healthStatus; 
            private String instanceId; 
            private Status status; 

            private Builder() {
            } 

            private Builder(DiskFullStatusType model) {
                this.device = model.device;
                this.diskEventSet = model.diskEventSet;
                this.diskId = model.diskId;
                this.healthStatus = model.healthStatus;
                this.instanceId = model.instanceId;
                this.status = model.status;
            } 

            /**
             * <p>The name of the EBS device that is attached to an instance. Example: /dev/xvdb.</p>
             * <p>This parameter has a value only when the value of <code>Status</code> is <code>In_use</code>.</p>
             * <blockquote>
             * <p>This parameter will be deprecated in the future. To ensure future compatibility, we recommend that you do not use this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The events about the EBS device.</p>
             */
            public Builder diskEventSet(DiskEventSet diskEventSet) {
                this.diskEventSet = diskEventSet;
                return this;
            }

            /**
             * <p>The EBS device ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d-bp67acfmxazb4p****</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>The health status of the EBS device.</p>
             */
            public Builder healthStatus(HealthStatus healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp67acfmxazb4p****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The lifecycle status of the EBS device.</p>
             */
            public Builder status(Status status) {
                this.status = status;
                return this;
            }

            public DiskFullStatusType build() {
                return new DiskFullStatusType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDisksFullStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisksFullStatusResponseBody</p>
     */
    public static class DiskFullStatusSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskFullStatusType")
        private java.util.List<DiskFullStatusType> diskFullStatusType;

        private DiskFullStatusSet(Builder builder) {
            this.diskFullStatusType = builder.diskFullStatusType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskFullStatusSet create() {
            return builder().build();
        }

        /**
         * @return diskFullStatusType
         */
        public java.util.List<DiskFullStatusType> getDiskFullStatusType() {
            return this.diskFullStatusType;
        }

        public static final class Builder {
            private java.util.List<DiskFullStatusType> diskFullStatusType; 

            private Builder() {
            } 

            private Builder(DiskFullStatusSet model) {
                this.diskFullStatusType = model.diskFullStatusType;
            } 

            /**
             * DiskFullStatusType.
             */
            public Builder diskFullStatusType(java.util.List<DiskFullStatusType> diskFullStatusType) {
                this.diskFullStatusType = diskFullStatusType;
                return this;
            }

            public DiskFullStatusSet build() {
                return new DiskFullStatusSet(this);
            } 

        } 

    }
}
