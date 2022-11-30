// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBenchmarkTaskRequest} extends {@link RequestModel}
 *
 * <p>ListBenchmarkTaskRequest</p>
 */
public class ListBenchmarkTaskRequest extends Request {
    @Query
    @NameInMap("Filter")
    private String filter;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("ServiceName")
    private String serviceName;

    private ListBenchmarkTaskRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.serviceName = builder.serviceName;
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
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<ListBenchmarkTaskRequest, Builder> {
        private String filter; 
        private String pageNumber; 
        private String pageSize; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(ListBenchmarkTaskRequest request) {
            super(request);
            this.filter = request.filter;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.serviceName = request.serviceName;
        } 

        /**
         * Filter.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public ListBenchmarkTaskRequest build() {
            return new ListBenchmarkTaskRequest(this);
        } 

    } 

}
