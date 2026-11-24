// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
 * {@link RestartDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>RestartDBInstanceRequest</p>
 */
public class RestartDBInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComputingGroupId")
    private String computingGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeList")
    private java.util.List<String> nodeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private RestartDBInstanceRequest(Builder builder) {
        super(builder);
        this.computingGroupId = builder.computingGroupId;
        this.DBInstanceId = builder.DBInstanceId;
        this.nodeList = builder.nodeList;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartDBInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return computingGroupId
     */
    public String getComputingGroupId() {
        return this.computingGroupId;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return nodeList
     */
    public java.util.List<String> getNodeList() {
        return this.nodeList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RestartDBInstanceRequest, Builder> {
        private String computingGroupId; 
        private String DBInstanceId; 
        private java.util.List<String> nodeList; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RestartDBInstanceRequest request) {
            super(request);
            this.computingGroupId = request.computingGroupId;
            this.DBInstanceId = request.DBInstanceId;
            this.nodeList = request.nodeList;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The compute group ID. This parameter is required when NodeList is specified. If only ComputingGroupId is specified without NodeList, the entire compute group is restarted. If neither is specified, the entire instance is restarted.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-2zek7uow3827*****-clickhouse</p>
         */
        public Builder computingGroupId(String computingGroupId) {
            this.putQueryParameter("ComputingGroupId", computingGroupId);
            this.computingGroupId = computingGroupId;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp100p4q1g9z3****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The list of node IDs to restart. The elements are the NodeId values returned by DescribeDBInstanceNodes. The parameter format is NodeList.N. If this parameter is not specified or is empty, the entire instance or compute group is restarted based on the original logic. If this parameter is not empty, ComputingGroupId is required, and a maximum of 50 nodes can be specified at a time.</p>
         */
        public Builder nodeList(java.util.List<String> nodeList) {
            this.putQueryParameter("NodeList", nodeList);
            this.nodeList = nodeList;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RestartDBInstanceRequest build() {
            return new RestartDBInstanceRequest(this);
        } 

    } 

}
