// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTenantsResponseBody</p>
 */
public class DescribeTenantsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tenants")
    private java.util.List < Tenants> tenants;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTenantsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tenants = builder.tenants;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTenantsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenants
     */
    public java.util.List < Tenants> getTenants() {
        return this.tenants;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Tenants> tenants; 
        private Integer totalCount; 

        /**
         * The ID of the tenant.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the OceanBase cluster.
         */
        public Builder tenants(java.util.List < Tenants> tenants) {
            this.tenants = tenants;
            return this;
        }

        /**
         * The total memory size of the tenant, in GB.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTenantsResponseBody build() {
            return new DescribeTenantsResponseBody(this);
        } 

    } 

    public static class Tenants extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Charset")
        private String charset;

        @com.aliyun.core.annotation.NameInMap("Collation")
        private String collation;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeployMode")
        private String deployMode;

        @com.aliyun.core.annotation.NameInMap("DeployType")
        private String deployType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnableReadOnlyReplica")
        private Boolean enableReadOnlyReplica;

        @com.aliyun.core.annotation.NameInMap("Mem")
        private Integer mem;

        @com.aliyun.core.annotation.NameInMap("PrimaryZone")
        private String primaryZone;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TenantMode")
        private String tenantMode;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("UnitCpu")
        private Integer unitCpu;

        @com.aliyun.core.annotation.NameInMap("UnitMem")
        private Integer unitMem;

        @com.aliyun.core.annotation.NameInMap("UnitNum")
        private Integer unitNum;

        @com.aliyun.core.annotation.NameInMap("UsedDiskSize")
        private Double usedDiskSize;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Tenants(Builder builder) {
            this.charset = builder.charset;
            this.collation = builder.collation;
            this.cpu = builder.cpu;
            this.createTime = builder.createTime;
            this.deployMode = builder.deployMode;
            this.deployType = builder.deployType;
            this.description = builder.description;
            this.enableReadOnlyReplica = builder.enableReadOnlyReplica;
            this.mem = builder.mem;
            this.primaryZone = builder.primaryZone;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.tenantMode = builder.tenantMode;
            this.tenantName = builder.tenantName;
            this.unitCpu = builder.unitCpu;
            this.unitMem = builder.unitMem;
            this.unitNum = builder.unitNum;
            this.usedDiskSize = builder.usedDiskSize;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tenants create() {
            return builder().build();
        }

        /**
         * @return charset
         */
        public String getCharset() {
            return this.charset;
        }

        /**
         * @return collation
         */
        public String getCollation() {
            return this.collation;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deployMode
         */
        public String getDeployMode() {
            return this.deployMode;
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enableReadOnlyReplica
         */
        public Boolean getEnableReadOnlyReplica() {
            return this.enableReadOnlyReplica;
        }

        /**
         * @return mem
         */
        public Integer getMem() {
            return this.mem;
        }

        /**
         * @return primaryZone
         */
        public String getPrimaryZone() {
            return this.primaryZone;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return tenantMode
         */
        public String getTenantMode() {
            return this.tenantMode;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return unitCpu
         */
        public Integer getUnitCpu() {
            return this.unitCpu;
        }

        /**
         * @return unitMem
         */
        public Integer getUnitMem() {
            return this.unitMem;
        }

        /**
         * @return unitNum
         */
        public Integer getUnitNum() {
            return this.unitNum;
        }

        /**
         * @return usedDiskSize
         */
        public Double getUsedDiskSize() {
            return this.usedDiskSize;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String charset; 
            private String collation; 
            private Integer cpu; 
            private String createTime; 
            private String deployMode; 
            private String deployType; 
            private String description; 
            private Boolean enableReadOnlyReplica; 
            private Integer mem; 
            private String primaryZone; 
            private String status; 
            private String tenantId; 
            private String tenantMode; 
            private String tenantName; 
            private Integer unitCpu; 
            private Integer unitMem; 
            private Integer unitNum; 
            private Double usedDiskSize; 
            private String vpcId; 

            /**
             * Charset.
             */
            public Builder charset(String charset) {
                this.charset = charset;
                return this;
            }

            /**
             * Collation.
             */
            public Builder collation(String collation) {
                this.collation = collation;
                return this;
            }

            /**
             * The total number of CPU cores of the tenant.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The number of CPU cores in each resource unit of the tenant.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The search keyword.
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * The name of the tenant.   
             * <p>
             * It must start with a letter or an underscore (_), and contain 2 to 20 characters, which can be uppercase letters, lowercase letters, digits, and underscores (_).  It cannot be set to sys.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * Example 1
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EnableReadOnlyReplica.
             */
            public Builder enableReadOnlyReplica(Boolean enableReadOnlyReplica) {
                this.enableReadOnlyReplica = enableReadOnlyReplica;
                return this;
            }

            /**
             * The number of the page to return.   
             * <p>
             * Start value: 1
             * - Default value: 1
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * The return result of the request.
             */
            public Builder primaryZone(String primaryZone) {
                this.primaryZone = primaryZone;
                return this;
            }

            /**
             * The status of the tenant.  <br>
             * <p>
             * - PENDING_CREATE: The tenant is being created.
             * - RESTORE: The tenant is being recovered.
             * - ONLINE: The tenant is running.
             * - SPEC_MODIFYING: The specification of the tenant is being modified.
             * ALLOCATING_INTERNET_ADDRESS: An Internet address is being allocated.
             * PENDING_OFFLINE_INTERNET_ADDRESS: The Internet address is being disabled.
             * - PRIMARY_ZONE_MODIFYING: The tenant is switching to a new primary zone.
             * - PARAMETER_MODIFYING: Parameters are being modified.
             * - WHITE_LIST_MODIFYING: The whitelist is being modified.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * You can call this operation to query the tenants in an OceanBase cluster.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * {
             * <p>
             *     "TotalCount": 1,
             *     "RequestId": "EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C",
             *     "Tenants": [
             *         {
             *             "VpcId": "vpc-bp1d2q3mhg9i23ofi****",
             *             "Status": "ONLINE",
             *             "PrimaryZone": "cn-hangzhou-i",
             *             "DeployType": "multiple",
             *             "DeployMode": "1-1-1",
             *             "CreateTime": "2021-09-17 15:52:17.0",
             *             "TenantName": "pay_online",
             *             "Mem": 20,
             *             "Cpu": 10,
             *             "Description": "PayCore business database",
             *             "TenantMode": "Oracle",
             *             "TenantId": "t33h8y08k****",
             *             "UnitCpu": 5,
             *             "UnitMem": 10,
             *             "UnitNum": 2,
             *             "UsedDiskSize": 10
             *         }
             *     ]
             * }
             */
            public Builder tenantMode(String tenantMode) {
                this.tenantMode = tenantMode;
                return this;
            }

            /**
             * The information of tenants.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * UnitCpu.
             */
            public Builder unitCpu(Integer unitCpu) {
                this.unitCpu = unitCpu;
                return this;
            }

            /**
             * UnitMem.
             */
            public Builder unitMem(Integer unitMem) {
                this.unitMem = unitMem;
                return this;
            }

            /**
             * UnitNum.
             */
            public Builder unitNum(Integer unitNum) {
                this.unitNum = unitNum;
                return this;
            }

            /**
             * UsedDiskSize.
             */
            public Builder usedDiskSize(Double usedDiskSize) {
                this.usedDiskSize = usedDiskSize;
                return this;
            }

            /**
             * The time when the tenant was created.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Tenants build() {
                return new Tenants(this);
            } 

        } 

    }
}
