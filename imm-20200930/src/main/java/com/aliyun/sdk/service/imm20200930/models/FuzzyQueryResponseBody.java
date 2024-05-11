// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FuzzyQueryResponseBody} extends {@link TeaModel}
 *
 * <p>FuzzyQueryResponseBody</p>
 */
public class FuzzyQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Files")
    private java.util.List < File > files;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalHits")
    private Long totalHits;

    private FuzzyQueryResponseBody(Builder builder) {
        this.files = builder.files;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalHits = builder.totalHits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FuzzyQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return files
     */
    public java.util.List < File > getFiles() {
        return this.files;
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
     * @return totalHits
     */
    public Long getTotalHits() {
        return this.totalHits;
    }

    public static final class Builder {
        private java.util.List < File > files; 
        private String nextToken; 
        private String requestId; 
        private Long totalHits; 

        /**
         * Files.
         */
        public Builder files(java.util.List < File > files) {
            this.files = files;
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

        /**
         * TotalHits.
         */
        public Builder totalHits(Long totalHits) {
            this.totalHits = totalHits;
            return this;
        }

        public FuzzyQueryResponseBody build() {
            return new FuzzyQueryResponseBody(this);
        } 

    } 

}
