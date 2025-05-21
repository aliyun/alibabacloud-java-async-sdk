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
 * {@link ListHttpApiRoutesRequest} extends {@link RequestModel}
 *
 * <p>ListHttpApiRoutesRequest</p>
 */
public class ListHttpApiRoutesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    private String httpApiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("consumerAuthorizationRuleId")
    private String consumerAuthorizationRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deployStatuses")
    private String deployStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("domainId")
    private String domainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("environmentId")
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("forDeploy")
    private Boolean forDeploy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

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
    @com.aliyun.core.annotation.NameInMap("withAuthPolicyInfo")
    private Boolean withAuthPolicyInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withConsumerInfoById")
    private String withConsumerInfoById;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withPluginAttachmentByPluginId")
    private String withPluginAttachmentByPluginId;

    private ListHttpApiRoutesRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.consumerAuthorizationRuleId = builder.consumerAuthorizationRuleId;
        this.deployStatuses = builder.deployStatuses;
        this.domainId = builder.domainId;
        this.environmentId = builder.environmentId;
        this.forDeploy = builder.forDeploy;
        this.gatewayId = builder.gatewayId;
        this.name = builder.name;
        this.nameLike = builder.nameLike;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pathLike = builder.pathLike;
        this.withAuthPolicyInfo = builder.withAuthPolicyInfo;
        this.withConsumerInfoById = builder.withConsumerInfoById;
        this.withPluginAttachmentByPluginId = builder.withPluginAttachmentByPluginId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHttpApiRoutesRequest create() {
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
     * @return deployStatuses
     */
    public String getDeployStatuses() {
        return this.deployStatuses;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
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
     * @return withAuthPolicyInfo
     */
    public Boolean getWithAuthPolicyInfo() {
        return this.withAuthPolicyInfo;
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

    public static final class Builder extends Request.Builder<ListHttpApiRoutesRequest, Builder> {
        private String httpApiId; 
        private String consumerAuthorizationRuleId; 
        private String deployStatuses; 
        private String domainId; 
        private String environmentId; 
        private Boolean forDeploy; 
        private String gatewayId; 
        private String name; 
        private String nameLike; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String pathLike; 
        private Boolean withAuthPolicyInfo; 
        private String withConsumerInfoById; 
        private String withPluginAttachmentByPluginId; 

        private Builder() {
            super();
        } 

        private Builder(ListHttpApiRoutesRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.consumerAuthorizationRuleId = request.consumerAuthorizationRuleId;
            this.deployStatuses = request.deployStatuses;
            this.domainId = request.domainId;
            this.environmentId = request.environmentId;
            this.forDeploy = request.forDeploy;
            this.gatewayId = request.gatewayId;
            this.name = request.name;
            this.nameLike = request.nameLike;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pathLike = request.pathLike;
            this.withAuthPolicyInfo = request.withAuthPolicyInfo;
            this.withConsumerInfoById = request.withConsumerInfoById;
            this.withPluginAttachmentByPluginId = request.withPluginAttachmentByPluginId;
        } 

        /**
         * <p>The HTTP API ID.</p>
         * 
         * <strong>example:</strong>
         * <p>api-cr68g1dlhtgm31f***</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * <p>The string that is used to filter routes based on consumer authentication rules. Only authorized APIs are returned.</p>
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
         * <p>The deployment state of the route.</p>
         * <p>Enumerated values:</p>
         * <ul>
         * <li>Deploying: The route is being deployed.</li>
         * <li>DeployedWithChanges: The route is deployed and modified.</li>
         * <li>Undeploying: The route is being undeployed.</li>
         * <li>NotDeployed: The route is not deployed.</li>
         * <li>Deployed: The route is deployed.</li>
         * <li>UndeployFailed: The route failed to be undeployed.</li>
         * <li>DeployFailed: The route failed to be deployed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NotDeployed</p>
         */
        public Builder deployStatuses(String deployStatuses) {
            this.putQueryParameter("deployStatuses", deployStatuses);
            this.deployStatuses = deployStatuses;
            return this;
        }

        /**
         * <p>Specifies to filter routes by domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-xxx</p>
         */
        public Builder domainId(String domainId) {
            this.putQueryParameter("domainId", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-cpqnr6tlhtgubc***</p>
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("environmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * forDeploy.
         */
        public Builder forDeploy(Boolean forDeploy) {
            this.putQueryParameter("forDeploy", forDeploy);
            this.forDeploy = forDeploy;
            return this;
        }

        /**
         * <p>The ID of the Cloud-native API Gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cpv4sqdl****</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The route name.</p>
         * 
         * <strong>example:</strong>
         * <p>itemcenter-gateway</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The route name keyword for a fuzzy search.</p>
         * 
         * <strong>example:</strong>
         * <p>item</p>
         */
        public Builder nameLike(String nameLike) {
            this.putQueryParameter("nameLike", nameLike);
            this.nameLike = nameLike;
            return this;
        }

        /**
         * <p>The page number of the page to return. Pages start from page 1. Default value: 1.</p>
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
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
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
         * <p>The route path keyword for a fuzzy search.</p>
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
         * <p>The consumer authorization information in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder withAuthPolicyInfo(Boolean withAuthPolicyInfo) {
            this.putQueryParameter("withAuthPolicyInfo", withAuthPolicyInfo);
            this.withAuthPolicyInfo = withAuthPolicyInfo;
            return this;
        }

        /**
         * <p>The authentication rules of the specified consumer in each route returned.</p>
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
         * <p>The mounting information of the specified plug-in in each route returned.</p>
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
        public ListHttpApiRoutesRequest build() {
            return new ListHttpApiRoutesRequest(this);
        } 

    } 

}
