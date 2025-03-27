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
 * {@link DescribeDdosThresholdRequest} extends {@link RequestModel}
 *
 * <p>DescribeDdosThresholdRequest</p>
 */
public class DescribeDdosThresholdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DdosRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ddosRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DdosType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ddosType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    private DescribeDdosThresholdRequest(Builder builder) {
        super(builder);
        this.ddosRegionId = builder.ddosRegionId;
        this.ddosType = builder.ddosType;
        this.instanceIds = builder.instanceIds;
        this.instanceType = builder.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDdosThresholdRequest create() {
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
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    public static final class Builder extends Request.Builder<DescribeDdosThresholdRequest, Builder> {
        private String ddosRegionId; 
        private String ddosType; 
        private java.util.List<String> instanceIds; 
        private String instanceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDdosThresholdRequest request) {
            super(request);
            this.ddosRegionId = request.ddosRegionId;
            this.ddosType = request.ddosType;
            this.instanceIds = request.instanceIds;
            this.instanceType = request.instanceType;
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
         * <p>The ID of asset N to query.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
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

        @Override
        public DescribeDdosThresholdRequest build() {
            return new DescribeDdosThresholdRequest(this);
        } 

    } 

}
