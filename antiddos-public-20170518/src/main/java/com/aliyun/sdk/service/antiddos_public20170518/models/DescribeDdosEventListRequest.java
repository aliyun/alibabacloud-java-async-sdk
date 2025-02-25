// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

    private DescribeDdosEventListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.ddosRegionId = builder.ddosRegionId;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.internetIp = builder.internetIp;
        this.pageSize = builder.pageSize;
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

    public static final class Builder extends Request.Builder<DescribeDdosEventListRequest, Builder> {
        private Integer currentPage; 
        private String ddosRegionId; 
        private String instanceId; 
        private String instanceType; 
        private String internetIp; 
        private Integer pageSize; 

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
        } 

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The region ID of the asset to query.
         * <p>
         * 
         * > You can call the [DescribeRegions](~~353250~~) operation to query the most recent region list.
         */
        public Builder ddosRegionId(String ddosRegionId) {
            this.putQueryParameter("DdosRegionId", ddosRegionId);
            this.ddosRegionId = ddosRegionId;
            return this;
        }

        /**
         * The ID of asset to query.
         * <p>
         * 
         * > You can call the [DescribeInstance](~~354191~~) operation to query the IDs of ECS instances, SLB instances, and EIPs within the current Alibaba Cloud account.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The type of the asset to query. Valid values:
         * <p>
         * 
         * *   **ecs**: ECS instance
         * *   **slb**: SLB instance
         * *   **eip**: EIP
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The IP address of the asset to query.
         */
        public Builder internetIp(String internetIp) {
            this.putQueryParameter("InternetIp", internetIp);
            this.internetIp = internetIp;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeDdosEventListRequest build() {
            return new DescribeDdosEventListRequest(this);
        } 

    } 

}
