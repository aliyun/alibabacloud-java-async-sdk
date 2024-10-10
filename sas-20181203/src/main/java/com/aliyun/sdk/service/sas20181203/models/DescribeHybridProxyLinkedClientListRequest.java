// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHybridProxyLinkedClientListRequest} extends {@link RequestModel}
 *
 * <p>DescribeHybridProxyLinkedClientListRequest</p>
 */
public class DescribeHybridProxyLinkedClientListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyUuid")
    private String proxyUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private DescribeHybridProxyLinkedClientListRequest(Builder builder) {
        super(builder);
        this.clusterName = builder.clusterName;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.proxyUuid = builder.proxyUuid;
        this.remark = builder.remark;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridProxyLinkedClientListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return proxyUuid
     */
    public String getProxyUuid() {
        return this.proxyUuid;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribeHybridProxyLinkedClientListRequest, Builder> {
        private String clusterName; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String proxyUuid; 
        private String remark; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHybridProxyLinkedClientListRequest request) {
            super(request);
            this.clusterName = request.clusterName;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.proxyUuid = request.proxyUuid;
            this.remark = request.remark;
            this.uuid = request.uuid;
        } 

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProxyUuid.
         */
        public Builder proxyUuid(String proxyUuid) {
            this.putQueryParameter("ProxyUuid", proxyUuid);
            this.proxyUuid = proxyUuid;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribeHybridProxyLinkedClientListRequest build() {
            return new DescribeHybridProxyLinkedClientListRequest(this);
        } 

    } 

}
