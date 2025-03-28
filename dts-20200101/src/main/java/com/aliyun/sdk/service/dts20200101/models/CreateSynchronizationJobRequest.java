// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link CreateSynchronizationJobRequest} extends {@link RequestModel}
 *
 * <p>CreateSynchronizationJobRequest</p>
 */
public class CreateSynchronizationJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationEndpoint")
    private DestinationEndpoint destinationEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpoint")
    private SourceEndpoint sourceEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceCount")
    @com.aliyun.core.annotation.Validation(maximum = 10000)
    private Integer DBInstanceCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SynchronizationJobClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String synchronizationJobClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topology")
    private String topology;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private Integer usedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("networkType")
    private String networkType;

    private CreateSynchronizationJobRequest(Builder builder) {
        super(builder);
        this.destinationEndpoint = builder.destinationEndpoint;
        this.sourceEndpoint = builder.sourceEndpoint;
        this.accountId = builder.accountId;
        this.clientToken = builder.clientToken;
        this.DBInstanceCount = builder.DBInstanceCount;
        this.destRegion = builder.destRegion;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceRegion = builder.sourceRegion;
        this.synchronizationJobClass = builder.synchronizationJobClass;
        this.topology = builder.topology;
        this.usedTime = builder.usedTime;
        this.networkType = builder.networkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSynchronizationJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationEndpoint
     */
    public DestinationEndpoint getDestinationEndpoint() {
        return this.destinationEndpoint;
    }

    /**
     * @return sourceEndpoint
     */
    public SourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstanceCount
     */
    public Integer getDBInstanceCount() {
        return this.DBInstanceCount;
    }

    /**
     * @return destRegion
     */
    public String getDestRegion() {
        return this.destRegion;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sourceRegion
     */
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * @return synchronizationJobClass
     */
    public String getSynchronizationJobClass() {
        return this.synchronizationJobClass;
    }

    /**
     * @return topology
     */
    public String getTopology() {
        return this.topology;
    }

    /**
     * @return usedTime
     */
    public Integer getUsedTime() {
        return this.usedTime;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    public static final class Builder extends Request.Builder<CreateSynchronizationJobRequest, Builder> {
        private DestinationEndpoint destinationEndpoint; 
        private SourceEndpoint sourceEndpoint; 
        private String accountId; 
        private String clientToken; 
        private Integer DBInstanceCount; 
        private String destRegion; 
        private String ownerId; 
        private String payType; 
        private String period; 
        private String regionId; 
        private String resourceGroupId; 
        private String sourceRegion; 
        private String synchronizationJobClass; 
        private String topology; 
        private Integer usedTime; 
        private String networkType; 

        private Builder() {
            super();
        } 

        private Builder(CreateSynchronizationJobRequest request) {
            super(request);
            this.destinationEndpoint = request.destinationEndpoint;
            this.sourceEndpoint = request.sourceEndpoint;
            this.accountId = request.accountId;
            this.clientToken = request.clientToken;
            this.DBInstanceCount = request.DBInstanceCount;
            this.destRegion = request.destRegion;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.period = request.period;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.sourceRegion = request.sourceRegion;
            this.synchronizationJobClass = request.synchronizationJobClass;
            this.topology = request.topology;
            this.usedTime = request.usedTime;
            this.networkType = request.networkType;
        } 

        /**
         * DestinationEndpoint.
         */
        public Builder destinationEndpoint(DestinationEndpoint destinationEndpoint) {
            this.putQueryParameter("DestinationEndpoint", destinationEndpoint);
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }

        /**
         * SourceEndpoint.
         */
        public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
            this.putQueryParameter("SourceEndpoint", sourceEndpoint);
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
         * 
         * <strong>example:</strong>
         * <p>12323344****</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The <strong>ClientToken</strong> parameter can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>If you set the <strong>SourceEndpoint.InstanceType</strong> parameter to <strong>DRDS</strong>, you must specify the DBInstanceCount parameter. This parameter specifies the number of private RDS instances attached to the source PolarDB-X instance. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder DBInstanceCount(Integer DBInstanceCount) {
            this.putQueryParameter("DBInstanceCount", DBInstanceCount);
            this.DBInstanceCount = DBInstanceCount;
            return this;
        }

        /**
         * <p>The ID of the region where the destination database resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
         * <blockquote>
         * <p> If the <strong>SourceRegion</strong> parameter is set to the China (Hong Kong) region or a region outside the Chinese mainland, you must set the DestRegion parameter to the same region ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder destRegion(String destRegion) {
            this.putQueryParameter("DestRegion", destRegion);
            this.destRegion = destRegion;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The billing method of the data synchronization instance.</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription</li>
         * <li><strong>PostPaid</strong> (default value): pay-as-you-go</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The billing cycle of the subscription instance. Valid values:</p>
         * <ul>
         * <li><strong>Year</strong></li>
         * <li><strong>Month</strong></li>
         * </ul>
         * <blockquote>
         * <p> You must specify this parameter only if you set the PayType parameter to <strong>PrePaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Resource GroupId</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the region where the source database resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder sourceRegion(String sourceRegion) {
            this.putQueryParameter("SourceRegion", sourceRegion);
            this.sourceRegion = sourceRegion;
            return this;
        }

        /**
         * <p>The specification of the data synchronization instance. Valid values: <strong>micro</strong>, <strong>small</strong>, <strong>medium</strong>, and <strong>large</strong>.</p>
         * <blockquote>
         * <p> For more information about the test performance of each specification, see <a href="https://help.aliyun.com/document_detail/26605.html">Specifications of data synchronization instances</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>small</p>
         */
        public Builder synchronizationJobClass(String synchronizationJobClass) {
            this.putQueryParameter("SynchronizationJobClass", synchronizationJobClass);
            this.synchronizationJobClass = synchronizationJobClass;
            return this;
        }

        /**
         * <p>The synchronization topology. Valid values:</p>
         * <ul>
         * <li><strong>oneway</strong>: one-way synchronization</li>
         * <li><strong>bidirectional</strong>: two-way synchronization</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>The default value is <strong>oneway</strong>.</li>
         * <li>This parameter can be set to <strong>bidirectional</strong> only when the <strong>SourceEndpoint.InstanceType</strong> and <strong>DestinationEndpoint.InstanceType</strong> parameters are set to <strong>MySQL</strong>, <strong>PolarDB</strong>, or <strong>Redis</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oneway</p>
         */
        public Builder topology(String topology) {
            this.putQueryParameter("Topology", topology);
            this.topology = topology;
            return this;
        }

        /**
         * <p>The subscription length.</p>
         * <ul>
         * <li>If the billing cycle is <strong>Year</strong>, the value range is <strong>1 to 5</strong>.</li>
         * <li>If the billing cycle is <strong>Month</strong>, the value range is <strong>1 to 60</strong>.</li>
         * </ul>
         * <blockquote>
         * <p> You must specify this parameter only if you set the PayType parameter to <strong>PrePaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder usedTime(Integer usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * <p>The network type. Valid value: <strong>Intranet</strong>, which indicates virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>Intranet</p>
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("networkType", networkType);
            this.networkType = networkType;
            return this;
        }

        @Override
        public CreateSynchronizationJobRequest build() {
            return new CreateSynchronizationJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSynchronizationJobRequest} extends {@link TeaModel}
     *
     * <p>CreateSynchronizationJobRequest</p>
     */
    public static class DestinationEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        private DestinationEndpoint(Builder builder) {
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationEndpoint create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private String instanceType; 

            private Builder() {
            } 

            private Builder(DestinationEndpoint model) {
                this.instanceType = model.instanceType;
            } 

            /**
             * <p>The instance type of the destination database. Valid values:</p>
             * <ul>
             * <li><strong>MySQL</strong>: ApsaraDB RDS for MySQL instance or self-managed MySQL database</li>
             * <li><strong>PolarDB</strong>: PolarDB for MySQL cluster or PolarDB O Edition cluster</li>
             * <li><strong>Redis</strong>: Redis database</li>
             * <li><strong>MaxCompute</strong>: MaxCompute project</li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li>Default value: <strong>MySQL</strong>.</li>
             * <li>For more information about the supported source and destination databases, see <a href="https://help.aliyun.com/document_detail/130744.html">Database types, initial synchronization types, and synchronization topologies</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public DestinationEndpoint build() {
                return new DestinationEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSynchronizationJobRequest} extends {@link TeaModel}
     *
     * <p>CreateSynchronizationJobRequest</p>
     */
    public static class SourceEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        private SourceEndpoint(Builder builder) {
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private String instanceType; 

            private Builder() {
            } 

            private Builder(SourceEndpoint model) {
                this.instanceType = model.instanceType;
            } 

            /**
             * <p>The instance type of the source database. Valid values:</p>
             * <ul>
             * <li><strong>MySQL</strong>: ApsaraDB RDS for MySQL instance or self-managed MySQL database</li>
             * <li><strong>PolarDB</strong>: PolarDB for MySQL cluster or PolarDB O Edition cluster</li>
             * <li><strong>Redis</strong>: Redis database</li>
             * <li><strong>DRDS</strong>: PolarDB-X instance V1.0</li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li>Default value: <strong>MySQL</strong>.</li>
             * <li>For more information about the supported source and destination databases, see <a href="https://help.aliyun.com/document_detail/130744.html">Database types, initial synchronization types, and synchronization topologies</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public SourceEndpoint build() {
                return new SourceEndpoint(this);
            } 

        } 

    }
}
