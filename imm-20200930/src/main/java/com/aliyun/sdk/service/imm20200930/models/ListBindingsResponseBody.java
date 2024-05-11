// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBindingsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBindingsResponseBody</p>
 */
public class ListBindingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bindings")
    private java.util.List < Binding > bindings;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListBindingsResponseBody(Builder builder) {
        this.bindings = builder.bindings;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBindingsResponseBody create() {
        return builder().build();
    }

    /**
     * @return bindings
     */
    public java.util.List < Binding > getBindings() {
        return this.bindings;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Binding > bindings; 
        private String nextToken; 
        private String requestId; 

        /**
         * Bindings.
         */
        public Builder bindings(java.util.List < Binding > bindings) {
            this.bindings = bindings;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListBindingsResponseBody build() {
            return new ListBindingsResponseBody(this);
        } 

    } 

}
