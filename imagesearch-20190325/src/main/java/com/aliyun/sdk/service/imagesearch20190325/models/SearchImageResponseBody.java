// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20190325.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchImageResponseBody} extends {@link TeaModel}
 *
 * <p>SearchImageResponseBody</p>
 */
public class SearchImageResponseBody extends TeaModel {
    @NameInMap("Auctions")
    private java.util.List < Auctions> auctions;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Head")
    private Head head;

    @NameInMap("Msg")
    private String msg;

    @NameInMap("PicInfo")
    private PicInfo picInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private SearchImageResponseBody(Builder builder) {
        this.auctions = builder.auctions;
        this.code = builder.code;
        this.head = builder.head;
        this.msg = builder.msg;
        this.picInfo = builder.picInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchImageResponseBody create() {
        return builder().build();
    }

    /**
     * @return auctions
     */
    public java.util.List < Auctions> getAuctions() {
        return this.auctions;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return head
     */
    public Head getHead() {
        return this.head;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return picInfo
     */
    public PicInfo getPicInfo() {
        return this.picInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List < Auctions> auctions; 
        private Integer code; 
        private Head head; 
        private String msg; 
        private PicInfo picInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * Auctions.
         */
        public Builder auctions(java.util.List < Auctions> auctions) {
            this.auctions = auctions;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Head.
         */
        public Builder head(Head head) {
            this.head = head;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * PicInfo.
         */
        public Builder picInfo(PicInfo picInfo) {
            this.picInfo = picInfo;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SearchImageResponseBody build() {
            return new SearchImageResponseBody(this);
        } 

    } 

    public static class Auctions extends TeaModel {
        @NameInMap("CategoryId")
        private Integer categoryId;

        @NameInMap("CustomContent")
        private String customContent;

        @NameInMap("IntAttr")
        private Integer intAttr;

        @NameInMap("PicName")
        private String picName;

        @NameInMap("ProductId")
        private String productId;

        @NameInMap("Score")
        private Float score;

        @NameInMap("SortExprValues")
        private String sortExprValues;

        @NameInMap("StrAttr")
        private String strAttr;

        private Auctions(Builder builder) {
            this.categoryId = builder.categoryId;
            this.customContent = builder.customContent;
            this.intAttr = builder.intAttr;
            this.picName = builder.picName;
            this.productId = builder.productId;
            this.score = builder.score;
            this.sortExprValues = builder.sortExprValues;
            this.strAttr = builder.strAttr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Auctions create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public Integer getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return customContent
         */
        public String getCustomContent() {
            return this.customContent;
        }

        /**
         * @return intAttr
         */
        public Integer getIntAttr() {
            return this.intAttr;
        }

        /**
         * @return picName
         */
        public String getPicName() {
            return this.picName;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        /**
         * @return sortExprValues
         */
        public String getSortExprValues() {
            return this.sortExprValues;
        }

        /**
         * @return strAttr
         */
        public String getStrAttr() {
            return this.strAttr;
        }

        public static final class Builder {
            private Integer categoryId; 
            private String customContent; 
            private Integer intAttr; 
            private String picName; 
            private String productId; 
            private Float score; 
            private String sortExprValues; 
            private String strAttr; 

            /**
             * CategoryId.
             */
            public Builder categoryId(Integer categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * CustomContent.
             */
            public Builder customContent(String customContent) {
                this.customContent = customContent;
                return this;
            }

            /**
             * IntAttr.
             */
            public Builder intAttr(Integer intAttr) {
                this.intAttr = intAttr;
                return this;
            }

            /**
             * PicName.
             */
            public Builder picName(String picName) {
                this.picName = picName;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            /**
             * SortExprValues.
             */
            public Builder sortExprValues(String sortExprValues) {
                this.sortExprValues = sortExprValues;
                return this;
            }

            /**
             * StrAttr.
             */
            public Builder strAttr(String strAttr) {
                this.strAttr = strAttr;
                return this;
            }

            public Auctions build() {
                return new Auctions(this);
            } 

        } 

    }
    public static class Head extends TeaModel {
        @NameInMap("DocsFound")
        private Integer docsFound;

        @NameInMap("DocsReturn")
        private Integer docsReturn;

        @NameInMap("SearchTime")
        private Integer searchTime;

        private Head(Builder builder) {
            this.docsFound = builder.docsFound;
            this.docsReturn = builder.docsReturn;
            this.searchTime = builder.searchTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Head create() {
            return builder().build();
        }

        /**
         * @return docsFound
         */
        public Integer getDocsFound() {
            return this.docsFound;
        }

        /**
         * @return docsReturn
         */
        public Integer getDocsReturn() {
            return this.docsReturn;
        }

        /**
         * @return searchTime
         */
        public Integer getSearchTime() {
            return this.searchTime;
        }

        public static final class Builder {
            private Integer docsFound; 
            private Integer docsReturn; 
            private Integer searchTime; 

            /**
             * DocsFound.
             */
            public Builder docsFound(Integer docsFound) {
                this.docsFound = docsFound;
                return this;
            }

            /**
             * DocsReturn.
             */
            public Builder docsReturn(Integer docsReturn) {
                this.docsReturn = docsReturn;
                return this;
            }

            /**
             * SearchTime.
             */
            public Builder searchTime(Integer searchTime) {
                this.searchTime = searchTime;
                return this;
            }

            public Head build() {
                return new Head(this);
            } 

        } 

    }
    public static class AllCategories extends TeaModel {
        @NameInMap("Id")
        private Integer id;

        @NameInMap("Name")
        private String name;

        private AllCategories(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllCategories create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer id; 
            private String name; 

            /**
             * Id.
             */
            public Builder id(Integer id) {
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

            public AllCategories build() {
                return new AllCategories(this);
            } 

        } 

    }
    public static class MultiRegion extends TeaModel {
        @NameInMap("Region")
        private String region;

        private MultiRegion(Builder builder) {
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiRegion create() {
            return builder().build();
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String region; 

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public MultiRegion build() {
                return new MultiRegion(this);
            } 

        } 

    }
    public static class PicInfo extends TeaModel {
        @NameInMap("AllCategories")
        private java.util.List < AllCategories> allCategories;

        @NameInMap("CategoryId")
        private Integer categoryId;

        @NameInMap("MultiRegion")
        private java.util.List < MultiRegion> multiRegion;

        @NameInMap("Region")
        private String region;

        private PicInfo(Builder builder) {
            this.allCategories = builder.allCategories;
            this.categoryId = builder.categoryId;
            this.multiRegion = builder.multiRegion;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PicInfo create() {
            return builder().build();
        }

        /**
         * @return allCategories
         */
        public java.util.List < AllCategories> getAllCategories() {
            return this.allCategories;
        }

        /**
         * @return categoryId
         */
        public Integer getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return multiRegion
         */
        public java.util.List < MultiRegion> getMultiRegion() {
            return this.multiRegion;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private java.util.List < AllCategories> allCategories; 
            private Integer categoryId; 
            private java.util.List < MultiRegion> multiRegion; 
            private String region; 

            /**
             * AllCategories.
             */
            public Builder allCategories(java.util.List < AllCategories> allCategories) {
                this.allCategories = allCategories;
                return this;
            }

            /**
             * CategoryId.
             */
            public Builder categoryId(Integer categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * MultiRegion.
             */
            public Builder multiRegion(java.util.List < MultiRegion> multiRegion) {
                this.multiRegion = multiRegion;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public PicInfo build() {
                return new PicInfo(this);
            } 

        } 

    }
}
