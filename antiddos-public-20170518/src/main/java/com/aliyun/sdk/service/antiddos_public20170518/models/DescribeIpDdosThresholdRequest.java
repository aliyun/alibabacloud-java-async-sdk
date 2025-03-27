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
 * {@link DescribeIpDdosThresholdRequest} extends {@link RequestModel}
 *
 * <p>DescribeIpDdosThresholdRequest</p>
 */
public class DescribeIpDdosThresholdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DdosRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ddosRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DdosType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ddosType;

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

    private DescribeIpDdosThresholdRequest(Builder builder) {
        super(builder);
        this.ddosRegionId = builder.ddosRegionId;
        this.ddosType = builder.ddosType;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.internetIp = builder.internetIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpDdosThresholdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ddosRegionId
     */
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    /**
     * @return ddosType
     */
    public String getDdosType() {
        return this.ddosType;
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

    public static final class Builder extends Request.Builder<DescribeIpDdosThresholdRequest, Builder> {
        private String ddosRegionId; 
        private String ddosType; 
        private String instanceId; 
        private String instanceType; 
        private String internetIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIpDdosThresholdRequest request) {
            super(request);
            this.ddosRegionId = request.ddosRegionId;
            this.ddosType = request.ddosType;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.internetIp = request.internetIp;
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
         * <p>The type of the threshold. Valid values:</p>
         * <ul>
         * <li><strong>defense</strong>: traffic scrubbing threshold</li>
         * <li><strong>blackhole</strong>: DDoS mitigation threshold</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>defense</p>
         */
        public Builder ddosType(String ddosType) {
            this.putQueryParameter("DdosType", ddosType);
            this.ddosType = ddosType;
            return this;
        }

        /**
         * <p>The ID of the asset.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/429562.html">DescribeInstanceIpAddress</a> operation to query the IDs of ECS instances, SLB instances, and EIPs within the current Alibaba Cloud account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1i88rqjza51s****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of the asset that is assigned a public IP address. Valid values:</p>
         * <ul>
         * <li><strong>ecs</strong>: ECS instances.</li>
         * <li><strong>slb</strong>: SLB instances.</li>
         * <li><strong>eip</strong>: EIPs.</li>
         * <li><strong>ipv6</strong>: IPv6 gateways.</li>
         * <li><strong>swas</strong>: simple application servers.</li>
         * <li><strong>waf</strong>: Web Application Firewall (WAF) instances of the Exclusive edition.</li>
         * <li><strong>ga_basic</strong>: Global Accelerator (GA) instances.</li>
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

        @Override
        public DescribeIpDdosThresholdRequest build() {
            return new DescribeIpDdosThresholdRequest(this);
        } 

    } 

}
