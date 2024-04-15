// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConcurrencyConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListConcurrencyConfigsRequest</p>
 */
public class ListConcurrencyConfigsRequest extends Request {
    @Query
    @NameInMap("functionName")
    private String functionName;

    @Query
    @NameInMap("limit")
    private Integer limit;

    @Query
    @NameInMap("nextToken")
    private String nextToken;

    private ListConcurrencyConfigsRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConcurrencyConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListConcurrencyConfigsRequest, Builder> {
        private String functionName; 
        private Integer limit; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListConcurrencyConfigsRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
        } 

        /**
         * The function name. If you leave this parameter empty, the concurrency configurations of all functions are returned.
         */
        public Builder functionName(String functionName) {
            this.putQueryParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * The maximum number of entries returned.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListConcurrencyConfigsRequest build() {
            return new ListConcurrencyConfigsRequest(this);
        } 

    } 

}
