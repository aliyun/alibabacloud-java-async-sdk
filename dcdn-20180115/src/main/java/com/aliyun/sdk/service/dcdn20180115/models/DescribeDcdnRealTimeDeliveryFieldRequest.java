// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnRealTimeDeliveryFieldRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnRealTimeDeliveryFieldRequest</p>
 */
public class DescribeDcdnRealTimeDeliveryFieldRequest extends Request {
    @Query
    @NameInMap("BusinessType")
    private String businessType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeDcdnRealTimeDeliveryFieldRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.ownerId = builder.ownerId;
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

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnRealTimeDeliveryFieldRequest, Builder> {
        private String businessType; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnRealTimeDeliveryFieldRequest response) {
            super(response);
            this.businessType = response.businessType;
            this.ownerId = response.ownerId;
        } 

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public DescribeDcdnRealTimeDeliveryFieldRequest build() {
            return new DescribeDcdnRealTimeDeliveryFieldRequest(this);
        } 

    } 

}
