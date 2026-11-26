// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HttpApiSystemParameters} extends {@link TeaModel}
 *
 * <p>HttpApiSystemParameters</p>
 */
public class HttpApiSystemParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("headerParameters")
    private java.util.List<HttpApiSystemParameterMapping> headerParameters;

    @com.aliyun.core.annotation.NameInMap("queryParameters")
    private java.util.List<HttpApiSystemParameterMapping> queryParameters;

    private HttpApiSystemParameters(Builder builder) {
        this.headerParameters = builder.headerParameters;
        this.queryParameters = builder.queryParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiSystemParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return headerParameters
     */
    public java.util.List<HttpApiSystemParameterMapping> getHeaderParameters() {
        return this.headerParameters;
    }

    /**
     * @return queryParameters
     */
    public java.util.List<HttpApiSystemParameterMapping> getQueryParameters() {
        return this.queryParameters;
    }

    public static final class Builder {
        private java.util.List<HttpApiSystemParameterMapping> headerParameters; 
        private java.util.List<HttpApiSystemParameterMapping> queryParameters; 

        private Builder() {
        } 

        private Builder(HttpApiSystemParameters model) {
            this.headerParameters = model.headerParameters;
            this.queryParameters = model.queryParameters;
        } 

        /**
         * <p>The backend request header system parameters. If name is omitted or is an empty string, the default name for the source is used.</p>
         */
        public Builder headerParameters(java.util.List<HttpApiSystemParameterMapping> headerParameters) {
            this.headerParameters = headerParameters;
            return this;
        }

        /**
         * <p>The backend request query system parameters. If name is omitted or is an empty string, the default name for the source is used.</p>
         */
        public Builder queryParameters(java.util.List<HttpApiSystemParameterMapping> queryParameters) {
            this.queryParameters = queryParameters;
            return this;
        }

        public HttpApiSystemParameters build() {
            return new HttpApiSystemParameters(this);
        } 

    } 

}
