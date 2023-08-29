// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventsResponseBody</p>
 */
public class DescribeEventsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeEventsResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List < Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEventsResponseBody build() {
            return new DescribeEventsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("Accumulation")
        private String accumulation;

        @NameInMap("EventAffiliation")
        private String eventAffiliation;

        @NameInMap("EventLevel")
        private String eventLevel;

        @NameInMap("EventStatus")
        private String eventStatus;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("EventUuid")
        private String eventUuid;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtHandle")
        private Long gmtHandle;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("HandleType")
        private String handleType;

        @NameInMap("PropertyName")
        private String propertyName;

        @NameInMap("PropertyPrivateIp")
        private String propertyPrivateIp;

        @NameInMap("PropertyPublicIp")
        private String propertyPublicIp;

        @NameInMap("PropertyUuid")
        private String propertyUuid;

        @NameInMap("Suspect")
        private String suspect;

        @NameInMap("SuspectSig")
        private String suspectSig;

        @NameInMap("SuspectWhiteList")
        private String suspectWhiteList;

        private Items(Builder builder) {
            this.accumulation = builder.accumulation;
            this.eventAffiliation = builder.eventAffiliation;
            this.eventLevel = builder.eventLevel;
            this.eventStatus = builder.eventStatus;
            this.eventType = builder.eventType;
            this.eventUuid = builder.eventUuid;
            this.gmtCreate = builder.gmtCreate;
            this.gmtHandle = builder.gmtHandle;
            this.gmtModified = builder.gmtModified;
            this.handleType = builder.handleType;
            this.propertyName = builder.propertyName;
            this.propertyPrivateIp = builder.propertyPrivateIp;
            this.propertyPublicIp = builder.propertyPublicIp;
            this.propertyUuid = builder.propertyUuid;
            this.suspect = builder.suspect;
            this.suspectSig = builder.suspectSig;
            this.suspectWhiteList = builder.suspectWhiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return accumulation
         */
        public String getAccumulation() {
            return this.accumulation;
        }

        /**
         * @return eventAffiliation
         */
        public String getEventAffiliation() {
            return this.eventAffiliation;
        }

        /**
         * @return eventLevel
         */
        public String getEventLevel() {
            return this.eventLevel;
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
         * @return eventUuid
         */
        public String getEventUuid() {
            return this.eventUuid;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtHandle
         */
        public Long getGmtHandle() {
            return this.gmtHandle;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return handleType
         */
        public String getHandleType() {
            return this.handleType;
        }

        /**
         * @return propertyName
         */
        public String getPropertyName() {
            return this.propertyName;
        }

        /**
         * @return propertyPrivateIp
         */
        public String getPropertyPrivateIp() {
            return this.propertyPrivateIp;
        }

        /**
         * @return propertyPublicIp
         */
        public String getPropertyPublicIp() {
            return this.propertyPublicIp;
        }

        /**
         * @return propertyUuid
         */
        public String getPropertyUuid() {
            return this.propertyUuid;
        }

        /**
         * @return suspect
         */
        public String getSuspect() {
            return this.suspect;
        }

        /**
         * @return suspectSig
         */
        public String getSuspectSig() {
            return this.suspectSig;
        }

        /**
         * @return suspectWhiteList
         */
        public String getSuspectWhiteList() {
            return this.suspectWhiteList;
        }

        public static final class Builder {
            private String accumulation; 
            private String eventAffiliation; 
            private String eventLevel; 
            private String eventStatus; 
            private String eventType; 
            private String eventUuid; 
            private Long gmtCreate; 
            private Long gmtHandle; 
            private Long gmtModified; 
            private String handleType; 
            private String propertyName; 
            private String propertyPrivateIp; 
            private String propertyPublicIp; 
            private String propertyUuid; 
            private String suspect; 
            private String suspectSig; 
            private String suspectWhiteList; 

            /**
             * Accumulation.
             */
            public Builder accumulation(String accumulation) {
                this.accumulation = accumulation;
                return this;
            }

            /**
             * EventAffiliation.
             */
            public Builder eventAffiliation(String eventAffiliation) {
                this.eventAffiliation = eventAffiliation;
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
             * EventUuid.
             */
            public Builder eventUuid(String eventUuid) {
                this.eventUuid = eventUuid;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtHandle.
             */
            public Builder gmtHandle(Long gmtHandle) {
                this.gmtHandle = gmtHandle;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * HandleType.
             */
            public Builder handleType(String handleType) {
                this.handleType = handleType;
                return this;
            }

            /**
             * PropertyName.
             */
            public Builder propertyName(String propertyName) {
                this.propertyName = propertyName;
                return this;
            }

            /**
             * PropertyPrivateIp.
             */
            public Builder propertyPrivateIp(String propertyPrivateIp) {
                this.propertyPrivateIp = propertyPrivateIp;
                return this;
            }

            /**
             * PropertyPublicIp.
             */
            public Builder propertyPublicIp(String propertyPublicIp) {
                this.propertyPublicIp = propertyPublicIp;
                return this;
            }

            /**
             * PropertyUuid.
             */
            public Builder propertyUuid(String propertyUuid) {
                this.propertyUuid = propertyUuid;
                return this;
            }

            /**
             * Suspect.
             */
            public Builder suspect(String suspect) {
                this.suspect = suspect;
                return this;
            }

            /**
             * SuspectSig.
             */
            public Builder suspectSig(String suspectSig) {
                this.suspectSig = suspectSig;
                return this;
            }

            /**
             * SuspectWhiteList.
             */
            public Builder suspectWhiteList(String suspectWhiteList) {
                this.suspectWhiteList = suspectWhiteList;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
