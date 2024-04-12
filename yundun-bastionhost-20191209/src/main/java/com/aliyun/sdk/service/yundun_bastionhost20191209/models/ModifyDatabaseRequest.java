// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDatabaseRequest} extends {@link RequestModel}
 *
 * <p>ModifyDatabaseRequest</p>
 */
public class ModifyDatabaseRequest extends Request {
    @Query
    @NameInMap("ActiveAddressType")
    private String activeAddressType;

    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("DatabaseId")
    @Validation(required = true)
    private String databaseId;

    @Query
    @NameInMap("DatabaseName")
    private String databaseName;

    @Query
    @NameInMap("DatabasePort")
    private String databasePort;

    @Query
    @NameInMap("DatabasePrivateAddress")
    private String databasePrivateAddress;

    @Query
    @NameInMap("DatabasePublicAddress")
    private String databasePublicAddress;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NetworkDomainId")
    private String networkDomainId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SourceInstanceId")
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
         * DatabaseId.
         */
        public Builder databaseId(String databaseId) {
            this.putQueryParameter("DatabaseId", databaseId);
            this.databaseId = databaseId;
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
        public Builder databasePort(String databasePort) {
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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

        @Override
        public ModifyDatabaseRequest build() {
            return new ModifyDatabaseRequest(this);
        } 

    } 

}
