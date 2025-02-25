// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsersAsyncRequest} extends {@link RequestModel}
 *
 * <p>ListUsersAsyncRequest</p>
 */
public class ListUsersAsyncRequest extends Request {
    @Query
    @NameInMap("AsyncId")
    private String asyncId;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 50)
    private Integer pageSize;

    private ListUsersAsyncRequest(Builder builder) {
        super(builder);
        this.asyncId = builder.asyncId;
        this.clusterId = builder.clusterId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersAsyncRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncId
     */
    public String getAsyncId() {
        return this.asyncId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
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

    public static final class Builder extends Request.Builder<ListUsersAsyncRequest, Builder> {
        private String asyncId; 
        private String clusterId; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListUsersAsyncRequest request) {
            super(request);
            this.asyncId = request.asyncId;
            this.clusterId = request.clusterId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * The ID of the asynchronous task.
         */
        public Builder asyncId(String asyncId) {
            this.putQueryParameter("AsyncId", asyncId);
            this.asyncId = asyncId;
            return this;
        }

        /**
         * The ID of the E-HPC cluster. You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The page number.\
         * <p>
         * Pages start from page 1.\
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.\
         * <p>
         * Valid values: 1 to 50.\
         * Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListUsersAsyncRequest build() {
            return new ListUsersAsyncRequest(this);
        } 

    } 

}
