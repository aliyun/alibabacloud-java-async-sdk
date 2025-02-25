// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeLicenseOrdersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLicenseOrdersResponseBody</p>
 */
public class DescribeLicenseOrdersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

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
    public java.util.List<Items> getItems() {
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
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * <p>The queried orders.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34458CD3-33E0-4624-BFEF-840C15******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
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
             * <p>The number of generated activation codes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder activatedCodeCount(Integer activatedCodeCount) {
                this.activatedCodeCount = activatedCodeCount;
                return this;
            }

            /**
             * <p>The maximum number of activation codes that you can apply for.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder activationCodeQuota(Integer activationCodeQuota) {
                this.activationCodeQuota = activationCodeQuota;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud order. The ID of a virtual order may be returned.</p>
             * 
             * <strong>example:</strong>
             * <p>227638319690519</p>
             */
            public Builder aliyunOrderId(String aliyunOrderId) {
                this.aliyunOrderId = aliyunOrderId;
                return this;
            }

            /**
             * <p>Indicates whether the SystemIdentifier parameter can be left empty when the system generates an activation code.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowEmptySystemIdentifier(Boolean allowEmptySystemIdentifier) {
                this.allowEmptySystemIdentifier = allowEmptySystemIdentifier;
                return this;
            }

            /**
             * <p>The engine of the PolarDB cluster. Valid values: PG, Oracle, and MySQL.</p>
             * 
             * <strong>example:</strong>
             * <p>PG</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The time when the order was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-11 03:14:15</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The time when the order was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-11 03:14:15</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates whether the order is a virtual order. Pre-generation of activation codes is allowed for virtual orders.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isVirtualOrder(Boolean isVirtualOrder) {
                this.isVirtualOrder = isVirtualOrder;
                return this;
            }

            /**
             * <p>Indicates whether the virtual order is frozen. Generation of activation codes is not allowed for frozen virtual orders.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isVirtualOrderFrozen(Boolean isVirtualOrderFrozen) {
                this.isVirtualOrderFrozen = isVirtualOrderFrozen;
                return this;
            }

            /**
             * <p>The type of the package. Valid values:</p>
             * <ul>
             * <li>single_node_subscribe: Single-node Edition (Subscription).</li>
             * <li>single_node_long_term: Single-node Edition (Long-term).</li>
             * <li>primary_backup_subscribe: HA Edition (Subscription).</li>
             * <li>primary_backup_long_term: HA Edition (Long-term).</li>
             * <li>pre_generation_long_term: Pre-generated (Long-term).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>single_node_subscribe</p>
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * <p>The validity period of the package. Valid values: 1 year and 30 years.</p>
             * 
             * <strong>example:</strong>
             * <p>1 year</p>
             */
            public Builder packageValidity(String packageValidity) {
                this.packageValidity = packageValidity;
                return this;
            }

            /**
             * <p>The purchase channel. Valid values: aliyun_market and aliyun_public. aliyun_market indicates Alibaba Cloud Marketplace. aliyun_public indicates the PolarDB buy page.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_public</p>
             */
            public Builder purchaseChannel(String purchaseChannel) {
                this.purchaseChannel = purchaseChannel;
                return this;
            }

            /**
             * <p>The ID of the virtual order.</p>
             * 
             * <strong>example:</strong>
             * <p>227638319690519</p>
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
