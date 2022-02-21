// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckConnectivityRequest} extends {@link RequestModel}
 *
 * <p>CheckConnectivityRequest</p>
 */
public class CheckConnectivityRequest extends Request {
    @Body
    @NameInMap("BizId")
    private String bizId;

    @Body
    @NameInMap("DataSourceInstanceId")
    private String dataSourceInstanceId;

    @Body
    @NameInMap("DataSourceType")
    private String dataSourceType;

    @Body
    @NameInMap("Password")
    private String password;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("UserName")
    private String userName;

    private CheckConnectivityRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.dataSourceInstanceId = builder.dataSourceInstanceId;
        this.dataSourceType = builder.dataSourceType;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckConnectivityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return dataSourceInstanceId
     */
    public String getDataSourceInstanceId() {
        return this.dataSourceInstanceId;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<CheckConnectivityRequest, Builder> {
        private String bizId; 
        private String dataSourceInstanceId; 
        private String dataSourceType; 
        private String password; 
        private String regionId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(CheckConnectivityRequest response) {
            super(response);
            this.bizId = response.bizId;
            this.dataSourceInstanceId = response.dataSourceInstanceId;
            this.dataSourceType = response.dataSourceType;
            this.password = response.password;
            this.regionId = response.regionId;
            this.userName = response.userName;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * DataSourceInstanceId.
         */
        public Builder dataSourceInstanceId(String dataSourceInstanceId) {
            this.putBodyParameter("DataSourceInstanceId", dataSourceInstanceId);
            this.dataSourceInstanceId = dataSourceInstanceId;
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
         * Password.
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
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

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public CheckConnectivityRequest build() {
            return new CheckConnectivityRequest(this);
        } 

    } 

}
