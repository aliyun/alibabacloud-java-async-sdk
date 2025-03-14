// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link EndCoordinationRequest} extends {@link RequestModel}
 *
 * <p>EndCoordinationRequest</p>
 */
public class EndCoordinationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoordinatorUserId")
    private String coordinatorUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerUserId")
    private String ownerUserId;

    private EndCoordinationRequest(Builder builder) {
        super(builder);
        this.coordinatorUserId = builder.coordinatorUserId;
        this.instanceId = builder.instanceId;
        this.ownerUserId = builder.ownerUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EndCoordinationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coordinatorUserId
     */
    public String getCoordinatorUserId() {
        return this.coordinatorUserId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ownerUserId
     */
    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    public static final class Builder extends Request.Builder<EndCoordinationRequest, Builder> {
        private String coordinatorUserId; 
        private String instanceId; 
        private String ownerUserId; 

        private Builder() {
            super();
        } 

        private Builder(EndCoordinationRequest request) {
            super(request);
            this.coordinatorUserId = request.coordinatorUserId;
            this.instanceId = request.instanceId;
            this.ownerUserId = request.ownerUserId;
        } 

        /**
         * CoordinatorUserId.
         */
        public Builder coordinatorUserId(String coordinatorUserId) {
            this.putQueryParameter("CoordinatorUserId", coordinatorUserId);
            this.coordinatorUserId = coordinatorUserId;
            return this;
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
         * OwnerUserId.
         */
        public Builder ownerUserId(String ownerUserId) {
            this.putQueryParameter("OwnerUserId", ownerUserId);
            this.ownerUserId = ownerUserId;
            return this;
        }

        @Override
        public EndCoordinationRequest build() {
            return new EndCoordinationRequest(this);
        } 

    } 

}
