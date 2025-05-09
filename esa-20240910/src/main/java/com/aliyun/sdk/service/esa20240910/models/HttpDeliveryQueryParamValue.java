// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link HttpDeliveryQueryParamValue} extends {@link TeaModel}
 *
 * <p>HttpDeliveryQueryParamValue</p>
 */
public class HttpDeliveryQueryParamValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("StaticValue")
    private String staticValue;

    private HttpDeliveryQueryParamValue(Builder builder) {
        this.staticValue = builder.staticValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpDeliveryQueryParamValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return staticValue
     */
    public String getStaticValue() {
        return this.staticValue;
    }

    public static final class Builder {
        private String staticValue; 

        private Builder() {
        } 

        private Builder(HttpDeliveryQueryParamValue model) {
            this.staticValue = model.staticValue;
        } 

        /**
         * <p>The static variable.</p>
         * 
         * <strong>example:</strong>
         * <p>alicdn</p>
         */
        public Builder staticValue(String staticValue) {
            this.staticValue = staticValue;
            return this;
        }

        public HttpDeliveryQueryParamValue build() {
            return new HttpDeliveryQueryParamValue(this);
        } 

    } 

}
