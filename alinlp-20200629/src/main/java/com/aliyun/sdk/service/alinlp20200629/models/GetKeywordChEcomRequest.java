// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetKeywordChEcomRequest} extends {@link RequestModel}
 *
 * <p>GetKeywordChEcomRequest</p>
 */
public class GetKeywordChEcomRequest extends Request {
    @Body
    @NameInMap("ApiVersion")
    private String apiVersion;

    @Body
    @NameInMap("ServiceCode")
    @Validation(required = true)
    private String serviceCode;

    @Body
    @NameInMap("Text")
    @Validation(required = true)
    private String text;

    private GetKeywordChEcomRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.serviceCode = builder.serviceCode;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKeywordChEcomRequest create() {
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
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder extends Request.Builder<GetKeywordChEcomRequest, Builder> {
        private String apiVersion; 
        private String serviceCode; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(GetKeywordChEcomRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.serviceCode = request.serviceCode;
            this.text = request.text;
        } 

        /**
         * ApiVersion.
         */
        public Builder apiVersion(String apiVersion) {
            this.putBodyParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * ServiceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(String text) {
            this.putBodyParameter("Text", text);
            this.text = text;
            return this;
        }

        @Override
        public GetKeywordChEcomRequest build() {
            return new GetKeywordChEcomRequest(this);
        } 

    } 

}
