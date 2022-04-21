// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCidrToConnectionPoolRequest} extends {@link RequestModel}
 *
 * <p>AddCidrToConnectionPoolRequest</p>
 */
public class AddCidrToConnectionPoolRequest extends Request {
    @Query
    @NameInMap("Cidrs")
    private java.util.List < String > cidrs;

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
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private AddCidrToConnectionPoolRequest(Builder builder) {
        super(builder);
        this.cidrs = builder.cidrs;
        this.clientToken = builder.clientToken;
        this.connectionPoolId = builder.connectionPoolId;
        this.dryRun = builder.dryRun;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCidrToConnectionPoolRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidrs
     */
    public java.util.List < String > getCidrs() {
        return this.cidrs;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddCidrToConnectionPoolRequest, Builder> {
        private java.util.List < String > cidrs; 
        private String clientToken; 
        private String connectionPoolId; 
        private Boolean dryRun; 
        private String ioTCloudConnectorId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddCidrToConnectionPoolRequest request) {
            super(request);
            this.cidrs = request.cidrs;
            this.clientToken = request.clientToken;
            this.connectionPoolId = request.connectionPoolId;
            this.dryRun = request.dryRun;
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
            this.regionId = request.regionId;
        } 

        /**
         * Cidrs.
         */
        public Builder cidrs(java.util.List < String > cidrs) {
            this.putQueryParameter("Cidrs", cidrs);
            this.cidrs = cidrs;
            return this;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AddCidrToConnectionPoolRequest build() {
            return new AddCidrToConnectionPoolRequest(this);
        } 

    } 

}
