// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataModelConfigInfoRequest} extends {@link RequestModel}
 *
 * <p>GetDataModelConfigInfoRequest</p>
 */
public class GetDataModelConfigInfoRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    private String apiVersion;

    @Query
    @NameInMap("DataModelCode")
    @Validation(required = true)
    private String dataModelCode;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    private GetDataModelConfigInfoRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.dataModelCode = builder.dataModelCode;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataModelConfigInfoRequest create() {
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

    public static final class Builder extends Request.Builder<GetDataModelConfigInfoRequest, Builder> {
        private String apiVersion; 
        private String dataModelCode; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(GetDataModelConfigInfoRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
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
        public GetDataModelConfigInfoRequest build() {
            return new GetDataModelConfigInfoRequest(this);
        } 

    } 

}
