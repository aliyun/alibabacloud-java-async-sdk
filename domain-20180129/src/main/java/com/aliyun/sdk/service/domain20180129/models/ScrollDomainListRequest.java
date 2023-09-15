// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScrollDomainListRequest} extends {@link RequestModel}
 *
 * <p>ScrollDomainListRequest</p>
 */
public class ScrollDomainListRequest extends Request {
    @Query
    @NameInMap("DomainGroupId")
    private Long domainGroupId;

    @Query
    @NameInMap("DomainStatus")
    private Integer domainStatus;

    @Query
    @NameInMap("EndExpirationDate")
    private Long endExpirationDate;

    @Query
    @NameInMap("EndLength")
    private Integer endLength;

    @Query
    @NameInMap("EndRegistrationDate")
    private Long endRegistrationDate;

    @Query
    @NameInMap("Excluded")
    private String excluded;

    @Query
    @NameInMap("ExcludedPrefix")
    private Boolean excludedPrefix;

    @Query
    @NameInMap("ExcludedSuffix")
    private Boolean excludedSuffix;

    @Query
    @NameInMap("Form")
    private Integer form;

    @Query
    @NameInMap("KeyWord")
    private String keyWord;

    @Query
    @NameInMap("KeyWordPrefix")
    private Boolean keyWordPrefix;

    @Query
    @NameInMap("KeyWordSuffix")
    private Boolean keyWordSuffix;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 500, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ProductDomainType")
    private String productDomainType;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ScrollId")
    private String scrollId;

    @Query
    @NameInMap("StartExpirationDate")
    private Long startExpirationDate;

    @Query
    @NameInMap("StartLength")
    private Integer startLength;

    @Query
    @NameInMap("StartRegistrationDate")
    private Long startRegistrationDate;

    @Query
    @NameInMap("Suffixs")
    private String suffixs;

    @Query
    @NameInMap("TradeType")
    private Integer tradeType;

    @Query
    @NameInMap("UserClientIp")
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
         * DomainGroupId.
         */
        public Builder domainGroupId(Long domainGroupId) {
            this.putQueryParameter("DomainGroupId", domainGroupId);
            this.domainGroupId = domainGroupId;
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
         * Form.
         */
        public Builder form(Integer form) {
            this.putQueryParameter("Form", form);
            this.form = form;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ScrollId.
         */
        public Builder scrollId(String scrollId) {
            this.putQueryParameter("ScrollId", scrollId);
            this.scrollId = scrollId;
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
        public ScrollDomainListRequest build() {
            return new ScrollDomainListRequest(this);
        } 

    } 

}
