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
         * <p>HTTP API ID。</p>
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
         * consumerAuthorizationRuleId.
         */
        public Builder consumerAuthorizationRuleId(String consumerAuthorizationRuleId) {
            this.putQueryParameter("consumerAuthorizationRuleId", consumerAuthorizationRuleId);
            this.consumerAuthorizationRuleId = consumerAuthorizationRuleId;
            return this;
        }

        /**
         * deployStatuses.
         */
        public Builder deployStatuses(String deployStatuses) {
            this.putQueryParameter("deployStatuses", deployStatuses);
            this.deployStatuses = deployStatuses;
            return this;
        }

        /**
         * domainId.
         */
        public Builder domainId(String domainId) {
            this.putQueryParameter("domainId", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * environmentId.
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("environmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * nameLike.
         */
        public Builder nameLike(String nameLike) {
            this.putQueryParameter("nameLike", nameLike);
            this.nameLike = nameLike;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * pathLike.
         */
        public Builder pathLike(String pathLike) {
            this.putQueryParameter("pathLike", pathLike);
            this.pathLike = pathLike;
            return this;
        }

        /**
         * withAuthPolicyInfo.
         */
        public Builder withAuthPolicyInfo(Boolean withAuthPolicyInfo) {
            this.putQueryParameter("withAuthPolicyInfo", withAuthPolicyInfo);
            this.withAuthPolicyInfo = withAuthPolicyInfo;
            return this;
        }

        /**
         * withConsumerInfoById.
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
        public ListHttpApiRoutesRequest build() {
            return new ListHttpApiRoutesRequest(this);
        } 

    } 

}
