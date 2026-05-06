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
 * {@link GetSampleDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetSampleDetailResponseBody</p>
 */
public class GetSampleDetailResponseBody extends TeaModel {
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

    private GetSampleDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSampleDetailResponseBody create() {
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

        private Builder(GetSampleDetailResponseBody model) {
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

        public GetSampleDetailResponseBody build() {
            return new GetSampleDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSampleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSampleDetailResponseBody</p>
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
     * {@link GetSampleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSampleDetailResponseBody</p>
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
     * {@link GetSampleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSampleDetailResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnStats")
        private java.util.List<ColumnStats> columnStats;

        @com.aliyun.core.annotation.NameInMap("DateType")
        private String dateType;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Integer fileSize;

        @com.aliyun.core.annotation.NameInMap("PreviewData")
        private PreviewData previewData;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("RowCount")
        private Integer rowCount;

        @com.aliyun.core.annotation.NameInMap("SampleId")
        private Integer sampleId;

        @com.aliyun.core.annotation.NameInMap("SampleName")
        private String sampleName;

        @com.aliyun.core.annotation.NameInMap("Tab")
        private String tab;

        @com.aliyun.core.annotation.NameInMap("UploadTime")
        private String uploadTime;

        @com.aliyun.core.annotation.NameInMap("UploadUserName")
        private String uploadUserName;

        private ResultObject(Builder builder) {
            this.columnStats = builder.columnStats;
            this.dateType = builder.dateType;
            this.downloadUrl = builder.downloadUrl;
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.previewData = builder.previewData;
            this.remark = builder.remark;
            this.rowCount = builder.rowCount;
            this.sampleId = builder.sampleId;
            this.sampleName = builder.sampleName;
            this.tab = builder.tab;
            this.uploadTime = builder.uploadTime;
            this.uploadUserName = builder.uploadUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
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
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
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
         * @return previewData
         */
        public PreviewData getPreviewData() {
            return this.previewData;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return rowCount
         */
        public Integer getRowCount() {
            return this.rowCount;
        }

        /**
         * @return sampleId
         */
        public Integer getSampleId() {
            return this.sampleId;
        }

        /**
         * @return sampleName
         */
        public String getSampleName() {
            return this.sampleName;
        }

        /**
         * @return tab
         */
        public String getTab() {
            return this.tab;
        }

        /**
         * @return uploadTime
         */
        public String getUploadTime() {
            return this.uploadTime;
        }

        /**
         * @return uploadUserName
         */
        public String getUploadUserName() {
            return this.uploadUserName;
        }

        public static final class Builder {
            private java.util.List<ColumnStats> columnStats; 
            private String dateType; 
            private String downloadUrl; 
            private String fileName; 
            private Integer fileSize; 
            private PreviewData previewData; 
            private String remark; 
            private Integer rowCount; 
            private Integer sampleId; 
            private String sampleName; 
            private String tab; 
            private String uploadTime; 
            private String uploadUserName; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.columnStats = model.columnStats;
                this.dateType = model.dateType;
                this.downloadUrl = model.downloadUrl;
                this.fileName = model.fileName;
                this.fileSize = model.fileSize;
                this.previewData = model.previewData;
                this.remark = model.remark;
                this.rowCount = model.rowCount;
                this.sampleId = model.sampleId;
                this.sampleName = model.sampleName;
                this.tab = model.tab;
                this.uploadTime = model.uploadTime;
                this.uploadUserName = model.uploadUserName;
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
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
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
             * PreviewData.
             */
            public Builder previewData(PreviewData previewData) {
                this.previewData = previewData;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * RowCount.
             */
            public Builder rowCount(Integer rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            /**
             * SampleId.
             */
            public Builder sampleId(Integer sampleId) {
                this.sampleId = sampleId;
                return this;
            }

            /**
             * SampleName.
             */
            public Builder sampleName(String sampleName) {
                this.sampleName = sampleName;
                return this;
            }

            /**
             * Tab.
             */
            public Builder tab(String tab) {
                this.tab = tab;
                return this;
            }

            /**
             * UploadTime.
             */
            public Builder uploadTime(String uploadTime) {
                this.uploadTime = uploadTime;
                return this;
            }

            /**
             * UploadUserName.
             */
            public Builder uploadUserName(String uploadUserName) {
                this.uploadUserName = uploadUserName;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
