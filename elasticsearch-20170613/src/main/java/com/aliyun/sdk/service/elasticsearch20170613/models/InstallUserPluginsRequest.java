// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallUserPluginsRequest} extends {@link RequestModel}
 *
 * <p>InstallUserPluginsRequest</p>
 */
public class InstallUserPluginsRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private InstallUserPluginsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallUserPluginsRequest create() {
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

    public static final class Builder extends Request.Builder<InstallUserPluginsRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(InstallUserPluginsRequest response) {
            super(response);
            this.instanceId = response.instanceId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public InstallUserPluginsRequest build() {
            return new InstallUserPluginsRequest(this);
        } 

    } 

}
