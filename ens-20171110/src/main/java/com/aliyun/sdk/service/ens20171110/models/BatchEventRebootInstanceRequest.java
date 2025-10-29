// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link BatchEventRebootInstanceRequest} extends {@link RequestModel}
 *
 * <p>BatchEventRebootInstanceRequest</p>
 */
public class BatchEventRebootInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventInfos")
    private java.util.List<EventInfos> eventInfos;

    private BatchEventRebootInstanceRequest(Builder builder) {
        super(builder);
        this.eventInfos = builder.eventInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchEventRebootInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventInfos
     */
    public java.util.List<EventInfos> getEventInfos() {
        return this.eventInfos;
    }

    public static final class Builder extends Request.Builder<BatchEventRebootInstanceRequest, Builder> {
        private java.util.List<EventInfos> eventInfos; 

        private Builder() {
            super();
        } 

        private Builder(BatchEventRebootInstanceRequest request) {
            super(request);
            this.eventInfos = request.eventInfos;
        } 

        /**
         * <p>The details of events.</p>
         */
        public Builder eventInfos(java.util.List<EventInfos> eventInfos) {
            String eventInfosShrink = shrink(eventInfos, "EventInfos", "json");
            this.putQueryParameter("EventInfos", eventInfosShrink);
            this.eventInfos = eventInfos;
            return this;
        }

        @Override
        public BatchEventRebootInstanceRequest build() {
            return new BatchEventRebootInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchEventRebootInstanceRequest} extends {@link TeaModel}
     *
     * <p>BatchEventRebootInstanceRequest</p>
     */
    public static class EventInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("OpsType")
        private String opsType;

        @com.aliyun.core.annotation.NameInMap("PlanTime")
        private Long planTime;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        private EventInfos(Builder builder) {
            this.eventId = builder.eventId;
            this.opsType = builder.opsType;
            this.planTime = builder.planTime;
            this.resourceId = builder.resourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventInfos create() {
            return builder().build();
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return opsType
         */
        public String getOpsType() {
            return this.opsType;
        }

        /**
         * @return planTime
         */
        public Long getPlanTime() {
            return this.planTime;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private String eventId; 
            private String opsType; 
            private Long planTime; 
            private String resourceId; 

            private Builder() {
            } 

            private Builder(EventInfos model) {
                this.eventId = model.eventId;
                this.opsType = model.opsType;
                this.planTime = model.planTime;
                this.resourceId = model.resourceId;
            } 

            /**
             * <p>The ID of the system event.</p>
             * 
             * <strong>example:</strong>
             * <p>e-4452cec5a8f8eb9b2879a054207687d6</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The type of the O&amp;M task.</p>
             * <ul>
             * <li>immediate</li>
             * <li>scheduled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>immediate</p>
             */
            public Builder opsType(String opsType) {
                this.opsType = opsType;
                return this;
            }

            /**
             * <p>The execution time of the reservation. The timestamp is measured in milliseconds. If the OpsType parameter is set to scheduled, this parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1742452232000</p>
             */
            public Builder planTime(Long planTime) {
                this.planTime = planTime;
                return this;
            }

            /**
             * <p>A client ID.</p>
             * 
             * <strong>example:</strong>
             * <p>n-54hi3ffi63zrjt4wzx9mepeyh</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public EventInfos build() {
                return new EventInfos(this);
            } 

        } 

    }
}
