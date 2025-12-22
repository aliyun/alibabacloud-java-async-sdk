// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link ListFunctionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFunctionsResponseBody</p>
 */
public class ListFunctionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("functions")
    private java.util.List<String> functions;

    @com.aliyun.core.annotation.NameInMap("nextPageToken")
    private String nextPageToken;

    private ListFunctionsResponseBody(Builder builder) {
        this.functions = builder.functions;
        this.nextPageToken = builder.nextPageToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functions
     */
    public java.util.List<String> getFunctions() {
        return this.functions;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public static final class Builder {
        private java.util.List<String> functions; 
        private String nextPageToken; 

        private Builder() {
        } 

        private Builder(ListFunctionsResponseBody model) {
            this.functions = model.functions;
            this.nextPageToken = model.nextPageToken;
        } 

        /**
         * functions.
         */
        public Builder functions(java.util.List<String> functions) {
            this.functions = functions;
            return this;
        }

        /**
         * nextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        public ListFunctionsResponseBody build() {
            return new ListFunctionsResponseBody(this);
        } 

    } 

}
