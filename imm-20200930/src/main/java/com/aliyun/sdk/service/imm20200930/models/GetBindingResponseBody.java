// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBindingResponseBody} extends {@link TeaModel}
 *
 * <p>GetBindingResponseBody</p>
 */
public class GetBindingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Binding")
    private Binding binding;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetBindingResponseBody(Builder builder) {
        this.binding = builder.binding;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBindingResponseBody create() {
        return builder().build();
    }

    /**
     * @return binding
     */
    public Binding getBinding() {
        return this.binding;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Binding binding; 
        private String requestId; 

        /**
         * Binding.
         */
        public Builder binding(Binding binding) {
            this.binding = binding;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetBindingResponseBody build() {
            return new GetBindingResponseBody(this);
        } 

    } 

}
