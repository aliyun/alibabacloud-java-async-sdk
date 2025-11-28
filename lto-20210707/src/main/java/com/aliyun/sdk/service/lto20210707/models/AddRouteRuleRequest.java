// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link AddRouteRuleRequest} extends {@link RequestModel}
 *
 * <p>AddRouteRuleRequest</p>
 */
public class AddRouteRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizChainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizChainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChainUpMode")
    private String chainUpMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContractName")
    private String contractName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContractTemplateId")
    private String contractTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceGroupId")
    private String deviceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvokeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String invokeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivacyRuleId")
    private String privacyRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private AddRouteRuleRequest(Builder builder) {
        super(builder);
        this.bizChainId = builder.bizChainId;
        this.chainUpMode = builder.chainUpMode;
        this.contractName = builder.contractName;
        this.contractTemplateId = builder.contractTemplateId;
        this.deviceGroupId = builder.deviceGroupId;
        this.invokeType = builder.invokeType;
        this.privacyRuleId = builder.privacyRuleId;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddRouteRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizChainId
     */
    public String getBizChainId() {
        return this.bizChainId;
    }

    /**
     * @return chainUpMode
     */
    public String getChainUpMode() {
        return this.chainUpMode;
    }

    /**
     * @return contractName
     */
    public String getContractName() {
        return this.contractName;
    }

    /**
     * @return contractTemplateId
     */
    public String getContractTemplateId() {
        return this.contractTemplateId;
    }

    /**
     * @return deviceGroupId
     */
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    /**
     * @return invokeType
     */
    public String getInvokeType() {
        return this.invokeType;
    }

    /**
     * @return privacyRuleId
     */
    public String getPrivacyRuleId() {
        return this.privacyRuleId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<AddRouteRuleRequest, Builder> {
        private String bizChainId; 
        private String chainUpMode; 
        private String contractName; 
        private String contractTemplateId; 
        private String deviceGroupId; 
        private String invokeType; 
        private String privacyRuleId; 
        private String regionId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(AddRouteRuleRequest request) {
            super(request);
            this.bizChainId = request.bizChainId;
            this.chainUpMode = request.chainUpMode;
            this.contractName = request.contractName;
            this.contractTemplateId = request.contractTemplateId;
            this.deviceGroupId = request.deviceGroupId;
            this.invokeType = request.invokeType;
            this.privacyRuleId = request.privacyRuleId;
            this.regionId = request.regionId;
            this.remark = request.remark;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder bizChainId(String bizChainId) {
            this.putQueryParameter("BizChainId", bizChainId);
            this.bizChainId = bizChainId;
            return this;
        }

        /**
         * ChainUpMode.
         */
        public Builder chainUpMode(String chainUpMode) {
            this.putQueryParameter("ChainUpMode", chainUpMode);
            this.chainUpMode = chainUpMode;
            return this;
        }

        /**
         * ContractName.
         */
        public Builder contractName(String contractName) {
            this.putQueryParameter("ContractName", contractName);
            this.contractName = contractName;
            return this;
        }

        /**
         * ContractTemplateId.
         */
        public Builder contractTemplateId(String contractTemplateId) {
            this.putQueryParameter("ContractTemplateId", contractTemplateId);
            this.contractTemplateId = contractTemplateId;
            return this;
        }

        /**
         * DeviceGroupId.
         */
        public Builder deviceGroupId(String deviceGroupId) {
            this.putQueryParameter("DeviceGroupId", deviceGroupId);
            this.deviceGroupId = deviceGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder invokeType(String invokeType) {
            this.putQueryParameter("InvokeType", invokeType);
            this.invokeType = invokeType;
            return this;
        }

        /**
         * PrivacyRuleId.
         */
        public Builder privacyRuleId(String privacyRuleId) {
            this.putQueryParameter("PrivacyRuleId", privacyRuleId);
            this.privacyRuleId = privacyRuleId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public AddRouteRuleRequest build() {
            return new AddRouteRuleRequest(this);
        } 

    } 

}
