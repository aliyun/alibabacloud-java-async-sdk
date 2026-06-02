// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeCreditPackageRequest} extends {@link RequestModel}
 *
 * <p>DescribeCreditPackageRequest</p>
 */
public class DescribeCreditPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreditPackageId")
    private String creditPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreditPackageStatus")
    private String creditPackageStatus;

    private DescribeCreditPackageRequest(Builder builder) {
        super(builder);
        this.creditPackageId = builder.creditPackageId;
        this.creditPackageStatus = builder.creditPackageStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCreditPackageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creditPackageId
     */
    public String getCreditPackageId() {
        return this.creditPackageId;
    }

    /**
     * @return creditPackageStatus
     */
    public String getCreditPackageStatus() {
        return this.creditPackageStatus;
    }

    public static final class Builder extends Request.Builder<DescribeCreditPackageRequest, Builder> {
        private String creditPackageId; 
        private String creditPackageStatus; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCreditPackageRequest request) {
            super(request);
            this.creditPackageId = request.creditPackageId;
            this.creditPackageStatus = request.creditPackageStatus;
        } 

        /**
         * CreditPackageId.
         */
        public Builder creditPackageId(String creditPackageId) {
            this.putQueryParameter("CreditPackageId", creditPackageId);
            this.creditPackageId = creditPackageId;
            return this;
        }

        /**
         * CreditPackageStatus.
         */
        public Builder creditPackageStatus(String creditPackageStatus) {
            this.putQueryParameter("CreditPackageStatus", creditPackageStatus);
            this.creditPackageStatus = creditPackageStatus;
            return this;
        }

        @Override
        public DescribeCreditPackageRequest build() {
            return new DescribeCreditPackageRequest(this);
        } 

    } 

}
