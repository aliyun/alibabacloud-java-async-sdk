// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBodyAlgorithmResultsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBodyAlgorithmResultsResponseBody</p>
 */
public class ListBodyAlgorithmResultsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListBodyAlgorithmResultsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBodyAlgorithmResultsResponseBody create() {
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

        public ListBodyAlgorithmResultsResponseBody build() {
            return new ListBodyAlgorithmResultsResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("CapStyle")
        private String capStyle;

        @NameInMap("CoatColor")
        private String coatColor;

        @NameInMap("CoatLength")
        private String coatLength;

        @NameInMap("CoatStyle")
        private String coatStyle;

        @NameInMap("CorpId")
        private String corpId;

        @NameInMap("DataSourceId")
        private String dataSourceId;

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

        @NameInMap("PersonId")
        private String personId;

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

        @NameInMap("TrousersColor")
        private String trousersColor;

        @NameInMap("TrousersLength")
        private String trousersLength;

        @NameInMap("TrousersStyle")
        private String trousersStyle;

        private Records(Builder builder) {
            this.capStyle = builder.capStyle;
            this.coatColor = builder.coatColor;
            this.coatLength = builder.coatLength;
            this.coatStyle = builder.coatStyle;
            this.corpId = builder.corpId;
            this.dataSourceId = builder.dataSourceId;
            this.genderCode = builder.genderCode;
            this.hairStyle = builder.hairStyle;
            this.leftTopX = builder.leftTopX;
            this.leftTopY = builder.leftTopY;
            this.maxAge = builder.maxAge;
            this.minAge = builder.minAge;
            this.personId = builder.personId;
            this.picUrlPath = builder.picUrlPath;
            this.rightBottomX = builder.rightBottomX;
            this.rightBottomY = builder.rightBottomY;
            this.shotTime = builder.shotTime;
            this.sourceId = builder.sourceId;
            this.targetPicUrlPath = builder.targetPicUrlPath;
            this.trousersColor = builder.trousersColor;
            this.trousersLength = builder.trousersLength;
            this.trousersStyle = builder.trousersStyle;
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
         * @return coatColor
         */
        public String getCoatColor() {
            return this.coatColor;
        }

        /**
         * @return coatLength
         */
        public String getCoatLength() {
            return this.coatLength;
        }

        /**
         * @return coatStyle
         */
        public String getCoatStyle() {
            return this.coatStyle;
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
         * @return personId
         */
        public String getPersonId() {
            return this.personId;
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

        /**
         * @return trousersColor
         */
        public String getTrousersColor() {
            return this.trousersColor;
        }

        /**
         * @return trousersLength
         */
        public String getTrousersLength() {
            return this.trousersLength;
        }

        /**
         * @return trousersStyle
         */
        public String getTrousersStyle() {
            return this.trousersStyle;
        }

        public static final class Builder {
            private String capStyle; 
            private String coatColor; 
            private String coatLength; 
            private String coatStyle; 
            private String corpId; 
            private String dataSourceId; 
            private String genderCode; 
            private String hairStyle; 
            private Float leftTopX; 
            private Float leftTopY; 
            private String maxAge; 
            private String minAge; 
            private String personId; 
            private String picUrlPath; 
            private Float rightBottomX; 
            private Float rightBottomY; 
            private String shotTime; 
            private String sourceId; 
            private String targetPicUrlPath; 
            private String trousersColor; 
            private String trousersLength; 
            private String trousersStyle; 

            /**
             * CapStyle.
             */
            public Builder capStyle(String capStyle) {
                this.capStyle = capStyle;
                return this;
            }

            /**
             * CoatColor.
             */
            public Builder coatColor(String coatColor) {
                this.coatColor = coatColor;
                return this;
            }

            /**
             * CoatLength.
             */
            public Builder coatLength(String coatLength) {
                this.coatLength = coatLength;
                return this;
            }

            /**
             * CoatStyle.
             */
            public Builder coatStyle(String coatStyle) {
                this.coatStyle = coatStyle;
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
             * PersonId.
             */
            public Builder personId(String personId) {
                this.personId = personId;
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

            /**
             * TrousersColor.
             */
            public Builder trousersColor(String trousersColor) {
                this.trousersColor = trousersColor;
                return this;
            }

            /**
             * TrousersLength.
             */
            public Builder trousersLength(String trousersLength) {
                this.trousersLength = trousersLength;
                return this;
            }

            /**
             * TrousersStyle.
             */
            public Builder trousersStyle(String trousersStyle) {
                this.trousersStyle = trousersStyle;
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
