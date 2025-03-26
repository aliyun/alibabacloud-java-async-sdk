// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyReadWriteSplittingConnectionRequest} extends {@link RequestModel}
 *
 * <p>ModifyReadWriteSplittingConnectionRequest</p>
 */
public class ModifyReadWriteSplittingConnectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionStringPrefix")
    private String connectionStringPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DistributionType")
    private String distributionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxDelayTime")
    private String maxDelayTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Weight")
    private String weight;

    private ModifyReadWriteSplittingConnectionRequest(Builder builder) {
        super(builder);
        this.connectionStringPrefix = builder.connectionStringPrefix;
        this.DBInstanceId = builder.DBInstanceId;
        this.distributionType = builder.distributionType;
        this.maxDelayTime = builder.maxDelayTime;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.port = builder.port;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyReadWriteSplittingConnectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionStringPrefix
     */
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return distributionType
     */
    public String getDistributionType() {
        return this.distributionType;
    }

    /**
     * @return maxDelayTime
     */
    public String getMaxDelayTime() {
        return this.maxDelayTime;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return weight
     */
    public String getWeight() {
        return this.weight;
    }

    public static final class Builder extends Request.Builder<ModifyReadWriteSplittingConnectionRequest, Builder> {
        private String connectionStringPrefix; 
        private String DBInstanceId; 
        private String distributionType; 
        private String maxDelayTime; 
        private String ownerAccount; 
        private Long ownerId; 
        private String port; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String weight; 

        private Builder() {
            super();
        } 

        private Builder(ModifyReadWriteSplittingConnectionRequest request) {
            super(request);
            this.connectionStringPrefix = request.connectionStringPrefix;
            this.DBInstanceId = request.DBInstanceId;
            this.distributionType = request.distributionType;
            this.maxDelayTime = request.maxDelayTime;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.port = request.port;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.weight = request.weight;
        } 

        /**
         * <p>The prefix of the read/write splitting endpoint. The prefix must be unique. It can be up to 30 characters in length and can contain lowercase letters and hyphens (-). It must start with a lowercase letter.</p>
         * <blockquote>
         * <p>The default prefix consists of the name of the primary instance followed by the letters rw.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-m5xxxxxxxxrw.mysql.rds.aliyuncs.com</p>
         */
        public Builder connectionStringPrefix(String connectionStringPrefix) {
            this.putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
            this.connectionStringPrefix = connectionStringPrefix;
            return this;
        }

        /**
         * <p>The ID of the primary instance. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The method that is used to assign read weights. Valid values:</p>
         * <ul>
         * <li><strong>Standard</strong>: The system automatically assigns read weights to the primary and read-only instances based on the specifications of these instances.</li>
         * <li><strong>Custom</strong>: You must manually assign a read weight to each instance.</li>
         * </ul>
         * <blockquote>
         * <p>You must specify at least one of <strong>MaxDelayTime</strong> and <strong>DistributionType</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder distributionType(String distributionType) {
            this.putQueryParameter("DistributionType", distributionType);
            this.distributionType = distributionType;
            return this;
        }

        /**
         * <p>The latency threshold that is allowed by the read/write splitting link. Unit: seconds. If the latency on a read-only instance exceeds the specified threshold, the system no longer routes read requests to the read-only instance. If you do not specify this parameter, the default value of this parameter is retained.</p>
         * <blockquote>
         * <ul>
         * <li>If the primary instance runs SQL Server 2017 on RDS Cluster Edition, the <strong>MaxDelayTime</strong> parameter is not supported.</li>
         * <li>You must specify at least one of <strong>MaxDelayTime</strong> and <strong>DistributionType</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder maxDelayTime(String maxDelayTime) {
            this.putQueryParameter("MaxDelayTime", maxDelayTime);
            this.maxDelayTime = maxDelayTime;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The port that is associated with the read/write splitting endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The read weights of the primary instance and its read-only instances. A read weight must be a multiple of 100 and cannot exceed 10,000.</p>
         * <ul>
         * <li>For ApsaraDB RDS instances, the value of this parameter is in the following format: <code>{&quot;&lt;ID of the read-only instance &gt;&quot;:&lt;Weight&gt;,&quot;master&quot;:&lt;Weight&gt;,&quot;slave&quot;:&lt;Weight&gt;}</code>.</li>
         * <li>For ApsaraDB MyBase instances, the value of this parameter is in the following format: <code>[{&quot;instanceName&quot;:&quot;&lt;ID of the primary instance&gt;&quot;,&quot;weight&quot;:&lt;Weight&gt;,&quot;role&quot;:&quot;master&quot;},{&quot;instanceName&quot;:&quot;&lt;ID of the primary instance&gt;&quot;,&quot;weight&quot;:&lt;Weight&gt;,&quot;role&quot;:&quot;slave&quot;},{&quot;instanceName&quot;:&quot;&lt;ID of the read-only instance&gt;&quot;,&quot;weight&quot;:&lt;Weight&gt;,&quot;role&quot;:&quot;master&quot;}]</code></li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter must be specified when <strong>DistributionType</strong> is set to <strong>Custom</strong>.</p>
         * </li>
         * <li><p>If <strong>DistributionType</strong> is set to <strong>Standard</strong>, this parameter is invalid.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;rm-bp1**********&quot;:800,&quot;master&quot;:400,&quot;slave&quot;:400}</p>
         */
        public Builder weight(String weight) {
            this.putQueryParameter("Weight", weight);
            this.weight = weight;
            return this;
        }

        @Override
        public ModifyReadWriteSplittingConnectionRequest build() {
            return new ModifyReadWriteSplittingConnectionRequest(this);
        } 

    } 

}
