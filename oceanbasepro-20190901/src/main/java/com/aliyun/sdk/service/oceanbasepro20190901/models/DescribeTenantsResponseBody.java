// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTenantsResponseBody</p>
 */
public class DescribeTenantsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tenants")
    private java.util.List < Tenants> tenants;

    @NameInMap("TotalCount")
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
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 租户的列表信息。
         */
        public Builder tenants(java.util.List < Tenants> tenants) {
            this.tenants = tenants;
            return this;
        }

        /**
         * 查询到的指定Oceanbase集群的租户总数。
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
        @NameInMap("Charset")
        private String charset;

        @NameInMap("Collation")
        private String collation;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DeployMode")
        private String deployMode;

        @NameInMap("DeployType")
        private String deployType;

        @NameInMap("Description")
        private String description;

        @NameInMap("Mem")
        private Integer mem;

        @NameInMap("PrimaryZone")
        private String primaryZone;

        @NameInMap("Status")
        private String status;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("TenantMode")
        private String tenantMode;

        @NameInMap("TenantName")
        private String tenantName;

        @NameInMap("UnitCpu")
        private Integer unitCpu;

        @NameInMap("UnitMem")
        private Integer unitMem;

        @NameInMap("UnitNum")
        private Integer unitNum;

        @NameInMap("UsedDiskSize")
        private Double usedDiskSize;

        @NameInMap("VpcId")
        private String vpcId;

        private Tenants(Builder builder) {
            this.charset = builder.charset;
            this.collation = builder.collation;
            this.cpu = builder.cpu;
            this.createTime = builder.createTime;
            this.deployMode = builder.deployMode;
            this.deployType = builder.deployType;
            this.description = builder.description;
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
             * 字符集
             */
            public Builder charset(String charset) {
                this.charset = charset;
                return this;
            }

            /**
             * 字符序
             */
            public Builder collation(String collation) {
                this.collation = collation;
                return this;
            }

            /**
             * 租户总的CPU核数，单位：Core。
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * 租户的创建时间。
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 租户的数据副本模式。 对于高可用版本：三地域为N-N-N，两可用区和单可用区均为N-N； 对于基础版为N。 其中，N为单可用区内的节点数。
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * 租户的部署类型。 multiple：多机房 single：单机房 dual：双机房
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * 租户描述信息。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 租户总的内存大小，单位：GB。
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * 租户的主可用区。
             */
            public Builder primaryZone(String primaryZone) {
                this.primaryZone = primaryZone;
                return this;
            }

            /**
             * 租户的状态。 PENDING_CREATE: 创建中 RESTORE: 恢复中 ONLINE: 运行中 SPEC_MODIFYING: 规格修改中 ALLOCATING_INTERNET_ADDRESS: 公网地址分配中 PENDING_OFFLINE_INTERNET_ADDRESS: 公网地址关闭中 PRIMARY_ZONE_MODIFYING: 切主可用区中 PARAMETER_MODIFYING: 参数修改中 WHITE_LIST_MODIFING: 白名单修改中
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 租户ID。
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * 租户模式。 当前支持： Oracle：Oracle模式 MySQL: MySQL模式
             */
            public Builder tenantMode(String tenantMode) {
                this.tenantMode = tenantMode;
                return this;
            }

            /**
             * 租户名称。
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * 租户每个Unit的CPU核数，单位：Core。
             */
            public Builder unitCpu(Integer unitCpu) {
                this.unitCpu = unitCpu;
                return this;
            }

            /**
             * 租户每个Unit的内存大小，单位：GB。
             */
            public Builder unitMem(Integer unitMem) {
                this.unitMem = unitMem;
                return this;
            }

            /**
             * 租户的unit个数。
             */
            public Builder unitNum(Integer unitNum) {
                this.unitNum = unitNum;
                return this;
            }

            /**
             * 租户已使用磁盘量
             */
            public Builder usedDiskSize(Double usedDiskSize) {
                this.usedDiskSize = usedDiskSize;
                return this;
            }

            /**
             * 专有网络（VPC） ID。 如果没有合适的 VPC，请根据页面提示创建一个 VPC，详情参见 什么是专有网络
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
