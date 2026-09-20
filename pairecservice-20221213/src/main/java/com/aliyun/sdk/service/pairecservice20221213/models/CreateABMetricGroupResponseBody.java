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
         * <p>The ID of the A/B metric group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ABMetricGroupId(String ABMetricGroupId) {
            this.ABMetricGroupId = ABMetricGroupId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E15A1443-7917-5BE0-AE70-25538ECF398D</p>
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
