// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPersistentVolumeRequest} extends {@link RequestModel}
 *
 * <p>ListPersistentVolumeRequest</p>
 */
public class ListPersistentVolumeRequest extends Request {
    @Body
    @NameInMap("ClusterInstanceId")
    @Validation(required = true)
    private String clusterInstanceId;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    private ListPersistentVolumeRequest(Builder builder) {
        super(builder);
        this.clusterInstanceId = builder.clusterInstanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPersistentVolumeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterInstanceId
     */
    public String getClusterInstanceId() {
        return this.clusterInstanceId;
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

    public static final class Builder extends Request.Builder<ListPersistentVolumeRequest, Builder> {
        private String clusterInstanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListPersistentVolumeRequest request) {
            super(request);
            this.clusterInstanceId = request.clusterInstanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * ClusterInstanceId.
         */
        public Builder clusterInstanceId(String clusterInstanceId) {
            this.putBodyParameter("ClusterInstanceId", clusterInstanceId);
            this.clusterInstanceId = clusterInstanceId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListPersistentVolumeRequest build() {
            return new ListPersistentVolumeRequest(this);
        } 

    } 

}
