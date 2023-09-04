// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefundInstanceRequest} extends {@link RequestModel}
 *
 * <p>RefundInstanceRequest</p>
 */
public class RefundInstanceRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ImmediatelyRelease")
    private String immediatelyRelease;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("ProductType")
    private String productType;

    private RefundInstanceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.immediatelyRelease = builder.immediatelyRelease;
        this.instanceId = builder.instanceId;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefundInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return immediatelyRelease
     */
    public String getImmediatelyRelease() {
        return this.immediatelyRelease;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<RefundInstanceRequest, Builder> {
        private String clientToken; 
        private String immediatelyRelease; 
        private String instanceId; 
        private String productCode; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(RefundInstanceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.immediatelyRelease = request.immediatelyRelease;
            this.instanceId = request.instanceId;
            this.productCode = request.productCode;
            this.productType = request.productType;
        } 

        /**
         * This parameter is required for scenarios that need idempotence. The UUID that is used to ensure the idempotence of the request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * This parameter is required for unsubscription scenarios. Valid values: 1 and 0. A value of 1 specifies that the instance is immediately released. A value of 0 specifies that the instance is shut down based on the shutdown policy. This parameter is supported only for specified services. Default value: 1.
         */
        public Builder immediatelyRelease(String immediatelyRelease) {
            this.putQueryParameter("ImmediatelyRelease", immediatelyRelease);
            this.immediatelyRelease = immediatelyRelease;
            return this;
        }

        /**
         * The ID of the instance. This parameter is required for unsubscription scenarios. Do not specify a custom name for this parameter.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The code of the service. This parameter is required for unsubscription scenarios.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The type of the service. This parameter is required for unsubscription scenarios. Unless otherwise specified, set this parameter to an empty string.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public RefundInstanceRequest build() {
            return new RefundInstanceRequest(this);
        } 

    } 

}
