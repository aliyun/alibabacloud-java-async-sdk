// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrademarkSearchForInnerResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrademarkSearchForInnerResponseBody</p>
 */
public class ListTrademarkSearchForInnerResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private String pageNumber;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("Products")
    private java.util.List < String > products;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    @NameInMap("TrademarkSearchContents")
    private java.util.List < TrademarkSearchContents> trademarkSearchContents;

    private ListTrademarkSearchForInnerResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.products = builder.products;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.trademarkSearchContents = builder.trademarkSearchContents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrademarkSearchForInnerResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return products
     */
    public java.util.List < String > getProducts() {
        return this.products;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return trademarkSearchContents
     */
    public java.util.List < TrademarkSearchContents> getTrademarkSearchContents() {
        return this.trademarkSearchContents;
    }

    public static final class Builder {
        private String pageNumber; 
        private String pageSize; 
        private java.util.List < String > products; 
        private String requestId; 
        private String totalCount; 
        private java.util.List < TrademarkSearchContents> trademarkSearchContents; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Products.
         */
        public Builder products(java.util.List < String > products) {
            this.products = products;
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
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TrademarkSearchContents.
         */
        public Builder trademarkSearchContents(java.util.List < TrademarkSearchContents> trademarkSearchContents) {
            this.trademarkSearchContents = trademarkSearchContents;
            return this;
        }

        public ListTrademarkSearchForInnerResponseBody build() {
            return new ListTrademarkSearchForInnerResponseBody(this);
        } 

    } 

    public static class TrademarkSearchContents extends TeaModel {
        @NameInMap("ApplyDate")
        private String applyDate;

        @NameInMap("Classification")
        private String classification;

        @NameInMap("ExclusiveDateLimit")
        private String exclusiveDateLimit;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Image")
        private String image;

        @NameInMap("LastProcedureStatus")
        private String lastProcedureStatus;

        @NameInMap("Name")
        private String name;

        @NameInMap("NameCharSection")
        private String nameCharSection;

        @NameInMap("NameOrigin")
        private String nameOrigin;

        @NameInMap("NameSimplifiedChinese")
        private String nameSimplifiedChinese;

        @NameInMap("NameSort")
        private String nameSort;

        @NameInMap("OnSale")
        private String onSale;

        @NameInMap("OwnerAddress")
        private String ownerAddress;

        @NameInMap("OwnerEnAddress")
        private String ownerEnAddress;

        @NameInMap("OwnerEnName")
        private String ownerEnName;

        @NameInMap("OwnerName")
        private String ownerName;

        @NameInMap("PreAnnDate")
        private String preAnnDate;

        @NameInMap("PreAnnNum")
        private String preAnnNum;

        @NameInMap("Product")
        private String product;

        @NameInMap("ProductDel")
        private java.util.List < String > productDel;

        @NameInMap("ProductDescription")
        private String productDescription;

        @NameInMap("RegAnnNum")
        private String regAnnNum;

        @NameInMap("RegistrationNumber")
        private String registrationNumber;

        @NameInMap("Share")
        private String share;

        @NameInMap("SimilarGroupDel")
        private java.util.List < String > similarGroupDel;

        @NameInMap("Uid")
        private String uid;

        @NameInMap("WellKnow")
        private String wellKnow;

        private TrademarkSearchContents(Builder builder) {
            this.applyDate = builder.applyDate;
            this.classification = builder.classification;
            this.exclusiveDateLimit = builder.exclusiveDateLimit;
            this.id = builder.id;
            this.image = builder.image;
            this.lastProcedureStatus = builder.lastProcedureStatus;
            this.name = builder.name;
            this.nameCharSection = builder.nameCharSection;
            this.nameOrigin = builder.nameOrigin;
            this.nameSimplifiedChinese = builder.nameSimplifiedChinese;
            this.nameSort = builder.nameSort;
            this.onSale = builder.onSale;
            this.ownerAddress = builder.ownerAddress;
            this.ownerEnAddress = builder.ownerEnAddress;
            this.ownerEnName = builder.ownerEnName;
            this.ownerName = builder.ownerName;
            this.preAnnDate = builder.preAnnDate;
            this.preAnnNum = builder.preAnnNum;
            this.product = builder.product;
            this.productDel = builder.productDel;
            this.productDescription = builder.productDescription;
            this.regAnnNum = builder.regAnnNum;
            this.registrationNumber = builder.registrationNumber;
            this.share = builder.share;
            this.similarGroupDel = builder.similarGroupDel;
            this.uid = builder.uid;
            this.wellKnow = builder.wellKnow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrademarkSearchContents create() {
            return builder().build();
        }

        /**
         * @return applyDate
         */
        public String getApplyDate() {
            return this.applyDate;
        }

        /**
         * @return classification
         */
        public String getClassification() {
            return this.classification;
        }

        /**
         * @return exclusiveDateLimit
         */
        public String getExclusiveDateLimit() {
            return this.exclusiveDateLimit;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return lastProcedureStatus
         */
        public String getLastProcedureStatus() {
            return this.lastProcedureStatus;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameCharSection
         */
        public String getNameCharSection() {
            return this.nameCharSection;
        }

        /**
         * @return nameOrigin
         */
        public String getNameOrigin() {
            return this.nameOrigin;
        }

        /**
         * @return nameSimplifiedChinese
         */
        public String getNameSimplifiedChinese() {
            return this.nameSimplifiedChinese;
        }

        /**
         * @return nameSort
         */
        public String getNameSort() {
            return this.nameSort;
        }

        /**
         * @return onSale
         */
        public String getOnSale() {
            return this.onSale;
        }

        /**
         * @return ownerAddress
         */
        public String getOwnerAddress() {
            return this.ownerAddress;
        }

        /**
         * @return ownerEnAddress
         */
        public String getOwnerEnAddress() {
            return this.ownerEnAddress;
        }

        /**
         * @return ownerEnName
         */
        public String getOwnerEnName() {
            return this.ownerEnName;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return preAnnDate
         */
        public String getPreAnnDate() {
            return this.preAnnDate;
        }

        /**
         * @return preAnnNum
         */
        public String getPreAnnNum() {
            return this.preAnnNum;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return productDel
         */
        public java.util.List < String > getProductDel() {
            return this.productDel;
        }

        /**
         * @return productDescription
         */
        public String getProductDescription() {
            return this.productDescription;
        }

        /**
         * @return regAnnNum
         */
        public String getRegAnnNum() {
            return this.regAnnNum;
        }

        /**
         * @return registrationNumber
         */
        public String getRegistrationNumber() {
            return this.registrationNumber;
        }

        /**
         * @return share
         */
        public String getShare() {
            return this.share;
        }

        /**
         * @return similarGroupDel
         */
        public java.util.List < String > getSimilarGroupDel() {
            return this.similarGroupDel;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return wellKnow
         */
        public String getWellKnow() {
            return this.wellKnow;
        }

        public static final class Builder {
            private String applyDate; 
            private String classification; 
            private String exclusiveDateLimit; 
            private Long id; 
            private String image; 
            private String lastProcedureStatus; 
            private String name; 
            private String nameCharSection; 
            private String nameOrigin; 
            private String nameSimplifiedChinese; 
            private String nameSort; 
            private String onSale; 
            private String ownerAddress; 
            private String ownerEnAddress; 
            private String ownerEnName; 
            private String ownerName; 
            private String preAnnDate; 
            private String preAnnNum; 
            private String product; 
            private java.util.List < String > productDel; 
            private String productDescription; 
            private String regAnnNum; 
            private String registrationNumber; 
            private String share; 
            private java.util.List < String > similarGroupDel; 
            private String uid; 
            private String wellKnow; 

            /**
             * ApplyDate.
             */
            public Builder applyDate(String applyDate) {
                this.applyDate = applyDate;
                return this;
            }

            /**
             * Classification.
             */
            public Builder classification(String classification) {
                this.classification = classification;
                return this;
            }

            /**
             * ExclusiveDateLimit.
             */
            public Builder exclusiveDateLimit(String exclusiveDateLimit) {
                this.exclusiveDateLimit = exclusiveDateLimit;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * LastProcedureStatus.
             */
            public Builder lastProcedureStatus(String lastProcedureStatus) {
                this.lastProcedureStatus = lastProcedureStatus;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NameCharSection.
             */
            public Builder nameCharSection(String nameCharSection) {
                this.nameCharSection = nameCharSection;
                return this;
            }

            /**
             * NameOrigin.
             */
            public Builder nameOrigin(String nameOrigin) {
                this.nameOrigin = nameOrigin;
                return this;
            }

            /**
             * NameSimplifiedChinese.
             */
            public Builder nameSimplifiedChinese(String nameSimplifiedChinese) {
                this.nameSimplifiedChinese = nameSimplifiedChinese;
                return this;
            }

            /**
             * NameSort.
             */
            public Builder nameSort(String nameSort) {
                this.nameSort = nameSort;
                return this;
            }

            /**
             * OnSale.
             */
            public Builder onSale(String onSale) {
                this.onSale = onSale;
                return this;
            }

            /**
             * OwnerAddress.
             */
            public Builder ownerAddress(String ownerAddress) {
                this.ownerAddress = ownerAddress;
                return this;
            }

            /**
             * OwnerEnAddress.
             */
            public Builder ownerEnAddress(String ownerEnAddress) {
                this.ownerEnAddress = ownerEnAddress;
                return this;
            }

            /**
             * OwnerEnName.
             */
            public Builder ownerEnName(String ownerEnName) {
                this.ownerEnName = ownerEnName;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * PreAnnDate.
             */
            public Builder preAnnDate(String preAnnDate) {
                this.preAnnDate = preAnnDate;
                return this;
            }

            /**
             * PreAnnNum.
             */
            public Builder preAnnNum(String preAnnNum) {
                this.preAnnNum = preAnnNum;
                return this;
            }

            /**
             * Product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * ProductDel.
             */
            public Builder productDel(java.util.List < String > productDel) {
                this.productDel = productDel;
                return this;
            }

            /**
             * ProductDescription.
             */
            public Builder productDescription(String productDescription) {
                this.productDescription = productDescription;
                return this;
            }

            /**
             * RegAnnNum.
             */
            public Builder regAnnNum(String regAnnNum) {
                this.regAnnNum = regAnnNum;
                return this;
            }

            /**
             * RegistrationNumber.
             */
            public Builder registrationNumber(String registrationNumber) {
                this.registrationNumber = registrationNumber;
                return this;
            }

            /**
             * Share.
             */
            public Builder share(String share) {
                this.share = share;
                return this;
            }

            /**
             * SimilarGroupDel.
             */
            public Builder similarGroupDel(java.util.List < String > similarGroupDel) {
                this.similarGroupDel = similarGroupDel;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * WellKnow.
             */
            public Builder wellKnow(String wellKnow) {
                this.wellKnow = wellKnow;
                return this;
            }

            public TrademarkSearchContents build() {
                return new TrademarkSearchContents(this);
            } 

        } 

    }
}
