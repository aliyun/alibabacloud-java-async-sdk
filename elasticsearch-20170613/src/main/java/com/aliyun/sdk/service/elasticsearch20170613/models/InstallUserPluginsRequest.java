// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link InstallUserPluginsRequest} extends {@link RequestModel}
 *
 * <p>InstallUserPluginsRequest</p>
 */
public class InstallUserPluginsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("force")
    private Boolean force;

    private InstallUserPluginsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.body = builder.body;
        this.force = builder.force;
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

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    public static final class Builder extends Request.Builder<InstallUserPluginsRequest, Builder> {
        private String instanceId; 
        private String body; 
        private Boolean force; 

        private Builder() {
            super();
        } 

        private Builder(InstallUserPluginsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.body = request.body;
            this.force = request.force;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-i7m27ausp001l****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("force", force);
            this.force = force;
            return this;
        }

        @Override
        public InstallUserPluginsRequest build() {
            return new InstallUserPluginsRequest(this);
        } 

    } 

}
