// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-7mz2nx41h01</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the finite state machine (FSM).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tisplus_opensearch@datasource_flow_fsm@1865410598556969-ha-cn-0ju2rrogr01_test_api_2@sz_vpc_domain_1@null@MANUAL-ha-cn-0ju2rrogr01_test_api_2@1657511220772@165343</p>
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
