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
 * {@link HttpApiSystemParameterMapping} extends {@link TeaModel}
 *
 * <p>HttpApiSystemParameterMapping</p>
 */
public class HttpApiSystemParameterMapping extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    private HttpApiSystemParameterMapping(Builder builder) {
        this.name = builder.name;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiSystemParameterMapping create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder {
        private String name; 
        private String source; 

        private Builder() {
        } 

        private Builder(HttpApiSystemParameterMapping model) {
            this.name = model.name;
            this.source = model.source;
        } 

        /**
         * <p>Optional. If this parameter is omitted or is an empty string, the default name based on the source is used. The default names for Header and Query are the same. The header name must be valid and cannot be Host, a pseudo-header, X-Mse-Consumer, or X-Mse-Consumer-Id.</p>
         * 
         * <strong>example:</strong>
         * <p>x-apig-api-id</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Required when configuring each mapping. The request is rejected if this parameter is omitted or empty. APIID and APIName represent the identifier and name of the current API. OperationId and OperationName represent the identifier and name of the current operation. ConsumerID, ConsumerName, and ConsumerExtInfo represent the identifier, name, and extended information of the currently authenticated consumer.</p>
         * 
         * <strong>example:</strong>
         * <p>APIID</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        public HttpApiSystemParameterMapping build() {
            return new HttpApiSystemParameterMapping(this);
        } 

    } 

}
