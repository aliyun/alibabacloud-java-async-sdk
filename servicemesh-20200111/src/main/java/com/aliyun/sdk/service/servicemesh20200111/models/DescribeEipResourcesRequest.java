// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEipResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeEipResourcesRequest</p>
 */
public class DescribeEipResourcesRequest extends Request {
    @Body
    @NameInMap("PageNum")
    private Integer pageNum;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("ServiceMeshId")
    private String serviceMeshId;

    private DescribeEipResourcesRequest(Builder builder) {
        super(builder);
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEipResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DescribeEipResourcesRequest, Builder> {
        private Integer pageNum; 
        private Integer pageSize; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEipResourcesRequest request) {
            super(request);
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putBodyParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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

        /**
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public DescribeEipResourcesRequest build() {
            return new DescribeEipResourcesRequest(this);
        } 

    } 

}
