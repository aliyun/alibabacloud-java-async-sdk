// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link ModifyInstanceRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceRequest</p>
 */
public class ModifyInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressType")
    private String addressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private String bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseBandwidth")
    private String baseBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainCount")
    private String domainCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EditionSale")
    private String editionSale;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionVersion")
    private String functionVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modifyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NormalBandwidth")
    private String normalBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NormalQps")
    private String normalQps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortCount")
    private String portCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductPlan")
    private String productPlan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceBandwidth")
    private String serviceBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServicePartner")
    private String servicePartner;

    private ModifyInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.addressType = builder.addressType;
        this.bandwidth = builder.bandwidth;
        this.baseBandwidth = builder.baseBandwidth;
        this.domainCount = builder.domainCount;
        this.editionSale = builder.editionSale;
        this.functionVersion = builder.functionVersion;
        this.instanceId = builder.instanceId;
        this.modifyType = builder.modifyType;
        this.normalBandwidth = builder.normalBandwidth;
        this.normalQps = builder.normalQps;
        this.portCount = builder.portCount;
        this.productPlan = builder.productPlan;
        this.productType = builder.productType;
        this.serviceBandwidth = builder.serviceBandwidth;
        this.servicePartner = builder.servicePartner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceRequest create() {
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
     * @return addressType
     */
    public String getAddressType() {
        return this.addressType;
    }

    /**
     * @return bandwidth
     */
    public String getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return baseBandwidth
     */
    public String getBaseBandwidth() {
        return this.baseBandwidth;
    }

    /**
     * @return domainCount
     */
    public String getDomainCount() {
        return this.domainCount;
    }

    /**
     * @return editionSale
     */
    public String getEditionSale() {
        return this.editionSale;
    }

    /**
     * @return functionVersion
     */
    public String getFunctionVersion() {
        return this.functionVersion;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    /**
     * @return normalBandwidth
     */
    public String getNormalBandwidth() {
        return this.normalBandwidth;
    }

    /**
     * @return normalQps
     */
    public String getNormalQps() {
        return this.normalQps;
    }

    /**
     * @return portCount
     */
    public String getPortCount() {
        return this.portCount;
    }

    /**
     * @return productPlan
     */
    public String getProductPlan() {
        return this.productPlan;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return serviceBandwidth
     */
    public String getServiceBandwidth() {
        return this.serviceBandwidth;
    }

    /**
     * @return servicePartner
     */
    public String getServicePartner() {
        return this.servicePartner;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceRequest, Builder> {
        private String regionId; 
        private String addressType; 
        private String bandwidth; 
        private String baseBandwidth; 
        private String domainCount; 
        private String editionSale; 
        private String functionVersion; 
        private String instanceId; 
        private String modifyType; 
        private String normalBandwidth; 
        private String normalQps; 
        private String portCount; 
        private String productPlan; 
        private String productType; 
        private String serviceBandwidth; 
        private String servicePartner; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.addressType = request.addressType;
            this.bandwidth = request.bandwidth;
            this.baseBandwidth = request.baseBandwidth;
            this.domainCount = request.domainCount;
            this.editionSale = request.editionSale;
            this.functionVersion = request.functionVersion;
            this.instanceId = request.instanceId;
            this.modifyType = request.modifyType;
            this.normalBandwidth = request.normalBandwidth;
            this.normalQps = request.normalQps;
            this.portCount = request.portCount;
            this.productPlan = request.productPlan;
            this.productType = request.productType;
            this.serviceBandwidth = request.serviceBandwidth;
            this.servicePartner = request.servicePartner;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AddressType.
         */
        public Builder addressType(String addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * Bandwidth.
         */
        public Builder bandwidth(String bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * BaseBandwidth.
         */
        public Builder baseBandwidth(String baseBandwidth) {
            this.putQueryParameter("BaseBandwidth", baseBandwidth);
            this.baseBandwidth = baseBandwidth;
            return this;
        }

        /**
         * DomainCount.
         */
        public Builder domainCount(String domainCount) {
            this.putQueryParameter("DomainCount", domainCount);
            this.domainCount = domainCount;
            return this;
        }

        /**
         * EditionSale.
         */
        public Builder editionSale(String editionSale) {
            this.putQueryParameter("EditionSale", editionSale);
            this.editionSale = editionSale;
            return this;
        }

        /**
         * FunctionVersion.
         */
        public Builder functionVersion(String functionVersion) {
            this.putQueryParameter("FunctionVersion", functionVersion);
            this.functionVersion = functionVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-6ja1y6p5****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Upgrade</p>
         */
        public Builder modifyType(String modifyType) {
            this.putQueryParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        /**
         * NormalBandwidth.
         */
        public Builder normalBandwidth(String normalBandwidth) {
            this.putQueryParameter("NormalBandwidth", normalBandwidth);
            this.normalBandwidth = normalBandwidth;
            return this;
        }

        /**
         * NormalQps.
         */
        public Builder normalQps(String normalQps) {
            this.putQueryParameter("NormalQps", normalQps);
            this.normalQps = normalQps;
            return this;
        }

        /**
         * PortCount.
         */
        public Builder portCount(String portCount) {
            this.putQueryParameter("PortCount", portCount);
            this.portCount = portCount;
            return this;
        }

        /**
         * ProductPlan.
         */
        public Builder productPlan(String productPlan) {
            this.putQueryParameter("ProductPlan", productPlan);
            this.productPlan = productPlan;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * ServiceBandwidth.
         */
        public Builder serviceBandwidth(String serviceBandwidth) {
            this.putQueryParameter("ServiceBandwidth", serviceBandwidth);
            this.serviceBandwidth = serviceBandwidth;
            return this;
        }

        /**
         * ServicePartner.
         */
        public Builder servicePartner(String servicePartner) {
            this.putQueryParameter("ServicePartner", servicePartner);
            this.servicePartner = servicePartner;
            return this;
        }

        @Override
        public ModifyInstanceRequest build() {
            return new ModifyInstanceRequest(this);
        } 

    } 

}
