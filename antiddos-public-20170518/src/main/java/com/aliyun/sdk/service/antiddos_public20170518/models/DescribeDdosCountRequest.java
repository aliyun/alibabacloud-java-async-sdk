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
 * {@link DescribeDdosCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeDdosCountRequest</p>
 */
public class DescribeDdosCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DdosRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ddosRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    private DescribeDdosCountRequest(Builder builder) {
        super(builder);
        this.ddosRegionId = builder.ddosRegionId;
        this.instanceType = builder.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDdosCountRequest create() {
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
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    public static final class Builder extends Request.Builder<DescribeDdosCountRequest, Builder> {
        private String ddosRegionId; 
        private String instanceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDdosCountRequest request) {
            super(request);
            this.ddosRegionId = request.ddosRegionId;
            this.instanceType = request.instanceType;
        } 

        /**
         * <p>The region ID of the asset to query.</p>
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
         * <p>The type of the asset to query. Valid values:</p>
         * <ul>
         * <li><p><strong>ecs</strong>: Elastic Compute Service (ECS) instances.</p>
         * </li>
         * <li><p><strong>slb</strong>: Server Load Balancer (SLB) instances.</p>
         * </li>
         * <li><p><strong>eip</strong>: elastic IP addresses (EIPs).</p>
         * </li>
         * <li><p><strong>ipv6</strong>: IPv6 gateways.</p>
         * </li>
         * <li><p><strong>swas</strong>: simple application servers.</p>
         * </li>
         * <li><p><strong>waf</strong>: Web Application Firewall (WAF) instances of the Exclusive edition.</p>
         * </li>
         * <li><p><strong>ga_basic</strong>: Global Accelerator (GA) instances.</p>
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

        @Override
        public DescribeDdosCountRequest build() {
            return new DescribeDdosCountRequest(this);
        } 

    } 

}
