// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFaceAlgorithmResultsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFaceAlgorithmResultsResponseBody</p>
 */
public class ListFaceAlgorithmResultsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListFaceAlgorithmResultsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFaceAlgorithmResultsResponseBody create() {
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

        public ListFaceAlgorithmResultsResponseBody build() {
            return new ListFaceAlgorithmResultsResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("CapStyle")
        private String capStyle;

        @NameInMap("CorpId")
        private String corpId;

        @NameInMap("DataSourceId")
        private String dataSourceId;

        @NameInMap("FaceId")
        private String faceId;

        @NameInMap("GenderCode")
        private String genderCode;

        @NameInMap("HairStyle")
        private String hairStyle;

        @NameInMap("LeftTopX")
        private Float leftTopX;

        @NameInMap("LeftTopY")
        private Float leftTopY;

        @NameInMap("MaxAge")
        private String maxAge;

        @NameInMap("MinAge")
        private String minAge;

        @NameInMap("PicUrlPath")
        private String picUrlPath;

        @NameInMap("RightBottomX")
        private Float rightBottomX;

        @NameInMap("RightBottomY")
        private Float rightBottomY;

        @NameInMap("ShotTime")
        private String shotTime;

        @NameInMap("SourceId")
        private String sourceId;

        @NameInMap("TargetPicUrlPath")
        private String targetPicUrlPath;

        private Records(Builder builder) {
            this.capStyle = builder.capStyle;
            this.corpId = builder.corpId;
            this.dataSourceId = builder.dataSourceId;
            this.faceId = builder.faceId;
            this.genderCode = builder.genderCode;
            this.hairStyle = builder.hairStyle;
            this.leftTopX = builder.leftTopX;
            this.leftTopY = builder.leftTopY;
            this.maxAge = builder.maxAge;
            this.minAge = builder.minAge;
            this.picUrlPath = builder.picUrlPath;
            this.rightBottomX = builder.rightBottomX;
            this.rightBottomY = builder.rightBottomY;
            this.shotTime = builder.shotTime;
            this.sourceId = builder.sourceId;
            this.targetPicUrlPath = builder.targetPicUrlPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return capStyle
         */
        public String getCapStyle() {
            return this.capStyle;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return faceId
         */
        public String getFaceId() {
            return this.faceId;
        }

        /**
         * @return genderCode
         */
        public String getGenderCode() {
            return this.genderCode;
        }

        /**
         * @return hairStyle
         */
        public String getHairStyle() {
            return this.hairStyle;
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
         * @return maxAge
         */
        public String getMaxAge() {
            return this.maxAge;
        }

        /**
         * @return minAge
         */
        public String getMinAge() {
            return this.minAge;
        }

        /**
         * @return picUrlPath
         */
        public String getPicUrlPath() {
            return this.picUrlPath;
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
         * @return shotTime
         */
        public String getShotTime() {
            return this.shotTime;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return targetPicUrlPath
         */
        public String getTargetPicUrlPath() {
            return this.targetPicUrlPath;
        }

        public static final class Builder {
            private String capStyle; 
            private String corpId; 
            private String dataSourceId; 
            private String faceId; 
            private String genderCode; 
            private String hairStyle; 
            private Float leftTopX; 
            private Float leftTopY; 
            private String maxAge; 
            private String minAge; 
            private String picUrlPath; 
            private Float rightBottomX; 
            private Float rightBottomY; 
            private String shotTime; 
            private String sourceId; 
            private String targetPicUrlPath; 

            /**
             * CapStyle.
             */
            public Builder capStyle(String capStyle) {
                this.capStyle = capStyle;
                return this;
            }

            /**
             * CorpId.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * DataSourceId.
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * FaceId.
             */
            public Builder faceId(String faceId) {
                this.faceId = faceId;
                return this;
            }

            /**
             * GenderCode.
             */
            public Builder genderCode(String genderCode) {
                this.genderCode = genderCode;
                return this;
            }

            /**
             * HairStyle.
             */
            public Builder hairStyle(String hairStyle) {
                this.hairStyle = hairStyle;
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
             * MaxAge.
             */
            public Builder maxAge(String maxAge) {
                this.maxAge = maxAge;
                return this;
            }

            /**
             * MinAge.
             */
            public Builder minAge(String minAge) {
                this.minAge = minAge;
                return this;
            }

            /**
             * PicUrlPath.
             */
            public Builder picUrlPath(String picUrlPath) {
                this.picUrlPath = picUrlPath;
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
             * ShotTime.
             */
            public Builder shotTime(String shotTime) {
                this.shotTime = shotTime;
                return this;
            }

            /**
             * SourceId.
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * TargetPicUrlPath.
             */
            public Builder targetPicUrlPath(String targetPicUrlPath) {
                this.targetPicUrlPath = targetPicUrlPath;
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
