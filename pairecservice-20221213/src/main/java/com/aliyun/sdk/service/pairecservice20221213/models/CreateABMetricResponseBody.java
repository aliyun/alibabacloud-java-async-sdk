// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CreateABMetricResponseBody} extends {@link TeaModel}
 *
 * <p>CreateABMetricResponseBody</p>
 */
public class CreateABMetricResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ABMetricId")
    private String ABMetricId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateABMetricResponseBody model) {
            this.ABMetricId = model.ABMetricId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The AB metric ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ABMetricId(String ABMetricId) {
            this.ABMetricId = ABMetricId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F7AC05FF-EDE7-5C2B-B9AE-33D6DF4178BA</p>
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
