// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductsRequest} extends {@link RequestModel}
 *
 * <p>ListProductsRequest</p>
 */
public class ListProductsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCodes")
    private String productCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCodes")
    private String serviceCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private Boolean verbose;

    private ListProductsRequest(Builder builder) {
        super(builder);
        this.productCodes = builder.productCodes;
        this.serviceCodes = builder.serviceCodes;
        this.verbose = builder.verbose;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productCodes
     */
    public String getProductCodes() {
        return this.productCodes;
    }

    /**
     * @return serviceCodes
     */
    public String getServiceCodes() {
        return this.serviceCodes;
    }

    /**
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    public static final class Builder extends Request.Builder<ListProductsRequest, Builder> {
        private String productCodes; 
        private String serviceCodes; 
        private Boolean verbose; 

        private Builder() {
            super();
        } 

        private Builder(ListProductsRequest request) {
            super(request);
            this.productCodes = request.productCodes;
            this.serviceCodes = request.serviceCodes;
            this.verbose = request.verbose;
        } 

        /**
         * ProductCodes.
         */
        public Builder productCodes(String productCodes) {
            this.putQueryParameter("ProductCodes", productCodes);
            this.productCodes = productCodes;
            return this;
        }

        /**
         * ServiceCodes.
         */
        public Builder serviceCodes(String serviceCodes) {
            this.putQueryParameter("ServiceCodes", serviceCodes);
            this.serviceCodes = serviceCodes;
            return this;
        }

        /**
         * Verbose.
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        @Override
        public ListProductsRequest build() {
            return new ListProductsRequest(this);
        } 

    } 

}
