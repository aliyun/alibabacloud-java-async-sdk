// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeCustomEndpointListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomEndpointListResponseBody</p>
 */
public class DescribeCustomEndpointListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCustomEndpointListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomEndpointListResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCustomEndpointListResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6352AC16-76BF-5135-B1EA-ED49293526E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCustomEndpointListResponseBody build() {
            return new DescribeCustomEndpointListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomEndpointListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomEndpointListResponseBody</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CnNames")
        private java.util.List<String> cnNames;

        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("CustomEndpointId")
        private String customEndpointId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeAutoEnter")
        private String nodeAutoEnter;

        @com.aliyun.core.annotation.NameInMap("NodeRole")
        private String nodeRole;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Endpoints(Builder builder) {
            this.cnNames = builder.cnNames;
            this.connectionString = builder.connectionString;
            this.customEndpointId = builder.customEndpointId;
            this.DBInstanceName = builder.DBInstanceName;
            this.name = builder.name;
            this.nodeAutoEnter = builder.nodeAutoEnter;
            this.nodeRole = builder.nodeRole;
            this.port = builder.port;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return cnNames
         */
        public java.util.List<String> getCnNames() {
            return this.cnNames;
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return customEndpointId
         */
        public String getCustomEndpointId() {
            return this.customEndpointId;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeAutoEnter
         */
        public String getNodeAutoEnter() {
            return this.nodeAutoEnter;
        }

        /**
         * @return nodeRole
         */
        public String getNodeRole() {
            return this.nodeRole;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.List<String> cnNames; 
            private String connectionString; 
            private String customEndpointId; 
            private String DBInstanceName; 
            private String name; 
            private String nodeAutoEnter; 
            private String nodeRole; 
            private Integer port; 
            private String status; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Endpoints model) {
                this.cnNames = model.cnNames;
                this.connectionString = model.connectionString;
                this.customEndpointId = model.customEndpointId;
                this.DBInstanceName = model.DBInstanceName;
                this.name = model.name;
                this.nodeAutoEnter = model.nodeAutoEnter;
                this.nodeRole = model.nodeRole;
                this.port = model.port;
                this.status = model.status;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>[&quot;pxc-i-vb1sqa7llp&quot;,&quot;pxc-i-bemprx50ad&quot;]</p>
             */
            public Builder cnNames(java.util.List<String> cnNames) {
                this.cnNames = cnNames;
                return this;
            }

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * CustomEndpointId.
             */
            public Builder customEndpointId(String customEndpointId) {
                this.customEndpointId = customEndpointId;
                return this;
            }

            /**
             * DBInstanceName.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
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
             * NodeAutoEnter.
             */
            public Builder nodeAutoEnter(String nodeAutoEnter) {
                this.nodeAutoEnter = nodeAutoEnter;
                return this;
            }

            /**
             * NodeRole.
             */
            public Builder nodeRole(String nodeRole) {
                this.nodeRole = nodeRole;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCustomEndpointListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomEndpointListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanDeleteCount")
        private Integer canDeleteCount;

        @com.aliyun.core.annotation.NameInMap("Endpoints")
        private java.util.List<Endpoints> endpoints;

        private Data(Builder builder) {
            this.canDeleteCount = builder.canDeleteCount;
            this.endpoints = builder.endpoints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return canDeleteCount
         */
        public Integer getCanDeleteCount() {
            return this.canDeleteCount;
        }

        /**
         * @return endpoints
         */
        public java.util.List<Endpoints> getEndpoints() {
            return this.endpoints;
        }

        public static final class Builder {
            private Integer canDeleteCount; 
            private java.util.List<Endpoints> endpoints; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.canDeleteCount = model.canDeleteCount;
                this.endpoints = model.endpoints;
            } 

            /**
             * CanDeleteCount.
             */
            public Builder canDeleteCount(Integer canDeleteCount) {
                this.canDeleteCount = canDeleteCount;
                return this;
            }

            /**
             * Endpoints.
             */
            public Builder endpoints(java.util.List<Endpoints> endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
