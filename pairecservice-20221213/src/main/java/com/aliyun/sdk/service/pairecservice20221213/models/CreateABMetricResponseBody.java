// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateABMetricResponseBody} extends {@link TeaModel}
 *
 * <p>CreateABMetricResponseBody</p>
 */
public class CreateABMetricResponseBody extends TeaModel {
    @NameInMap("ABMetricId")
    private String ABMetricId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateABMetricResponseBody(Builder builder) {
        this.ABMetricId = builder.ABMetricId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateABMetricResponseBody create() {
        return builder().build();
    }

    /**
     * @return ABMetricId
     */
    public String getABMetricId() {
        return this.ABMetricId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ABMetricId; 
        private String requestId; 

        /**
         * ABMetricId.
         */
        public Builder ABMetricId(String ABMetricId) {
            this.ABMetricId = ABMetricId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateABMetricResponseBody build() {
            return new CreateABMetricResponseBody(this);
        } 

    } 

}
