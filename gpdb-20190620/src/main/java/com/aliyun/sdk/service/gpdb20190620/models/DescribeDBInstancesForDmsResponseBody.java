// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20190620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstancesForDmsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancesForDmsResponseBody</p>
 */
public class DescribeDBInstancesForDmsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Count")
    private Long count;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeDBInstancesForDmsResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.httpStatusCode = builder.httpStatusCode;
        this.instances = builder.instances;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstancesForDmsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Long count; 
        private Integer httpStatusCode; 
        private java.util.List < Instances> instances; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDBInstancesForDmsResponseBody build() {
            return new DescribeDBInstancesForDmsResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("AliUid")
        private String aliUid;

        @NameInMap("Bid")
        private String bid;

        @NameInMap("ConnectionString")
        private String connectionString;

        @NameInMap("DbInstanceName")
        private String dbInstanceName;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("Description")
        private String description;

        @NameInMap("InstanceNetworkType")
        private String instanceNetworkType;

        @NameInMap("Port")
        private String port;

        @NameInMap("Region")
        private String region;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("Version")
        private String version;

        @NameInMap("VpcCloudInstanceId")
        private String vpcCloudInstanceId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcIp")
        private String vpcIp;

        private Instances(Builder builder) {
            this.aliUid = builder.aliUid;
            this.bid = builder.bid;
            this.connectionString = builder.connectionString;
            this.dbInstanceName = builder.dbInstanceName;
            this.dbType = builder.dbType;
            this.description = builder.description;
            this.instanceNetworkType = builder.instanceNetworkType;
            this.port = builder.port;
            this.region = builder.region;
            this.vSwitchId = builder.vSwitchId;
            this.version = builder.version;
            this.vpcCloudInstanceId = builder.vpcCloudInstanceId;
            this.vpcId = builder.vpcId;
            this.vpcIp = builder.vpcIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        /**
         * @return bid
         */
        public String getBid() {
            return this.bid;
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return dbInstanceName
         */
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceNetworkType
         */
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
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
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return vpcCloudInstanceId
         */
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcIp
         */
        public String getVpcIp() {
            return this.vpcIp;
        }

        public static final class Builder {
            private String aliUid; 
            private String bid; 
            private String connectionString; 
            private String dbInstanceName; 
            private String dbType; 
            private String description; 
            private String instanceNetworkType; 
            private String port; 
            private String region; 
            private String vSwitchId; 
            private String version; 
            private String vpcCloudInstanceId; 
            private String vpcId; 
            private String vpcIp; 

            /**
             * AliUid.
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * BID。
             */
            public Builder bid(String bid) {
                this.bid = bid;
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
             * DbInstanceName.
             */
            public Builder dbInstanceName(String dbInstanceName) {
                this.dbInstanceName = dbInstanceName;
                return this;
            }

            /**
             * DbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
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
             * InstanceNetworkType.
             */
            public Builder instanceNetworkType(String instanceNetworkType) {
                this.instanceNetworkType = instanceNetworkType;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
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
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * VpcCloudInstanceId.
             */
            public Builder vpcCloudInstanceId(String vpcCloudInstanceId) {
                this.vpcCloudInstanceId = vpcCloudInstanceId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcIp.
             */
            public Builder vpcIp(String vpcIp) {
                this.vpcIp = vpcIp;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
