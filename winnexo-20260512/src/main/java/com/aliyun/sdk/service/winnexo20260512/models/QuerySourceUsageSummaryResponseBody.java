// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link QuerySourceUsageSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySourceUsageSummaryResponseBody</p>
 */
public class QuerySourceUsageSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("retrievalCount")
    private Long retrievalCount;

    @com.aliyun.core.annotation.NameInMap("retrievedSourceCount")
    private Long retrievedSourceCount;

    @com.aliyun.core.annotation.NameInMap("sourceCount")
    private Long sourceCount;

    @com.aliyun.core.annotation.NameInMap("usageCount")
    private Long usageCount;

    @com.aliyun.core.annotation.NameInMap("usedSourceCount")
    private Long usedSourceCount;

    private QuerySourceUsageSummaryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.retrievalCount = builder.retrievalCount;
        this.retrievedSourceCount = builder.retrievedSourceCount;
        this.sourceCount = builder.sourceCount;
        this.usageCount = builder.usageCount;
        this.usedSourceCount = builder.usedSourceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySourceUsageSummaryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retrievalCount
     */
    public Long getRetrievalCount() {
        return this.retrievalCount;
    }

    /**
     * @return retrievedSourceCount
     */
    public Long getRetrievedSourceCount() {
        return this.retrievedSourceCount;
    }

    /**
     * @return sourceCount
     */
    public Long getSourceCount() {
        return this.sourceCount;
    }

    /**
     * @return usageCount
     */
    public Long getUsageCount() {
        return this.usageCount;
    }

    /**
     * @return usedSourceCount
     */
    public Long getUsedSourceCount() {
        return this.usedSourceCount;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Long retrievalCount; 
        private Long retrievedSourceCount; 
        private Long sourceCount; 
        private Long usageCount; 
        private Long usedSourceCount; 

        private Builder() {
        } 

        private Builder(QuerySourceUsageSummaryResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.retrievalCount = model.retrievalCount;
            this.retrievedSourceCount = model.retrievedSourceCount;
            this.sourceCount = model.sourceCount;
            this.usageCount = model.usageCount;
            this.usedSourceCount = model.usedSourceCount;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The status code description.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of retrieval recalls.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder retrievalCount(Long retrievalCount) {
            this.retrievalCount = retrievalCount;
            return this;
        }

        /**
         * <p>The deduplicated count of sources that have retrieval events.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder retrievedSourceCount(Long retrievedSourceCount) {
            this.retrievedSourceCount = retrievedSourceCount;
            return this;
        }

        /**
         * <p>The number of rows in the source data.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder sourceCount(Long sourceCount) {
            this.sourceCount = sourceCount;
            return this;
        }

        /**
         * <p>The number of times the source has been used in agents.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder usageCount(Long usageCount) {
            this.usageCount = usageCount;
            return this;
        }

        /**
         * <p>The deduplicated count of sources that have usage events.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder usedSourceCount(Long usedSourceCount) {
            this.usedSourceCount = usedSourceCount;
            return this;
        }

        public QuerySourceUsageSummaryResponseBody build() {
            return new QuerySourceUsageSummaryResponseBody(this);
        } 

    } 

}
