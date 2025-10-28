// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link ListBenchmarkTaskRequest} extends {@link RequestModel}
 *
 * <p>ListBenchmarkTaskRequest</p>
 */
public class ListBenchmarkTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelId")
    private String modelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestMethod")
    private String requestMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListBenchmarkTaskRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.modelId = builder.modelId;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestMethod = builder.requestMethod;
        this.serviceName = builder.serviceName;
        this.sort = builder.sort;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBenchmarkTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestMethod
     */
    public String getRequestMethod() {
        return this.requestMethod;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListBenchmarkTaskRequest, Builder> {
        private String filter; 
        private String modelId; 
        private String order; 
        private String pageNumber; 
        private String pageSize; 
        private String requestMethod; 
        private String serviceName; 
        private String sort; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListBenchmarkTaskRequest request) {
            super(request);
            this.filter = request.filter;
            this.modelId = request.modelId;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.requestMethod = request.requestMethod;
            this.serviceName = request.serviceName;
            this.sort = request.sort;
            this.status = request.status;
        } 

        /**
         * <p>The keyword used to query required stress testing tasks. If this parameter is specified, the system returns stress testing tasks based on the names of the stress testing tasks in the matched Elastic Algorithm Service (EAS).</p>
         * 
         * <strong>example:</strong>
         * <p>test_bench</p>
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.putQueryParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestMethod.
         */
        public Builder requestMethod(String requestMethod) {
            this.putQueryParameter("RequestMethod", requestMethod);
            this.requestMethod = requestMethod;
            return this;
        }

        /**
         * <p>The name of the EAS service that corresponds to the stress testing task. For more information about how to query the service name, see <a href="https://help.aliyun.com/document_detail/412109.html">ListServices</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>test_bench_srv</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListBenchmarkTaskRequest build() {
            return new ListBenchmarkTaskRequest(this);
        } 

    } 

}
