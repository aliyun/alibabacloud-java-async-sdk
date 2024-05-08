// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApisRequest} extends {@link RequestModel}
 *
 * <p>DescribeApisRequest</p>
 */
public class DescribeApisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    private String apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiMethod")
    private String apiMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiName")
    private String apiName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiPath")
    private String apiPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogId")
    private String catalogId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableTagAuth")
    private Boolean enableTagAuth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StageName")
    private String stageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnDeployed")
    private Boolean unDeployed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Visibility")
    private String visibility;

    private DescribeApisRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
        this.apiMethod = builder.apiMethod;
        this.apiName = builder.apiName;
        this.apiPath = builder.apiPath;
        this.catalogId = builder.catalogId;
        this.enableTagAuth = builder.enableTagAuth;
        this.groupId = builder.groupId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.securityToken = builder.securityToken;
        this.stageName = builder.stageName;
        this.tag = builder.tag;
        this.unDeployed = builder.unDeployed;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return apiMethod
     */
    public String getApiMethod() {
        return this.apiMethod;
    }

    /**
     * @return apiName
     */
    public String getApiName() {
        return this.apiName;
    }

    /**
     * @return apiPath
     */
    public String getApiPath() {
        return this.apiPath;
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return enableTagAuth
     */
    public Boolean getEnableTagAuth() {
        return this.enableTagAuth;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return stageName
     */
    public String getStageName() {
        return this.stageName;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return unDeployed
     */
    public Boolean getUnDeployed() {
        return this.unDeployed;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    public static final class Builder extends Request.Builder<DescribeApisRequest, Builder> {
        private String apiId; 
        private String apiMethod; 
        private String apiName; 
        private String apiPath; 
        private String catalogId; 
        private Boolean enableTagAuth; 
        private String groupId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String securityToken; 
        private String stageName; 
        private java.util.List < Tag> tag; 
        private Boolean unDeployed; 
        private String visibility; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApisRequest request) {
            super(request);
            this.apiId = request.apiId;
            this.apiMethod = request.apiMethod;
            this.apiName = request.apiName;
            this.apiPath = request.apiPath;
            this.catalogId = request.catalogId;
            this.enableTagAuth = request.enableTagAuth;
            this.groupId = request.groupId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.securityToken = request.securityToken;
            this.stageName = request.stageName;
            this.tag = request.tag;
            this.unDeployed = request.unDeployed;
            this.visibility = request.visibility;
        } 

        /**
         * The API ID.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * The HTTP method of the API request.
         */
        public Builder apiMethod(String apiMethod) {
            this.putQueryParameter("ApiMethod", apiMethod);
            this.apiMethod = apiMethod;
            return this;
        }

        /**
         * The API name. The name is used for fuzzy match.
         */
        public Builder apiName(String apiName) {
            this.putQueryParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * The request path of the API.
         */
        public Builder apiPath(String apiPath) {
            this.putQueryParameter("ApiPath", apiPath);
            this.apiPath = apiPath;
            return this;
        }

        /**
         * The category ID.
         */
        public Builder catalogId(String catalogId) {
            this.putQueryParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * Specifies whether to enable tag verification.
         */
        public Builder enableTagAuth(Boolean enableTagAuth) {
            this.putQueryParameter("EnableTagAuth", enableTagAuth);
            this.enableTagAuth = enableTagAuth;
            return this;
        }

        /**
         * The API group ID.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * The environment in which you want to perform this operation. Valid values:
         * <p>
         * 
         * *   **RELEASE**: the production environment
         * *   **PRE**: the staging environment
         * *   **TEST**: the test environment
         */
        public Builder stageName(String stageName) {
            this.putQueryParameter("StageName", stageName);
            this.stageName = stageName;
            return this;
        }

        /**
         * The tags of objects that match the rule.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * Specifies whether to filter unpublished APIs.
         */
        public Builder unDeployed(Boolean unDeployed) {
            this.putQueryParameter("UnDeployed", unDeployed);
            this.unDeployed = unDeployed;
            return this;
        }

        /**
         * Specifies whether the API is public. Valid values:
         * <p>
         * 
         * *   **PUBLIC**: The API is public. If you publish the definition of a public API to the production environment, the definition is displayed on the APIs page for all users.
         * *   **PRIVATE**: The API is private. If you publish an API group that contains a private API in Alibaba Cloud Marketplace, the API is not displayed in Alibaba Cloud Marketplace.
         */
        public Builder visibility(String visibility) {
            this.putQueryParameter("Visibility", visibility);
            this.visibility = visibility;
            return this;
        }

        @Override
        public DescribeApisRequest build() {
            return new DescribeApisRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
