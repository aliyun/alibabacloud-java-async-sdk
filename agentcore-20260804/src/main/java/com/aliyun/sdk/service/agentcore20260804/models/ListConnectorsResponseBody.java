// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListConnectorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConnectorsResponseBody</p>
 */
public class ListConnectorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListConnectorsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConnectorsResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListConnectorsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The list of connectors.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of connectors returned in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The next page token. The current version does not return this field.</p>
         * 
         * <strong>example:</strong>
         * <p>dGVzdA==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>request-123456</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of connectors returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListConnectorsResponseBody build() {
            return new ListConnectorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListConnectorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListConnectorsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("boundAgentCount")
        private Long boundAgentCount;

        @com.aliyun.core.annotation.NameInMap("enabledAt")
        private String enabledAt;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private String metadata;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Items(Builder builder) {
            this.boundAgentCount = builder.boundAgentCount;
            this.enabledAt = builder.enabledAt;
            this.metadata = builder.metadata;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return boundAgentCount
         */
        public Long getBoundAgentCount() {
            return this.boundAgentCount;
        }

        /**
         * @return enabledAt
         */
        public String getEnabledAt() {
            return this.enabledAt;
        }

        /**
         * @return metadata
         */
        public String getMetadata() {
            return this.metadata;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long boundAgentCount; 
            private String enabledAt; 
            private String metadata; 
            private String name; 
            private String status; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.boundAgentCount = model.boundAgentCount;
                this.enabledAt = model.enabledAt;
                this.metadata = model.metadata;
                this.name = model.name;
                this.status = model.status;
            } 

            /**
             * <p>The number of bound agents.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder boundAgentCount(Long boundAgentCount) {
                this.boundAgentCount = boundAgentCount;
                return this;
            }

            /**
             * <p>The time when the connector was enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-01T08:00:00Z</p>
             */
            public Builder enabledAt(String enabledAt) {
                this.enabledAt = enabledAt;
                return this;
            }

            /**
             * <p>The connector configuration JSON string. After the connector is enabled, this string may contain sensitive credentials.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;site&quot;:&quot;global&quot;,&quot;organizationId&quot;:&quot;org-xxxx&quot;}</p>
             */
            public Builder metadata(String metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The connector name. The current value is qodercli.</p>
             * 
             * <strong>example:</strong>
             * <p>qodercli</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The connector status.</p>
             * 
             * <strong>example:</strong>
             * <p>ENABLED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
