// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link ListEventBusesRequest} extends {@link RequestModel}
 *
 * <p>ListEventBusesRequest</p>
 */
public class ListEventBusesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamePrefix")
    private String namePrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
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
         * <p>The maximum number of entries to return in a request. You can use this parameter and NextToken to implement paging.</p>
         * <blockquote>
         * <p> A maximum of 100 entries can be returned in a request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The prefix of the names of the event buses that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>My</p>
         */
        public Builder namePrefix(String namePrefix) {
            this.putQueryParameter("NamePrefix", namePrefix);
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * <p>If you configure Limit and excess return values exist, this parameter is returned. You can use this parameter and Limit to implement paging.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
