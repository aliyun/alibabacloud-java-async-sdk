// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link UploadSampleFileResponseBody} extends {@link TeaModel}
 *
 * <p>UploadSampleFileResponseBody</p>
 */
public class UploadSampleFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private UploadSampleFileResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadSampleFileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String code; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(UploadSampleFileResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        /**
         * ResultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public UploadSampleFileResponseBody build() {
            return new UploadSampleFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UploadSampleFileResponseBody} extends {@link TeaModel}
     *
     * <p>UploadSampleFileResponseBody</p>
     */
    public static class ColumnStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistinctNumber")
        private Integer distinctNumber;

        @com.aliyun.core.annotation.NameInMap("DistinctRate")
        private String distinctRate;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("MissNumber")
        private Integer missNumber;

        @com.aliyun.core.annotation.NameInMap("MissRate")
        private String missRate;

        @com.aliyun.core.annotation.NameInMap("RowNumber")
        private Integer rowNumber;

        private ColumnStats(Builder builder) {
            this.distinctNumber = builder.distinctNumber;
            this.distinctRate = builder.distinctRate;
            this.fieldName = builder.fieldName;
            this.missNumber = builder.missNumber;
            this.missRate = builder.missRate;
            this.rowNumber = builder.rowNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnStats create() {
            return builder().build();
        }

        /**
         * @return distinctNumber
         */
        public Integer getDistinctNumber() {
            return this.distinctNumber;
        }

        /**
         * @return distinctRate
         */
        public String getDistinctRate() {
            return this.distinctRate;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return missNumber
         */
        public Integer getMissNumber() {
            return this.missNumber;
        }

        /**
         * @return missRate
         */
        public String getMissRate() {
            return this.missRate;
        }

        /**
         * @return rowNumber
         */
        public Integer getRowNumber() {
            return this.rowNumber;
        }

        public static final class Builder {
            private Integer distinctNumber; 
            private String distinctRate; 
            private String fieldName; 
            private Integer missNumber; 
            private String missRate; 
            private Integer rowNumber; 

            private Builder() {
            } 

            private Builder(ColumnStats model) {
                this.distinctNumber = model.distinctNumber;
                this.distinctRate = model.distinctRate;
                this.fieldName = model.fieldName;
                this.missNumber = model.missNumber;
                this.missRate = model.missRate;
                this.rowNumber = model.rowNumber;
            } 

            /**
             * DistinctNumber.
             */
            public Builder distinctNumber(Integer distinctNumber) {
                this.distinctNumber = distinctNumber;
                return this;
            }

            /**
             * DistinctRate.
             */
            public Builder distinctRate(String distinctRate) {
                this.distinctRate = distinctRate;
                return this;
            }

            /**
             * FieldName.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * MissNumber.
             */
            public Builder missNumber(Integer missNumber) {
                this.missNumber = missNumber;
                return this;
            }

            /**
             * MissRate.
             */
            public Builder missRate(String missRate) {
                this.missRate = missRate;
                return this;
            }

            /**
             * RowNumber.
             */
            public Builder rowNumber(Integer rowNumber) {
                this.rowNumber = rowNumber;
                return this;
            }

            public ColumnStats build() {
                return new ColumnStats(this);
            } 

        } 

    }
    /**
     * 
     * {@link UploadSampleFileResponseBody} extends {@link TeaModel}
     *
     * <p>UploadSampleFileResponseBody</p>
     */
    public static class PreviewData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Headers")
        private java.util.List<String> headers;

        @com.aliyun.core.annotation.NameInMap("Rows")
        private java.util.List<java.util.List<String>> rows;

        private PreviewData(Builder builder) {
            this.headers = builder.headers;
            this.rows = builder.rows;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreviewData create() {
            return builder().build();
        }

        /**
         * @return headers
         */
        public java.util.List<String> getHeaders() {
            return this.headers;
        }

        /**
         * @return rows
         */
        public java.util.List<java.util.List<String>> getRows() {
            return this.rows;
        }

        public static final class Builder {
            private java.util.List<String> headers; 
            private java.util.List<java.util.List<String>> rows; 

            private Builder() {
            } 

            private Builder(PreviewData model) {
                this.headers = model.headers;
                this.rows = model.rows;
            } 

            /**
             * Headers.
             */
            public Builder headers(java.util.List<String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * Rows.
             */
            public Builder rows(java.util.List<java.util.List<String>> rows) {
                this.rows = rows;
                return this;
            }

            public PreviewData build() {
                return new PreviewData(this);
            } 

        } 

    }
    /**
     * 
     * {@link UploadSampleFileResponseBody} extends {@link TeaModel}
     *
     * <p>UploadSampleFileResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeyondBacktrackingPeriodNum")
        private Integer beyondBacktrackingPeriodNum;

        @com.aliyun.core.annotation.NameInMap("ColumnStats")
        private java.util.List<ColumnStats> columnStats;

        @com.aliyun.core.annotation.NameInMap("DateType")
        private String dateType;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Integer fileSize;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("NotExistScenes")
        private java.util.List<String> notExistScenes;

        @com.aliyun.core.annotation.NameInMap("PhoneInvalidList")
        private java.util.List<String> phoneInvalidList;

        @com.aliyun.core.annotation.NameInMap("PreviewData")
        private PreviewData previewData;

        @com.aliyun.core.annotation.NameInMap("RowCount")
        private Integer rowCount;

        private ResultObject(Builder builder) {
            this.beyondBacktrackingPeriodNum = builder.beyondBacktrackingPeriodNum;
            this.columnStats = builder.columnStats;
            this.dateType = builder.dateType;
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.fileUrl = builder.fileUrl;
            this.notExistScenes = builder.notExistScenes;
            this.phoneInvalidList = builder.phoneInvalidList;
            this.previewData = builder.previewData;
            this.rowCount = builder.rowCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return beyondBacktrackingPeriodNum
         */
        public Integer getBeyondBacktrackingPeriodNum() {
            return this.beyondBacktrackingPeriodNum;
        }

        /**
         * @return columnStats
         */
        public java.util.List<ColumnStats> getColumnStats() {
            return this.columnStats;
        }

        /**
         * @return dateType
         */
        public String getDateType() {
            return this.dateType;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileSize
         */
        public Integer getFileSize() {
            return this.fileSize;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return notExistScenes
         */
        public java.util.List<String> getNotExistScenes() {
            return this.notExistScenes;
        }

        /**
         * @return phoneInvalidList
         */
        public java.util.List<String> getPhoneInvalidList() {
            return this.phoneInvalidList;
        }

        /**
         * @return previewData
         */
        public PreviewData getPreviewData() {
            return this.previewData;
        }

        /**
         * @return rowCount
         */
        public Integer getRowCount() {
            return this.rowCount;
        }

        public static final class Builder {
            private Integer beyondBacktrackingPeriodNum; 
            private java.util.List<ColumnStats> columnStats; 
            private String dateType; 
            private String fileName; 
            private Integer fileSize; 
            private String fileUrl; 
            private java.util.List<String> notExistScenes; 
            private java.util.List<String> phoneInvalidList; 
            private PreviewData previewData; 
            private Integer rowCount; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.beyondBacktrackingPeriodNum = model.beyondBacktrackingPeriodNum;
                this.columnStats = model.columnStats;
                this.dateType = model.dateType;
                this.fileName = model.fileName;
                this.fileSize = model.fileSize;
                this.fileUrl = model.fileUrl;
                this.notExistScenes = model.notExistScenes;
                this.phoneInvalidList = model.phoneInvalidList;
                this.previewData = model.previewData;
                this.rowCount = model.rowCount;
            } 

            /**
             * BeyondBacktrackingPeriodNum.
             */
            public Builder beyondBacktrackingPeriodNum(Integer beyondBacktrackingPeriodNum) {
                this.beyondBacktrackingPeriodNum = beyondBacktrackingPeriodNum;
                return this;
            }

            /**
             * ColumnStats.
             */
            public Builder columnStats(java.util.List<ColumnStats> columnStats) {
                this.columnStats = columnStats;
                return this;
            }

            /**
             * DateType.
             */
            public Builder dateType(String dateType) {
                this.dateType = dateType;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(Integer fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * NotExistScenes.
             */
            public Builder notExistScenes(java.util.List<String> notExistScenes) {
                this.notExistScenes = notExistScenes;
                return this;
            }

            /**
             * PhoneInvalidList.
             */
            public Builder phoneInvalidList(java.util.List<String> phoneInvalidList) {
                this.phoneInvalidList = phoneInvalidList;
                return this;
            }

            /**
             * PreviewData.
             */
            public Builder previewData(PreviewData previewData) {
                this.previewData = previewData;
                return this;
            }

            /**
             * RowCount.
             */
            public Builder rowCount(Integer rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
