// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListHttpApiOperationsRequest} extends {@link RequestModel}
 *
 * <p>ListHttpApiOperationsRequest</p>
 */
public class ListHttpApiOperationsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpApiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("consumerAuthorizationRuleId")
    private String consumerAuthorizationRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("method")
    private String method;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

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
    @com.aliyun.core.annotation.NameInMap("pathLike")
    private String pathLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withConsumerInEnvironmentId")
    private String withConsumerInEnvironmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withConsumerInfoById")
    private String withConsumerInfoById;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withPluginAttachmentByPluginId")
    private String withPluginAttachmentByPluginId;

    private ListHttpApiOperationsRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.consumerAuthorizationRuleId = builder.consumerAuthorizationRuleId;
        this.method = builder.method;
        this.name = builder.name;
        this.nameLike = builder.nameLike;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pathLike = builder.pathLike;
        this.withConsumerInEnvironmentId = builder.withConsumerInEnvironmentId;
        this.withConsumerInfoById = builder.withConsumerInfoById;
        this.withPluginAttachmentByPluginId = builder.withPluginAttachmentByPluginId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHttpApiOperationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    /**
     * @return consumerAuthorizationRuleId
     */
    public String getConsumerAuthorizationRuleId() {
        return this.consumerAuthorizationRuleId;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return pathLike
     */
    public String getPathLike() {
        return this.pathLike;
    }

    /**
     * @return withConsumerInEnvironmentId
     */
    public String getWithConsumerInEnvironmentId() {
        return this.withConsumerInEnvironmentId;
    }

    /**
     * @return withConsumerInfoById
     */
    public String getWithConsumerInfoById() {
        return this.withConsumerInfoById;
    }

    /**
     * @return withPluginAttachmentByPluginId
     */
    public String getWithPluginAttachmentByPluginId() {
        return this.withPluginAttachmentByPluginId;
    }

    public static final class Builder extends Request.Builder<ListHttpApiOperationsRequest, Builder> {
        private String httpApiId; 
        private String consumerAuthorizationRuleId; 
        private String method; 
        private String name; 
        private String nameLike; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String pathLike; 
        private String withConsumerInEnvironmentId; 
        private String withConsumerInfoById; 
        private String withPluginAttachmentByPluginId; 

        private Builder() {
            super();
        } 

        private Builder(ListHttpApiOperationsRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.consumerAuthorizationRuleId = request.consumerAuthorizationRuleId;
            this.method = request.method;
            this.name = request.name;
            this.nameLike = request.nameLike;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pathLike = request.pathLike;
            this.withConsumerInEnvironmentId = request.withConsumerInEnvironmentId;
            this.withConsumerInfoById = request.withConsumerInfoById;
            this.withPluginAttachmentByPluginId = request.withPluginAttachmentByPluginId;
        } 

        /**
         * <p>Target HTTP API ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxx</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * <p>Filter the operation list based on a specific consumer authorization rule ID, and the interface list in the response only contains authorized operations.</p>
         * 
         * <strong>example:</strong>
         * <p>cas-xxx</p>
         */
        public Builder consumerAuthorizationRuleId(String consumerAuthorizationRuleId) {
            this.putQueryParameter("consumerAuthorizationRuleId", consumerAuthorizationRuleId);
            this.consumerAuthorizationRuleId = consumerAuthorizationRuleId;
            return this;
        }

        /**
         * <p>List interfaces by Method.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        public Builder method(String method) {
            this.putQueryParameter("method", method);
            this.method = method;
            return this;
        }

        /**
         * <p>Search operations by exact name.</p>
         * 
         * <strong>example:</strong>
         * <p>getUserInfo</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Search operations by name prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>GetUser</p>
         */
        public Builder nameLike(String nameLike) {
            this.putQueryParameter("nameLike", nameLike);
            this.nameLike = nameLike;
            return this;
        }

        /**
         * <p>Page number, starting from 1, default is 1 if not specified.</p>
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
         * <p>Page size, valid range [1, 100], default is 10 if not specified.</p>
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
         * <p>Search operations by path prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>/v1</p>
         */
        public Builder pathLike(String pathLike) {
            this.putQueryParameter("pathLike", pathLike);
            this.pathLike = pathLike;
            return this;
        }

        /**
         * <p>Each operation information in the response carries a list of authorization rules for the specified consumer under the specified environment ID. The withConsumerInEnvironmentId field needs to be additionally specified.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxx</p>
         */
        public Builder withConsumerInEnvironmentId(String withConsumerInEnvironmentId) {
            this.putQueryParameter("withConsumerInEnvironmentId", withConsumerInEnvironmentId);
            this.withConsumerInEnvironmentId = withConsumerInEnvironmentId;
            return this;
        }

        /**
         * <p>Each operation information in the response carries a list of authorization rules for the specified consumer under the specified environment ID. The withConsumerInEnvironmentId field needs to be additionally specified.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-xxx</p>
         */
        public Builder withConsumerInfoById(String withConsumerInfoById) {
            this.putQueryParameter("withConsumerInfoById", withConsumerInfoById);
            this.withConsumerInfoById = withConsumerInfoById;
            return this;
        }

        /**
         * withPluginAttachmentByPluginId.
         */
        public Builder withPluginAttachmentByPluginId(String withPluginAttachmentByPluginId) {
            this.putQueryParameter("withPluginAttachmentByPluginId", withPluginAttachmentByPluginId);
            this.withPluginAttachmentByPluginId = withPluginAttachmentByPluginId;
            return this;
        }

        @Override
        public ListHttpApiOperationsRequest build() {
            return new ListHttpApiOperationsRequest(this);
        } 

    } 

}
