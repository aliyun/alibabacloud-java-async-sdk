// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RefundInstanceRequest} extends {@link RequestModel}
 *
 * <p>RefundInstanceRequest</p>
 */
public class RefundInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImmediatelyRelease")
    private String immediatelyRelease;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
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
         * <p>This parameter is required for scenarios that need idempotence. The UUID that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>793F021C-B589-1225-82A9-99232AEBE494</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required for unsubscription scenarios. Valid values: 1 and 0. A value of 1 specifies that the instance is immediately released. A value of 0 specifies that the instance is shut down based on the shutdown policy. This parameter is supported only for specified services. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder immediatelyRelease(String immediatelyRelease) {
            this.putQueryParameter("ImmediatelyRelease", immediatelyRelease);
            this.immediatelyRelease = immediatelyRelease;
            return this;
        }

        /**
         * <p>The ID of the instance. This parameter is required for unsubscription scenarios. Do not specify a custom name for this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1etb69sqxgl4*******</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The code of the service. This parameter is required for unsubscription scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The type of the service. This parameter is required for unsubscription scenarios. Unless otherwise specified, set this parameter to an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>”“</p>
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
