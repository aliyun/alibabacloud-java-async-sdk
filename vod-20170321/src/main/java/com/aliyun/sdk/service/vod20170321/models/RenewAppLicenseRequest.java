// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link RenewAppLicenseRequest} extends {@link RequestModel}
 *
 * <p>RenewAppLicenseRequest</p>
 */
public class RenewAppLicenseRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LicenseItemIds")
    private String licenseItemIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderIds")
    private String orderIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PurchaseMethod")
    private String purchaseMethod;

    private RenewAppLicenseRequest(Builder builder) {
        super(builder);
        this.licenseItemIds = builder.licenseItemIds;
        this.orderIds = builder.orderIds;
        this.purchaseMethod = builder.purchaseMethod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewAppLicenseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return licenseItemIds
     */
    public String getLicenseItemIds() {
        return this.licenseItemIds;
    }

    /**
     * @return orderIds
     */
    public String getOrderIds() {
        return this.orderIds;
    }

    /**
     * @return purchaseMethod
     */
    public String getPurchaseMethod() {
        return this.purchaseMethod;
    }

    public static final class Builder extends Request.Builder<RenewAppLicenseRequest, Builder> {
        private String licenseItemIds; 
        private String orderIds; 
        private String purchaseMethod; 

        private Builder() {
            super();
        } 

        private Builder(RenewAppLicenseRequest request) {
            super(request);
            this.licenseItemIds = request.licenseItemIds;
            this.orderIds = request.orderIds;
            this.purchaseMethod = request.purchaseMethod;
        } 

        /**
         * LicenseItemIds.
         */
        public Builder licenseItemIds(String licenseItemIds) {
            this.putBodyParameter("LicenseItemIds", licenseItemIds);
            this.licenseItemIds = licenseItemIds;
            return this;
        }

        /**
         * OrderIds.
         */
        public Builder orderIds(String orderIds) {
            this.putQueryParameter("OrderIds", orderIds);
            this.orderIds = orderIds;
            return this;
        }

        /**
         * PurchaseMethod.
         */
        public Builder purchaseMethod(String purchaseMethod) {
            this.putQueryParameter("PurchaseMethod", purchaseMethod);
            this.purchaseMethod = purchaseMethod;
            return this;
        }

        @Override
        public RenewAppLicenseRequest build() {
            return new RenewAppLicenseRequest(this);
        } 

    } 

}
