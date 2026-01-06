// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeHistoryEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHistoryEventsResponseBody</p>
 */
public class DescribeHistoryEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
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
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeHistoryEventsResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHistoryEventsResponseBody build() {
            return new DescribeHistoryEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHistoryEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHistoryEventsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CmsProduct")
        private String cmsProduct;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("DetailImpact")
        private String detailImpact;

        @com.aliyun.core.annotation.NameInMap("DetailReason")
        private String detailReason;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EventCategory")
        private String eventCategory;

        @com.aliyun.core.annotation.NameInMap("EventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("EventDetail")
        private String eventDetail;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventImpact")
        private String eventImpact;

        @com.aliyun.core.annotation.NameInMap("EventLevel")
        private String eventLevel;

        @com.aliyun.core.annotation.NameInMap("EventReason")
        private String eventReason;

        @com.aliyun.core.annotation.NameInMap("EventStatus")
        private String eventStatus;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("HandleStatus")
        private String handleStatus;

        @com.aliyun.core.annotation.NameInMap("HasLifeCycle")
        private Integer hasLifeCycle;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("IsClosed")
        private Integer isClosed;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Uid")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.cmsProduct = model.cmsProduct;
                this.dbType = model.dbType;
                this.detailImpact = model.detailImpact;
                this.detailReason = model.detailReason;
                this.endTime = model.endTime;
                this.eventCategory = model.eventCategory;
                this.eventCode = model.eventCode;
                this.eventDetail = model.eventDetail;
                this.eventId = model.eventId;
                this.eventImpact = model.eventImpact;
                this.eventLevel = model.eventLevel;
                this.eventReason = model.eventReason;
                this.eventStatus = model.eventStatus;
                this.eventType = model.eventType;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.handleStatus = model.handleStatus;
                this.hasLifeCycle = model.hasLifeCycle;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.isClosed = model.isClosed;
                this.product = model.product;
                this.regionId = model.regionId;
                this.resourceType = model.resourceType;
                this.sourceType = model.sourceType;
                this.startTime = model.startTime;
                this.uid = model.uid;
            } 

            /**
             * CmsProduct.
             */
            public Builder cmsProduct(String cmsProduct) {
                this.cmsProduct = cmsProduct;
                return this;
            }

            /**
             * DbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * DetailImpact.
             */
            public Builder detailImpact(String detailImpact) {
                this.detailImpact = detailImpact;
                return this;
            }

            /**
             * DetailReason.
             */
            public Builder detailReason(String detailReason) {
                this.detailReason = detailReason;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EventCategory.
             */
            public Builder eventCategory(String eventCategory) {
                this.eventCategory = eventCategory;
                return this;
            }

            /**
             * EventCode.
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * EventDetail.
             */
            public Builder eventDetail(String eventDetail) {
                this.eventDetail = eventDetail;
                return this;
            }

            /**
             * EventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * EventImpact.
             */
            public Builder eventImpact(String eventImpact) {
                this.eventImpact = eventImpact;
                return this;
            }

            /**
             * EventLevel.
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * EventReason.
             */
            public Builder eventReason(String eventReason) {
                this.eventReason = eventReason;
                return this;
            }

            /**
             * EventStatus.
             */
            public Builder eventStatus(String eventStatus) {
                this.eventStatus = eventStatus;
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
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * HandleStatus.
             */
            public Builder handleStatus(String handleStatus) {
                this.handleStatus = handleStatus;
                return this;
            }

            /**
             * HasLifeCycle.
             */
            public Builder hasLifeCycle(Integer hasLifeCycle) {
                this.hasLifeCycle = hasLifeCycle;
                return this;
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

            /**
             * IsClosed.
             */
            public Builder isClosed(Integer isClosed) {
                this.isClosed = isClosed;
                return this;
            }

            /**
             * Product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Uid.
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
    /**
     * 
     * {@link DescribeHistoryEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHistoryEventsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Specversion")
        private String specversion;

        @com.aliyun.core.annotation.NameInMap("Subject")
        private String subject;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(Items model) {
                this.data = model.data;
                this.id = model.id;
                this.region = model.region;
                this.source = model.source;
                this.specversion = model.specversion;
                this.subject = model.subject;
                this.time = model.time;
                this.type = model.type;
            } 

            /**
             * Data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Specversion.
             */
            public Builder specversion(String specversion) {
                this.specversion = specversion;
                return this;
            }

            /**
             * Subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Type.
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
