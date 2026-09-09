// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link CreateRenderingInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateRenderingInstanceRequest</p>
 */
public class CreateRenderingInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private Attributes attributes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientInfo")
    private ClientInfo clientInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceBillingCycle")
    private String instanceBillingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidth")
    private Long internetMaxBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String renderingSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSize")
    private String storageSize;

    private CreateRenderingInstanceRequest(Builder builder) {
        super(builder);
        this.attributes = builder.attributes;
        this.autoRenew = builder.autoRenew;
        this.clientInfo = builder.clientInfo;
        this.instanceBillingCycle = builder.instanceBillingCycle;
        this.instanceChargeType = builder.instanceChargeType;
        this.internetChargeType = builder.internetChargeType;
        this.internetMaxBandwidth = builder.internetMaxBandwidth;
        this.period = builder.period;
        this.renderingSpec = builder.renderingSpec;
        this.storageSize = builder.storageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRenderingInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attributes
     */
    public Attributes getAttributes() {
        return this.attributes;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return clientInfo
     */
    public ClientInfo getClientInfo() {
        return this.clientInfo;
    }

    /**
     * @return instanceBillingCycle
     */
    public String getInstanceBillingCycle() {
        return this.instanceBillingCycle;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return internetMaxBandwidth
     */
    public Long getInternetMaxBandwidth() {
        return this.internetMaxBandwidth;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return renderingSpec
     */
    public String getRenderingSpec() {
        return this.renderingSpec;
    }

    /**
     * @return storageSize
     */
    public String getStorageSize() {
        return this.storageSize;
    }

    public static final class Builder extends Request.Builder<CreateRenderingInstanceRequest, Builder> {
        private Attributes attributes; 
        private Boolean autoRenew; 
        private ClientInfo clientInfo; 
        private String instanceBillingCycle; 
        private String instanceChargeType; 
        private String internetChargeType; 
        private Long internetMaxBandwidth; 
        private String period; 
        private String renderingSpec; 
        private String storageSize; 

        private Builder() {
            super();
        } 

        private Builder(CreateRenderingInstanceRequest request) {
            super(request);
            this.attributes = request.attributes;
            this.autoRenew = request.autoRenew;
            this.clientInfo = request.clientInfo;
            this.instanceBillingCycle = request.instanceBillingCycle;
            this.instanceChargeType = request.instanceChargeType;
            this.internetChargeType = request.internetChargeType;
            this.internetMaxBandwidth = request.internetMaxBandwidth;
            this.period = request.period;
            this.renderingSpec = request.renderingSpec;
            this.storageSize = request.storageSize;
        } 

        /**
         * <blockquote>
         * <p>Unless you have specific requirements, keep the default values. For customers with special requirements, fill in the relevant parameters after communication and confirmation.</p>
         * </blockquote>
         * <p>Attribute information.</p>
         */
        public Builder attributes(Attributes attributes) {
            String attributesShrink = shrink(attributes, "Attributes", "json");
            this.putQueryParameter("Attributes", attributesShrink);
            this.attributes = attributes;
            return this;
        }

        /**
         * <blockquote>
         * <p>This value is valid only when <code>InstanceChargeType</code> is <code>PrePaid</code> (subscription).</p>
         * </blockquote>
         * <p>Enable or disable auto-renewal. Values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enable.</p>
         * </li>
         * <li><p><strong>false</strong>: Disable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>Client information.</p>
         */
        public Builder clientInfo(ClientInfo clientInfo) {
            String clientInfoShrink = shrink(clientInfo, "ClientInfo", "json");
            this.putQueryParameter("ClientInfo", clientInfoShrink);
            this.clientInfo = clientInfo;
            return this;
        }

        /**
         * <blockquote>
         * <p>This value is valid only when <code>InstanceChargeType</code> is <code>PostPaid</code> (pay-as-you-go).</p>
         * </blockquote>
         * <p>Billing type. Valid values:</p>
         * <ul>
         * <li>Hour: Hourly.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Hour</p>
         */
        public Builder instanceBillingCycle(String instanceBillingCycle) {
            this.putQueryParameter("InstanceBillingCycle", instanceBillingCycle);
            this.instanceBillingCycle = instanceBillingCycle;
            return this;
        }

        /**
         * <p>The billing method for the instance. Valid values:</p>
         * <ul>
         * <li><p>PrePaid (default): Subscription.</p>
         * </li>
         * <li><p>PostPaid: Pay-as-you-go.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <blockquote>
         * <p>Only one billing method is allowed. If a billing method already exists, the new value is invalid by default, and the existing one prevails. Note that this field is required when a user makes the first purchase.</p>
         * </blockquote>
         * <p>Network billing type. Value:</p>
         * <ul>
         * <li>95BandwidthByMonth: Monthly 95th percentile bandwidth.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>95BandwidthByMonth</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>Maximum bandwidth, in Mbps. Default is 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder internetMaxBandwidth(Long internetMaxBandwidth) {
            this.putQueryParameter("InternetMaxBandwidth", internetMaxBandwidth);
            this.internetMaxBandwidth = internetMaxBandwidth;
            return this;
        }

        /**
         * <blockquote>
         * <p>This value is valid only when <code>InstanceChargeType</code> is <code>PrePaid</code> (subscription).</p>
         * </blockquote>
         * <p>The subscription period. Valid values (Note: 12 is converted to one year; other values are in months):</p>
         * <ul>
         * <li><p>1 (default)</p>
         * </li>
         * <li><p>2</p>
         * </li>
         * <li><p>3</p>
         * </li>
         * <li><p>4</p>
         * </li>
         * <li><p>5</p>
         * </li>
         * <li><p>6</p>
         * </li>
         * <li><p>7</p>
         * </li>
         * <li><p>8</p>
         * </li>
         * <li><p>9</p>
         * </li>
         * <li><p>12</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>Cloud application service instance specifications.</p>
         * <ul>
         * <li><p>For crs.cp.\* series specifications, choose between subscription or pay-as-you-go billing.</p>
         * </li>
         * <li><p>For crs.vm.\* series specifications, choose between subscription or pay-as-you-go billing.</p>
         * </li>
         * <li><p>For other series, only subscription billing is supported.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crs.cp.l1</p>
         */
        public Builder renderingSpec(String renderingSpec) {
            this.putQueryParameter("RenderingSpec", renderingSpec);
            this.renderingSpec = renderingSpec;
            return this;
        }

        /**
         * <p>The cloud storage capacity used by the cloud application service instance (Note: not local storage).</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder storageSize(String storageSize) {
            this.putQueryParameter("StorageSize", storageSize);
            this.storageSize = storageSize;
            return this;
        }

        @Override
        public CreateRenderingInstanceRequest build() {
            return new CreateRenderingInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRenderingInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateRenderingInstanceRequest</p>
     */
    public static class Attributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EdgeMediaService")
        private String edgeMediaService;

        @com.aliyun.core.annotation.NameInMap("InAccess")
        private String inAccess;

        @com.aliyun.core.annotation.NameInMap("OutAccess")
        private String outAccess;

        @com.aliyun.core.annotation.NameInMap("Zone")
        private String zone;

        private Attributes(Builder builder) {
            this.edgeMediaService = builder.edgeMediaService;
            this.inAccess = builder.inAccess;
            this.outAccess = builder.outAccess;
            this.zone = builder.zone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attributes create() {
            return builder().build();
        }

        /**
         * @return edgeMediaService
         */
        public String getEdgeMediaService() {
            return this.edgeMediaService;
        }

        /**
         * @return inAccess
         */
        public String getInAccess() {
            return this.inAccess;
        }

        /**
         * @return outAccess
         */
        public String getOutAccess() {
            return this.outAccess;
        }

        /**
         * @return zone
         */
        public String getZone() {
            return this.zone;
        }

        public static final class Builder {
            private String edgeMediaService; 
            private String inAccess; 
            private String outAccess; 
            private String zone; 

            private Builder() {
            } 

            private Builder(Attributes model) {
                this.edgeMediaService = model.edgeMediaService;
                this.inAccess = model.inAccess;
                this.outAccess = model.outAccess;
                this.zone = model.zone;
            } 

            /**
             * <p>Streaming service.</p>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder edgeMediaService(String edgeMediaService) {
                this.edgeMediaService = edgeMediaService;
                return this;
            }

            /**
             * <p>Inbound access configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder inAccess(String inAccess) {
                this.inAccess = inAccess;
                return this;
            }

            /**
             * <p>Outbound access configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder outAccess(String outAccess) {
                this.outAccess = outAccess;
                return this;
            }

            /**
             * <p>Resource domain.</p>
             * 
             * <strong>example:</strong>
             * <p>Public</p>
             */
            public Builder zone(String zone) {
                this.zone = zone;
                return this;
            }

            public Attributes build() {
                return new Attributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRenderingInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateRenderingInstanceRequest</p>
     */
    public static class ClientInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        private ClientInfo(Builder builder) {
            this.clientIp = builder.clientIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientInfo create() {
            return builder().build();
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        public static final class Builder {
            private String clientIp; 

            private Builder() {
            } 

            private Builder(ClientInfo model) {
                this.clientIp = model.clientIp;
            } 

            /**
             * <p>Client IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>172.21.128.110</p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            public ClientInfo build() {
                return new ClientInfo(this);
            } 

        } 

    }
}
