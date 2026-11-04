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
 * {@link DescribeReplicationSlotsRequest} extends {@link RequestModel}
 *
 * <p>DescribeReplicationSlotsRequest</p>
 */
public class DescribeReplicationSlotsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubGroupName")
    private String subGroupName;

    private DescribeReplicationSlotsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.subGroupName = builder.subGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReplicationSlotsRequest create() {
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
     * @return subGroupName
     */
    public String getSubGroupName() {
        return this.subGroupName;
    }

    public static final class Builder extends Request.Builder<DescribeReplicationSlotsRequest, Builder> {
        private String DBClusterId; 
        private String subGroupName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeReplicationSlotsRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.subGroupName = request.subGroupName;
        } 

        /**
         * <p>The ID of the PolarDB cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-test123456</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The name of the child node of the distributed instance, used to filter replication slots.</p>
         * 
         * <strong>example:</strong>
         * <p>testGroup</p>
         */
        public Builder subGroupName(String subGroupName) {
            this.putQueryParameter("SubGroupName", subGroupName);
            this.subGroupName = subGroupName;
            return this;
        }

        @Override
        public DescribeReplicationSlotsRequest build() {
            return new DescribeReplicationSlotsRequest(this);
        } 

    } 

}
