// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ExportDataSourcesResponseBody</p>
 */
public class ExportDataSourcesResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ExportDataSourcesResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportDataSourcesResponseBody create() {
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
         * The information about the export operation.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code returned. Valid values:
         * <p>
         * 
         * *   200: The request was successful.
         * *   Other values: The request failed. You can troubleshoot issues based on the HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the request. You can locate logs and troubleshoot issues based on the ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true: The request was successful.
         * *   false: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ExportDataSourcesResponseBody build() {
            return new ExportDataSourcesResponseBody(this);
        } 

    } 

    public static class DataSources extends TeaModel {
        @NameInMap("BindingCalcEngineId")
        private Integer bindingCalcEngineId;

        @NameInMap("ConnectStatus")
        private Integer connectStatus;

        @NameInMap("Content")
        private String content;

        @NameInMap("DataSourceType")
        private String dataSourceType;

        @NameInMap("DefaultEngine")
        private Boolean defaultEngine;

        @NameInMap("Description")
        private String description;

        @NameInMap("EnvType")
        private Integer envType;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("ProjectId")
        private Integer projectId;

        @NameInMap("Sequence")
        private Integer sequence;

        @NameInMap("Shared")
        private Boolean shared;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("SubType")
        private String subType;

        @NameInMap("TenantId")
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
            private String content; 
            private String dataSourceType; 
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
             * The ID of the compute engine to which the data source is bound.
             */
            public Builder bindingCalcEngineId(Integer bindingCalcEngineId) {
                this.bindingCalcEngineId = bindingCalcEngineId;
                return this;
            }

            /**
             * Indicates whether the data source is connected to an exclusive resource group. Valid values:
             * <p>
             * 
             * *   1: The data source is connected to at least one exclusive resource group.
             * *   0: The data source is not connected to any exclusive resource group.
             */
            public Builder connectStatus(Integer connectStatus) {
                this.connectStatus = connectStatus;
                return this;
            }

            /**
             * The configuration of the data source.
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
             * Indicates whether the compute engine to which the data source is bound is the default compute engine. Valid values:
             * <p>
             * 
             * *   true: The compute engine is the default compute engine.
             * *   false: The compute engine is not the default compute engine.
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
             * The environment to which the data source belongs. Valid values:
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
             * The ID of the data source.
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
             * The ID of the user who exported the data source.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The ID of the DataWorks workspace to which the data source belongs.
             */
            public Builder projectId(Integer projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The sequence number of the data source.
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * Indicates whether the data source can be shared. Valid values:
             * <p>
             * 
             * *   true: The data source can be shared.
             * *   false: The data source cannot be shared.
             */
            public Builder shared(Boolean shared) {
                this.shared = shared;
                return this;
            }

            /**
             * Indicates whether the data source is available. Valid values:
             * <p>
             * 
             * *   1: The data source is available.
             * *   0: The data source is unavailable.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The subtype of the data source. This parameter is returned only if the value of the DataSourceType parameter is rds.
             * <p>
             * 
             * If the value of the DataSourceType parameter is rds, the value of this parameter can be mysql, sqlserver, or postgresql.
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the data source belongs.
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
        @NameInMap("DataSources")
        private java.util.List < DataSources> dataSources;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
             * The details of the exported data sources.
             * <p>
             * 
             * The value is an array. The following parameters are the elements in the array. The sample values of these parameters show the details of a sample data source.
             */
            public Builder dataSources(java.util.List < DataSources> dataSources) {
                this.dataSources = dataSources;
                return this;
            }

            /**
             * The page number of the returned page. The value of this parameter is a positive integer greater than or equal to 1.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned on each page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
