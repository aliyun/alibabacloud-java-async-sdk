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
         * ???????????? ???????????????DescribeCharset???
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
         * ?????????CPU???????????????????????????Cores???
         */
        public Builder cpu(Integer cpu) {
            this.putBodyParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * ????????????????????????
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Oceanbase??????ID???
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ???????????????????????????GB???
         */
        public Builder memory(Integer memory) {
            this.putBodyParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * ???????????????????????? ??????????????????????????????????????????
         */
        public Builder primaryZone(String primaryZone) {
            this.putBodyParameter("PrimaryZone", primaryZone);
            this.primaryZone = primaryZone;
            return this;
        }

        /**
         * ??????ID???
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ??????????????? ????????????Oracle?????????Oracle??????MySQL?????????MySQL??? ???????????????DescribeInstanceTenantModes???
         */
        public Builder tenantMode(String tenantMode) {
            this.putBodyParameter("TenantMode", tenantMode);
            this.tenantMode = tenantMode;
            return this;
        }

        /**
         * ??????????????? ?????????2~20 ???????????????????????????????????????????????????????????????????????????????????????????????????????????? ??????????????? sys???
         */
        public Builder tenantName(String tenantName) {
            this.putBodyParameter("TenantName", tenantName);
            this.tenantName = tenantName;
            return this;
        }

        /**
         * ????????????????????? ???????????????DescribeTimeZones???
         */
        public Builder timeZone(String timeZone) {
            this.putBodyParameter("TimeZone", timeZone);
            this.timeZone = timeZone;
            return this;
        }

        /**
         * ????????????????????????????????? ?????????????????????????????????????????????????????????2-2-2????????????????????????????????????2??????
         */
        public Builder unitNum(Integer unitNum) {
            this.putBodyParameter("UnitNum", unitNum);
            this.unitNum = unitNum;
            return this;
        }

        /**
         * ??????????????????VSwitch??? ID??? ????????????????????? VSwitch??????????????????????????????????????????????????? ??????????????????
         */
        public Builder userVSwitchId(String userVSwitchId) {
            this.putBodyParameter("UserVSwitchId", userVSwitchId);
            this.userVSwitchId = userVSwitchId;
            return this;
        }

        /**
         * ???????????????VPC??? ID??? ????????????????????? VPC???????????????????????????????????? VPC??????????????? ?????????????????????
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
