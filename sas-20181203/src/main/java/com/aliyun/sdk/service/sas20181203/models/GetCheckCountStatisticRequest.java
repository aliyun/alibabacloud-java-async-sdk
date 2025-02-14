// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetCheckCountStatisticRequest} extends {@link RequestModel}
 *
 * <p>GetCheckCountStatisticRequest</p>
 */
public class GetCheckCountStatisticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticType")
    private String statisticType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendors")
    private java.util.List<String> vendors;

    private GetCheckCountStatisticRequest(Builder builder) {
        super(builder);
        this.statisticType = builder.statisticType;
        this.vendors = builder.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckCountStatisticRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return statisticType
     */
    public String getStatisticType() {
        return this.statisticType;
    }

    /**
     * @return vendors
     */
    public java.util.List<String> getVendors() {
        return this.vendors;
    }

    public static final class Builder extends Request.Builder<GetCheckCountStatisticRequest, Builder> {
        private String statisticType; 
        private java.util.List<String> vendors; 

        private Builder() {
            super();
        } 

        private Builder(GetCheckCountStatisticRequest request) {
            super(request);
            this.statisticType = request.statisticType;
            this.vendors = request.vendors;
        } 

        /**
         * StatisticType.
         */
        public Builder statisticType(String statisticType) {
            this.putQueryParameter("StatisticType", statisticType);
            this.statisticType = statisticType;
            return this;
        }

        /**
         * Vendors.
         */
        public Builder vendors(java.util.List<String> vendors) {
            this.putQueryParameter("Vendors", vendors);
            this.vendors = vendors;
            return this;
        }

        @Override
        public GetCheckCountStatisticRequest build() {
            return new GetCheckCountStatisticRequest(this);
        } 

    } 

}
