// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkastreaming20260202.models;

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
 * {@link ListSupportedConnectorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSupportedConnectorsResponseBody</p>
 */
public class ListSupportedConnectorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListSupportedConnectorsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSupportedConnectorsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListSupportedConnectorsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListSupportedConnectorsResponseBody build() {
            return new ListSupportedConnectorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSupportedConnectorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSupportedConnectorsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Connector")
        private String connector;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IconUrl")
        private String iconUrl;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SinkSql")
        private String sinkSql;

        @com.aliyun.core.annotation.NameInMap("SourceSql")
        private String sourceSql;

        private Data(Builder builder) {
            this.connector = builder.connector;
            this.description = builder.description;
            this.iconUrl = builder.iconUrl;
            this.name = builder.name;
            this.sinkSql = builder.sinkSql;
            this.sourceSql = builder.sourceSql;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return connector
         */
        public String getConnector() {
            return this.connector;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return iconUrl
         */
        public String getIconUrl() {
            return this.iconUrl;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sinkSql
         */
        public String getSinkSql() {
            return this.sinkSql;
        }

        /**
         * @return sourceSql
         */
        public String getSourceSql() {
            return this.sourceSql;
        }

        public static final class Builder {
            private String connector; 
            private String description; 
            private String iconUrl; 
            private String name; 
            private String sinkSql; 
            private String sourceSql; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.connector = model.connector;
                this.description = model.description;
                this.iconUrl = model.iconUrl;
                this.name = model.name;
                this.sinkSql = model.sinkSql;
                this.sourceSql = model.sourceSql;
            } 

            /**
             * Connector.
             */
            public Builder connector(String connector) {
                this.connector = connector;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IconUrl.
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SinkSql.
             */
            public Builder sinkSql(String sinkSql) {
                this.sinkSql = sinkSql;
                return this;
            }

            /**
             * SourceSql.
             */
            public Builder sourceSql(String sourceSql) {
                this.sourceSql = sourceSql;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
