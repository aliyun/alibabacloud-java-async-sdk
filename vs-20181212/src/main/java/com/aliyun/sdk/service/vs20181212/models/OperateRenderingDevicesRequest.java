// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateRenderingDevicesRequest} extends {@link RequestModel}
 *
 * <p>OperateRenderingDevicesRequest</p>
 */
public class OperateRenderingDevicesRequest extends Request {
    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private String instanceIds;

    @Query
    @NameInMap("Operation")
    @Validation(required = true)
    private String operation;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PodId")
    private String podId;

    private OperateRenderingDevicesRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.operation = builder.operation;
        this.ownerId = builder.ownerId;
        this.podId = builder.podId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateRenderingDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return podId
     */
    public String getPodId() {
        return this.podId;
    }

    public static final class Builder extends Request.Builder<OperateRenderingDevicesRequest, Builder> {
        private String instanceIds; 
        private String operation; 
        private Long ownerId; 
        private String podId; 

        private Builder() {
            super();
        } 

        private Builder(OperateRenderingDevicesRequest response) {
            super(response);
            this.instanceIds = response.instanceIds;
            this.operation = response.operation;
            this.ownerId = response.ownerId;
            this.podId = response.podId;
        } 

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * Operation.
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PodId.
         */
        public Builder podId(String podId) {
            this.putQueryParameter("PodId", podId);
            this.podId = podId;
            return this;
        }

        @Override
        public OperateRenderingDevicesRequest build() {
            return new OperateRenderingDevicesRequest(this);
        } 

    } 

}
