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
 * {@link CreateDatabaseRequest} extends {@link RequestModel}
 *
 * <p>CreateDatabaseRequest</p>
 */
public class CreateDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActiveAddressType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String activeAddressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabasePort")
    private Integer databasePort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabasePrivateAddress")
    private String databasePrivateAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabasePublicAddress")
    private String databasePublicAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkDomainId")
    private String networkDomainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarDBEndpointType")
    private String polarDBEndpointType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    @com.aliyun.core.annotation.Validation(required = true)
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
    private String sourceInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceRegionId")
    private String sourceInstanceRegionId;

    private CreateDatabaseRequest(Builder builder) {
        super(builder);
        this.activeAddressType = builder.activeAddressType;
        this.comment = builder.comment;
        this.databaseName = builder.databaseName;
        this.databasePort = builder.databasePort;
        this.databasePrivateAddress = builder.databasePrivateAddress;
        this.databasePublicAddress = builder.databasePublicAddress;
        this.databaseType = builder.databaseType;
        this.instanceId = builder.instanceId;
        this.networkDomainId = builder.networkDomainId;
        this.polarDBEndpointType = builder.polarDBEndpointType;
        this.regionId = builder.regionId;
        this.source = builder.source;
        this.sourceInstanceId = builder.sourceInstanceId;
        this.sourceInstanceRegionId = builder.sourceInstanceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatabaseRequest create() {
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
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return databasePort
     */
    public Integer getDatabasePort() {
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
     * @return databaseType
     */
    public String getDatabaseType() {
        return this.databaseType;
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
     * @return polarDBEndpointType
     */
    public String getPolarDBEndpointType() {
        return this.polarDBEndpointType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    /**
     * @return sourceInstanceRegionId
     */
    public String getSourceInstanceRegionId() {
        return this.sourceInstanceRegionId;
    }

    public static final class Builder extends Request.Builder<CreateDatabaseRequest, Builder> {
        private String activeAddressType; 
        private String comment; 
        private String databaseName; 
        private Integer databasePort; 
        private String databasePrivateAddress; 
        private String databasePublicAddress; 
        private String databaseType; 
        private String instanceId; 
        private String networkDomainId; 
        private String polarDBEndpointType; 
        private String regionId; 
        private String source; 
        private String sourceInstanceId; 
        private String sourceInstanceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatabaseRequest request) {
            super(request);
            this.activeAddressType = request.activeAddressType;
            this.comment = request.comment;
            this.databaseName = request.databaseName;
            this.databasePort = request.databasePort;
            this.databasePrivateAddress = request.databasePrivateAddress;
            this.databasePublicAddress = request.databasePublicAddress;
            this.databaseType = request.databaseType;
            this.instanceId = request.instanceId;
            this.networkDomainId = request.networkDomainId;
            this.polarDBEndpointType = request.polarDBEndpointType;
            this.regionId = request.regionId;
            this.source = request.source;
            this.sourceInstanceId = request.sourceInstanceId;
            this.sourceInstanceRegionId = request.sourceInstanceRegionId;
        } 

        /**
         * <p>The address type of the database to add. Valid values:</p>
         * <ul>
         * <li>Public</li>
         * <li>Private</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The remarks of the database to add. The remarks can be up to 500 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>cpp</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The name of the database to add. This parameter is required if Source is set to <strong>Local</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Oracle</p>
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>The port of the database. This parameter is required if Source is set to <strong>Local</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5433</p>
         */
        public Builder databasePort(Integer databasePort) {
            this.putQueryParameter("DatabasePort", databasePort);
            this.databasePort = databasePort;
            return this;
        }

        /**
         * <p>The internal IP address of the database. Specify an IPv4 address or a domain name.</p>
         * <blockquote>
         * <p> This parameter is required if ActiveAddressType is set to Private.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pgm-uf6o******</p>
         */
        public Builder databasePrivateAddress(String databasePrivateAddress) {
            this.putQueryParameter("DatabasePrivateAddress", databasePrivateAddress);
            this.databasePrivateAddress = databasePrivateAddress;
            return this;
        }

        /**
         * <p>The public IP address of the database. Specify an IPv4 address or a domain name.</p>
         * <blockquote>
         * <p> This parameter is required if ActiveAddressType is set to Public.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-uf65251k51******</p>
         */
        public Builder databasePublicAddress(String databasePublicAddress) {
            this.putQueryParameter("DatabasePublicAddress", databasePublicAddress);
            this.databasePublicAddress = databasePublicAddress;
            return this;
        }

        /**
         * <p>The type of the database engine. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>Oracle</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>SQLServer</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder databaseType(String databaseType) {
            this.putQueryParameter("DatabaseType", databaseType);
            this.databaseType = databaseType;
            return this;
        }

        /**
         * <p>The bastion host ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-7mz2g5hu20e</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the network domain to which the database to add belongs.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2758827.html">ListNetworkDomains</a> operation to query the network domain ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder networkDomainId(String networkDomainId) {
            this.putQueryParameter("NetworkDomainId", networkDomainId);
            this.networkDomainId = networkDomainId;
            return this;
        }

        /**
         * <p>The endpoint type of the PolarDB database. This parameter is required if Source is set to PolarDB. Valid values:</p>
         * <ul>
         * <li>Cluster</li>
         * <li>Primary</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cluster</p>
         */
        public Builder polarDBEndpointType(String polarDBEndpointType) {
            this.putQueryParameter("PolarDBEndpointType", polarDBEndpointType);
            this.polarDBEndpointType = polarDBEndpointType;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The type of the database to add. Valid values:</p>
         * <ul>
         * <li>Local: on-premises database.</li>
         * <li>Rds: ApsaraDB RDS instance.</li>
         * <li>PolarDB: PolarDB cluster.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Local</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The instance ID of the database to add.</p>
         * <blockquote>
         * <p>This parameter is required if <strong>Source</strong> is set to <strong>Rds</strong> or <strong>PolarDB</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-bp19ienyt0yax748****</p>
         */
        public Builder sourceInstanceId(String sourceInstanceId) {
            this.putQueryParameter("SourceInstanceId", sourceInstanceId);
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }

        /**
         * <p>The region ID of the database to add.</p>
         * <blockquote>
         * <p> This parameter is required if <strong>Source</strong> is set to <strong>Rds</strong> or <strong>PolarDB</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder sourceInstanceRegionId(String sourceInstanceRegionId) {
            this.putQueryParameter("SourceInstanceRegionId", sourceInstanceRegionId);
            this.sourceInstanceRegionId = sourceInstanceRegionId;
            return this;
        }

        @Override
        public CreateDatabaseRequest build() {
            return new CreateDatabaseRequest(this);
        } 

    } 

}
