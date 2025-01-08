// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link UpdateRdsExternalStoreRequest} extends {@link RequestModel}
 *
 * <p>UpdateRdsExternalStoreRequest</p>
 */
public class UpdateRdsExternalStoreRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("externalStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String externalStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parameter")
    @com.aliyun.core.annotation.Validation(required = true)
    private Parameter parameter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("storeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeType;

    private UpdateRdsExternalStoreRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.externalStoreName = builder.externalStoreName;
        this.parameter = builder.parameter;
        this.storeType = builder.storeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRdsExternalStoreRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return externalStoreName
     */
    public String getExternalStoreName() {
        return this.externalStoreName;
    }

    /**
     * @return parameter
     */
    public Parameter getParameter() {
        return this.parameter;
    }

    /**
     * @return storeType
     */
    public String getStoreType() {
        return this.storeType;
    }

    public static final class Builder extends Request.Builder<UpdateRdsExternalStoreRequest, Builder> {
        private String project; 
        private String externalStoreName; 
        private Parameter parameter; 
        private String storeType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRdsExternalStoreRequest request) {
            super(request);
            this.project = request.project;
            this.externalStoreName = request.externalStoreName;
            this.parameter = request.parameter;
            this.storeType = request.storeType;
        } 

        /**
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the external store.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-external-store</p>
         */
        public Builder externalStoreName(String externalStoreName) {
            this.putPathParameter("externalStoreName", externalStoreName);
            this.putBodyParameter("externalStoreName", externalStoreName);
            this.externalStoreName = externalStoreName;
            return this;
        }

        /**
         * <p>The parameter struct.</p>
         * <p>This parameter is required.</p>
         */
        public Builder parameter(Parameter parameter) {
            this.putBodyParameter("parameter", parameter);
            this.parameter = parameter;
            return this;
        }

        /**
         * <p>The storage type. Set the value to rds-vpc, which indicates an ApsaraDB RDS for MySQL database in a virtual private cloud (VPC).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rds-vpc</p>
         */
        public Builder storeType(String storeType) {
            this.putBodyParameter("storeType", storeType);
            this.storeType = storeType;
            return this;
        }

        @Override
        public UpdateRdsExternalStoreRequest build() {
            return new UpdateRdsExternalStoreRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateRdsExternalStoreRequest} extends {@link TeaModel}
     *
     * <p>UpdateRdsExternalStoreRequest</p>
     */
    public static class Parameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("db")
        @com.aliyun.core.annotation.Validation(required = true)
        private String db;

        @com.aliyun.core.annotation.NameInMap("host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("instance-id")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("password")
        @com.aliyun.core.annotation.Validation(required = true)
        private String password;

        @com.aliyun.core.annotation.NameInMap("port")
        @com.aliyun.core.annotation.Validation(required = true)
        private String port;

        @com.aliyun.core.annotation.NameInMap("region")
        @com.aliyun.core.annotation.Validation(required = true)
        private String region;

        @com.aliyun.core.annotation.NameInMap("table")
        @com.aliyun.core.annotation.Validation(required = true)
        private String table;

        @com.aliyun.core.annotation.NameInMap("username")
        @com.aliyun.core.annotation.Validation(required = true)
        private String username;

        @com.aliyun.core.annotation.NameInMap("vpc-id")
        private String vpcId;

        private Parameter(Builder builder) {
            this.db = builder.db;
            this.host = builder.host;
            this.instanceId = builder.instanceId;
            this.password = builder.password;
            this.port = builder.port;
            this.region = builder.region;
            this.table = builder.table;
            this.username = builder.username;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameter create() {
            return builder().build();
        }

        /**
         * @return db
         */
        public String getDb() {
            return this.db;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String db; 
            private String host; 
            private String instanceId; 
            private String password; 
            private String port; 
            private String region; 
            private String table; 
            private String username; 
            private String vpcId; 

            /**
             * <p>The name of the database in the ApsaraDB RDS for MySQL instance.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>meta</p>
             */
            public Builder db(String db) {
                this.db = db;
                return this;
            }

            /**
             * <p>The internal or public endpoint of the ApsaraDB RDS for MySQL instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The ID of the ApsaraDB RDS for MySQL instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1b6c719dfa08exf****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The password that is used to log on to the ApsaraDB RDS for MySQL instance.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sfdsfldsfksfls****</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The internal or public port of the ApsaraDB RDS for MySQL instance.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The region where the ApsaraDB RDS for MySQL instance resides. Valid values: cn-qingdao, cn-beijing, and cn-hangzhou.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The name of the database table in the ApsaraDB RDS for MySQL instance.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>join_meta</p>
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            /**
             * <p>The username that is used to log on to the ApsaraDB RDS for MySQL instance.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the ApsaraDB RDS for MySQL instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1aevy8sofi8mh1q****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Parameter build() {
                return new Parameter(this);
            } 

        } 

    }
}
