// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourcesResponseBody</p>
 */
public class ListDataSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDataSourcesResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourcesResponseBody create() {
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
         * The query result returned.
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

        public ListDataSourcesResponseBody build() {
            return new ListDataSourcesResponseBody(this);
        } 

    } 

    public static class DataSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindingCalcEngineId")
        private Long bindingCalcEngineId;

        @com.aliyun.core.annotation.NameInMap("ConnectStatus")
        private Integer connectStatus;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DataSourceType")
        private String dataSourceType;

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
        private Long id;

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

        private DataSources(Builder builder) {
            this.bindingCalcEngineId = builder.bindingCalcEngineId;
            this.connectStatus = builder.connectStatus;
            this.content = builder.content;
            this.dataSourceType = builder.dataSourceType;
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

        public static DataSources create() {
            return builder().build();
        }

        /**
         * @return bindingCalcEngineId
         */
        public Long getBindingCalcEngineId() {
            return this.bindingCalcEngineId;
        }

        /**
         * @return connectStatus
         */
        public Integer getConnectStatus() {
            return this.connectStatus;
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
        public Long getId() {
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
            private Long bindingCalcEngineId; 
            private Integer connectStatus; 
            private String content; 
            private String dataSourceType; 
            private Boolean defaultEngine; 
            private String description; 
            private Integer envType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
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
            public Builder bindingCalcEngineId(Long bindingCalcEngineId) {
                this.bindingCalcEngineId = bindingCalcEngineId;
                return this;
            }

            /**
             * The status of the data source. Valid values:
             * <p>
             * 
             * *   1: The data source is accessible.
             * *   2: The data source is inaccessible.
             */
            public Builder connectStatus(Integer connectStatus) {
                this.connectStatus = connectStatus;
                return this;
            }

            /**
             * The data connection string. The value of this parameter is in the JSON format. Examples of connection strings of common data sources:
             * <p>
             * 
             * *   MaxCompute
             * 
             *         {
             *           "pubEndpoint": "http://service.cn.maxcompute.aliyun.com/api",
             *           "accessId": "xxxxxxx",
             *           "securityToken": null,
             *           "endpoint": "http://service.cn.maxcompute.aliyun-inc.com/api",
             *           "accessKey": "***",
             *           "name": "PRE_PROJECT_A_engine",
             *           "project": "PRE_PROJECT_A",
             *           "vpcEndpoint": "http://service.cn.maxcompute.aliyun-inc.com/api",
             *           "region": "cn-shanghai",
             *           "authType": "2"
             *         }
             * 
             * *   MySQL
             * 
             *         {
             *           "configType": "1",
             *           "database": "mysql_d111b",
             *           "instanceName": "rm-xxxxxx",
             *           "password": "***",
             *           "rdsOwnerId": "12133xxxxxx",
             *           "tag": "rds",
             *           "username": "mysql_db111"
             *         }
             * 
             * *   ApsaraDB RDS for SQL Server
             * 
             *         {
             *           "configType": "1",
             *           "jdbcUrl": "jdbc:sqlserver://rm-xxxxx.sqlserver.rds.aliyuncs.com:1433;DatabaseName=sqlserver_db1",
             *           "password": "***",
             *           "tag": "public",
             *           "username": "sqlserver_db111"
             *         }
             * 
             * *   Object Storage Service (OSS)
             * 
             *         {
             *           "accessId": "LTAINbR9Uxxxx",
             *           "accessKey": "***",
             *           "bucket": "bigxxx1223",
             *           "configType": "1",
             *           "endpoint": "http://oss-cn-hangzhou.aliyuncs.com",
             *           "tag": "public"
             *         }
             * 
             * *   ApsaraDB RDS for PostgreSQL
             * 
             *         {
             *           "configType": "1",
             *           "database": "cdp_xxx",
             *           "instanceName": "rm-xxxx",
             *           "password": "***",
             *           "rdsOwnerId": "121xxxxx",
             *           "tag": "rds",
             *           "username": "cdp_xxx"
             *         }
             * 
             * *   AnalyticDB for MySQL
             * 
             *         {
             *           "configType": "1",
             *           "password": "***",
             *           "schema": "ads_demo",
             *           "tag": "public",
             *           "url": "ads-xxx-xxxx.cn-hangzhou-1.ads.aliyuncs.com:3029",
             *           "username": "lslslsls"
             *         }
             */
            public Builder content(String content) {
                this.content = content;
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
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
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
            public Builder id(Long id) {
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
             * The ID of the workspace to which the data source belongs.
             */
            public Builder projectId(Integer projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The sequence number of the data source. Data sources are sorted in descending order based on the value of this parameter.
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
             * *   1: The data source is accessible.
             * *   2: The data source is inaccessible.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The subtype of the data source. This parameter takes effect only when the DataSourceType parameter is set to rds.
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

            public DataSources build() {
                return new DataSources(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSources")
        private java.util.List < DataSources> dataSources;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.dataSources = builder.dataSources;
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
         * @return dataSources
         */
        public java.util.List < DataSources> getDataSources() {
            return this.dataSources;
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
            private java.util.List < DataSources> dataSources; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The data sources.
             */
            public Builder dataSources(java.util.List < DataSources> dataSources) {
                this.dataSources = dataSources;
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
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of data sources.
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
