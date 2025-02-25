// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link ListMultiAccountResourceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMultiAccountResourceGroupsResponseBody</p>
 */
public class ListMultiAccountResourceGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroups")
    private java.util.List<ResourceGroups> resourceGroups;

    private ListMultiAccountResourceGroupsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resourceGroups = builder.resourceGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMultiAccountResourceGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List<ResourceGroups> resourceGroups; 

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAU5VsT9R1adMTuz9GzginZ3Y+7Y/5JATS+6q5GK9kT75</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0FF0A66E-781F-51EE-9531-928F197558F2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the resource groups.</p>
         */
        public Builder resourceGroups(java.util.List<ResourceGroups> resourceGroups) {
            this.resourceGroups = resourceGroups;
            return this;
        }

        public ListMultiAccountResourceGroupsResponseBody build() {
            return new ListMultiAccountResourceGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMultiAccountResourceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiAccountResourceGroupsResponseBody</p>
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

        private ResourceGroups(Builder builder) {
            this.accountId = builder.accountId;
            this.createDate = builder.createDate;
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.name = builder.name;
            this.status = builder.status;
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

        public static final class Builder {
            private String accountId; 
            private String createDate; 
            private String displayName; 
            private String id; 
            private String name; 
            private String status; 

            /**
             * <p>The ID of the management account or member of the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>1394339739****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The time when the resource group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-30T09:20:08Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The display name of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>group1</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmzawhxxc****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The unique identifier of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>my-project</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the resource group. Valid values:</p>
             * <ul>
             * <li>Creating: The resource group is being created.</li>
             * <li>OK: The resource group is created.</li>
             * <li>PendingDelete: The resource group is waiting to be deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ResourceGroups build() {
                return new ResourceGroups(this);
            } 

        } 

    }
}
