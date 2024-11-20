// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetStackGroupOperationRequest} extends {@link RequestModel}
 *
 * <p>GetStackGroupOperationRequest</p>
 */
public class GetStackGroupOperationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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

    public static final class Builder extends Request.Builder<GetStackGroupOperationRequest, Builder> {
        private String operationId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetStackGroupOperationRequest request) {
            super(request);
            this.operationId = request.operationId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The operation ID. You can call the <a href="https://help.aliyun.com/document_detail/151342.html">ListStackGroupOperations</a> operation to query the operation ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6da106ca-1784-4a6f-a7e1-e723863d****</p>
         */
        public Builder operationId(String operationId) {
            this.putQueryParameter("OperationId", operationId);
            this.operationId = operationId;
            return this;
        }

        /**
         * <p>The region ID of the stack group. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

        @Override
        public GetStackGroupOperationRequest build() {
            return new GetStackGroupOperationRequest(this);
        } 

    } 

}
