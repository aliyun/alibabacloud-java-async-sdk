// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetResourceQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetResourceQuotaRequest</p>
 */
public class GetResourceQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    private GetResourceQuotaRequest(Builder builder) {
        super(builder);
        this.bizRegionId = builder.bizRegionId;
        this.chargeType = builder.chargeType;
        this.productType = builder.productType;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<GetResourceQuotaRequest, Builder> {
        private String bizRegionId; 
        private String chargeType; 
        private String productType; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceQuotaRequest request) {
            super(request);
            this.bizRegionId = request.bizRegionId;
            this.chargeType = request.chargeType;
            this.productType = request.productType;
            this.resourceType = request.resourceType;
        } 

        /**
         * <p>The business region ID. If this parameter is omitted, the general quota that is not limited by region is queried. The quotas of different regions are not added together. This parameter must be consistent with the business region for What to do next.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The billing method query condition. If this parameter is omitted, the general quota that is not limited by billing method is queried. The quotas of different billing methods are not added together. Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription.</li>
         * <li>PostPaid: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The product type. Set this parameter to the following value when you call the operation:</p>
         * <ul>
         * <li>CloudApp: WUYING Cloud App.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The business resource type to query. Valid values:</p>
         * <ul>
         * <li>AppInstanceGroup: the quantity quota for delivery groups. Unit: count.</li>
         * <li>AppAuthUser: the quantity quota for authorized users. Unit: users.</li>
         * <li>PoolNodeAmount: the quantity quota for purchased resource nodes. Unit: count.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AppInstanceGroup</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public GetResourceQuotaRequest build() {
            return new GetResourceQuotaRequest(this);
        } 

    } 

}
