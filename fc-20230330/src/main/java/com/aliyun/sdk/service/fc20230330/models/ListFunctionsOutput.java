// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionsOutput} extends {@link TeaModel}
 *
 * <p>ListFunctionsOutput</p>
 */
public class ListFunctionsOutput extends TeaModel {
    @NameInMap("functions")
    private java.util.List < Function > functions;

    @NameInMap("nextToken")
    private String nextToken;

    private ListFunctionsOutput(Builder builder) {
        this.functions = builder.functions;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionsOutput create() {
        return builder().build();
    }

    /**
     * @return functions
     */
    public java.util.List < Function > getFunctions() {
        return this.functions;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List < Function > functions; 
        private String nextToken; 

        /**
         * functions.
         */
        public Builder functions(java.util.List < Function > functions) {
            this.functions = functions;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public ListFunctionsOutput build() {
            return new ListFunctionsOutput(this);
        } 

    } 

}
