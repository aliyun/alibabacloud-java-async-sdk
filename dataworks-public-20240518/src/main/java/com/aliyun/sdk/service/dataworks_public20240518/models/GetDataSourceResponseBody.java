// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
         * DataSource.
         */
        public Builder dataSource(DataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        /**
         * RequestId.
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
             * ConnectionProperties.
             */
            public Builder connectionProperties(Object connectionProperties) {
                this.connectionProperties = connectionProperties;
                return this;
            }

            /**
             * ConnectionPropertiesMode.
             */
            public Builder connectionPropertiesMode(String connectionPropertiesMode) {
                this.connectionPropertiesMode = connectionPropertiesMode;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUser.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * ModifyUser.
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * QualifiedName.
             */
            public Builder qualifiedName(String qualifiedName) {
                this.qualifiedName = qualifiedName;
                return this;
            }

            /**
             * Type.
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
