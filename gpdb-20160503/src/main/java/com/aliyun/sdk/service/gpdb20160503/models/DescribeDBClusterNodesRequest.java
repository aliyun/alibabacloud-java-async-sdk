// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterNodesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBClusterNodesRequest</p>
 */
public class DescribeDBClusterNodesRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("NodeType")
    @Validation(required = true)
    private String nodeType;

    private DescribeDBClusterNodesRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.nodeType = builder.nodeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterNodesRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDBClusterNodesRequest, Builder> {
        private String DBInstanceId; 
        private String nodeType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBClusterNodesRequest response) {
            super(response);
            this.DBInstanceId = response.DBInstanceId;
            this.nodeType = response.nodeType;
        } 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * NodeType.
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        @Override
        public DescribeDBClusterNodesRequest build() {
            return new DescribeDBClusterNodesRequest(this);
        } 

    } 

}
