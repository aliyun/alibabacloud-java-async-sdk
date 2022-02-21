// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchObjectResponseBody} extends {@link TeaModel}
 *
 * <p>SearchObjectResponseBody</p>
 */
public class SearchObjectResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private SearchObjectResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchObjectResponseBody create() {
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

        public SearchObjectResponseBody build() {
            return new SearchObjectResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("CompareResult")
        private String compareResult;

        @NameInMap("DeviceID")
        private String deviceID;

        @NameInMap("LeftTopX")
        private Integer leftTopX;

        @NameInMap("LeftTopY")
        private Integer leftTopY;

        @NameInMap("RightBtmX")
        private Integer rightBtmX;

        @NameInMap("RightBtmY")
        private Integer rightBtmY;

        @NameInMap("Score")
        private Float score;

        @NameInMap("ShotTime")
        private Long shotTime;

        @NameInMap("SourceID")
        private String sourceID;

        @NameInMap("SourceImagePath")
        private String sourceImagePath;

        @NameInMap("SourceImageUrl")
        private String sourceImageUrl;

        @NameInMap("TargetImagePath")
        private String targetImagePath;

        @NameInMap("TargetImageUrl")
        private String targetImageUrl;

        private Records(Builder builder) {
            this.compareResult = builder.compareResult;
            this.deviceID = builder.deviceID;
            this.leftTopX = builder.leftTopX;
            this.leftTopY = builder.leftTopY;
            this.rightBtmX = builder.rightBtmX;
            this.rightBtmY = builder.rightBtmY;
            this.score = builder.score;
            this.shotTime = builder.shotTime;
            this.sourceID = builder.sourceID;
            this.sourceImagePath = builder.sourceImagePath;
            this.sourceImageUrl = builder.sourceImageUrl;
            this.targetImagePath = builder.targetImagePath;
            this.targetImageUrl = builder.targetImageUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return compareResult
         */
        public String getCompareResult() {
            return this.compareResult;
        }

        /**
         * @return deviceID
         */
        public String getDeviceID() {
            return this.deviceID;
        }

        /**
         * @return leftTopX
         */
        public Integer getLeftTopX() {
            return this.leftTopX;
        }

        /**
         * @return leftTopY
         */
        public Integer getLeftTopY() {
            return this.leftTopY;
        }

        /**
         * @return rightBtmX
         */
        public Integer getRightBtmX() {
            return this.rightBtmX;
        }

        /**
         * @return rightBtmY
         */
        public Integer getRightBtmY() {
            return this.rightBtmY;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        /**
         * @return shotTime
         */
        public Long getShotTime() {
            return this.shotTime;
        }

        /**
         * @return sourceID
         */
        public String getSourceID() {
            return this.sourceID;
        }

        /**
         * @return sourceImagePath
         */
        public String getSourceImagePath() {
            return this.sourceImagePath;
        }

        /**
         * @return sourceImageUrl
         */
        public String getSourceImageUrl() {
            return this.sourceImageUrl;
        }

        /**
         * @return targetImagePath
         */
        public String getTargetImagePath() {
            return this.targetImagePath;
        }

        /**
         * @return targetImageUrl
         */
        public String getTargetImageUrl() {
            return this.targetImageUrl;
        }

        public static final class Builder {
            private String compareResult; 
            private String deviceID; 
            private Integer leftTopX; 
            private Integer leftTopY; 
            private Integer rightBtmX; 
            private Integer rightBtmY; 
            private Float score; 
            private Long shotTime; 
            private String sourceID; 
            private String sourceImagePath; 
            private String sourceImageUrl; 
            private String targetImagePath; 
            private String targetImageUrl; 

            /**
             * CompareResult.
             */
            public Builder compareResult(String compareResult) {
                this.compareResult = compareResult;
                return this;
            }

            /**
             * DeviceID.
             */
            public Builder deviceID(String deviceID) {
                this.deviceID = deviceID;
                return this;
            }

            /**
             * LeftTopX.
             */
            public Builder leftTopX(Integer leftTopX) {
                this.leftTopX = leftTopX;
                return this;
            }

            /**
             * LeftTopY.
             */
            public Builder leftTopY(Integer leftTopY) {
                this.leftTopY = leftTopY;
                return this;
            }

            /**
             * RightBtmX.
             */
            public Builder rightBtmX(Integer rightBtmX) {
                this.rightBtmX = rightBtmX;
                return this;
            }

            /**
             * RightBtmY.
             */
            public Builder rightBtmY(Integer rightBtmY) {
                this.rightBtmY = rightBtmY;
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
             * ShotTime.
             */
            public Builder shotTime(Long shotTime) {
                this.shotTime = shotTime;
                return this;
            }

            /**
             * SourceID.
             */
            public Builder sourceID(String sourceID) {
                this.sourceID = sourceID;
                return this;
            }

            /**
             * SourceImagePath.
             */
            public Builder sourceImagePath(String sourceImagePath) {
                this.sourceImagePath = sourceImagePath;
                return this;
            }

            /**
             * SourceImageUrl.
             */
            public Builder sourceImageUrl(String sourceImageUrl) {
                this.sourceImageUrl = sourceImageUrl;
                return this;
            }

            /**
             * TargetImagePath.
             */
            public Builder targetImagePath(String targetImagePath) {
                this.targetImagePath = targetImagePath;
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
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Records")
        private java.util.List < Records> records;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("TotalPage")
        private Integer totalPage;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
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
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < Records> records; 
            private Integer totalCount; 
            private Integer totalPage; 

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
