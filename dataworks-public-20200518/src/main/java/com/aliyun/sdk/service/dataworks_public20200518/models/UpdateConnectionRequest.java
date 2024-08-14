// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConnectionRequest} extends {@link RequestModel}
 *
 * <p>UpdateConnectionRequest</p>
 */
public class UpdateConnectionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long connectionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private Integer envType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpdateConnectionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.connectionId = builder.connectionId;
        this.content = builder.content;
        this.description = builder.description;
        this.envType = builder.envType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConnectionRequest create() {
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
     * @return connectionId
     */
    public Long getConnectionId() {
        return this.connectionId;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateConnectionRequest, Builder> {
        private String regionId; 
        private Long connectionId; 
        private String content; 
        private String description; 
        private Integer envType; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConnectionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.connectionId = request.connectionId;
            this.content = request.content;
            this.description = request.description;
            this.envType = request.envType;
            this.status = request.status;
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
         * The data source ID. You can call the [ListConnections](~~173911~~) operation to query the ID.
         */
        public Builder connectionId(Long connectionId) {
            this.putQueryParameter("ConnectionId", connectionId);
            this.connectionId = connectionId;
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
         * The description of the data source.
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
         * The status of the data source. Valid values: ENABLED and DISABLED. The value ENABLED indicates that the data source is in the normal state. The value DISABLED indicates that the data source is in an abnormal state.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateConnectionRequest build() {
            return new UpdateConnectionRequest(this);
        } 

    } 

}
