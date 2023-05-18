// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateResourceGroupResponseBody</p>
 */
public class UpdateResourceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroup")
    private ResourceGroup resourceGroup;

    private UpdateResourceGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceGroup = builder.resourceGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroup
     */
    public ResourceGroup getResourceGroup() {
        return this.resourceGroup;
    }

    public static final class Builder {
        private String requestId; 
        private ResourceGroup resourceGroup; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information of the resource group.
         */
        public Builder resourceGroup(ResourceGroup resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public UpdateResourceGroupResponseBody build() {
            return new UpdateResourceGroupResponseBody(this);
        } 

    } 

    public static class ResourceGroup extends TeaModel {
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

        private ResourceGroup(Builder builder) {
            this.accountId = builder.accountId;
            this.createDate = builder.createDate;
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceGroup create() {
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

        public static final class Builder {
            private String accountId; 
            private String createDate; 
            private String displayName; 
            private String id; 
            private String name; 

            /**
             * The ID of the Alibaba Cloud account to which the resource group belongs.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The time when the resource group was created. The time is displayed in UTC.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The display name of the resource group.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The unique identifier of the resource group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ResourceGroup build() {
                return new ResourceGroup(this);
            } 

        } 

    }
}
