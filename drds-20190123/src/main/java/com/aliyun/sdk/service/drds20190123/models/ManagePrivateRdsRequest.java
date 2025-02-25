// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ManagePrivateRdsRequest} extends {@link RequestModel}
 *
 * <p>ManagePrivateRdsRequest</p>
 */
public class ManagePrivateRdsRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("Params")
    private String params;

    @Query
    @NameInMap("RdsAction")
    @Validation(required = true)
    private String rdsAction;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ManagePrivateRdsRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.params = builder.params;
        this.rdsAction = builder.rdsAction;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManagePrivateRdsRequest create() {
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
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return rdsAction
     */
    public String getRdsAction() {
        return this.rdsAction;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ManagePrivateRdsRequest, Builder> {
        private String DBInstanceId; 
        private String drdsInstanceId; 
        private String params; 
        private String rdsAction; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ManagePrivateRdsRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.drdsInstanceId = request.drdsInstanceId;
            this.params = request.params;
            this.rdsAction = request.rdsAction;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the custom ApsaraDB RDS instance at the storage layer.
         * <p>
         * 
         * > You can call the [DescribeDrdsRdsInstances](~~215526~~) operation to query the details of all ApsaraDB RDS instances, including the ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The ID of the PolarDB-X 1.0 instance.
         * <p>
         * 
         * > You can call the [DescribeDrdsInstances](~~139284~~) operation to query the details of all PolarDB-X 1.0 instances within an Alibaba Cloud account, including the IDs of the instances.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * The JSON string that consists of request parameters and the values of the request parameters of an operation that you need to call for the custom ApsaraDB RDS instance. The value of a request parameter is of the STRING type. Example: `{NodeId:"1797****"}`.
         * <p>
         * 
         * For more information about the request parameters and valid values of the request parameters of each operation, see the request parameter sections in the following topics:
         * 
         * *   [DescribeDBInstanceAttribute](~~26231~~)
         * *   [DescribeAvailableClasses](~~196546~~)
         * *   [DescribeSQLCollectorPolicy](~~26292~~)
         * *   [ModifySQLCollectorPolicy](~~26293~~)
         * *   [DescribeParameters](~~26285~~)
         * *   [ModifyParameter](~~26286~~)
         * *   [DescribeDBInstanceHAConfig](~~26244~~)
         * *   [SwitchDBInstanceHA](~~26251~~)
         * 
         * > Among the required request parameters of the preceding operations, you do not need to specify the `Action` and `DBInstanceId` parameters. You must specify all the other required request parameters.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * The operation that you want to perform on the custom ApsaraDB RDS instance. Valid values:
         * <p>
         * 
         * *   **DescribeDBInstanceAttribute**: queries the details of the custom ApsaraDB RDS instance.
         * *   **DescribeAvailableClasses**: queries the specifications that are supported for a custom ApsaraDB RDS instance. The specifications include the instance type and the storage capacity.
         * *   **DescribeSQLCollectorPolicy**: queries whether the SQL Explorer (SQL Audit) feature is enabled for custom ApsaraDB RDS instance.
         * *   **ModifySQLCollectorPolicy**: enables or disables the SQL Explorer (SQL Audit) feature for the custom ApsaraDB RDS instance.
         * *   **DescribeParameters**: queries the parameter settings of the custom ApsaraDB RDS instance.
         * *   **ModifyParameter**: modifies the parameters of the custom ApsaraDB RDS instance.
         * *   **DescribeDBInstanceHAConfig**: queries the high availability mode and data replication mode of the custom ApsaraDB RDS instance.
         * *   **SwitchDBInstanceHA**: switches workloads between the primary and secondary custom ApsaraDB RDS instances.
         */
        public Builder rdsAction(String rdsAction) {
            this.putQueryParameter("RdsAction", rdsAction);
            this.rdsAction = rdsAction;
            return this;
        }

        /**
         * The ID of the region in which the PolarDB-X 1.0 instance resides.
         * <p>
         * 
         * > You can call the [DescribeDrdsInstances](~~139284~~) operation to query the details of all PolarDB-X 1.0 instances within an Alibaba Cloud account, including the IDs of regions in which the instances reside.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ManagePrivateRdsRequest build() {
            return new ManagePrivateRdsRequest(this);
        } 

    } 

}
