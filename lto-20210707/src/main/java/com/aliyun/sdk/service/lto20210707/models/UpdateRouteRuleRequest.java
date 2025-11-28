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
 * {@link UpdateRouteRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateRouteRuleRequest</p>
 */
public class UpdateRouteRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizChainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizChainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContractName")
    private String contractName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContractTemplateId")
    private String contractTemplateId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeRuleId;

    private UpdateRouteRuleRequest(Builder builder) {
        super(builder);
        this.bizChainId = builder.bizChainId;
        this.contractName = builder.contractName;
        this.contractTemplateId = builder.contractTemplateId;
        this.invokeType = builder.invokeType;
        this.privacyRuleId = builder.privacyRuleId;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
        this.routeRuleId = builder.routeRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRouteRuleRequest create() {
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

    /**
     * @return routeRuleId
     */
    public String getRouteRuleId() {
        return this.routeRuleId;
    }

    public static final class Builder extends Request.Builder<UpdateRouteRuleRequest, Builder> {
        private String bizChainId; 
        private String contractName; 
        private String contractTemplateId; 
        private String invokeType; 
        private String privacyRuleId; 
        private String regionId; 
        private String remark; 
        private String routeRuleId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRouteRuleRequest request) {
            super(request);
            this.bizChainId = request.bizChainId;
            this.contractName = request.contractName;
            this.contractTemplateId = request.contractTemplateId;
            this.invokeType = request.invokeType;
            this.privacyRuleId = request.privacyRuleId;
            this.regionId = request.regionId;
            this.remark = request.remark;
            this.routeRuleId = request.routeRuleId;
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

        /**
         * <p>This parameter is required.</p>
         */
        public Builder routeRuleId(String routeRuleId) {
            this.putQueryParameter("RouteRuleId", routeRuleId);
            this.routeRuleId = routeRuleId;
            return this;
        }

        @Override
        public UpdateRouteRuleRequest build() {
            return new UpdateRouteRuleRequest(this);
        } 

    } 

}
