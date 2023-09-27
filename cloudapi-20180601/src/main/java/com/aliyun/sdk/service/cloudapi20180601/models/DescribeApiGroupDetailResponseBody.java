// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiGroupDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiGroupDetailResponseBody</p>
 */
public class DescribeApiGroupDetailResponseBody extends TeaModel {
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

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StageItems")
    private StageItems stageItems;

    @NameInMap("Status")
    private String status;

    @NameInMap("SubDomain")
    private String subDomain;

    @NameInMap("TrafficLimit")
    private Integer trafficLimit;

    private DescribeApiGroupDetailResponseBody(Builder builder) {
        this.billingStatus = builder.billingStatus;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.domainItems = builder.domainItems;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.illegalStatus = builder.illegalStatus;
        this.modifiedTime = builder.modifiedTime;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.stageItems = builder.stageItems;
        this.status = builder.status;
        this.subDomain = builder.subDomain;
        this.trafficLimit = builder.trafficLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiGroupDetailResponseBody create() {
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
     * @return stageItems
     */
    public StageItems getStageItems() {
        return this.stageItems;
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
        private String regionId; 
        private String requestId; 
        private StageItems stageItems; 
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
         * StageItems.
         */
        public Builder stageItems(StageItems stageItems) {
            this.stageItems = stageItems;
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

        public DescribeApiGroupDetailResponseBody build() {
            return new DescribeApiGroupDetailResponseBody(this);
        } 

    } 

    public static class DomainItem extends TeaModel {
        @NameInMap("CertificateId")
        private String certificateId;

        @NameInMap("CertificateName")
        private String certificateName;

        @NameInMap("DomainBindingStatus")
        private String domainBindingStatus;

        @NameInMap("DomainLegalStatus")
        private String domainLegalStatus;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("DomainNameResolution")
        private String domainNameResolution;

        @NameInMap("DomainRemark")
        private String domainRemark;

        @NameInMap("DomainWebSocketStatus")
        private String domainWebSocketStatus;

        private DomainItem(Builder builder) {
            this.certificateId = builder.certificateId;
            this.certificateName = builder.certificateName;
            this.domainBindingStatus = builder.domainBindingStatus;
            this.domainLegalStatus = builder.domainLegalStatus;
            this.domainName = builder.domainName;
            this.domainNameResolution = builder.domainNameResolution;
            this.domainRemark = builder.domainRemark;
            this.domainWebSocketStatus = builder.domainWebSocketStatus;
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
         * @return domainBindingStatus
         */
        public String getDomainBindingStatus() {
            return this.domainBindingStatus;
        }

        /**
         * @return domainLegalStatus
         */
        public String getDomainLegalStatus() {
            return this.domainLegalStatus;
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
         * @return domainRemark
         */
        public String getDomainRemark() {
            return this.domainRemark;
        }

        /**
         * @return domainWebSocketStatus
         */
        public String getDomainWebSocketStatus() {
            return this.domainWebSocketStatus;
        }

        public static final class Builder {
            private String certificateId; 
            private String certificateName; 
            private String domainBindingStatus; 
            private String domainLegalStatus; 
            private String domainName; 
            private String domainNameResolution; 
            private String domainRemark; 
            private String domainWebSocketStatus; 

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
             * DomainBindingStatus.
             */
            public Builder domainBindingStatus(String domainBindingStatus) {
                this.domainBindingStatus = domainBindingStatus;
                return this;
            }

            /**
             * DomainLegalStatus.
             */
            public Builder domainLegalStatus(String domainLegalStatus) {
                this.domainLegalStatus = domainLegalStatus;
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
             * DomainRemark.
             */
            public Builder domainRemark(String domainRemark) {
                this.domainRemark = domainRemark;
                return this;
            }

            /**
             * DomainWebSocketStatus.
             */
            public Builder domainWebSocketStatus(String domainWebSocketStatus) {
                this.domainWebSocketStatus = domainWebSocketStatus;
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
    public static class StageInfo extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("StageId")
        private String stageId;

        @NameInMap("StageName")
        private String stageName;

        private StageInfo(Builder builder) {
            this.description = builder.description;
            this.stageId = builder.stageId;
            this.stageName = builder.stageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StageInfo create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return stageId
         */
        public String getStageId() {
            return this.stageId;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        public static final class Builder {
            private String description; 
            private String stageId; 
            private String stageName; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * StageId.
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * StageName.
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            public StageInfo build() {
                return new StageInfo(this);
            } 

        } 

    }
    public static class StageItems extends TeaModel {
        @NameInMap("StageInfo")
        private java.util.List < StageInfo> stageInfo;

        private StageItems(Builder builder) {
            this.stageInfo = builder.stageInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StageItems create() {
            return builder().build();
        }

        /**
         * @return stageInfo
         */
        public java.util.List < StageInfo> getStageInfo() {
            return this.stageInfo;
        }

        public static final class Builder {
            private java.util.List < StageInfo> stageInfo; 

            /**
             * StageInfo.
             */
            public Builder stageInfo(java.util.List < StageInfo> stageInfo) {
                this.stageInfo = stageInfo;
                return this;
            }

            public StageItems build() {
                return new StageItems(this);
            } 

        } 

    }
}
