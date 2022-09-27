// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceHistoryEventsRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceHistoryEventsRequest</p>
 */
public class ListInstanceHistoryEventsRequest extends Request {
    @Query
    @NameInMap("eventCreateEndTime")
    private String eventCreateEndTime;

    @Query
    @NameInMap("eventCreateStartTime")
    private String eventCreateStartTime;

    @Query
    @NameInMap("eventCycleStatus")
    private java.util.List < String > eventCycleStatus;

    @Query
    @NameInMap("eventExecuteEndTime")
    private String eventExecuteEndTime;

    @Query
    @NameInMap("eventExecuteStartTime")
    private String eventExecuteStartTime;

    @Query
    @NameInMap("eventFinashEndTime")
    private String eventFinashEndTime;

    @Query
    @NameInMap("eventFinashStartTime")
    private String eventFinashStartTime;

    @Query
    @NameInMap("eventLevel")
    private java.util.List < String > eventLevel;

    @Query
    @NameInMap("eventType")
    private java.util.List < String > eventType;

    @Query
    @NameInMap("instanceId")
    private String instanceId;

    @Query
    @NameInMap("nodeIP")
    private String nodeIP;

    @Query
    @NameInMap("page")
    private Integer page;

    @Query
    @NameInMap("size")
    private Integer size;

    private ListInstanceHistoryEventsRequest(Builder builder) {
        super(builder);
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

}
