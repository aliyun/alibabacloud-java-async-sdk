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
 * {@link IdentifyCredential} extends {@link TeaModel}
 *
 * <p>IdentifyCredential</p>
 */
public class IdentifyCredential extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSource")
    private DataSource dataSource;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("UserType")
    private String userType;

    private IdentifyCredential(Builder builder) {
        this.dataSource = builder.dataSource;
        this.projectId = builder.projectId;
        this.userId = builder.userId;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IdentifyCredential create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSource
     */
    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder {
        private DataSource dataSource; 
        private String projectId; 
        private String userId; 
        private String userType; 

        private Builder() {
        } 

        private Builder(IdentifyCredential model) {
            this.dataSource = model.dataSource;
            this.projectId = model.projectId;
            this.userId = model.userId;
            this.userType = model.userType;
        } 

        /**
         * <p>The data source.</p>
         */
        public Builder dataSource(DataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        /**
         * <p>The project ID. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The user UID. If the <code>UserType</code> is <code>Role</code>, you must prefix this value with <code>ROLE_</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ROLE_300888674340307309</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The user type. Supported values are:</p>
         * <ul>
         * <li><p>primary account: <code>PrimaryAccount</code></p>
         * </li>
         * <li><p>subaccount: <code>SubAccount</code></p>
         * </li>
         * <li><p>role: <code>Role</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>primaryAccount</p>
         */
        public Builder userType(String userType) {
            this.userType = userType;
            return this;
        }

        public IdentifyCredential build() {
            return new IdentifyCredential(this);
        } 

    } 

    /**
     * 
     * {@link IdentifyCredential} extends {@link TeaModel}
     *
     * <p>IdentifyCredential</p>
     */
    public static class DataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private DataSource(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.password = builder.password;
            this.role = builder.role;
            this.type = builder.type;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSource create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String instanceId; 
            private String instanceName; 
            private String password; 
            private String role; 
            private String type; 
            private String userName; 

            private Builder() {
            } 

            private Builder(DataSource model) {
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.password = model.password;
                this.role = model.role;
                this.type = model.type;
                this.userName = model.userName;
            } 

            /**
             * <p>The data source instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>710007423244</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The data source instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2zez82ho69yex7s7g</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The data source password.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The user role for the data source. Valid values are:</p>
             * <ul>
             * <li><p><code>Admin</code></p>
             * </li>
             * <li><p><code>RegularUser</code></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The data source type. Supported values are:</p>
             * <ul>
             * <li><p><code>hive</code></p>
             * </li>
             * <li><p><code>lindorm_for_engine</code></p>
             * </li>
             * <li><p><code>starrocks</code></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>hologres</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The data source user name.</p>
             * 
             * <strong>example:</strong>
             * <p>tom</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public DataSource build() {
                return new DataSource(this);
            } 

        } 

    }
}
