// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartApmRequest} extends {@link RequestModel}
 *
 * <p>StartApmRequest</p>
 */
public class StartApmRequest extends Request {
    @Path
    @NameInMap("instanceId")
    private String instanceId;

    private StartApmRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartApmRequest create() {
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

    public static final class Builder extends Request.Builder<StartApmRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(StartApmRequest response) {
            super(response);
            this.instanceId = response.instanceId;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public StartApmRequest build() {
            return new StartApmRequest(this);
        } 

    } 

}
