// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePurchasedApiGroupDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePurchasedApiGroupDetailResponseBody</p>
 */
public class DescribePurchasedApiGroupDetailResponseBody extends TeaModel {
    @NameInMap("CreatedTime")
    private String createdTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("DomainItems")
    private DomainItems domainItems;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("GroupName")
    private String groupName;

    @NameInMap("ModifiedTime")
    private String modifiedTime;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribePurchasedApiGroupDetailResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.domainItems = builder.domainItems;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.modifiedTime = builder.modifiedTime;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePurchasedApiGroupDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainItems
     */
    public DomainItems getDomainItems() {
        return this.domainItems;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String createdTime; 
        private String description; 
        private DomainItems domainItems; 
        private String groupId; 
        private String groupName; 
        private String modifiedTime; 
        private String regionId; 
        private String requestId; 
        private String status; 

        /**
         * CreatedTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DomainItems.
         */
        public Builder domainItems(DomainItems domainItems) {
            this.domainItems = domainItems;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * ModifiedTime.
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribePurchasedApiGroupDetailResponseBody build() {
            return new DescribePurchasedApiGroupDetailResponseBody(this);
        } 

    } 

    public static class DomainItem extends TeaModel {
        @NameInMap("DomainName")
        private String domainName;

        private DomainItem(Builder builder) {
            this.domainName = builder.domainName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainItem create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        public static final class Builder {
            private String domainName; 

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            public DomainItem build() {
                return new DomainItem(this);
            } 

        } 

    }
    public static class DomainItems extends TeaModel {
        @NameInMap("DomainItem")
        private java.util.List < DomainItem> domainItem;

        private DomainItems(Builder builder) {
            this.domainItem = builder.domainItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainItems create() {
            return builder().build();
        }

        /**
         * @return domainItem
         */
        public java.util.List < DomainItem> getDomainItem() {
            return this.domainItem;
        }

        public static final class Builder {
            private java.util.List < DomainItem> domainItem; 

            /**
             * DomainItem.
             */
            public Builder domainItem(java.util.List < DomainItem> domainItem) {
                this.domainItem = domainItem;
                return this;
            }

            public DomainItems build() {
                return new DomainItems(this);
            } 

        } 

    }
}
