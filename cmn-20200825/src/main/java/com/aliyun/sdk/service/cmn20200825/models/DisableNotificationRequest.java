// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableNotificationRequest} extends {@link RequestModel}
 *
 * <p>DisableNotificationRequest</p>
 */
public class DisableNotificationRequest extends Request {
    @Body
    @NameInMap("ExpiryTime")
    @Validation(required = true)
    private String expiryTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("List")
    @Validation(required = true)
    private java.util.List < List> list;

    @Body
    @NameInMap("Reason")
    @Validation(required = true)
    private String reason;

    private DisableNotificationRequest(Builder builder) {
        super(builder);
        this.expiryTime = builder.expiryTime;
        this.instanceId = builder.instanceId;
        this.list = builder.list;
        this.reason = builder.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableNotificationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expiryTime
     */
    public String getExpiryTime() {
        return this.expiryTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    public static final class Builder extends Request.Builder<DisableNotificationRequest, Builder> {
        private String expiryTime; 
        private String instanceId; 
        private java.util.List < List> list; 
        private String reason; 

        private Builder() {
            super();
        } 

        private Builder(DisableNotificationRequest request) {
            super(request);
            this.expiryTime = request.expiryTime;
            this.instanceId = request.instanceId;
            this.list = request.list;
            this.reason = request.reason;
        } 

        /**
         * ExpiryTime.
         */
        public Builder expiryTime(String expiryTime) {
            this.putBodyParameter("ExpiryTime", expiryTime);
            this.expiryTime = expiryTime;
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
         * List.
         */
        public Builder list(java.util.List < List> list) {
            String listShrink = shrink(list, "List", "json");
            this.putBodyParameter("List", listShrink);
            this.list = list;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.putBodyParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        @Override
        public DisableNotificationRequest build() {
            return new DisableNotificationRequest(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("AggregateDataId")
        private String aggregateDataId;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("DedicatedLineId")
        private String dedicatedLineId;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("EventId")
        private String eventId;

        @NameInMap("EventObjectId")
        private String eventObjectId;

        @NameInMap("MonitorItemId")
        private String monitorItemId;

        @NameInMap("PortCollectionId")
        private String portCollectionId;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private List(Builder builder) {
            this.aggregateDataId = builder.aggregateDataId;
            this.appId = builder.appId;
            this.dedicatedLineId = builder.dedicatedLineId;
            this.deviceId = builder.deviceId;
            this.eventId = builder.eventId;
            this.eventObjectId = builder.eventObjectId;
            this.monitorItemId = builder.monitorItemId;
            this.portCollectionId = builder.portCollectionId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return aggregateDataId
         */
        public String getAggregateDataId() {
            return this.aggregateDataId;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return dedicatedLineId
         */
        public String getDedicatedLineId() {
            return this.dedicatedLineId;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventObjectId
         */
        public String getEventObjectId() {
            return this.eventObjectId;
        }

        /**
         * @return monitorItemId
         */
        public String getMonitorItemId() {
            return this.monitorItemId;
        }

        /**
         * @return portCollectionId
         */
        public String getPortCollectionId() {
            return this.portCollectionId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String aggregateDataId; 
            private String appId; 
            private String dedicatedLineId; 
            private String deviceId; 
            private String eventId; 
            private String eventObjectId; 
            private String monitorItemId; 
            private String portCollectionId; 
            private String type; 

            /**
             * AggregateDataId.
             */
            public Builder aggregateDataId(String aggregateDataId) {
                this.aggregateDataId = aggregateDataId;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * DedicatedLineId.
             */
            public Builder dedicatedLineId(String dedicatedLineId) {
                this.dedicatedLineId = dedicatedLineId;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
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
             * EventObjectId.
             */
            public Builder eventObjectId(String eventObjectId) {
                this.eventObjectId = eventObjectId;
                return this;
            }

            /**
             * MonitorItemId.
             */
            public Builder monitorItemId(String monitorItemId) {
                this.monitorItemId = monitorItemId;
                return this;
            }

            /**
             * PortCollectionId.
             */
            public Builder portCollectionId(String portCollectionId) {
                this.portCollectionId = portCollectionId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
