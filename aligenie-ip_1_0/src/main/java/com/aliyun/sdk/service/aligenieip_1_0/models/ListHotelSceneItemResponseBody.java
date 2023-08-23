// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotelSceneItemResponseBody} extends {@link TeaModel}
 *
 * <p>ListHotelSceneItemResponseBody</p>
 */
public class ListHotelSceneItemResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("Page")
    private Page page;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListHotelSceneItemResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.page = builder.page;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotelSceneItemResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private Page page; 
        private String requestId; 
        private Result result; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
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
         * Page.
         */
        public Builder page(Page page) {
            this.page = page;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListHotelSceneItemResponseBody build() {
            return new ListHotelSceneItemResponseBody(this);
        } 

    } 

    public static class Page extends TeaModel {
        @NameInMap("HasNext")
        private Boolean hasNext;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        @NameInMap("TotalPage")
        private Integer totalPage;

        private Page(Builder builder) {
            this.hasNext = builder.hasNext;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
        }

        /**
         * @return hasNext
         */
        public Boolean getHasNext() {
            return this.hasNext;
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
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private Boolean hasNext; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer total; 
            private Integer totalPage; 

            /**
             * HasNext.
             */
            public Builder hasNext(Boolean hasNext) {
                this.hasNext = hasNext;
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
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
    public static class ItemList extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Icon")
        private String icon;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Price")
        private Long price;

        @NameInMap("ResidueLimit")
        private Long residueLimit;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private ItemList(Builder builder) {
            this.category = builder.category;
            this.icon = builder.icon;
            this.id = builder.id;
            this.name = builder.name;
            this.price = builder.price;
            this.residueLimit = builder.residueLimit;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemList create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return residueLimit
         */
        public Long getResidueLimit() {
            return this.residueLimit;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String category; 
            private String icon; 
            private String id; 
            private String name; 
            private Long price; 
            private Long residueLimit; 
            private String status; 
            private String type; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * Price.
             */
            public Builder price(Long price) {
                this.price = price;
                return this;
            }

            /**
             * ResidueLimit.
             */
            public Builder residueLimit(Long residueLimit) {
                this.residueLimit = residueLimit;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ItemList build() {
                return new ItemList(this);
            } 

        } 

    }
    public static class SecondCategoryList extends TeaModel {
        @NameInMap("ItemList")
        private java.util.List < ItemList> itemList;

        @NameInMap("SecondCategoryName")
        private String secondCategoryName;

        private SecondCategoryList(Builder builder) {
            this.itemList = builder.itemList;
            this.secondCategoryName = builder.secondCategoryName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecondCategoryList create() {
            return builder().build();
        }

        /**
         * @return itemList
         */
        public java.util.List < ItemList> getItemList() {
            return this.itemList;
        }

        /**
         * @return secondCategoryName
         */
        public String getSecondCategoryName() {
            return this.secondCategoryName;
        }

        public static final class Builder {
            private java.util.List < ItemList> itemList; 
            private String secondCategoryName; 

            /**
             * ItemList.
             */
            public Builder itemList(java.util.List < ItemList> itemList) {
                this.itemList = itemList;
                return this;
            }

            /**
             * SecondCategoryName.
             */
            public Builder secondCategoryName(String secondCategoryName) {
                this.secondCategoryName = secondCategoryName;
                return this;
            }

            public SecondCategoryList build() {
                return new SecondCategoryList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("SecondCategoryList")
        private java.util.List < SecondCategoryList> secondCategoryList;

        private Result(Builder builder) {
            this.secondCategoryList = builder.secondCategoryList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return secondCategoryList
         */
        public java.util.List < SecondCategoryList> getSecondCategoryList() {
            return this.secondCategoryList;
        }

        public static final class Builder {
            private java.util.List < SecondCategoryList> secondCategoryList; 

            /**
             * SecondCategoryList.
             */
            public Builder secondCategoryList(java.util.List < SecondCategoryList> secondCategoryList) {
                this.secondCategoryList = secondCategoryList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
