// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMotorAlgorithmResultsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMotorAlgorithmResultsResponseBody</p>
 */
public class ListMotorAlgorithmResultsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListMotorAlgorithmResultsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMotorAlgorithmResultsResponseBody create() {
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

        public ListMotorAlgorithmResultsResponseBody build() {
            return new ListMotorAlgorithmResultsResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("Calling")
        private String calling;

        @NameInMap("CorpId")
        private String corpId;

        @NameInMap("DataSourceId")
        private String dataSourceId;

        @NameInMap("LeftTopX")
        private Float leftTopX;

        @NameInMap("LeftTopY")
        private Float leftTopY;

        @NameInMap("MotorBrand")
        private String motorBrand;

        @NameInMap("MotorClass")
        private String motorClass;

        @NameInMap("MotorColor")
        private String motorColor;

        @NameInMap("MotorId")
        private String motorId;

        @NameInMap("MotorModel")
        private String motorModel;

        @NameInMap("MotorStyle")
        private String motorStyle;

        @NameInMap("PicUrlPath")
        private String picUrlPath;

        @NameInMap("PlateClass")
        private String plateClass;

        @NameInMap("PlateColor")
        private String plateColor;

        @NameInMap("PlateNumber")
        private String plateNumber;

        @NameInMap("RightBottomX")
        private Float rightBottomX;

        @NameInMap("RightBottomY")
        private Float rightBottomY;

        @NameInMap("SafetyBelt")
        private String safetyBelt;

        @NameInMap("ShotTime")
        private String shotTime;

        @NameInMap("SourceId")
        private String sourceId;

        @NameInMap("TargetPicUrlPath")
        private String targetPicUrlPath;

        private Records(Builder builder) {
            this.calling = builder.calling;
            this.corpId = builder.corpId;
            this.dataSourceId = builder.dataSourceId;
            this.leftTopX = builder.leftTopX;
            this.leftTopY = builder.leftTopY;
            this.motorBrand = builder.motorBrand;
            this.motorClass = builder.motorClass;
            this.motorColor = builder.motorColor;
            this.motorId = builder.motorId;
            this.motorModel = builder.motorModel;
            this.motorStyle = builder.motorStyle;
            this.picUrlPath = builder.picUrlPath;
            this.plateClass = builder.plateClass;
            this.plateColor = builder.plateColor;
            this.plateNumber = builder.plateNumber;
            this.rightBottomX = builder.rightBottomX;
            this.rightBottomY = builder.rightBottomY;
            this.safetyBelt = builder.safetyBelt;
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
         * @return calling
         */
        public String getCalling() {
            return this.calling;
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
         * @return motorBrand
         */
        public String getMotorBrand() {
            return this.motorBrand;
        }

        /**
         * @return motorClass
         */
        public String getMotorClass() {
            return this.motorClass;
        }

        /**
         * @return motorColor
         */
        public String getMotorColor() {
            return this.motorColor;
        }

        /**
         * @return motorId
         */
        public String getMotorId() {
            return this.motorId;
        }

        /**
         * @return motorModel
         */
        public String getMotorModel() {
            return this.motorModel;
        }

        /**
         * @return motorStyle
         */
        public String getMotorStyle() {
            return this.motorStyle;
        }

        /**
         * @return picUrlPath
         */
        public String getPicUrlPath() {
            return this.picUrlPath;
        }

        /**
         * @return plateClass
         */
        public String getPlateClass() {
            return this.plateClass;
        }

        /**
         * @return plateColor
         */
        public String getPlateColor() {
            return this.plateColor;
        }

        /**
         * @return plateNumber
         */
        public String getPlateNumber() {
            return this.plateNumber;
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
         * @return safetyBelt
         */
        public String getSafetyBelt() {
            return this.safetyBelt;
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
            private String calling; 
            private String corpId; 
            private String dataSourceId; 
            private Float leftTopX; 
            private Float leftTopY; 
            private String motorBrand; 
            private String motorClass; 
            private String motorColor; 
            private String motorId; 
            private String motorModel; 
            private String motorStyle; 
            private String picUrlPath; 
            private String plateClass; 
            private String plateColor; 
            private String plateNumber; 
            private Float rightBottomX; 
            private Float rightBottomY; 
            private String safetyBelt; 
            private String shotTime; 
            private String sourceId; 
            private String targetPicUrlPath; 

            /**
             * Calling.
             */
            public Builder calling(String calling) {
                this.calling = calling;
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
             * MotorBrand.
             */
            public Builder motorBrand(String motorBrand) {
                this.motorBrand = motorBrand;
                return this;
            }

            /**
             * MotorClass.
             */
            public Builder motorClass(String motorClass) {
                this.motorClass = motorClass;
                return this;
            }

            /**
             * MotorColor.
             */
            public Builder motorColor(String motorColor) {
                this.motorColor = motorColor;
                return this;
            }

            /**
             * MotorId.
             */
            public Builder motorId(String motorId) {
                this.motorId = motorId;
                return this;
            }

            /**
             * MotorModel.
             */
            public Builder motorModel(String motorModel) {
                this.motorModel = motorModel;
                return this;
            }

            /**
             * MotorStyle.
             */
            public Builder motorStyle(String motorStyle) {
                this.motorStyle = motorStyle;
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
             * PlateClass.
             */
            public Builder plateClass(String plateClass) {
                this.plateClass = plateClass;
                return this;
            }

            /**
             * PlateColor.
             */
            public Builder plateColor(String plateColor) {
                this.plateColor = plateColor;
                return this;
            }

            /**
             * PlateNumber.
             */
            public Builder plateNumber(String plateNumber) {
                this.plateNumber = plateNumber;
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
             * SafetyBelt.
             */
            public Builder safetyBelt(String safetyBelt) {
                this.safetyBelt = safetyBelt;
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
