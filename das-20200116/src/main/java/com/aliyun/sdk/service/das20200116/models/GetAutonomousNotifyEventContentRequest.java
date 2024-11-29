// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAutonomousNotifyEventContentRequest} extends {@link RequestModel}
 *
 * <p>GetAutonomousNotifyEventContentRequest</p>
 */
public class GetAutonomousNotifyEventContentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spanId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("__context")
    private String context;

    private GetAutonomousNotifyEventContentRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.spanId = builder.spanId;
        this.context = builder.context;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutonomousNotifyEventContentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return spanId
     */
    public String getSpanId() {
        return this.spanId;
    }

    /**
     * @return context
     */
    public String getContext() {
        return this.context;
    }

    public static final class Builder extends Request.Builder<GetAutonomousNotifyEventContentRequest, Builder> {
        private String instanceId; 
        private String spanId; 
        private String context; 

        private Builder() {
            super();
        } 

        private Builder(GetAutonomousNotifyEventContentRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.spanId = request.spanId;
            this.context = request.context;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-18ff4a195d****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The unique identifier of the event. You can call the <a href="https://help.aliyun.com/document_detail/288371.html">GetAutonomousNotifyEventsInRange</a> operation to query the unique identifier returned by the SpanId response parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7e7b2774-95b8-4fa3-bd9c-0ab47cb7****</p>
         */
        public Builder spanId(String spanId) {
            this.putQueryParameter("SpanId", spanId);
            this.spanId = spanId;
            return this;
        }

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder context(String context) {
            this.putQueryParameter("__context", context);
            this.context = context;
            return this;
        }

        @Override
        public GetAutonomousNotifyEventContentRequest build() {
            return new GetAutonomousNotifyEventContentRequest(this);
        } 

    } 

}
