// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EstimatedRestartTimeRequest} extends {@link RequestModel}
 *
 * <p>EstimatedRestartTimeRequest</p>
 */
public class EstimatedRestartTimeRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("force")
    private Boolean force;

    private EstimatedRestartTimeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.force = builder.force;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EstimatedRestartTimeRequest create() {
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
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    public static final class Builder extends Request.Builder<EstimatedRestartTimeRequest, Builder> {
        private String instanceId; 
        private Boolean force; 

        private Builder() {
            super();
        } 

        private Builder(EstimatedRestartTimeRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.force = response.force;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
        public EstimatedRestartTimeRequest build() {
            return new EstimatedRestartTimeRequest(this);
        } 

    } 

}
