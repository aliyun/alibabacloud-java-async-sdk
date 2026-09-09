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
 * {@link DescribeDdosEventListRequest} extends {@link RequestModel}
 *
 * <p>DescribeDdosEventListRequest</p>
 */
public class DescribeDdosEventListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

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
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryDays")
    @com.aliyun.core.annotation.Validation(maximum = 186, minimum = 1)
    private Integer queryDays;

    private DescribeDdosEventListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.ddosRegionId = builder.ddosRegionId;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.internetIp = builder.internetIp;
        this.pageSize = builder.pageSize;
        this.queryDays = builder.queryDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDdosEventListRequest create() {
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryDays
     */
    public Integer getQueryDays() {
        return this.queryDays;
    }

    public static final class Builder extends Request.Builder<DescribeDdosEventListRequest, Builder> {
        private Integer currentPage; 
        private String ddosRegionId; 
        private String instanceId; 
        private String instanceType; 
        private String internetIp; 
        private Integer pageSize; 
        private Integer queryDays; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDdosEventListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.ddosRegionId = request.ddosRegionId;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.internetIp = request.internetIp;
            this.pageSize = request.pageSize;
            this.queryDays = request.queryDays;
        } 

        /**
         * <p>The number of the page to return for a paged query. Default value: <strong>1</strong>.</p>
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
         * <p>The ID of the instance for the asset that is assigned a public IP address.</p>
         * <blockquote>
         * <p>Call <a href="https://help.aliyun.com/document_detail/354191.html">DescribeInstance</a> to query the IDs of the ECS, SLB, and EIP instances that belong to your Alibaba Cloud account.</p>
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
         * <p>The instance type of the asset that is assigned a public IP address. Valid values:</p>
         * <ul>
         * <li><p><strong>ecs</strong>: an Elastic Compute Service (ECS) instance.</p>
         * </li>
         * <li><p><strong>slb</strong>: a Server Load Balancer (SLB) instance.</p>
         * </li>
         * <li><p><strong>eip</strong>: an elastic IP address (EIP) instance.</p>
         * </li>
         * <li><p><strong>ipv6</strong>: an IPv6 Gateway instance.</p>
         * </li>
         * <li><p><strong>swas</strong>: a simple application server instance.</p>
         * </li>
         * <li><p><strong>waf</strong>: a dedicated Web Application Firewall (WAF) instance.</p>
         * </li>
         * <li><p><strong>ga_basic</strong>: a Global Accelerator instance.</p>
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
         * <p>The IP address of the asset that is assigned a public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>121.199.XX.XX</p>
         */
        public Builder internetIp(String internetIp) {
            this.putQueryParameter("InternetIp", internetIp);
            this.internetIp = internetIp;
            return this;
        }

        /**
         * <p>The number of attack events to return on each page for a paged query. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The number of days to query backwards from the current time. Default value: 7.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder queryDays(Integer queryDays) {
            this.putQueryParameter("QueryDays", queryDays);
            this.queryDays = queryDays;
            return this;
        }

        @Override
        public DescribeDdosEventListRequest build() {
            return new DescribeDdosEventListRequest(this);
        } 

    } 

}
