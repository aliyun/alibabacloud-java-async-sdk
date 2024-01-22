// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHistoryEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHistoryEventsResponseBody</p>
 */
public class DescribeHistoryEventsResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeHistoryEventsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHistoryEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
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
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The events.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The page number. Valid values: any non-zero positive integer. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 30.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHistoryEventsResponseBody build() {
            return new DescribeHistoryEventsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CmsProduct")
        private String cmsProduct;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("DetailImpact")
        private String detailImpact;

        @NameInMap("DetailReason")
        private String detailReason;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("EventCategory")
        private String eventCategory;

        @NameInMap("EventCode")
        private String eventCode;

        @NameInMap("EventDetail")
        private String eventDetail;

        @NameInMap("EventId")
        private String eventId;

        @NameInMap("EventImpact")
        private String eventImpact;

        @NameInMap("EventLevel")
        private String eventLevel;

        @NameInMap("EventReason")
        private String eventReason;

        @NameInMap("EventStatus")
        private String eventStatus;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("GmtCreated")
        private String gmtCreated;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("HandleStatus")
        private String handleStatus;

        @NameInMap("HasLifeCycle")
        private Integer hasLifeCycle;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("IsClosed")
        private Integer isClosed;

        @NameInMap("Product")
        private String product;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Uid")
        private String uid;

        private Data(Builder builder) {
            this.cmsProduct = builder.cmsProduct;
            this.dbType = builder.dbType;
            this.detailImpact = builder.detailImpact;
            this.detailReason = builder.detailReason;
            this.endTime = builder.endTime;
            this.eventCategory = builder.eventCategory;
            this.eventCode = builder.eventCode;
            this.eventDetail = builder.eventDetail;
            this.eventId = builder.eventId;
            this.eventImpact = builder.eventImpact;
            this.eventLevel = builder.eventLevel;
            this.eventReason = builder.eventReason;
            this.eventStatus = builder.eventStatus;
            this.eventType = builder.eventType;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.handleStatus = builder.handleStatus;
            this.hasLifeCycle = builder.hasLifeCycle;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.isClosed = builder.isClosed;
            this.product = builder.product;
            this.regionId = builder.regionId;
            this.resourceType = builder.resourceType;
            this.sourceType = builder.sourceType;
            this.startTime = builder.startTime;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cmsProduct
         */
        public String getCmsProduct() {
            return this.cmsProduct;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return detailImpact
         */
        public String getDetailImpact() {
            return this.detailImpact;
        }

        /**
         * @return detailReason
         */
        public String getDetailReason() {
            return this.detailReason;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return eventCategory
         */
        public String getEventCategory() {
            return this.eventCategory;
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventDetail
         */
        public String getEventDetail() {
            return this.eventDetail;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventImpact
         */
        public String getEventImpact() {
            return this.eventImpact;
        }

        /**
         * @return eventLevel
         */
        public String getEventLevel() {
            return this.eventLevel;
        }

        /**
         * @return eventReason
         */
        public String getEventReason() {
            return this.eventReason;
        }

        /**
         * @return eventStatus
         */
        public String getEventStatus() {
            return this.eventStatus;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return handleStatus
         */
        public String getHandleStatus() {
            return this.handleStatus;
        }

        /**
         * @return hasLifeCycle
         */
        public Integer getHasLifeCycle() {
            return this.hasLifeCycle;
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

        /**
         * @return isClosed
         */
        public Integer getIsClosed() {
            return this.isClosed;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String cmsProduct; 
            private String dbType; 
            private String detailImpact; 
            private String detailReason; 
            private String endTime; 
            private String eventCategory; 
            private String eventCode; 
            private String eventDetail; 
            private String eventId; 
            private String eventImpact; 
            private String eventLevel; 
            private String eventReason; 
            private String eventStatus; 
            private String eventType; 
            private String gmtCreated; 
            private String gmtModified; 
            private String handleStatus; 
            private Integer hasLifeCycle; 
            private String instanceId; 
            private String instanceName; 
            private Integer isClosed; 
            private String product; 
            private String regionId; 
            private String resourceType; 
            private String sourceType; 
            private String startTime; 
            private String uid; 

            /**
             * The cloud service type of the application group. Valid values: **web** and native. The value web indicates a web application. The value **native** indicates a local application.
             */
            public Builder cmsProduct(String cmsProduct) {
                this.cmsProduct = cmsProduct;
                return this;
            }

            /**
             * The database engine.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The pagination parameter.
             */
            public Builder detailImpact(String detailImpact) {
                this.detailImpact = detailImpact;
                return this;
            }

            /**
             * The details of the instance operation.
             */
            public Builder detailReason(String detailReason) {
                this.detailReason = detailReason;
                return this;
            }

            /**
             * The time when the alert was closed. The time follows the ISO 8601 standard in the *yyyy-mm-dd*t*hh:mm*z format. The time is displayed in UTC.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The system event category. For more information, see [View the event history of an ApsaraDB RDS instance](~~129759~~).
             */
            public Builder eventCategory(String eventCategory) {
                this.eventCategory = eventCategory;
                return this;
            }

            /**
             * The event code.
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * The event details.
             */
            public Builder eventDetail(String eventDetail) {
                this.eventDetail = eventDetail;
                return this;
            }

            /**
             * The event ID.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * The event impact.
             */
            public Builder eventImpact(String eventImpact) {
                this.eventImpact = eventImpact;
                return this;
            }

            /**
             * The event level. For more information, see [View the event history of an ApsaraDB RDS instance](~~129759~~).
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * The event source.
             */
            public Builder eventReason(String eventReason) {
                this.eventReason = eventReason;
                return this;
            }

            /**
             * The status of the alert event. Valid values:
             * <p>
             * 
             * *   **1**: pending
             * *   **2**: ignored
             * *   **4**: confirmed
             * *   **8**: marked as false positive
             * *   **16**: handling
             * *   **32**: handled
             * *   **64**: expired
             */
            public Builder eventStatus(String eventStatus) {
                this.eventStatus = eventStatus;
                return this;
            }

            /**
             * The event type. Valid values:
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * The creation time. The time follows the ISO 8601 standard in the *yyyy-mm-dd*t*hh:mm*z format. The time is displayed in UTC.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * The update time. The time follows the ISO 8601 standard in the *yyyy-mm-dd*t*hh:mm*z format. The time is displayed in UTC.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The handling status.
             */
            public Builder handleStatus(String handleStatus) {
                this.handleStatus = handleStatus;
                return this;
            }

            /**
             * Indicates whether the event has a lifecycle.
             */
            public Builder hasLifeCycle(Integer hasLifeCycle) {
                this.hasLifeCycle = hasLifeCycle;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The instance name.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Indicates whether the alert is closed. Valid values: **0**: closed. **1**: not closed.
             */
            public Builder isClosed(Integer isClosed) {
                this.isClosed = isClosed;
                return this;
            }

            /**
             * The service name.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * The region ID. You can call the DescribeRegions operation to query the most recent region list.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The resource type. The value is fixed as **INSTANCE**.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The type of the source data.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * The start time. The time follows the ISO 8601 standard in the *yyyy-mm-dd*t*hh:mm*z format. The time is displayed in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The ID of the resource owner.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("Data")
        private Data data;

        @NameInMap("Id")
        private String id;

        @NameInMap("Region")
        private String region;

        @NameInMap("Source")
        private String source;

        @NameInMap("Specversion")
        private String specversion;

        @NameInMap("Subject")
        private String subject;

        @NameInMap("Time")
        private String time;

        @NameInMap("Type")
        private String type;

        private Items(Builder builder) {
            this.data = builder.data;
            this.id = builder.id;
            this.region = builder.region;
            this.source = builder.source;
            this.specversion = builder.specversion;
            this.subject = builder.subject;
            this.time = builder.time;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return specversion
         */
        public String getSpecversion() {
            return this.specversion;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Data data; 
            private String id; 
            private String region; 
            private String source; 
            private String specversion; 
            private String subject; 
            private String time; 
            private String type; 

            /**
             * The details of the data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * The task ID
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The event source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The database engine version.
             */
            public Builder specversion(String specversion) {
                this.specversion = specversion;
                return this;
            }

            /**
             * The name of the pending event.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * The amount of time that has elapsed from the start time of the query. Unit: seconds.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * The event type. For more information, see [View the event history of an ApsaraDB RDS instance](~~129759~~).
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
