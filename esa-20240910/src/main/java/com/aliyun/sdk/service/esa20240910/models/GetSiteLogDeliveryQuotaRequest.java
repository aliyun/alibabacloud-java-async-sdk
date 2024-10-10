// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSiteLogDeliveryQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetSiteLogDeliveryQuotaRequest</p>
 */
public class GetSiteLogDeliveryQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private GetSiteLogDeliveryQuotaRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSiteLogDeliveryQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<GetSiteLogDeliveryQuotaRequest, Builder> {
        private String businessType; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(GetSiteLogDeliveryQuotaRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.siteId = request.siteId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dcdn_log_access_l1</p>
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public GetSiteLogDeliveryQuotaRequest build() {
            return new GetSiteLogDeliveryQuotaRequest(this);
        } 

    } 

}
