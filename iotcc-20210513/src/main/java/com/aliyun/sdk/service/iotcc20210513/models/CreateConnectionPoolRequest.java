// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConnectionPoolRequest} extends {@link RequestModel}
 *
 * <p>CreateConnectionPoolRequest</p>
 */
public class CreateConnectionPoolRequest extends Request {
    @Query
    @NameInMap("Cidrs")
    private java.util.List < String > cidrs;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ConnectionPoolDescription")
    private String connectionPoolDescription;

    @Query
    @NameInMap("ConnectionPoolName")
    private String connectionPoolName;

    @Query
    @NameInMap("Count")
    private Long count;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("IoTCloudConnectorId")
    @Validation(required = true)
    private String ioTCloudConnectorId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private CreateConnectionPoolRequest(Builder builder) {
        super(builder);
        this.cidrs = builder.cidrs;
        this.clientToken = builder.clientToken;
        this.connectionPoolDescription = builder.connectionPoolDescription;
        this.connectionPoolName = builder.connectionPoolName;
        this.count = builder.count;
        this.dryRun = builder.dryRun;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConnectionPoolRequest create() {
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
     * @return connectionPoolDescription
     */
    public String getConnectionPoolDescription() {
        return this.connectionPoolDescription;
    }

    /**
     * @return connectionPoolName
     */
    public String getConnectionPoolName() {
        return this.connectionPoolName;
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
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

    public static final class Builder extends Request.Builder<CreateConnectionPoolRequest, Builder> {
        private java.util.List < String > cidrs; 
        private String clientToken; 
        private String connectionPoolDescription; 
        private String connectionPoolName; 
        private Long count; 
        private Boolean dryRun; 
        private String ioTCloudConnectorId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateConnectionPoolRequest request) {
            super(request);
            this.cidrs = request.cidrs;
            this.clientToken = request.clientToken;
            this.connectionPoolDescription = request.connectionPoolDescription;
            this.connectionPoolName = request.connectionPoolName;
            this.count = request.count;
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
         * ConnectionPoolDescription.
         */
        public Builder connectionPoolDescription(String connectionPoolDescription) {
            this.putQueryParameter("ConnectionPoolDescription", connectionPoolDescription);
            this.connectionPoolDescription = connectionPoolDescription;
            return this;
        }

        /**
         * ConnectionPoolName.
         */
        public Builder connectionPoolName(String connectionPoolName) {
            this.putQueryParameter("ConnectionPoolName", connectionPoolName);
            this.connectionPoolName = connectionPoolName;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Long count) {
            this.putQueryParameter("Count", count);
            this.count = count;
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
        public CreateConnectionPoolRequest build() {
            return new CreateConnectionPoolRequest(this);
        } 

    } 

}
