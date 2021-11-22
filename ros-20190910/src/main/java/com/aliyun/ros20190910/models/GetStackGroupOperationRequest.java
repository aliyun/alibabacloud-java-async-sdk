// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetStackGroupOperationRequest} extends {@link RequestModel}
 *
 * <p>GetStackGroupOperationRequest</p>
 */
public class GetStackGroupOperationRequest extends Request {
    @Query
    @NameInMap("OperationId")
    private String operationId;

    @Query
    @NameInMap("RegionId")
    private String regionId;


    private GetStackGroupOperationRequest(Builder builder) {
        super(builder);
        this.operationId = builder.operationId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackGroupOperationRequest create() {
        return builder().build();
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

    public static final class Builder extends Request.Builder {
        private String operationId; 
        private String regionId; 

        /**
         * <p>OperationId.</p>
         */
        public Builder operationId(String operationId) {
            this.putQueryParameter("OperationId", operationId);
            this.operationId = operationId;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        public GetStackGroupOperationRequest build() {
            return new GetStackGroupOperationRequest(this);
        } 

    } 

}
