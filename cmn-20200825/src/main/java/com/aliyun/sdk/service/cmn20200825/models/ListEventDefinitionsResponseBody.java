// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEventDefinitionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventDefinitionsResponseBody</p>
 */
public class ListEventDefinitionsResponseBody extends TeaModel {
    @NameInMap("EventDefinitions")
    private java.util.List < EventDefinition > eventDefinitions;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    @Validation(required = true)
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListEventDefinitionsResponseBody(Builder builder) {
        this.eventDefinitions = builder.eventDefinitions;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventDefinitionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return eventDefinitions
     */
    public java.util.List < EventDefinition > getEventDefinitions() {
        return this.eventDefinitions;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < EventDefinition > eventDefinitions; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * EventDefinitions.
         */
        public Builder eventDefinitions(java.util.List < EventDefinition > eventDefinitions) {
            this.eventDefinitions = eventDefinitions;
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEventDefinitionsResponseBody build() {
            return new ListEventDefinitionsResponseBody(this);
        } 

    } 

}
