// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRenderingInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListRenderingInstancesRequest</p>
 */
public class ListRenderingInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    private String renderingInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingSpec")
    private String renderingSpec;

    private ListRenderingInstancesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.renderingInstanceId = builder.renderingInstanceId;
        this.renderingSpec = builder.renderingSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRenderingInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    /**
     * @return renderingSpec
     */
    public String getRenderingSpec() {
        return this.renderingSpec;
    }

    public static final class Builder extends Request.Builder<ListRenderingInstancesRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String renderingInstanceId; 
        private String renderingSpec; 

        private Builder() {
            super();
        } 

        private Builder(ListRenderingInstancesRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.renderingInstanceId = request.renderingInstanceId;
            this.renderingSpec = request.renderingSpec;
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
         * RenderingInstanceId.
         */
        public Builder renderingInstanceId(String renderingInstanceId) {
            this.putQueryParameter("RenderingInstanceId", renderingInstanceId);
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }

        /**
         * RenderingSpec.
         */
        public Builder renderingSpec(String renderingSpec) {
            this.putQueryParameter("RenderingSpec", renderingSpec);
            this.renderingSpec = renderingSpec;
            return this;
        }

        @Override
        public ListRenderingInstancesRequest build() {
            return new ListRenderingInstancesRequest(this);
        } 

    } 

}
