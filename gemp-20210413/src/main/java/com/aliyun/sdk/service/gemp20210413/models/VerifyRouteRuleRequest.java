// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyRouteRuleRequest} extends {@link RequestModel}
 *
 * <p>VerifyRouteRuleRequest</p>
 */
public class VerifyRouteRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("routeRuleId")
    private Long routeRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("testSourceEvents")
    private java.util.List < TestSourceEvents> testSourceEvents;

    private VerifyRouteRuleRequest(Builder builder) {
        super(builder);
        this.routeRuleId = builder.routeRuleId;
        this.testSourceEvents = builder.testSourceEvents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyRouteRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return routeRuleId
     */
    public Long getRouteRuleId() {
        return this.routeRuleId;
    }

    /**
     * @return testSourceEvents
     */
    public java.util.List < TestSourceEvents> getTestSourceEvents() {
        return this.testSourceEvents;
    }

    public static final class Builder extends Request.Builder<VerifyRouteRuleRequest, Builder> {
        private Long routeRuleId; 
        private java.util.List < TestSourceEvents> testSourceEvents; 

        private Builder() {
            super();
        } 

        private Builder(VerifyRouteRuleRequest request) {
            super(request);
            this.routeRuleId = request.routeRuleId;
            this.testSourceEvents = request.testSourceEvents;
        } 

        /**
         * routeRuleId.
         */
        public Builder routeRuleId(Long routeRuleId) {
            this.putBodyParameter("routeRuleId", routeRuleId);
            this.routeRuleId = routeRuleId;
            return this;
        }

        /**
         * testSourceEvents.
         */
        public Builder testSourceEvents(java.util.List < TestSourceEvents> testSourceEvents) {
            this.putBodyParameter("testSourceEvents", testSourceEvents);
            this.testSourceEvents = testSourceEvents;
            return this;
        }

        @Override
        public VerifyRouteRuleRequest build() {
            return new VerifyRouteRuleRequest(this);
        } 

    } 

    public static class TestSourceEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("eventJson")
        private String eventJson;

        @com.aliyun.core.annotation.NameInMap("eventTime")
        private String eventTime;

        @com.aliyun.core.annotation.NameInMap("monitorSourceId")
        private Long monitorSourceId;

        @com.aliyun.core.annotation.NameInMap("monitorSourceName")
        private String monitorSourceName;

        private TestSourceEvents(Builder builder) {
            this.eventJson = builder.eventJson;
            this.eventTime = builder.eventTime;
            this.monitorSourceId = builder.monitorSourceId;
            this.monitorSourceName = builder.monitorSourceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TestSourceEvents create() {
            return builder().build();
        }

        /**
         * @return eventJson
         */
        public String getEventJson() {
            return this.eventJson;
        }

        /**
         * @return eventTime
         */
        public String getEventTime() {
            return this.eventTime;
        }

        /**
         * @return monitorSourceId
         */
        public Long getMonitorSourceId() {
            return this.monitorSourceId;
        }

        /**
         * @return monitorSourceName
         */
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

        public static final class Builder {
            private String eventJson; 
            private String eventTime; 
            private Long monitorSourceId; 
            private String monitorSourceName; 

            /**
             * eventJson.
             */
            public Builder eventJson(String eventJson) {
                this.eventJson = eventJson;
                return this;
            }

            /**
             * eventTime.
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * monitorSourceId.
             */
            public Builder monitorSourceId(Long monitorSourceId) {
                this.monitorSourceId = monitorSourceId;
                return this;
            }

            /**
             * monitorSourceName.
             */
            public Builder monitorSourceName(String monitorSourceName) {
                this.monitorSourceName = monitorSourceName;
                return this;
            }

            public TestSourceEvents build() {
                return new TestSourceEvents(this);
            } 

        } 

    }
}
