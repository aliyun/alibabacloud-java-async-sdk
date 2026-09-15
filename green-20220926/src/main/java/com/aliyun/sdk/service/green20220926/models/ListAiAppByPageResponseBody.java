// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link ListAiAppByPageResponseBody} extends {@link TeaModel}
 *
 * <p>ListAiAppByPageResponseBody</p>
 */
public class ListAiAppByPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAiAppByPageResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAiAppByPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Items> getItems() {
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
        private java.util.List<Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListAiAppByPageResponseBody model) {
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The data on the current page.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
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
         * <p>The ID assigned by the backend to uniquely identify the request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAiAppByPageResponseBody build() {
            return new ListAiAppByPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAiAppByPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAiAppByPageResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("LabelDesc")
        private String labelDesc;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Labels(Builder builder) {
            this.label = builder.label;
            this.labelDesc = builder.labelDesc;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return labelDesc
         */
        public String getLabelDesc() {
            return this.labelDesc;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String label; 
            private String labelDesc; 
            private String type; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.label = model.label;
                this.labelDesc = model.labelDesc;
                this.type = model.type;
            } 

            /**
             * <p>The label name.</p>
             * 
             * <strong>example:</strong>
             * <p>porn</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The label description.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder labelDesc(String labelDesc) {
                this.labelDesc = labelDesc;
                return this;
            }

            /**
             * <p>The type.</p>
             * 
             * <strong>example:</strong>
             * <p>sensitiveData</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAiAppByPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAiAppByPageResponseBody</p>
     */
    public static class RiskEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("EventCount")
        private Long eventCount;

        @com.aliyun.core.annotation.NameInMap("EventDescs")
        private java.util.List<String> eventDescs;

        @com.aliyun.core.annotation.NameInMap("EventIds")
        private java.util.List<String> eventIds;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventStatus")
        private String eventStatus;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        private RiskEvents(Builder builder) {
            this.eventCode = builder.eventCode;
            this.eventCount = builder.eventCount;
            this.eventDescs = builder.eventDescs;
            this.eventIds = builder.eventIds;
            this.eventName = builder.eventName;
            this.eventStatus = builder.eventStatus;
            this.labels = builder.labels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskEvents create() {
            return builder().build();
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventCount
         */
        public Long getEventCount() {
            return this.eventCount;
        }

        /**
         * @return eventDescs
         */
        public java.util.List<String> getEventDescs() {
            return this.eventDescs;
        }

        /**
         * @return eventIds
         */
        public java.util.List<String> getEventIds() {
            return this.eventIds;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventStatus
         */
        public String getEventStatus() {
            return this.eventStatus;
        }

        /**
         * @return labels
         */
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        public static final class Builder {
            private String eventCode; 
            private Long eventCount; 
            private java.util.List<String> eventDescs; 
            private java.util.List<String> eventIds; 
            private String eventName; 
            private String eventStatus; 
            private java.util.List<Labels> labels; 

            private Builder() {
            } 

            private Builder(RiskEvents model) {
                this.eventCode = model.eventCode;
                this.eventCount = model.eventCount;
                this.eventDescs = model.eventDescs;
                this.eventIds = model.eventIds;
                this.eventName = model.eventName;
                this.eventStatus = model.eventStatus;
                this.labels = model.labels;
            } 

            /**
             * <p>The risk event code.</p>
             * 
             * <strong>example:</strong>
             * <p>hit-xxx</p>
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * <p>The number of events.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder eventCount(Long eventCount) {
                this.eventCount = eventCount;
                return this;
            }

            /**
             * <p>The event descriptions.</p>
             */
            public Builder eventDescs(java.util.List<String> eventDescs) {
                this.eventDescs = eventDescs;
                return this;
            }

            /**
             * <p>The list of risk event IDs.</p>
             */
            public Builder eventIds(java.util.List<String> eventIds) {
                this.eventIds = eventIds;
                return this;
            }

            /**
             * <p>The risk event name.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The event status. Valid values:</p>
             * <ul>
             * <li><strong>unhandled</strong>: Unhandled.</li>
             * <li><strong>resolved</strong>: Resolved.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>resolved</p>
             */
            public Builder eventStatus(String eventStatus) {
                this.eventStatus = eventStatus;
                return this;
            }

            /**
             * <p>The list of label items.</p>
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            public RiskEvents build() {
                return new RiskEvents(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAiAppByPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAiAppByPageResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppStatus")
        private String appStatus;

        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("LastTraceTime")
        private String lastTraceTime;

        @com.aliyun.core.annotation.NameInMap("RiskEvents")
        private java.util.List<RiskEvents> riskEvents;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("TraceStatus")
        private String traceStatus;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("WarningCount")
        private Integer warningCount;

        private Items(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appStatus = builder.appStatus;
            this.channel = builder.channel;
            this.lastTraceTime = builder.lastTraceTime;
            this.riskEvents = builder.riskEvents;
            this.riskLevel = builder.riskLevel;
            this.traceStatus = builder.traceStatus;
            this.uid = builder.uid;
            this.warningCount = builder.warningCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appStatus
         */
        public String getAppStatus() {
            return this.appStatus;
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return lastTraceTime
         */
        public String getLastTraceTime() {
            return this.lastTraceTime;
        }

        /**
         * @return riskEvents
         */
        public java.util.List<RiskEvents> getRiskEvents() {
            return this.riskEvents;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return traceStatus
         */
        public String getTraceStatus() {
            return this.traceStatus;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return warningCount
         */
        public Integer getWarningCount() {
            return this.warningCount;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String appStatus; 
            private String channel; 
            private String lastTraceTime; 
            private java.util.List<RiskEvents> riskEvents; 
            private String riskLevel; 
            private String traceStatus; 
            private String uid; 
            private Integer warningCount; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.appStatus = model.appStatus;
                this.channel = model.channel;
                this.lastTraceTime = model.lastTraceTime;
                this.riskEvents = model.riskEvents;
                this.riskLevel = model.riskLevel;
                this.traceStatus = model.traceStatus;
                this.uid = model.uid;
                this.warningCount = model.warningCount;
            } 

            /**
             * <p>appId。</p>
             * 
             * <strong>example:</strong>
             * <p>id-xxx</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>name-xxx</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The application status.</p>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder appStatus(String appStatus) {
                this.appStatus = appStatus;
                return this;
            }

            /**
             * <p>The channel.</p>
             * 
             * <strong>example:</strong>
             * <p>bailian</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>The last active time. Format: YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01 00:00:00</p>
             */
            public Builder lastTraceTime(String lastTraceTime) {
                this.lastTraceTime = lastTraceTime;
                return this;
            }

            /**
             * <p>The risk events.</p>
             */
            public Builder riskEvents(java.util.List<RiskEvents> riskEvents) {
                this.riskEvents = riskEvents;
                return this;
            }

            /**
             * <p>The risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The Tracing Analysis status.</p>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder traceStatus(String traceStatus) {
                this.traceStatus = traceStatus;
                return this;
            }

            /**
             * <p>UID。</p>
             * 
             * <strong>example:</strong>
             * <p>104813*****2399</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * <p>The number of alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder warningCount(Integer warningCount) {
                this.warningCount = warningCount;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
