// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link ListBindingsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBindingsResponseBody</p>
 */
public class ListBindingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bindings")
    private java.util.List<Binding> bindings;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindings
     */
    public java.util.List<Binding> getBindings() {
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
        private java.util.List<Binding> bindings; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListBindingsResponseBody model) {
            this.bindings = model.bindings;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of bindings between datasets and OSS buckets.</p>
         */
        public Builder bindings(java.util.List<Binding> bindings) {
            this.bindings = bindings;
            return this;
        }

        /**
         * <ul>
         * <li>The pagination token that is used when the total number of bindings exceeds the value of MaxResults.</li>
         * <li>Use this value as NextToken in the next request to obtain the remaining bindings.</li>
         * <li>This parameter is returned only when not all bindings are returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>immtest:dataset001:examplebucket01</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EFDFD356-C928-4A36-951A-6EB5A592****</p>
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
