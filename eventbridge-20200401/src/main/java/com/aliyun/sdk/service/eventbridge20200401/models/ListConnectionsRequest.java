// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link ListConnectionsRequest} extends {@link RequestModel}
 *
 * <p>ListConnectionsRequest</p>
 */
public class ListConnectionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectionNamePrefix")
    private String connectionNamePrefix;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludeType")
    private String excludeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListConnectionsRequest(Builder builder) {
        super(builder);
        this.connectionNamePrefix = builder.connectionNamePrefix;
        this.excludeType = builder.excludeType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConnectionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionNamePrefix
     */
    public String getConnectionNamePrefix() {
        return this.connectionNamePrefix;
    }

    /**
     * @return excludeType
     */
    public String getExcludeType() {
        return this.excludeType;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListConnectionsRequest, Builder> {
        private String connectionNamePrefix; 
        private String excludeType; 
        private Long maxResults; 
        private String nextToken; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListConnectionsRequest request) {
            super(request);
            this.connectionNamePrefix = request.connectionNamePrefix;
            this.excludeType = request.excludeType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.type = request.type;
        } 

        /**
         * <p>The prefix of the connection configuration name. Supports fuzzy match by prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>connection-name</p>
         */
        public Builder connectionNamePrefix(String connectionNamePrefix) {
            this.putBodyParameter("ConnectionNamePrefix", connectionNamePrefix);
            this.connectionNamePrefix = connectionNamePrefix;
            return this;
        }

        /**
         * <p>排除单个连接类型，取值范围与 Type 相同。传入单个类型名称，不支持数组或逗号分隔的多个值。例如传入 Http 可排除 HTTP 类型的连接。未传或传入空字符串时不排除任何类型；与 Type 相同时返回空列表。分页与总数均在过滤后计算。</p>
         * 
         * <strong>example:</strong>
         * <p>Http</p>
         */
        public Builder excludeType(String excludeType) {
            this.putBodyParameter("ExcludeType", excludeType);
            this.excludeType = excludeType;
            return this;
        }

        /**
         * <p>The maximum number of entries to return per request. You can use this parameter together with NextToken to implement paging.</p>
         * <ul>
         * <li>Default value: 10.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. If the number of results exceeds the value of MaxResults, a NextToken value is returned.</p>
         * <ul>
         * <li>The NextToken value starts from 0. Default value: 0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Filters query results by connection type. Valid values: Http, MySQL, PostgreSQL, Elasticsearch, OSS_TABLES, SLS, OTS, MaxCompute, MongoDB, Redis, SQLServer, ClickHouse, Oracle, Hive, Iceberg, and lakehouse. If this parameter is not specified, all types are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Http</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListConnectionsRequest build() {
            return new ListConnectionsRequest(this);
        } 

    } 

}
