// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ModifyDatabaseRequest} extends {@link RequestModel}
 *
 * <p>ModifyDatabaseRequest</p>
 */
public class ModifyDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActiveAddressType")
    private String activeAddressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabasePort")
    private String databasePort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabasePrivateAddress")
    private String databasePrivateAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabasePublicAddress")
    private String databasePublicAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkDomainId")
    private String networkDomainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
    private String sourceInstanceId;

    private ModifyDatabaseRequest(Builder builder) {
        super(builder);
        this.activeAddressType = builder.activeAddressType;
        this.comment = builder.comment;
        this.databaseId = builder.databaseId;
        this.databaseName = builder.databaseName;
        this.databasePort = builder.databasePort;
        this.databasePrivateAddress = builder.databasePrivateAddress;
        this.databasePublicAddress = builder.databasePublicAddress;
        this.instanceId = builder.instanceId;
        this.networkDomainId = builder.networkDomainId;
        this.regionId = builder.regionId;
        this.sourceInstanceId = builder.sourceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDatabaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activeAddressType
     */
    public String getActiveAddressType() {
        return this.activeAddressType;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return databaseId
     */
    public String getDatabaseId() {
        return this.databaseId;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return databasePort
     */
    public String getDatabasePort() {
        return this.databasePort;
    }

    /**
     * @return databasePrivateAddress
     */
    public String getDatabasePrivateAddress() {
        return this.databasePrivateAddress;
    }

    /**
     * @return databasePublicAddress
     */
    public String getDatabasePublicAddress() {
        return this.databasePublicAddress;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return networkDomainId
     */
    public String getNetworkDomainId() {
        return this.networkDomainId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public static final class Builder extends Request.Builder<ModifyDatabaseRequest, Builder> {
        private String activeAddressType; 
        private String comment; 
        private String databaseId; 
        private String databaseName; 
        private String databasePort; 
        private String databasePrivateAddress; 
        private String databasePublicAddress; 
        private String instanceId; 
        private String networkDomainId; 
        private String regionId; 
        private String sourceInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDatabaseRequest request) {
            super(request);
            this.activeAddressType = request.activeAddressType;
            this.comment = request.comment;
            this.databaseId = request.databaseId;
            this.databaseName = request.databaseName;
            this.databasePort = request.databasePort;
            this.databasePrivateAddress = request.databasePrivateAddress;
            this.databasePublicAddress = request.databasePublicAddress;
            this.instanceId = request.instanceId;
            this.networkDomainId = request.networkDomainId;
            this.regionId = request.regionId;
            this.sourceInstanceId = request.sourceInstanceId;
        } 

        /**
         * <p>The new address type of the database. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong></li>
         * <li><strong>Private</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        public Builder activeAddressType(String activeAddressType) {
            this.putQueryParameter("ActiveAddressType", activeAddressType);
            this.activeAddressType = activeAddressType;
            return this;
        }

        /**
         * <p>The new remarks of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>tttttttt</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The ID of the database to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder databaseId(String databaseId) {
            this.putQueryParameter("DatabaseId", databaseId);
            this.databaseId = databaseId;
            return this;
        }

        /**
         * <p>The new name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>pgsql</p>
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>The new port of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>5433</p>
         */
        public Builder databasePort(String databasePort) {
            this.putQueryParameter("DatabasePort", databasePort);
            this.databasePort = databasePort;
            return this;
        }

        /**
         * <p>The new internal address of the database. Specify an IPv4 address or a domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp169******</p>
         */
        public Builder databasePrivateAddress(String databasePrivateAddress) {
            this.putQueryParameter("DatabasePrivateAddress", databasePrivateAddress);
            this.databasePrivateAddress = databasePrivateAddress;
            return this;
        }

        /**
         * <p>The new public address of the database. Specify an IPv4 address or a domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-uf6c******</p>
         */
        public Builder databasePublicAddress(String databasePublicAddress) {
            this.putQueryParameter("DatabasePublicAddress", databasePublicAddress);
            this.databasePublicAddress = databasePublicAddress;
            return this;
        }

        /**
         * <p>The ID of the bastion host that manages the database to modify.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-72137xe5n01</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the new network domain for the database.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2758827.html">ListNetworkDomains</a> operation to query the network domain ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder networkDomainId(String networkDomainId) {
            this.putQueryParameter("NetworkDomainId", networkDomainId);
            this.networkDomainId = networkDomainId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host that manages the database to modify.</p>
         * <blockquote>
         * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the ApsaraDB for RDS instance or PolarDB cluster to modify.</p>
         * <blockquote>
         * <p>This parameter is required if <strong>Source</strong> is set to <strong>Rds</strong> or <strong>PolarDB</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-wz99nexqd62z3bvuvpz5</p>
         */
        public Builder sourceInstanceId(String sourceInstanceId) {
            this.putQueryParameter("SourceInstanceId", sourceInstanceId);
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }

        @Override
        public ModifyDatabaseRequest build() {
            return new ModifyDatabaseRequest(this);
        } 

    } 

}
