// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMultiAccountResourceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMultiAccountResourceGroupsResponseBody</p>
 */
public class ListMultiAccountResourceGroupsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroups")
    private java.util.List < ResourceGroups> resourceGroups;

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
    public java.util.List < ResourceGroups> getResourceGroups() {
        return this.resourceGroups;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < ResourceGroups> resourceGroups; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroups.
         */
        public Builder resourceGroups(java.util.List < ResourceGroups> resourceGroups) {
            this.resourceGroups = resourceGroups;
            return this;
        }

        public ListMultiAccountResourceGroupsResponseBody build() {
            return new ListMultiAccountResourceGroupsResponseBody(this);
        } 

    } 

    public static class ResourceGroups extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Status")
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

            public ResourceGroups build() {
                return new ResourceGroups(this);
            } 

        } 

    }
}
