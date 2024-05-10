// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelStackOperationRequest} extends {@link RequestModel}
 *
 * <p>CancelStackOperationRequest</p>
 */
public class CancelStackOperationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowedStackOperations")
    private java.util.List < String > allowedStackOperations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CancelType")
    private String cancelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stackId;

    private CancelStackOperationRequest(Builder builder) {
        super(builder);
        this.allowedStackOperations = builder.allowedStackOperations;
        this.cancelType = builder.cancelType;
        this.regionId = builder.regionId;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelStackOperationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowedStackOperations
     */
    public java.util.List < String > getAllowedStackOperations() {
        return this.allowedStackOperations;
    }

    /**
     * @return cancelType
     */
    public String getCancelType() {
        return this.cancelType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    public static final class Builder extends Request.Builder<CancelStackOperationRequest, Builder> {
        private java.util.List < String > allowedStackOperations; 
        private String cancelType; 
        private String regionId; 
        private String stackId; 

        private Builder() {
            super();
        } 

        private Builder(CancelStackOperationRequest request) {
            super(request);
            this.allowedStackOperations = request.allowedStackOperations;
            this.cancelType = request.cancelType;
            this.regionId = request.regionId;
            this.stackId = request.stackId;
        } 

        /**
         * The operations that you want to cancel on the stack.
         */
        public Builder allowedStackOperations(java.util.List < String > allowedStackOperations) {
            this.putQueryParameter("AllowedStackOperations", allowedStackOperations);
            this.allowedStackOperations = allowedStackOperations;
            return this;
        }

        /**
         * The method that you want to use to cancel the operations. Valid values:
         * <p>
         * 
         * *   Quick: cancels the operations on the stack at the earliest opportunity. In this case, Resource Orchestration Service (ROS) stops scheduling new resources and stops running resources at the earliest opportunity. If you use this method, the resource status may become invalid and subsequent stack operations may be affected.
         * *   Safe (default): cancels the operations on the stack in a secure manner. In this case, ROS stops scheduling new resources and waits for running resources to be stopped.
         */
        public Builder cancelType(String cancelType) {
            this.putQueryParameter("CancelType", cancelType);
            this.cancelType = cancelType;
            return this;
        }

        /**
         * The region ID of the stack. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The stack ID.
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        @Override
        public CancelStackOperationRequest build() {
            return new CancelStackOperationRequest(this);
        } 

    } 

}
