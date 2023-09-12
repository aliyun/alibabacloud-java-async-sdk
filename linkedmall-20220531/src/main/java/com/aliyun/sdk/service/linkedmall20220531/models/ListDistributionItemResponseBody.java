// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDistributionItemResponseBody} extends {@link TeaModel}
 *
 * <p>ListDistributionItemResponseBody</p>
 */
public class ListDistributionItemResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LogsId")
    private String logsId;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private java.util.List < Model> model;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubCode")
    private String subCode;

    @NameInMap("SubMessage")
    private String subMessage;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListDistributionItemResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.model = builder.model;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDistributionItemResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public java.util.List < Model> getModel() {
        return this.model;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String logsId; 
        private String message; 
        private java.util.List < Model> model; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
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
         * Model.
         */
        public Builder model(java.util.List < Model> model) {
            this.model = model;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize
         */
        public Builder pageSize(Long pageSize) {
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
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDistributionItemResponseBody build() {
            return new ListDistributionItemResponseBody(this);
        } 

    } 

    public static class CategoryChain extends TeaModel {
        @NameInMap("CategoryId")
        private Long categoryId;

        @NameInMap("Leaf")
        private Boolean leaf;

        @NameInMap("Level")
        private Integer level;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParentId")
        private Long parentId;

        private CategoryChain(Builder builder) {
            this.categoryId = builder.categoryId;
            this.leaf = builder.leaf;
            this.level = builder.level;
            this.name = builder.name;
            this.parentId = builder.parentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CategoryChain create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return leaf
         */
        public Boolean getLeaf() {
            return this.leaf;
        }

        /**
         * @return level
         */
        public Integer getLevel() {
            return this.level;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        public static final class Builder {
            private Long categoryId; 
            private Boolean leaf; 
            private Integer level; 
            private String name; 
            private Long parentId; 

            /**
             * CategoryId.
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * Leaf.
             */
            public Builder leaf(Boolean leaf) {
                this.leaf = leaf;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(Integer level) {
                this.level = level;
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
             * ParentId.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            public CategoryChain build() {
                return new CategoryChain(this);
            } 

        } 

    }
    public static class LmAttributeModels extends TeaModel {
        @NameInMap("AttrId")
        private Long attrId;

        @NameInMap("Category")
        private Integer category;

        @NameInMap("DataType")
        private String dataType;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Restriction")
        private String restriction;

        @NameInMap("ScopeList")
        private java.util.List < String > scopeList;

        @NameInMap("Value")
        private String value;

        private LmAttributeModels(Builder builder) {
            this.attrId = builder.attrId;
            this.category = builder.category;
            this.dataType = builder.dataType;
            this.description = builder.description;
            this.name = builder.name;
            this.restriction = builder.restriction;
            this.scopeList = builder.scopeList;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmAttributeModels create() {
            return builder().build();
        }

        /**
         * @return attrId
         */
        public Long getAttrId() {
            return this.attrId;
        }

        /**
         * @return category
         */
        public Integer getCategory() {
            return this.category;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return restriction
         */
        public String getRestriction() {
            return this.restriction;
        }

        /**
         * @return scopeList
         */
        public java.util.List < String > getScopeList() {
            return this.scopeList;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long attrId; 
            private Integer category; 
            private String dataType; 
            private String description; 
            private String name; 
            private String restriction; 
            private java.util.List < String > scopeList; 
            private String value; 

            /**
             * AttrId.
             */
            public Builder attrId(Long attrId) {
                this.attrId = attrId;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(Integer category) {
                this.category = category;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * Restriction.
             */
            public Builder restriction(String restriction) {
                this.restriction = restriction;
                return this;
            }

            /**
             * ScopeList.
             */
            public Builder scopeList(java.util.List < String > scopeList) {
                this.scopeList = scopeList;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public LmAttributeModels build() {
                return new LmAttributeModels(this);
            } 

        } 

    }
    public static class SkuListLmAttributeModels extends TeaModel {
        @NameInMap("AttrId")
        private Long attrId;

        @NameInMap("Category")
        private Integer category;

        @NameInMap("DataType")
        private String dataType;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Restriction")
        private String restriction;

        @NameInMap("ScopeList")
        private java.util.List < String > scopeList;

        @NameInMap("Value")
        private String value;

        private SkuListLmAttributeModels(Builder builder) {
            this.attrId = builder.attrId;
            this.category = builder.category;
            this.dataType = builder.dataType;
            this.description = builder.description;
            this.name = builder.name;
            this.restriction = builder.restriction;
            this.scopeList = builder.scopeList;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkuListLmAttributeModels create() {
            return builder().build();
        }

        /**
         * @return attrId
         */
        public Long getAttrId() {
            return this.attrId;
        }

        /**
         * @return category
         */
        public Integer getCategory() {
            return this.category;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return restriction
         */
        public String getRestriction() {
            return this.restriction;
        }

        /**
         * @return scopeList
         */
        public java.util.List < String > getScopeList() {
            return this.scopeList;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long attrId; 
            private Integer category; 
            private String dataType; 
            private String description; 
            private String name; 
            private String restriction; 
            private java.util.List < String > scopeList; 
            private String value; 

            /**
             * AttrId.
             */
            public Builder attrId(Long attrId) {
                this.attrId = attrId;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(Integer category) {
                this.category = category;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * Restriction.
             */
            public Builder restriction(String restriction) {
                this.restriction = restriction;
                return this;
            }

            /**
             * ScopeList.
             */
            public Builder scopeList(java.util.List < String > scopeList) {
                this.scopeList = scopeList;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SkuListLmAttributeModels build() {
                return new SkuListLmAttributeModels(this);
            } 

        } 

    }
    public static class SkuList extends TeaModel {
        @NameInMap("CanSell")
        private Boolean canSell;

        @NameInMap("CustomizedAttributeMap")
        private java.util.Map < String, String > customizedAttributeMap;

        @NameInMap("ExtInfo")
        private String extInfo;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("HasQuantity")
        private Boolean hasQuantity;

        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("LmAttributeModels")
        private java.util.List < SkuListLmAttributeModels> lmAttributeModels;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("PriceCent")
        private Long priceCent;

        @NameInMap("Quantity")
        private Long quantity;

        @NameInMap("ReservedPrice")
        private Long reservedPrice;

        @NameInMap("SimpleQuantity")
        private String simpleQuantity;

        @NameInMap("SkuDesc")
        private String skuDesc;

        @NameInMap("SkuId")
        private Long skuId;

        @NameInMap("SkuPicUrl")
        private String skuPicUrl;

        @NameInMap("SkuProperties")
        private java.util.Map < String, String > skuProperties;

        @NameInMap("SkuPropertiesJson")
        private String skuPropertiesJson;

        @NameInMap("SkuTitle")
        private String skuTitle;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Tips")
        private String tips;

        @NameInMap("lmSkuAttributeMap")
        private java.util.Map < String, String > lmSkuAttributeMap;

        private SkuList(Builder builder) {
            this.canSell = builder.canSell;
            this.customizedAttributeMap = builder.customizedAttributeMap;
            this.extInfo = builder.extInfo;
            this.gmtModified = builder.gmtModified;
            this.hasQuantity = builder.hasQuantity;
            this.itemId = builder.itemId;
            this.lmAttributeModels = builder.lmAttributeModels;
            this.lmItemId = builder.lmItemId;
            this.priceCent = builder.priceCent;
            this.quantity = builder.quantity;
            this.reservedPrice = builder.reservedPrice;
            this.simpleQuantity = builder.simpleQuantity;
            this.skuDesc = builder.skuDesc;
            this.skuId = builder.skuId;
            this.skuPicUrl = builder.skuPicUrl;
            this.skuProperties = builder.skuProperties;
            this.skuPropertiesJson = builder.skuPropertiesJson;
            this.skuTitle = builder.skuTitle;
            this.status = builder.status;
            this.tips = builder.tips;
            this.lmSkuAttributeMap = builder.lmSkuAttributeMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkuList create() {
            return builder().build();
        }

        /**
         * @return canSell
         */
        public Boolean getCanSell() {
            return this.canSell;
        }

        /**
         * @return customizedAttributeMap
         */
        public java.util.Map < String, String > getCustomizedAttributeMap() {
            return this.customizedAttributeMap;
        }

        /**
         * @return extInfo
         */
        public String getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return hasQuantity
         */
        public Boolean getHasQuantity() {
            return this.hasQuantity;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return lmAttributeModels
         */
        public java.util.List < SkuListLmAttributeModels> getLmAttributeModels() {
            return this.lmAttributeModels;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return priceCent
         */
        public Long getPriceCent() {
            return this.priceCent;
        }

        /**
         * @return quantity
         */
        public Long getQuantity() {
            return this.quantity;
        }

        /**
         * @return reservedPrice
         */
        public Long getReservedPrice() {
            return this.reservedPrice;
        }

        /**
         * @return simpleQuantity
         */
        public String getSimpleQuantity() {
            return this.simpleQuantity;
        }

        /**
         * @return skuDesc
         */
        public String getSkuDesc() {
            return this.skuDesc;
        }

        /**
         * @return skuId
         */
        public Long getSkuId() {
            return this.skuId;
        }

        /**
         * @return skuPicUrl
         */
        public String getSkuPicUrl() {
            return this.skuPicUrl;
        }

        /**
         * @return skuProperties
         */
        public java.util.Map < String, String > getSkuProperties() {
            return this.skuProperties;
        }

        /**
         * @return skuPropertiesJson
         */
        public String getSkuPropertiesJson() {
            return this.skuPropertiesJson;
        }

        /**
         * @return skuTitle
         */
        public String getSkuTitle() {
            return this.skuTitle;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return tips
         */
        public String getTips() {
            return this.tips;
        }

        /**
         * @return lmSkuAttributeMap
         */
        public java.util.Map < String, String > getLmSkuAttributeMap() {
            return this.lmSkuAttributeMap;
        }

        public static final class Builder {
            private Boolean canSell; 
            private java.util.Map < String, String > customizedAttributeMap; 
            private String extInfo; 
            private String gmtModified; 
            private Boolean hasQuantity; 
            private Long itemId; 
            private java.util.List < SkuListLmAttributeModels> lmAttributeModels; 
            private String lmItemId; 
            private Long priceCent; 
            private Long quantity; 
            private Long reservedPrice; 
            private String simpleQuantity; 
            private String skuDesc; 
            private Long skuId; 
            private String skuPicUrl; 
            private java.util.Map < String, String > skuProperties; 
            private String skuPropertiesJson; 
            private String skuTitle; 
            private Integer status; 
            private String tips; 
            private java.util.Map < String, String > lmSkuAttributeMap; 

            /**
             * CanSell.
             */
            public Builder canSell(Boolean canSell) {
                this.canSell = canSell;
                return this;
            }

            /**
             * CustomizedAttributeMap.
             */
            public Builder customizedAttributeMap(java.util.Map < String, String > customizedAttributeMap) {
                this.customizedAttributeMap = customizedAttributeMap;
                return this;
            }

            /**
             * ExtInfo.
             */
            public Builder extInfo(String extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * HasQuantity.
             */
            public Builder hasQuantity(Boolean hasQuantity) {
                this.hasQuantity = hasQuantity;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * LmAttributeModels.
             */
            public Builder lmAttributeModels(java.util.List < SkuListLmAttributeModels> lmAttributeModels) {
                this.lmAttributeModels = lmAttributeModels;
                return this;
            }

            /**
             * LmItemId.
             */
            public Builder lmItemId(String lmItemId) {
                this.lmItemId = lmItemId;
                return this;
            }

            /**
             * PriceCent.
             */
            public Builder priceCent(Long priceCent) {
                this.priceCent = priceCent;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Long quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * ReservedPrice.
             */
            public Builder reservedPrice(Long reservedPrice) {
                this.reservedPrice = reservedPrice;
                return this;
            }

            /**
             * SimpleQuantity.
             */
            public Builder simpleQuantity(String simpleQuantity) {
                this.simpleQuantity = simpleQuantity;
                return this;
            }

            /**
             * SkuDesc.
             */
            public Builder skuDesc(String skuDesc) {
                this.skuDesc = skuDesc;
                return this;
            }

            /**
             * SkuId.
             */
            public Builder skuId(Long skuId) {
                this.skuId = skuId;
                return this;
            }

            /**
             * SkuPicUrl.
             */
            public Builder skuPicUrl(String skuPicUrl) {
                this.skuPicUrl = skuPicUrl;
                return this;
            }

            /**
             * SkuProperties.
             */
            public Builder skuProperties(java.util.Map < String, String > skuProperties) {
                this.skuProperties = skuProperties;
                return this;
            }

            /**
             * SkuPropertiesJson.
             */
            public Builder skuPropertiesJson(String skuPropertiesJson) {
                this.skuPropertiesJson = skuPropertiesJson;
                return this;
            }

            /**
             * SkuTitle.
             */
            public Builder skuTitle(String skuTitle) {
                this.skuTitle = skuTitle;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Tips.
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            /**
             * lmSkuAttributeMap.
             */
            public Builder lmSkuAttributeMap(java.util.Map < String, String > lmSkuAttributeMap) {
                this.lmSkuAttributeMap = lmSkuAttributeMap;
                return this;
            }

            public SkuList build() {
                return new SkuList(this);
            } 

        } 

    }
    public static class Model extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("CategoryChain")
        private java.util.List < CategoryChain> categoryChain;

        @NameInMap("CategoryId")
        private Long categoryId;

        @NameInMap("DescOption")
        private String descOption;

        @NameInMap("DistributionMallId")
        private String distributionMallId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("HasQuantity")
        private Boolean hasQuantity;

        @NameInMap("IsCanSell")
        private Boolean isCanSell;

        @NameInMap("ItemDesc")
        private String itemDesc;

        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("ItemIdStr")
        private String itemIdStr;

        @NameInMap("ItemImages")
        private java.util.List < String > itemImages;

        @NameInMap("ItemName")
        private String itemName;

        @NameInMap("ItemTitle")
        private String itemTitle;

        @NameInMap("LmAttributeMap")
        private java.util.Map < String, String > lmAttributeMap;

        @NameInMap("LmAttributeModels")
        private java.util.List < LmAttributeModels> lmAttributeModels;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("MainPicUrl")
        private String mainPicUrl;

        @NameInMap("PicUrl")
        private String picUrl;

        @NameInMap("PriceCentScope")
        private String priceCentScope;

        @NameInMap("PropertiesJson")
        private String propertiesJson;

        @NameInMap("Quantity")
        private Integer quantity;

        @NameInMap("ReservedPrice")
        private Long reservedPrice;

        @NameInMap("ReservedPriceScope")
        private String reservedPriceScope;

        @NameInMap("SimpleQuantity")
        private String simpleQuantity;

        @NameInMap("SimpleTotalSoldQuantity")
        private String simpleTotalSoldQuantity;

        @NameInMap("SkuList")
        private java.util.List < SkuList> skuList;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Tips")
        private String tips;

        @NameInMap("TotalSoldQuantity")
        private Integer totalSoldQuantity;

        private Model(Builder builder) {
            this.category = builder.category;
            this.categoryChain = builder.categoryChain;
            this.categoryId = builder.categoryId;
            this.descOption = builder.descOption;
            this.distributionMallId = builder.distributionMallId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.hasQuantity = builder.hasQuantity;
            this.isCanSell = builder.isCanSell;
            this.itemDesc = builder.itemDesc;
            this.itemId = builder.itemId;
            this.itemIdStr = builder.itemIdStr;
            this.itemImages = builder.itemImages;
            this.itemName = builder.itemName;
            this.itemTitle = builder.itemTitle;
            this.lmAttributeMap = builder.lmAttributeMap;
            this.lmAttributeModels = builder.lmAttributeModels;
            this.lmItemId = builder.lmItemId;
            this.mainPicUrl = builder.mainPicUrl;
            this.picUrl = builder.picUrl;
            this.priceCentScope = builder.priceCentScope;
            this.propertiesJson = builder.propertiesJson;
            this.quantity = builder.quantity;
            this.reservedPrice = builder.reservedPrice;
            this.reservedPriceScope = builder.reservedPriceScope;
            this.simpleQuantity = builder.simpleQuantity;
            this.simpleTotalSoldQuantity = builder.simpleTotalSoldQuantity;
            this.skuList = builder.skuList;
            this.status = builder.status;
            this.tips = builder.tips;
            this.totalSoldQuantity = builder.totalSoldQuantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return categoryChain
         */
        public java.util.List < CategoryChain> getCategoryChain() {
            return this.categoryChain;
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return descOption
         */
        public String getDescOption() {
            return this.descOption;
        }

        /**
         * @return distributionMallId
         */
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return hasQuantity
         */
        public Boolean getHasQuantity() {
            return this.hasQuantity;
        }

        /**
         * @return isCanSell
         */
        public Boolean getIsCanSell() {
            return this.isCanSell;
        }

        /**
         * @return itemDesc
         */
        public String getItemDesc() {
            return this.itemDesc;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return itemIdStr
         */
        public String getItemIdStr() {
            return this.itemIdStr;
        }

        /**
         * @return itemImages
         */
        public java.util.List < String > getItemImages() {
            return this.itemImages;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return itemTitle
         */
        public String getItemTitle() {
            return this.itemTitle;
        }

        /**
         * @return lmAttributeMap
         */
        public java.util.Map < String, String > getLmAttributeMap() {
            return this.lmAttributeMap;
        }

        /**
         * @return lmAttributeModels
         */
        public java.util.List < LmAttributeModels> getLmAttributeModels() {
            return this.lmAttributeModels;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return mainPicUrl
         */
        public String getMainPicUrl() {
            return this.mainPicUrl;
        }

        /**
         * @return picUrl
         */
        public String getPicUrl() {
            return this.picUrl;
        }

        /**
         * @return priceCentScope
         */
        public String getPriceCentScope() {
            return this.priceCentScope;
        }

        /**
         * @return propertiesJson
         */
        public String getPropertiesJson() {
            return this.propertiesJson;
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        /**
         * @return reservedPrice
         */
        public Long getReservedPrice() {
            return this.reservedPrice;
        }

        /**
         * @return reservedPriceScope
         */
        public String getReservedPriceScope() {
            return this.reservedPriceScope;
        }

        /**
         * @return simpleQuantity
         */
        public String getSimpleQuantity() {
            return this.simpleQuantity;
        }

        /**
         * @return simpleTotalSoldQuantity
         */
        public String getSimpleTotalSoldQuantity() {
            return this.simpleTotalSoldQuantity;
        }

        /**
         * @return skuList
         */
        public java.util.List < SkuList> getSkuList() {
            return this.skuList;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return tips
         */
        public String getTips() {
            return this.tips;
        }

        /**
         * @return totalSoldQuantity
         */
        public Integer getTotalSoldQuantity() {
            return this.totalSoldQuantity;
        }

        public static final class Builder {
            private String category; 
            private java.util.List < CategoryChain> categoryChain; 
            private Long categoryId; 
            private String descOption; 
            private String distributionMallId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Boolean hasQuantity; 
            private Boolean isCanSell; 
            private String itemDesc; 
            private Long itemId; 
            private String itemIdStr; 
            private java.util.List < String > itemImages; 
            private String itemName; 
            private String itemTitle; 
            private java.util.Map < String, String > lmAttributeMap; 
            private java.util.List < LmAttributeModels> lmAttributeModels; 
            private String lmItemId; 
            private String mainPicUrl; 
            private String picUrl; 
            private String priceCentScope; 
            private String propertiesJson; 
            private Integer quantity; 
            private Long reservedPrice; 
            private String reservedPriceScope; 
            private String simpleQuantity; 
            private String simpleTotalSoldQuantity; 
            private java.util.List < SkuList> skuList; 
            private Integer status; 
            private String tips; 
            private Integer totalSoldQuantity; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CategoryChain.
             */
            public Builder categoryChain(java.util.List < CategoryChain> categoryChain) {
                this.categoryChain = categoryChain;
                return this;
            }

            /**
             * CategoryId.
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * DescOption.
             */
            public Builder descOption(String descOption) {
                this.descOption = descOption;
                return this;
            }

            /**
             * DistributionMallId.
             */
            public Builder distributionMallId(String distributionMallId) {
                this.distributionMallId = distributionMallId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * HasQuantity.
             */
            public Builder hasQuantity(Boolean hasQuantity) {
                this.hasQuantity = hasQuantity;
                return this;
            }

            /**
             * IsCanSell.
             */
            public Builder isCanSell(Boolean isCanSell) {
                this.isCanSell = isCanSell;
                return this;
            }

            /**
             * ItemDesc.
             */
            public Builder itemDesc(String itemDesc) {
                this.itemDesc = itemDesc;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemIdStr.
             */
            public Builder itemIdStr(String itemIdStr) {
                this.itemIdStr = itemIdStr;
                return this;
            }

            /**
             * ItemImages.
             */
            public Builder itemImages(java.util.List < String > itemImages) {
                this.itemImages = itemImages;
                return this;
            }

            /**
             * ItemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * ItemTitle.
             */
            public Builder itemTitle(String itemTitle) {
                this.itemTitle = itemTitle;
                return this;
            }

            /**
             * LmAttributeMap.
             */
            public Builder lmAttributeMap(java.util.Map < String, String > lmAttributeMap) {
                this.lmAttributeMap = lmAttributeMap;
                return this;
            }

            /**
             * LmAttributeModels.
             */
            public Builder lmAttributeModels(java.util.List < LmAttributeModels> lmAttributeModels) {
                this.lmAttributeModels = lmAttributeModels;
                return this;
            }

            /**
             * LmItemId.
             */
            public Builder lmItemId(String lmItemId) {
                this.lmItemId = lmItemId;
                return this;
            }

            /**
             * MainPicUrl.
             */
            public Builder mainPicUrl(String mainPicUrl) {
                this.mainPicUrl = mainPicUrl;
                return this;
            }

            /**
             * PicUrl.
             */
            public Builder picUrl(String picUrl) {
                this.picUrl = picUrl;
                return this;
            }

            /**
             * PriceCentScope.
             */
            public Builder priceCentScope(String priceCentScope) {
                this.priceCentScope = priceCentScope;
                return this;
            }

            /**
             * PropertiesJson.
             */
            public Builder propertiesJson(String propertiesJson) {
                this.propertiesJson = propertiesJson;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * ReservedPrice.
             */
            public Builder reservedPrice(Long reservedPrice) {
                this.reservedPrice = reservedPrice;
                return this;
            }

            /**
             * ReservedPriceScope.
             */
            public Builder reservedPriceScope(String reservedPriceScope) {
                this.reservedPriceScope = reservedPriceScope;
                return this;
            }

            /**
             * SimpleQuantity.
             */
            public Builder simpleQuantity(String simpleQuantity) {
                this.simpleQuantity = simpleQuantity;
                return this;
            }

            /**
             * SimpleTotalSoldQuantity.
             */
            public Builder simpleTotalSoldQuantity(String simpleTotalSoldQuantity) {
                this.simpleTotalSoldQuantity = simpleTotalSoldQuantity;
                return this;
            }

            /**
             * SkuList.
             */
            public Builder skuList(java.util.List < SkuList> skuList) {
                this.skuList = skuList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Tips.
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            /**
             * TotalSoldQuantity.
             */
            public Builder totalSoldQuantity(Integer totalSoldQuantity) {
                this.totalSoldQuantity = totalSoldQuantity;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
