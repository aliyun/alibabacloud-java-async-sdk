// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPodRiskRequest} extends {@link RequestModel}
 *
 * <p>ListPodRiskRequest</p>
 */
public class ListPodRiskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PodName")
    private String podName;

    private ListPodRiskRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.clusterId = builder.clusterId;
        this.currentPage = builder.currentPage;
        this.namespace = builder.namespace;
        this.pageSize = builder.pageSize;
        this.podName = builder.podName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPodRiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return podName
     */
    public String getPodName() {
        return this.podName;
    }

    public static final class Builder extends Request.Builder<ListPodRiskRequest, Builder> {
        private String appName; 
        private String clusterId; 
        private Long currentPage; 
        private String namespace; 
        private Long pageSize; 
        private String podName; 

        private Builder() {
            super();
        } 

        private Builder(ListPodRiskRequest request) {
            super(request);
            this.appName = request.appName;
            this.clusterId = request.clusterId;
            this.currentPage = request.currentPage;
            this.namespace = request.namespace;
            this.pageSize = request.pageSize;
            this.podName = request.podName;
        } 

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx1</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The ID of the container cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/182997.html">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c314aa5b2f208461dad821cdfed82****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The namespace of the Kubernetes cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>taas</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd-84898334227-p****</p>
         */
        public Builder podName(String podName) {
            this.putQueryParameter("PodName", podName);
            this.podName = podName;
            return this;
        }

        @Override
        public ListPodRiskRequest build() {
            return new ListPodRiskRequest(this);
        } 

    } 

}
