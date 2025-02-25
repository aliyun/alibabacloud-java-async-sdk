// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchItemsResponseBody} extends {@link TeaModel}
 *
 * <p>SearchItemsResponseBody</p>
 */
public class SearchItemsResponseBody extends TeaModel {
    @NameInMap("Module")
    private Module module;

    private SearchItemsResponseBody(Builder builder) {
        this.module = builder.module;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchItemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    public static final class Builder {
        private Module module; 

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        public SearchItemsResponseBody build() {
            return new SearchItemsResponseBody(this);
        } 

    } 

    public static class Item extends TeaModel {
        @NameInMap("DetailViewObjectSourceDatum")
        private String detailViewObjectSourceDatum;

        @NameInMap("DetailViewObjectSourceType")
        private String detailViewObjectSourceType;

        private Item(Builder builder) {
            this.detailViewObjectSourceDatum = builder.detailViewObjectSourceDatum;
            this.detailViewObjectSourceType = builder.detailViewObjectSourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return detailViewObjectSourceDatum
         */
        public String getDetailViewObjectSourceDatum() {
            return this.detailViewObjectSourceDatum;
        }

        /**
         * @return detailViewObjectSourceType
         */
        public String getDetailViewObjectSourceType() {
            return this.detailViewObjectSourceType;
        }

        public static final class Builder {
            private String detailViewObjectSourceDatum; 
            private String detailViewObjectSourceType; 

            /**
             * DetailViewObjectSourceDatum.
             */
            public Builder detailViewObjectSourceDatum(String detailViewObjectSourceDatum) {
                this.detailViewObjectSourceDatum = detailViewObjectSourceDatum;
                return this;
            }

            /**
             * DetailViewObjectSourceType.
             */
            public Builder detailViewObjectSourceType(String detailViewObjectSourceType) {
                this.detailViewObjectSourceType = detailViewObjectSourceType;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    public static class Date extends TeaModel {
        @NameInMap("item")
        private java.util.List < Item> item;

        private Date(Builder builder) {
            this.item = builder.item;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Date create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List < Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List < Item> item; 

            /**
             * item.
             */
            public Builder item(java.util.List < Item> item) {
                this.item = item;
                return this;
            }

            public Date build() {
                return new Date(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("CurrentPageNum")
        private Integer currentPageNum;

        @NameInMap("Date")
        private Date date;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalItemNum")
        private Integer totalItemNum;

        @NameInMap("TotalPageNum")
        private Integer totalPageNum;

        private Module(Builder builder) {
            this.currentPageNum = builder.currentPageNum;
            this.date = builder.date;
            this.pageSize = builder.pageSize;
            this.totalItemNum = builder.totalItemNum;
            this.totalPageNum = builder.totalPageNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return currentPageNum
         */
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        /**
         * @return date
         */
        public Date getDate() {
            return this.date;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalItemNum
         */
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        /**
         * @return totalPageNum
         */
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

        public static final class Builder {
            private Integer currentPageNum; 
            private Date date; 
            private Integer pageSize; 
            private Integer totalItemNum; 
            private Integer totalPageNum; 

            /**
             * CurrentPageNum.
             */
            public Builder currentPageNum(Integer currentPageNum) {
                this.currentPageNum = currentPageNum;
                return this;
            }

            /**
             * Date.
             */
            public Builder date(Date date) {
                this.date = date;
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
             * TotalItemNum.
             */
            public Builder totalItemNum(Integer totalItemNum) {
                this.totalItemNum = totalItemNum;
                return this;
            }

            /**
             * TotalPageNum.
             */
            public Builder totalPageNum(Integer totalPageNum) {
                this.totalPageNum = totalPageNum;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
