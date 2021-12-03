// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListReservedCapacitiesRequest} extends {@link RequestModel}
 *
 * <p>ListReservedCapacitiesRequest</p>
 */
public class ListReservedCapacitiesRequest extends Request {
    @Query
    @NameInMap("limit")
    private String limit;

    @Query
    @NameInMap("nextToken")
    private String nextToken;


    private ListReservedCapacitiesRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListReservedCapacitiesRequest create() {
        return builder().build();
    }

    /**
     * @return limit
     */
    public String getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder {
        private String limit; 
        private String nextToken; 

        /**
         * <p>limit.</p>
         */
        public Builder limit(String limit) {
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

        public ListReservedCapacitiesRequest build() {
            return new ListReservedCapacitiesRequest(this);
        } 

    } 

}
