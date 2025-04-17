// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FuzzyQueryResponseBody} extends {@link TeaModel}
 *
 * <p>FuzzyQueryResponseBody</p>
 */
public class FuzzyQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Files")
    private java.util.List<File> files;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return files
     */
    public java.util.List<File> getFiles() {
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
        private java.util.List<File> files; 
        private String nextToken; 
        private String requestId; 
        private Long totalHits; 

        private Builder() {
        } 

        private Builder(FuzzyQueryResponseBody model) {
            this.files = model.files;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalHits = model.totalHits;
        } 

        /**
         * <p>The files.</p>
         */
        public Builder files(java.util.List<File> files) {
            this.files = files;
            return this;
        }

        /**
         * <p>A pagination token.</p>
         * <p>It can be used in the next request to retrieve a new page of results.</p>
         * <p>If NextToken is empty, no next page exists.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1B3D5E0A-D8B8-4DA0-8127-ED32C851****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of hits.</p>
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
