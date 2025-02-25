// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataSourceResponseBody</p>
 */
public class GetDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSource")
    private DataSource dataSource;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDataSourceResponseBody(Builder builder) {
        this.dataSource = builder.dataSource;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataSourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataSource
     */
    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataSource dataSource; 
        private String requestId; 

        /**
         * <p>The information about the data source.</p>
         */
        public Builder dataSource(DataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9252F32F-D855-549E-8898-61CF5A733050</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataSourceResponseBody build() {
            return new GetDataSourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataSourceResponseBody</p>
     */
    public static class DataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionProperties")
        private Object connectionProperties;

        @com.aliyun.core.annotation.NameInMap("ConnectionPropertiesMode")
        private String connectionPropertiesMode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("ModifyUser")
        private String modifyUser;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("QualifiedName")
        private String qualifiedName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DataSource(Builder builder) {
            this.connectionProperties = builder.connectionProperties;
            this.connectionPropertiesMode = builder.connectionPropertiesMode;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.description = builder.description;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.modifyUser = builder.modifyUser;
            this.name = builder.name;
            this.projectId = builder.projectId;
            this.qualifiedName = builder.qualifiedName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSource create() {
            return builder().build();
        }

        /**
         * @return connectionProperties
         */
        public Object getConnectionProperties() {
            return this.connectionProperties;
        }

        /**
         * @return connectionPropertiesMode
         */
        public String getConnectionPropertiesMode() {
            return this.connectionPropertiesMode;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return modifyUser
         */
        public String getModifyUser() {
            return this.modifyUser;
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
         * @return qualifiedName
         */
        public String getQualifiedName() {
            return this.qualifiedName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Object connectionProperties; 
            private String connectionPropertiesMode; 
            private Long createTime; 
            private String createUser; 
            private String description; 
            private Long id; 
            private Long modifyTime; 
            private String modifyUser; 
            private String name; 
            private Long projectId; 
            private String qualifiedName; 
            private String type; 

            /**
             * <p>The connection configurations of the data source, including the connection address, access identity, and environment information. The envType parameter specifies the environment in which the data source is used. Valid values of the envType parameter:</p>
             * <ul>
             * <li>Dev: development environment</li>
             * <li>Prod: production environment</li>
             * </ul>
             * <p>The parameters that you need to configure for the data source vary based on the mode in which the data source is added. For more information, see <a href="https://help.aliyun.com/document_detail/2852465.html">Data source connection information (ConnectionProperties)</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;envType&quot;: &quot;Prod&quot;,
             *     &quot;regionId&quot;: &quot;cn-beijing&quot;,
             *     &quot;instanceId&quot;: &quot;hgprecn-cn-x0r3oun4k001&quot;,
             *     &quot;database&quot;: &quot;testdb&quot;,
             *     &quot;securityProtocol&quot;: &quot;authTypeNone&quot;,
             *     &quot;authType&quot;: &quot;Executor&quot;,
             *     &quot;authIdentity&quot;: &quot;1107550004253538&quot;
             * }</p>
             */
            public Builder connectionProperties(Object connectionProperties) {
                this.connectionProperties = connectionProperties;
                return this;
            }

            /**
             * <p>The mode in which the data source is added. The mode varies based on the data source type. Valid values:</p>
             * <ul>
             * <li>InstanceMode: instance mode</li>
             * <li>UrlMode: connection string mode</li>
             * <li>CdhMode: CDH cluster mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UrlMode</p>
             */
            public Builder connectionPropertiesMode(String connectionPropertiesMode) {
                this.connectionPropertiesMode = connectionPropertiesMode;
                return this;
            }

            /**
             * <p>The time when the data source was added. This value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1698286929333</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the user who adds the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>1107550004253538</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The description of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>16738</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The time when the data source was last modified. This value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1698286929333</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The ID of the user who modifies the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>1107550004253538</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the workspace with which the data source is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>52660</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The unique business key of the data source. For example, the unique business key of a Hologres data source is in the <code>${tenantOwnerId}:${regionId}:${type}:${instanceId}:${database}</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>1107550004253538:cn-beijing:holo:hgprecn-cn-x0r3oun4k001:testdb</p>
             */
            public Builder qualifiedName(String qualifiedName) {
                this.qualifiedName = qualifiedName;
                return this;
            }

            /**
             * <p>The type of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>hologres</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataSource build() {
                return new DataSource(this);
            } 

        } 

    }
}
