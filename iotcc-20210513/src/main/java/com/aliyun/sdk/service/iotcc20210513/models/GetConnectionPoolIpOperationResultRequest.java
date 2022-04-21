// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConnectionPoolIpOperationResultRequest} extends {@link RequestModel}
 *
 * <p>GetConnectionPoolIpOperationResultRequest</p>
 */
public class GetConnectionPoolIpOperationResultRequest extends Request {
    @Query
    @NameInMap("ConnectionPoolId")
    @Validation(required = true)
    private String connectionPoolId;

    @Query
    @NameInMap("IoTCloudConnectorId")
    @Validation(required = true)
    private String ioTCloudConnectorId;

    @Query
    @NameInMap("QueryRequestId")
    @Validation(required = true)
    private String queryRequestId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetConnectionPoolIpOperationResultRequest(Builder builder) {
        super(builder);
        this.connectionPoolId = builder.connectionPoolId;
        this.ioTCloudConnectorId = builder.ioTCloudConnectorId;
        this.queryRequestId = builder.queryRequestId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConnectionPoolIpOperationResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionPoolId
     */
    public String getConnectionPoolId() {
        return this.connectionPoolId;
    }

    /**
     * @return ioTCloudConnectorId
     */
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    /**
     * @return queryRequestId
     */
    public String getQueryRequestId() {
        return this.queryRequestId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetConnectionPoolIpOperationResultRequest, Builder> {
        private String connectionPoolId; 
        private String ioTCloudConnectorId; 
        private String queryRequestId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetConnectionPoolIpOperationResultRequest request) {
            super(request);
            this.connectionPoolId = request.connectionPoolId;
            this.ioTCloudConnectorId = request.ioTCloudConnectorId;
            this.queryRequestId = request.queryRequestId;
            this.regionId = request.regionId;
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
         * IoTCloudConnectorId.
         */
        public Builder ioTCloudConnectorId(String ioTCloudConnectorId) {
            this.putQueryParameter("IoTCloudConnectorId", ioTCloudConnectorId);
            this.ioTCloudConnectorId = ioTCloudConnectorId;
            return this;
        }

        /**
         * QueryRequestId.
         */
        public Builder queryRequestId(String queryRequestId) {
            this.putQueryParameter("QueryRequestId", queryRequestId);
            this.queryRequestId = queryRequestId;
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
        public GetConnectionPoolIpOperationResultRequest build() {
            return new GetConnectionPoolIpOperationResultRequest(this);
        } 

    } 

}
