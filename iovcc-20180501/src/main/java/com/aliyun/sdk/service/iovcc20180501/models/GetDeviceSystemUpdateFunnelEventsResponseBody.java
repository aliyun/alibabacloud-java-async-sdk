// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceSystemUpdateFunnelEventsResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceSystemUpdateFunnelEventsResponseBody</p>
 */
public class GetDeviceSystemUpdateFunnelEventsResponseBody extends TeaModel {
    @NameInMap("EventList")
    private java.util.List < EventList> eventList;

    @NameInMap("RequestId")
    private String requestId;

    private GetDeviceSystemUpdateFunnelEventsResponseBody(Builder builder) {
        this.eventList = builder.eventList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceSystemUpdateFunnelEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return eventList
     */
    public java.util.List < EventList> getEventList() {
        return this.eventList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < EventList> eventList; 
        private String requestId; 

        /**
         * EventList.
         */
        public Builder eventList(java.util.List < EventList> eventList) {
            this.eventList = eventList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeviceSystemUpdateFunnelEventsResponseBody build() {
            return new GetDeviceSystemUpdateFunnelEventsResponseBody(this);
        } 

    } 

    public static class EventList extends TeaModel {
        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("Event")
        private String event;

        @NameInMap("ReportTime")
        private String reportTime;

        @NameInMap("ReportTimestamp")
        private Long reportTimestamp;

        @NameInMap("TargetVersion")
        private String targetVersion;

        @NameInMap("TenantId")
        private String tenantId;

        private EventList(Builder builder) {
            this.deviceId = builder.deviceId;
            this.event = builder.event;
            this.reportTime = builder.reportTime;
            this.reportTimestamp = builder.reportTimestamp;
            this.targetVersion = builder.targetVersion;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventList create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return reportTime
         */
        public String getReportTime() {
            return this.reportTime;
        }

        /**
         * @return reportTimestamp
         */
        public Long getReportTimestamp() {
            return this.reportTimestamp;
        }

        /**
         * @return targetVersion
         */
        public String getTargetVersion() {
            return this.targetVersion;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String deviceId; 
            private String event; 
            private String reportTime; 
            private Long reportTimestamp; 
            private String targetVersion; 
            private String tenantId; 

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * ReportTime.
             */
            public Builder reportTime(String reportTime) {
                this.reportTime = reportTime;
                return this;
            }

            /**
             * ReportTimestamp.
             */
            public Builder reportTimestamp(Long reportTimestamp) {
                this.reportTimestamp = reportTimestamp;
                return this;
            }

            /**
             * TargetVersion.
             */
            public Builder targetVersion(String targetVersion) {
                this.targetVersion = targetVersion;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public EventList build() {
                return new EventList(this);
            } 

        } 

    }
}
