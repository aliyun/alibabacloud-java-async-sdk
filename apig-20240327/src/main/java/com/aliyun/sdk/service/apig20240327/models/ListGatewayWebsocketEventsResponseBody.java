// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListGatewayWebsocketEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayWebsocketEventsResponseBody</p>
 */
public class ListGatewayWebsocketEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListGatewayWebsocketEventsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayWebsocketEventsResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListGatewayWebsocketEventsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The business response code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The query result.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified gateway does not exist.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D0A6A1A0-8793-4C10-AB1A-2C03E770A912</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGatewayWebsocketEventsResponseBody build() {
            return new ListGatewayWebsocketEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGatewayWebsocketEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayWebsocketEventsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("basis")
        private String basis;

        @com.aliyun.core.annotation.NameInMap("hasMore")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<java.util.Map<String, ?>> items;

        @com.aliyun.core.annotation.NameInMap("maxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("nextToken")
        private String nextToken;

        private Data(Builder builder) {
            this.basis = builder.basis;
            this.hasMore = builder.hasMore;
            this.items = builder.items;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return basis
         */
        public String getBasis() {
            return this.basis;
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return items
         */
        public java.util.List<java.util.Map<String, ?>> getItems() {
            return this.items;
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

        public static final class Builder {
            private String basis; 
            private Boolean hasMore; 
            private java.util.List<java.util.Map<String, ?>> items; 
            private Integer maxResults; 
            private String nextToken; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.basis = model.basis;
                this.hasMore = model.hasMore;
                this.items = model.items;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
            } 

            /**
             * <p>The data basis.</p>
             * 
             * <strong>example:</strong>
             * <p>observed</p>
             */
            public Builder basis(String basis) {
                this.basis = basis;
                return this;
            }

            /**
             * <p>Indicates whether more pages are available.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * <p>The observability events.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder items(java.util.List<java.util.Map<String, ?>> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The actual number of results per page.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The next pagination token.</p>
             * 
             * <strong>example:</strong>
             * <p>opaque-token-from-previous-page</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
