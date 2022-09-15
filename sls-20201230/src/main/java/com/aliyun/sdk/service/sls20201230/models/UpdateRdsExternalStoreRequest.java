// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateRdsExternalStoreRequest} extends {@link RequestModel}
 *
 * <p>UpdateRdsExternalStoreRequest</p>
 */
public class UpdateRdsExternalStoreRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @Body
    @NameInMap("externalStoreName")
    @Validation(required = true)
    private String externalStoreName;

    @Body
    @NameInMap("parameter")
    @Validation(required = true)
    private Parameter parameter;

    @Body
    @NameInMap("storeType")
    @Validation(required = true)
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
         * project 名称。
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * 外部存储名称。
         */
        public Builder externalStoreName(String externalStoreName) {
            this.putPathParameter("externalStoreName", externalStoreName);
            this.putBodyParameter("externalStoreName", externalStoreName);
            this.externalStoreName = externalStoreName;
            return this;
        }

        /**
         * 参数
         */
        public Builder parameter(Parameter parameter) {
            this.putBodyParameter("parameter", parameter);
            this.parameter = parameter;
            return this;
        }

        /**
         * 类型，这里固定为 rds-vpc
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

    public static class Parameter extends TeaModel {
        @NameInMap("db")
        @Validation(required = true)
        private String db;

        @NameInMap("host")
        private String host;

        @NameInMap("instance-id")
        private String instanceId;

        @NameInMap("password")
        @Validation(required = true)
        private String password;

        @NameInMap("port")
        @Validation(required = true)
        private String port;

        @NameInMap("region")
        @Validation(required = true)
        private String region;

        @NameInMap("table")
        @Validation(required = true)
        private String table;

        @NameInMap("username")
        @Validation(required = true)
        private String username;

        @NameInMap("vpc-id")
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
             * RDS MySQL实例的数据库名称。
             */
            public Builder db(String db) {
                this.db = db;
                return this;
            }

            /**
             * RDS MySQL实例的内网地址或外网地址。
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * RDS MySQL实例ID。
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * RDS MySQL实例中账号对应的密码。
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * RDS MySQL实例的内网或者外网端口。
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * RDS MySQL实例所在地域，目前仅支持cn-qingdao、cn-beijing、cn-hangzhou。
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * RDS MySQL实例的数据库表名称。
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            /**
             * RDS MySQL实例中的账号名称。
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * RDS MySQL实例所属的VPC ID。
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
