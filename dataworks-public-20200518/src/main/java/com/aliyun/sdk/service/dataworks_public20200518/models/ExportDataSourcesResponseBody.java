// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ExportDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ExportDataSourcesResponseBody</p>
 */
public class ExportDataSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The information about the exported data sources.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code returned. Valid values:</p>
         * <ul>
         * <li>200: The request was successful.</li>
         * <li>Other values: The request failed. You can troubleshoot issues based on the HTTP status code returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc14115159376359****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ExportDataSourcesResponseBody build() {
            return new ExportDataSourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExportDataSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ExportDataSourcesResponseBody</p>
     */
    public static class DataSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindingCalcEngineId")
        private Integer bindingCalcEngineId;

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
             * <p>The ID of the compute engine that is added as the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder bindingCalcEngineId(Integer bindingCalcEngineId) {
                this.bindingCalcEngineId = bindingCalcEngineId;
                return this;
            }

            /**
             * <p>Indicates whether the data source is connected to an exclusive resource group. Valid values:</p>
             * <ul>
             * <li>1: The data source is connected to at least one exclusive resource group.</li>
             * <li>0: The data source is not connected to any exclusive resource group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder connectStatus(Integer connectStatus) {
                this.connectStatus = connectStatus;
                return this;
            }

            /**
             * <p>The configuration of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;pubEndpoint&quot;:&quot;<a href="http://service.cn.maxcompute.aliyun.com/api%22,%22accessId%22:%22TMP.3KecGjvzy3i8MYfn2BGHgF7EHGyBFZcHm7GgngrABVRyvvKQrfF5kskR36xP361C3dqwbGo7SGYptAeGyiTwHXqLaBUvYC%22,%22securityToken%22:null,%22endpoint%22:%22http://service.cn.maxcompute.aliyun-inc.com/api%22,%22accessKey%22:%22***%22,%22name%22:%22PRE_PROJECT_A_engine%22,%22project%22:%22PRE_PROJECT_A%22,%22vpcEndpoint%22:%22http://service.cn.maxcompute.aliyun-inc.com/api%22,%22region%22:%22cn-shanghai%22,%22authType%22:%222%22%7D">http://service.cn.maxcompute.aliyun.com/api&quot;,&quot;accessId&quot;:&quot;TMP.3KecGjvzy3i8MYfn2BGHgF7EHGyBFZcHm7GgngrABVRyvvKQrfF5kskR36xP361C3dqwbGo7SGYptAeGyiTwHXqLaBUvYC&quot;,&quot;securityToken&quot;:null,&quot;endpoint&quot;:&quot;http://service.cn.maxcompute.aliyun-inc.com/api&quot;,&quot;accessKey&quot;:&quot;***&quot;,&quot;name&quot;:&quot;PRE_PROJECT_A_engine&quot;,&quot;project&quot;:&quot;PRE_PROJECT_A&quot;,&quot;vpcEndpoint&quot;:&quot;http://service.cn.maxcompute.aliyun-inc.com/api&quot;,&quot;region&quot;:&quot;cn-shanghai&quot;,&quot;authType&quot;:&quot;2&quot;}</a></p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The type of the data source. Valid values:</p>
             * <ul>
             * <li>odps</li>
             * <li>mysql</li>
             * <li>rds</li>
             * <li>oss</li>
             * <li>sqlserver</li>
             * <li>polardb</li>
             * <li>oracle</li>
             * <li>mongodb</li>
             * <li>emr</li>
             * <li>postgresql</li>
             * <li>analyticdb_for_mysql</li>
             * <li>hybriddb_for_postgresql</li>
             * <li>holo</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
                return this;
            }

            /**
             * <p>Indicates whether the compute engine that is added as the data source is the default compute engine. Valid values:</p>
             * <ul>
             * <li>true: The compute engine is the default compute engine.</li>
             * <li>false: The compute engine is not the default compute engine.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder defaultEngine(Boolean defaultEngine) {
                this.defaultEngine = defaultEngine;
                return this;
            }

            /**
             * <p>The description of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>a connection</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The environment in which the data source resides. Valid values:</p>
             * <ul>
             * <li>0: development environment</li>
             * <li>1: production environment</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder envType(Integer envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The time when the data source was created. Example: Mar 17, 2021 4:09:32 PM.</p>
             * 
             * <strong>example:</strong>
             * <p>Mar 17, 2021 4:09:32 PM</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the data source was last modified. Example: Mar 17, 2021 4:09:32 PM.</p>
             * 
             * <strong>example:</strong>
             * <p>Mar 17, 2021 4:09:32 PM</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the user who exported the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>193543050****</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The ID of the DataWorks workspace to which the data source belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder projectId(Integer projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The sequence number of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * <p>Indicates whether the data source can be shared. Valid values:</p>
             * <ul>
             * <li>true: The data source can be shared.</li>
             * <li>false: The data source cannot be shared.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder shared(Boolean shared) {
                this.shared = shared;
                return this;
            }

            /**
             * <p>Indicates whether the data source is available. Valid values:</p>
             * <ul>
             * <li>1: The data source is available.</li>
             * <li>0: The data source is unavailable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The subtype of the data source. This parameter takes effect only when the DataSourceType parameter is set to rds.</p>
             * <p>If the value of the DataSourceType parameter is rds, the value of this parameter can be mysql, sqlserver, or postgresql.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the data source belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567</p>
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
    /**
     * 
     * {@link ExportDataSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ExportDataSourcesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSources")
        private java.util.List<DataSources> dataSources;

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
        public java.util.List<DataSources> getDataSources() {
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
            private java.util.List<DataSources> dataSources; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The details of the exported data sources. The value is an array. The following parameters are the elements in the array. The sample values of these parameters show the details of a sample data source.</p>
             */
            public Builder dataSources(java.util.List<DataSources> dataSources) {
                this.dataSources = dataSources;
                return this;
            }

            /**
             * <p>The page number. Pages start from page 1.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
