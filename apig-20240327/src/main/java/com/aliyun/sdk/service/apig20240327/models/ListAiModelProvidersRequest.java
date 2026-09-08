// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListAiModelProvidersRequest} extends {@link RequestModel}
 *
 * <p>ListAiModelProvidersRequest</p>
 */
public class ListAiModelProvidersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    private ListAiModelProvidersRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.provider = builder.provider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAiModelProvidersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
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
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    public static final class Builder extends Request.Builder<ListAiModelProvidersRequest, Builder> {
        private String gatewayId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String provider; 

        private Builder() {
            super();
        } 

        private Builder(ListAiModelProvidersRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.provider = request.provider;
        } 

        /**
         * <p>The ID of the AI gateway instance. The target instance must exist, belong to the current account, and be of the AI gateway type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-8c13d2b4f8a1</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The page number. Default value: 1. The value must be greater than or equal to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Valid values: 1 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The fuzzy match condition for the model provider identifier. If left empty, all model providers under the current gateway are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        public Builder provider(String provider) {
            this.putQueryParameter("provider", provider);
            this.provider = provider;
            return this;
        }

        @Override
        public ListAiModelProvidersRequest build() {
            return new ListAiModelProvidersRequest(this);
        } 

    } 

}
