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

    private ListHttpApisRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.keyword = builder.keyword;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.types = builder.types;
        this.withAuthPolicyInEnvironmentId = builder.withAuthPolicyInEnvironmentId;
        this.withAuthPolicyList = builder.withAuthPolicyList;
        this.withConsumerInfoById = builder.withConsumerInfoById;
        this.withEnvironmentInfo = builder.withEnvironmentInfo;
        this.withEnvironmentInfoById = builder.withEnvironmentInfoById;
        this.withIngressInfo = builder.withIngressInfo;
        this.withPluginAttachmentByPluginId = builder.withPluginAttachmentByPluginId;
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

    public static final class Builder extends Request.Builder<ListHttpApisRequest, Builder> {
        private String gatewayId; 
        private String keyword; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 
        private String types; 
        private String withAuthPolicyInEnvironmentId; 
        private Boolean withAuthPolicyList; 
        private String withConsumerInfoById; 
        private Boolean withEnvironmentInfo; 
        private String withEnvironmentInfoById; 
        private Boolean withIngressInfo; 
        private String withPluginAttachmentByPluginId; 

        private Builder() {
            super();
        } 

        private Builder(ListHttpApisRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.keyword = request.keyword;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.types = request.types;
            this.withAuthPolicyInEnvironmentId = request.withAuthPolicyInEnvironmentId;
            this.withAuthPolicyList = request.withAuthPolicyList;
            this.withConsumerInfoById = request.withConsumerInfoById;
            this.withEnvironmentInfo = request.withEnvironmentInfo;
            this.withEnvironmentInfoById = request.withEnvironmentInfoById;
            this.withIngressInfo = request.withIngressInfo;
            this.withPluginAttachmentByPluginId = request.withPluginAttachmentByPluginId;
        } 

        /**
         * <p>Cloud-native API Gateway ID.</p>
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
         * <p>Search keyword, supports fuzzy search by API name or exact search by API ID.</p>
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
         * <p>Exact search by name.</p>
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
         * <p>Resource group ID.</p>
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
         * <p>Type of HTTP API. Multiple types can be passed, separated by &quot;,&quot;.</p>
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
         * <p>Each API information in the response carries consumer authentication policy information for the specified environment ID.</p>
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
         * <p>Whether the authentication policy is enabled.</p>
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
         * <p>Each API information in the response carries a list of authorization rules for the specified consumer ID.</p>
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
         * <p>Environment information</p>
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
         * <p>Environment ID</p>
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
         * <p>Ingress information</p>
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
         * <p>Plugin ID, used to get plugin release information based on this ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-ct9qn3um1hktue8dqol0</p>
         */
        public Builder withPluginAttachmentByPluginId(String withPluginAttachmentByPluginId) {
            this.putQueryParameter("withPluginAttachmentByPluginId", withPluginAttachmentByPluginId);
            this.withPluginAttachmentByPluginId = withPluginAttachmentByPluginId;
            return this;
        }

        @Override
        public ListHttpApisRequest build() {
            return new ListHttpApisRequest(this);
        } 

    } 

}
