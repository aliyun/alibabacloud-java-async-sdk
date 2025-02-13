// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20201214.models;

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
 * {@link SearchImageByNameResponseBody} extends {@link TeaModel}
 *
 * <p>SearchImageByNameResponseBody</p>
 */
public class SearchImageByNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Auctions")
    private java.util.List<Auctions> auctions;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Head")
    private Head head;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("PicInfo")
    private PicInfo picInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SearchImageByNameResponseBody(Builder builder) {
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

    public static SearchImageByNameResponseBody create() {
        return builder().build();
    }

    /**
     * @return auctions
     */
    public java.util.List<Auctions> getAuctions() {
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
        private java.util.List<Auctions> auctions; 
        private Integer code; 
        private Head head; 
        private String msg; 
        private PicInfo picInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The product descriptions returned.</p>
         */
        public Builder auctions(java.util.List<Auctions> auctions) {
            this.auctions = auctions;
            return this;
        }

        /**
         * <p>The error code returned.</p>
         * <ul>
         * <li>A value of 0 indicates that the operation is successful.</li>
         * <li>Values other than 0 indicate errors.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The summary of the search result.</p>
         */
        public Builder head(Head head) {
            this.head = head;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>The information such as the system-selected category and result of subject recognition.</p>
         */
        public Builder picInfo(PicInfo picInfo) {
            this.picInfo = picInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>36C43E96-8F68-44AA-B1AF-B1F7AB94A6C1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SearchImageByNameResponseBody build() {
            return new SearchImageByNameResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchImageByNameResponseBody} extends {@link TeaModel}
     *
     * <p>SearchImageByNameResponseBody</p>
     */
    public static class Auctions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Integer categoryId;

        @com.aliyun.core.annotation.NameInMap("CustomContent")
        private String customContent;

        @com.aliyun.core.annotation.NameInMap("IntAttr")
        private Integer intAttr;

        @com.aliyun.core.annotation.NameInMap("IntAttr2")
        private Integer intAttr2;

        @com.aliyun.core.annotation.NameInMap("IntAttr3")
        private Integer intAttr3;

        @com.aliyun.core.annotation.NameInMap("IntAttr4")
        private Integer intAttr4;

        @com.aliyun.core.annotation.NameInMap("PicName")
        private String picName;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("SortExprValues")
        private String sortExprValues;

        @com.aliyun.core.annotation.NameInMap("StrAttr")
        private String strAttr;

        @com.aliyun.core.annotation.NameInMap("StrAttr2")
        private String strAttr2;

        @com.aliyun.core.annotation.NameInMap("StrAttr3")
        private String strAttr3;

        @com.aliyun.core.annotation.NameInMap("StrAttr4")
        private String strAttr4;

        private Auctions(Builder builder) {
            this.categoryId = builder.categoryId;
            this.customContent = builder.customContent;
            this.intAttr = builder.intAttr;
            this.intAttr2 = builder.intAttr2;
            this.intAttr3 = builder.intAttr3;
            this.intAttr4 = builder.intAttr4;
            this.picName = builder.picName;
            this.productId = builder.productId;
            this.score = builder.score;
            this.sortExprValues = builder.sortExprValues;
            this.strAttr = builder.strAttr;
            this.strAttr2 = builder.strAttr2;
            this.strAttr3 = builder.strAttr3;
            this.strAttr4 = builder.strAttr4;
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
         * @return intAttr2
         */
        public Integer getIntAttr2() {
            return this.intAttr2;
        }

        /**
         * @return intAttr3
         */
        public Integer getIntAttr3() {
            return this.intAttr3;
        }

        /**
         * @return intAttr4
         */
        public Integer getIntAttr4() {
            return this.intAttr4;
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

        /**
         * @return strAttr2
         */
        public String getStrAttr2() {
            return this.strAttr2;
        }

        /**
         * @return strAttr3
         */
        public String getStrAttr3() {
            return this.strAttr3;
        }

        /**
         * @return strAttr4
         */
        public String getStrAttr4() {
            return this.strAttr4;
        }

        public static final class Builder {
            private Integer categoryId; 
            private String customContent; 
            private Integer intAttr; 
            private Integer intAttr2; 
            private Integer intAttr3; 
            private Integer intAttr4; 
            private String picName; 
            private String productId; 
            private Float score; 
            private String sortExprValues; 
            private String strAttr; 
            private String strAttr2; 
            private String strAttr3; 
            private String strAttr4; 

            /**
             * <p>The category of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder categoryId(Integer categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The user-defined content.</p>
             * 
             * <strong>example:</strong>
             * <p>zidingyi</p>
             */
            public Builder customContent(String customContent) {
                this.customContent = customContent;
                return this;
            }

            /**
             * <p>The attribute, which is an integer.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder intAttr(Integer intAttr) {
                this.intAttr = intAttr;
                return this;
            }

            /**
             * IntAttr2.
             */
            public Builder intAttr2(Integer intAttr2) {
                this.intAttr2 = intAttr2;
                return this;
            }

            /**
             * IntAttr3.
             */
            public Builder intAttr3(Integer intAttr3) {
                this.intAttr3 = intAttr3;
                return this;
            }

            /**
             * IntAttr4.
             */
            public Builder intAttr4(Integer intAttr4) {
                this.intAttr4 = intAttr4;
                return this;
            }

            /**
             * <p>The name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>2092061_1.jpg</p>
             */
            public Builder picName(String picName) {
                this.picName = picName;
                return this;
            }

            /**
             * <p>The ID of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>2092061_1</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The similarity score of the returned image. Valid values: 0 to 1.</p>
             * <blockquote>
             * <p> To use this feature, you must upgrade the SDK to version 3.1.1.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The score information about the image.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter is not supported. We recommend that you use the Score parameter.</li>
             * <li>The SortExprValues parameter indicates a 2-tuple in which values are separated by a semicolon (;). The first value indicates the correlation score of the returned image. A greater value indicates a higher correlation with the sample image. Different algorithms are used.</li>
             * <li>If the value of CategoryId is within the value range from 0 to 2, the value range of SortExprValues is from 0 to 7.33136443711219e+24.</li>
             * <li>If the value of CategoryId is not within the value range from 0 to 2, the value range of SortExprValues is from 0 to 5.37633353624177e+24. If the returned image is identical with the sample image, the highest correlation score is generated.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5.37633353624177e+24;0</p>
             */
            public Builder sortExprValues(String sortExprValues) {
                this.sortExprValues = sortExprValues;
                return this;
            }

            /**
             * <p>The attribute, which is a string.</p>
             * 
             * <strong>example:</strong>
             * <p>ss</p>
             */
            public Builder strAttr(String strAttr) {
                this.strAttr = strAttr;
                return this;
            }

            /**
             * StrAttr2.
             */
            public Builder strAttr2(String strAttr2) {
                this.strAttr2 = strAttr2;
                return this;
            }

            /**
             * StrAttr3.
             */
            public Builder strAttr3(String strAttr3) {
                this.strAttr3 = strAttr3;
                return this;
            }

            /**
             * StrAttr4.
             */
            public Builder strAttr4(String strAttr4) {
                this.strAttr4 = strAttr4;
                return this;
            }

            public Auctions build() {
                return new Auctions(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchImageByNameResponseBody} extends {@link TeaModel}
     *
     * <p>SearchImageByNameResponseBody</p>
     */
    public static class Head extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocsFound")
        private Integer docsFound;

        @com.aliyun.core.annotation.NameInMap("DocsReturn")
        private Integer docsReturn;

        @com.aliyun.core.annotation.NameInMap("SearchTime")
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
             * <p>The number of images returned.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder docsFound(Integer docsFound) {
                this.docsFound = docsFound;
                return this;
            }

            /**
             * <p>The number of images that match the search conditions on the Image Search instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder docsReturn(Integer docsReturn) {
                this.docsReturn = docsReturn;
                return this;
            }

            /**
             * <p>The time it takes to complete the search process. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
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
    /**
     * 
     * {@link SearchImageByNameResponseBody} extends {@link TeaModel}
     *
     * <p>SearchImageByNameResponseBody</p>
     */
    public static class AllCategories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Name")
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
             * <p>The ID of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>other</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>88888888</p>
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
    /**
     * 
     * {@link SearchImageByNameResponseBody} extends {@link TeaModel}
     *
     * <p>SearchImageByNameResponseBody</p>
     */
    public static class MultiRegion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Region")
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
             * <p>The result of subject recognition.</p>
             * <p>The subject area of the image, in the format of x1,x2,y1,y2. Specifically, x1 and y1 specify the upper-left pixel, and x2 and y2 specify the lower-right pixel. If a subject area is specified in the request, the specified subject area prevails.</p>
             * 
             * <strong>example:</strong>
             * <p>280,486,232,351</p>
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
    /**
     * 
     * {@link SearchImageByNameResponseBody} extends {@link TeaModel}
     *
     * <p>SearchImageByNameResponseBody</p>
     */
    public static class PicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllCategories")
        private java.util.List<AllCategories> allCategories;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Integer categoryId;

        @com.aliyun.core.annotation.NameInMap("MultiRegion")
        private java.util.List<MultiRegion> multiRegion;

        @com.aliyun.core.annotation.NameInMap("Region")
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
        public java.util.List<AllCategories> getAllCategories() {
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
        public java.util.List<MultiRegion> getMultiRegion() {
            return this.multiRegion;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private java.util.List<AllCategories> allCategories; 
            private Integer categoryId; 
            private java.util.List<MultiRegion> multiRegion; 
            private String region; 

            /**
             * <p>The categories that are supported by the system.</p>
             */
            public Builder allCategories(java.util.List<AllCategories> allCategories) {
                this.allCategories = allCategories;
                return this;
            }

            /**
             * <p>The category selected by the system.</p>
             * <p>If a category is specified in the request, the specified category prevails.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder categoryId(Integer categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The recognized subjects.</p>
             */
            public Builder multiRegion(java.util.List<MultiRegion> multiRegion) {
                this.multiRegion = multiRegion;
                return this;
            }

            /**
             * <p>The result of subject recognition.</p>
             * <p>The subject area of the image, in the format of x1,x2,y1,y2. Specifically, x1 and y1 specify the upper-left pixel, and x2 and y2 specify the lower-right pixel. If a subject area is specified in the request, the specified subject area prevails.</p>
             * 
             * <strong>example:</strong>
             * <p>280,486,232,351</p>
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
