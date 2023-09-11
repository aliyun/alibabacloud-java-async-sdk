// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterNodeRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBClusterNodeRequest</p>
 */
public class DescribeDBClusterNodeRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("NodeType")
    private String nodeType;

    private DescribeDBClusterNodeRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.nodeType = builder.nodeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    public static final class Builder extends Request.Builder<DescribeDBClusterNodeRequest, Builder> {
        private String DBInstanceId; 
        private String nodeType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBClusterNodeRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.nodeType = request.nodeType;
        } 

        /**
         * The instance ID.
         * <p>
         * 
         * > You can call the [DescribeDBInstances](~~86911~~) operation to query details about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The node type. Valid values:
         * <p>
         * 
         * *   **master**: coordinator node.
         * *   **segment**: compute node.
         * 
         * > If you do not specify this parameter, the information about all nodes is returned.
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        @Override
        public DescribeDBClusterNodeRequest build() {
            return new DescribeDBClusterNodeRequest(this);
        } 

    } 

}
