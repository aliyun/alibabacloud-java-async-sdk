// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopTaskRequest} extends {@link RequestModel}
 *
 * <p>StopTaskRequest</p>
 */
public class StopTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("fsmId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fsmId;

    private StopTaskRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.fsmId = builder.fsmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopTaskRequest create() {
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
     * @return fsmId
     */
    public String getFsmId() {
        return this.fsmId;
    }

    public static final class Builder extends Request.Builder<StopTaskRequest, Builder> {
        private String instanceId; 
        private String fsmId; 

        private Builder() {
            super();
        } 

        private Builder(StopTaskRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.fsmId = request.fsmId;
        } 

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the finite state machine (FSM).
         */
        public Builder fsmId(String fsmId) {
            this.putPathParameter("fsmId", fsmId);
            this.fsmId = fsmId;
            return this;
        }

        @Override
        public StopTaskRequest build() {
            return new StopTaskRequest(this);
        } 

    } 

}
