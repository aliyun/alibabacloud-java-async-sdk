// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApproveOperationRequest} extends {@link RequestModel}
 *
 * <p>ApproveOperationRequest</p>
 */
public class ApproveOperationRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("NodeId")
    private String nodeId;

    @Body
    @NameInMap("OperationType")
    private String operationType;

    private ApproveOperationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.nodeId = builder.nodeId;
        this.operationType = builder.operationType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApproveOperationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    public static final class Builder extends Request.Builder<ApproveOperationRequest, Builder> {
        private String regionId; 
        private String nodeId; 
        private String operationType; 

        private Builder() {
            super();
        } 

        private Builder(ApproveOperationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.nodeId = request.nodeId;
            this.operationType = request.operationType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * OperationType.
         */
        public Builder operationType(String operationType) {
            this.putBodyParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        @Override
        public ApproveOperationRequest build() {
            return new ApproveOperationRequest(this);
        } 

    } 

}
