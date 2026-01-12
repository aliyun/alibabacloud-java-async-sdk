// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link DescribeInstanceEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceEndpointsResponseBody</p>
 */
public class DescribeInstanceEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceEndpoints")
    private java.util.List<DBInstanceEndpoints> DBInstanceEndpoints;

    @com.aliyun.core.annotation.NameInMap("InstanceEndpoints")
    private java.util.List<InstanceEndpoints> instanceEndpoints;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceEndpointsResponseBody(Builder builder) {
        this.DBInstanceEndpoints = builder.DBInstanceEndpoints;
        this.instanceEndpoints = builder.instanceEndpoints;
        this.instanceName = builder.instanceName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceEndpointsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceEndpoints
     */
    public java.util.List<DBInstanceEndpoints> getDBInstanceEndpoints() {
        return this.DBInstanceEndpoints;
    }

    /**
     * @return instanceEndpoints
     */
    public java.util.List<InstanceEndpoints> getInstanceEndpoints() {
        return this.instanceEndpoints;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DBInstanceEndpoints> DBInstanceEndpoints; 
        private java.util.List<InstanceEndpoints> instanceEndpoints; 
        private String instanceName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceEndpointsResponseBody model) {
            this.DBInstanceEndpoints = model.DBInstanceEndpoints;
            this.instanceEndpoints = model.instanceEndpoints;
            this.instanceName = model.instanceName;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the endpoints of the RDS instance.</p>
         */
        public Builder DBInstanceEndpoints(java.util.List<DBInstanceEndpoints> DBInstanceEndpoints) {
            this.DBInstanceEndpoints = DBInstanceEndpoints;
            return this;
        }

        /**
         * <p>The information about the endpoints of the RDS Supabase instance.</p>
         */
        public Builder instanceEndpoints(java.util.List<InstanceEndpoints> instanceEndpoints) {
            this.instanceEndpoints = instanceEndpoints;
            return this;
        }

        /**
         * <p>The ID of the RDS Supabase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ra-supabase-8moov5lxba****</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32DEFB4A-861F-5D1D-ADD5-918E4FD7AB8C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceEndpointsResponseBody build() {
            return new DescribeInstanceEndpointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceEndpointsResponseBody</p>
     */
    public static class DBInstanceEndpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("IpType")
        private String ipType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        private DBInstanceEndpoints(Builder builder) {
            this.connectionString = builder.connectionString;
            this.ipType = builder.ipType;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceEndpoints create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return ipType
         */
        public String getIpType() {
            return this.ipType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        public static final class Builder {
            private String connectionString; 
            private String ipType; 
            private String port; 

            private Builder() {
            } 

            private Builder(DBInstanceEndpoints model) {
                this.connectionString = model.connectionString;
                this.ipType = model.ipType;
                this.port = model.port;
            } 

            /**
             * <p>The endpoint of the RDS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pgm-xxxx.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The network type of the RDS instance. Valid values:</p>
             * <ul>
             * <li><strong>public</strong>: Internet</li>
             * <li><strong>vpc</strong>: VPC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder ipType(String ipType) {
                this.ipType = ipType;
                return this;
            }

            /**
             * <p>The port used to access the RDS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5432</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public DBInstanceEndpoints build() {
                return new DBInstanceEndpoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceEndpointsResponseBody</p>
     */
    public static class InstanceEndpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("IpType")
        private String ipType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        private InstanceEndpoints(Builder builder) {
            this.connectionString = builder.connectionString;
            this.ip = builder.ip;
            this.ipType = builder.ipType;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceEndpoints create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return ipType
         */
        public String getIpType() {
            return this.ipType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        public static final class Builder {
            private String connectionString; 
            private String ip; 
            private String ipType; 
            private String port; 

            private Builder() {
            } 

            private Builder(InstanceEndpoints model) {
                this.connectionString = model.connectionString;
                this.ip = model.ip;
                this.ipType = model.ipType;
                this.port = model.port;
            } 

            /**
             * <p>The endpoint of the RDS Supabase instance.</p>
             * 
             * <strong>example:</strong>
             * <p>8.152.XXX.XXX:8000</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The IP address used to access the RDS Supabase instance.</p>
             * 
             * <strong>example:</strong>
             * <p>8.152.XXX.XXX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The network type of the RDS Supabase instance. Valid values:</p>
             * <ul>
             * <li><strong>public</strong>: Internet</li>
             * <li><strong>vpc</strong>: VPC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>public</p>
             */
            public Builder ipType(String ipType) {
                this.ipType = ipType;
                return this;
            }

            /**
             * <p>The port used to access the RDS Supabase instance.</p>
             * 
             * <strong>example:</strong>
             * <p>8000</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public InstanceEndpoints build() {
                return new InstanceEndpoints(this);
            } 

        } 

    }
}
