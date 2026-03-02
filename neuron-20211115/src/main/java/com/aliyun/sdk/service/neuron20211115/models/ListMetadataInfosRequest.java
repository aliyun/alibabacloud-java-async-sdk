// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ListMetadataInfosRequest} extends {@link RequestModel}
 *
 * <p>ListMetadataInfosRequest</p>
 */
public class ListMetadataInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("env")
    private String env;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("namespace_id")
    private Long namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("namespace_name")
    private String namespaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("order_by")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("order_direction")
    private String orderDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("org_id")
    private Integer orgId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_number")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_size")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pbc_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pbcId;

    private ListMetadataInfosRequest(Builder builder) {
        super(builder);
        this.env = builder.env;
        this.namespaceId = builder.namespaceId;
        this.namespaceName = builder.namespaceName;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
        this.orgId = builder.orgId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pbcId = builder.pbcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetadataInfosRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return namespaceId
     */
    public Long getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return orgId
     */
    public Integer getOrgId() {
        return this.orgId;
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
     * @return pbcId
     */
    public Long getPbcId() {
        return this.pbcId;
    }

    public static final class Builder extends Request.Builder<ListMetadataInfosRequest, Builder> {
        private String env; 
        private Long namespaceId; 
        private String namespaceName; 
        private String orderBy; 
        private String orderDirection; 
        private Integer orgId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long pbcId; 

        private Builder() {
            super();
        } 

        private Builder(ListMetadataInfosRequest request) {
            super(request);
            this.env = request.env;
            this.namespaceId = request.namespaceId;
            this.namespaceName = request.namespaceName;
            this.orderBy = request.orderBy;
            this.orderDirection = request.orderDirection;
            this.orgId = request.orgId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pbcId = request.pbcId;
        } 

        /**
         * env.
         */
        public Builder env(String env) {
            this.putQueryParameter("env", env);
            this.env = env;
            return this;
        }

        /**
         * namespace_id.
         */
        public Builder namespaceId(Long namespaceId) {
            this.putQueryParameter("namespace_id", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * namespace_name.
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("namespace_name", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * order_by.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("order_by", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * order_direction.
         */
        public Builder orderDirection(String orderDirection) {
            this.putQueryParameter("order_direction", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * org_id.
         */
        public Builder orgId(Integer orgId) {
            this.putQueryParameter("org_id", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * page_number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("page_number", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * page_size.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pbcId(Long pbcId) {
            this.putQueryParameter("pbc_id", pbcId);
            this.pbcId = pbcId;
            return this;
        }

        @Override
        public ListMetadataInfosRequest build() {
            return new ListMetadataInfosRequest(this);
        } 

    } 

}
