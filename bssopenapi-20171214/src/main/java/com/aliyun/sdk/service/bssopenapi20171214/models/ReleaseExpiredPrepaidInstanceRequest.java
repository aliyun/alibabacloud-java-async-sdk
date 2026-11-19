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
 * {@link ReleaseExpiredPrepaidInstanceRequest} extends {@link RequestModel}
 *
 * <p>ReleaseExpiredPrepaidInstanceRequest</p>
 */
public class ReleaseExpiredPrepaidInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    private ReleaseExpiredPrepaidInstanceRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseExpiredPrepaidInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<ReleaseExpiredPrepaidInstanceRequest, Builder> {
        private String instanceIds; 
        private String productCode; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseExpiredPrepaidInstanceRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.productCode = request.productCode;
            this.productType = request.productType;
        } 

        /**
         * <p>The instance IDs. Separate multiple IDs with commas. You can specify up to 20 IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-1,rm-2</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The product code. You can call the <strong>QueryProductList</strong> operation to query the product code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The product type.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public ReleaseExpiredPrepaidInstanceRequest build() {
            return new ReleaseExpiredPrepaidInstanceRequest(this);
        } 

    } 

}
