// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EstimatedLogstashRestartTimeRequest} extends {@link RequestModel}
 *
 * <p>EstimatedLogstashRestartTimeRequest</p>
 */
public class EstimatedLogstashRestartTimeRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("body")
    private String body;

    @Query
    @NameInMap("force")
    private Boolean force;

    private EstimatedLogstashRestartTimeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.body = builder.body;
        this.force = builder.force;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EstimatedLogstashRestartTimeRequest create() {
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

    public static final class Builder extends Request.Builder<EstimatedLogstashRestartTimeRequest, Builder> {
        private String instanceId; 
        private String body; 
        private Boolean force; 

        private Builder() {
            super();
        } 

        private Builder(EstimatedLogstashRestartTimeRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.body = request.body;
            this.force = request.force;
        } 

        /**
         * The ID of the cluster.
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
         * Specifies whether to forcibly restart the cluster. Default value: false.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("force", force);
            this.force = force;
            return this;
        }

        @Override
        public EstimatedLogstashRestartTimeRequest build() {
            return new EstimatedLogstashRestartTimeRequest(this);
        } 

    } 

}
