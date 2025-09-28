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
 * {@link BatchEventRedeployInstanceRequest} extends {@link RequestModel}
 *
 * <p>BatchEventRedeployInstanceRequest</p>
 */
public class BatchEventRedeployInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventInfos")
    private java.util.List<EventInfos> eventInfos;

    private BatchEventRedeployInstanceRequest(Builder builder) {
        super(builder);
        this.eventInfos = builder.eventInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchEventRedeployInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<BatchEventRedeployInstanceRequest, Builder> {
        private java.util.List<EventInfos> eventInfos; 

        private Builder() {
            super();
        } 

        private Builder(BatchEventRedeployInstanceRequest request) {
            super(request);
            this.eventInfos = request.eventInfos;
        } 

        /**
         * EventInfos.
         */
        public Builder eventInfos(java.util.List<EventInfos> eventInfos) {
            String eventInfosShrink = shrink(eventInfos, "EventInfos", "json");
            this.putQueryParameter("EventInfos", eventInfosShrink);
            this.eventInfos = eventInfos;
            return this;
        }

        @Override
        public BatchEventRedeployInstanceRequest build() {
            return new BatchEventRedeployInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchEventRedeployInstanceRequest} extends {@link TeaModel}
     *
     * <p>BatchEventRedeployInstanceRequest</p>
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
             * EventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * OpsType.
             */
            public Builder opsType(String opsType) {
                this.opsType = opsType;
                return this;
            }

            /**
             * PlanTime.
             */
            public Builder planTime(Long planTime) {
                this.planTime = planTime;
                return this;
            }

            /**
             * ResourceId.
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
