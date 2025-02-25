// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrademarkSearchForInnerRequest} extends {@link RequestModel}
 *
 * <p>ListTrademarkSearchForInnerRequest</p>
 */
public class ListTrademarkSearchForInnerRequest extends Request {
    @Query
    @NameInMap("ApplyBeginTime")
    private String applyBeginTime;

    @Query
    @NameInMap("ApplyEndTime")
    private String applyEndTime;

    @Query
    @NameInMap("Classification")
    private String classification;

    @Query
    @NameInMap("IfPrecision")
    private Boolean ifPrecision;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Product")
    private String product;

    @Query
    @NameInMap("SearchPreference")
    private String searchPreference;

    @Query
    @NameInMap("SearchType")
    private String searchType;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Umid")
    private String umid;

    @Query
    @NameInMap("UserId")
    private String userId;

    private ListTrademarkSearchForInnerRequest(Builder builder) {
        super(builder);
        this.applyBeginTime = builder.applyBeginTime;
        this.applyEndTime = builder.applyEndTime;
        this.classification = builder.classification;
        this.ifPrecision = builder.ifPrecision;
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.product = builder.product;
        this.searchPreference = builder.searchPreference;
        this.searchType = builder.searchType;
        this.status = builder.status;
        this.umid = builder.umid;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrademarkSearchForInnerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyBeginTime
     */
    public String getApplyBeginTime() {
        return this.applyBeginTime;
    }

    /**
     * @return applyEndTime
     */
    public String getApplyEndTime() {
        return this.applyEndTime;
    }

    /**
     * @return classification
     */
    public String getClassification() {
        return this.classification;
    }

    /**
     * @return ifPrecision
     */
    public Boolean getIfPrecision() {
        return this.ifPrecision;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return searchPreference
     */
    public String getSearchPreference() {
        return this.searchPreference;
    }

    /**
     * @return searchType
     */
    public String getSearchType() {
        return this.searchType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return umid
     */
    public String getUmid() {
        return this.umid;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListTrademarkSearchForInnerRequest, Builder> {
        private String applyBeginTime; 
        private String applyEndTime; 
        private String classification; 
        private Boolean ifPrecision; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String product; 
        private String searchPreference; 
        private String searchType; 
        private String status; 
        private String umid; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListTrademarkSearchForInnerRequest request) {
            super(request);
            this.applyBeginTime = request.applyBeginTime;
            this.applyEndTime = request.applyEndTime;
            this.classification = request.classification;
            this.ifPrecision = request.ifPrecision;
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.product = request.product;
            this.searchPreference = request.searchPreference;
            this.searchType = request.searchType;
            this.status = request.status;
            this.umid = request.umid;
            this.userId = request.userId;
        } 

        /**
         * ApplyBeginTime.
         */
        public Builder applyBeginTime(String applyBeginTime) {
            this.putQueryParameter("ApplyBeginTime", applyBeginTime);
            this.applyBeginTime = applyBeginTime;
            return this;
        }

        /**
         * ApplyEndTime.
         */
        public Builder applyEndTime(String applyEndTime) {
            this.putQueryParameter("ApplyEndTime", applyEndTime);
            this.applyEndTime = applyEndTime;
            return this;
        }

        /**
         * Classification.
         */
        public Builder classification(String classification) {
            this.putQueryParameter("Classification", classification);
            this.classification = classification;
            return this;
        }

        /**
         * IfPrecision.
         */
        public Builder ifPrecision(Boolean ifPrecision) {
            this.putQueryParameter("IfPrecision", ifPrecision);
            this.ifPrecision = ifPrecision;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * Product.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * SearchPreference.
         */
        public Builder searchPreference(String searchPreference) {
            this.putQueryParameter("SearchPreference", searchPreference);
            this.searchPreference = searchPreference;
            return this;
        }

        /**
         * SearchType.
         */
        public Builder searchType(String searchType) {
            this.putQueryParameter("SearchType", searchType);
            this.searchType = searchType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Umid.
         */
        public Builder umid(String umid) {
            this.putQueryParameter("Umid", umid);
            this.umid = umid;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListTrademarkSearchForInnerRequest build() {
            return new ListTrademarkSearchForInnerRequest(this);
        } 

    } 

}
