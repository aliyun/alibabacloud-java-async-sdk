// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyDataModelConfigInfoRequest} extends {@link RequestModel}
 *
 * <p>ApplyDataModelConfigInfoRequest</p>
 */
public class ApplyDataModelConfigInfoRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    private String apiVersion;

    @Query
    @NameInMap("Configuration")
    @Validation(required = true)
    private String configuration;

    @Query
    @NameInMap("DataModelCode")
    @Validation(required = true)
    private String dataModelCode;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    private ApplyDataModelConfigInfoRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.configuration = builder.configuration;
        this.dataModelCode = builder.dataModelCode;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyDataModelConfigInfoRequest create() {
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
     * @return configuration
     */
    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * @return dataModelCode
     */
    public String getDataModelCode() {
        return this.dataModelCode;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<ApplyDataModelConfigInfoRequest, Builder> {
        private String apiVersion; 
        private String configuration; 
        private String dataModelCode; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(ApplyDataModelConfigInfoRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.configuration = request.configuration;
            this.dataModelCode = request.dataModelCode;
            this.productKey = request.productKey;
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
         * Configuration.
         */
        public Builder configuration(String configuration) {
            this.putQueryParameter("Configuration", configuration);
            this.configuration = configuration;
            return this;
        }

        /**
         * DataModelCode.
         */
        public Builder dataModelCode(String dataModelCode) {
            this.putQueryParameter("DataModelCode", dataModelCode);
            this.dataModelCode = dataModelCode;
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

        @Override
        public ApplyDataModelConfigInfoRequest build() {
            return new ApplyDataModelConfigInfoRequest(this);
        } 

    } 

}
