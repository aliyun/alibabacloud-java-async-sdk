// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTenantRequest} extends {@link RequestModel}
 *
 * <p>CreateTenantRequest</p>
 */
public class CreateTenantRequest extends Request {
    @Body
    @NameInMap("Charset")
    @Validation(required = true)
    private String charset;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("Cpu")
    @Validation(required = true)
    private Integer cpu;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Memory")
    @Validation(required = true)
    private Integer memory;

    @Body
    @NameInMap("PrimaryZone")
    private String primaryZone;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("TenantMode")
    @Validation(required = true)
    private String tenantMode;

    @Body
    @NameInMap("TenantName")
    @Validation(required = true)
    private String tenantName;

    @Body
    @NameInMap("TimeZone")
    @Validation(required = true)
    private String timeZone;

    @Body
    @NameInMap("UnitNum")
    private Integer unitNum;

    @Body
    @NameInMap("UserVSwitchId")
    private String userVSwitchId;

    @Body
    @NameInMap("UserVpcId")
    private String userVpcId;

    private CreateTenantRequest(Builder builder) {
        super(builder);
        this.charset = builder.charset;
        this.clientToken = builder.clientToken;
        this.cpu = builder.cpu;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.memory = builder.memory;
        this.primaryZone = builder.primaryZone;
        this.regionId = builder.regionId;
        this.tenantMode = builder.tenantMode;
        this.tenantName = builder.tenantName;
        this.timeZone = builder.timeZone;
        this.unitNum = builder.unitNum;
        this.userVSwitchId = builder.userVSwitchId;
        this.userVpcId = builder.userVpcId;
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
     * @return charset
     */
    public String getCharset() {
        return this.charset;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<CreateTenantRequest, Builder> {
        private String charset; 
        private String clientToken; 
        private Integer cpu; 
        private String description; 
        private String instanceId; 
        private Integer memory; 
        private String primaryZone; 
        private String regionId; 
        private String tenantMode; 
        private String tenantName; 
        private String timeZone; 
        private Integer unitNum; 
        private String userVSwitchId; 
        private String userVpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTenantRequest response) {
            super(response);
            this.charset = response.charset;
            this.clientToken = response.clientToken;
            this.cpu = response.cpu;
            this.description = response.description;
            this.instanceId = response.instanceId;
            this.memory = response.memory;
            this.primaryZone = response.primaryZone;
            this.regionId = response.regionId;
            this.tenantMode = response.tenantMode;
            this.tenantName = response.tenantName;
            this.timeZone = response.timeZone;
            this.unitNum = response.unitNum;
            this.userVSwitchId = response.userVSwitchId;
            this.userVpcId = response.userVpcId;
        } 

        /**
         * 字符集。 详细参见：DescribeCharset。
         */
        public Builder charset(String charset) {
            this.putBodyParameter("Charset", charset);
            this.charset = charset;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 租户的CPU大小，单位：核数（Cores）
         */
        public Builder cpu(Integer cpu) {
            this.putBodyParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * 数据库描述信息。
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Oceanbase集群ID。
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 租户内存大小，单位GB。
         */
        public Builder memory(Integer memory) {
            this.putBodyParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * 租户的主可用区。 其为集群部署可用区中的一个。
         */
        public Builder primaryZone(String primaryZone) {
            this.putBodyParameter("PrimaryZone", primaryZone);
            this.primaryZone = primaryZone;
            return this;
        }

        /**
         * 地域ID。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 租户模式。 当前支持Oracle模式（Oracle）、MySQL模式（MySQL） 详细参见：DescribeInstanceTenantModes。
         */
        public Builder tenantMode(String tenantMode) {
            this.putBodyParameter("TenantMode", tenantMode);
            this.tenantMode = tenantMode;
            return this;
        }

        /**
         * 租户名称。 长度为2~20 个字符，支持英文字母、数字和下划线，区分大小写，必须以字母或下划线开头。 不可设置为 sys。
         */
        public Builder tenantName(String tenantName) {
            this.putBodyParameter("TenantName", tenantName);
            this.tenantName = tenantName;
            return this;
        }

        /**
         * 租户所在时区。 详细参见：DescribeTimeZones。
         */
        public Builder timeZone(String timeZone) {
            this.putBodyParameter("TimeZone", timeZone);
            this.timeZone = timeZone;
            return this;
        }

        /**
         * 租户的资源分布节点数。 其与集群的部署模式相耦合，如集群模式为2-2-2，则最后分布节点数最多为2个。
         */
        public Builder unitNum(Integer unitNum) {
            this.putBodyParameter("UnitNum", unitNum);
            this.unitNum = unitNum;
            return this;
        }

        /**
         * 虚拟交换机（VSwitch） ID。 如果没有合适的 VSwitch，请根据页面提示创建一个，详情参见 使用交换机。
         */
        public Builder userVSwitchId(String userVSwitchId) {
            this.putBodyParameter("UserVSwitchId", userVSwitchId);
            this.userVSwitchId = userVSwitchId;
            return this;
        }

        /**
         * 专有网络（VPC） ID。 如果没有合适的 VPC，请根据页面提示创建一个 VPC，详情参见 什么是专有网络
         */
        public Builder userVpcId(String userVpcId) {
            this.putBodyParameter("UserVpcId", userVpcId);
            this.userVpcId = userVpcId;
            return this;
        }

        @Override
        public CreateTenantRequest build() {
            return new CreateTenantRequest(this);
        } 

    } 

}
