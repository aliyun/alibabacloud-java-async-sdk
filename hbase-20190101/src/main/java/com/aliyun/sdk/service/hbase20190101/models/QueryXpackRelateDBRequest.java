// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link QueryXpackRelateDBRequest} extends {@link RequestModel}
 *
 * <p>QueryXpackRelateDBRequest</p>
 */
public class QueryXpackRelateDBRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasSingleNode")
    private Boolean hasSingleNode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelateDbType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String relateDbType;

    private QueryXpackRelateDBRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.hasSingleNode = builder.hasSingleNode;
        this.relateDbType = builder.relateDbType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryXpackRelateDBRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return hasSingleNode
     */
    public Boolean getHasSingleNode() {
        return this.hasSingleNode;
    }

    /**
     * @return relateDbType
     */
    public String getRelateDbType() {
        return this.relateDbType;
    }

    public static final class Builder extends Request.Builder<QueryXpackRelateDBRequest, Builder> {
        private String clusterId; 
        private Boolean hasSingleNode; 
        private String relateDbType; 

        private Builder() {
            super();
        } 

        private Builder(QueryXpackRelateDBRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.hasSingleNode = request.hasSingleNode;
            this.relateDbType = request.relateDbType;
        } 

        /**
         * <p>The instance ID of the current Spark instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-bp1qtz9rcbbt3p6ng</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is valid only when bds queries associated HBase instances.</p>
         * <ul>
         * <li><p>true: Single-node HBase instances are included.</p>
         * </li>
         * <li><p>false: Single-node HBase instances are not included. This parameter is optional. For backward compatibility, single-node HBase instances are included when this parameter is left empty.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasSingleNode(Boolean hasSingleNode) {
            this.putQueryParameter("HasSingleNode", hasSingleNode);
            this.hasSingleNode = hasSingleNode;
            return this;
        }

        /**
         * <p>The type of database to query for association.</p>
         * <ul>
         * <li>spark can be associated with hdfs, hbase, mongodb, mysql, polardb_mysql, redis, and geomesa.</li>
         * <li>bds can be associated with hbase, spark, and hbaseue.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hbase</p>
         */
        public Builder relateDbType(String relateDbType) {
            this.putQueryParameter("RelateDbType", relateDbType);
            this.relateDbType = relateDbType;
            return this;
        }

        @Override
        public QueryXpackRelateDBRequest build() {
            return new QueryXpackRelateDBRequest(this);
        } 

    } 

}
