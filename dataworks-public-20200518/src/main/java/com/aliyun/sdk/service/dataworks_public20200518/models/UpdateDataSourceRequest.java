// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDataSourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataSourceRequest</p>
 */
public class UpdateDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private Integer envType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpdateDataSourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.content = builder.content;
        this.dataSourceId = builder.dataSourceId;
        this.description = builder.description;
        this.envType = builder.envType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataSourceRequest create() {
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
     * @return dataSourceId
     */
    public Long getDataSourceId() {
        return this.dataSourceId;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateDataSourceRequest, Builder> {
        private String regionId; 
        private String content; 
        private Long dataSourceId; 
        private String description; 
        private Integer envType; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataSourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.content = request.content;
            this.dataSourceId = request.dataSourceId;
            this.description = request.description;
            this.envType = request.envType;
            this.status = request.status;
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
         * The ID of the data source that you want to update. You can call the [ListDataSources](~~211431~~) operation to obtain the ID.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * Indicates whether the data source is updated.
         */
        public Builder dataSourceId(Long dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * The details about the data source that you want to update.
         * <p>
         * 
         * You are not allowed to change the type of the data source. For example, you are not allowed to change the data source type from MaxCompute to mysql.
         * 
         * Examples of details of some common data sources:
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
         *                                 
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
         *                                 
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
         *                                 
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
         *                                 
         * ```
         * 
         * *   sqlserver
         * 
         * ```
         * 
         * {
         *   "jdbcUrl": "jdbc:sqlserver://xsaxsa-xsaxsa.database.xxx.cnv:123;DatabaseName=xsxs-xsxs",
         *   "password": "sdasda$fs",
         *   "tag": "public",
         *   "username": "sxaxacdacdd"
         * }
         *                                 
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
         *                                 
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
         *                                 
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
         *                                 
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
         *                                 
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
         *                                 
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
         *                                 
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
         *                                 
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
         *                                 
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
         *                                 
         * ```
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The status of the data source. The parameter is deprecated. Do not use this parameter.
         */
        public Builder envType(Integer envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateDataSourceRequest build() {
            return new UpdateDataSourceRequest(this);
        } 

    } 

}
