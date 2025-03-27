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
 * {@link ModifyIpDefenseThresholdRequest} extends {@link RequestModel}
 *
 * <p>ModifyIpDefenseThresholdRequest</p>
 */
public class ModifyIpDefenseThresholdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bps")
    private Integer bps;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String internetIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAuto")
    private Boolean isAuto;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pps")
    private Integer pps;

    private ModifyIpDefenseThresholdRequest(Builder builder) {
        super(builder);
        this.bps = builder.bps;
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

    public static ModifyIpDefenseThresholdRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyIpDefenseThresholdRequest, Builder> {
        private Integer bps; 
        private String ddosRegionId; 
        private String instanceId; 
        private String instanceType; 
        private String internetIp; 
        private Boolean isAuto; 
        private Integer pps; 

        private Builder() {
            super();
        } 

        private Builder(ModifyIpDefenseThresholdRequest request) {
            super(request);
            this.bps = request.bps;
            this.ddosRegionId = request.ddosRegionId;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.internetIp = request.internetIp;
            this.isAuto = request.isAuto;
            this.pps = request.pps;
        } 

        /**
         * <p>The traffic scrubbing threshold. Unit: Mbit/s. The traffic scrubbing threshold cannot exceed the peak inbound or outbound Internet traffic, whichever is larger, of the asset. When you modify Bps, Pps is required. Otherwise, Bps does not take effect.</p>
         * <p>You can use the monitoring tool that is provided by the asset to query the Internet traffic of the asset:</p>
         * <ul>
         * <li>If the asset is an ECS instance, see <a href="https://help.aliyun.com/document_detail/25482.html">View instance monitoring information</a>.</li>
         * <li>If the asset is an SLB instance, see <a href="https://help.aliyun.com/document_detail/85982.html">View monitoring data</a>.</li>
         * <li>If the asset is an EIP, see <a href="https://help.aliyun.com/document_detail/85354.html">View monitoring data</a>.</li>
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
         * <p>The region ID of the asset.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/353250.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the asset.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/354191.html">DescribeInstance</a> operation to query the IDs of ECS instances, SLB instances, and EIPs within the current Alibaba Cloud account.</p>
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
         * <p>The type of the asset. Valid values:</p>
         * <ul>
         * <li><strong>ecs</strong>: an Elastic Compute Service (ECS) instance.</li>
         * <li><strong>slb</strong>: a Server Load Balancer (SLB) instance.</li>
         * <li><strong>eip</strong>: an elastic IP address (EIP).</li>
         * <li><strong>ipv6</strong>: an IPv6 gateway.</li>
         * <li><strong>swas</strong>: a simple application server.</li>
         * <li><strong>waf</strong>: a Web Application Firewall (WAF) instance of the Exclusive edition.</li>
         * <li><strong>ga_basic</strong>: a Global Accelerator (GA) instance.</li>
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
         * <p>The IP address of the asset.</p>
         * <p>This parameter is required.</p>
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
         * <p>Specifies whether to automatically adjust the scrubbing threshold based on the traffic load on the asset. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: automatically adjusts the scrubbing threshold. You do not need to configure the <strong>Bps</strong> and <strong>Pps</strong> parameters.</li>
         * <li><strong>false</strong>: The scrubbing threshold is not automatically adjusted. You must configure the <strong>Bps</strong> and <strong>Pps</strong> parameters. This is the default value.</li>
         * </ul>
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
         * <p>The packet scrubbing threshold. Unit: packets per second (PPS). When you modify Pps, Bps is required. Otherwise, Pps does not take effect.</p>
         * <p>The packet scrubbing threshold cannot exceed the peak number of inbound or outbound packets, whichever is larger, of the asset. You can use the monitoring tool that is provided by the asset to query the number of packets of the asset:</p>
         * <ul>
         * <li>If the asset is an ECS instance, see <a href="https://help.aliyun.com/document_detail/25482.html">View instance monitoring information</a>.</li>
         * <li>If the asset is an SLB instance, see <a href="https://help.aliyun.com/document_detail/85982.html">View monitoring data</a>.</li>
         * <li>If the asset is an EIP, see <a href="https://help.aliyun.com/document_detail/85354.html">View monitoring data</a>.</li>
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
        public ModifyIpDefenseThresholdRequest build() {
            return new ModifyIpDefenseThresholdRequest(this);
        } 

    } 

}
