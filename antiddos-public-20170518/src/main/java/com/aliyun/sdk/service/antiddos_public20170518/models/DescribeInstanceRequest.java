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
 * {@link DescribeInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceRequest</p>
 */
public class DescribeInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DdosRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ddosRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DdosStatus")
    private String ddosStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIp")
    private String instanceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50)
    private Integer pageSize;

    private DescribeInstanceRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.ddosRegionId = builder.ddosRegionId;
        this.ddosStatus = builder.ddosStatus;
        this.instanceId = builder.instanceId;
        this.instanceIp = builder.instanceIp;
        this.instanceName = builder.instanceName;
        this.instanceType = builder.instanceType;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return ddosRegionId
     */
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    /**
     * @return ddosStatus
     */
    public String getDdosStatus() {
        return this.ddosStatus;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceIp
     */
    public String getInstanceIp() {
        return this.instanceIp;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceRequest, Builder> {
        private Integer currentPage; 
        private String ddosRegionId; 
        private String ddosStatus; 
        private String instanceId; 
        private String instanceIp; 
        private String instanceName; 
        private String instanceType; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.ddosRegionId = request.ddosRegionId;
            this.ddosStatus = request.ddosStatus;
            this.instanceId = request.instanceId;
            this.instanceIp = request.instanceIp;
            this.instanceName = request.instanceName;
            this.instanceType = request.instanceType;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
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
         * <p>The DDoS mitigation status of the asset. Valid values:</p>
         * <ul>
         * <li><strong>mitigating</strong>: queries assets for which traffic scrubbing is triggered.</li>
         * <li><strong>blackholed</strong>: queries assets for which blackhole filtering is triggered.</li>
         * <li><strong>normal</strong>: queries assets that are not under DDoS attacks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>blackholed</p>
         */
        public Builder ddosStatus(String ddosStatus) {
            this.putQueryParameter("DdosStatus", ddosStatus);
            this.ddosStatus = ddosStatus;
            return this;
        }

        /**
         * <p>The ID of the asset. The formats of asset IDs vary based on the value of the <strong>InstanceType</strong>. parameter.</p>
         * <ul>
         * <li>If you set <strong>InstanceType</strong> to <strong>ecs</strong>, specify the ID of the ECS instance. For example, you can specify i-bp1cb6x80tfgocid****.</li>
         * <li>If you set <strong>InstanceType</strong> to <strong>slb</strong>, specify the ID of the SLB instance. For example, you can specify alb-vn2dqg3v31y2vd****.</li>
         * <li>If you set <strong>InstanceType</strong> to <strong>eip</strong>, specify the ID of the EIP. For example, you can specify eip-j6ce6dcx9epi7rs46****.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>i-bp1cb6x80tfgocid****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>121.199.XX.XX</p>
         */
        public Builder instanceIp(String instanceIp) {
            this.putQueryParameter("InstanceIp", instanceIp);
            this.instanceIp = instanceIp;
            return this;
        }

        /**
         * <p>The name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>launch-advisor-2022****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The type of the asset to query. Valid values:</p>
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
         * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeInstanceRequest build() {
            return new DescribeInstanceRequest(this);
        } 

    } 

}
