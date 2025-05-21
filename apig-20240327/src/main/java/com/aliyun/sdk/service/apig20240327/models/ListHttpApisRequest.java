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
 * {@link ListHttpApisRequest} extends {@link RequestModel}
 *
 * <p>ListHttpApisRequest</p>
 */
public class ListHttpApisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayType")
    private String gatewayType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("types")
    private String types;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withAPIsPublishedToEnvironment")
    private Boolean withAPIsPublishedToEnvironment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withAuthPolicyInEnvironmentId")
    private String withAuthPolicyInEnvironmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withAuthPolicyList")
    private Boolean withAuthPolicyList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withConsumerInfoById")
    private String withConsumerInfoById;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withEnvironmentInfo")
    private Boolean withEnvironmentInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withEnvironmentInfoById")
    private String withEnvironmentInfoById;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withIngressInfo")
    private Boolean withIngressInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withPluginAttachmentByPluginId")
    private String withPluginAttachmentByPluginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withPolicyConfigs")
    private Boolean withPolicyConfigs;

    private ListHttpApisRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.gatewayType = builder.gatewayType;
        this.keyword = builder.keyword;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.types = builder.types;
        this.withAPIsPublishedToEnvironment = builder.withAPIsPublishedToEnvironment;
        this.withAuthPolicyInEnvironmentId = builder.withAuthPolicyInEnvironmentId;
        this.withAuthPolicyList = builder.withAuthPolicyList;
        this.withConsumerInfoById = builder.withConsumerInfoById;
        this.withEnvironmentInfo = builder.withEnvironmentInfo;
        this.withEnvironmentInfoById = builder.withEnvironmentInfoById;
        this.withIngressInfo = builder.withIngressInfo;
        this.withPluginAttachmentByPluginId = builder.withPluginAttachmentByPluginId;
        this.withPolicyConfigs = builder.withPolicyConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHttpApisRequest create() {
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
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    /**
     * @return types
     */
    public String getTypes() {
        return this.types;
    }

    /**
     * @return withAPIsPublishedToEnvironment
     */
    public Boolean getWithAPIsPublishedToEnvironment() {
        return this.withAPIsPublishedToEnvironment;
    }

    /**
     * @return withAuthPolicyInEnvironmentId
     */
    public String getWithAuthPolicyInEnvironmentId() {
        return this.withAuthPolicyInEnvironmentId;
    }

    /**
     * @return withAuthPolicyList
     */
    public Boolean getWithAuthPolicyList() {
        return this.withAuthPolicyList;
    }

    /**
     * @return withConsumerInfoById
     */
    public String getWithConsumerInfoById() {
        return this.withConsumerInfoById;
    }

    /**
     * @return withEnvironmentInfo
     */
    public Boolean getWithEnvironmentInfo() {
        return this.withEnvironmentInfo;
    }

    /**
     * @return withEnvironmentInfoById
     */
    public String getWithEnvironmentInfoById() {
        return this.withEnvironmentInfoById;
    }

    /**
     * @return withIngressInfo
     */
    public Boolean getWithIngressInfo() {
        return this.withIngressInfo;
    }

    /**
     * @return withPluginAttachmentByPluginId
     */
    public String getWithPluginAttachmentByPluginId() {
        return this.withPluginAttachmentByPluginId;
    }

    /**
     * @return withPolicyConfigs
     */
    public Boolean getWithPolicyConfigs() {
        return this.withPolicyConfigs;
    }

    public static final class Builder extends Request.Builder<ListHttpApisRequest, Builder> {
        private String gatewayId; 
        private String gatewayType; 
        private String keyword; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 
        private String types; 
        private Boolean withAPIsPublishedToEnvironment; 
        private String withAuthPolicyInEnvironmentId; 
        private Boolean withAuthPolicyList; 
        private String withConsumerInfoById; 
        private Boolean withEnvironmentInfo; 
        private String withEnvironmentInfoById; 
        private Boolean withIngressInfo; 
        private String withPluginAttachmentByPluginId; 
        private Boolean withPolicyConfigs; 

        private Builder() {
            super();
        } 

        private Builder(ListHttpApisRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.gatewayType = request.gatewayType;
            this.keyword = request.keyword;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.types = request.types;
            this.withAPIsPublishedToEnvironment = request.withAPIsPublishedToEnvironment;
            this.withAuthPolicyInEnvironmentId = request.withAuthPolicyInEnvironmentId;
            this.withAuthPolicyList = request.withAuthPolicyList;
            this.withConsumerInfoById = request.withConsumerInfoById;
            this.withEnvironmentInfo = request.withEnvironmentInfo;
            this.withEnvironmentInfoById = request.withEnvironmentInfoById;
            this.withIngressInfo = request.withIngressInfo;
            this.withPluginAttachmentByPluginId = request.withPluginAttachmentByPluginId;
            this.withPolicyConfigs = request.withPolicyConfigs;
        } 

        /**
         * <p>The ID of the Cloud-native API Gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cq2avtllh****</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * gatewayType.
         */
        public Builder gatewayType(String gatewayType) {
            this.putQueryParameter("gatewayType", gatewayType);
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * <p>The search keyword. You can fuzzy-search by API name or exact-search by API ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test-</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The API name that is used for the search. In this case, exact search is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>login</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-ahr5uil8raz0rq3b</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The API type. You can specify multiple types and separate them with a comma (,).</p>
         * <ul>
         * <li>Http</li>
         * <li>Rest</li>
         * <li>WebSocket</li>
         * <li>HttpIngress</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Http,Rest</p>
         */
        public Builder types(String types) {
            this.putQueryParameter("types", types);
            this.types = types;
            return this;
        }

        /**
         * withAPIsPublishedToEnvironment.
         */
        public Builder withAPIsPublishedToEnvironment(Boolean withAPIsPublishedToEnvironment) {
            this.putQueryParameter("withAPIsPublishedToEnvironment", withAPIsPublishedToEnvironment);
            this.withAPIsPublishedToEnvironment = withAPIsPublishedToEnvironment;
            return this;
        }

        /**
         * <p>The consumer authentication policy in the specified environment in each returned API.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxx</p>
         */
        public Builder withAuthPolicyInEnvironmentId(String withAuthPolicyInEnvironmentId) {
            this.putQueryParameter("withAuthPolicyInEnvironmentId", withAuthPolicyInEnvironmentId);
            this.withAuthPolicyInEnvironmentId = withAuthPolicyInEnvironmentId;
            return this;
        }

        /**
         * <p>Specifies whether authentication is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder withAuthPolicyList(Boolean withAuthPolicyList) {
            this.putQueryParameter("withAuthPolicyList", withAuthPolicyList);
            this.withAuthPolicyList = withAuthPolicyList;
            return this;
        }

        /**
         * <p>The authorization rules of the specified consumer in each returned API.</p>
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
         * <p>The environment information.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder withEnvironmentInfo(Boolean withEnvironmentInfo) {
            this.putQueryParameter("withEnvironmentInfo", withEnvironmentInfo);
            this.withEnvironmentInfo = withEnvironmentInfo;
            return this;
        }

        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-ctovu5mm1hksb4q8ln40</p>
         */
        public Builder withEnvironmentInfoById(String withEnvironmentInfoById) {
            this.putQueryParameter("withEnvironmentInfoById", withEnvironmentInfoById);
            this.withEnvironmentInfoById = withEnvironmentInfoById;
            return this;
        }

        /**
         * <p>The Ingress information.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder withIngressInfo(Boolean withIngressInfo) {
            this.putQueryParameter("withIngressInfo", withIngressInfo);
            this.withIngressInfo = withIngressInfo;
            return this;
        }

        /**
         * <p>The plug-in ID. You can use the returned value of this parameter to query the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-ct9qn3um1hktue8dqol0</p>
         */
        public Builder withPluginAttachmentByPluginId(String withPluginAttachmentByPluginId) {
            this.putQueryParameter("withPluginAttachmentByPluginId", withPluginAttachmentByPluginId);
            this.withPluginAttachmentByPluginId = withPluginAttachmentByPluginId;
            return this;
        }

        /**
         * withPolicyConfigs.
         */
        public Builder withPolicyConfigs(Boolean withPolicyConfigs) {
            this.putQueryParameter("withPolicyConfigs", withPolicyConfigs);
            this.withPolicyConfigs = withPolicyConfigs;
            return this;
        }

        @Override
        public ListHttpApisRequest build() {
            return new ListHttpApisRequest(this);
        } 

    } 

}
