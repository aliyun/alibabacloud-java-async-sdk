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
 * {@link HttpDeliveryHeaderParamValue} extends {@link TeaModel}
 *
 * <p>HttpDeliveryHeaderParamValue</p>
 */
public class HttpDeliveryHeaderParamValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("StaticValue")
    private String staticValue;

    private HttpDeliveryHeaderParamValue(Builder builder) {
        this.staticValue = builder.staticValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpDeliveryHeaderParamValue create() {
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

        private Builder(HttpDeliveryHeaderParamValue model) {
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

        public HttpDeliveryHeaderParamValue build() {
            return new HttpDeliveryHeaderParamValue(this);
        } 

    } 

}
