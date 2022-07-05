// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ExternalStore} extends {@link TeaModel}
 *
 * <p>ExternalStore</p>
 */
public class ExternalStore extends TeaModel {
    @NameInMap("externalStoreName")
    @Validation(required = true)
    private String externalStoreName;

    @NameInMap("parameter")
    @Validation(required = true)
    private Parameter parameter;

    @NameInMap("storeType")
    @Validation(required = true)
    private String storeType;

    private ExternalStore(Builder builder) {
        this.externalStoreName = builder.externalStoreName;
        this.parameter = builder.parameter;
        this.storeType = builder.storeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExternalStore create() {
        return builder().build();
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

    public static final class Builder {
        private String externalStoreName; 
        private Parameter parameter; 
        private String storeType; 

        /**
         * 名称
         */
        public Builder externalStoreName(String externalStoreName) {
            this.externalStoreName = externalStoreName;
            return this;
        }

        /**
         * 参数
         */
        public Builder parameter(Parameter parameter) {
            this.parameter = parameter;
            return this;
        }

        /**
         * 类型
         */
        public Builder storeType(String storeType) {
            this.storeType = storeType;
            return this;
        }

        public ExternalStore build() {
            return new ExternalStore(this);
        } 

    } 

    public static class Parameter extends TeaModel {
        @NameInMap("db")
        private String db;

        @NameInMap("host")
        private String host;

        @NameInMap("instance-id")
        private String instanceId;

        @NameInMap("password")
        private String password;

        @NameInMap("port")
        private String port;

        @NameInMap("region")
        private String region;

        @NameInMap("table")
        private String table;

        @NameInMap("username")
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
             * meta
             */
            public Builder db(String db) {
                this.db = db;
                return this;
            }

            /**
             * 192.168.XX.XX
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
             * sfdsfldsfksfls****
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * 3306
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * cn-qingdao
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * join_meta
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            /**
             * root
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
