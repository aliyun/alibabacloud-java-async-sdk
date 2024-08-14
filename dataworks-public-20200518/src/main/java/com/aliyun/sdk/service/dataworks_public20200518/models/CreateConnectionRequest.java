// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreateConnectionRequest</p>
 */
public class CreateConnectionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer envType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubType")
    private String subType;

    private CreateConnectionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.connectionType = builder.connectionType;
        this.content = builder.content;
        this.description = builder.description;
        this.envType = builder.envType;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.subType = builder.subType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConnectionRequest create() {
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
     * @return connectionType
     */
    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
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

    public static final class Builder extends Request.Builder<CreateConnectionRequest, Builder> {
        private String regionId; 
        private String connectionType; 
        private String content; 
        private String description; 
        private Integer envType; 
        private String name; 
        private Long projectId; 
        private String subType; 

        private Builder() {
            super();
        } 

        private Builder(CreateConnectionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.connectionType = request.connectionType;
            this.content = request.content;
            this.description = request.description;
            this.envType = request.envType;
            this.name = request.name;
            this.projectId = request.projectId;
            this.subType = request.subType;
        } 

        /**
         * The ID of the region where your project resides.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the connection string. Valid values:
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
        public Builder connectionType(String connectionType) {
            this.putQueryParameter("ConnectionType", connectionType);
            this.connectionType = connectionType;
            return this;
        }

        /**
         * The details of the data source. Examples of details of some common data sources:
         * <p>
         * 
         * *   odps
         * 
         * <!---->
         * 
         *     {
         *       "accessId": "xssssss",
         *       "accessKey": "xsaxsaxsa",
         *       "authType": 2,
         *       "endpoint": "http://service.odps.aliyun.com/api",
         *       "project": "xsaxsax",
         *       "tag": "public"
         *     }
         * 
         * *   mysql
         * 
         * <!---->
         * 
         *     {
         *       "database": "xsaxsa",
         *       "instanceName": "rm-xsaxsa",
         *       "password": "xsaxsa",
         *       "rdsOwnerId": "xasxsa",
         *       "regionId": "cn-shanghai",
         *       "tag": "rds",
         *       "username": "xsaxsa"
         *     }
         * 
         * *   rds
         * 
         * <!---->
         * 
         *     {
         *       "configType": 1,
         *       "tag": "rds",
         *       "database": "xsaxsa",
         *       "username": "xsaxsa",
         *       "password": "xssaxsa$32050",
         *       "instanceName": "rm-xsaxs",
         *       "rdsOwnerId": "11111111"
         *     }
         * 
         * *   oss
         * 
         * <!---->
         * 
         *     {
         *       "accessId": "sssssxx",
         *       "accessKey": "xsaxaxsaxs",
         *       "bucket": "xsa-xs-xs",
         *       "endpoint": "http://oss-cn-shanghai.aliyuncs.com",
         *       "tag": "public"
         *     }
         * 
         * *   sqlserver
         * 
         * <!---->
         * 
         *     {
         *       "jdbcUrl": "jdbc:sqlserver://xsaxsa-xsaxsa.database.xxx.cn:123;DatabaseName=xsxs-xsxs",
         *       "password": "sdasda$fs",
         *       "tag": "public",
         *       "username": "sxaxacdacdd"
         *     }
         * 
         * *   polardb
         * 
         * <!---->
         * 
         *     {
         *       "clusterId": "pc-sdadsadsa",
         *       "database": "dsadsadsa",
         *       "ownerId": "121212122",
         *       "password": "sdasdafssa",
         *       "region": "cn-shanghai",
         *       "tag": "polardb",
         *       "username": "asdadsads"
         *     }
         * 
         * *   oracle
         * 
         * <!---->
         * 
         *     {
         *       "jdbcUrl": "jdbc:oracle:saaa:@xxxxx:1521:PROD",
         *       "password": "sxasaxsa",
         *       "tag": "public",
         *       "username": "sasfadfa"
         *     }
         * 
         * *   mongodb
         * 
         * <!---->
         * 
         *     {
         *       "address": "[\"xsaxxsa.mongodb.rds.aliyuncs.com:3717\"]",
         *       "database": "admin",
         *       "password": "sadsda@",
         *       "tag": "public",
         *       "username": "dsadsadas"
         *     }
         * 
         * *   emr
         * 
         * <!---->
         * 
         *     {
         *       "accessId": "xsaxsa",
         *       "emrClusterId": "C-dsads",
         *       "emrResourceQueueName": "default",
         *       "emrEndpoint": "emr.aliyuncs.com",
         *       "accessKey": "dsadsad",
         *       "emrUserId": "224833315798889783",
         *       "name": "sasdsadsa",
         *       "emrAccessMode": "simple",
         *       "region": "cn-shanghai",
         *       "authType": "2",
         *       "emrProjectId": "FP-sdadsad"
         *     }
         * 
         * *   postgresql
         * 
         * <!---->
         * 
         *     {
         *       "jdbcUrl": "jdbc:postgresql://xxxx:1921/ssss",
         *       "password": "sdadsads",
         *       "tag": "public",
         *       "username": "sdsasda"
         *     }
         * 
         * *   analyticdb_for_mysql
         * 
         * <!---->
         * 
         *     {
         *       "instanceId": "am-sadsada",
         *       "database": "xsxsx",
         *       "username": "xsxsa",
         *       "password": "asdadsa",
         *       "connectionString": "am-xssxsxs.ads.aliyuncs.com:3306"
         *     }
         * 
         * *   hybriddb_for_postgresql
         * 
         * <!---->
         * 
         *     {
         *       "connectionString": "gp-xsaxsaxa-master.gpdbmaster.rds.aliyuncs.com",
         *       "database": "xsaxsaxas",
         *       "password": "xsaxsaxsa@11",
         *       "instanceId": "gp-xsaxsaxsa",
         *       "port": "541132",
         *       "ownerId": "xsaxsaxsas",
         *       "username": "sadsad"
         *     }
         * 
         * *   holo
         * 
         * <!---->
         * 
         *     {
         *       "accessId": "xsaxsaxs",
         *       "accessKey": "xsaxsaxsa",
         *       "database": "xsaxsaxsa",
         *       "instanceId": "xsaxa",
         *       "tag": "aliyun"
         *     }
         * 
         * *   kafka
         * 
         * <!---->
         * 
         *     {
         *       "instanceId": "xsax-cn-xsaxsa",
         *       "regionId": "cn-shanghai",
         *       "tag": "aliyun",
         *       "ownerId": "1212121212112"
         *     }
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * The description of the connection string.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The environment in which the data source is used. Valid values: 0 and 1. The value 0 indicates the development environment. The value 1 indicates the production environment.
         */
        public Builder envType(Integer envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * The name of the data source.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the workspace with which the data source is associated. You can call the [ListProjects](~~178393~~) operation to query the ID.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The subtype of the connection string. This parameter is used for scenarios where a type includes subtypes. The following type and subtypes are supported:
         * <p>
         * 
         * *   Type: `rds`
         * *   Subtypes: `mysql`, `sqlserver`, and `postgresql`.
         */
        public Builder subType(String subType) {
            this.putQueryParameter("SubType", subType);
            this.subType = subType;
            return this;
        }

        @Override
        public CreateConnectionRequest build() {
            return new CreateConnectionRequest(this);
        } 

    } 

}
