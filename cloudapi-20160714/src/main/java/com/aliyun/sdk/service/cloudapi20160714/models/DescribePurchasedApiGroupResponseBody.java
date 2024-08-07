// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePurchasedApiGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePurchasedApiGroupResponseBody</p>
 */
public class DescribePurchasedApiGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Domains")
    private Domains domains;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("PurchasedTime")
    private String purchasedTime;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribePurchasedApiGroupResponseBody(Builder builder) {
        this.description = builder.description;
        this.domains = builder.domains;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.purchasedTime = builder.purchasedTime;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePurchasedApiGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domains
     */
    public Domains getDomains() {
        return this.domains;
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
     * @return purchasedTime
     */
    public String getPurchasedTime() {
        return this.purchasedTime;
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
        private String description; 
        private Domains domains; 
        private String groupId; 
        private String groupName; 
        private String purchasedTime; 
        private String regionId; 
        private String requestId; 
        private String status; 

        /**
         * The description of the API group.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The list of domain names.
         */
        public Builder domains(Domains domains) {
            this.domains = domains;
            return this;
        }

        /**
         * The ID of the API group.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * The name of the API group.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * The time when the API group was purchased.
         */
        public Builder purchasedTime(String purchasedTime) {
            this.purchasedTime = purchasedTime;
            return this;
        }

        /**
         * The region where the API group is located.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the API group.
         * <p>
         * 
         * *   **NORMAL**: The API group is normal.
         * *   **DELETE**: The API group is deleted.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribePurchasedApiGroupResponseBody build() {
            return new DescribePurchasedApiGroupResponseBody(this);
        } 

    } 

    public static class DomainItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
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
             * The domain name.
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
    public static class Domains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainItem")
        private java.util.List < DomainItem> domainItem;

        private Domains(Builder builder) {
            this.domainItem = builder.domainItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
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

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
}
