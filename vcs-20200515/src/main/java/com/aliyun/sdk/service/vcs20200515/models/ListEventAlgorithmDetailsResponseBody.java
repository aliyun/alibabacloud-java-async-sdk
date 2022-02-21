// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEventAlgorithmDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventAlgorithmDetailsResponseBody</p>
 */
public class ListEventAlgorithmDetailsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListEventAlgorithmDetailsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventAlgorithmDetailsResponseBody create() {
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private String success; 
        private Integer totalCount; 

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
        public Builder data(java.util.List < Data> data) {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEventAlgorithmDetailsResponseBody build() {
            return new ListEventAlgorithmDetailsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CorpId")
        private String corpId;

        @NameInMap("DataSourceId")
        private String dataSourceId;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("EventValue")
        private String eventValue;

        @NameInMap("ExtendValue")
        private String extendValue;

        @NameInMap("ExtraExtendValue")
        private String extraExtendValue;

        @NameInMap("FaceCount")
        private String faceCount;

        @NameInMap("LeftTopX")
        private String leftTopX;

        @NameInMap("LeftTopY")
        private String leftTopY;

        @NameInMap("PicUrlPath")
        private String picUrlPath;

        @NameInMap("PointX")
        private String pointX;

        @NameInMap("PointY")
        private String pointY;

        @NameInMap("RecordId")
        private String recordId;

        @NameInMap("RightBottomX")
        private String rightBottomX;

        @NameInMap("RightBottomY")
        private String rightBottomY;

        @NameInMap("ShotTime")
        private String shotTime;

        @NameInMap("SourceId")
        private String sourceId;

        @NameInMap("TagCode")
        private String tagCode;

        @NameInMap("TagCodeReliability")
        private String tagCodeReliability;

        @NameInMap("TargetPicUrlPath")
        private String targetPicUrlPath;

        @NameInMap("UuidCode")
        private String uuidCode;

        private Data(Builder builder) {
            this.corpId = builder.corpId;
            this.dataSourceId = builder.dataSourceId;
            this.eventType = builder.eventType;
            this.eventValue = builder.eventValue;
            this.extendValue = builder.extendValue;
            this.extraExtendValue = builder.extraExtendValue;
            this.faceCount = builder.faceCount;
            this.leftTopX = builder.leftTopX;
            this.leftTopY = builder.leftTopY;
            this.picUrlPath = builder.picUrlPath;
            this.pointX = builder.pointX;
            this.pointY = builder.pointY;
            this.recordId = builder.recordId;
            this.rightBottomX = builder.rightBottomX;
            this.rightBottomY = builder.rightBottomY;
            this.shotTime = builder.shotTime;
            this.sourceId = builder.sourceId;
            this.tagCode = builder.tagCode;
            this.tagCodeReliability = builder.tagCodeReliability;
            this.targetPicUrlPath = builder.targetPicUrlPath;
            this.uuidCode = builder.uuidCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return eventValue
         */
        public String getEventValue() {
            return this.eventValue;
        }

        /**
         * @return extendValue
         */
        public String getExtendValue() {
            return this.extendValue;
        }

        /**
         * @return extraExtendValue
         */
        public String getExtraExtendValue() {
            return this.extraExtendValue;
        }

        /**
         * @return faceCount
         */
        public String getFaceCount() {
            return this.faceCount;
        }

        /**
         * @return leftTopX
         */
        public String getLeftTopX() {
            return this.leftTopX;
        }

        /**
         * @return leftTopY
         */
        public String getLeftTopY() {
            return this.leftTopY;
        }

        /**
         * @return picUrlPath
         */
        public String getPicUrlPath() {
            return this.picUrlPath;
        }

        /**
         * @return pointX
         */
        public String getPointX() {
            return this.pointX;
        }

        /**
         * @return pointY
         */
        public String getPointY() {
            return this.pointY;
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
        }

        /**
         * @return rightBottomX
         */
        public String getRightBottomX() {
            return this.rightBottomX;
        }

        /**
         * @return rightBottomY
         */
        public String getRightBottomY() {
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
         * @return tagCode
         */
        public String getTagCode() {
            return this.tagCode;
        }

        /**
         * @return tagCodeReliability
         */
        public String getTagCodeReliability() {
            return this.tagCodeReliability;
        }

        /**
         * @return targetPicUrlPath
         */
        public String getTargetPicUrlPath() {
            return this.targetPicUrlPath;
        }

        /**
         * @return uuidCode
         */
        public String getUuidCode() {
            return this.uuidCode;
        }

        public static final class Builder {
            private String corpId; 
            private String dataSourceId; 
            private String eventType; 
            private String eventValue; 
            private String extendValue; 
            private String extraExtendValue; 
            private String faceCount; 
            private String leftTopX; 
            private String leftTopY; 
            private String picUrlPath; 
            private String pointX; 
            private String pointY; 
            private String recordId; 
            private String rightBottomX; 
            private String rightBottomY; 
            private String shotTime; 
            private String sourceId; 
            private String tagCode; 
            private String tagCodeReliability; 
            private String targetPicUrlPath; 
            private String uuidCode; 

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
             * EventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * EventValue.
             */
            public Builder eventValue(String eventValue) {
                this.eventValue = eventValue;
                return this;
            }

            /**
             * ExtendValue.
             */
            public Builder extendValue(String extendValue) {
                this.extendValue = extendValue;
                return this;
            }

            /**
             * ExtraExtendValue.
             */
            public Builder extraExtendValue(String extraExtendValue) {
                this.extraExtendValue = extraExtendValue;
                return this;
            }

            /**
             * FaceCount.
             */
            public Builder faceCount(String faceCount) {
                this.faceCount = faceCount;
                return this;
            }

            /**
             * LeftTopX.
             */
            public Builder leftTopX(String leftTopX) {
                this.leftTopX = leftTopX;
                return this;
            }

            /**
             * LeftTopY.
             */
            public Builder leftTopY(String leftTopY) {
                this.leftTopY = leftTopY;
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
             * PointX.
             */
            public Builder pointX(String pointX) {
                this.pointX = pointX;
                return this;
            }

            /**
             * PointY.
             */
            public Builder pointY(String pointY) {
                this.pointY = pointY;
                return this;
            }

            /**
             * RecordId.
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * RightBottomX.
             */
            public Builder rightBottomX(String rightBottomX) {
                this.rightBottomX = rightBottomX;
                return this;
            }

            /**
             * RightBottomY.
             */
            public Builder rightBottomY(String rightBottomY) {
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
             * TagCode.
             */
            public Builder tagCode(String tagCode) {
                this.tagCode = tagCode;
                return this;
            }

            /**
             * TagCodeReliability.
             */
            public Builder tagCodeReliability(String tagCodeReliability) {
                this.tagCodeReliability = tagCodeReliability;
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
             * UuidCode.
             */
            public Builder uuidCode(String uuidCode) {
                this.uuidCode = uuidCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
