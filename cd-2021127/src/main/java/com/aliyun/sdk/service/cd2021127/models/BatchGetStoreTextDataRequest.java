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
 * {@link BatchGetStoreTextDataRequest} extends {@link RequestModel}
 *
 * <p>BatchGetStoreTextDataRequest</p>
 */
public class BatchGetStoreTextDataRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> storeIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("country")
    private String country;

    private BatchGetStoreTextDataRequest(Builder builder) {
        super(builder);
        this.storeIds = builder.storeIds;
        this.country = builder.country;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetStoreTextDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return storeIds
     */
    public java.util.List<String> getStoreIds() {
        return this.storeIds;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    public static final class Builder extends Request.Builder<BatchGetStoreTextDataRequest, Builder> {
        private java.util.List<String> storeIds; 
        private String country; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetStoreTextDataRequest request) {
            super(request);
            this.storeIds = request.storeIds;
            this.country = request.country;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder storeIds(java.util.List<String> storeIds) {
            String storeIdsShrink = shrink(storeIds, "StoreIds", "json");
            this.putBodyParameter("StoreIds", storeIdsShrink);
            this.storeIds = storeIds;
            return this;
        }

        /**
         * country.
         */
        public Builder country(String country) {
            this.putBodyParameter("country", country);
            this.country = country;
            return this;
        }

        @Override
        public BatchGetStoreTextDataRequest build() {
            return new BatchGetStoreTextDataRequest(this);
        } 

    } 

}
