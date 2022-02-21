// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEventAlgorithmResultsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventAlgorithmResultsResponseBody</p>
 */
public class ListEventAlgorithmResultsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ExtendValue")
    private String extendValue;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListEventAlgorithmResultsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.extendValue = builder.extendValue;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventAlgorithmResultsResponseBody create() {
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
     * @return extendValue
     */
    public String getExtendValue() {
        return this.extendValue;
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
        private String extendValue; 
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
         * ExtendValue.
         */
        public Builder extendValue(String extendValue) {
            this.extendValue = extendValue;
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

        public ListEventAlgorithmResultsResponseBody build() {
            return new ListEventAlgorithmResultsResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("CapStyle")
        private String capStyle;

        @NameInMap("CorpId")
        private String corpId;

        @NameInMap("DataSourceId")
        private String dataSourceId;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("ExtendValue")
        private String extendValue;

        @NameInMap("ExtendValueThree")
        private String extendValueThree;

        @NameInMap("ExtendValueTwo")
        private String extendValueTwo;

        @NameInMap("FaceCount")
        private String faceCount;

        @NameInMap("PicUrlPath")
        private String picUrlPath;

        @NameInMap("RecordId")
        private String recordId;

        @NameInMap("ShotTime")
        private String shotTime;

        @NameInMap("TagCode")
        private String tagCode;

        @NameInMap("TagCodeReliability")
        private String tagCodeReliability;

        @NameInMap("TargetPicUrlPath")
        private String targetPicUrlPath;

        @NameInMap("UuidCode")
        private String uuidCode;

        private Records(Builder builder) {
            this.capStyle = builder.capStyle;
            this.corpId = builder.corpId;
            this.dataSourceId = builder.dataSourceId;
            this.eventType = builder.eventType;
            this.extendValue = builder.extendValue;
            this.extendValueThree = builder.extendValueThree;
            this.extendValueTwo = builder.extendValueTwo;
            this.faceCount = builder.faceCount;
            this.picUrlPath = builder.picUrlPath;
            this.recordId = builder.recordId;
            this.shotTime = builder.shotTime;
            this.tagCode = builder.tagCode;
            this.tagCodeReliability = builder.tagCodeReliability;
            this.targetPicUrlPath = builder.targetPicUrlPath;
            this.uuidCode = builder.uuidCode;
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
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return extendValue
         */
        public String getExtendValue() {
            return this.extendValue;
        }

        /**
         * @return extendValueThree
         */
        public String getExtendValueThree() {
            return this.extendValueThree;
        }

        /**
         * @return extendValueTwo
         */
        public String getExtendValueTwo() {
            return this.extendValueTwo;
        }

        /**
         * @return faceCount
         */
        public String getFaceCount() {
            return this.faceCount;
        }

        /**
         * @return picUrlPath
         */
        public String getPicUrlPath() {
            return this.picUrlPath;
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
        }

        /**
         * @return shotTime
         */
        public String getShotTime() {
            return this.shotTime;
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
            private String capStyle; 
            private String corpId; 
            private String dataSourceId; 
            private String eventType; 
            private String extendValue; 
            private String extendValueThree; 
            private String extendValueTwo; 
            private String faceCount; 
            private String picUrlPath; 
            private String recordId; 
            private String shotTime; 
            private String tagCode; 
            private String tagCodeReliability; 
            private String targetPicUrlPath; 
            private String uuidCode; 

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
             * EventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
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
             * ExtendValueThree.
             */
            public Builder extendValueThree(String extendValueThree) {
                this.extendValueThree = extendValueThree;
                return this;
            }

            /**
             * ExtendValueTwo.
             */
            public Builder extendValueTwo(String extendValueTwo) {
                this.extendValueTwo = extendValueTwo;
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
             * PicUrlPath.
             */
            public Builder picUrlPath(String picUrlPath) {
                this.picUrlPath = picUrlPath;
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
             * ShotTime.
             */
            public Builder shotTime(String shotTime) {
                this.shotTime = shotTime;
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
