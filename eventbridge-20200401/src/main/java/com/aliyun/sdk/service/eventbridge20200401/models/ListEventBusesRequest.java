// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link ListEventBusesRequest} extends {@link RequestModel}
 *
 * <p>ListEventBusesRequest</p>
 */
public class ListEventBusesRequest extends Request {
    @Query
    @NameInMap("Limit")
    private Integer limit;

    @Query
    @NameInMap("NamePrefix")
    private String namePrefix;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    private ListEventBusesRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
        this.namePrefix = builder.namePrefix;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventBusesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return namePrefix
     */
    public String getNamePrefix() {
        return this.namePrefix;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListEventBusesRequest, Builder> {
        private Integer limit; 
        private String namePrefix; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListEventBusesRequest request) {
            super(request);
            this.limit = request.limit;
            this.namePrefix = request.namePrefix;
            this.nextToken = request.nextToken;
        } 

        /**
         * The maximum number of entries to be returned in a call. You can use this parameter and NextToken to implement paging. Note: Up to 100 entries can be returned in a call.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The prefix of the names of the event buses that you want to query.
         */
        public Builder namePrefix(String namePrefix) {
            this.putQueryParameter("NamePrefix", namePrefix);
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * If you set Limit and excess return values exist, this parameter is returned.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListEventBusesRequest build() {
            return new ListEventBusesRequest(this);
        } 

    } 

}
