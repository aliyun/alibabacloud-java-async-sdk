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
 * {@link DescribeCapRequest} extends {@link RequestModel}
 *
 * <p>DescribeCapRequest</p>
 */
public class DescribeCapRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BegTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long begTime;

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

    private DescribeCapRequest(Builder builder) {
        super(builder);
        this.begTime = builder.begTime;
        this.ddosRegionId = builder.ddosRegionId;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.internetIp = builder.internetIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCapRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return begTime
     */
    public Long getBegTime() {
        return this.begTime;
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

    public static final class Builder extends Request.Builder<DescribeCapRequest, Builder> {
        private Long begTime; 
        private String ddosRegionId; 
        private String instanceId; 
        private String instanceType; 
        private String internetIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCapRequest request) {
            super(request);
            this.begTime = request.begTime;
            this.ddosRegionId = request.ddosRegionId;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.internetIp = request.internetIp;
        } 

        /**
         * <p>The start time of the DDoS attack event. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/354236.html">DescribeDdosEventList</a> operation to query the start time of each DDoS attack event that occurred on an asset.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1637812279000</p>
         */
        public Builder begTime(Long begTime) {
            this.putQueryParameter("BegTime", begTime);
            this.begTime = begTime;
            return this;
        }

        /**
         * <p>The region ID of the asset that is under DDoS attacks. The asset is assigned a public IP address.</p>
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
         * <p>The ID of the asset that is under DDoS attacks.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/354191.html">DescribeInstance</a> operation to query the IDs of ECS instances, SLB instances, and EIPs within the current Alibaba Cloud account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp10bclrt56fblts****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of the asset that is under DDoS attacks. The asset is assigned a public IP address. Valid values:</p>
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
         * <p>The public IP address of the asset that is under DDoS attacks.</p>
         * 
         * <strong>example:</strong>
         * <p>121.199.XX.XX</p>
         */
        public Builder internetIp(String internetIp) {
            this.putQueryParameter("InternetIp", internetIp);
            this.internetIp = internetIp;
            return this;
        }

        @Override
        public DescribeCapRequest build() {
            return new DescribeCapRequest(this);
        } 

    } 

}
