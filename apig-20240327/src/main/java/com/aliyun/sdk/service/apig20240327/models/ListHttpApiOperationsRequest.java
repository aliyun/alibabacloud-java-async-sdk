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
    @com.aliyun.core.annotation.NameInMap("enableAuth")
    private Boolean enableAuth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("forDeploy")
    private Boolean forDeploy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

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
        this.enableAuth = builder.enableAuth;
        this.forDeploy = builder.forDeploy;
        this.gatewayId = builder.gatewayId;
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
     * @return enableAuth
     */
    public Boolean getEnableAuth() {
        return this.enableAuth;
    }

    /**
     * @return forDeploy
     */
    public Boolean getForDeploy() {
        return this.forDeploy;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
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
        private Boolean enableAuth; 
        private Boolean forDeploy; 
        private String gatewayId; 
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
            this.enableAuth = request.enableAuth;
            this.forDeploy = request.forDeploy;
            this.gatewayId = request.gatewayId;
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
         * <p>The ID of the target HTTP API.</p>
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
         * <p>The consumer authorization rule ID used to filter the operation list. The response includes only operations that are authorized by the specified rule.</p>
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
         * <p>The authentication enablement filter.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAuth(Boolean enableAuth) {
            this.putQueryParameter("enableAuth", enableAuth);
            this.enableAuth = enableAuth;
            return this;
        }

        /**
         * <p>Specifies whether the request is for a deployment scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder forDeploy(Boolean forDeploy) {
            this.putQueryParameter("forDeploy", forDeploy);
            this.forDeploy = forDeploy;
            return this;
        }

        /**
         * <p>The gateway ID filter.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-001</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>Lists operations by HTTP method.</p>
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
         * <p>Searches for operations by exact name match.</p>
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
         * <p>Searches for operations by name prefix.</p>
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
         * <p>The page number, starting from 1. Default value: 1.</p>
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
         * <p>The page size. Valid values: 1 to 100. Default value: 10.</p>
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
         * <p>Searches for operations by path prefix match.</p>
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
         * <p>The environment ID. When specified together with withConsumerInfoById, the response includes the authorization rule list of the specified consumer in the specified environment for each operation.</p>
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
         * <p>The consumer ID. When specified together with withConsumerInEnvironmentId, the response includes the authorization rule list of the specified consumer in the specified environment for each operation.</p>
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
         * <p>The plugin ID used to retrieve plugin deployment information.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-xxx</p>
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
