// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDataRequest} extends {@link RequestModel}
 *
 * <p>AttachDataRequest</p>
 */
public class AttachDataRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    @Validation(required = true)
    private String apiVersion;

    @Query
    @NameInMap("BusinessId")
    private String businessId;

    @Query
    @NameInMap("Key")
    @Validation(required = true)
    private String key;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("Value")
    @Validation(required = true)
    private String value;

    private AttachDataRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.businessId = builder.businessId;
        this.key = builder.key;
        this.productKey = builder.productKey;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return businessId
     */
    public String getBusinessId() {
        return this.businessId;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<AttachDataRequest, Builder> {
        private String apiVersion; 
        private String businessId; 
        private String key; 
        private String productKey; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(AttachDataRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.businessId = request.businessId;
            this.key = request.key;
            this.productKey = request.productKey;
            this.value = request.value;
        } 

        /**
         * ApiVersion.
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * BusinessId.
         */
        public Builder businessId(String businessId) {
            this.putQueryParameter("BusinessId", businessId);
            this.businessId = businessId;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public AttachDataRequest build() {
            return new AttachDataRequest(this);
        } 

    } 

}
