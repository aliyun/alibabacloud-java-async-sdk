// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExperimentGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListExperimentGroupsRequest</p>
 */
public class ListExperimentGroupsRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("LayerId")
    private String layerId;

    @Query
    @NameInMap("Status")
    private String status;

    private ListExperimentGroupsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.layerId = builder.layerId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExperimentGroupsRequest create() {
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
     * @return layerId
     */
    public String getLayerId() {
        return this.layerId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListExperimentGroupsRequest, Builder> {
        private String instanceId; 
        private String layerId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListExperimentGroupsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.layerId = request.layerId;
            this.status = request.status;
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
         * LayerId.
         */
        public Builder layerId(String layerId) {
            this.putQueryParameter("LayerId", layerId);
            this.layerId = layerId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListExperimentGroupsRequest build() {
            return new ListExperimentGroupsRequest(this);
        } 

    } 

}
