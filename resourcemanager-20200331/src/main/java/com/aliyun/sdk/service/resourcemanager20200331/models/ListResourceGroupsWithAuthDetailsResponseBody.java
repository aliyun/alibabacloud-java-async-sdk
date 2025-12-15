// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link ListResourceGroupsWithAuthDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceGroupsWithAuthDetailsResponseBody</p>
 */
public class ListResourceGroupsWithAuthDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthDetails")
    private java.util.List<AuthDetails> authDetails;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroups")
    private java.util.List<ResourceGroups> resourceGroups;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListResourceGroupsWithAuthDetailsResponseBody(Builder builder) {
        this.authDetails = builder.authDetails;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resourceGroups = builder.resourceGroups;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupsWithAuthDetailsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authDetails
     */
    public java.util.List<AuthDetails> getAuthDetails() {
        return this.authDetails;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroups
     */
    public java.util.List<ResourceGroups> getResourceGroups() {
        return this.resourceGroups;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AuthDetails> authDetails; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<ResourceGroups> resourceGroups; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListResourceGroupsWithAuthDetailsResponseBody model) {
            this.authDetails = model.authDetails;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.resourceGroups = model.resourceGroups;
            this.totalCount = model.totalCount;
        } 

        /**
         * AuthDetails.
         */
        public Builder authDetails(java.util.List<AuthDetails> authDetails) {
            this.authDetails = authDetails;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>4141780B-4E3D-5D2A-A8F4-44D6D34F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroups.
         */
        public Builder resourceGroups(java.util.List<ResourceGroups> resourceGroups) {
            this.resourceGroups = resourceGroups;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListResourceGroupsWithAuthDetailsResponseBody build() {
            return new ListResourceGroupsWithAuthDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceGroupsWithAuthDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupsWithAuthDetailsResponseBody</p>
     */
    public static class AuthOfResourceGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasPermission")
        private Boolean hasPermission;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private AuthOfResourceGroups(Builder builder) {
            this.hasPermission = builder.hasPermission;
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthOfResourceGroups create() {
            return builder().build();
        }

        /**
         * @return hasPermission
         */
        public Boolean getHasPermission() {
            return this.hasPermission;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private Boolean hasPermission; 
            private String resourceGroupId; 

            private Builder() {
            } 

            private Builder(AuthOfResourceGroups model) {
                this.hasPermission = model.hasPermission;
                this.resourceGroupId = model.resourceGroupId;
            } 

            /**
             * HasPermission.
             */
            public Builder hasPermission(Boolean hasPermission) {
                this.hasPermission = hasPermission;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public AuthOfResourceGroups build() {
                return new AuthOfResourceGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourceGroupsWithAuthDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupsWithAuthDetailsResponseBody</p>
     */
    public static class AuthDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountScopeAuth")
        private Boolean accountScopeAuth;

        @com.aliyun.core.annotation.NameInMap("AuthOfResourceGroups")
        private java.util.List<AuthOfResourceGroups> authOfResourceGroups;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Service")
        private String service;

        private AuthDetails(Builder builder) {
            this.accountScopeAuth = builder.accountScopeAuth;
            this.authOfResourceGroups = builder.authOfResourceGroups;
            this.resourceType = builder.resourceType;
            this.service = builder.service;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthDetails create() {
            return builder().build();
        }

        /**
         * @return accountScopeAuth
         */
        public Boolean getAccountScopeAuth() {
            return this.accountScopeAuth;
        }

        /**
         * @return authOfResourceGroups
         */
        public java.util.List<AuthOfResourceGroups> getAuthOfResourceGroups() {
            return this.authOfResourceGroups;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        public static final class Builder {
            private Boolean accountScopeAuth; 
            private java.util.List<AuthOfResourceGroups> authOfResourceGroups; 
            private String resourceType; 
            private String service; 

            private Builder() {
            } 

            private Builder(AuthDetails model) {
                this.accountScopeAuth = model.accountScopeAuth;
                this.authOfResourceGroups = model.authOfResourceGroups;
                this.resourceType = model.resourceType;
                this.service = model.service;
            } 

            /**
             * AccountScopeAuth.
             */
            public Builder accountScopeAuth(Boolean accountScopeAuth) {
                this.accountScopeAuth = accountScopeAuth;
                return this;
            }

            /**
             * AuthOfResourceGroups.
             */
            public Builder authOfResourceGroups(java.util.List<AuthOfResourceGroups> authOfResourceGroups) {
                this.authOfResourceGroups = authOfResourceGroups;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Service.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            public AuthDetails build() {
                return new AuthDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourceGroupsWithAuthDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupsWithAuthDetailsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListResourceGroupsWithAuthDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceGroupsWithAuthDetailsResponseBody</p>
     */
    public static class ResourceGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private ResourceGroups(Builder builder) {
            this.accountId = builder.accountId;
            this.createDate = builder.createDate;
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.name = builder.name;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceGroups create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String accountId; 
            private String createDate; 
            private String displayName; 
            private String id; 
            private String name; 
            private String status; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(ResourceGroups model) {
                this.accountId = model.accountId;
                this.createDate = model.createDate;
                this.displayName = model.displayName;
                this.id = model.id;
                this.name = model.name;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public ResourceGroups build() {
                return new ResourceGroups(this);
            } 

        } 

    }
}
