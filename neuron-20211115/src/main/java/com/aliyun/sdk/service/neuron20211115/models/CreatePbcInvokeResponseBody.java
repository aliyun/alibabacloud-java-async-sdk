// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link CreatePbcInvokeResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePbcInvokeResponseBody</p>
 */
public class CreatePbcInvokeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pbcInvokeId")
    private Long pbcInvokeId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreatePbcInvokeResponseBody(Builder builder) {
        this.pbcInvokeId = builder.pbcInvokeId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePbcInvokeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pbcInvokeId
     */
    public Long getPbcInvokeId() {
        return this.pbcInvokeId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long pbcInvokeId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreatePbcInvokeResponseBody model) {
            this.pbcInvokeId = model.pbcInvokeId;
            this.requestId = model.requestId;
        } 

        /**
         * pbcInvokeId.
         */
        public Builder pbcInvokeId(Long pbcInvokeId) {
            this.pbcInvokeId = pbcInvokeId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePbcInvokeResponseBody build() {
            return new CreatePbcInvokeResponseBody(this);
        } 

    } 

}
