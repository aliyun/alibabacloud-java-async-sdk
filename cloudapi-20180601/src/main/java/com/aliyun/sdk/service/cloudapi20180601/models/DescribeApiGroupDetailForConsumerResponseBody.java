// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiGroupDetailForConsumerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiGroupDetailForConsumerResponseBody</p>
 */
public class DescribeApiGroupDetailForConsumerResponseBody extends TeaModel {
    @NameInMap("BillingStatus")
    private String billingStatus;

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

    @NameInMap("IllegalStatus")
    private String illegalStatus;

    @NameInMap("ModifiedTime")
    private String modifiedTime;

    @NameInMap("Purchased")
    private String purchased;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("SubDomain")
    private String subDomain;

    @NameInMap("TrafficLimit")
    private Integer trafficLimit;

    private DescribeApiGroupDetailForConsumerResponseBody(Builder builder) {
        this.billingStatus = builder.billingStatus;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.domainItems = builder.domainItems;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.illegalStatus = builder.illegalStatus;
        this.modifiedTime = builder.modifiedTime;
        this.purchased = builder.purchased;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.subDomain = builder.subDomain;
        this.trafficLimit = builder.trafficLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiGroupDetailForConsumerResponseBody create() {
        return builder().build();
    }

    /**
     * @return billingStatus
     */
    public String getBillingStatus() {
        return this.billingStatus;
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
     * @return illegalStatus
     */
    public String getIllegalStatus() {
        return this.illegalStatus;
    }

    /**
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return purchased
     */
    public String getPurchased() {
        return this.purchased;
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

    /**
     * @return subDomain
     */
    public String getSubDomain() {
        return this.subDomain;
    }

    /**
     * @return trafficLimit
     */
    public Integer getTrafficLimit() {
        return this.trafficLimit;
    }

    public static final class Builder {
        private String billingStatus; 
        private String createdTime; 
        private String description; 
        private DomainItems domainItems; 
        private String groupId; 
        private String groupName; 
        private String illegalStatus; 
        private String modifiedTime; 
        private String purchased; 
        private String regionId; 
        private String requestId; 
        private String status; 
        private String subDomain; 
        private Integer trafficLimit; 

        /**
         * BillingStatus.
         */
        public Builder billingStatus(String billingStatus) {
            this.billingStatus = billingStatus;
            return this;
        }

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
         * IllegalStatus.
         */
        public Builder illegalStatus(String illegalStatus) {
            this.illegalStatus = illegalStatus;
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
         * Purchased.
         */
        public Builder purchased(String purchased) {
            this.purchased = purchased;
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

        /**
         * SubDomain.
         */
        public Builder subDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }

        /**
         * TrafficLimit.
         */
        public Builder trafficLimit(Integer trafficLimit) {
            this.trafficLimit = trafficLimit;
            return this;
        }

        public DescribeApiGroupDetailForConsumerResponseBody build() {
            return new DescribeApiGroupDetailForConsumerResponseBody(this);
        } 

    } 

    public static class DomainItem extends TeaModel {
        @NameInMap("CertificateId")
        private String certificateId;

        @NameInMap("CertificateName")
        private String certificateName;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("DomainNameResolution")
        private String domainNameResolution;

        @NameInMap("DomainStatus")
        private String domainStatus;

        private DomainItem(Builder builder) {
            this.certificateId = builder.certificateId;
            this.certificateName = builder.certificateName;
            this.domainName = builder.domainName;
            this.domainNameResolution = builder.domainNameResolution;
            this.domainStatus = builder.domainStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainItem create() {
            return builder().build();
        }

        /**
         * @return certificateId
         */
        public String getCertificateId() {
            return this.certificateId;
        }

        /**
         * @return certificateName
         */
        public String getCertificateName() {
            return this.certificateName;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainNameResolution
         */
        public String getDomainNameResolution() {
            return this.domainNameResolution;
        }

        /**
         * @return domainStatus
         */
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public static final class Builder {
            private String certificateId; 
            private String certificateName; 
            private String domainName; 
            private String domainNameResolution; 
            private String domainStatus; 

            /**
             * CertificateId.
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * CertificateName.
             */
            public Builder certificateName(String certificateName) {
                this.certificateName = certificateName;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * DomainNameResolution.
             */
            public Builder domainNameResolution(String domainNameResolution) {
                this.domainNameResolution = domainNameResolution;
                return this;
            }

            /**
             * DomainStatus.
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
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
