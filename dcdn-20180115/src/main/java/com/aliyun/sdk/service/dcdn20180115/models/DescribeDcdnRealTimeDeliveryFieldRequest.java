// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnRealTimeDeliveryFieldRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnRealTimeDeliveryFieldRequest</p>
 */
public class DescribeDcdnRealTimeDeliveryFieldRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    private DescribeDcdnRealTimeDeliveryFieldRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnRealTimeDeliveryFieldRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnRealTimeDeliveryFieldRequest, Builder> {
        private String businessType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnRealTimeDeliveryFieldRequest request) {
            super(request);
            this.businessType = request.businessType;
        } 

        /**
         * <p>The type of the collected logs. Default value: cdn_log_access_l1. Valid values:</p>
         * <ul>
         * <li><strong>cdn_log_access_l1</strong>: access logs of Dynamic Content Delivery Network (DCDN) points of presence (POPs)</li>
         * <li><strong>cdn_log_origin</strong>: back-to-origin logs</li>
         * <li><strong>cdn_log_er</strong>: EdgeRoutine logs</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cdn_log_access_l1</p>
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        @Override
        public DescribeDcdnRealTimeDeliveryFieldRequest build() {
            return new DescribeDcdnRealTimeDeliveryFieldRequest(this);
        } 

    } 

}
