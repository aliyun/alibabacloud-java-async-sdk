// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchSimilarityListResponseBody} extends {@link TeaModel}
 *
 * <p>SearchSimilarityListResponseBody</p>
 */
public class SearchSimilarityListResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private SearchSimilarityListResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchSimilarityListResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SearchSimilarityListResponseBody build() {
            return new SearchSimilarityListResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
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

        @NameInMap("OnSale")
        private Integer onSale;

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

        @NameInMap("ProductDesc")
        private String productDesc;

        @NameInMap("RegAnnDate")
        private String regAnnDate;

        @NameInMap("RegAnnNum")
        private String regAnnNum;

        @NameInMap("RegistrationNumber")
        private String registrationNumber;

        @NameInMap("Share")
        private String share;

        @NameInMap("Status")
        private String status;

        @NameInMap("Uid")
        private String uid;

        private Data(Builder builder) {
            this.applyDate = builder.applyDate;
            this.classification = builder.classification;
            this.exclusiveDateLimit = builder.exclusiveDateLimit;
            this.id = builder.id;
            this.image = builder.image;
            this.lastProcedureStatus = builder.lastProcedureStatus;
            this.name = builder.name;
            this.onSale = builder.onSale;
            this.ownerAddress = builder.ownerAddress;
            this.ownerEnAddress = builder.ownerEnAddress;
            this.ownerEnName = builder.ownerEnName;
            this.ownerName = builder.ownerName;
            this.preAnnDate = builder.preAnnDate;
            this.preAnnNum = builder.preAnnNum;
            this.product = builder.product;
            this.productDesc = builder.productDesc;
            this.regAnnDate = builder.regAnnDate;
            this.regAnnNum = builder.regAnnNum;
            this.registrationNumber = builder.registrationNumber;
            this.share = builder.share;
            this.status = builder.status;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return onSale
         */
        public Integer getOnSale() {
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
         * @return productDesc
         */
        public String getProductDesc() {
            return this.productDesc;
        }

        /**
         * @return regAnnDate
         */
        public String getRegAnnDate() {
            return this.regAnnDate;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String applyDate; 
            private String classification; 
            private String exclusiveDateLimit; 
            private Long id; 
            private String image; 
            private String lastProcedureStatus; 
            private String name; 
            private Integer onSale; 
            private String ownerAddress; 
            private String ownerEnAddress; 
            private String ownerEnName; 
            private String ownerName; 
            private String preAnnDate; 
            private String preAnnNum; 
            private String product; 
            private String productDesc; 
            private String regAnnDate; 
            private String regAnnNum; 
            private String registrationNumber; 
            private String share; 
            private String status; 
            private String uid; 

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
             * OnSale.
             */
            public Builder onSale(Integer onSale) {
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
             * ProductDesc.
             */
            public Builder productDesc(String productDesc) {
                this.productDesc = productDesc;
                return this;
            }

            /**
             * RegAnnDate.
             */
            public Builder regAnnDate(String regAnnDate) {
                this.regAnnDate = regAnnDate;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
