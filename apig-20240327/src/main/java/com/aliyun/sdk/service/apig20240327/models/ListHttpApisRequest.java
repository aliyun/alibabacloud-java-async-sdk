// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
    @com.aliyun.core.annotation.NameInMap("withConsumerInfoById")
    private String withConsumerInfoById;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withEnvironmentInfo")
    private Boolean withEnvironmentInfo;

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
        this.withConsumerInfoById = builder.withConsumerInfoById;
        this.withEnvironmentInfo = builder.withEnvironmentInfo;
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

    public static final class Builder extends Request.Builder<ListHttpApisRequest, Builder> {
        private String gatewayId; 
        private String keyword; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 
        private String types; 
        private String withAuthPolicyInEnvironmentId; 
        private String withConsumerInfoById; 
        private Boolean withEnvironmentInfo; 

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
            this.withConsumerInfoById = request.withConsumerInfoById;
            this.withEnvironmentInfo = request.withEnvironmentInfo;
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
         * <p>Page number, starting from 1, default is 1 if not provided.</p>
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
         * <p>Page size, valid range [1, 100], default is 10 if not provided.</p>
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
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Type of HTTP API. Supports multiple types, separated by &quot;,&quot;.</p>
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
         * <p>Each API information in the response carries consumer authentication policy information under the specified environment ID.</p>
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
         * withEnvironmentInfo.
         */
        public Builder withEnvironmentInfo(Boolean withEnvironmentInfo) {
            this.putQueryParameter("withEnvironmentInfo", withEnvironmentInfo);
            this.withEnvironmentInfo = withEnvironmentInfo;
            return this;
        }

        @Override
        public ListHttpApisRequest build() {
            return new ListHttpApisRequest(this);
        } 

    } 

}
