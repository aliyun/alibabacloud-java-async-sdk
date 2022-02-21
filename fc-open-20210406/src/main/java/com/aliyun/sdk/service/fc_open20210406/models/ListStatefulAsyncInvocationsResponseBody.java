// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStatefulAsyncInvocationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListStatefulAsyncInvocationsResponseBody</p>
 */
public class ListStatefulAsyncInvocationsResponseBody extends TeaModel {
    @NameInMap("invocations")
    private java.util.List < StatefulAsyncInvocation > invocations;

    @NameInMap("nextToken")
    private String nextToken;

    private ListStatefulAsyncInvocationsResponseBody(Builder builder) {
        this.invocations = builder.invocations;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStatefulAsyncInvocationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return invocations
     */
    public java.util.List < StatefulAsyncInvocation > getInvocations() {
        return this.invocations;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List < StatefulAsyncInvocation > invocations; 
        private String nextToken; 

        /**
         * invocations.
         */
        public Builder invocations(java.util.List < StatefulAsyncInvocation > invocations) {
            this.invocations = invocations;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public ListStatefulAsyncInvocationsResponseBody build() {
            return new ListStatefulAsyncInvocationsResponseBody(this);
        } 

    } 

}
