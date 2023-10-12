// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEventsRequest} extends {@link RequestModel}
 *
 * <p>ListEventsRequest</p>
 */
public class ListEventsRequest extends Request {
    @Query
    @NameInMap("AlarmStatus")
    private String alarmStatus;

    @Query
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("EventType")
    private String eventType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MaxResults")
    @Validation(required = true, maximum = 300, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PhysicalSpaceId")
    private String physicalSpaceId;

    private ListEventsRequest(Builder builder) {
        super(builder);
        this.alarmStatus = builder.alarmStatus;
        this.deviceId = builder.deviceId;
        this.eventType = builder.eventType;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.physicalSpaceId = builder.physicalSpaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmStatus
     */
    public String getAlarmStatus() {
        return this.alarmStatus;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return physicalSpaceId
     */
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public static final class Builder extends Request.Builder<ListEventsRequest, Builder> {
        private String alarmStatus; 
        private String deviceId; 
        private String eventType; 
        private String instanceId; 
        private Integer maxResults; 
        private String nextToken; 
        private String physicalSpaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListEventsRequest request) {
            super(request);
            this.alarmStatus = request.alarmStatus;
            this.deviceId = request.deviceId;
            this.eventType = request.eventType;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.physicalSpaceId = request.physicalSpaceId;
        } 

        /**
         * AlarmStatus.
         */
        public Builder alarmStatus(String alarmStatus) {
            this.putQueryParameter("AlarmStatus", alarmStatus);
            this.alarmStatus = alarmStatus;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * EventType.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PhysicalSpaceId.
         */
        public Builder physicalSpaceId(String physicalSpaceId) {
            this.putQueryParameter("PhysicalSpaceId", physicalSpaceId);
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }

        @Override
        public ListEventsRequest build() {
            return new ListEventsRequest(this);
        } 

    } 

}
