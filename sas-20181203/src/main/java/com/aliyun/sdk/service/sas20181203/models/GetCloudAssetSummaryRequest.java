// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetCloudAssetSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetCloudAssetSummaryRequest</p>
 */
public class GetCloudAssetSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendors")
    private java.util.List < Integer > vendors;

    private GetCloudAssetSummaryRequest(Builder builder) {
        super(builder);
        this.vendors = builder.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudAssetSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return vendors
     */
    public java.util.List < Integer > getVendors() {
        return this.vendors;
    }

    public static final class Builder extends Request.Builder<GetCloudAssetSummaryRequest, Builder> {
        private java.util.List < Integer > vendors; 

        private Builder() {
            super();
        } 

        private Builder(GetCloudAssetSummaryRequest request) {
            super(request);
            this.vendors = request.vendors;
        } 

        /**
         * <p>The asset type by service provider.</p>
         */
        public Builder vendors(java.util.List < Integer > vendors) {
            this.putQueryParameter("Vendors", vendors);
            this.vendors = vendors;
            return this;
        }

        @Override
        public GetCloudAssetSummaryRequest build() {
            return new GetCloudAssetSummaryRequest(this);
        } 

    } 

}
