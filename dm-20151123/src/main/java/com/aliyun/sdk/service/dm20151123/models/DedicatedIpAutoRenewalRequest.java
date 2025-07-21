// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link DedicatedIpAutoRenewalRequest} extends {@link RequestModel}
 *
 * <p>DedicatedIpAutoRenewalRequest</p>
 */
public class DedicatedIpAutoRenewalRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewal")
    @com.aliyun.core.annotation.Validation(required = true)
    private String autoRenewal;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuyResourceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String buyResourceIds;

    private DedicatedIpAutoRenewalRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoRenewal = builder.autoRenewal;
        this.buyResourceIds = builder.buyResourceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DedicatedIpAutoRenewalRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return autoRenewal
     */
    public String getAutoRenewal() {
        return this.autoRenewal;
    }

    /**
     * @return buyResourceIds
     */
    public String getBuyResourceIds() {
        return this.buyResourceIds;
    }

    public static final class Builder extends Request.Builder<DedicatedIpAutoRenewalRequest, Builder> {
        private String regionId; 
        private String autoRenewal; 
        private String buyResourceIds; 

        private Builder() {
            super();
        } 

        private Builder(DedicatedIpAutoRenewalRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoRenewal = request.autoRenewal;
            this.buyResourceIds = request.buyResourceIds;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Whether to enable auto-renewal</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenewal(String autoRenewal) {
            this.putQueryParameter("AutoRenewal", autoRenewal);
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * <p>Purchase instance ID, separated by English commas if multiple.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx,xxx</p>
         */
        public Builder buyResourceIds(String buyResourceIds) {
            this.putQueryParameter("BuyResourceIds", buyResourceIds);
            this.buyResourceIds = buyResourceIds;
            return this;
        }

        @Override
        public DedicatedIpAutoRenewalRequest build() {
            return new DedicatedIpAutoRenewalRequest(this);
        } 

    } 

}
