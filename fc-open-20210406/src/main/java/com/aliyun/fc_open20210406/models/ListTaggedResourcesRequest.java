// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListTaggedResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListTaggedResourcesRequest</p>
 */
public class ListTaggedResourcesRequest extends Request {
    @Query
    @NameInMap("limit")
    private Integer limit;

    @Query
    @NameInMap("nextToken")
    private String nextToken;


    private ListTaggedResourcesRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaggedResourcesRequest create() {
        return builder().build();
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

    public static final class Builder extends Request.Builder {
        private Integer limit; 
        private String nextToken; 

        /**
         * <p>limit.</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>nextToken.</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        public ListTaggedResourcesRequest build() {
            return new ListTaggedResourcesRequest(this);
        } 

    } 

}
