// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListCustomDomainsRequest} extends {@link RequestModel}
 *
 * <p>ListCustomDomainsRequest</p>
 */
public class ListCustomDomainsRequest extends Request {
    @Query
    @NameInMap("limit")
    private Integer limit;

    @Query
    @NameInMap("nextToken")
    private String nextToken;

    @Query
    @NameInMap("prefix")
    private String prefix;

    @Query
    @NameInMap("startKey")
    private String startKey;


    private ListCustomDomainsRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.prefix = builder.prefix;
        this.startKey = builder.startKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomDomainsRequest create() {
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

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return startKey
     */
    public String getStartKey() {
        return this.startKey;
    }

    public static final class Builder extends Request.Builder {
        private Integer limit; 
        private String nextToken; 
        private String prefix; 
        private String startKey; 

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

        /**
         * <p>prefix.</p>
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * <p>startKey.</p>
         */
        public Builder startKey(String startKey) {
            this.putQueryParameter("startKey", startKey);
            this.startKey = startKey;
            return this;
        }

        public ListCustomDomainsRequest build() {
            return new ListCustomDomainsRequest(this);
        } 

    } 

}
