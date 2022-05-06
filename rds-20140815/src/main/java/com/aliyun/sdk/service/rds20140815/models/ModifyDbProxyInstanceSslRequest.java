// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDbProxyInstanceSslRequest} extends {@link RequestModel}
 *
 * <p>ModifyDbProxyInstanceSslRequest</p>
 */
public class ModifyDbProxyInstanceSslRequest extends Request {
    @Query
    @NameInMap("DbInstanceId")
    @Validation(required = true)
    private String dbInstanceId;

    @Query
    @NameInMap("DbProxyConnectString")
    @Validation(required = true)
    private String dbProxyConnectString;

    @Query
    @NameInMap("DbProxyEndpointId")
    @Validation(required = true)
    private String dbProxyEndpointId;

    @Query
    @NameInMap("DbProxySslEnabled")
    @Validation(required = true)
    private String dbProxySslEnabled;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ModifyDbProxyInstanceSslRequest(Builder builder) {
        super(builder);
        this.dbInstanceId = builder.dbInstanceId;
        this.dbProxyConnectString = builder.dbProxyConnectString;
        this.dbProxyEndpointId = builder.dbProxyEndpointId;
        this.dbProxySslEnabled = builder.dbProxySslEnabled;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDbProxyInstanceSslRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * @return dbProxyConnectString
     */
    public String getDbProxyConnectString() {
        return this.dbProxyConnectString;
    }

    /**
     * @return dbProxyEndpointId
     */
    public String getDbProxyEndpointId() {
        return this.dbProxyEndpointId;
    }

    /**
     * @return dbProxySslEnabled
     */
    public String getDbProxySslEnabled() {
        return this.dbProxySslEnabled;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDbProxyInstanceSslRequest, Builder> {
        private String dbInstanceId; 
        private String dbProxyConnectString; 
        private String dbProxyEndpointId; 
        private String dbProxySslEnabled; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDbProxyInstanceSslRequest request) {
            super(request);
            this.dbInstanceId = request.dbInstanceId;
            this.dbProxyConnectString = request.dbProxyConnectString;
            this.dbProxyEndpointId = request.dbProxyEndpointId;
            this.dbProxySslEnabled = request.dbProxySslEnabled;
            this.regionId = request.regionId;
        } 

        /**
         * DbInstanceId.
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putQueryParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * DbProxyConnectString.
         */
        public Builder dbProxyConnectString(String dbProxyConnectString) {
            this.putQueryParameter("DbProxyConnectString", dbProxyConnectString);
            this.dbProxyConnectString = dbProxyConnectString;
            return this;
        }

        /**
         * DbProxyEndpointId.
         */
        public Builder dbProxyEndpointId(String dbProxyEndpointId) {
            this.putQueryParameter("DbProxyEndpointId", dbProxyEndpointId);
            this.dbProxyEndpointId = dbProxyEndpointId;
            return this;
        }

        /**
         * DbProxySslEnabled.
         */
        public Builder dbProxySslEnabled(String dbProxySslEnabled) {
            this.putQueryParameter("DbProxySslEnabled", dbProxySslEnabled);
            this.dbProxySslEnabled = dbProxySslEnabled;
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
        public ModifyDbProxyInstanceSslRequest build() {
            return new ModifyDbProxyInstanceSslRequest(this);
        } 

    } 

}
