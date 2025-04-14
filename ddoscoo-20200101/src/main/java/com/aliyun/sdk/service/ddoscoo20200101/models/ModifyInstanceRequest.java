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
         * <p>Address type. Values:</p>
         * <ul>
         * <li><strong>Ipv4</strong>: IPv4.</li>
         * <li><strong>Ipv6</strong>: IPv6.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ipv4</p>
         */
        public Builder addressType(String addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * <p>Elastic protection bandwidth (Mainland China). Unit: Gbps.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder bandwidth(String bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>Guaranteed protection bandwidth (Mainland China). Unit: Gbps.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder baseBandwidth(String baseBandwidth) {
            this.putQueryParameter("BaseBandwidth", baseBandwidth);
            this.baseBandwidth = baseBandwidth;
            return this;
        }

        /**
         * <p>Number of protected domains.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder domainCount(String domainCount) {
            this.putQueryParameter("DomainCount", domainCount);
            this.domainCount = domainCount;
            return this;
        }

        /**
         * <p>Protection package (Mainland China). Values:</p>
         * <ul>
         * <li><strong>coop</strong>: Indicates the DDoS High Defense (Mainland China) Professional Edition.</li>
         * <li><strong>advance</strong>: Indicates the DDoS High Defense (Mainland China) Professional Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>coop</p>
         */
        public Builder editionSale(String editionSale) {
            this.putQueryParameter("EditionSale", editionSale);
            this.editionSale = editionSale;
            return this;
        }

        /**
         * <p>Function version, with values:</p>
         * <ul>
         * <li><strong>0</strong>: Standard function.</li>
         * <li><strong>1</strong>: Enhanced function.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder functionVersion(String functionVersion) {
            this.putQueryParameter("FunctionVersion", functionVersion);
            this.functionVersion = functionVersion;
            return this;
        }

        /**
         * <p>The ID of the DDoS High Defense instance.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> to query the ID information of all DDoS High Defense instances.</p>
         * </blockquote>
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
         * <p>Adjustment type, with values</p>
         * <ul>
         * <li>UPGRADE: Upgrade.</li>
         * <li>DOWNGRADE: Downgrade.</li>
         * </ul>
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
         * <p>Business bandwidth (outside Mainland China). Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder normalBandwidth(String normalBandwidth) {
            this.putQueryParameter("NormalBandwidth", normalBandwidth);
            this.normalBandwidth = normalBandwidth;
            return this;
        }

        /**
         * <p>Business QPS. Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder normalQps(String normalQps) {
            this.putQueryParameter("NormalQps", normalQps);
            this.normalQps = normalQps;
            return this;
        }

        /**
         * <p>Number of protected ports.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder portCount(String portCount) {
            this.putQueryParameter("PortCount", portCount);
            this.portCount = portCount;
            return this;
        }

        /**
         * <p>Protection package (outside Mainland China). Values:</p>
         * <ul>
         * <li><strong>0</strong>: Indicates the DDoS High Defense (outside Mainland China) Insurance Edition.</li>
         * <li><strong>1</strong>: Indicates the DDoS High Defense (outside Mainland China) Worry-Free Edition.</li>
         * <li><strong>2</strong>: Indicates the DDoS High Defense (outside Mainland China) Acceleration Line.</li>
         * <li><strong>3</strong>: Indicates the DDoS High Defense (outside Mainland China) Secure Acceleration Line.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder productPlan(String productPlan) {
            this.putQueryParameter("ProductPlan", productPlan);
            this.productPlan = productPlan;
            return this;
        }

        /**
         * <p>Product type.
         * Values:</p>
         * <ul>
         * <li><strong>ddoscoo</strong>: Indicates that the DDoS High Defense (Mainland China) instance is being adjusted for a China site account.</li>
         * <li><strong>ddoscoo_intl</strong>: Indicates that the DDoS High Defense (Mainland China) instance is being adjusted for an international site account.</li>
         * <li><strong>ddosDip</strong>: Indicates that the DDoS High Defense (outside Mainland China) instance is being adjusted for either a China or international site account.</li>
         * </ul>
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
         * <p>Business bandwidth (Mainland China). Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder serviceBandwidth(String serviceBandwidth) {
            this.putQueryParameter("ServiceBandwidth", serviceBandwidth);
            this.serviceBandwidth = serviceBandwidth;
            return this;
        }

        /**
         * <p>Line resources of the instance (Mainland China). Values:</p>
         * <ul>
         * <li><strong>coop-line-001</strong>: Indicates the DDoS High Defense (Mainland China) 8-line BGP line.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>coop-line-001</p>
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
