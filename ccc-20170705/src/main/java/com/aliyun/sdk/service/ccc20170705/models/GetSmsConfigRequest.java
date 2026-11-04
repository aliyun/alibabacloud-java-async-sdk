// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link GetSmsConfigRequest} extends {@link RequestModel}
 *
 * <p>GetSmsConfigRequest</p>
 */
public class GetSmsConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scenario")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Integer> scenario;

    private GetSmsConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.scenario = builder.scenario;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSmsConfigRequest create() {
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
     * @return scenario
     */
    public java.util.List<Integer> getScenario() {
        return this.scenario;
    }

    public static final class Builder extends Request.Builder<GetSmsConfigRequest, Builder> {
        private String instanceId; 
        private java.util.List<Integer> scenario; 

        private Builder() {
            super();
        } 

        private Builder(GetSmsConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.scenario = request.scenario;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder scenario(java.util.List<Integer> scenario) {
            this.putQueryParameter("Scenario", scenario);
            this.scenario = scenario;
            return this;
        }

        @Override
        public GetSmsConfigRequest build() {
            return new GetSmsConfigRequest(this);
        } 

    } 

}
