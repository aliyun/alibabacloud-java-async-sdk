// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link GetInstanceLifecycleEventsOutput} extends {@link TeaModel}
 *
 * <p>GetInstanceLifecycleEventsOutput</p>
 */
public class GetInstanceLifecycleEventsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("events")
    private java.util.List<InstanceEventItem> events;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetInstanceLifecycleEventsOutput(Builder builder) {
        this.events = builder.events;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceLifecycleEventsOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return events
     */
    public java.util.List<InstanceEventItem> getEvents() {
        return this.events;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstanceEventItem> events; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetInstanceLifecycleEventsOutput model) {
            this.events = model.events;
            this.requestId = model.requestId;
        } 

        /**
         * events.
         */
        public Builder events(java.util.List<InstanceEventItem> events) {
            this.events = events;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceLifecycleEventsOutput build() {
            return new GetInstanceLifecycleEventsOutput(this);
        } 

    } 

}
