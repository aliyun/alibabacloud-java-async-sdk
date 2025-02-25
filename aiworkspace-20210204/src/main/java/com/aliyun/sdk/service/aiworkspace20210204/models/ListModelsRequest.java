// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListModelsRequest} extends {@link RequestModel}
 *
 * <p>ListModelsRequest</p>
 */
public class ListModelsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Collections")
    private String collections;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelType")
    private String modelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Origin")
    private String origin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Provider")
    private String provider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Task")
    private String task;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListModelsRequest(Builder builder) {
        super(builder);
        this.collections = builder.collections;
        this.domain = builder.domain;
        this.label = builder.label;
        this.modelName = builder.modelName;
        this.modelType = builder.modelType;
        this.order = builder.order;
        this.origin = builder.origin;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.provider = builder.provider;
        this.query = builder.query;
        this.sortBy = builder.sortBy;
        this.task = builder.task;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collections
     */
    public String getCollections() {
        return this.collections;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
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

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return task
     */
    public String getTask() {
        return this.task;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListModelsRequest, Builder> {
        private String collections; 
        private String domain; 
        private String label; 
        private String modelName; 
        private String modelType; 
        private String order; 
        private String origin; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String provider; 
        private String query; 
        private String sortBy; 
        private String task; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListModelsRequest request) {
            super(request);
            this.collections = request.collections;
            this.domain = request.domain;
            this.label = request.label;
            this.modelName = request.modelName;
            this.modelType = request.modelType;
            this.order = request.order;
            this.origin = request.origin;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.provider = request.provider;
            this.query = request.query;
            this.sortBy = request.sortBy;
            this.task = request.task;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Collections.
         */
        public Builder collections(String collections) {
            this.putQueryParameter("Collections", collections);
            this.collections = collections;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(String label) {
            this.putQueryParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * ModelName.
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * ModelType.
         */
        public Builder modelType(String modelType) {
            this.putQueryParameter("ModelType", modelType);
            this.modelType = modelType;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * Origin.
         */
        public Builder origin(String origin) {
            this.putQueryParameter("Origin", origin);
            this.origin = origin;
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
         * Provider.
         */
        public Builder provider(String provider) {
            this.putQueryParameter("Provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Task.
         */
        public Builder task(String task) {
            this.putQueryParameter("Task", task);
            this.task = task;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListModelsRequest build() {
            return new ListModelsRequest(this);
        } 

    } 

}
