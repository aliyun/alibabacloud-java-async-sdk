// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDBInstanceConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceConfigRequest</p>
 */
public class ModifyDBInstanceConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdleTime")
    private Integer idleTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessResource")
    private Integer serverlessResource;

    private ModifyDBInstanceConfigRequest(Builder builder) {
        super(builder);
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.DBInstanceId = builder.DBInstanceId;
        this.idleTime = builder.idleTime;
        this.resourceGroupId = builder.resourceGroupId;
        this.serverlessResource = builder.serverlessResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceDescription
     */
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return idleTime
     */
    public Integer getIdleTime() {
        return this.idleTime;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serverlessResource
     */
    public Integer getServerlessResource() {
        return this.serverlessResource;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceConfigRequest, Builder> {
        private String DBInstanceDescription; 
        private String DBInstanceId; 
        private Integer idleTime; 
        private String resourceGroupId; 
        private Integer serverlessResource; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceConfigRequest request) {
            super(request);
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.DBInstanceId = request.DBInstanceId;
            this.idleTime = request.idleTime;
            this.resourceGroupId = request.resourceGroupId;
            this.serverlessResource = request.serverlessResource;
        } 

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the instance IDs of all AnalyticDB for PostgreSQL instances in a specific region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The wait period for the instance that has no traffic to become idle. Minimum value: 60. Default value: 600. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder idleTime(Integer idleTime) {
            this.putQueryParameter("IdleTime", idleTime);
            this.idleTime = idleTime;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs. For more information about how to obtain the ID of a resource group, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The threshold of computing resources. Valid values: 8 to 32. Unit: AnalyticDB Compute Units (ACUs).</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder serverlessResource(Integer serverlessResource) {
            this.putQueryParameter("ServerlessResource", serverlessResource);
            this.serverlessResource = serverlessResource;
            return this;
        }

        @Override
        public ModifyDBInstanceConfigRequest build() {
            return new ModifyDBInstanceConfigRequest(this);
        } 

    } 

}
