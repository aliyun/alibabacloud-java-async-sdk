// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link ManagePrivateRdsRequest} extends {@link RequestModel}
 *
 * <p>ManagePrivateRdsRequest</p>
 */
public class ManagePrivateRdsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RdsAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rdsAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
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
         * <p>The ID of the custom ApsaraDB RDS instance at the storage layer.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/215526.html">DescribeDrdsRdsInstances</a> operation to query the details of all ApsaraDB RDS instances, including the ID of the instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-***************</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The ID of the PolarDB-X 1.0 instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/139284.html">DescribeDrdsInstances</a> operation to query the details of all PolarDB-X 1.0 instances within an Alibaba Cloud account, including the IDs of the instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drds*************</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>The JSON string that consists of request parameters and the values of the request parameters of an operation that you need to call for the custom ApsaraDB RDS instance. The value of a request parameter is of the STRING type. Example: <code>{NodeId:&quot;1797****&quot;}</code>.</p>
         * <p>For more information about the request parameters and valid values of the request parameters of each operation, see the request parameter sections in the following topics:</p>
         * <ul>
         * <li><a href="https://help.aliyun.com/document_detail/26231.html">DescribeDBInstanceAttribute</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/196546.html">DescribeAvailableClasses</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/26292.html">DescribeSQLCollectorPolicy</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/26293.html">ModifySQLCollectorPolicy</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/26285.html">DescribeParameters</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/26286.html">ModifyParameter</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/26244.html">DescribeDBInstanceHAConfig</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/26251.html">SwitchDBInstanceHA</a></li>
         * </ul>
         * <blockquote>
         * <p>Among the required request parameters of the preceding operations, you do not need to specify the <code>Action</code> and <code>DBInstanceId</code> parameters. You must specify all the other required request parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{NodeId:&quot;1797****&quot;}</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>The operation that you want to perform on the custom ApsaraDB RDS instance. Valid values:</p>
         * <ul>
         * <li><strong>DescribeDBInstanceAttribute</strong>: queries the details of the custom ApsaraDB RDS instance.</li>
         * <li><strong>DescribeAvailableClasses</strong>: queries the specifications that are supported for a custom ApsaraDB RDS instance. The specifications include the instance type and the storage capacity.</li>
         * <li><strong>DescribeSQLCollectorPolicy</strong>: queries whether the SQL Explorer (SQL Audit) feature is enabled for custom ApsaraDB RDS instance.</li>
         * <li><strong>ModifySQLCollectorPolicy</strong>: enables or disables the SQL Explorer (SQL Audit) feature for the custom ApsaraDB RDS instance.</li>
         * <li><strong>DescribeParameters</strong>: queries the parameter settings of the custom ApsaraDB RDS instance.</li>
         * <li><strong>ModifyParameter</strong>: modifies the parameters of the custom ApsaraDB RDS instance.</li>
         * <li><strong>DescribeDBInstanceHAConfig</strong>: queries the high availability mode and data replication mode of the custom ApsaraDB RDS instance.</li>
         * <li><strong>SwitchDBInstanceHA</strong>: switches workloads between the primary and secondary custom ApsaraDB RDS instances.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SwitchDBInstanceHA</p>
         */
        public Builder rdsAction(String rdsAction) {
            this.putQueryParameter("RdsAction", rdsAction);
            this.rdsAction = rdsAction;
            return this;
        }

        /**
         * <p>The ID of the region in which the PolarDB-X 1.0 instance resides.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/139284.html">DescribeDrdsInstances</a> operation to query the details of all PolarDB-X 1.0 instances within an Alibaba Cloud account, including the IDs of regions in which the instances reside.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hanzhou</p>
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
