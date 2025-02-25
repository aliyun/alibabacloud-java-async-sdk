// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link GetMenuDataStatusRequest} extends {@link RequestModel}
 *
 * <p>GetMenuDataStatusRequest</p>
 */
public class GetMenuDataStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BatchId")
    private String batchId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductContainerId")
    private String productContainerId;

    private GetMenuDataStatusRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
        this.country = builder.country;
        this.productContainerId = builder.productContainerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMenuDataStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return productContainerId
     */
    public String getProductContainerId() {
        return this.productContainerId;
    }

    public static final class Builder extends Request.Builder<GetMenuDataStatusRequest, Builder> {
        private String batchId; 
        private String country; 
        private String productContainerId; 

        private Builder() {
            super();
        } 

        private Builder(GetMenuDataStatusRequest request) {
            super(request);
            this.batchId = request.batchId;
            this.country = request.country;
            this.productContainerId = request.productContainerId;
        } 

        /**
         * BatchId.
         */
        public Builder batchId(String batchId) {
            this.putBodyParameter("BatchId", batchId);
            this.batchId = batchId;
            return this;
        }

        /**
         * Country.
         */
        public Builder country(String country) {
            this.putBodyParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * ProductContainerId.
         */
        public Builder productContainerId(String productContainerId) {
            this.putBodyParameter("ProductContainerId", productContainerId);
            this.productContainerId = productContainerId;
            return this;
        }

        @Override
        public GetMenuDataStatusRequest build() {
            return new GetMenuDataStatusRequest(this);
        } 

    } 

}
