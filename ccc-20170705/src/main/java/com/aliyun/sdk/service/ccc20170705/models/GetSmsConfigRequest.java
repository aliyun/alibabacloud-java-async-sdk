// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSmsConfigRequest} extends {@link RequestModel}
 *
 * <p>GetSmsConfigRequest</p>
 */
public class GetSmsConfigRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Scenario")
    @Validation(required = true)
    private java.util.List < Integer > scenario;

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
    public java.util.List < Integer > getScenario() {
        return this.scenario;
    }

    public static final class Builder extends Request.Builder<GetSmsConfigRequest, Builder> {
        private String instanceId; 
        private java.util.List < Integer > scenario; 

        private Builder() {
            super();
        } 

        private Builder(GetSmsConfigRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.scenario = response.scenario;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Scenario.
         */
        public Builder scenario(java.util.List < Integer > scenario) {
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
