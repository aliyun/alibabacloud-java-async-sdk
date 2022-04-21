// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateIpWithConnectionPoolRequest} extends {@link RequestModel}
 *
 * <p>AssociateIpWithConnectionPoolRequest</p>
 */
public class AssociateIpWithConnectionPoolRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ConnectionPoolId")
    @Validation(required = true)
    private String connectionPoolId;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("IoTCloudConnectorId")
    @Validation(required = true)
    private String ioTCloudConnectorId;

    @Query
    @NameInMap("Ips")
    private java.util.List < String > ips;

    @Query
    @NameInMap("IpsFilePath")
    private String ipsFilePath;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private AssociateIpWithConnectionPoolRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.connectionPoolId = builder.connectionPoolId;
        this.dryRun = builder.dryRun;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.ips = builder.ips;
        this.ipsFilePath = builder.ipsFilePath;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateIpWithConnectionPoolRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return connectionPoolId
     */
    public String getConnectionPoolId() {
        return this.connectionPoolId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ioTCloudConnectorId
     */
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    /**
     * @return ips
     */
    public java.util.List < String > getIps() {
        return this.ips;
    }

    /**
     * @return ipsFilePath
     */
    public String getIpsFilePath() {
        return this.ipsFilePath;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AssociateIpWithConnectionPoolRequest, Builder> {
        private String clientToken; 
        private String connectionPoolId; 
        private Boolean dryRun; 
        private String ioTCloudConnectorId; 
        private java.util.List < String > ips; 
        private String ipsFilePath; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateIpWithConnectionPoolRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.connectionPoolId = request.connectionPoolId;
            this.dryRun = request.dryRun;
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
            this.ips = request.ips;
            this.ipsFilePath = request.ipsFilePath;
            this.regionId = request.regionId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ConnectionPoolId.
         */
        public Builder connectionPoolId(String connectionPoolId) {
            this.putQueryParameter("ConnectionPoolId", connectionPoolId);
            this.connectionPoolId = connectionPoolId;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * IoTCloudConnectorId.
         */
        public Builder ioTCloudConnectorId(String ioTCloudConnectorId) {
            this.putQueryParameter("IoTCloudConnectorId", ioTCloudConnectorId);
            this.ioTCloudConnectorId = ioTCloudConnectorId;
            return this;
        }

        /**
         * Ips.
         */
        public Builder ips(java.util.List < String > ips) {
            this.putQueryParameter("Ips", ips);
            this.ips = ips;
            return this;
        }

        /**
         * IpsFilePath.
         */
        public Builder ipsFilePath(String ipsFilePath) {
            this.putQueryParameter("IpsFilePath", ipsFilePath);
            this.ipsFilePath = ipsFilePath;
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

        @Override
        public AssociateIpWithConnectionPoolRequest build() {
            return new AssociateIpWithConnectionPoolRequest(this);
        } 

    } 

}
