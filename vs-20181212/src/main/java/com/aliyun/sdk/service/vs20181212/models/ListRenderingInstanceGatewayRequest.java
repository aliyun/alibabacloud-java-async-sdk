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
 * {@link ListRenderingInstanceGatewayRequest} extends {@link RequestModel}
 *
 * <p>ListRenderingInstanceGatewayRequest</p>
 */
public class ListRenderingInstanceGatewayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayInstanceId")
    private String gatewayInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    private String renderingInstanceId;

    private ListRenderingInstanceGatewayRequest(Builder builder) {
        super(builder);
        this.gatewayInstanceId = builder.gatewayInstanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.renderingInstanceId = builder.renderingInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRenderingInstanceGatewayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayInstanceId
     */
    public String getGatewayInstanceId() {
        return this.gatewayInstanceId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public static final class Builder extends Request.Builder<ListRenderingInstanceGatewayRequest, Builder> {
        private String gatewayInstanceId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String renderingInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ListRenderingInstanceGatewayRequest request) {
            super(request);
            this.gatewayInstanceId = request.gatewayInstanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.renderingInstanceId = request.renderingInstanceId;
        } 

        /**
         * GatewayInstanceId.
         */
        public Builder gatewayInstanceId(String gatewayInstanceId) {
            this.putQueryParameter("GatewayInstanceId", gatewayInstanceId);
            this.gatewayInstanceId = gatewayInstanceId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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

        @Override
        public ListRenderingInstanceGatewayRequest build() {
            return new ListRenderingInstanceGatewayRequest(this);
        } 

    } 

}
