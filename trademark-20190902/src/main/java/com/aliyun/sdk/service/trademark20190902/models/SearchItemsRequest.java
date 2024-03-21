// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchItemsRequest} extends {@link RequestModel}
 *
 * <p>SearchItemsRequest</p>
 */
public class SearchItemsRequest extends Request {
    @Query
    @NameInMap("ExcludedTags")
    private String excludedTags;

    @Query
    @NameInMap("ExcludedUids")
    private String excludedUids;

    @Query
    @NameInMap("FeedsType")
    private Boolean feedsType;

    @Query
    @NameInMap("IntCls")
    private String intCls;

    @Query
    @NameInMap("Keywords")
    private String keywords;

    @Query
    @NameInMap("Mock")
    private Boolean mock;

    @Query
    @NameInMap("PageIndex")
    private Integer pageIndex;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 50, minimum = 2)
    private Integer pageSize;

    @Query
    @NameInMap("PriceLeft")
    private String priceLeft;

    @Query
    @NameInMap("PriceRight")
    private String priceRight;

    @Query
    @NameInMap("Products")
    private String products;

    @Query
    @NameInMap("RegisterNumber")
    private String registerNumber;

    @Query
    @NameInMap("Sort")
    private String sort;

    @Query
    @NameInMap("SortType")
    private Integer sortType;

    @Query
    @NameInMap("Tags")
    private String tags;

    @Query
    @NameInMap("TrademarkNameLength")
    private Integer trademarkNameLength;

    @Query
    @NameInMap("TrademarkNameType")
    private String trademarkNameType;

    @Query
    @NameInMap("UmId")
    private String umId;

    private SearchItemsRequest(Builder builder) {
        super(builder);
        this.excludedTags = builder.excludedTags;
        this.excludedUids = builder.excludedUids;
        this.feedsType = builder.feedsType;
        this.intCls = builder.intCls;
        this.keywords = builder.keywords;
        this.mock = builder.mock;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.priceLeft = builder.priceLeft;
        this.priceRight = builder.priceRight;
        this.products = builder.products;
        this.registerNumber = builder.registerNumber;
        this.sort = builder.sort;
        this.sortType = builder.sortType;
        this.tags = builder.tags;
        this.trademarkNameLength = builder.trademarkNameLength;
        this.trademarkNameType = builder.trademarkNameType;
        this.umId = builder.umId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return excludedTags
     */
    public String getExcludedTags() {
        return this.excludedTags;
    }

    /**
     * @return excludedUids
     */
    public String getExcludedUids() {
        return this.excludedUids;
    }

    /**
     * @return feedsType
     */
    public Boolean getFeedsType() {
        return this.feedsType;
    }

    /**
     * @return intCls
     */
    public String getIntCls() {
        return this.intCls;
    }

    /**
     * @return keywords
     */
    public String getKeywords() {
        return this.keywords;
    }

    /**
     * @return mock
     */
    public Boolean getMock() {
        return this.mock;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return priceLeft
     */
    public String getPriceLeft() {
        return this.priceLeft;
    }

    /**
     * @return priceRight
     */
    public String getPriceRight() {
        return this.priceRight;
    }

    /**
     * @return products
     */
    public String getProducts() {
        return this.products;
    }

    /**
     * @return registerNumber
     */
    public String getRegisterNumber() {
        return this.registerNumber;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return sortType
     */
    public Integer getSortType() {
        return this.sortType;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return trademarkNameLength
     */
    public Integer getTrademarkNameLength() {
        return this.trademarkNameLength;
    }

    /**
     * @return trademarkNameType
     */
    public String getTrademarkNameType() {
        return this.trademarkNameType;
    }

    /**
     * @return umId
     */
    public String getUmId() {
        return this.umId;
    }

    public static final class Builder extends Request.Builder<SearchItemsRequest, Builder> {
        private String excludedTags; 
        private String excludedUids; 
        private Boolean feedsType; 
        private String intCls; 
        private String keywords; 
        private Boolean mock; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String priceLeft; 
        private String priceRight; 
        private String products; 
        private String registerNumber; 
        private String sort; 
        private Integer sortType; 
        private String tags; 
        private Integer trademarkNameLength; 
        private String trademarkNameType; 
        private String umId; 

        private Builder() {
            super();
        } 

        private Builder(SearchItemsRequest request) {
            super(request);
            this.excludedTags = request.excludedTags;
            this.excludedUids = request.excludedUids;
            this.feedsType = request.feedsType;
            this.intCls = request.intCls;
            this.keywords = request.keywords;
            this.mock = request.mock;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.priceLeft = request.priceLeft;
            this.priceRight = request.priceRight;
            this.products = request.products;
            this.registerNumber = request.registerNumber;
            this.sort = request.sort;
            this.sortType = request.sortType;
            this.tags = request.tags;
            this.trademarkNameLength = request.trademarkNameLength;
            this.trademarkNameType = request.trademarkNameType;
            this.umId = request.umId;
        } 

        /**
         * ExcludedTags.
         */
        public Builder excludedTags(String excludedTags) {
            this.putQueryParameter("ExcludedTags", excludedTags);
            this.excludedTags = excludedTags;
            return this;
        }

        /**
         * ExcludedUids.
         */
        public Builder excludedUids(String excludedUids) {
            this.putQueryParameter("ExcludedUids", excludedUids);
            this.excludedUids = excludedUids;
            return this;
        }

        /**
         * FeedsType.
         */
        public Builder feedsType(Boolean feedsType) {
            this.putQueryParameter("FeedsType", feedsType);
            this.feedsType = feedsType;
            return this;
        }

        /**
         * IntCls.
         */
        public Builder intCls(String intCls) {
            this.putQueryParameter("IntCls", intCls);
            this.intCls = intCls;
            return this;
        }

        /**
         * Keywords.
         */
        public Builder keywords(String keywords) {
            this.putQueryParameter("Keywords", keywords);
            this.keywords = keywords;
            return this;
        }

        /**
         * Mock.
         */
        public Builder mock(Boolean mock) {
            this.putQueryParameter("Mock", mock);
            this.mock = mock;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
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
         * PriceLeft.
         */
        public Builder priceLeft(String priceLeft) {
            this.putQueryParameter("PriceLeft", priceLeft);
            this.priceLeft = priceLeft;
            return this;
        }

        /**
         * PriceRight.
         */
        public Builder priceRight(String priceRight) {
            this.putQueryParameter("PriceRight", priceRight);
            this.priceRight = priceRight;
            return this;
        }

        /**
         * Products.
         */
        public Builder products(String products) {
            this.putQueryParameter("Products", products);
            this.products = products;
            return this;
        }

        /**
         * RegisterNumber.
         */
        public Builder registerNumber(String registerNumber) {
            this.putQueryParameter("RegisterNumber", registerNumber);
            this.registerNumber = registerNumber;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * SortType.
         */
        public Builder sortType(Integer sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * TrademarkNameLength.
         */
        public Builder trademarkNameLength(Integer trademarkNameLength) {
            this.putQueryParameter("TrademarkNameLength", trademarkNameLength);
            this.trademarkNameLength = trademarkNameLength;
            return this;
        }

        /**
         * TrademarkNameType.
         */
        public Builder trademarkNameType(String trademarkNameType) {
            this.putQueryParameter("TrademarkNameType", trademarkNameType);
            this.trademarkNameType = trademarkNameType;
            return this;
        }

        /**
         * UmId.
         */
        public Builder umId(String umId) {
            this.putQueryParameter("UmId", umId);
            this.umId = umId;
            return this;
        }

        @Override
        public SearchItemsRequest build() {
            return new SearchItemsRequest(this);
        } 

    } 

}
