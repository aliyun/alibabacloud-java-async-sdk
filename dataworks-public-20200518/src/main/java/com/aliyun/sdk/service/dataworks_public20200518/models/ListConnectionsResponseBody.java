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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListConnectionsResponseBody model) {
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The query results for data sources that are returned on multiple pages.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc14115159376359****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListConnectionsResponseBody build() {
            return new ListConnectionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListConnectionsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Connections model) {
                this.bindingCalcEngineId = model.bindingCalcEngineId;
                this.connectStatus = model.connectStatus;
                this.connectionType = model.connectionType;
                this.content = model.content;
                this.defaultEngine = model.defaultEngine;
                this.description = model.description;
                this.envType = model.envType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.name = model.name;
                this.operator = model.operator;
                this.projectId = model.projectId;
                this.sequence = model.sequence;
                this.shared = model.shared;
                this.status = model.status;
                this.subType = model.subType;
                this.tenantId = model.tenantId;
            } 

            /**
             * <p>The ID of the compute engine with which the data source is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder bindingCalcEngineId(Integer bindingCalcEngineId) {
                this.bindingCalcEngineId = bindingCalcEngineId;
                return this;
            }

            /**
             * <p>The status of the data source. Valid values:</p>
             * <ul>
             * <li>1: The data source is normal.</li>
             * <li>2: The data source is disabled.</li>
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
             * <p>mysql</p>
             */
            public Builder connectionType(String connectionType) {
                this.connectionType = connectionType;
                return this;
            }

            /**
             * <p>The details of the data source. Examples of details of some common data sources:</p>
             * <ul>
             * <li>odps</li>
             * </ul>
             * <!---->
             * 
             * <pre><code>{
             *   &quot;accessId&quot;: &quot;xssssss&quot;,
             *   &quot;accessKey&quot;: &quot;xsaxsaxsa&quot;,
             *   &quot;authType&quot;: 2,
             *   &quot;endpoint&quot;: &quot;http://service.odps.aliyun.com/api&quot;,
             *   &quot;project&quot;: &quot;xsaxsax&quot;,
             *   &quot;tag&quot;: &quot;public&quot;
             * }
             * </code></pre>
             * <ul>
             * <li>mysql</li>
             * </ul>
             * <!---->
             * 
             * <pre><code>{
             *   &quot;database&quot;: &quot;xsaxsa&quot;,
             *   &quot;instanceName&quot;: &quot;rm-xsaxsa&quot;,
             *   &quot;password&quot;: &quot;xsaxsa&quot;,
             *   &quot;rdsOwnerId&quot;: &quot;xasxsa&quot;,
             *   &quot;regionId&quot;: &quot;cn-shanghai&quot;,
             *   &quot;tag&quot;: &quot;rds&quot;,
             *   &quot;username&quot;: &quot;xsaxsa&quot;
             * }
             * </code></pre>
             * <ul>
             * <li>rds</li>
             * </ul>
             * <!---->
             * 
             * <pre><code>{
             *   &quot;configType&quot;: 1,
             *   &quot;tag&quot;: &quot;rds&quot;,
             *   &quot;database&quot;: &quot;xsaxsa&quot;,
             *   &quot;username&quot;: &quot;xsaxsa&quot;,
             *   &quot;password&quot;: &quot;xssaxsa$32050&quot;,
             *   &quot;instanceName&quot;: &quot;rm-xsaxs&quot;,
             *   &quot;rdsOwnerId&quot;: &quot;11111111&quot;
             * }
             * </code></pre>
             * <ul>
             * <li>oss</li>
             * </ul>
             * <!---->
             * 
             * <pre><code>{
             *   &quot;accessId&quot;: &quot;sssssxx&quot;,
             *   &quot;accessKey&quot;: &quot;xsaxaxsaxs&quot;,
             *   &quot;bucket&quot;: &quot;xsa-xs-xs&quot;,
             *   &quot;endpoint&quot;: &quot;http://oss-cn-shanghai.aliyuncs.com&quot;,
             *   &quot;tag&quot;: &quot;public&quot;
             * }
             * </code></pre>
             * <ul>
             * <li>sqlserver</li>
             * </ul>
             * <!---->
             * 
             * <pre><code>{
             *   &quot;jdbcUrl&quot;: &quot;jdbc:sqlserver://xsaxsa-xsaxsa.database.xxx.cn:123;DatabaseName=xsxs-xsxs&quot;,
             *   &quot;password&quot;: &quot;sdasda$fs&quot;,
             *   &quot;tag&quot;: &quot;public&quot;,
             *   &quot;username&quot;: &quot;sxaxacdacdd&quot;
             * }
             * </code></pre>
             * <ul>
             * <li>polardb</li>
             * </ul>
             * <!---->
             * 
             * <pre><code>{
             *   &quot;clusterId&quot;: &quot;pc-sdadsadsa&quot;,
             *   &quot;database&quot;: &quot;dsadsadsa&quot;,
             *   &quot;ownerId&quot;: &quot;121212122&quot;,
             *   &quot;password&quot;: &quot;sdasdafssa&quot;,
             *   &quot;region&quot;: &quot;cn-shanghai&quot;,
             *   &quot;tag&quot;: &quot;polardb&quot;,
             *   &quot;username&quot;: &quot;asdadsads&quot;
             * }
             * </code></pre>
             * <ul>
             * <li>oracle</li>
             * </ul>
             * <!---->
             * 
             * <pre><code>{
             *   &quot;jdbcUrl&quot;: &quot;jdbc:oracle:saaa:@xxxxx:1521:PROD&quot;,
             *   &quot;password&quot;: &quot;sxasaxsa&quot;,
             *   &quot;tag&quot;: &quot;public&quot;,
             *   &quot;username&quot;: &quot;sasfadfa&quot;
             * }
             * </code></pre>
             * <ul>
             * <li>mongodb</li>
             * </ul>
             * <!---->
             * 
             * <pre><code>{
             *   &quot;address&quot;: &quot;[\&quot;xsaxxsa.mongodb.rds.aliyuncs.com:3717\&quot;]&quot;,
             *   &quot;database&quot;: &quot;admin&quot;,
             *   &quot;password&quot;: &quot;sadsda@&quot;,
             *   &quot;tag&quot;: &quot;public&quot;,
             *   &quot;username&quot;: &quot;dsadsadas&quot;
             * }
             * </code></pre>
             * <ul>
             * <li>emr</li>
             * </ul>
             * <!---->
             * 
             * <pre><code>{
             *   &quot;accessId&quot;: &quot;xsaxsa&quot;,
             *   &quot;emrClusterId&quot;: &quot;C-dsads&quot;,
             *   &quot;emrResourceQueueName&quot;: &quot;default&quot;,
             *   &quot;emrEndpoint&quot;: &quot;emr.aliyuncs.com&quot;,
             *   &quot;accessKey&quot;: &quot;dsadsad&quot;,
             *   &quot;emrUserId&quot;: &quot;224833315798889783&quot;,
             *   &quot;name&quot;: &quot;sasdsadsa&quot;,
             *   &quot;emrAccessMode&quot;: &quot;simple&quot;,
             *   &quot;region&quot;: &quot;cn-shanghai&quot;,
             *   &quot;authType&quot;: &quot;2&quot;,
             *   &quot;emrProjectId&quot;: &quot;FP-sdadsad&quot;
             * }
             * </code></pre>
             * <ul>
             * <li>postgresql</li>
             * </ul>
             * <!---->
             * 
             * <pre><code>{
             *   &quot;jdbcUrl&quot;: &quot;jdbc:postgresql://xxxx:1921/ssss&quot;,
             *   &quot;password&quot;: &quot;sdadsads&quot;,
             *   &quot;tag&quot;: &quot;public&quot;,
             *   &quot;username&quot;: &quot;sdsasda&quot;
             * }
             * </code></pre>
             * <ul>
             * <li>analyticdb_for_mysql</li>
             * </ul>
             * <!---->
             * 
             * <pre><code>{
             *   &quot;instanceId&quot;: &quot;am-sadsada&quot;,
             *   &quot;database&quot;: &quot;xsxsx&quot;,
             *   &quot;username&quot;: &quot;xsxsa&quot;,
             *   &quot;password&quot;: &quot;asdadsa&quot;,
             *   &quot;connectionString&quot;: &quot;am-xssxsxs.ads.aliyuncs.com:3306&quot;
             * }
             * </code></pre>
             * <ul>
             * <li>hybriddb_for_postgresql</li>
             * </ul>
             * <!---->
             * 
             * <pre><code>{
             *   &quot;connectionString&quot;: &quot;gp-xsaxsaxa-master.gpdbmaster.rds.aliyuncs.com&quot;,
             *   &quot;database&quot;: &quot;xsaxsaxas&quot;,
             *   &quot;password&quot;: &quot;xsaxsaxsa@11&quot;,
             *   &quot;instanceId&quot;: &quot;gp-xsaxsaxsa&quot;,
             *   &quot;port&quot;: &quot;541132&quot;,
             *   &quot;ownerId&quot;: &quot;xsaxsaxsas&quot;,
             *   &quot;username&quot;: &quot;sadsad&quot;
             * }
             * </code></pre>
             * <ul>
             * <li>holo</li>
             * </ul>
             * <!---->
             * 
             * <pre><code>{
             *   &quot;accessId&quot;: &quot;xsaxsaxs&quot;,
             *   &quot;accessKey&quot;: &quot;xsaxsaxsa&quot;,
             *   &quot;database&quot;: &quot;xsaxsaxsa&quot;,
             *   &quot;instanceId&quot;: &quot;xsaxa&quot;,
             *   &quot;tag&quot;: &quot;aliyun&quot;
             * }
             * </code></pre>
             * <ul>
             * <li>kafka</li>
             * </ul>
             * <!---->
             * 
             * <pre><code>{
             *   &quot;instanceId&quot;: &quot;xsax-cn-xsaxsa&quot;,
             *   &quot;regionId&quot;: &quot;cn-shanghai&quot;,
             *   &quot;tag&quot;: &quot;aliyun&quot;,
             *   &quot;ownerId&quot;: &quot;1212121212112&quot;
             * }
             * </code></pre>
             * 
             * <strong>example:</strong>
             * <p>{&quot;database&quot;:&quot;xxx&quot;,&quot;instanceName&quot;:&quot;xxx&quot;,&quot;password&quot;:&quot;xxx&quot;,&quot;rdsOwnerId&quot;:&quot;xxx&quot;,&quot;tag&quot;:&quot;rds&quot;,&quot;username&quot;:&quot;xxx&quot;}</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Indicates whether the compute engine that is associated with the data source is the default compute engine used by data sources of the same type.</p>
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
             * <p>The environment in which the data source is used. Valid values:</p>
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
             * <p>The ID of the Alibaba Cloud account that is used to last modify the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>193543050****</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The ID of the workspace with which the data source is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder projectId(Integer projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The field that is used to sort data sources. Data sources are sorted in descending order based on the value of this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * <p>Indicates whether the data source is a shared data source.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder shared(Boolean shared) {
                this.shared = shared;
                return this;
            }

            /**
             * <p>The status of the data source. Valid values:</p>
             * <ul>
             * <li>1: The data source is normal.</li>
             * <li>2: The data source is disabled.</li>
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
             * <p>The subtype of the data source. This parameter is used in scenarios where a type includes subtypes. The following type and subtypes are supported:</p>
             * <ul>
             * <li>Type: <code>rds</code></li>
             * <li>Subtypes: <code>mysql</code>, <code>sqlserver</code>, and <code>postgresql</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567</p>
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
    /**
     * 
     * {@link ListConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListConnectionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Connections")
        private java.util.List<Connections> connections;

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
        public java.util.List<Connections> getConnections() {
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
            private java.util.List<Connections> connections; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.connections = model.connections;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The data sources.</p>
             */
            public Builder connections(java.util.List<Connections> connections) {
                this.connections = connections;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of data sources returned.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
