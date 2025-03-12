// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeTenantsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTenantsResponseBody</p>
 */
public class DescribeTenantsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tenants")
    private java.util.List<Tenants> tenants;

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
    public java.util.List<Tenants> getTenants() {
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
        private java.util.List<Tenants> tenants; 
        private Integer totalCount; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information of tenants.</p>
         */
        public Builder tenants(java.util.List<Tenants> tenants) {
            this.tenants = tenants;
            return this;
        }

        /**
         * <p>The total number of tenants in the specified OceanBase cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTenantsResponseBody build() {
            return new DescribeTenantsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTenantsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTenantsResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("ParameterTemplate")
        private String parameterTemplate;

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
            this.parameterTemplate = builder.parameterTemplate;
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
         * @return parameterTemplate
         */
        public String getParameterTemplate() {
            return this.parameterTemplate;
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
            private String parameterTemplate; 
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
             * <p>The character set.</p>
             * 
             * <strong>example:</strong>
             * <p>utf8mb4</p>
             */
            public Builder charset(String charset) {
                this.charset = charset;
                return this;
            }

            /**
             * <p>The collation.</p>
             * 
             * <strong>example:</strong>
             * <p>utf8mb4_general_ci</p>
             */
            public Builder collation(String collation) {
                this.collation = collation;
                return this;
            }

            /**
             * <p>The total number of CPU cores of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The time when the tenant was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-17 15:52:17.0</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The data replica distribution mode of the tenant.   </p>
             * <ul>
             * <li>For the high availability version, N-N-N indicates the three-zone mode, and N-N indicates the dual-zone or single-zone mode.</li>
             * <li>For the basic version, N indicates the single-zone mode.</li>
             * </ul>
             * <blockquote>
             * <p><br>N represents the number of nodes in a single zone.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1-1-1</p>
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * <p>The deployment type of the tenant. <br></p>
             * <ul>
             * <li>multiple: multi-IDC deployment</li>
             * <li>single: single-IDC deployment</li>
             * <li>dual: dual-IDC deployment</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>multiple</p>
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * <p>The description of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>PayCore business database</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether read-only replicas are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableReadOnlyReplica(Boolean enableReadOnlyReplica) {
                this.enableReadOnlyReplica = enableReadOnlyReplica;
                return this;
            }

            /**
             * <p>The total memory size of the tenant, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * <p>The parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>express_oltp</p>
             */
            public Builder parameterTemplate(String parameterTemplate) {
                this.parameterTemplate = parameterTemplate;
                return this;
            }

            /**
             * <p>The primary zone of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
             */
            public Builder primaryZone(String primaryZone) {
                this.primaryZone = primaryZone;
                return this;
            }

            /**
             * <p>The status of the tenant.  <br></p>
             * <ul>
             * <li>PENDING_CREATE: The tenant is being created.</li>
             * <li>RESTORE: The tenant is being recovered.</li>
             * <li>ONLINE: The tenant is running.</li>
             * <li>SPEC_MODIFYING: The specification of the tenant is being modified.
             * ALLOCATING_INTERNET_ADDRESS: An Internet address is being allocated.
             * PENDING_OFFLINE_INTERNET_ADDRESS: The Internet address is being disabled.</li>
             * <li>PRIMARY_ZONE_MODIFYING: The tenant is switching to a new primary zone.</li>
             * <li>PARAMETER_MODIFYING: Parameters are being modified.</li>
             * <li>WHITE_LIST_MODIFYING: The whitelist is being modified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>t33h8y08k****</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The tenant mode.<br>Valid values:<br>Oracle
             * MySQL</p>
             * 
             * <strong>example:</strong>
             * <p>Oracle</p>
             */
            public Builder tenantMode(String tenantMode) {
                this.tenantMode = tenantMode;
                return this;
            }

            /**
             * <p>The name of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>pay_online</p>
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * <p>The number of CPU cores in each resource unit of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder unitCpu(Integer unitCpu) {
                this.unitCpu = unitCpu;
                return this;
            }

            /**
             * <p>The memory size of each resource unit of the tenant, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder unitMem(Integer unitMem) {
                this.unitMem = unitMem;
                return this;
            }

            /**
             * <p>The number of resource units in the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder unitNum(Integer unitNum) {
                this.unitNum = unitNum;
                return this;
            }

            /**
             * <p>The number of used disks of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder usedDiskSize(Double usedDiskSize) {
                this.usedDiskSize = usedDiskSize;
                return this;
            }

            /**
             * <p>The ID of the VPC.   <br>If no suitable VPC is available, create a VPC as prompted. For more information, see &quot;What is a VPC&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1d2q3mhg9i23ofi****</p>
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
