// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDatabaseRequest} extends {@link RequestModel}
 *
 * <p>CreateDatabaseRequest</p>
 */
public class CreateDatabaseRequest extends Request {
    @Query
    @NameInMap("ActiveAddressType")
    @Validation(required = true)
    private String activeAddressType;

    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("DatabaseName")
    private String databaseName;

    @Query
    @NameInMap("DatabasePort")
    private Integer databasePort;

    @Query
    @NameInMap("DatabasePrivateAddress")
    private String databasePrivateAddress;

    @Query
    @NameInMap("DatabasePublicAddress")
    private String databasePublicAddress;

    @Query
    @NameInMap("DatabaseType")
    @Validation(required = true)
    private String databaseType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NetworkDomainId")
    private String networkDomainId;

    @Query
    @NameInMap("PolarDBEndpointType")
    private String polarDBEndpointType;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Source")
    @Validation(required = true)
    private String source;

    @Query
    @NameInMap("SourceInstanceId")
    private String sourceInstanceId;

    @Query
    @NameInMap("SourceInstanceRegionId")
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
         * ActiveAddressType.
         */
        public Builder activeAddressType(String activeAddressType) {
            this.putQueryParameter("ActiveAddressType", activeAddressType);
            this.activeAddressType = activeAddressType;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * DatabaseName.
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * DatabasePort.
         */
        public Builder databasePort(Integer databasePort) {
            this.putQueryParameter("DatabasePort", databasePort);
            this.databasePort = databasePort;
            return this;
        }

        /**
         * DatabasePrivateAddress.
         */
        public Builder databasePrivateAddress(String databasePrivateAddress) {
            this.putQueryParameter("DatabasePrivateAddress", databasePrivateAddress);
            this.databasePrivateAddress = databasePrivateAddress;
            return this;
        }

        /**
         * DatabasePublicAddress.
         */
        public Builder databasePublicAddress(String databasePublicAddress) {
            this.putQueryParameter("DatabasePublicAddress", databasePublicAddress);
            this.databasePublicAddress = databasePublicAddress;
            return this;
        }

        /**
         * DatabaseType.
         */
        public Builder databaseType(String databaseType) {
            this.putQueryParameter("DatabaseType", databaseType);
            this.databaseType = databaseType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NetworkDomainId.
         */
        public Builder networkDomainId(String networkDomainId) {
            this.putQueryParameter("NetworkDomainId", networkDomainId);
            this.networkDomainId = networkDomainId;
            return this;
        }

        /**
         * PolarDBEndpointType.
         */
        public Builder polarDBEndpointType(String polarDBEndpointType) {
            this.putQueryParameter("PolarDBEndpointType", polarDBEndpointType);
            this.polarDBEndpointType = polarDBEndpointType;
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
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * SourceInstanceId.
         */
        public Builder sourceInstanceId(String sourceInstanceId) {
            this.putQueryParameter("SourceInstanceId", sourceInstanceId);
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }

        /**
         * SourceInstanceRegionId.
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
