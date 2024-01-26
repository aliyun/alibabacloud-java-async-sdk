// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterResourceDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterResourceDetailRequest</p>
 */
public class DescribeClusterResourceDetailRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    private DescribeClusterResourceDetailRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterResourceDetailRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeClusterResourceDetailRequest, Builder> {
        private String DBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterResourceDetailRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
        } 

        /**
         * The cluster ID.
         * <p>
         * 
         * >  You can call the [DescribeDBClusters](~~129857~~) operation to query the information about all AnalyticDB for MySQL clusters within a region, including cluster IDs.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        @Override
        public DescribeClusterResourceDetailRequest build() {
            return new DescribeClusterResourceDetailRequest(this);
        } 

    } 

}
