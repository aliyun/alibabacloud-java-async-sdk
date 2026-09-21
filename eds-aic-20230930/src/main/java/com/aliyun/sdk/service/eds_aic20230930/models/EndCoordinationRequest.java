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
         * <p>The user ID of the coordination participant.</p>
         * 
         * <strong>example:</strong>
         * <p>lina</p>
         */
        public Builder coordinatorUserId(String coordinatorUserId) {
            this.putQueryParameter("CoordinatorUserId", coordinatorUserId);
            this.coordinatorUserId = coordinatorUserId;
            return this;
        }

        /**
         * <p>The ID of the instance that is in a coordination session.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-2zecay9ponatdc4m****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The user ID of the coordination initiator.</p>
         * 
         * <strong>example:</strong>
         * <p>xiaoming</p>
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
