// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScrollDomainListRequest} extends {@link RequestModel}
 *
 * <p>ScrollDomainListRequest</p>
 */
public class ScrollDomainListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainGroupId")
    private Long domainGroupId;

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
    @com.aliyun.core.annotation.NameInMap("Form")
    private Integer form;

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
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductDomainType")
    private String productDomainType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScrollId")
    private String scrollId;

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
    @com.aliyun.core.annotation.NameInMap("TradeType")
    private Integer tradeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private ScrollDomainListRequest(Builder builder) {
        super(builder);
        this.domainGroupId = builder.domainGroupId;
        this.domainStatus = builder.domainStatus;
        this.endExpirationDate = builder.endExpirationDate;
        this.endLength = builder.endLength;
        this.endRegistrationDate = builder.endRegistrationDate;
        this.excluded = builder.excluded;
        this.excludedPrefix = builder.excludedPrefix;
        this.excludedSuffix = builder.excludedSuffix;
        this.form = builder.form;
        this.keyWord = builder.keyWord;
        this.keyWordPrefix = builder.keyWordPrefix;
        this.keyWordSuffix = builder.keyWordSuffix;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.productDomainType = builder.productDomainType;
        this.resourceGroupId = builder.resourceGroupId;
        this.scrollId = builder.scrollId;
        this.startExpirationDate = builder.startExpirationDate;
        this.startLength = builder.startLength;
        this.startRegistrationDate = builder.startRegistrationDate;
        this.suffixs = builder.suffixs;
        this.tradeType = builder.tradeType;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScrollDomainListRequest create() {
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
     * @return form
     */
    public Integer getForm() {
        return this.form;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return scrollId
     */
    public String getScrollId() {
        return this.scrollId;
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

    public static final class Builder extends Request.Builder<ScrollDomainListRequest, Builder> {
        private Long domainGroupId; 
        private Integer domainStatus; 
        private Long endExpirationDate; 
        private Integer endLength; 
        private Long endRegistrationDate; 
        private String excluded; 
        private Boolean excludedPrefix; 
        private Boolean excludedSuffix; 
        private Integer form; 
        private String keyWord; 
        private Boolean keyWordPrefix; 
        private Boolean keyWordSuffix; 
        private String lang; 
        private Integer pageSize; 
        private String productDomainType; 
        private String resourceGroupId; 
        private String scrollId; 
        private Long startExpirationDate; 
        private Integer startLength; 
        private Long startRegistrationDate; 
        private String suffixs; 
        private Integer tradeType; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(ScrollDomainListRequest request) {
            super(request);
            this.domainGroupId = request.domainGroupId;
            this.domainStatus = request.domainStatus;
            this.endExpirationDate = request.endExpirationDate;
            this.endLength = request.endLength;
            this.endRegistrationDate = request.endRegistrationDate;
            this.excluded = request.excluded;
            this.excludedPrefix = request.excludedPrefix;
            this.excludedSuffix = request.excludedSuffix;
            this.form = request.form;
            this.keyWord = request.keyWord;
            this.keyWordPrefix = request.keyWordPrefix;
            this.keyWordSuffix = request.keyWordSuffix;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.productDomainType = request.productDomainType;
            this.resourceGroupId = request.resourceGroupId;
            this.scrollId = request.scrollId;
            this.startExpirationDate = request.startExpirationDate;
            this.startLength = request.startLength;
            this.startRegistrationDate = request.startRegistrationDate;
            this.suffixs = request.suffixs;
            this.tradeType = request.tradeType;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * The ID of the domain name group. You can call the [QueryDomainGroupList](https://help.aliyun.com/document_detail/69362.html) operation to obtain the ID of the domain name group.
         */
        public Builder domainGroupId(Long domainGroupId) {
            this.putQueryParameter("DomainGroupId", domainGroupId);
            this.domainGroupId = domainGroupId;
            return this;
        }

        /**
         * The status of the domain name. Valid values:
         * <p>
         * 
         * *   **0**: All.
         * *   **1**: The domain name needs to be renewed.
         * *   **2**: The domain name needs to be redeemed.
         * *   **3**: The domain name is normal.
         * *   **4**: The domain name is being transferred from Alibaba Cloud.
         * *   **5**: The information about the domain name registrant is being modified.
         * *   **6**: Real-name verification is not performed on the domain name.
         * *   **7**: Real-name verification for the domain name fails. Real-name reverification is required.
         * *   **8**: The domain name is being reviewed.
         */
        public Builder domainStatus(Integer domainStatus) {
            this.putQueryParameter("DomainStatus", domainStatus);
            this.domainStatus = domainStatus;
            return this;
        }

        /**
         * The end of the time range to query domain names based on expiration dates. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder endExpirationDate(Long endExpirationDate) {
            this.putQueryParameter("EndExpirationDate", endExpirationDate);
            this.endExpirationDate = endExpirationDate;
            return this;
        }

        /**
         * The end of domain name length to query.
         */
        public Builder endLength(Integer endLength) {
            this.putQueryParameter("EndLength", endLength);
            this.endLength = endLength;
            return this;
        }

        /**
         * The end of the time range to query domain names based on registration dates. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder endRegistrationDate(Long endRegistrationDate) {
            this.putQueryParameter("EndRegistrationDate", endRegistrationDate);
            this.endRegistrationDate = endRegistrationDate;
            return this;
        }

        /**
         * The keyword that is used to exclude domain names.
         */
        public Builder excluded(String excluded) {
            this.putQueryParameter("Excluded", excluded);
            this.excluded = excluded;
            return this;
        }

        /**
         * Specifies whether to exclude the prefix keyword.
         */
        public Builder excludedPrefix(Boolean excludedPrefix) {
            this.putQueryParameter("ExcludedPrefix", excludedPrefix);
            this.excludedPrefix = excludedPrefix;
            return this;
        }

        /**
         * Specifies whether to exclude the suffix keyword.
         */
        public Builder excludedSuffix(Boolean excludedSuffix) {
            this.putQueryParameter("ExcludedSuffix", excludedSuffix);
            this.excludedSuffix = excludedSuffix;
            return this;
        }

        /**
         * The composition of the domain name.
         */
        public Builder form(Integer form) {
            this.putQueryParameter("Form", form);
            this.form = form;
            return this;
        }

        /**
         * The keyword.
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
            return this;
        }

        /**
         * Specifies whether the keyword is the prefix.
         */
        public Builder keyWordPrefix(Boolean keyWordPrefix) {
            this.putQueryParameter("KeyWordPrefix", keyWordPrefix);
            this.keyWordPrefix = keyWordPrefix;
            return this;
        }

        /**
         * Specifies whether the keyword is the suffix.
         */
        public Builder keyWordSuffix(Boolean keyWordSuffix) {
            this.putQueryParameter("KeyWordSuffix", keyWordSuffix);
            this.keyWordSuffix = keyWordSuffix;
            return this;
        }

        /**
         * The language of the error message to return if the request fails. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese.
         * *   **en**: English.
         * 
         * Default value: **en**.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The type of the domain name. Valid values:
         * <p>
         * 
         * *   **New gTLD**
         * *   **gTLD**
         * *   **ccTLD**
         * *   **other**
         */
        public Builder productDomainType(String productDomainType) {
            this.putQueryParameter("ProductDomainType", productDomainType);
            this.productDomainType = productDomainType;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The scroll ID. This parameter is a technical parameter.
         */
        public Builder scrollId(String scrollId) {
            this.putQueryParameter("ScrollId", scrollId);
            this.scrollId = scrollId;
            return this;
        }

        /**
         * The beginning of the time range to query domain names based on expiration dates. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder startExpirationDate(Long startExpirationDate) {
            this.putQueryParameter("StartExpirationDate", startExpirationDate);
            this.startExpirationDate = startExpirationDate;
            return this;
        }

        /**
         * The start of the domain name length to query.
         */
        public Builder startLength(Integer startLength) {
            this.putQueryParameter("StartLength", startLength);
            this.startLength = startLength;
            return this;
        }

        /**
         * The beginning of the time range to query domain names based on registration dates. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder startRegistrationDate(Long startRegistrationDate) {
            this.putQueryParameter("StartRegistrationDate", startRegistrationDate);
            this.startRegistrationDate = startRegistrationDate;
            return this;
        }

        /**
         * The suffixes of domain names to be queried. Separate multiple suffixes with commas (,).
         */
        public Builder suffixs(String suffixs) {
            this.putQueryParameter("Suffixs", suffixs);
            this.suffixs = suffixs;
            return this;
        }

        /**
         * The publishing status of the domain name. Valid values:
         * <p>
         * 
         * *   **2**: The domain name is published at a fixed price.
         * *   **3**: The domain name is published with the price negotiable.
         * *   **4**: The domain name is published for bidding.
         * *   **6**: The domain name is published with price push.
         * *   **-1**: The domain name is not published.
         */
        public Builder tradeType(Integer tradeType) {
            this.putQueryParameter("TradeType", tradeType);
            this.tradeType = tradeType;
            return this;
        }

        /**
         * The IP address of the client. Set the value to **127.0.0.1**.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public ScrollDomainListRequest build() {
            return new ScrollDomainListRequest(this);
        } 

    } 

}
