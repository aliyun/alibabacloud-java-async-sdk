// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link GetMetricStoreMeteringModeResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetricStoreMeteringModeResponseBody</p>
 */
public class GetMetricStoreMeteringModeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("meteringMode")
    private String meteringMode;

    private GetMetricStoreMeteringModeResponseBody(Builder builder) {
        this.meteringMode = builder.meteringMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetricStoreMeteringModeResponseBody create() {
        return builder().build();
    }

    /**
     * @return meteringMode
     */
    public String getMeteringMode() {
        return this.meteringMode;
    }

    public static final class Builder {
        private String meteringMode; 

        /**
         * <p>The billing mode. Default value: ChargeByFunction. Valid values: ChargeByFunction and ChargeByDataIngest.</p>
         * 
         * <strong>example:</strong>
         * <p>ChargeByFunction</p>
         */
        public Builder meteringMode(String meteringMode) {
            this.meteringMode = meteringMode;
            return this;
        }

        public GetMetricStoreMeteringModeResponseBody build() {
            return new GetMetricStoreMeteringModeResponseBody(this);
        } 

    } 

}
