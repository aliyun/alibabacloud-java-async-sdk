// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

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
 * {@link SafeScopeDataRequest} extends {@link RequestModel}
 *
 * <p>SafeScopeDataRequest</p>
 */
public class SafeScopeDataRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthSign")
    private String authSign;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeList")
    private String codeList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Factor")
    private String factor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupBy")
    private String groupBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdList")
    private String idList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Item")
    private String item;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NeedTotalCount")
    private Boolean needTotalCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderDirection")
    private String orderDirection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParentCode")
    private String parentCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParentId")
    private Long parentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private Long productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionNameEn")
    private String regionNameEn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReqTimestamp")
    private Long reqTimestamp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchValue")
    private String searchValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

    private SafeScopeDataRequest(Builder builder) {
        super(builder);
        this.authKey = builder.authKey;
        this.authSign = builder.authSign;
        this.category = builder.category;
        this.codeList = builder.codeList;
        this.factor = builder.factor;
        this.groupBy = builder.groupBy;
        this.idList = builder.idList;
        this.item = builder.item;
        this.limit = builder.limit;
        this.needTotalCount = builder.needTotalCount;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
        this.page = builder.page;
        this.parentCode = builder.parentCode;
        this.parentId = builder.parentId;
        this.productCode = builder.productCode;
        this.productId = builder.productId;
        this.regionNameEn = builder.regionNameEn;
        this.reqTimestamp = builder.reqTimestamp;
        this.searchValue = builder.searchValue;
        this.type = builder.type;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SafeScopeDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return authSign
     */
    public String getAuthSign() {
        return this.authSign;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return codeList
     */
    public String getCodeList() {
        return this.codeList;
    }

    /**
     * @return factor
     */
    public String getFactor() {
        return this.factor;
    }

    /**
     * @return groupBy
     */
    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return idList
     */
    public String getIdList() {
        return this.idList;
    }

    /**
     * @return item
     */
    public String getItem() {
        return this.item;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return needTotalCount
     */
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return parentCode
     */
    public String getParentCode() {
        return this.parentCode;
    }

    /**
     * @return parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return regionNameEn
     */
    public String getRegionNameEn() {
        return this.regionNameEn;
    }

    /**
     * @return reqTimestamp
     */
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    /**
     * @return searchValue
     */
    public String getSearchValue() {
        return this.searchValue;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<SafeScopeDataRequest, Builder> {
        private String authKey; 
        private String authSign; 
        private String category; 
        private String codeList; 
        private String factor; 
        private String groupBy; 
        private String idList; 
        private String item; 
        private Integer limit; 
        private Boolean needTotalCount; 
        private String orderBy; 
        private String orderDirection; 
        private Integer page; 
        private String parentCode; 
        private Long parentId; 
        private String productCode; 
        private Long productId; 
        private String regionNameEn; 
        private Long reqTimestamp; 
        private String searchValue; 
        private Integer type; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(SafeScopeDataRequest request) {
            super(request);
            this.authKey = request.authKey;
            this.authSign = request.authSign;
            this.category = request.category;
            this.codeList = request.codeList;
            this.factor = request.factor;
            this.groupBy = request.groupBy;
            this.idList = request.idList;
            this.item = request.item;
            this.limit = request.limit;
            this.needTotalCount = request.needTotalCount;
            this.orderBy = request.orderBy;
            this.orderDirection = request.orderDirection;
            this.page = request.page;
            this.parentCode = request.parentCode;
            this.parentId = request.parentId;
            this.productCode = request.productCode;
            this.productId = request.productId;
            this.regionNameEn = request.regionNameEn;
            this.reqTimestamp = request.reqTimestamp;
            this.searchValue = request.searchValue;
            this.type = request.type;
            this.uid = request.uid;
        } 

        /**
         * AuthKey.
         */
        public Builder authKey(String authKey) {
            this.putBodyParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * AuthSign.
         */
        public Builder authSign(String authSign) {
            this.putBodyParameter("AuthSign", authSign);
            this.authSign = authSign;
            return this;
        }

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putBodyParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * CodeList.
         */
        public Builder codeList(String codeList) {
            this.putBodyParameter("CodeList", codeList);
            this.codeList = codeList;
            return this;
        }

        /**
         * Factor.
         */
        public Builder factor(String factor) {
            this.putBodyParameter("Factor", factor);
            this.factor = factor;
            return this;
        }

        /**
         * GroupBy.
         */
        public Builder groupBy(String groupBy) {
            this.putBodyParameter("GroupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * IdList.
         */
        public Builder idList(String idList) {
            this.putBodyParameter("IdList", idList);
            this.idList = idList;
            return this;
        }

        /**
         * Item.
         */
        public Builder item(String item) {
            this.putBodyParameter("Item", item);
            this.item = item;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * NeedTotalCount.
         */
        public Builder needTotalCount(Boolean needTotalCount) {
            this.putBodyParameter("NeedTotalCount", needTotalCount);
            this.needTotalCount = needTotalCount;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * OrderDirection.
         */
        public Builder orderDirection(String orderDirection) {
            this.putBodyParameter("OrderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putBodyParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * ParentCode.
         */
        public Builder parentCode(String parentCode) {
            this.putBodyParameter("ParentCode", parentCode);
            this.parentCode = parentCode;
            return this;
        }

        /**
         * ParentId.
         */
        public Builder parentId(Long parentId) {
            this.putBodyParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(Long productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * RegionNameEn.
         */
        public Builder regionNameEn(String regionNameEn) {
            this.putBodyParameter("RegionNameEn", regionNameEn);
            this.regionNameEn = regionNameEn;
            return this;
        }

        /**
         * ReqTimestamp.
         */
        public Builder reqTimestamp(Long reqTimestamp) {
            this.putBodyParameter("ReqTimestamp", reqTimestamp);
            this.reqTimestamp = reqTimestamp;
            return this;
        }

        /**
         * SearchValue.
         */
        public Builder searchValue(String searchValue) {
            this.putBodyParameter("SearchValue", searchValue);
            this.searchValue = searchValue;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.putBodyParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public SafeScopeDataRequest build() {
            return new SafeScopeDataRequest(this);
        } 

    } 

}
