// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bizworks20210408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUsageResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUsageResponseBody</p>
 */
public class QueryUsageResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryUsageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryUsageResponseBody build() {
            return new QueryUsageResponseBody(this);
        } 

    } 

    public static class ArticleInfos extends TeaModel {
        @NameInMap("articleType")
        private String articleType;

        @NameInMap("title")
        private String title;

        @NameInMap("url")
        private String url;

        private ArticleInfos(Builder builder) {
            this.articleType = builder.articleType;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArticleInfos create() {
            return builder().build();
        }

        /**
         * @return articleType
         */
        public String getArticleType() {
            return this.articleType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String articleType; 
            private String title; 
            private String url; 

            /**
             * articleType.
             */
            public Builder articleType(String articleType) {
                this.articleType = articleType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ArticleInfos build() {
                return new ArticleInfos(this);
            } 

        } 

    }
    public static class CommodityConfig extends TeaModel {
        @NameInMap("betaDeadlineMs")
        private Long betaDeadlineMs;

        @NameInMap("commodityCode")
        private String commodityCode;

        @NameInMap("commodityName")
        private String commodityName;

        @NameInMap("expiredToReleasedHour")
        private Long expiredToReleasedHour;

        @NameInMap("inBeta")
        private Boolean inBeta;

        @NameInMap("independent")
        private Boolean independent;

        @NameInMap("paidType")
        private String paidType;

        @NameInMap("productCode")
        private String productCode;

        @NameInMap("quotaItems")
        private java.util.List < String > quotaItems;

        @NameInMap("specCodes")
        private java.util.List < String > specCodes;

        private CommodityConfig(Builder builder) {
            this.betaDeadlineMs = builder.betaDeadlineMs;
            this.commodityCode = builder.commodityCode;
            this.commodityName = builder.commodityName;
            this.expiredToReleasedHour = builder.expiredToReleasedHour;
            this.inBeta = builder.inBeta;
            this.independent = builder.independent;
            this.paidType = builder.paidType;
            this.productCode = builder.productCode;
            this.quotaItems = builder.quotaItems;
            this.specCodes = builder.specCodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommodityConfig create() {
            return builder().build();
        }

        /**
         * @return betaDeadlineMs
         */
        public Long getBetaDeadlineMs() {
            return this.betaDeadlineMs;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityName
         */
        public String getCommodityName() {
            return this.commodityName;
        }

        /**
         * @return expiredToReleasedHour
         */
        public Long getExpiredToReleasedHour() {
            return this.expiredToReleasedHour;
        }

        /**
         * @return inBeta
         */
        public Boolean getInBeta() {
            return this.inBeta;
        }

        /**
         * @return independent
         */
        public Boolean getIndependent() {
            return this.independent;
        }

        /**
         * @return paidType
         */
        public String getPaidType() {
            return this.paidType;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return quotaItems
         */
        public java.util.List < String > getQuotaItems() {
            return this.quotaItems;
        }

        /**
         * @return specCodes
         */
        public java.util.List < String > getSpecCodes() {
            return this.specCodes;
        }

        public static final class Builder {
            private Long betaDeadlineMs; 
            private String commodityCode; 
            private String commodityName; 
            private Long expiredToReleasedHour; 
            private Boolean inBeta; 
            private Boolean independent; 
            private String paidType; 
            private String productCode; 
            private java.util.List < String > quotaItems; 
            private java.util.List < String > specCodes; 

            /**
             * betaDeadlineMs.
             */
            public Builder betaDeadlineMs(Long betaDeadlineMs) {
                this.betaDeadlineMs = betaDeadlineMs;
                return this;
            }

            /**
             * commodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * commodityName.
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * expiredToReleasedHour.
             */
            public Builder expiredToReleasedHour(Long expiredToReleasedHour) {
                this.expiredToReleasedHour = expiredToReleasedHour;
                return this;
            }

            /**
             * inBeta.
             */
            public Builder inBeta(Boolean inBeta) {
                this.inBeta = inBeta;
                return this;
            }

            /**
             * independent.
             */
            public Builder independent(Boolean independent) {
                this.independent = independent;
                return this;
            }

            /**
             * paidType.
             */
            public Builder paidType(String paidType) {
                this.paidType = paidType;
                return this;
            }

            /**
             * productCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * quotaItems.
             */
            public Builder quotaItems(java.util.List < String > quotaItems) {
                this.quotaItems = quotaItems;
                return this;
            }

            /**
             * specCodes.
             */
            public Builder specCodes(java.util.List < String > specCodes) {
                this.specCodes = specCodes;
                return this;
            }

            public CommodityConfig build() {
                return new CommodityConfig(this);
            } 

        } 

    }
    public static class CommoditySpec extends TeaModel {
        @NameInMap("applicationNum")
        private String applicationNum;

        @NameInMap("commercializeStatus")
        private String commercializeStatus;

        @NameInMap("commodityCode")
        private String commodityCode;

        @NameInMap("commodityName")
        private String commodityName;

        @NameInMap("cpuNum")
        private Long cpuNum;

        @NameInMap("expireDate")
        private Long expireDate;

        @NameInMap("memNum")
        private Long memNum;

        @NameInMap("nextBuyActions")
        private java.util.List < String > nextBuyActions;

        @NameInMap("ntmCommodityInstanceId")
        private String ntmCommodityInstanceId;

        @NameInMap("openDate")
        private Long openDate;

        @NameInMap("relatedSubProducts")
        private java.util.List < String > relatedSubProducts;

        @NameInMap("remainingTime")
        private String remainingTime;

        @NameInMap("specCode")
        private String specCode;

        private CommoditySpec(Builder builder) {
            this.applicationNum = builder.applicationNum;
            this.commercializeStatus = builder.commercializeStatus;
            this.commodityCode = builder.commodityCode;
            this.commodityName = builder.commodityName;
            this.cpuNum = builder.cpuNum;
            this.expireDate = builder.expireDate;
            this.memNum = builder.memNum;
            this.nextBuyActions = builder.nextBuyActions;
            this.ntmCommodityInstanceId = builder.ntmCommodityInstanceId;
            this.openDate = builder.openDate;
            this.relatedSubProducts = builder.relatedSubProducts;
            this.remainingTime = builder.remainingTime;
            this.specCode = builder.specCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommoditySpec create() {
            return builder().build();
        }

        /**
         * @return applicationNum
         */
        public String getApplicationNum() {
            return this.applicationNum;
        }

        /**
         * @return commercializeStatus
         */
        public String getCommercializeStatus() {
            return this.commercializeStatus;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityName
         */
        public String getCommodityName() {
            return this.commodityName;
        }

        /**
         * @return cpuNum
         */
        public Long getCpuNum() {
            return this.cpuNum;
        }

        /**
         * @return expireDate
         */
        public Long getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return memNum
         */
        public Long getMemNum() {
            return this.memNum;
        }

        /**
         * @return nextBuyActions
         */
        public java.util.List < String > getNextBuyActions() {
            return this.nextBuyActions;
        }

        /**
         * @return ntmCommodityInstanceId
         */
        public String getNtmCommodityInstanceId() {
            return this.ntmCommodityInstanceId;
        }

        /**
         * @return openDate
         */
        public Long getOpenDate() {
            return this.openDate;
        }

        /**
         * @return relatedSubProducts
         */
        public java.util.List < String > getRelatedSubProducts() {
            return this.relatedSubProducts;
        }

        /**
         * @return remainingTime
         */
        public String getRemainingTime() {
            return this.remainingTime;
        }

        /**
         * @return specCode
         */
        public String getSpecCode() {
            return this.specCode;
        }

        public static final class Builder {
            private String applicationNum; 
            private String commercializeStatus; 
            private String commodityCode; 
            private String commodityName; 
            private Long cpuNum; 
            private Long expireDate; 
            private Long memNum; 
            private java.util.List < String > nextBuyActions; 
            private String ntmCommodityInstanceId; 
            private Long openDate; 
            private java.util.List < String > relatedSubProducts; 
            private String remainingTime; 
            private String specCode; 

            /**
             * applicationNum.
             */
            public Builder applicationNum(String applicationNum) {
                this.applicationNum = applicationNum;
                return this;
            }

            /**
             * commercializeStatus.
             */
            public Builder commercializeStatus(String commercializeStatus) {
                this.commercializeStatus = commercializeStatus;
                return this;
            }

            /**
             * commodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * commodityName.
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * cpuNum.
             */
            public Builder cpuNum(Long cpuNum) {
                this.cpuNum = cpuNum;
                return this;
            }

            /**
             * expireDate.
             */
            public Builder expireDate(Long expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * memNum.
             */
            public Builder memNum(Long memNum) {
                this.memNum = memNum;
                return this;
            }

            /**
             * nextBuyActions.
             */
            public Builder nextBuyActions(java.util.List < String > nextBuyActions) {
                this.nextBuyActions = nextBuyActions;
                return this;
            }

            /**
             * ntmCommodityInstanceId.
             */
            public Builder ntmCommodityInstanceId(String ntmCommodityInstanceId) {
                this.ntmCommodityInstanceId = ntmCommodityInstanceId;
                return this;
            }

            /**
             * openDate.
             */
            public Builder openDate(Long openDate) {
                this.openDate = openDate;
                return this;
            }

            /**
             * relatedSubProducts.
             */
            public Builder relatedSubProducts(java.util.List < String > relatedSubProducts) {
                this.relatedSubProducts = relatedSubProducts;
                return this;
            }

            /**
             * remainingTime.
             */
            public Builder remainingTime(String remainingTime) {
                this.remainingTime = remainingTime;
                return this;
            }

            /**
             * specCode.
             */
            public Builder specCode(String specCode) {
                this.specCode = specCode;
                return this;
            }

            public CommoditySpec build() {
                return new CommoditySpec(this);
            } 

        } 

    }
    public static class CommodityUsage extends TeaModel {
        @NameInMap("applicationNum")
        private Long applicationNum;

        @NameInMap("cpuNum")
        private Long cpuNum;

        @NameInMap("memNum")
        private Long memNum;

        private CommodityUsage(Builder builder) {
            this.applicationNum = builder.applicationNum;
            this.cpuNum = builder.cpuNum;
            this.memNum = builder.memNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommodityUsage create() {
            return builder().build();
        }

        /**
         * @return applicationNum
         */
        public Long getApplicationNum() {
            return this.applicationNum;
        }

        /**
         * @return cpuNum
         */
        public Long getCpuNum() {
            return this.cpuNum;
        }

        /**
         * @return memNum
         */
        public Long getMemNum() {
            return this.memNum;
        }

        public static final class Builder {
            private Long applicationNum; 
            private Long cpuNum; 
            private Long memNum; 

            /**
             * applicationNum.
             */
            public Builder applicationNum(Long applicationNum) {
                this.applicationNum = applicationNum;
                return this;
            }

            /**
             * cpuNum.
             */
            public Builder cpuNum(Long cpuNum) {
                this.cpuNum = cpuNum;
                return this;
            }

            /**
             * memNum.
             */
            public Builder memNum(Long memNum) {
                this.memNum = memNum;
                return this;
            }

            public CommodityUsage build() {
                return new CommodityUsage(this);
            } 

        } 

    }
    public static class PurchasedCommoditySpecUsages extends TeaModel {
        @NameInMap("commoditySpec")
        private CommoditySpec commoditySpec;

        @NameInMap("commodityUsage")
        private CommodityUsage commodityUsage;

        private PurchasedCommoditySpecUsages(Builder builder) {
            this.commoditySpec = builder.commoditySpec;
            this.commodityUsage = builder.commodityUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PurchasedCommoditySpecUsages create() {
            return builder().build();
        }

        /**
         * @return commoditySpec
         */
        public CommoditySpec getCommoditySpec() {
            return this.commoditySpec;
        }

        /**
         * @return commodityUsage
         */
        public CommodityUsage getCommodityUsage() {
            return this.commodityUsage;
        }

        public static final class Builder {
            private CommoditySpec commoditySpec; 
            private CommodityUsage commodityUsage; 

            /**
             * commoditySpec.
             */
            public Builder commoditySpec(CommoditySpec commoditySpec) {
                this.commoditySpec = commoditySpec;
                return this;
            }

            /**
             * commodityUsage.
             */
            public Builder commodityUsage(CommodityUsage commodityUsage) {
                this.commodityUsage = commodityUsage;
                return this;
            }

            public PurchasedCommoditySpecUsages build() {
                return new PurchasedCommoditySpecUsages(this);
            } 

        } 

    }
    public static class CommoditySpecUsageInfos extends TeaModel {
        @NameInMap("commodityConfig")
        private CommodityConfig commodityConfig;

        @NameInMap("purchasedCommoditySpecUsages")
        private java.util.List < PurchasedCommoditySpecUsages> purchasedCommoditySpecUsages;

        private CommoditySpecUsageInfos(Builder builder) {
            this.commodityConfig = builder.commodityConfig;
            this.purchasedCommoditySpecUsages = builder.purchasedCommoditySpecUsages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommoditySpecUsageInfos create() {
            return builder().build();
        }

        /**
         * @return commodityConfig
         */
        public CommodityConfig getCommodityConfig() {
            return this.commodityConfig;
        }

        /**
         * @return purchasedCommoditySpecUsages
         */
        public java.util.List < PurchasedCommoditySpecUsages> getPurchasedCommoditySpecUsages() {
            return this.purchasedCommoditySpecUsages;
        }

        public static final class Builder {
            private CommodityConfig commodityConfig; 
            private java.util.List < PurchasedCommoditySpecUsages> purchasedCommoditySpecUsages; 

            /**
             * commodityConfig.
             */
            public Builder commodityConfig(CommodityConfig commodityConfig) {
                this.commodityConfig = commodityConfig;
                return this;
            }

            /**
             * purchasedCommoditySpecUsages.
             */
            public Builder purchasedCommoditySpecUsages(java.util.List < PurchasedCommoditySpecUsages> purchasedCommoditySpecUsages) {
                this.purchasedCommoditySpecUsages = purchasedCommoditySpecUsages;
                return this;
            }

            public CommoditySpecUsageInfos build() {
                return new CommoditySpecUsageInfos(this);
            } 

        } 

    }
    public static class SubProduct extends TeaModel {
        @NameInMap("display")
        private Boolean display;

        @NameInMap("extendProperties")
        private java.util.Map < String, ? > extendProperties;

        @NameInMap("subProductCode")
        private String subProductCode;

        @NameInMap("subProductName")
        private String subProductName;

        @NameInMap("subProductState")
        private String subProductState;

        private SubProduct(Builder builder) {
            this.display = builder.display;
            this.extendProperties = builder.extendProperties;
            this.subProductCode = builder.subProductCode;
            this.subProductName = builder.subProductName;
            this.subProductState = builder.subProductState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubProduct create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Boolean getDisplay() {
            return this.display;
        }

        /**
         * @return extendProperties
         */
        public java.util.Map < String, ? > getExtendProperties() {
            return this.extendProperties;
        }

        /**
         * @return subProductCode
         */
        public String getSubProductCode() {
            return this.subProductCode;
        }

        /**
         * @return subProductName
         */
        public String getSubProductName() {
            return this.subProductName;
        }

        /**
         * @return subProductState
         */
        public String getSubProductState() {
            return this.subProductState;
        }

        public static final class Builder {
            private Boolean display; 
            private java.util.Map < String, ? > extendProperties; 
            private String subProductCode; 
            private String subProductName; 
            private String subProductState; 

            /**
             * display.
             */
            public Builder display(Boolean display) {
                this.display = display;
                return this;
            }

            /**
             * extendProperties.
             */
            public Builder extendProperties(java.util.Map < String, ? > extendProperties) {
                this.extendProperties = extendProperties;
                return this;
            }

            /**
             * subProductCode.
             */
            public Builder subProductCode(String subProductCode) {
                this.subProductCode = subProductCode;
                return this;
            }

            /**
             * subProductName.
             */
            public Builder subProductName(String subProductName) {
                this.subProductName = subProductName;
                return this;
            }

            /**
             * subProductState.
             */
            public Builder subProductState(String subProductState) {
                this.subProductState = subProductState;
                return this;
            }

            public SubProduct build() {
                return new SubProduct(this);
            } 

        } 

    }
    public static class SubProductCommoditySpecsForGuideToBuyCommodityConfig extends TeaModel {
        @NameInMap("betaDeadlineMs")
        private Long betaDeadlineMs;

        @NameInMap("commodityCode")
        private String commodityCode;

        @NameInMap("commodityName")
        private String commodityName;

        @NameInMap("expiredToReleasedHour")
        private Long expiredToReleasedHour;

        @NameInMap("inBeta")
        private Boolean inBeta;

        @NameInMap("independent")
        private Boolean independent;

        @NameInMap("paidType")
        private String paidType;

        @NameInMap("productCode")
        private String productCode;

        @NameInMap("quotaItems")
        private java.util.List < String > quotaItems;

        @NameInMap("specCodes")
        private java.util.List < String > specCodes;

        private SubProductCommoditySpecsForGuideToBuyCommodityConfig(Builder builder) {
            this.betaDeadlineMs = builder.betaDeadlineMs;
            this.commodityCode = builder.commodityCode;
            this.commodityName = builder.commodityName;
            this.expiredToReleasedHour = builder.expiredToReleasedHour;
            this.inBeta = builder.inBeta;
            this.independent = builder.independent;
            this.paidType = builder.paidType;
            this.productCode = builder.productCode;
            this.quotaItems = builder.quotaItems;
            this.specCodes = builder.specCodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubProductCommoditySpecsForGuideToBuyCommodityConfig create() {
            return builder().build();
        }

        /**
         * @return betaDeadlineMs
         */
        public Long getBetaDeadlineMs() {
            return this.betaDeadlineMs;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityName
         */
        public String getCommodityName() {
            return this.commodityName;
        }

        /**
         * @return expiredToReleasedHour
         */
        public Long getExpiredToReleasedHour() {
            return this.expiredToReleasedHour;
        }

        /**
         * @return inBeta
         */
        public Boolean getInBeta() {
            return this.inBeta;
        }

        /**
         * @return independent
         */
        public Boolean getIndependent() {
            return this.independent;
        }

        /**
         * @return paidType
         */
        public String getPaidType() {
            return this.paidType;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return quotaItems
         */
        public java.util.List < String > getQuotaItems() {
            return this.quotaItems;
        }

        /**
         * @return specCodes
         */
        public java.util.List < String > getSpecCodes() {
            return this.specCodes;
        }

        public static final class Builder {
            private Long betaDeadlineMs; 
            private String commodityCode; 
            private String commodityName; 
            private Long expiredToReleasedHour; 
            private Boolean inBeta; 
            private Boolean independent; 
            private String paidType; 
            private String productCode; 
            private java.util.List < String > quotaItems; 
            private java.util.List < String > specCodes; 

            /**
             * betaDeadlineMs.
             */
            public Builder betaDeadlineMs(Long betaDeadlineMs) {
                this.betaDeadlineMs = betaDeadlineMs;
                return this;
            }

            /**
             * commodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * commodityName.
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * expiredToReleasedHour.
             */
            public Builder expiredToReleasedHour(Long expiredToReleasedHour) {
                this.expiredToReleasedHour = expiredToReleasedHour;
                return this;
            }

            /**
             * inBeta.
             */
            public Builder inBeta(Boolean inBeta) {
                this.inBeta = inBeta;
                return this;
            }

            /**
             * independent.
             */
            public Builder independent(Boolean independent) {
                this.independent = independent;
                return this;
            }

            /**
             * paidType.
             */
            public Builder paidType(String paidType) {
                this.paidType = paidType;
                return this;
            }

            /**
             * productCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * quotaItems.
             */
            public Builder quotaItems(java.util.List < String > quotaItems) {
                this.quotaItems = quotaItems;
                return this;
            }

            /**
             * specCodes.
             */
            public Builder specCodes(java.util.List < String > specCodes) {
                this.specCodes = specCodes;
                return this;
            }

            public SubProductCommoditySpecsForGuideToBuyCommodityConfig build() {
                return new SubProductCommoditySpecsForGuideToBuyCommodityConfig(this);
            } 

        } 

    }
    public static class SubProductCommoditySpecsForGuideToBuyCommoditySpec extends TeaModel {
        @NameInMap("applicationNum")
        private Long applicationNum;

        @NameInMap("commercializeStatus")
        private String commercializeStatus;

        @NameInMap("commodityCode")
        private String commodityCode;

        @NameInMap("commodityName")
        private String commodityName;

        @NameInMap("cpuNum")
        private Long cpuNum;

        @NameInMap("expireDate")
        private Long expireDate;

        @NameInMap("memNum")
        private Long memNum;

        @NameInMap("nextBuyActions")
        private String nextBuyActions;

        @NameInMap("ntmCommodityInstanceId")
        private String ntmCommodityInstanceId;

        @NameInMap("openDate")
        private Long openDate;

        @NameInMap("relatedSubProducts")
        private java.util.List < String > relatedSubProducts;

        @NameInMap("specCode")
        private String specCode;

        @NameInMap("specName")
        private String specName;

        private SubProductCommoditySpecsForGuideToBuyCommoditySpec(Builder builder) {
            this.applicationNum = builder.applicationNum;
            this.commercializeStatus = builder.commercializeStatus;
            this.commodityCode = builder.commodityCode;
            this.commodityName = builder.commodityName;
            this.cpuNum = builder.cpuNum;
            this.expireDate = builder.expireDate;
            this.memNum = builder.memNum;
            this.nextBuyActions = builder.nextBuyActions;
            this.ntmCommodityInstanceId = builder.ntmCommodityInstanceId;
            this.openDate = builder.openDate;
            this.relatedSubProducts = builder.relatedSubProducts;
            this.specCode = builder.specCode;
            this.specName = builder.specName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubProductCommoditySpecsForGuideToBuyCommoditySpec create() {
            return builder().build();
        }

        /**
         * @return applicationNum
         */
        public Long getApplicationNum() {
            return this.applicationNum;
        }

        /**
         * @return commercializeStatus
         */
        public String getCommercializeStatus() {
            return this.commercializeStatus;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityName
         */
        public String getCommodityName() {
            return this.commodityName;
        }

        /**
         * @return cpuNum
         */
        public Long getCpuNum() {
            return this.cpuNum;
        }

        /**
         * @return expireDate
         */
        public Long getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return memNum
         */
        public Long getMemNum() {
            return this.memNum;
        }

        /**
         * @return nextBuyActions
         */
        public String getNextBuyActions() {
            return this.nextBuyActions;
        }

        /**
         * @return ntmCommodityInstanceId
         */
        public String getNtmCommodityInstanceId() {
            return this.ntmCommodityInstanceId;
        }

        /**
         * @return openDate
         */
        public Long getOpenDate() {
            return this.openDate;
        }

        /**
         * @return relatedSubProducts
         */
        public java.util.List < String > getRelatedSubProducts() {
            return this.relatedSubProducts;
        }

        /**
         * @return specCode
         */
        public String getSpecCode() {
            return this.specCode;
        }

        /**
         * @return specName
         */
        public String getSpecName() {
            return this.specName;
        }

        public static final class Builder {
            private Long applicationNum; 
            private String commercializeStatus; 
            private String commodityCode; 
            private String commodityName; 
            private Long cpuNum; 
            private Long expireDate; 
            private Long memNum; 
            private String nextBuyActions; 
            private String ntmCommodityInstanceId; 
            private Long openDate; 
            private java.util.List < String > relatedSubProducts; 
            private String specCode; 
            private String specName; 

            /**
             * applicationNum.
             */
            public Builder applicationNum(Long applicationNum) {
                this.applicationNum = applicationNum;
                return this;
            }

            /**
             * commercializeStatus.
             */
            public Builder commercializeStatus(String commercializeStatus) {
                this.commercializeStatus = commercializeStatus;
                return this;
            }

            /**
             * commodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * commodityName.
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * cpuNum.
             */
            public Builder cpuNum(Long cpuNum) {
                this.cpuNum = cpuNum;
                return this;
            }

            /**
             * expireDate.
             */
            public Builder expireDate(Long expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * memNum.
             */
            public Builder memNum(Long memNum) {
                this.memNum = memNum;
                return this;
            }

            /**
             * nextBuyActions.
             */
            public Builder nextBuyActions(String nextBuyActions) {
                this.nextBuyActions = nextBuyActions;
                return this;
            }

            /**
             * ntmCommodityInstanceId.
             */
            public Builder ntmCommodityInstanceId(String ntmCommodityInstanceId) {
                this.ntmCommodityInstanceId = ntmCommodityInstanceId;
                return this;
            }

            /**
             * openDate.
             */
            public Builder openDate(Long openDate) {
                this.openDate = openDate;
                return this;
            }

            /**
             * relatedSubProducts.
             */
            public Builder relatedSubProducts(java.util.List < String > relatedSubProducts) {
                this.relatedSubProducts = relatedSubProducts;
                return this;
            }

            /**
             * specCode.
             */
            public Builder specCode(String specCode) {
                this.specCode = specCode;
                return this;
            }

            /**
             * specName.
             */
            public Builder specName(String specName) {
                this.specName = specName;
                return this;
            }

            public SubProductCommoditySpecsForGuideToBuyCommoditySpec build() {
                return new SubProductCommoditySpecsForGuideToBuyCommoditySpec(this);
            } 

        } 

    }
    public static class SubProductCommoditySpecsForGuideToBuy extends TeaModel {
        @NameInMap("commodityConfig")
        private SubProductCommoditySpecsForGuideToBuyCommodityConfig commodityConfig;

        @NameInMap("commoditySpec")
        private SubProductCommoditySpecsForGuideToBuyCommoditySpec commoditySpec;

        @NameInMap("releaseTime")
        private Long releaseTime;

        private SubProductCommoditySpecsForGuideToBuy(Builder builder) {
            this.commodityConfig = builder.commodityConfig;
            this.commoditySpec = builder.commoditySpec;
            this.releaseTime = builder.releaseTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubProductCommoditySpecsForGuideToBuy create() {
            return builder().build();
        }

        /**
         * @return commodityConfig
         */
        public SubProductCommoditySpecsForGuideToBuyCommodityConfig getCommodityConfig() {
            return this.commodityConfig;
        }

        /**
         * @return commoditySpec
         */
        public SubProductCommoditySpecsForGuideToBuyCommoditySpec getCommoditySpec() {
            return this.commoditySpec;
        }

        /**
         * @return releaseTime
         */
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public static final class Builder {
            private SubProductCommoditySpecsForGuideToBuyCommodityConfig commodityConfig; 
            private SubProductCommoditySpecsForGuideToBuyCommoditySpec commoditySpec; 
            private Long releaseTime; 

            /**
             * commodityConfig.
             */
            public Builder commodityConfig(SubProductCommoditySpecsForGuideToBuyCommodityConfig commodityConfig) {
                this.commodityConfig = commodityConfig;
                return this;
            }

            /**
             * commoditySpec.
             */
            public Builder commoditySpec(SubProductCommoditySpecsForGuideToBuyCommoditySpec commoditySpec) {
                this.commoditySpec = commoditySpec;
                return this;
            }

            /**
             * releaseTime.
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            public SubProductCommoditySpecsForGuideToBuy build() {
                return new SubProductCommoditySpecsForGuideToBuy(this);
            } 

        } 

    }
    public static class SubProductInfos extends TeaModel {
        @NameInMap("subProduct")
        private SubProduct subProduct;

        @NameInMap("subProductCommoditySpecsForGuideToBuy")
        private java.util.List < SubProductCommoditySpecsForGuideToBuy> subProductCommoditySpecsForGuideToBuy;

        private SubProductInfos(Builder builder) {
            this.subProduct = builder.subProduct;
            this.subProductCommoditySpecsForGuideToBuy = builder.subProductCommoditySpecsForGuideToBuy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubProductInfos create() {
            return builder().build();
        }

        /**
         * @return subProduct
         */
        public SubProduct getSubProduct() {
            return this.subProduct;
        }

        /**
         * @return subProductCommoditySpecsForGuideToBuy
         */
        public java.util.List < SubProductCommoditySpecsForGuideToBuy> getSubProductCommoditySpecsForGuideToBuy() {
            return this.subProductCommoditySpecsForGuideToBuy;
        }

        public static final class Builder {
            private SubProduct subProduct; 
            private java.util.List < SubProductCommoditySpecsForGuideToBuy> subProductCommoditySpecsForGuideToBuy; 

            /**
             * subProduct.
             */
            public Builder subProduct(SubProduct subProduct) {
                this.subProduct = subProduct;
                return this;
            }

            /**
             * subProductCommoditySpecsForGuideToBuy.
             */
            public Builder subProductCommoditySpecsForGuideToBuy(java.util.List < SubProductCommoditySpecsForGuideToBuy> subProductCommoditySpecsForGuideToBuy) {
                this.subProductCommoditySpecsForGuideToBuy = subProductCommoditySpecsForGuideToBuy;
                return this;
            }

            public SubProductInfos build() {
                return new SubProductInfos(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("articleInfos")
        private java.util.List < ArticleInfos> articleInfos;

        @NameInMap("commoditySpecUsageInfos")
        private java.util.List < CommoditySpecUsageInfos> commoditySpecUsageInfos;

        @NameInMap("subProductInfos")
        private java.util.List < SubProductInfos> subProductInfos;

        private Data(Builder builder) {
            this.articleInfos = builder.articleInfos;
            this.commoditySpecUsageInfos = builder.commoditySpecUsageInfos;
            this.subProductInfos = builder.subProductInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return articleInfos
         */
        public java.util.List < ArticleInfos> getArticleInfos() {
            return this.articleInfos;
        }

        /**
         * @return commoditySpecUsageInfos
         */
        public java.util.List < CommoditySpecUsageInfos> getCommoditySpecUsageInfos() {
            return this.commoditySpecUsageInfos;
        }

        /**
         * @return subProductInfos
         */
        public java.util.List < SubProductInfos> getSubProductInfos() {
            return this.subProductInfos;
        }

        public static final class Builder {
            private java.util.List < ArticleInfos> articleInfos; 
            private java.util.List < CommoditySpecUsageInfos> commoditySpecUsageInfos; 
            private java.util.List < SubProductInfos> subProductInfos; 

            /**
             * articleInfos.
             */
            public Builder articleInfos(java.util.List < ArticleInfos> articleInfos) {
                this.articleInfos = articleInfos;
                return this;
            }

            /**
             * commoditySpecUsageInfos.
             */
            public Builder commoditySpecUsageInfos(java.util.List < CommoditySpecUsageInfos> commoditySpecUsageInfos) {
                this.commoditySpecUsageInfos = commoditySpecUsageInfos;
                return this;
            }

            /**
             * subProductInfos.
             */
            public Builder subProductInfos(java.util.List < SubProductInfos> subProductInfos) {
                this.subProductInfos = subProductInfos;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
