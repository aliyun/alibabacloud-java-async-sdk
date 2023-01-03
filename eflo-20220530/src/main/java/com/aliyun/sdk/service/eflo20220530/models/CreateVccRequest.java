// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVccRequest} extends {@link RequestModel}
 *
 * <p>CreateVccRequest</p>
 */
public class CreateVccRequest extends Request {
    @Body
    @NameInMap("AccessCouldService")
    private Boolean accessCouldService;

    @Body
    @NameInMap("BgpCidr")
    private String bgpCidr;

    @Body
    @NameInMap("CenId")
    private String cenId;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Body
    @NameInMap("VccId")
    private String vccId;

    @Body
    @NameInMap("VpcId")
    private String vpcId;

    @Body
    @NameInMap("VpdId")
    private String vpdId;

    private CreateVccRequest(Builder builder) {
        super(builder);
        this.accessCouldService = builder.accessCouldService;
        this.bgpCidr = builder.bgpCidr;
        this.cenId = builder.cenId;
        this.description = builder.description;
        this.regionId = builder.regionId;
        this.vSwitchId = builder.vSwitchId;
        this.vccId = builder.vccId;
        this.vpcId = builder.vpcId;
        this.vpdId = builder.vpdId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVccRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessCouldService
     */
    public Boolean getAccessCouldService() {
        return this.accessCouldService;
    }

    /**
     * @return bgpCidr
     */
    public String getBgpCidr() {
        return this.bgpCidr;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vccId
     */
    public String getVccId() {
        return this.vccId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpdId
     */
    public String getVpdId() {
        return this.vpdId;
    }

    public static final class Builder extends Request.Builder<CreateVccRequest, Builder> {
        private Boolean accessCouldService; 
        private String bgpCidr; 
        private String cenId; 
        private String description; 
        private String regionId; 
        private String vSwitchId; 
        private String vccId; 
        private String vpcId; 
        private String vpdId; 

        private Builder() {
            super();
        } 

        private Builder(CreateVccRequest request) {
            super(request);
            this.accessCouldService = request.accessCouldService;
            this.bgpCidr = request.bgpCidr;
            this.cenId = request.cenId;
            this.description = request.description;
            this.regionId = request.regionId;
            this.vSwitchId = request.vSwitchId;
            this.vccId = request.vccId;
            this.vpcId = request.vpcId;
            this.vpdId = request.vpdId;
        } 

        /**
         * 启动访问云服务
         */
        public Builder accessCouldService(Boolean accessCouldService) {
            this.putBodyParameter("AccessCouldService", accessCouldService);
            this.accessCouldService = accessCouldService;
            return this;
        }

        /**
         * 互联网段，云上输入，云下默认
         */
        public Builder bgpCidr(String bgpCidr) {
            this.putBodyParameter("BgpCidr", bgpCidr);
            this.bgpCidr = bgpCidr;
            return this;
        }

        /**
         * CEN
         */
        public Builder cenId(String cenId) {
            this.putBodyParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * 描述
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 地域ID
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * vSwitchId
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putBodyParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * 入云专线ID
         */
        public Builder vccId(String vccId) {
            this.putBodyParameter("VccId", vccId);
            this.vccId = vccId;
            return this;
        }

        /**
         * 创建代理相关vpcId、vSwitchId
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * VPD
         */
        public Builder vpdId(String vpdId) {
            this.putBodyParameter("VpdId", vpdId);
            this.vpdId = vpdId;
            return this;
        }

        @Override
        public CreateVccRequest build() {
            return new CreateVccRequest(this);
        } 

    } 

}
