// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link QueryExportDomainExpireSnatchsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryExportDomainExpireSnatchsResponseBody</p>
 */
public class QueryExportDomainExpireSnatchsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryExportDomainExpireSnatchsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryExportDomainExpireSnatchsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryExportDomainExpireSnatchsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryExportDomainExpireSnatchsResponseBody build() {
            return new QueryExportDomainExpireSnatchsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryExportDomainExpireSnatchsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryExportDomainExpireSnatchsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuctionEndTime")
        private String auctionEndTime;

        @com.aliyun.core.annotation.NameInMap("AuctionRemainingSeconds")
        private Long auctionRemainingSeconds;

        @com.aliyun.core.annotation.NameInMap("BaiduAntiLink")
        private Integer baiduAntiLink;

        @com.aliyun.core.annotation.NameInMap("BaiduExLink")
        private Integer baiduExLink;

        @com.aliyun.core.annotation.NameInMap("BaiduIndex")
        private Integer baiduIndex;

        @com.aliyun.core.annotation.NameInMap("BaiduWeight")
        private Integer baiduWeight;

        @com.aliyun.core.annotation.NameInMap("BookEndTime")
        private String bookEndTime;

        @com.aliyun.core.annotation.NameInMap("BookRemainingSeconds")
        private Long bookRemainingSeconds;

        @com.aliyun.core.annotation.NameInMap("BookedNum")
        private Integer bookedNum;

        @com.aliyun.core.annotation.NameInMap("BookedPartners")
        private String bookedPartners;

        @com.aliyun.core.annotation.NameInMap("Constitute")
        private String constitute;

        @com.aliyun.core.annotation.NameInMap("CurrencyType")
        private String currencyType;

        @com.aliyun.core.annotation.NameInMap("DeliveryTime")
        private String deliveryTime;

        @com.aliyun.core.annotation.NameInMap("DomainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("DomainLen")
        private Integer domainLen;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainType")
        private String domainType;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("Extend")
        private String extend;

        @com.aliyun.core.annotation.NameInMap("FreezeAmount")
        private Double freezeAmount;

        @com.aliyun.core.annotation.NameInMap("Introduction")
        private String introduction;

        @com.aliyun.core.annotation.NameInMap("IsPremium")
        private Boolean isPremium;

        @com.aliyun.core.annotation.NameInMap("PartnerTypes")
        private String partnerTypes;

        @com.aliyun.core.annotation.NameInMap("Price")
        private Double price;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("PublishTime")
        private String publishTime;

        @com.aliyun.core.annotation.NameInMap("RegDate")
        private String regDate;

        @com.aliyun.core.annotation.NameInMap("Reserved")
        private Boolean reserved;

        @com.aliyun.core.annotation.NameInMap("RmbPrice")
        private Double rmbPrice;

        @com.aliyun.core.annotation.NameInMap("S360Weight")
        private Integer s360Weight;

        @com.aliyun.core.annotation.NameInMap("SeoAttributes")
        private String seoAttributes;

        @com.aliyun.core.annotation.NameInMap("ShortName")
        private String shortName;

        @com.aliyun.core.annotation.NameInMap("SnatchTypeDesc")
        private String snatchTypeDesc;

        @com.aliyun.core.annotation.NameInMap("SougouAntiLink")
        private Integer sougouAntiLink;

        @com.aliyun.core.annotation.NameInMap("SougouIndex")
        private Integer sougouIndex;

        @com.aliyun.core.annotation.NameInMap("SougouWeight")
        private Integer sougouWeight;

        @com.aliyun.core.annotation.NameInMap("Suffix")
        private String suffix;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private Data(Builder builder) {
            this.auctionEndTime = builder.auctionEndTime;
            this.auctionRemainingSeconds = builder.auctionRemainingSeconds;
            this.baiduAntiLink = builder.baiduAntiLink;
            this.baiduExLink = builder.baiduExLink;
            this.baiduIndex = builder.baiduIndex;
            this.baiduWeight = builder.baiduWeight;
            this.bookEndTime = builder.bookEndTime;
            this.bookRemainingSeconds = builder.bookRemainingSeconds;
            this.bookedNum = builder.bookedNum;
            this.bookedPartners = builder.bookedPartners;
            this.constitute = builder.constitute;
            this.currencyType = builder.currencyType;
            this.deliveryTime = builder.deliveryTime;
            this.domainId = builder.domainId;
            this.domainLen = builder.domainLen;
            this.domainName = builder.domainName;
            this.domainType = builder.domainType;
            this.endDate = builder.endDate;
            this.expireDate = builder.expireDate;
            this.extend = builder.extend;
            this.freezeAmount = builder.freezeAmount;
            this.introduction = builder.introduction;
            this.isPremium = builder.isPremium;
            this.partnerTypes = builder.partnerTypes;
            this.price = builder.price;
            this.productId = builder.productId;
            this.publishTime = builder.publishTime;
            this.regDate = builder.regDate;
            this.reserved = builder.reserved;
            this.rmbPrice = builder.rmbPrice;
            this.s360Weight = builder.s360Weight;
            this.seoAttributes = builder.seoAttributes;
            this.shortName = builder.shortName;
            this.snatchTypeDesc = builder.snatchTypeDesc;
            this.sougouAntiLink = builder.sougouAntiLink;
            this.sougouIndex = builder.sougouIndex;
            this.sougouWeight = builder.sougouWeight;
            this.suffix = builder.suffix;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return auctionEndTime
         */
        public String getAuctionEndTime() {
            return this.auctionEndTime;
        }

        /**
         * @return auctionRemainingSeconds
         */
        public Long getAuctionRemainingSeconds() {
            return this.auctionRemainingSeconds;
        }

        /**
         * @return baiduAntiLink
         */
        public Integer getBaiduAntiLink() {
            return this.baiduAntiLink;
        }

        /**
         * @return baiduExLink
         */
        public Integer getBaiduExLink() {
            return this.baiduExLink;
        }

        /**
         * @return baiduIndex
         */
        public Integer getBaiduIndex() {
            return this.baiduIndex;
        }

        /**
         * @return baiduWeight
         */
        public Integer getBaiduWeight() {
            return this.baiduWeight;
        }

        /**
         * @return bookEndTime
         */
        public String getBookEndTime() {
            return this.bookEndTime;
        }

        /**
         * @return bookRemainingSeconds
         */
        public Long getBookRemainingSeconds() {
            return this.bookRemainingSeconds;
        }

        /**
         * @return bookedNum
         */
        public Integer getBookedNum() {
            return this.bookedNum;
        }

        /**
         * @return bookedPartners
         */
        public String getBookedPartners() {
            return this.bookedPartners;
        }

        /**
         * @return constitute
         */
        public String getConstitute() {
            return this.constitute;
        }

        /**
         * @return currencyType
         */
        public String getCurrencyType() {
            return this.currencyType;
        }

        /**
         * @return deliveryTime
         */
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return domainLen
         */
        public Integer getDomainLen() {
            return this.domainLen;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainType
         */
        public String getDomainType() {
            return this.domainType;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return extend
         */
        public String getExtend() {
            return this.extend;
        }

        /**
         * @return freezeAmount
         */
        public Double getFreezeAmount() {
            return this.freezeAmount;
        }

        /**
         * @return introduction
         */
        public String getIntroduction() {
            return this.introduction;
        }

        /**
         * @return isPremium
         */
        public Boolean getIsPremium() {
            return this.isPremium;
        }

        /**
         * @return partnerTypes
         */
        public String getPartnerTypes() {
            return this.partnerTypes;
        }

        /**
         * @return price
         */
        public Double getPrice() {
            return this.price;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return publishTime
         */
        public String getPublishTime() {
            return this.publishTime;
        }

        /**
         * @return regDate
         */
        public String getRegDate() {
            return this.regDate;
        }

        /**
         * @return reserved
         */
        public Boolean getReserved() {
            return this.reserved;
        }

        /**
         * @return rmbPrice
         */
        public Double getRmbPrice() {
            return this.rmbPrice;
        }

        /**
         * @return s360Weight
         */
        public Integer getS360Weight() {
            return this.s360Weight;
        }

        /**
         * @return seoAttributes
         */
        public String getSeoAttributes() {
            return this.seoAttributes;
        }

        /**
         * @return shortName
         */
        public String getShortName() {
            return this.shortName;
        }

        /**
         * @return snatchTypeDesc
         */
        public String getSnatchTypeDesc() {
            return this.snatchTypeDesc;
        }

        /**
         * @return sougouAntiLink
         */
        public Integer getSougouAntiLink() {
            return this.sougouAntiLink;
        }

        /**
         * @return sougouIndex
         */
        public Integer getSougouIndex() {
            return this.sougouIndex;
        }

        /**
         * @return sougouWeight
         */
        public Integer getSougouWeight() {
            return this.sougouWeight;
        }

        /**
         * @return suffix
         */
        public String getSuffix() {
            return this.suffix;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String auctionEndTime; 
            private Long auctionRemainingSeconds; 
            private Integer baiduAntiLink; 
            private Integer baiduExLink; 
            private Integer baiduIndex; 
            private Integer baiduWeight; 
            private String bookEndTime; 
            private Long bookRemainingSeconds; 
            private Integer bookedNum; 
            private String bookedPartners; 
            private String constitute; 
            private String currencyType; 
            private String deliveryTime; 
            private String domainId; 
            private Integer domainLen; 
            private String domainName; 
            private String domainType; 
            private String endDate; 
            private String expireDate; 
            private String extend; 
            private Double freezeAmount; 
            private String introduction; 
            private Boolean isPremium; 
            private String partnerTypes; 
            private Double price; 
            private String productId; 
            private String publishTime; 
            private String regDate; 
            private Boolean reserved; 
            private Double rmbPrice; 
            private Integer s360Weight; 
            private String seoAttributes; 
            private String shortName; 
            private String snatchTypeDesc; 
            private Integer sougouAntiLink; 
            private Integer sougouIndex; 
            private Integer sougouWeight; 
            private String suffix; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.auctionEndTime = model.auctionEndTime;
                this.auctionRemainingSeconds = model.auctionRemainingSeconds;
                this.baiduAntiLink = model.baiduAntiLink;
                this.baiduExLink = model.baiduExLink;
                this.baiduIndex = model.baiduIndex;
                this.baiduWeight = model.baiduWeight;
                this.bookEndTime = model.bookEndTime;
                this.bookRemainingSeconds = model.bookRemainingSeconds;
                this.bookedNum = model.bookedNum;
                this.bookedPartners = model.bookedPartners;
                this.constitute = model.constitute;
                this.currencyType = model.currencyType;
                this.deliveryTime = model.deliveryTime;
                this.domainId = model.domainId;
                this.domainLen = model.domainLen;
                this.domainName = model.domainName;
                this.domainType = model.domainType;
                this.endDate = model.endDate;
                this.expireDate = model.expireDate;
                this.extend = model.extend;
                this.freezeAmount = model.freezeAmount;
                this.introduction = model.introduction;
                this.isPremium = model.isPremium;
                this.partnerTypes = model.partnerTypes;
                this.price = model.price;
                this.productId = model.productId;
                this.publishTime = model.publishTime;
                this.regDate = model.regDate;
                this.reserved = model.reserved;
                this.rmbPrice = model.rmbPrice;
                this.s360Weight = model.s360Weight;
                this.seoAttributes = model.seoAttributes;
                this.shortName = model.shortName;
                this.snatchTypeDesc = model.snatchTypeDesc;
                this.sougouAntiLink = model.sougouAntiLink;
                this.sougouIndex = model.sougouIndex;
                this.sougouWeight = model.sougouWeight;
                this.suffix = model.suffix;
                this.weight = model.weight;
            } 

            /**
             * AuctionEndTime.
             */
            public Builder auctionEndTime(String auctionEndTime) {
                this.auctionEndTime = auctionEndTime;
                return this;
            }

            /**
             * AuctionRemainingSeconds.
             */
            public Builder auctionRemainingSeconds(Long auctionRemainingSeconds) {
                this.auctionRemainingSeconds = auctionRemainingSeconds;
                return this;
            }

            /**
             * BaiduAntiLink.
             */
            public Builder baiduAntiLink(Integer baiduAntiLink) {
                this.baiduAntiLink = baiduAntiLink;
                return this;
            }

            /**
             * BaiduExLink.
             */
            public Builder baiduExLink(Integer baiduExLink) {
                this.baiduExLink = baiduExLink;
                return this;
            }

            /**
             * BaiduIndex.
             */
            public Builder baiduIndex(Integer baiduIndex) {
                this.baiduIndex = baiduIndex;
                return this;
            }

            /**
             * BaiduWeight.
             */
            public Builder baiduWeight(Integer baiduWeight) {
                this.baiduWeight = baiduWeight;
                return this;
            }

            /**
             * BookEndTime.
             */
            public Builder bookEndTime(String bookEndTime) {
                this.bookEndTime = bookEndTime;
                return this;
            }

            /**
             * BookRemainingSeconds.
             */
            public Builder bookRemainingSeconds(Long bookRemainingSeconds) {
                this.bookRemainingSeconds = bookRemainingSeconds;
                return this;
            }

            /**
             * BookedNum.
             */
            public Builder bookedNum(Integer bookedNum) {
                this.bookedNum = bookedNum;
                return this;
            }

            /**
             * BookedPartners.
             */
            public Builder bookedPartners(String bookedPartners) {
                this.bookedPartners = bookedPartners;
                return this;
            }

            /**
             * Constitute.
             */
            public Builder constitute(String constitute) {
                this.constitute = constitute;
                return this;
            }

            /**
             * CurrencyType.
             */
            public Builder currencyType(String currencyType) {
                this.currencyType = currencyType;
                return this;
            }

            /**
             * DeliveryTime.
             */
            public Builder deliveryTime(String deliveryTime) {
                this.deliveryTime = deliveryTime;
                return this;
            }

            /**
             * DomainId.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * DomainLen.
             */
            public Builder domainLen(Integer domainLen) {
                this.domainLen = domainLen;
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
             * DomainType.
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * ExpireDate.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * Extend.
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * FreezeAmount.
             */
            public Builder freezeAmount(Double freezeAmount) {
                this.freezeAmount = freezeAmount;
                return this;
            }

            /**
             * Introduction.
             */
            public Builder introduction(String introduction) {
                this.introduction = introduction;
                return this;
            }

            /**
             * IsPremium.
             */
            public Builder isPremium(Boolean isPremium) {
                this.isPremium = isPremium;
                return this;
            }

            /**
             * PartnerTypes.
             */
            public Builder partnerTypes(String partnerTypes) {
                this.partnerTypes = partnerTypes;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(Double price) {
                this.price = price;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * PublishTime.
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * RegDate.
             */
            public Builder regDate(String regDate) {
                this.regDate = regDate;
                return this;
            }

            /**
             * Reserved.
             */
            public Builder reserved(Boolean reserved) {
                this.reserved = reserved;
                return this;
            }

            /**
             * RmbPrice.
             */
            public Builder rmbPrice(Double rmbPrice) {
                this.rmbPrice = rmbPrice;
                return this;
            }

            /**
             * S360Weight.
             */
            public Builder s360Weight(Integer s360Weight) {
                this.s360Weight = s360Weight;
                return this;
            }

            /**
             * SeoAttributes.
             */
            public Builder seoAttributes(String seoAttributes) {
                this.seoAttributes = seoAttributes;
                return this;
            }

            /**
             * ShortName.
             */
            public Builder shortName(String shortName) {
                this.shortName = shortName;
                return this;
            }

            /**
             * SnatchTypeDesc.
             */
            public Builder snatchTypeDesc(String snatchTypeDesc) {
                this.snatchTypeDesc = snatchTypeDesc;
                return this;
            }

            /**
             * SougouAntiLink.
             */
            public Builder sougouAntiLink(Integer sougouAntiLink) {
                this.sougouAntiLink = sougouAntiLink;
                return this;
            }

            /**
             * SougouIndex.
             */
            public Builder sougouIndex(Integer sougouIndex) {
                this.sougouIndex = sougouIndex;
                return this;
            }

            /**
             * SougouWeight.
             */
            public Builder sougouWeight(Integer sougouWeight) {
                this.sougouWeight = sougouWeight;
                return this;
            }

            /**
             * Suffix.
             */
            public Builder suffix(String suffix) {
                this.suffix = suffix;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
