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
 * {@link DeleteResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteResourceGroupResponseBody</p>
 */
public class DeleteResourceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroup")
    private ResourceGroup resourceGroup;

    private DeleteResourceGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceGroup = builder.resourceGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResourceGroupResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1C488B66-B819-4D14-8711-C4EAAA13AC01</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information of the resource group.</p>
         */
        public Builder resourceGroup(ResourceGroup resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public DeleteResourceGroupResponseBody build() {
            return new DeleteResourceGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteResourceGroupResponseBody</p>
     */
    public static class RegionStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the resource group. Valid values:</p>
             * <ul>
             * <li>Creating: The resource group is being created.</li>
             * <li>OK: The resource group is created.</li>
             * <li>PendingDelete: The resource group is waiting to be deleted.</li>
             * <li>Deleting: The resource group is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PendingDelete</p>
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
    /**
     * 
     * {@link DeleteResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteResourceGroupResponseBody</p>
     */
    public static class RegionStatuses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionStatus")
        private java.util.List<RegionStatus> regionStatus;

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
        public java.util.List<RegionStatus> getRegionStatus() {
            return this.regionStatus;
        }

        public static final class Builder {
            private java.util.List<RegionStatus> regionStatus; 

            /**
             * RegionStatus.
             */
            public Builder regionStatus(java.util.List<RegionStatus> regionStatus) {
                this.regionStatus = regionStatus;
                return this;
            }

            public RegionStatuses build() {
                return new RegionStatuses(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteResourceGroupResponseBody</p>
     */
    public static class ResourceGroup extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("RegionStatuses")
        private RegionStatuses regionStatuses;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The ID of the Alibaba Cloud account to which the resource group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The time when the resource group was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The display name of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>my-project</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-9gLOoK****</p>
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
             * <p>The status of the resource group in all regions.</p>
             */
            public Builder regionStatuses(RegionStatuses regionStatuses) {
                this.regionStatuses = regionStatuses;
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
             * <p>PendingDelete</p>
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
