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
 * {@link CreateTenantRequest} extends {@link RequestModel}
 *
 * <p>CreateTenantRequest</p>
 */
public class CreateTenantRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Charset")
    @com.aliyun.core.annotation.Validation(required = true)
    private String charset;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cpu")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer cpu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateParams")
    private java.util.Map<String, String> createParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogDisk")
    private Long logDisk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Memory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer memory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrimaryZone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String primaryZone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReadOnlyZoneList")
    private String readOnlyZoneList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeZone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String timeZone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UnitNum")
    private Integer unitNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserVSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userVSwitchId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserVpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userVpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserVpcOwnerId")
    private String userVpcOwnerId;

    private CreateTenantRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.charset = builder.charset;
        this.cpu = builder.cpu;
        this.createParams = builder.createParams;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.logDisk = builder.logDisk;
        this.memory = builder.memory;
        this.primaryZone = builder.primaryZone;
        this.readOnlyZoneList = builder.readOnlyZoneList;
        this.tenantMode = builder.tenantMode;
        this.tenantName = builder.tenantName;
        this.timeZone = builder.timeZone;
        this.unitNum = builder.unitNum;
        this.userVSwitchId = builder.userVSwitchId;
        this.userVpcId = builder.userVpcId;
        this.userVpcOwnerId = builder.userVpcOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTenantRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return charset
     */
    public String getCharset() {
        return this.charset;
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return createParams
     */
    public java.util.Map<String, String> getCreateParams() {
        return this.createParams;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return logDisk
     */
    public Long getLogDisk() {
        return this.logDisk;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return primaryZone
     */
    public String getPrimaryZone() {
        return this.primaryZone;
    }

    /**
     * @return readOnlyZoneList
     */
    public String getReadOnlyZoneList() {
        return this.readOnlyZoneList;
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
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * @return unitNum
     */
    public Integer getUnitNum() {
        return this.unitNum;
    }

    /**
     * @return userVSwitchId
     */
    public String getUserVSwitchId() {
        return this.userVSwitchId;
    }

    /**
     * @return userVpcId
     */
    public String getUserVpcId() {
        return this.userVpcId;
    }

    /**
     * @return userVpcOwnerId
     */
    public String getUserVpcOwnerId() {
        return this.userVpcOwnerId;
    }

    public static final class Builder extends Request.Builder<CreateTenantRequest, Builder> {
        private String regionId; 
        private String charset; 
        private Integer cpu; 
        private java.util.Map<String, String> createParams; 
        private String description; 
        private String instanceId; 
        private Long logDisk; 
        private Integer memory; 
        private String primaryZone; 
        private String readOnlyZoneList; 
        private String tenantMode; 
        private String tenantName; 
        private String timeZone; 
        private Integer unitNum; 
        private String userVSwitchId; 
        private String userVpcId; 
        private String userVpcOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTenantRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.charset = request.charset;
            this.cpu = request.cpu;
            this.createParams = request.createParams;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.logDisk = request.logDisk;
            this.memory = request.memory;
            this.primaryZone = request.primaryZone;
            this.readOnlyZoneList = request.readOnlyZoneList;
            this.tenantMode = request.tenantMode;
            this.tenantName = request.tenantName;
            this.timeZone = request.timeZone;
            this.unitNum = request.unitNum;
            this.userVSwitchId = request.userVSwitchId;
            this.userVpcId = request.userVpcId;
            this.userVpcOwnerId = request.userVpcOwnerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The character set.<br>For more information, see <a href="https://www.alibabacloud.com/help/en/apsaradb-for-oceanbase/latest/api-oceanbasepro-2019-09-01-describecharset">DescribeCharset</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>utf8mb4</p>
         */
        public Builder charset(String charset) {
            this.putBodyParameter("Charset", charset);
            this.charset = charset;
            return this;
        }

        /**
         * <p>The number of CPU cores of the tenant.   </p>
         * <blockquote>
         * <p><br>The CPU specification of a single tenant cannot exceed that of the corresponding cluster. <br>For example, if the specification of the cluster is 14 CPU cores and 70 GB of memory, the CPU specification of the tenant cannot exceed 14 cores.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cpu(Integer cpu) {
            this.putBodyParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The initialization parameters.</p>
         */
        public Builder createParams(java.util.Map<String, String> createParams) {
            String createParamsShrink = shrink(createParams, "CreateParams", "json");
            this.putBodyParameter("CreateParams", createParamsShrink);
            this.createParams = createParams;
            return this;
        }

        /**
         * <p>The description of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test database</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the OceanBase cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ob317v4uif****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The size of the log disk allocated to the tenant, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder logDisk(Long logDisk) {
            this.putBodyParameter("LogDisk", logDisk);
            this.logDisk = logDisk;
            return this;
        }

        /**
         * <p>The memory size of the tenant, in GB.   </p>
         * <blockquote>
         * <p><br>The memory size of a single tenant cannot exceed that of the corresponding cluster. <br>For example, if the specification of the cluster is 14 CPU cores and 70 GB of memory, the memory size of the tenant cannot exceed 70 GB.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder memory(Integer memory) {
            this.putBodyParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * <p>The primary zone of the tenant.<br>It is one of the zones in which the cluster is deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder primaryZone(String primaryZone) {
            this.putBodyParameter("PrimaryZone", primaryZone);
            this.primaryZone = primaryZone;
            return this;
        }

        /**
         * <p>Specifies to create a read-only zone. Separate the names of multiple zones with commas (,).</p>
         * <blockquote>
         * <p>Notice: <br>At present, this parameter is unavailable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-g-ro,cn-shanghai-h-ro</p>
         */
        public Builder readOnlyZoneList(String readOnlyZoneList) {
            this.putBodyParameter("ReadOnlyZoneList", readOnlyZoneList);
            this.readOnlyZoneList = readOnlyZoneList;
            return this;
        }

        /**
         * <p>The tenant mode.<br>Valid values: Oracle and MySQL.<br>For more information, see <a href="https://www.alibabacloud.com/help/en/apsaradb-for-oceanbase/latest/api-oceanbasepro-2019-09-01-describeinstancetenantmodes">DescribeInstanceTenantModes</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Oracle</p>
         */
        public Builder tenantMode(String tenantMode) {
            this.putBodyParameter("TenantMode", tenantMode);
            this.tenantMode = tenantMode;
            return this;
        }

        /**
         * <p>The name of the tenant.<br>It must start with a letter or an underscore (<em>), and contain 2 to 20 characters, which can be uppercase letters, lowercase letters, digits, and underscores (</em>).  It cannot be set to sys.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pay_online</p>
         */
        public Builder tenantName(String tenantName) {
            this.putBodyParameter("TenantName", tenantName);
            this.tenantName = tenantName;
            return this;
        }

        /**
         * <p>The time zone of the tenant. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaradb-for-oceanbase/latest/api-oceanbasepro-2019-09-01-describetimezones">DescribeTimeZones</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        public Builder timeZone(String timeZone) {
            this.putBodyParameter("TimeZone", timeZone);
            this.timeZone = timeZone;
            return this;
        }

        /**
         * <p>The number of resource distribution nodes in the tenant.<br>The number is determined by the deployment mode of the cluster. If the cluster is deployed in 2-2-2 mode, the maximum number of resource distribution nodes is 2.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder unitNum(Integer unitNum) {
            this.putBodyParameter("UnitNum", unitNum);
            this.unitNum = unitNum;
            return this;
        }

        /**
         * <p>The ID of the vSwitch.<br>If no suitable vSwitch is available, create a vSwitch as prompted.<br>For more information, see Use a vSwitch.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp11k1aypnzu1l3whi****</p>
         */
        public Builder userVSwitchId(String userVSwitchId) {
            this.putBodyParameter("UserVSwitchId", userVSwitchId);
            this.userVSwitchId = userVSwitchId;
            return this;
        }

        /**
         * <p>The ID of the VPC.<br> If no suitable VPC is available, create a VPC as prompted.<br>For more information, see &quot;What is a VPC&quot;.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1d2q3mhg9i23ofi****</p>
         */
        public Builder userVpcId(String userVpcId) {
            this.putBodyParameter("UserVpcId", userVpcId);
            this.userVpcId = userVpcId;
            return this;
        }

        /**
         * <p>The ID of the VPC owner.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-********</p>
         */
        public Builder userVpcOwnerId(String userVpcOwnerId) {
            this.putBodyParameter("UserVpcOwnerId", userVpcOwnerId);
            this.userVpcOwnerId = userVpcOwnerId;
            return this;
        }

        @Override
        public CreateTenantRequest build() {
            return new CreateTenantRequest(this);
        } 

    } 

}
