// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchBodyResponseBody} extends {@link TeaModel}
 *
 * <p>SearchBodyResponseBody</p>
 */
public class SearchBodyResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private SearchBodyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchBodyResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public SearchBodyResponseBody build() {
            return new SearchBodyResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("GbId")
        private String gbId;

        @NameInMap("ImageUrl")
        private String imageUrl;

        @NameInMap("LeftTopX")
        private Float leftTopX;

        @NameInMap("LeftTopY")
        private Float leftTopY;

        @NameInMap("RightBottomX")
        private Float rightBottomX;

        @NameInMap("RightBottomY")
        private Float rightBottomY;

        @NameInMap("Score")
        private Float score;

        @NameInMap("TargetImageUrl")
        private String targetImageUrl;

        private Records(Builder builder) {
            this.gbId = builder.gbId;
            this.imageUrl = builder.imageUrl;
            this.leftTopX = builder.leftTopX;
            this.leftTopY = builder.leftTopY;
            this.rightBottomX = builder.rightBottomX;
            this.rightBottomY = builder.rightBottomY;
            this.score = builder.score;
            this.targetImageUrl = builder.targetImageUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return gbId
         */
        public String getGbId() {
            return this.gbId;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return leftTopX
         */
        public Float getLeftTopX() {
            return this.leftTopX;
        }

        /**
         * @return leftTopY
         */
        public Float getLeftTopY() {
            return this.leftTopY;
        }

        /**
         * @return rightBottomX
         */
        public Float getRightBottomX() {
            return this.rightBottomX;
        }

        /**
         * @return rightBottomY
         */
        public Float getRightBottomY() {
            return this.rightBottomY;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        /**
         * @return targetImageUrl
         */
        public String getTargetImageUrl() {
            return this.targetImageUrl;
        }

        public static final class Builder {
            private String gbId; 
            private String imageUrl; 
            private Float leftTopX; 
            private Float leftTopY; 
            private Float rightBottomX; 
            private Float rightBottomY; 
            private Float score; 
            private String targetImageUrl; 

            /**
             * GbId.
             */
            public Builder gbId(String gbId) {
                this.gbId = gbId;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * LeftTopX.
             */
            public Builder leftTopX(Float leftTopX) {
                this.leftTopX = leftTopX;
                return this;
            }

            /**
             * LeftTopY.
             */
            public Builder leftTopY(Float leftTopY) {
                this.leftTopY = leftTopY;
                return this;
            }

            /**
             * RightBottomX.
             */
            public Builder rightBottomX(Float rightBottomX) {
                this.rightBottomX = rightBottomX;
                return this;
            }

            /**
             * RightBottomY.
             */
            public Builder rightBottomY(Float rightBottomY) {
                this.rightBottomY = rightBottomY;
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
             * TargetImageUrl.
             */
            public Builder targetImageUrl(String targetImageUrl) {
                this.targetImageUrl = targetImageUrl;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNo")
        private Integer pageNo;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Records")
        private java.util.List < Records> records;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("TotalPage")
        private Integer totalPage;

        private Data(Builder builder) {
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.totalCount = builder.totalCount;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List < Records> getRecords() {
            return this.records;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private Integer pageNo; 
            private Integer pageSize; 
            private java.util.List < Records> records; 
            private Integer totalCount; 
            private Integer totalPage; 

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
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
             * Records.
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
