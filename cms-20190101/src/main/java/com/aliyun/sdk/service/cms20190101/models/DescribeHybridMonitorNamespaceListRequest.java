// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHybridMonitorNamespaceListRequest} extends {@link RequestModel}
 *
 * <p>DescribeHybridMonitorNamespaceListRequest</p>
 */
public class DescribeHybridMonitorNamespaceListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowTaskStatistic")
    private Boolean showTaskStatistic;

    private DescribeHybridMonitorNamespaceListRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.namespace = builder.namespace;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.showTaskStatistic = builder.showTaskStatistic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridMonitorNamespaceListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return showTaskStatistic
     */
    public Boolean getShowTaskStatistic() {
        return this.showTaskStatistic;
    }

    public static final class Builder extends Request.Builder<DescribeHybridMonitorNamespaceListRequest, Builder> {
        private String keyword; 
        private String namespace; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean showTaskStatistic; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHybridMonitorNamespaceListRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.namespace = request.namespace;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.showTaskStatistic = request.showTaskStatistic;
        } 

        /**
         * <p>The search keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * <p>The name can contain letters, digits, and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-test</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>Page numbers start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>Page numbers start from 1. Default value: 10.</p>
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
         * <p>Specifies whether to return the configuration details of metric import tasks for Alibaba Cloud services and the number of metric import tasks for third-party services. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder showTaskStatistic(Boolean showTaskStatistic) {
            this.putQueryParameter("ShowTaskStatistic", showTaskStatistic);
            this.showTaskStatistic = showTaskStatistic;
            return this;
        }

        @Override
        public DescribeHybridMonitorNamespaceListRequest build() {
            return new DescribeHybridMonitorNamespaceListRequest(this);
        } 

    } 

}
