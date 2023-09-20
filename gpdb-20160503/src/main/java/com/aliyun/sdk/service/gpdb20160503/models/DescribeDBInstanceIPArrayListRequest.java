// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceIPArrayListRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBInstanceIPArrayListRequest</p>
 */
public class DescribeDBInstanceIPArrayListRequest extends Request {
    @Query
    @NameInMap("DBInstanceIPArrayName")
    private String DBInstanceIPArrayName;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeDBInstanceIPArrayListRequest(Builder builder) {
        super(builder);
        this.DBInstanceIPArrayName = builder.DBInstanceIPArrayName;
        this.DBInstanceId = builder.DBInstanceId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceIPArrayListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceIPArrayName
     */
    public String getDBInstanceIPArrayName() {
        return this.DBInstanceIPArrayName;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeDBInstanceIPArrayListRequest, Builder> {
        private String DBInstanceIPArrayName; 
        private String DBInstanceId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBInstanceIPArrayListRequest request) {
            super(request);
            this.DBInstanceIPArrayName = request.DBInstanceIPArrayName;
            this.DBInstanceId = request.DBInstanceId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * DBInstanceIPArrayName.
         */
        public Builder DBInstanceIPArrayName(String DBInstanceIPArrayName) {
            this.putQueryParameter("DBInstanceIPArrayName", DBInstanceIPArrayName);
            this.DBInstanceIPArrayName = DBInstanceIPArrayName;
            return this;
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
         * The ID of the resource group to which the instance belongs. For information about how to obtain the ID of a resource group, see [View basic information of a resource group](~~151181~~).
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DescribeDBInstanceIPArrayListRequest build() {
            return new DescribeDBInstanceIPArrayListRequest(this);
        } 

    } 

}
