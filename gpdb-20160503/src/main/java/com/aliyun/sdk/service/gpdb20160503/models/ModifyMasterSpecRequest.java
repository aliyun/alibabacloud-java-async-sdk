// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ModifyMasterSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyMasterSpecRequest</p>
 */
public class ModifyMasterSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterAISpec")
    private String masterAISpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterCU")
    private Integer masterCU;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ModifyMasterSpecRequest(Builder builder) {
        super(builder);
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.DBInstanceId = builder.DBInstanceId;
        this.effectiveTime = builder.effectiveTime;
        this.masterAISpec = builder.masterAISpec;
        this.masterCU = builder.masterCU;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMasterSpecRequest create() {
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
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return masterAISpec
     */
    public String getMasterAISpec() {
        return this.masterAISpec;
    }

    /**
     * @return masterCU
     */
    public Integer getMasterCU() {
        return this.masterCU;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ModifyMasterSpecRequest, Builder> {
        private String DBInstanceDescription; 
        private String DBInstanceId; 
        private String effectiveTime; 
        private String masterAISpec; 
        private Integer masterCU; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMasterSpecRequest request) {
            super(request);
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.DBInstanceId = request.DBInstanceId;
            this.effectiveTime = request.effectiveTime;
            this.masterAISpec = request.masterAISpec;
            this.masterCU = request.masterCU;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the instance IDs of all AnalyticDB for PostgreSQL instances in a region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The effective period of the specification change. Valid values: </p>
         * <ul>
         * <li><strong>Immediately</strong> (default): The change takes effect immediately.</li>
         * <li><strong>MaintainTime</strong>: The change takes effect during the maintenance window of the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Immediate</p>
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putQueryParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * <p>If you want to change the master node to a MasterAI node, specify this parameter.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter and MasterCU cannot be specified at the same time.</li>
         * <li>Only specific regions and zones support changing the master node to a MasterAI node.</li>
         * <li>Only AnalyticDB for PostgreSQL V7.0 Basic Edition instances support MasterAI nodes.</li>
         * <li>You can view all valid values of this parameter on the specification change page for the master node.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ADB.AIMedium.2</p>
         */
        public Builder masterAISpec(String masterAISpec) {
            this.putQueryParameter("MasterAISpec", masterAISpec);
            this.masterAISpec = masterAISpec;
            return this;
        }

        /**
         * <p>The master resources. Valid values: </p>
         * <ul>
         * <li>2 CU </li>
         * <li>4 CU </li>
         * <li>8 CU </li>
         * <li>16 CU </li>
         * <li>32 CU <blockquote>
         * <p>Master resources greater than 8 CU incur additional fees.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8 CU</p>
         */
        public Builder masterCU(Integer masterCU) {
            this.putQueryParameter("MasterCU", masterCU);
            this.masterCU = masterCU;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs. For information about how to obtain the resource group ID, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ModifyMasterSpecRequest build() {
            return new ModifyMasterSpecRequest(this);
        } 

    } 

}
