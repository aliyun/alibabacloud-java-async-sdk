// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopStackGroupOperationRequest} extends {@link RequestModel}
 *
 * <p>StopStackGroupOperationRequest</p>
 */
public class StopStackGroupOperationRequest extends Request {
    @Query
    @NameInMap("OperationId")
    @Validation(required = true)
    private String operationId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private StopStackGroupOperationRequest(Builder builder) {
        super(builder);
        this.operationId = builder.operationId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopStackGroupOperationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operationId
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StopStackGroupOperationRequest, Builder> {
        private String operationId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StopStackGroupOperationRequest request) {
            super(request);
            this.operationId = request.operationId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the operation.
         * <p>
         * 
         * You can call the [ListStackGroupOperations](~~151342~~) operation to obtain the operation ID.
         */
        public Builder operationId(String operationId) {
            this.putQueryParameter("OperationId", operationId);
            this.operationId = operationId;
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

        @Override
        public StopStackGroupOperationRequest build() {
            return new StopStackGroupOperationRequest(this);
        } 

    } 

}
