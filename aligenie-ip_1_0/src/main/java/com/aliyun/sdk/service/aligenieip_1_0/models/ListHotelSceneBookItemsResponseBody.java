// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotelSceneBookItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHotelSceneBookItemsResponseBody</p>
 */
public class ListHotelSceneBookItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListHotelSceneBookItemsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotelSceneBookItemsResponseBody create() {
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

        public ListHotelSceneBookItemsResponseBody build() {
            return new ListHotelSceneBookItemsResponseBody(this);
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
    public static class SceneItemList extends TeaModel {
        @NameInMap("Icon")
        private String icon;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Price")
        private Long price;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private SceneItemList(Builder builder) {
            this.icon = builder.icon;
            this.id = builder.id;
            this.name = builder.name;
            this.price = builder.price;
            this.status = builder.status;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneItemList create() {
            return builder().build();
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
        public Long getId() {
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

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String icon; 
            private Long id; 
            private String name; 
            private Long price; 
            private String status; 
            private String type; 
            private Long updateTime; 

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
            public Builder id(Long id) {
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

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public SceneItemList build() {
                return new SceneItemList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Page")
        private Page page;

        @NameInMap("SceneItemList")
        private java.util.List < SceneItemList> sceneItemList;

        private Result(Builder builder) {
            this.page = builder.page;
            this.sceneItemList = builder.sceneItemList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return page
         */
        public Page getPage() {
            return this.page;
        }

        /**
         * @return sceneItemList
         */
        public java.util.List < SceneItemList> getSceneItemList() {
            return this.sceneItemList;
        }

        public static final class Builder {
            private Page page; 
            private java.util.List < SceneItemList> sceneItemList; 

            /**
             * Page.
             */
            public Builder page(Page page) {
                this.page = page;
                return this;
            }

            /**
             * SceneItemList.
             */
            public Builder sceneItemList(java.util.List < SceneItemList> sceneItemList) {
                this.sceneItemList = sceneItemList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
