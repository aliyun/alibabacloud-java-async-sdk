// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAdvancedDomainListRequest} extends {@link RequestModel}
 *
 * <p>QueryAdvancedDomainListRequest</p>
 */
public class QueryAdvancedDomainListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainGroupId")
    private Long domainGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainNameSort")
    private Boolean domainNameSort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainStatus")
    private Integer domainStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndExpirationDate")
    private Long endExpirationDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndLength")
    private Integer endLength;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndRegistrationDate")
    private Long endRegistrationDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Excluded")
    private String excluded;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludedPrefix")
    private Boolean excludedPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludedSuffix")
    private Boolean excludedSuffix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpirationDateSort")
    private Boolean expirationDateSort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Form")
    private Integer form;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsPremiumDomain")
    private Boolean isPremiumDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyWord")
    private String keyWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyWordPrefix")
    private Boolean keyWordPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyWordSuffix")
    private Boolean keyWordSuffix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 200, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductDomainType")
    private String productDomainType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductDomainTypeSort")
    private Boolean productDomainTypeSort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrationDateSort")
    private Boolean registrationDateSort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartExpirationDate")
    private Long startExpirationDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartLength")
    private Integer startLength;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartRegistrationDate")
    private Long startRegistrationDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Suffixs")
    private String suffixs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TradeType")
    private Integer tradeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private QueryAdvancedDomainListRequest(Builder builder) {
        super(builder);
        this.domainGroupId = builder.domainGroupId;
        this.domainNameSort = builder.domainNameSort;
        this.domainStatus = builder.domainStatus;
        this.endExpirationDate = builder.endExpirationDate;
        this.endLength = builder.endLength;
        this.endRegistrationDate = builder.endRegistrationDate;
        this.excluded = builder.excluded;
        this.excludedPrefix = builder.excludedPrefix;
        this.excludedSuffix = builder.excludedSuffix;
        this.expirationDateSort = builder.expirationDateSort;
        this.form = builder.form;
        this.isPremiumDomain = builder.isPremiumDomain;
        this.keyWord = builder.keyWord;
        this.keyWordPrefix = builder.keyWordPrefix;
        this.keyWordSuffix = builder.keyWordSuffix;
        this.lang = builder.lang;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.productDomainType = builder.productDomainType;
        this.productDomainTypeSort = builder.productDomainTypeSort;
        this.registrationDateSort = builder.registrationDateSort;
        this.resourceGroupId = builder.resourceGroupId;
        this.startExpirationDate = builder.startExpirationDate;
        this.startLength = builder.startLength;
        this.startRegistrationDate = builder.startRegistrationDate;
        this.suffixs = builder.suffixs;
        this.tag = builder.tag;
        this.tradeType = builder.tradeType;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAdvancedDomainListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainGroupId
     */
    public Long getDomainGroupId() {
        return this.domainGroupId;
    }

    /**
     * @return domainNameSort
     */
    public Boolean getDomainNameSort() {
        return this.domainNameSort;
    }

    /**
     * @return domainStatus
     */
    public Integer getDomainStatus() {
        return this.domainStatus;
    }

    /**
     * @return endExpirationDate
     */
    public Long getEndExpirationDate() {
        return this.endExpirationDate;
    }

    /**
     * @return endLength
     */
    public Integer getEndLength() {
        return this.endLength;
    }

    /**
     * @return endRegistrationDate
     */
    public Long getEndRegistrationDate() {
        return this.endRegistrationDate;
    }

    /**
     * @return excluded
     */
    public String getExcluded() {
        return this.excluded;
    }

    /**
     * @return excludedPrefix
     */
    public Boolean getExcludedPrefix() {
        return this.excludedPrefix;
    }

    /**
     * @return excludedSuffix
     */
    public Boolean getExcludedSuffix() {
        return this.excludedSuffix;
    }

    /**
     * @return expirationDateSort
     */
    public Boolean getExpirationDateSort() {
        return this.expirationDateSort;
    }

    /**
     * @return form
     */
    public Integer getForm() {
        return this.form;
    }

    /**
     * @return isPremiumDomain
     */
    public Boolean getIsPremiumDomain() {
        return this.isPremiumDomain;
    }

    /**
     * @return keyWord
     */
    public String getKeyWord() {
        return this.keyWord;
    }

    /**
     * @return keyWordPrefix
     */
    public Boolean getKeyWordPrefix() {
        return this.keyWordPrefix;
    }

    /**
     * @return keyWordSuffix
     */
    public Boolean getKeyWordSuffix() {
        return this.keyWordSuffix;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productDomainType
     */
    public String getProductDomainType() {
        return this.productDomainType;
    }

    /**
     * @return productDomainTypeSort
     */
    public Boolean getProductDomainTypeSort() {
        return this.productDomainTypeSort;
    }

    /**
     * @return registrationDateSort
     */
    public Boolean getRegistrationDateSort() {
        return this.registrationDateSort;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return startExpirationDate
     */
    public Long getStartExpirationDate() {
        return this.startExpirationDate;
    }

    /**
     * @return startLength
     */
    public Integer getStartLength() {
        return this.startLength;
    }

    /**
     * @return startRegistrationDate
     */
    public Long getStartRegistrationDate() {
        return this.startRegistrationDate;
    }

    /**
     * @return suffixs
     */
    public String getSuffixs() {
        return this.suffixs;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return tradeType
     */
    public Integer getTradeType() {
        return this.tradeType;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<QueryAdvancedDomainListRequest, Builder> {
        private Long domainGroupId; 
        private Boolean domainNameSort; 
        private Integer domainStatus; 
        private Long endExpirationDate; 
        private Integer endLength; 
        private Long endRegistrationDate; 
        private String excluded; 
        private Boolean excludedPrefix; 
        private Boolean excludedSuffix; 
        private Boolean expirationDateSort; 
        private Integer form; 
        private Boolean isPremiumDomain; 
        private String keyWord; 
        private Boolean keyWordPrefix; 
        private Boolean keyWordSuffix; 
        private String lang; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String productDomainType; 
        private Boolean productDomainTypeSort; 
        private Boolean registrationDateSort; 
        private String resourceGroupId; 
        private Long startExpirationDate; 
        private Integer startLength; 
        private Long startRegistrationDate; 
        private String suffixs; 
        private java.util.List < Tag> tag; 
        private Integer tradeType; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryAdvancedDomainListRequest request) {
            super(request);
            this.domainGroupId = request.domainGroupId;
            this.domainNameSort = request.domainNameSort;
            this.domainStatus = request.domainStatus;
            this.endExpirationDate = request.endExpirationDate;
            this.endLength = request.endLength;
            this.endRegistrationDate = request.endRegistrationDate;
            this.excluded = request.excluded;
            this.excludedPrefix = request.excludedPrefix;
            this.excludedSuffix = request.excludedSuffix;
            this.expirationDateSort = request.expirationDateSort;
            this.form = request.form;
            this.isPremiumDomain = request.isPremiumDomain;
            this.keyWord = request.keyWord;
            this.keyWordPrefix = request.keyWordPrefix;
            this.keyWordSuffix = request.keyWordSuffix;
            this.lang = request.lang;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.productDomainType = request.productDomainType;
            this.productDomainTypeSort = request.productDomainTypeSort;
            this.registrationDateSort = request.registrationDateSort;
            this.resourceGroupId = request.resourceGroupId;
            this.startExpirationDate = request.startExpirationDate;
            this.startLength = request.startLength;
            this.startRegistrationDate = request.startRegistrationDate;
            this.suffixs = request.suffixs;
            this.tag = request.tag;
            this.tradeType = request.tradeType;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * DomainGroupId.
         */
        public Builder domainGroupId(Long domainGroupId) {
            this.putQueryParameter("DomainGroupId", domainGroupId);
            this.domainGroupId = domainGroupId;
            return this;
        }

        /**
         * DomainNameSort.
         */
        public Builder domainNameSort(Boolean domainNameSort) {
            this.putQueryParameter("DomainNameSort", domainNameSort);
            this.domainNameSort = domainNameSort;
            return this;
        }

        /**
         * DomainStatus.
         */
        public Builder domainStatus(Integer domainStatus) {
            this.putQueryParameter("DomainStatus", domainStatus);
            this.domainStatus = domainStatus;
            return this;
        }

        /**
         * EndExpirationDate.
         */
        public Builder endExpirationDate(Long endExpirationDate) {
            this.putQueryParameter("EndExpirationDate", endExpirationDate);
            this.endExpirationDate = endExpirationDate;
            return this;
        }

        /**
         * EndLength.
         */
        public Builder endLength(Integer endLength) {
            this.putQueryParameter("EndLength", endLength);
            this.endLength = endLength;
            return this;
        }

        /**
         * EndRegistrationDate.
         */
        public Builder endRegistrationDate(Long endRegistrationDate) {
            this.putQueryParameter("EndRegistrationDate", endRegistrationDate);
            this.endRegistrationDate = endRegistrationDate;
            return this;
        }

        /**
         * Excluded.
         */
        public Builder excluded(String excluded) {
            this.putQueryParameter("Excluded", excluded);
            this.excluded = excluded;
            return this;
        }

        /**
         * ExcludedPrefix.
         */
        public Builder excludedPrefix(Boolean excludedPrefix) {
            this.putQueryParameter("ExcludedPrefix", excludedPrefix);
            this.excludedPrefix = excludedPrefix;
            return this;
        }

        /**
         * ExcludedSuffix.
         */
        public Builder excludedSuffix(Boolean excludedSuffix) {
            this.putQueryParameter("ExcludedSuffix", excludedSuffix);
            this.excludedSuffix = excludedSuffix;
            return this;
        }

        /**
         * ExpirationDateSort.
         */
        public Builder expirationDateSort(Boolean expirationDateSort) {
            this.putQueryParameter("ExpirationDateSort", expirationDateSort);
            this.expirationDateSort = expirationDateSort;
            return this;
        }

        /**
         * Form.
         */
        public Builder form(Integer form) {
            this.putQueryParameter("Form", form);
            this.form = form;
            return this;
        }

        /**
         * IsPremiumDomain.
         */
        public Builder isPremiumDomain(Boolean isPremiumDomain) {
            this.putQueryParameter("IsPremiumDomain", isPremiumDomain);
            this.isPremiumDomain = isPremiumDomain;
            return this;
        }

        /**
         * KeyWord.
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
            return this;
        }

        /**
         * KeyWordPrefix.
         */
        public Builder keyWordPrefix(Boolean keyWordPrefix) {
            this.putQueryParameter("KeyWordPrefix", keyWordPrefix);
            this.keyWordPrefix = keyWordPrefix;
            return this;
        }

        /**
         * KeyWordSuffix.
         */
        public Builder keyWordSuffix(Boolean keyWordSuffix) {
            this.putQueryParameter("KeyWordSuffix", keyWordSuffix);
            this.keyWordSuffix = keyWordSuffix;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductDomainType.
         */
        public Builder productDomainType(String productDomainType) {
            this.putQueryParameter("ProductDomainType", productDomainType);
            this.productDomainType = productDomainType;
            return this;
        }

        /**
         * ProductDomainTypeSort.
         */
        public Builder productDomainTypeSort(Boolean productDomainTypeSort) {
            this.putQueryParameter("ProductDomainTypeSort", productDomainTypeSort);
            this.productDomainTypeSort = productDomainTypeSort;
            return this;
        }

        /**
         * RegistrationDateSort.
         */
        public Builder registrationDateSort(Boolean registrationDateSort) {
            this.putQueryParameter("RegistrationDateSort", registrationDateSort);
            this.registrationDateSort = registrationDateSort;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * StartExpirationDate.
         */
        public Builder startExpirationDate(Long startExpirationDate) {
            this.putQueryParameter("StartExpirationDate", startExpirationDate);
            this.startExpirationDate = startExpirationDate;
            return this;
        }

        /**
         * StartLength.
         */
        public Builder startLength(Integer startLength) {
            this.putQueryParameter("StartLength", startLength);
            this.startLength = startLength;
            return this;
        }

        /**
         * StartRegistrationDate.
         */
        public Builder startRegistrationDate(Long startRegistrationDate) {
            this.putQueryParameter("StartRegistrationDate", startRegistrationDate);
            this.startRegistrationDate = startRegistrationDate;
            return this;
        }

        /**
         * Suffixs.
         */
        public Builder suffixs(String suffixs) {
            this.putQueryParameter("Suffixs", suffixs);
            this.suffixs = suffixs;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * TradeType.
         */
        public Builder tradeType(Integer tradeType) {
            this.putQueryParameter("TradeType", tradeType);
            this.tradeType = tradeType;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public QueryAdvancedDomainListRequest build() {
            return new QueryAdvancedDomainListRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
