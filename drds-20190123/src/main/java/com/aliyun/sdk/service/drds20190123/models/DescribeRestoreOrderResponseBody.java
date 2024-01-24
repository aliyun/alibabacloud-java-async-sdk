// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreOrderResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRestoreOrderResponseBody</p>
 */
public class DescribeRestoreOrderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RestoreOrderDO")
    private RestoreOrderDO restoreOrderDO;

    @NameInMap("Success")
    private Boolean success;

    private DescribeRestoreOrderResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.restoreOrderDO = builder.restoreOrderDO;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestoreOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return restoreOrderDO
     */
    public RestoreOrderDO getRestoreOrderDO() {
        return this.restoreOrderDO;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private RestoreOrderDO restoreOrderDO; 
        private Boolean success; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned data object.
         */
        public Builder restoreOrderDO(RestoreOrderDO restoreOrderDO) {
            this.restoreOrderDO = restoreOrderDO;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeRestoreOrderResponseBody build() {
            return new DescribeRestoreOrderResponseBody(this);
        } 

    } 

    public static class DrdsOrderDOList extends TeaModel {
        @NameInMap("AzoneId")
        private String azoneId;

        @NameInMap("InstSpec")
        private String instSpec;

        @NameInMap("Network")
        private String network;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("VSwtichId")
        private String vSwtichId;

        @NameInMap("VpcId")
        private String vpcId;

        private DrdsOrderDOList(Builder builder) {
            this.azoneId = builder.azoneId;
            this.instSpec = builder.instSpec;
            this.network = builder.network;
            this.regionId = builder.regionId;
            this.vSwtichId = builder.vSwtichId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DrdsOrderDOList create() {
            return builder().build();
        }

        /**
         * @return azoneId
         */
        public String getAzoneId() {
            return this.azoneId;
        }

        /**
         * @return instSpec
         */
        public String getInstSpec() {
            return this.instSpec;
        }

        /**
         * @return network
         */
        public String getNetwork() {
            return this.network;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vSwtichId
         */
        public String getVSwtichId() {
            return this.vSwtichId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String azoneId; 
            private String instSpec; 
            private String network; 
            private String regionId; 
            private String vSwtichId; 
            private String vpcId; 

            /**
             * The ID of the zone for which to query resources.
             */
            public Builder azoneId(String azoneId) {
                this.azoneId = azoneId;
                return this;
            }

            /**
             * The instance type of the instance.
             */
            public Builder instSpec(String instSpec) {
                this.instSpec = instSpec;
                return this;
            }

            /**
             * The network type. Valid values:
             * <p>
             * 
             * *   **Classic **: Classic Network
             * *   **vpc**: VPC
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * The region ID of the instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the vSwitch in the VPC.
             */
            public Builder vSwtichId(String vSwtichId) {
                this.vSwtichId = vSwtichId;
                return this;
            }

            /**
             * The ID of the VPC network.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public DrdsOrderDOList build() {
                return new DrdsOrderDOList(this);
            } 

        } 

    }
    public static class RestoreOrderDODrdsOrderDOList extends TeaModel {
        @NameInMap("DrdsOrderDOList")
        private java.util.List < DrdsOrderDOList> drdsOrderDOList;

        private RestoreOrderDODrdsOrderDOList(Builder builder) {
            this.drdsOrderDOList = builder.drdsOrderDOList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreOrderDODrdsOrderDOList create() {
            return builder().build();
        }

        /**
         * @return drdsOrderDOList
         */
        public java.util.List < DrdsOrderDOList> getDrdsOrderDOList() {
            return this.drdsOrderDOList;
        }

        public static final class Builder {
            private java.util.List < DrdsOrderDOList> drdsOrderDOList; 

            /**
             * DrdsOrderDOList.
             */
            public Builder drdsOrderDOList(java.util.List < DrdsOrderDOList> drdsOrderDOList) {
                this.drdsOrderDOList = drdsOrderDOList;
                return this;
            }

            public RestoreOrderDODrdsOrderDOList build() {
                return new RestoreOrderDODrdsOrderDOList(this);
            } 

        } 

    }
    public static class PolarOrderDOList extends TeaModel {
        @NameInMap("AzoneId")
        private String azoneId;

        @NameInMap("DbInstanceStorage")
        private String dbInstanceStorage;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("Network")
        private String network;

        @NameInMap("Num")
        private Long num;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Version")
        private String version;

        private PolarOrderDOList(Builder builder) {
            this.azoneId = builder.azoneId;
            this.dbInstanceStorage = builder.dbInstanceStorage;
            this.engine = builder.engine;
            this.instanceClass = builder.instanceClass;
            this.network = builder.network;
            this.num = builder.num;
            this.regionId = builder.regionId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolarOrderDOList create() {
            return builder().build();
        }

        /**
         * @return azoneId
         */
        public String getAzoneId() {
            return this.azoneId;
        }

        /**
         * @return dbInstanceStorage
         */
        public String getDbInstanceStorage() {
            return this.dbInstanceStorage;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return network
         */
        public String getNetwork() {
            return this.network;
        }

        /**
         * @return num
         */
        public Long getNum() {
            return this.num;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String azoneId; 
            private String dbInstanceStorage; 
            private String engine; 
            private String instanceClass; 
            private String network; 
            private Long num; 
            private String regionId; 
            private String version; 

            /**
             * The zone ID of the node.
             */
            public Builder azoneId(String azoneId) {
                this.azoneId = azoneId;
                return this;
            }

            /**
             * The capacity of disk.
             */
            public Builder dbInstanceStorage(String dbInstanceStorage) {
                this.dbInstanceStorage = dbInstanceStorage;
                return this;
            }

            /**
             * The storage engine of PolarDB.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The type of the instance.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * The network type. Valid values:
             * <p>
             * 
             * *   **Classic**: Classic Network
             * *   **vpc**: VPC
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * The number of streams that were returned.
             */
            public Builder num(Long num) {
                this.num = num;
                return this;
            }

            /**
             * The region ID of the instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The version of the operating system.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public PolarOrderDOList build() {
                return new PolarOrderDOList(this);
            } 

        } 

    }
    public static class RestoreOrderDOPolarOrderDOList extends TeaModel {
        @NameInMap("PolarOrderDOList")
        private java.util.List < PolarOrderDOList> polarOrderDOList;

        private RestoreOrderDOPolarOrderDOList(Builder builder) {
            this.polarOrderDOList = builder.polarOrderDOList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreOrderDOPolarOrderDOList create() {
            return builder().build();
        }

        /**
         * @return polarOrderDOList
         */
        public java.util.List < PolarOrderDOList> getPolarOrderDOList() {
            return this.polarOrderDOList;
        }

        public static final class Builder {
            private java.util.List < PolarOrderDOList> polarOrderDOList; 

            /**
             * PolarOrderDOList.
             */
            public Builder polarOrderDOList(java.util.List < PolarOrderDOList> polarOrderDOList) {
                this.polarOrderDOList = polarOrderDOList;
                return this;
            }

            public RestoreOrderDOPolarOrderDOList build() {
                return new RestoreOrderDOPolarOrderDOList(this);
            } 

        } 

    }
    public static class RdsOrderDOList extends TeaModel {
        @NameInMap("AzoneId")
        private String azoneId;

        @NameInMap("DbInstanceStorage")
        private String dbInstanceStorage;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("Network")
        private String network;

        @NameInMap("Num")
        private Long num;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Version")
        private String version;

        private RdsOrderDOList(Builder builder) {
            this.azoneId = builder.azoneId;
            this.dbInstanceStorage = builder.dbInstanceStorage;
            this.engine = builder.engine;
            this.instanceClass = builder.instanceClass;
            this.network = builder.network;
            this.num = builder.num;
            this.regionId = builder.regionId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RdsOrderDOList create() {
            return builder().build();
        }

        /**
         * @return azoneId
         */
        public String getAzoneId() {
            return this.azoneId;
        }

        /**
         * @return dbInstanceStorage
         */
        public String getDbInstanceStorage() {
            return this.dbInstanceStorage;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return network
         */
        public String getNetwork() {
            return this.network;
        }

        /**
         * @return num
         */
        public Long getNum() {
            return this.num;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String azoneId; 
            private String dbInstanceStorage; 
            private String engine; 
            private String instanceClass; 
            private String network; 
            private Long num; 
            private String regionId; 
            private String version; 

            /**
             * The zone ID of the node.
             */
            public Builder azoneId(String azoneId) {
                this.azoneId = azoneId;
                return this;
            }

            /**
             * The capacity of disk.
             */
            public Builder dbInstanceStorage(String dbInstanceStorage) {
                this.dbInstanceStorage = dbInstanceStorage;
                return this;
            }

            /**
             * The storage engine of the instance.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The instance type of the instance.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * The network type. Valid values: - **Classic **: Classic Network
             * <p>
             * - **vpc**: VPC
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * The number of streams that were returned.
             */
            public Builder num(Long num) {
                this.num = num;
                return this;
            }

            /**
             * The region ID of the instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The version of the operating system.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public RdsOrderDOList build() {
                return new RdsOrderDOList(this);
            } 

        } 

    }
    public static class RestoreOrderDORdsOrderDOList extends TeaModel {
        @NameInMap("RdsOrderDOList")
        private java.util.List < RdsOrderDOList> rdsOrderDOList;

        private RestoreOrderDORdsOrderDOList(Builder builder) {
            this.rdsOrderDOList = builder.rdsOrderDOList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreOrderDORdsOrderDOList create() {
            return builder().build();
        }

        /**
         * @return rdsOrderDOList
         */
        public java.util.List < RdsOrderDOList> getRdsOrderDOList() {
            return this.rdsOrderDOList;
        }

        public static final class Builder {
            private java.util.List < RdsOrderDOList> rdsOrderDOList; 

            /**
             * RdsOrderDOList.
             */
            public Builder rdsOrderDOList(java.util.List < RdsOrderDOList> rdsOrderDOList) {
                this.rdsOrderDOList = rdsOrderDOList;
                return this;
            }

            public RestoreOrderDORdsOrderDOList build() {
                return new RestoreOrderDORdsOrderDOList(this);
            } 

        } 

    }
    public static class RestoreOrderDO extends TeaModel {
        @NameInMap("DrdsOrderDOList")
        private RestoreOrderDODrdsOrderDOList drdsOrderDOList;

        @NameInMap("PolarOrderDOList")
        private RestoreOrderDOPolarOrderDOList polarOrderDOList;

        @NameInMap("RdsOrderDOList")
        private RestoreOrderDORdsOrderDOList rdsOrderDOList;

        private RestoreOrderDO(Builder builder) {
            this.drdsOrderDOList = builder.drdsOrderDOList;
            this.polarOrderDOList = builder.polarOrderDOList;
            this.rdsOrderDOList = builder.rdsOrderDOList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreOrderDO create() {
            return builder().build();
        }

        /**
         * @return drdsOrderDOList
         */
        public RestoreOrderDODrdsOrderDOList getDrdsOrderDOList() {
            return this.drdsOrderDOList;
        }

        /**
         * @return polarOrderDOList
         */
        public RestoreOrderDOPolarOrderDOList getPolarOrderDOList() {
            return this.polarOrderDOList;
        }

        /**
         * @return rdsOrderDOList
         */
        public RestoreOrderDORdsOrderDOList getRdsOrderDOList() {
            return this.rdsOrderDOList;
        }

        public static final class Builder {
            private RestoreOrderDODrdsOrderDOList drdsOrderDOList; 
            private RestoreOrderDOPolarOrderDOList polarOrderDOList; 
            private RestoreOrderDORdsOrderDOList rdsOrderDOList; 

            /**
             * The information of the restored order.
             */
            public Builder drdsOrderDOList(RestoreOrderDODrdsOrderDOList drdsOrderDOList) {
                this.drdsOrderDOList = drdsOrderDOList;
                return this;
            }

            /**
             * The ID of the restored apsaradb for PolarDB cluster.
             */
            public Builder polarOrderDOList(RestoreOrderDOPolarOrderDOList polarOrderDOList) {
                this.polarOrderDOList = polarOrderDOList;
                return this;
            }

            /**
             * The information of the restored RDS order.
             */
            public Builder rdsOrderDOList(RestoreOrderDORdsOrderDOList rdsOrderDOList) {
                this.rdsOrderDOList = rdsOrderDOList;
                return this;
            }

            public RestoreOrderDO build() {
                return new RestoreOrderDO(this);
            } 

        } 

    }
}
