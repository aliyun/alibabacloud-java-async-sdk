// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateDataSourceRequest</p>
 */
public class CreateDataSourceRequest extends Request {
    @Header
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("ConnectionInfo")
    private String connectionInfo;

    @Body
    @NameInMap("DataSourceType")
    private String dataSourceType;

    @Body
    @NameInMap("Name")
    private String name;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateDataSourceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.connectionInfo = builder.connectionInfo;
        this.dataSourceType = builder.dataSourceType;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataSourceRequest create() {
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
     * @return connectionInfo
     */
    public String getConnectionInfo() {
        return this.connectionInfo;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateDataSourceRequest, Builder> {
        private String clientToken; 
        private String connectionInfo; 
        private String dataSourceType; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataSourceRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.connectionInfo = response.connectionInfo;
            this.dataSourceType = response.dataSourceType;
            this.name = response.name;
            this.regionId = response.regionId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putHeaderParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ConnectionInfo.
         */
        public Builder connectionInfo(String connectionInfo) {
            this.putBodyParameter("ConnectionInfo", connectionInfo);
            this.connectionInfo = connectionInfo;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putBodyParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateDataSourceRequest build() {
            return new CreateDataSourceRequest(this);
        } 

    } 

}
