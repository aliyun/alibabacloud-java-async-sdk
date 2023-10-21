// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHybridMonitorNamespaceListRequest} extends {@link RequestModel}
 *
 * <p>DescribeHybridMonitorNamespaceListRequest</p>
 */
public class DescribeHybridMonitorNamespaceListRequest extends Request {
    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ShowTaskStatistic")
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
         * The keyword that is used to search for namespaces.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The name of the namespace.
         * <p>
         * 
         * The name can contain uppercase letters, lowercase letters, digits, and hyphens (-).
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * A minimum of 1 entry can be returned on each page. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Specifies whether to return the configuration details of metric import tasks for Alibaba Cloud services and the number of metric import tasks for third-party services. Valid values:
         * <p>
         * 
         * *   true
         * *   false (default value)
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
