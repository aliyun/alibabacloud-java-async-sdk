// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The operations that you want to cancel on the stack.</p>
         */
        public Builder allowedStackOperations(java.util.List < String > allowedStackOperations) {
            this.putQueryParameter("AllowedStackOperations", allowedStackOperations);
            this.allowedStackOperations = allowedStackOperations;
            return this;
        }

        /**
         * <p>The method that you want to use to cancel the operations. Valid values:</p>
         * <ul>
         * <li>Quick: cancels the operations on the stack at the earliest opportunity. In this case, Resource Orchestration Service (ROS) stops scheduling new resources and stops running resources at the earliest opportunity. If you use this method, the resource status may become invalid and subsequent stack operations may be affected.</li>
         * <li>Safe (default): cancels the operations on the stack in a secure manner. In this case, ROS stops scheduling new resources and waits for running resources to be stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Safe</p>
         */
        public Builder cancelType(String cancelType) {
            this.putQueryParameter("CancelType", cancelType);
            this.cancelType = cancelType;
            return this;
        }

        /**
         * <p>The region ID of the stack. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The stack ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
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
