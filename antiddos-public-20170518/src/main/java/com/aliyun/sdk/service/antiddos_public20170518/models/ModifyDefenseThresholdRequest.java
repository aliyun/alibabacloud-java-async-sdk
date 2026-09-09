// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

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
 * {@link ModifyDefenseThresholdRequest} extends {@link RequestModel}
 *
 * <p>ModifyDefenseThresholdRequest</p>
 */
public class ModifyDefenseThresholdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bps")
    private Integer bps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DdosRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ddosRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetIp")
    private String internetIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAuto")
    private Boolean isAuto;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pps")
    private Integer pps;

    private ModifyDefenseThresholdRequest(Builder builder) {
        super(builder);
        this.bps = builder.bps;
        this.clientToken = builder.clientToken;
        this.ddosRegionId = builder.ddosRegionId;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.internetIp = builder.internetIp;
        this.isAuto = builder.isAuto;
        this.pps = builder.pps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDefenseThresholdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bps
     */
    public Integer getBps() {
        return this.bps;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ddosRegionId
     */
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return internetIp
     */
    public String getInternetIp() {
        return this.internetIp;
    }

    /**
     * @return isAuto
     */
    public Boolean getIsAuto() {
        return this.isAuto;
    }

    /**
     * @return pps
     */
    public Integer getPps() {
        return this.pps;
    }

    public static final class Builder extends Request.Builder<ModifyDefenseThresholdRequest, Builder> {
        private Integer bps; 
        private String clientToken; 
        private String ddosRegionId; 
        private String instanceId; 
        private String instanceType; 
        private String internetIp; 
        private Boolean isAuto; 
        private Integer pps; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDefenseThresholdRequest request) {
            super(request);
            this.bps = request.bps;
            this.clientToken = request.clientToken;
            this.ddosRegionId = request.ddosRegionId;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.internetIp = request.internetIp;
            this.isAuto = request.isAuto;
            this.pps = request.pps;
        } 

        /**
         * <p>The scrubbing threshold for traffic in Mbps. This value cannot exceed the peak public network traffic of the instance. If you specify Bps, you must also specify Pps. Otherwise, the change does not take effect.</p>
         * <p>Use the monitoring tools of your instance to query its public network traffic:</p>
         * <ul>
         * <li><p>For an ECS instance, see <a href="https://help.aliyun.com/document_detail/25482.html">View instance monitoring information</a>.</p>
         * </li>
         * <li><p>For an SLB instance, see <a href="https://help.aliyun.com/document_detail/85982.html">View monitoring data</a>.</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>For an EIP instance, see <a href="https://help.aliyun.com/document_detail/85354.html">View monitoring data</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder bps(Integer bps) {
            this.putQueryParameter("Bps", bps);
            this.bps = bps;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The region ID of the asset that is assigned a public IP address.</p>
         * <blockquote>
         * <p>Call <a href="https://help.aliyun.com/document_detail/353250.html">DescribeRegions</a> to query all region IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder ddosRegionId(String ddosRegionId) {
            this.putQueryParameter("DdosRegionId", ddosRegionId);
            this.ddosRegionId = ddosRegionId;
            return this;
        }

        /**
         * <p>The instance ID of the asset that is assigned a public IP address.</p>
         * <blockquote>
         * <p>Call <a href="https://help.aliyun.com/document_detail/354191.html">DescribeInstance</a> to query the IDs of the ECS, SLB, and EIP instances that belong to your Alibaba Cloud account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf6idy3c57psf7vu****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance type of the asset that is assigned a public IP address. Valid values:</p>
         * <ul>
         * <li><p><strong>ecs</strong>: Elastic Compute Service (ECS) instance.</p>
         * </li>
         * <li><p><strong>slb</strong>: Server Load Balancer (SLB) instance.</p>
         * </li>
         * <li><p><strong>eip</strong>: Elastic IP Address (EIP) instance.</p>
         * </li>
         * <li><p><strong>ipv6</strong>: IPv6 Gateway instance.</p>
         * </li>
         * <li><p><strong>swas</strong>: simple application server instance.</p>
         * </li>
         * <li><p><strong>waf</strong>: dedicated Web Application Firewall (WAF) instance.</p>
         * </li>
         * <li><p><strong>ga_basic</strong>: basic Global Accelerator (GA) instance.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The public IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder internetIp(String internetIp) {
            this.putQueryParameter("InternetIp", internetIp);
            this.internetIp = internetIp;
            return this;
        }

        /**
         * <p>Specifies whether to automatically adjust the scrubbing threshold based on the traffic loads of the instance. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The scrubbing threshold is automatically adjusted. You do not need to set the <strong>Bps</strong> and <strong>Pps</strong> parameters.</p>
         * </li>
         * <li><p><strong>false</strong>: The scrubbing threshold is not automatically adjusted. You must set the <strong>Bps</strong> and <strong>Pps</strong> parameters.</p>
         * </li>
         * </ul>
         * <p>Default value: false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isAuto(Boolean isAuto) {
            this.putQueryParameter("IsAuto", isAuto);
            this.isAuto = isAuto;
            return this;
        }

        /**
         * <p>The scrubbing threshold for packets per second (pps). This value cannot exceed the peak packet traffic of the instance. If you specify Pps, you must also specify Bps. Otherwise, the change does not take effect.</p>
         * <p>Use the monitoring tools of your instance to query its packet traffic:</p>
         * <ul>
         * <li><p>For an ECS instance, see <a href="https://help.aliyun.com/document_detail/25482.html">View instance monitoring information</a>.</p>
         * </li>
         * <li><p>For an SLB instance, see <a href="https://help.aliyun.com/document_detail/85982.html">View monitoring data</a>.</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>For an EIP instance, see <a href="https://help.aliyun.com/document_detail/85354.html">View monitoring data</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>70000</p>
         */
        public Builder pps(Integer pps) {
            this.putQueryParameter("Pps", pps);
            this.pps = pps;
            return this;
        }

        @Override
        public ModifyDefenseThresholdRequest build() {
            return new ModifyDefenseThresholdRequest(this);
        } 

    } 

}
