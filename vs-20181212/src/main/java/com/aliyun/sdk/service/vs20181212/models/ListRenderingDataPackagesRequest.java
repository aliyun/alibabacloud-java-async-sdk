// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link ListRenderingDataPackagesRequest} extends {@link RequestModel}
 *
 * <p>ListRenderingDataPackagesRequest</p>
 */
public class ListRenderingDataPackagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataPackageId")
    private String dataPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListRenderingDataPackagesRequest(Builder builder) {
        super(builder);
        this.dataPackageId = builder.dataPackageId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.size = builder.size;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRenderingDataPackagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataPackageId
     */
    public String getDataPackageId() {
        return this.dataPackageId;
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
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListRenderingDataPackagesRequest, Builder> {
        private String dataPackageId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer size; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListRenderingDataPackagesRequest request) {
            super(request);
            this.dataPackageId = request.dataPackageId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.size = request.size;
            this.status = request.status;
        } 

        /**
         * DataPackageId.
         */
        public Builder dataPackageId(String dataPackageId) {
            this.putQueryParameter("DataPackageId", dataPackageId);
            this.dataPackageId = dataPackageId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * Size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
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
        public ListRenderingDataPackagesRequest build() {
            return new ListRenderingDataPackagesRequest(this);
        } 

    } 

}
