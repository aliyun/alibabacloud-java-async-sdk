// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateJDBCDataSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateJDBCDataSourceRequest</p>
 */
public class CreateJDBCDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceDescription")
    private String dataSourceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceName")
    private String dataSourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JDBCConnectionString")
    private String JDBCConnectionString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JDBCPassword")
    private String JDBCPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JDBCUserName")
    private String JDBCUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CreateJDBCDataSourceRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.dataSourceDescription = builder.dataSourceDescription;
        this.dataSourceName = builder.dataSourceName;
        this.dataSourceType = builder.dataSourceType;
        this.JDBCConnectionString = builder.JDBCConnectionString;
        this.JDBCPassword = builder.JDBCPassword;
        this.JDBCUserName = builder.JDBCUserName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJDBCDataSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return dataSourceDescription
     */
    public String getDataSourceDescription() {
        return this.dataSourceDescription;
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return JDBCConnectionString
     */
    public String getJDBCConnectionString() {
        return this.JDBCConnectionString;
    }

    /**
     * @return JDBCPassword
     */
    public String getJDBCPassword() {
        return this.JDBCPassword;
    }

    /**
     * @return JDBCUserName
     */
    public String getJDBCUserName() {
        return this.JDBCUserName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateJDBCDataSourceRequest, Builder> {
        private String DBInstanceId; 
        private String dataSourceDescription; 
        private String dataSourceName; 
        private String dataSourceType; 
        private String JDBCConnectionString; 
        private String JDBCPassword; 
        private String JDBCUserName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateJDBCDataSourceRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.dataSourceDescription = request.dataSourceDescription;
            this.dataSourceName = request.dataSourceName;
            this.dataSourceType = request.dataSourceType;
            this.JDBCConnectionString = request.JDBCConnectionString;
            this.JDBCPassword = request.JDBCPassword;
            this.JDBCUserName = request.JDBCUserName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Data source description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder dataSourceDescription(String dataSourceDescription) {
            this.putQueryParameter("DataSourceDescription", dataSourceDescription);
            this.dataSourceDescription = dataSourceDescription;
            return this;
        }

        /**
         * <p>The name of data soruce</p>
         * 
         * <strong>example:</strong>
         * <p>jdbc_pxf</p>
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putQueryParameter("DataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * <p>The type of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putQueryParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * <p>The JDBC connection string.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder JDBCConnectionString(String JDBCConnectionString) {
            this.putQueryParameter("JDBCConnectionString", JDBCConnectionString);
            this.JDBCConnectionString = JDBCConnectionString;
            return this;
        }

        /**
         * <p>The password of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder JDBCPassword(String JDBCPassword) {
            this.putQueryParameter("JDBCPassword", JDBCPassword);
            this.JDBCPassword = JDBCPassword;
            return this;
        }

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder JDBCUserName(String JDBCUserName) {
            this.putQueryParameter("JDBCUserName", JDBCUserName);
            this.JDBCUserName = JDBCUserName;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateJDBCDataSourceRequest build() {
            return new CreateJDBCDataSourceRequest(this);
        } 

    } 

}
