// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchInventoryResponseBody} extends {@link TeaModel}
 *
 * <p>SearchInventoryResponseBody</p>
 */
public class SearchInventoryResponseBody extends TeaModel {
    @NameInMap("Entities")
    private java.util.List < java.util.Map<String, ?>> entities;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private SearchInventoryResponseBody(Builder builder) {
        this.entities = builder.entities;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchInventoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return entities
     */
    public java.util.List < java.util.Map<String, ?>> getEntities() {
        return this.entities;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
        private java.util.List < java.util.Map<String, ?>> entities; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        /**
         * Entities.
         */
        public Builder entities(java.util.List < java.util.Map<String, ?>> entities) {
            this.entities = entities;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SearchInventoryResponseBody build() {
            return new SearchInventoryResponseBody(this);
        } 

    } 

}
