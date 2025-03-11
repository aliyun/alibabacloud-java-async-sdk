// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeRestoreOrderResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRestoreOrderResponseBody</p>
 */
public class DescribeRestoreOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RestoreOrderDO")
    private RestoreOrderDO restoreOrderDO;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0AD2DE5D-B86B-40B5-9678-487D37******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned data object.</p>
         */
        public Builder restoreOrderDO(RestoreOrderDO restoreOrderDO) {
            this.restoreOrderDO = restoreOrderDO;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeRestoreOrderResponseBody build() {
            return new DescribeRestoreOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRestoreOrderResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestoreOrderResponseBody</p>
     */
    public static class DrdsOrderDOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AzoneId")
        private String azoneId;

        @com.aliyun.core.annotation.NameInMap("InstSpec")
        private String instSpec;

        @com.aliyun.core.annotation.NameInMap("Network")
        private String network;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VSwtichId")
        private String vSwtichId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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
             * <p>The ID of the zone for which to query resources.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-e</p>
             */
            public Builder azoneId(String azoneId) {
                this.azoneId = azoneId;
                return this;
            }

            /**
             * <p>The instance type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>4C8G * 2</p>
             */
            public Builder instSpec(String instSpec) {
                this.instSpec = instSpec;
                return this;
            }

            /**
             * <p>The network type. Valid values:</p>
             * <ul>
             * <li>**Classic **: Classic Network</li>
             * <li><strong>vpc</strong>: VPC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch in the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-*******************</p>
             */
            public Builder vSwtichId(String vSwtichId) {
                this.vSwtichId = vSwtichId;
                return this;
            }

            /**
             * <p>The ID of the VPC network.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-*******************</p>
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
    /**
     * 
     * {@link DescribeRestoreOrderResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestoreOrderResponseBody</p>
     */
    public static class RestoreOrderDODrdsOrderDOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DrdsOrderDOList")
        private java.util.List<DrdsOrderDOList> drdsOrderDOList;

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
        public java.util.List<DrdsOrderDOList> getDrdsOrderDOList() {
            return this.drdsOrderDOList;
        }

        public static final class Builder {
            private java.util.List<DrdsOrderDOList> drdsOrderDOList; 

            /**
             * DrdsOrderDOList.
             */
            public Builder drdsOrderDOList(java.util.List<DrdsOrderDOList> drdsOrderDOList) {
                this.drdsOrderDOList = drdsOrderDOList;
                return this;
            }

            public RestoreOrderDODrdsOrderDOList build() {
                return new RestoreOrderDODrdsOrderDOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRestoreOrderResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestoreOrderResponseBody</p>
     */
    public static class PolarOrderDOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AzoneId")
        private String azoneId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceStorage")
        private String dbInstanceStorage;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("Network")
        private String network;

        @com.aliyun.core.annotation.NameInMap("Num")
        private Long num;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Version")
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
             * <p>The zone ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-g</p>
             */
            public Builder azoneId(String azoneId) {
                this.azoneId = azoneId;
                return this;
            }

            /**
             * <p>The capacity of disk.</p>
             * 
             * <strong>example:</strong>
             * <p>10240</p>
             */
            public Builder dbInstanceStorage(String dbInstanceStorage) {
                this.dbInstanceStorage = dbInstanceStorage;
                return this;
            }

            /**
             * <p>The storage engine of PolarDB.</p>
             * 
             * <strong>example:</strong>
             * <p>POLARDB</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>polar.mysql.x4.large</p>
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * <p>The network type. Valid values:</p>
             * <ul>
             * <li><strong>Classic</strong>: Classic Network</li>
             * <li><strong>vpc</strong>: VPC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The number of streams that were returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder num(Long num) {
                this.num = num;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The version of the operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>5.6</p>
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
    /**
     * 
     * {@link DescribeRestoreOrderResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestoreOrderResponseBody</p>
     */
    public static class RestoreOrderDOPolarOrderDOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolarOrderDOList")
        private java.util.List<PolarOrderDOList> polarOrderDOList;

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
        public java.util.List<PolarOrderDOList> getPolarOrderDOList() {
            return this.polarOrderDOList;
        }

        public static final class Builder {
            private java.util.List<PolarOrderDOList> polarOrderDOList; 

            /**
             * PolarOrderDOList.
             */
            public Builder polarOrderDOList(java.util.List<PolarOrderDOList> polarOrderDOList) {
                this.polarOrderDOList = polarOrderDOList;
                return this;
            }

            public RestoreOrderDOPolarOrderDOList build() {
                return new RestoreOrderDOPolarOrderDOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRestoreOrderResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestoreOrderResponseBody</p>
     */
    public static class RdsOrderDOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AzoneId")
        private String azoneId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceStorage")
        private String dbInstanceStorage;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("Network")
        private String network;

        @com.aliyun.core.annotation.NameInMap("Num")
        private Long num;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Version")
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
             * <p>The zone ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-g</p>
             */
            public Builder azoneId(String azoneId) {
                this.azoneId = azoneId;
                return this;
            }

            /**
             * <p>The capacity of disk.</p>
             * 
             * <strong>example:</strong>
             * <p>10240</p>
             */
            public Builder dbInstanceStorage(String dbInstanceStorage) {
                this.dbInstanceStorage = dbInstanceStorage;
                return this;
            }

            /**
             * <p>The storage engine of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MYSQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The instance type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rds.mysql.s2.large</p>
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * <p>The network type. Valid values: - **Classic **: Classic Network</p>
             * <ul>
             * <li><strong>vpc</strong>: VPC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The number of streams that were returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder num(Long num) {
                this.num = num;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The version of the operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>5.6</p>
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
    /**
     * 
     * {@link DescribeRestoreOrderResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestoreOrderResponseBody</p>
     */
    public static class RestoreOrderDORdsOrderDOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RdsOrderDOList")
        private java.util.List<RdsOrderDOList> rdsOrderDOList;

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
        public java.util.List<RdsOrderDOList> getRdsOrderDOList() {
            return this.rdsOrderDOList;
        }

        public static final class Builder {
            private java.util.List<RdsOrderDOList> rdsOrderDOList; 

            /**
             * RdsOrderDOList.
             */
            public Builder rdsOrderDOList(java.util.List<RdsOrderDOList> rdsOrderDOList) {
                this.rdsOrderDOList = rdsOrderDOList;
                return this;
            }

            public RestoreOrderDORdsOrderDOList build() {
                return new RestoreOrderDORdsOrderDOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRestoreOrderResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestoreOrderResponseBody</p>
     */
    public static class RestoreOrderDO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DrdsOrderDOList")
        private RestoreOrderDODrdsOrderDOList drdsOrderDOList;

        @com.aliyun.core.annotation.NameInMap("PolarOrderDOList")
        private RestoreOrderDOPolarOrderDOList polarOrderDOList;

        @com.aliyun.core.annotation.NameInMap("RdsOrderDOList")
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
             * <p>The information of the restored order.</p>
             */
            public Builder drdsOrderDOList(RestoreOrderDODrdsOrderDOList drdsOrderDOList) {
                this.drdsOrderDOList = drdsOrderDOList;
                return this;
            }

            /**
             * <p>The ID of the restored apsaradb for PolarDB cluster.</p>
             */
            public Builder polarOrderDOList(RestoreOrderDOPolarOrderDOList polarOrderDOList) {
                this.polarOrderDOList = polarOrderDOList;
                return this;
            }

            /**
             * <p>The information of the restored RDS order.</p>
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
