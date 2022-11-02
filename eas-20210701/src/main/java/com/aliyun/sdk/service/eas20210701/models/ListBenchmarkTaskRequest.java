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
    @NameInMap("Fileter")
    private String fileter;

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
        this.fileter = builder.fileter;
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
     * @return fileter
     */
    public String getFileter() {
        return this.fileter;
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
        private String fileter; 
        private String pageNumber; 
        private String pageSize; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(ListBenchmarkTaskRequest request) {
            super(request);
            this.fileter = request.fileter;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.serviceName = request.serviceName;
        } 

        /**
         * Fileter.
         */
        public Builder fileter(String fileter) {
            this.putQueryParameter("Fileter", fileter);
            this.fileter = fileter;
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
