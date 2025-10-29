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
 * {@link BatchEventMigrateInstanceRequest} extends {@link RequestModel}
 *
 * <p>BatchEventMigrateInstanceRequest</p>
 */
public class BatchEventMigrateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventInfos")
    private java.util.List<EventInfos> eventInfos;

    private BatchEventMigrateInstanceRequest(Builder builder) {
        super(builder);
        this.eventInfos = builder.eventInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchEventMigrateInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<BatchEventMigrateInstanceRequest, Builder> {
        private java.util.List<EventInfos> eventInfos; 

        private Builder() {
            super();
        } 

        private Builder(BatchEventMigrateInstanceRequest request) {
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
        public BatchEventMigrateInstanceRequest build() {
            return new BatchEventMigrateInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchEventMigrateInstanceRequest} extends {@link TeaModel}
     *
     * <p>BatchEventMigrateInstanceRequest</p>
     */
    public static class EventInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataPolicy")
        private String dataPolicy;

        @com.aliyun.core.annotation.NameInMap("EventId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("OpsType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String opsType;

        @com.aliyun.core.annotation.NameInMap("Password")
        @com.aliyun.core.annotation.Validation(maxLength = 30, minLength = 8)
        private String password;

        @com.aliyun.core.annotation.NameInMap("PlanTime")
        private Long planTime;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceId;

        private EventInfos(Builder builder) {
            this.dataPolicy = builder.dataPolicy;
            this.eventId = builder.eventId;
            this.opsType = builder.opsType;
            this.password = builder.password;
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
         * @return dataPolicy
         */
        public String getDataPolicy() {
            return this.dataPolicy;
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
         * @return password
         */
        public String getPassword() {
            return this.password;
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
            private String dataPolicy; 
            private String eventId; 
            private String opsType; 
            private String password; 
            private Long planTime; 
            private String resourceId; 

            private Builder() {
            } 

            private Builder(EventInfos model) {
                this.dataPolicy = model.dataPolicy;
                this.eventId = model.eventId;
                this.opsType = model.opsType;
                this.password = model.password;
                this.planTime = model.planTime;
                this.resourceId = model.resourceId;
            } 

            /**
             * <p>The data migration policy. Valid values:</p>
             * <ul>
             * <li>abandon: does not migrate data. This is the default value.</li>
             * <li>force_transfer: forcibly migrates data.</li>
             * <li>try_transfer: Migrate data as much as possible.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>abandon</p>
             */
            public Builder dataPolicy(String dataPolicy) {
                this.dataPolicy = dataPolicy;
                return this;
            }

            /**
             * <p>Event ID e-*.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>e-d71ff150945b9c02eb6ebc0016328468</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The type of the O&amp;M task. Valid values:</p>
             * <ul>
             * <li>immediate</li>
             * <li>scheduled</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>immediate</p>
             */
            public Builder opsType(String opsType) {
                this.opsType = opsType;
                return this;
            }

            /**
             * <p>The password of the instance. This parameter is optional. If you do not specify this parameter, a random password is used.</p>
             * <p>The password must be 8 to 30 characters in length. The password must contain uppercase letters, lowercase letters, digits, and special characters.</p>
             * <p>Note that you cannot enter a password for scheduled execution.</p>
             * 
             * <strong>example:</strong>
             * <p>AAaa1234</p>
             */
            public Builder password(String password) {
                this.password = password;
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
             * <p>Resource ID i-*.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>i-55qi8m11rr53c4i964md8a00l</p>
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
