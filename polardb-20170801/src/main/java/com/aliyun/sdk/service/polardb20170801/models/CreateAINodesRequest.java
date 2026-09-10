// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateAINodesRequest} extends {@link RequestModel}
 *
 * <p>CreateAINodesRequest</p>
 */
public class CreateAINodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodes")
    private java.util.List<DBNodes> DBNodes;

    private CreateAINodesRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.DBNodes = builder.DBNodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAINodesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBNodes
     */
    public java.util.List<DBNodes> getDBNodes() {
        return this.DBNodes;
    }

    public static final class Builder extends Request.Builder<CreateAINodesRequest, Builder> {
        private String DBClusterId; 
        private java.util.List<DBNodes> DBNodes; 

        private Builder() {
            super();
        } 

        private Builder(CreateAINodesRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.DBNodes = request.DBNodes;
        } 

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>Call the <a href="https://api.aliyun.com/api/polardb/2017-08-01/DescribeAIDBClusters">DescribeAIDBClusters</a> operation to query information about all clusters in your account, including cluster IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pm-xxxxxx</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The information about the nodes to add.</p>
         */
        public Builder DBNodes(java.util.List<DBNodes> DBNodes) {
            this.putQueryParameter("DBNodes", DBNodes);
            this.DBNodes = DBNodes;
            return this;
        }

        @Override
        public CreateAINodesRequest build() {
            return new CreateAINodesRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAINodesRequest} extends {@link TeaModel}
     *
     * <p>CreateAINodesRequest</p>
     */
    public static class DBNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBNodeClass")
        private String DBNodeClass;

        private DBNodes(Builder builder) {
            this.DBNodeClass = builder.DBNodeClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNodes create() {
            return builder().build();
        }

        /**
         * @return DBNodeClass
         */
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public static final class Builder {
            private String DBNodeClass; 

            private Builder() {
            } 

            private Builder(DBNodes model) {
                this.DBNodeClass = model.DBNodeClass;
            } 

            /**
             * <p>The node specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>polar.mysql.g4.xlarge.gu10</p>
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            public DBNodes build() {
                return new DBNodes(this);
            } 

        } 

    }
}
