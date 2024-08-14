// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConnectionsResponseBody</p>
 */
public class ListConnectionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListConnectionsResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConnectionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * The query results for data sources that are returned on multiple pages.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListConnectionsResponseBody build() {
            return new ListConnectionsResponseBody(this);
        } 

    } 

    public static class Connections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindingCalcEngineId")
        private Integer bindingCalcEngineId;

        @com.aliyun.core.annotation.NameInMap("ConnectStatus")
        private Integer connectStatus;

        @com.aliyun.core.annotation.NameInMap("ConnectionType")
        private String connectionType;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DefaultEngine")
        private Boolean defaultEngine;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private Integer envType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Integer projectId;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private Integer sequence;

        @com.aliyun.core.annotation.NameInMap("Shared")
        private Boolean shared;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        private Connections(Builder builder) {
            this.bindingCalcEngineId = builder.bindingCalcEngineId;
            this.connectStatus = builder.connectStatus;
            this.connectionType = builder.connectionType;
            this.content = builder.content;
            this.defaultEngine = builder.defaultEngine;
            this.description = builder.description;
            this.envType = builder.envType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.operator = builder.operator;
            this.projectId = builder.projectId;
            this.sequence = builder.sequence;
            this.shared = builder.shared;
            this.status = builder.status;
            this.subType = builder.subType;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Connections create() {
            return builder().build();
        }

        /**
         * @return bindingCalcEngineId
         */
        public Integer getBindingCalcEngineId() {
            return this.bindingCalcEngineId;
        }

        /**
         * @return connectStatus
         */
        public Integer getConnectStatus() {
            return this.connectStatus;
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
         * @return defaultEngine
         */
        public Boolean getDefaultEngine() {
            return this.defaultEngine;
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return projectId
         */
        public Integer getProjectId() {
            return this.projectId;
        }

        /**
         * @return sequence
         */
        public Integer getSequence() {
            return this.sequence;
        }

        /**
         * @return shared
         */
        public Boolean getShared() {
            return this.shared;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private Integer bindingCalcEngineId; 
            private Integer connectStatus; 
            private String connectionType; 
            private String content; 
            private Boolean defaultEngine; 
            private String description; 
            private Integer envType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Integer id; 
            private String name; 
            private String operator; 
            private Integer projectId; 
            private Integer sequence; 
            private Boolean shared; 
            private Integer status; 
            private String subType; 
            private Long tenantId; 

            /**
             * The ID of the compute engine with which the data source is associated.
             */
            public Builder bindingCalcEngineId(Integer bindingCalcEngineId) {
                this.bindingCalcEngineId = bindingCalcEngineId;
                return this;
            }

            /**
             * The status of the data source. Valid values:
             * <p>
             * 
             * *   1: The data source is normal.
             * *   2: The data source is disabled.
             */
            public Builder connectStatus(Integer connectStatus) {
                this.connectStatus = connectStatus;
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
            public Builder connectionType(String connectionType) {
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
                this.content = content;
                return this;
            }

            /**
             * Indicates whether the compute engine that is associated with the data source is the default compute engine used by data sources of the same type.
             */
            public Builder defaultEngine(Boolean defaultEngine) {
                this.defaultEngine = defaultEngine;
                return this;
            }

            /**
             * The description of the data source.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The environment in which the data source is used. Valid values:
             * <p>
             * 
             * *   0: development environment
             * *   1: production environment
             */
            public Builder envType(Integer envType) {
                this.envType = envType;
                return this;
            }

            /**
             * The time when the data source was created. Example: Mar 17, 2021 4:09:32 PM.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the data source was last modified. Example: Mar 17, 2021 4:09:32 PM.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The data source ID.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the data source.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to last modify the data source.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The ID of the workspace with which the data source is associated.
             */
            public Builder projectId(Integer projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The field that is used to sort data sources. Data sources are sorted in descending order based on the value of this parameter.
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * Indicates whether the data source is a shared data source.
             */
            public Builder shared(Boolean shared) {
                this.shared = shared;
                return this;
            }

            /**
             * The status of the data source. Valid values:
             * <p>
             * 
             * *   1: The data source is normal.
             * *   2: The data source is disabled.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The subtype of the data source. This parameter is used in scenarios where a type includes subtypes. The following type and subtypes are supported:
             * <p>
             * 
             * *   Type: `rds`
             * *   Subtypes: `mysql`, `sqlserver`, and `postgresql`.
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * The tenant ID.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public Connections build() {
                return new Connections(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Connections")
        private java.util.List < Connections> connections;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.connections = builder.connections;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return connections
         */
        public java.util.List < Connections> getConnections() {
            return this.connections;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Connections> connections; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The data sources.
             */
            public Builder connections(java.util.List < Connections> connections) {
                this.connections = connections;
                return this;
            }

            /**
             * The page number.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page. Default value: 10. Maximum value: 100.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of data sources returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
