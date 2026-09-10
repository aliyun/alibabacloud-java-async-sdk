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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLicenseOrdersResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of orders.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records on the current page.</p>
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
         * <p>The total number of records.</p>
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

            private Builder() {
            } 

            private Builder(Items model) {
                this.activatedCodeCount = model.activatedCodeCount;
                this.activationCodeQuota = model.activationCodeQuota;
                this.aliyunOrderId = model.aliyunOrderId;
                this.allowEmptySystemIdentifier = model.allowEmptySystemIdentifier;
                this.engine = model.engine;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.isVirtualOrder = model.isVirtualOrder;
                this.isVirtualOrderFrozen = model.isVirtualOrderFrozen;
                this.packageType = model.packageType;
                this.packageValidity = model.packageValidity;
                this.purchaseChannel = model.purchaseChannel;
                this.virtualAliyunOrderId = model.virtualAliyunOrderId;
            } 

            /**
             * <p>The number of activation codes that have been generated.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder activatedCodeCount(Integer activatedCodeCount) {
                this.activatedCodeCount = activatedCodeCount;
                return this;
            }

            /**
             * <p>The quota for requesting activation codes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder activationCodeQuota(Integer activationCodeQuota) {
                this.activationCodeQuota = activationCodeQuota;
                return this;
            }

            /**
             * <p>The Alibaba Cloud order ID or virtual order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>227638319690519</p>
             */
            public Builder aliyunOrderId(String aliyunOrderId) {
                this.aliyunOrderId = aliyunOrderId;
                return this;
            }

            /**
             * <p>Specifies whether the System Identifier can be left empty when an activation code is generated.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowEmptySystemIdentifier(Boolean allowEmptySystemIdentifier) {
                this.allowEmptySystemIdentifier = allowEmptySystemIdentifier;
                return this;
            }

            /**
             * <p>The database type, such as PG, Oracle, or MySQL.</p>
             * 
             * <strong>example:</strong>
             * <p>PG</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-11 03:14:15</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-11 03:14:15</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates whether the order is a virtual order. Virtual orders allow for pre-generating activation codes.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isVirtualOrder(Boolean isVirtualOrder) {
                this.isVirtualOrder = isVirtualOrder;
                return this;
            }

            /**
             * <p>Indicates whether the virtual order is frozen. No more activation codes can be generated from a frozen order.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isVirtualOrderFrozen(Boolean isVirtualOrderFrozen) {
                this.isVirtualOrderFrozen = isVirtualOrderFrozen;
                return this;
            }

            /**
             * <p>The package type. Valid values:</p>
             * <ul>
             * <li><p>single_node_subscribe: single node (subscription)</p>
             * </li>
             * <li><p>single_node_long_term: single node (long-term)</p>
             * </li>
             * <li><p>primary_backup_subscribe: primary/standby (subscription)</p>
             * </li>
             * <li><p>primary_backup_long_term: primary/standby (long-term)</p>
             * </li>
             * <li><p>pre_generation_long_term: pre-generated (long-term)</p>
             * </li>
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
             * <p>The validity period of the package. Common options are one year or long-term (30 years).</p>
             * 
             * <strong>example:</strong>
             * <p>1 year</p>
             */
            public Builder packageValidity(String packageValidity) {
                this.packageValidity = packageValidity;
                return this;
            }

            /**
             * <p>The purchase channel. Valid values: \<code>aliyun_market\\</code> (Alibaba Cloud Marketplace) and \<code>aliyun_public\\</code> (standard purchase page).</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_public</p>
             */
            public Builder purchaseChannel(String purchaseChannel) {
                this.purchaseChannel = purchaseChannel;
                return this;
            }

            /**
             * <p>The virtual order ID.</p>
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
