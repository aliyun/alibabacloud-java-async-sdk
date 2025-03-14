// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The name of the proxy cluster. You can query the name of the proxy cluster in the Security Center console.</p>
         * 
         * <strong>example:</strong>
         * <p>office-proxy</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The UUID of the proxy node. You can call the DescribeHybridProxyList operation to query the UUID of the proxy node.</p>
         * 
         * <strong>example:</strong>
         * <p>inet-proxy-3bb11fad-37d6-4aee-9c37-b0ad1612XXXX</p>
         */
        public Builder proxyUuid(String proxyUuid) {
            this.putQueryParameter("ProxyUuid", proxyUuid);
            this.proxyUuid = proxyUuid;
            return this;
        }

        /**
         * <p>The description of the proxy cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The UUID of the server on which the Security Center agent is installed. You can query the UUID by querying asset information.</p>
         * 
         * <strong>example:</strong>
         * <p>80d2f7d6-31a9-4d7f-8ff4-7ecc42f89ca****</p>
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
