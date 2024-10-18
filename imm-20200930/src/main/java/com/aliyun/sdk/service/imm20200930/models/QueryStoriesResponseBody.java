// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryStoriesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryStoriesResponseBody</p>
 */
public class QueryStoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Stories")
    private java.util.List < Story > stories;

    private QueryStoriesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.stories = builder.stories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStoriesResponseBody create() {
        return builder().build();
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
     * @return stories
     */
    public java.util.List < Story > getStories() {
        return this.stories;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < Story > stories; 

        /**
         * <p>The pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3Qx****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2C5C1E0F-D8B8-4DA0-8127-EC32C771****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The stories.</p>
         */
        public Builder stories(java.util.List < Story > stories) {
            this.stories = stories;
            return this;
        }

        public QueryStoriesResponseBody build() {
            return new QueryStoriesResponseBody(this);
        } 

    } 

}
