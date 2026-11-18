// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link ListCustomDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomDomainsResponseBody</p>
 */
public class ListCustomDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("customDomains")
    private java.util.List<CustomDomainResp> customDomains;

    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextOffset")
    private Integer nextOffset;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListCustomDomainsResponseBody(Builder builder) {
        this.code = builder.code;
        this.customDomains = builder.customDomains;
        this.hasMore = builder.hasMore;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextOffset = builder.nextOffset;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomDomainsResponseBody create() {
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
     * @return customDomains
     */
    public java.util.List<CustomDomainResp> getCustomDomains() {
        return this.customDomains;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextOffset
     */
    public Integer getNextOffset() {
        return this.nextOffset;
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
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<CustomDomainResp> customDomains; 
        private Boolean hasMore; 
        private Integer maxResults; 
        private String message; 
        private Integer nextOffset; 
        private String nextToken; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListCustomDomainsResponseBody model) {
            this.code = model.code;
            this.customDomains = model.customDomains;
            this.hasMore = model.hasMore;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextOffset = model.nextOffset;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The response code. The value is 200 if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The custom domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder customDomains(java.util.List<CustomDomainResp> customDomains) {
            this.customDomains = customDomains;
            return this;
        }

        /**
         * <p>Indicates whether a next page is available.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>The maximum number of records to return per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The offset for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder nextOffset(Integer nextOffset) {
            this.nextOffset = nextOffset;
            return this;
        }

        /**
         * <p>The pagination token for the next page. This parameter is empty if no more results are available.</p>
         * 
         * <strong>example:</strong>
         * <p>cae5f900-8b1d-4c0e-9c2a-1a2b3c4d5e6f</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2BCFAE0A-9FA9-5F72-8E8B-724632BC19A9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>65</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListCustomDomainsResponseBody build() {
            return new ListCustomDomainsResponseBody(this);
        } 

    } 

}
