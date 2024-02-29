// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("DataSourceType")
    @Validation(required = true)
    private String dataSourceType;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EnvType")
    @Validation(required = true)
    private Integer envType;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private Long projectId;

    @Query
    @NameInMap("SubType")
    private String subType;

    private CreateDataSourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.content = builder.content;
        this.dataSourceType = builder.dataSourceType;
        this.description = builder.description;
        this.envType = builder.envType;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.subType = builder.subType;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return envType
     */
    public Integer getEnvType() {
        return this.envType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return subType
     */
    public String getSubType() {
        return this.subType;
    }

    public static final class Builder extends Request.Builder<CreateDataSourceRequest, Builder> {
        private String regionId; 
        private String content; 
        private String dataSourceType; 
        private String description; 
        private Integer envType; 
        private String name; 
        private Long projectId; 
        private String subType; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataSourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.content = request.content;
            this.dataSourceType = request.dataSourceType;
            this.description = request.description;
            this.envType = request.envType;
            this.name = request.name;
            this.projectId = request.projectId;
            this.subType = request.subType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the data source.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * The environment in which the data source is used. Valid values: 0 and 1. 0 indicates the development environment. 1 indicates the production environment.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putQueryParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * The subtype of the data source. Example:
         * <p>
         * 
         * *   This parameter takes effect only if the DataSourceType parameter is set to rds.
         * *   If the DataSourceType parameter is set to rds, this parameter can be set to mysql, sqlserver, or postgresql.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder envType(Integer envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * The type of the data source. Valid values:
         * <p>
         * 
         * *   odps
         * *   mysql
         * *   rds
         * *   oss
         * *   sqlserver
         * *   polardb
         * *   oracle
         * *   mongodb
         * *   emr
         * *   postgresql
         * *   analyticdb_for_mysql
         * *   hybriddb_for_postgresql
         * *   holo
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The description of the data source.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The details of the data source. Examples of details of some common data sources:
         * <p>
         * 
         * *   odps
         * 
         * ```
         * 
         * {
         *   "accessId": "xssssss",
         *   "accessKey": "xsaxsaxsa",
         *   "authType": 2,
         *   "endpoint": "http://service.odps.aliyun.com/api",
         *   "project": "xsaxsax",
         *   "tag": "public"
         * }
         * ```
         * 
         * *   mysql
         * 
         * ```
         * 
         * {
         *   "database": "xsaxsa",
         *   "instanceName": "rm-xsaxsa",
         *   "password": "xsaxsa",
         *   "rdsOwnerId": "xasxsa",
         *   "regionId": "cn-shanghai",
         *   "tag": "rds",
         *   "username": "xsaxsa"
         * }
         * ```
         * 
         * *   rds
         * 
         * ```
         * 
         * {
         *   "configType": 1,
         *   "tag": "rds",
         *   "database": "xsaxsa",
         *   "username": "xsaxsa",
         *   "password": "xssaxsa$32050",
         *   "instanceName": "rm-xsaxs",
         *   "rdsOwnerId": "11111111"
         * }
         * ```
         * 
         * *   oss
         * 
         * ```
         * 
         * {
         *   "accessId": "sssssxx",
         *   "accessKey": "xsaxaxsaxs",
         *   "bucket": "xsa-xs-xs",
         *   "endpoint": "http://oss-cn-shanghai.aliyuncs.com",
         *   "tag": "public"
         * }
         * ```
         * 
         * *   sqlserver
         * 
         * ```
         * 
         * {
         *   "jdbcUrl": "jdbc:sqlserver://xsaxsa-xsaxsa.database.xxx.cn:123;DatabaseName=xsxs-xsxs",
         *   "password": "sdasda$fs",
         *   "tag": "public",
         *   "username": "sxaxacdacdd"
         * }
         * ```
         * 
         * *   polardb
         * 
         * ```
         * 
         * {
         *   "clusterId": "pc-sdadsadsa",
         *   "database": "dsadsadsa",
         *   "ownerId": "121212122",
         *   "password": "sdasdafssa",
         *   "region": "cn-shanghai",
         *   "tag": "polardb",
         *   "username": "asdadsads"
         * }
         * ```
         * 
         * *   oracle
         * 
         * ```
         * 
         * {
         *   "jdbcUrl": "jdbc:oracle:saaa:@xxxxx:1521:PROD",
         *   "password": "sxasaxsa",
         *   "tag": "public",
         *   "username": "sasfadfa"
         * }
         * ```
         * 
         * *   mongodb
         * 
         * ```
         * 
         * {
         *   "address": "[\"xsaxxsa.mongodb.rds.aliyuncs.com:3717\"]",
         *   "database": "admin",
         *   "password": "sadsda@",
         *   "tag": "public",
         *   "username": "dsadsadas"
         * }
         * ```
         * 
         * *   emr
         * 
         * ```
         * 
         * {
         *   "accessId": "xsaxsa",
         *   "emrClusterId": "C-dsads",
         *   "emrResourceQueueName": "default",
         *   "emrEndpoint": "emr.aliyuncs.com",
         *   "accessKey": "dsadsad",
         *   "emrUserId": "224833315798889783",
         *   "name": "sasdsadsa",
         *   "emrAccessMode": "simple",
         *   "region": "cn-shanghai",
         *   "authType": "2",
         *   "emrProjectId": "FP-sdadsad"
         * }
         * ```
         * 
         * *   postgresql
         * 
         * ```
         * 
         * {
         *   "jdbcUrl": "jdbc:postgresql://xxxx:1921/ssss",
         *   "password": "sdadsads",
         *   "tag": "public",
         *   "username": "sdsasda"
         * }
         * ```
         * 
         * *   analyticdb_for_mysql
         * 
         * ```
         * 
         * {
         *   "instanceId": "am-sadsada",
         *   "database": "xsxsx",
         *   "username": "xsxsa",
         *   "password": "asdadsa",
         *   "connectionString": "am-xssxsxs.ads.aliyuncs.com:3306"
         * }
         * ```
         * 
         * *   hybriddb_for_postgresql
         * 
         * ```
         * 
         * {
         *   "connectionString": "gp-xsaxsaxa-master.gpdbmaster.rds.aliyuncs.com",
         *   "database": "xsaxsaxas",
         *   "password": "xsaxsaxsa@11",
         *   "instanceId": "gp-xsaxsaxsa",
         *   "port": "541132",
         *   "ownerId": "xsaxsaxsas",
         *   "username": "sadsad"
         * }
         * ```
         * 
         * *   holo
         * 
         * ```
         * 
         * {
         *   "accessId": "xsaxsaxs",
         *   "accessKey": "xsaxsaxsa",
         *   "database": "xsaxsaxsa",
         *   "instanceId": "xsaxa",
         *   "tag": "aliyun"
         * }
         * ```
         * 
         * *   kafka
         * 
         * ```
         * 
         * {
         *   "instanceId": "xsax-cn-xsaxsa",
         *   "regionId": "cn-shanghai",
         *   "tag": "aliyun",
         *   "ownerId": "1212121212112"
         * }
         * ```
         */
        public Builder subType(String subType) {
            this.putQueryParameter("SubType", subType);
            this.subType = subType;
            return this;
        }

        @Override
        public CreateDataSourceRequest build() {
            return new CreateDataSourceRequest(this);
        } 

    } 

}
