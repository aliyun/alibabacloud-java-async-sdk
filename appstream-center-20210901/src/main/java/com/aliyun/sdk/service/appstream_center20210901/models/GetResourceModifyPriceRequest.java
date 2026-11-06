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
 * {@link GetResourceModifyPriceRequest} extends {@link RequestModel}
 *
 * <p>GetResourceModifyPriceRequest</p>
 */
public class GetResourceModifyPriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    private GetResourceModifyPriceRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceModifyPriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Long getAmount() {
        return this.amount;
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<GetResourceModifyPriceRequest, Builder> {
        private Long amount; 
        private String appInstanceGroupId; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceModifyPriceRequest request) {
            super(request);
            this.amount = request.amount;
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.productType = request.productType;
        } 

        /**
         * <p>The total number of subscription resource nodes after the scale-out. Unit: nodes.</p>
         * <p><strong>The value must be greater than the current number of purchased nodes in the delivery group and cannot exceed the node quota of the account.</strong> This parameter is not the number of added nodes or the number of sessions.</p>
         * <p>For example, if there is currently 1 node and you want to scale out to 2 nodes, specify 2 to indicate a final total of 2 nodes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder amount(Long amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>The ID of the delivery group to be scaled out. You can query only one delivery group at a time.</p>
         * <p>The delivery group must belong to the current account and match ProductType. It must be billed by node on a subscription basis, have a normal order status, and be associated with a resource node pool.</p>
         * <p>You can obtain the cloud app delivery group ID by calling <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/ListAppInstanceGroup">ListAppInstanceGroup</a>. You can call <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/GetAppInstanceGroup">GetAppInstanceGroup</a> to further verify the current configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putQueryParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * <p>The product type, which must match the product to which the target delivery group belongs. Valid values:</p>
         * <ul>
         * <li>CloudApp: WUYING Cloud App. Queries the resource scale-out price of a cloud app delivery group.</li>
         * <li>CloudBrowser: Cloud Browser. Applies only to subscription browser delivery groups that are billed by node.</li>
         * </ul>
         * <p>This operation does not apply to pay-as-you-go or browser groups billed by monthly active user (MAU).</p>
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

        @Override
        public GetResourceModifyPriceRequest build() {
            return new GetResourceModifyPriceRequest(this);
        } 

    } 

}
