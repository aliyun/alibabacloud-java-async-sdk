// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeARMServerInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeARMServerInstancesRequest</p>
 */
public class DescribeARMServerInstancesRequest extends Request {
    @Query
    @NameInMap("EnsRegionIds")
    private java.util.List < String > ensRegionIds;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ServerIds")
    private java.util.List < String > serverIds;

    private DescribeARMServerInstancesRequest(Builder builder) {
        super(builder);
        this.ensRegionIds = builder.ensRegionIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.serverIds = builder.serverIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeARMServerInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ensRegionIds
     */
    public java.util.List < String > getEnsRegionIds() {
        return this.ensRegionIds;
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
     * @return serverIds
     */
    public java.util.List < String > getServerIds() {
        return this.serverIds;
    }

    public static final class Builder extends Request.Builder<DescribeARMServerInstancesRequest, Builder> {
        private java.util.List < String > ensRegionIds; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < String > serverIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeARMServerInstancesRequest request) {
            super(request);
            this.ensRegionIds = request.ensRegionIds;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.serverIds = request.serverIds;
        } 

        /**
         * EnsRegionIds.
         */
        public Builder ensRegionIds(java.util.List < String > ensRegionIds) {
            String ensRegionIdsShrink = shrink(ensRegionIds, "EnsRegionIds", "json");
            this.putQueryParameter("EnsRegionIds", ensRegionIdsShrink);
            this.ensRegionIds = ensRegionIds;
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
         * ServerIds.
         */
        public Builder serverIds(java.util.List < String > serverIds) {
            String serverIdsShrink = shrink(serverIds, "ServerIds", "json");
            this.putQueryParameter("ServerIds", serverIdsShrink);
            this.serverIds = serverIds;
            return this;
        }

        @Override
        public DescribeARMServerInstancesRequest build() {
            return new DescribeARMServerInstancesRequest(this);
        } 

    } 

}
