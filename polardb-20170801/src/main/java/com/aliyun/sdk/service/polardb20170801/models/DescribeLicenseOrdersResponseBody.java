// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeLicenseOrdersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLicenseOrdersResponseBody</p>
 */
public class DescribeLicenseOrdersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeLicenseOrdersResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLicenseOrdersResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
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
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeLicenseOrdersResponseBody build() {
            return new DescribeLicenseOrdersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLicenseOrdersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLicenseOrdersResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivatedCodeCount")
        private Integer activatedCodeCount;

        @com.aliyun.core.annotation.NameInMap("ActivationCodeQuota")
        private Integer activationCodeQuota;

        @com.aliyun.core.annotation.NameInMap("AliyunOrderId")
        private String aliyunOrderId;

        @com.aliyun.core.annotation.NameInMap("AllowEmptySystemIdentifier")
        private Boolean allowEmptySystemIdentifier;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IsVirtualOrder")
        private Boolean isVirtualOrder;

        @com.aliyun.core.annotation.NameInMap("IsVirtualOrderFrozen")
        private Boolean isVirtualOrderFrozen;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("PackageValidity")
        private String packageValidity;

        @com.aliyun.core.annotation.NameInMap("PurchaseChannel")
        private String purchaseChannel;

        @com.aliyun.core.annotation.NameInMap("VirtualAliyunOrderId")
        private String virtualAliyunOrderId;

        private Items(Builder builder) {
            this.activatedCodeCount = builder.activatedCodeCount;
            this.activationCodeQuota = builder.activationCodeQuota;
            this.aliyunOrderId = builder.aliyunOrderId;
            this.allowEmptySystemIdentifier = builder.allowEmptySystemIdentifier;
            this.engine = builder.engine;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.isVirtualOrder = builder.isVirtualOrder;
            this.isVirtualOrderFrozen = builder.isVirtualOrderFrozen;
            this.packageType = builder.packageType;
            this.packageValidity = builder.packageValidity;
            this.purchaseChannel = builder.purchaseChannel;
            this.virtualAliyunOrderId = builder.virtualAliyunOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return activatedCodeCount
         */
        public Integer getActivatedCodeCount() {
            return this.activatedCodeCount;
        }

        /**
         * @return activationCodeQuota
         */
        public Integer getActivationCodeQuota() {
            return this.activationCodeQuota;
        }

        /**
         * @return aliyunOrderId
         */
        public String getAliyunOrderId() {
            return this.aliyunOrderId;
        }

        /**
         * @return allowEmptySystemIdentifier
         */
        public Boolean getAllowEmptySystemIdentifier() {
            return this.allowEmptySystemIdentifier;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return isVirtualOrder
         */
        public Boolean getIsVirtualOrder() {
            return this.isVirtualOrder;
        }

        /**
         * @return isVirtualOrderFrozen
         */
        public Boolean getIsVirtualOrderFrozen() {
            return this.isVirtualOrderFrozen;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return packageValidity
         */
        public String getPackageValidity() {
            return this.packageValidity;
        }

        /**
         * @return purchaseChannel
         */
        public String getPurchaseChannel() {
            return this.purchaseChannel;
        }

        /**
         * @return virtualAliyunOrderId
         */
        public String getVirtualAliyunOrderId() {
            return this.virtualAliyunOrderId;
        }

        public static final class Builder {
            private Integer activatedCodeCount; 
            private Integer activationCodeQuota; 
            private String aliyunOrderId; 
            private Boolean allowEmptySystemIdentifier; 
            private String engine; 
            private String gmtCreated; 
            private String gmtModified; 
            private Boolean isVirtualOrder; 
            private Boolean isVirtualOrderFrozen; 
            private String packageType; 
            private String packageValidity; 
            private String purchaseChannel; 
            private String virtualAliyunOrderId; 

            /**
             * ActivatedCodeCount.
             */
            public Builder activatedCodeCount(Integer activatedCodeCount) {
                this.activatedCodeCount = activatedCodeCount;
                return this;
            }

            /**
             * ActivationCodeQuota.
             */
            public Builder activationCodeQuota(Integer activationCodeQuota) {
                this.activationCodeQuota = activationCodeQuota;
                return this;
            }

            /**
             * AliyunOrderId.
             */
            public Builder aliyunOrderId(String aliyunOrderId) {
                this.aliyunOrderId = aliyunOrderId;
                return this;
            }

            /**
             * AllowEmptySystemIdentifier.
             */
            public Builder allowEmptySystemIdentifier(Boolean allowEmptySystemIdentifier) {
                this.allowEmptySystemIdentifier = allowEmptySystemIdentifier;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * IsVirtualOrder.
             */
            public Builder isVirtualOrder(Boolean isVirtualOrder) {
                this.isVirtualOrder = isVirtualOrder;
                return this;
            }

            /**
             * IsVirtualOrderFrozen.
             */
            public Builder isVirtualOrderFrozen(Boolean isVirtualOrderFrozen) {
                this.isVirtualOrderFrozen = isVirtualOrderFrozen;
                return this;
            }

            /**
             * PackageType.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * PackageValidity.
             */
            public Builder packageValidity(String packageValidity) {
                this.packageValidity = packageValidity;
                return this;
            }

            /**
             * PurchaseChannel.
             */
            public Builder purchaseChannel(String purchaseChannel) {
                this.purchaseChannel = purchaseChannel;
                return this;
            }

            /**
             * VirtualAliyunOrderId.
             */
            public Builder virtualAliyunOrderId(String virtualAliyunOrderId) {
                this.virtualAliyunOrderId = virtualAliyunOrderId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
