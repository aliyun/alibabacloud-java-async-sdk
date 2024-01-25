// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetProductInstanceRequest</p>
 */
public class GetProductInstanceRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    private GetProductInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.operaUid = builder.operaUid;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductInstanceRequest create() {
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
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<GetProductInstanceRequest, Builder> {
        private String instanceId; 
        private String operaUid; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(GetProductInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.operaUid = request.operaUid;
            this.productCode = request.productCode;
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
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public GetProductInstanceRequest build() {
            return new GetProductInstanceRequest(this);
        } 

    } 

}
