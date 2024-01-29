// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateResourceGroupResponseBody</p>
 */
public class CreateResourceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroup")
    private ResourceGroup resourceGroup;

    private CreateResourceGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceGroup = builder.resourceGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceGroupResponseBody create() {
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

        public CreateResourceGroupResponseBody build() {
            return new CreateResourceGroupResponseBody(this);
        } 

    } 

    public static class RegionStatus extends TeaModel {
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        private RegionStatus(Builder builder) {
            this.regionId = builder.regionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionStatus create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String regionId; 
            private String status; 

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The status of the resource group. Valid values:
             * <p>
             * 
             * *   Creating: The resource group is being created.
             * *   OK: The resource group is created.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RegionStatus build() {
                return new RegionStatus(this);
            } 

        } 

    }
    public static class RegionStatuses extends TeaModel {
        @NameInMap("RegionStatus")
        private java.util.List < RegionStatus> regionStatus;

        private RegionStatuses(Builder builder) {
            this.regionStatus = builder.regionStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionStatuses create() {
            return builder().build();
        }

        /**
         * @return regionStatus
         */
        public java.util.List < RegionStatus> getRegionStatus() {
            return this.regionStatus;
        }

        public static final class Builder {
            private java.util.List < RegionStatus> regionStatus; 

            /**
             * RegionStatus.
             */
            public Builder regionStatus(java.util.List < RegionStatus> regionStatus) {
                this.regionStatus = regionStatus;
                return this;
            }

            public RegionStatuses build() {
                return new RegionStatuses(this);
            } 

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

        @NameInMap("RegionStatuses")
        private RegionStatuses regionStatuses;

        @NameInMap("Status")
        private String status;

        private ResourceGroup(Builder builder) {
            this.accountId = builder.accountId;
            this.createDate = builder.createDate;
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.name = builder.name;
            this.regionStatuses = builder.regionStatuses;
            this.status = builder.status;
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

        /**
         * @return regionStatuses
         */
        public RegionStatuses getRegionStatuses() {
            return this.regionStatuses;
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
            private RegionStatuses regionStatuses; 
            private String status; 

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

            /**
             * The status of the resource group in all regions.
             */
            public Builder regionStatuses(RegionStatuses regionStatuses) {
                this.regionStatuses = regionStatuses;
                return this;
            }

            /**
             * The status of the resource group. Valid values:
             * <p>
             * 
             * *   Creating: The resource group is being created.
             * *   OK: The resource group is created.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ResourceGroup build() {
                return new ResourceGroup(this);
            } 

        } 

    }
}
