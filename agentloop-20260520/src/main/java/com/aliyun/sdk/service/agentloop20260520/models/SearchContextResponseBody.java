// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link SearchContextResponseBody} extends {@link TeaModel}
 *
 * <p>SearchContextResponseBody</p>
 */
public class SearchContextResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<java.util.Map<String, ?>> results;

    private SearchContextResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchContextResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List<java.util.Map<String, ?>> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<java.util.Map<String, ?>> results; 

        private Builder() {
        } 

        private Builder(SearchContextResponseBody model) {
            this.requestId = model.requestId;
            this.results = model.results;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * results.
         */
        public Builder results(java.util.List<java.util.Map<String, ?>> results) {
            this.results = results;
            return this;
        }

        public SearchContextResponseBody build() {
            return new SearchContextResponseBody(this);
        } 

    } 

}
