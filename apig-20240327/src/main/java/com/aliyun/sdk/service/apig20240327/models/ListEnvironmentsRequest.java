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
 * {@link ListEnvironmentsRequest} extends {@link RequestModel}
 *
 * <p>ListEnvironmentsRequest</p>
 */
public class ListEnvironmentsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("aliasLike")
    private String aliasLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayNameLike")
    private String gatewayNameLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayType")
    private String gatewayType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nameLike")
    private String nameLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    private ListEnvironmentsRequest(Builder builder) {
        super(builder);
        this.aliasLike = builder.aliasLike;
        this.gatewayId = builder.gatewayId;
        this.gatewayNameLike = builder.gatewayNameLike;
        this.gatewayType = builder.gatewayType;
        this.nameLike = builder.nameLike;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliasLike
     */
    public String getAliasLike() {
        return this.aliasLike;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayNameLike
     */
    public String getGatewayNameLike() {
        return this.gatewayNameLike;
    }

    /**
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * @return nameLike
     */
    public String getNameLike() {
        return this.nameLike;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ListEnvironmentsRequest, Builder> {
        private String aliasLike; 
        private String gatewayId; 
        private String gatewayNameLike; 
        private String gatewayType; 
        private String nameLike; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListEnvironmentsRequest request) {
            super(request);
            this.aliasLike = request.aliasLike;
            this.gatewayId = request.gatewayId;
            this.gatewayNameLike = request.gatewayNameLike;
            this.gatewayType = request.gatewayType;
            this.nameLike = request.nameLike;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The environment alias. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        public Builder aliasLike(String aliasLike) {
            this.putQueryParameter("aliasLike", aliasLike);
            this.aliasLike = aliasLike;
            return this;
        }

        /**
         * <p>The gateway ID. Exact match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cptv6ktlhtgnqr73h8d1</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The gateway name. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test-gw</p>
         */
        public Builder gatewayNameLike(String gatewayNameLike) {
            this.putQueryParameter("gatewayNameLike", gatewayNameLike);
            this.gatewayNameLike = gatewayNameLike;
            return this;
        }

        /**
         * <p>The gateway type.</p>
         * 
         * <strong>example:</strong>
         * <p>APIGateway</p>
         */
        public Builder gatewayType(String gatewayType) {
            this.putQueryParameter("gatewayType", gatewayType);
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * <p>The environment name. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder nameLike(String nameLike) {
            this.putQueryParameter("nameLike", nameLike);
            this.nameLike = nameLike;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
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
         * <p>The number of entries per page. Default value: 10.</p>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2nqpppkzplmq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ListEnvironmentsRequest build() {
            return new ListEnvironmentsRequest(this);
        } 

    } 

}
