// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckConnectionRequest} extends {@link RequestModel}
 *
 * <p>CheckConnectionRequest</p>
 */
public class CheckConnectionRequest extends Request {
    @Query
    @NameInMap("DataSourceInstanceId")
    @Validation(required = true)
    private String dataSourceInstanceId;

    @Query
    @NameInMap("DataSourceType")
    @Validation(required = true)
    private String dataSourceType;

    @Query
    @NameInMap("Password")
    @Validation(required = true)
    private String password;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("UserName")
    @Validation(required = true)
    private String userName;

    private CheckConnectionRequest(Builder builder) {
        super(builder);
        this.dataSourceInstanceId = builder.dataSourceInstanceId;
        this.dataSourceType = builder.dataSourceType;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckConnectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CheckConnectionRequest, Builder> {
        private String dataSourceInstanceId; 
        private String dataSourceType; 
        private String password; 
        private String regionId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(CheckConnectionRequest response) {
            super(response);
            this.dataSourceInstanceId = response.dataSourceInstanceId;
            this.dataSourceType = response.dataSourceType;
            this.password = response.password;
            this.regionId = response.regionId;
            this.userName = response.userName;
        } 

        /**
         * DataSourceInstanceId.
         */
        public Builder dataSourceInstanceId(String dataSourceInstanceId) {
            this.putQueryParameter("DataSourceInstanceId", dataSourceInstanceId);
            this.dataSourceInstanceId = dataSourceInstanceId;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putQueryParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
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
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public CheckConnectionRequest build() {
            return new CheckConnectionRequest(this);
        } 

    } 

}
