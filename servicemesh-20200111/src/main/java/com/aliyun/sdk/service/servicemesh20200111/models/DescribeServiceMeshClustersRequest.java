// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshClustersRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceMeshClustersRequest</p>
 */
public class DescribeServiceMeshClustersRequest extends Request {
    @Body
    @NameInMap("Limit")
    private Long limit;

    @Body
    @NameInMap("Offset")
    private Long offset;

    @Query
    @NameInMap("ServiceMeshId")
    private String serviceMeshId;

    private DescribeServiceMeshClustersRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
        this.offset = builder.offset;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshClustersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DescribeServiceMeshClustersRequest, Builder> {
        private Long limit; 
        private Long offset; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceMeshClustersRequest request) {
            super(request);
            this.limit = request.limit;
            this.offset = request.offset;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * The maximum number of clusters in a cluster list.
         */
        public Builder limit(Long limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The position where the query starts.
         */
        public Builder offset(Long offset) {
            this.putBodyParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * The ID of the ASM instance.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putQueryParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public DescribeServiceMeshClustersRequest build() {
            return new DescribeServiceMeshClustersRequest(this);
        } 

    } 

}
