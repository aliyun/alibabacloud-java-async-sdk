// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceHistoryEventsRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceHistoryEventsRequest</p>
 */
public class ListInstanceHistoryEventsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List < ListInstanceHistoryEventsRequestBody> body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCreateEndTime")
    private String eventCreateEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCreateStartTime")
    private String eventCreateStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCycleStatus")
    private java.util.List < String > eventCycleStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventExecuteEndTime")
    private String eventExecuteEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventExecuteStartTime")
    private String eventExecuteStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventFinashEndTime")
    private String eventFinashEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventFinashStartTime")
    private String eventFinashStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventLevel")
    private java.util.List < String > eventLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventType")
    private java.util.List < String > eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nodeIP")
    private String nodeIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    private ListInstanceHistoryEventsRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.eventCreateEndTime = builder.eventCreateEndTime;
        this.eventCreateStartTime = builder.eventCreateStartTime;
        this.eventCycleStatus = builder.eventCycleStatus;
        this.eventExecuteEndTime = builder.eventExecuteEndTime;
        this.eventExecuteStartTime = builder.eventExecuteStartTime;
        this.eventFinashEndTime = builder.eventFinashEndTime;
        this.eventFinashStartTime = builder.eventFinashStartTime;
        this.eventLevel = builder.eventLevel;
        this.eventType = builder.eventType;
        this.instanceId = builder.instanceId;
        this.nodeIP = builder.nodeIP;
        this.page = builder.page;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceHistoryEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public java.util.List < ListInstanceHistoryEventsRequestBody> getBody() {
        return this.body;
    }

    /**
     * @return eventCreateEndTime
     */
    public String getEventCreateEndTime() {
        return this.eventCreateEndTime;
    }

    /**
     * @return eventCreateStartTime
     */
    public String getEventCreateStartTime() {
        return this.eventCreateStartTime;
    }

    /**
     * @return eventCycleStatus
     */
    public java.util.List < String > getEventCycleStatus() {
        return this.eventCycleStatus;
    }

    /**
     * @return eventExecuteEndTime
     */
    public String getEventExecuteEndTime() {
        return this.eventExecuteEndTime;
    }

    /**
     * @return eventExecuteStartTime
     */
    public String getEventExecuteStartTime() {
        return this.eventExecuteStartTime;
    }

    /**
     * @return eventFinashEndTime
     */
    public String getEventFinashEndTime() {
        return this.eventFinashEndTime;
    }

    /**
     * @return eventFinashStartTime
     */
    public String getEventFinashStartTime() {
        return this.eventFinashStartTime;
    }

    /**
     * @return eventLevel
     */
    public java.util.List < String > getEventLevel() {
        return this.eventLevel;
    }

    /**
     * @return eventType
     */
    public java.util.List < String > getEventType() {
        return this.eventType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeIP
     */
    public String getNodeIP() {
        return this.nodeIP;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListInstanceHistoryEventsRequest, Builder> {
        private java.util.List < ListInstanceHistoryEventsRequestBody> body; 
        private String eventCreateEndTime; 
        private String eventCreateStartTime; 
        private java.util.List < String > eventCycleStatus; 
        private String eventExecuteEndTime; 
        private String eventExecuteStartTime; 
        private String eventFinashEndTime; 
        private String eventFinashStartTime; 
        private java.util.List < String > eventLevel; 
        private java.util.List < String > eventType; 
        private String instanceId; 
        private String nodeIP; 
        private Integer page; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceHistoryEventsRequest request) {
            super(request);
            this.body = request.body;
            this.eventCreateEndTime = request.eventCreateEndTime;
            this.eventCreateStartTime = request.eventCreateStartTime;
            this.eventCycleStatus = request.eventCycleStatus;
            this.eventExecuteEndTime = request.eventExecuteEndTime;
            this.eventExecuteStartTime = request.eventExecuteStartTime;
            this.eventFinashEndTime = request.eventFinashEndTime;
            this.eventFinashStartTime = request.eventFinashStartTime;
            this.eventLevel = request.eventLevel;
            this.eventType = request.eventType;
            this.instanceId = request.instanceId;
            this.nodeIP = request.nodeIP;
            this.page = request.page;
            this.size = request.size;
        } 

        /**
         * body.
         */
        public Builder body(java.util.List < ListInstanceHistoryEventsRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * eventCreateEndTime.
         */
        public Builder eventCreateEndTime(String eventCreateEndTime) {
            this.putQueryParameter("eventCreateEndTime", eventCreateEndTime);
            this.eventCreateEndTime = eventCreateEndTime;
            return this;
        }

        /**
         * eventCreateStartTime.
         */
        public Builder eventCreateStartTime(String eventCreateStartTime) {
            this.putQueryParameter("eventCreateStartTime", eventCreateStartTime);
            this.eventCreateStartTime = eventCreateStartTime;
            return this;
        }

        /**
         * eventCycleStatus.
         */
        public Builder eventCycleStatus(java.util.List < String > eventCycleStatus) {
            String eventCycleStatusShrink = shrink(eventCycleStatus, "eventCycleStatus", "simple");
            this.putQueryParameter("eventCycleStatus", eventCycleStatusShrink);
            this.eventCycleStatus = eventCycleStatus;
            return this;
        }

        /**
         * eventExecuteEndTime.
         */
        public Builder eventExecuteEndTime(String eventExecuteEndTime) {
            this.putQueryParameter("eventExecuteEndTime", eventExecuteEndTime);
            this.eventExecuteEndTime = eventExecuteEndTime;
            return this;
        }

        /**
         * eventExecuteStartTime.
         */
        public Builder eventExecuteStartTime(String eventExecuteStartTime) {
            this.putQueryParameter("eventExecuteStartTime", eventExecuteStartTime);
            this.eventExecuteStartTime = eventExecuteStartTime;
            return this;
        }

        /**
         * eventFinashEndTime.
         */
        public Builder eventFinashEndTime(String eventFinashEndTime) {
            this.putQueryParameter("eventFinashEndTime", eventFinashEndTime);
            this.eventFinashEndTime = eventFinashEndTime;
            return this;
        }

        /**
         * eventFinashStartTime.
         */
        public Builder eventFinashStartTime(String eventFinashStartTime) {
            this.putQueryParameter("eventFinashStartTime", eventFinashStartTime);
            this.eventFinashStartTime = eventFinashStartTime;
            return this;
        }

        /**
         * eventLevel.
         */
        public Builder eventLevel(java.util.List < String > eventLevel) {
            String eventLevelShrink = shrink(eventLevel, "eventLevel", "simple");
            this.putQueryParameter("eventLevel", eventLevelShrink);
            this.eventLevel = eventLevel;
            return this;
        }

        /**
         * eventType.
         */
        public Builder eventType(java.util.List < String > eventType) {
            String eventTypeShrink = shrink(eventType, "eventType", "simple");
            this.putQueryParameter("eventType", eventTypeShrink);
            this.eventType = eventType;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * nodeIP.
         */
        public Builder nodeIP(String nodeIP) {
            this.putQueryParameter("nodeIP", nodeIP);
            this.nodeIP = nodeIP;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListInstanceHistoryEventsRequest build() {
            return new ListInstanceHistoryEventsRequest(this);
        } 

    } 

    public static class ListInstanceHistoryEventsRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desc")
        private Boolean desc;

        @com.aliyun.core.annotation.NameInMap("sortField")
        private String sortField;

        private ListInstanceHistoryEventsRequestBody(Builder builder) {
            this.desc = builder.desc;
            this.sortField = builder.sortField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListInstanceHistoryEventsRequestBody create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public Boolean getDesc() {
            return this.desc;
        }

        /**
         * @return sortField
         */
        public String getSortField() {
            return this.sortField;
        }

        public static final class Builder {
            private Boolean desc; 
            private String sortField; 

            /**
             * desc.
             */
            public Builder desc(Boolean desc) {
                this.desc = desc;
                return this;
            }

            /**
             * sortField.
             */
            public Builder sortField(String sortField) {
                this.sortField = sortField;
                return this;
            }

            public ListInstanceHistoryEventsRequestBody build() {
                return new ListInstanceHistoryEventsRequestBody(this);
            } 

        } 

    }
}
