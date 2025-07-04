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
 * {@link CreateABMetricGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateABMetricGroupResponseBody</p>
 */
public class CreateABMetricGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ABMetricGroupId")
    private String ABMetricGroupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateABMetricGroupResponseBody(Builder builder) {
        this.ABMetricGroupId = builder.ABMetricGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateABMetricGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ABMetricGroupId
     */
    public String getABMetricGroupId() {
        return this.ABMetricGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ABMetricGroupId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateABMetricGroupResponseBody model) {
            this.ABMetricGroupId = model.ABMetricGroupId;
            this.requestId = model.requestId;
        } 

        /**
         * ABMetricGroupId.
         */
        public Builder ABMetricGroupId(String ABMetricGroupId) {
            this.ABMetricGroupId = ABMetricGroupId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateABMetricGroupResponseBody build() {
            return new CreateABMetricGroupResponseBody(this);
        } 

    } 

}
