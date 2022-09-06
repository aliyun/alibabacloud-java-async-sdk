// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDownloadFileResponseBody} extends {@link TeaModel}
 *
 * <p>GetDownloadFileResponseBody</p>
 */
public class GetDownloadFileResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetDownloadFileResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDownloadFileResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDownloadFileResponseBody build() {
            return new GetDownloadFileResponseBody(this);
        } 

    } 

    public static class DataHeader extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("DimDateClass")
        private String dimDateClass;

        @NameInMap("FieldName")
        private String fieldName;

        @NameInMap("FieldType")
        private String fieldType;

        @NameInMap("GeoClass")
        private String geoClass;

        @NameInMap("TimeClass")
        private String timeClass;

        @NameInMap("TypeClass")
        private String typeClass;

        private DataHeader(Builder builder) {
            this.alias = builder.alias;
            this.dimDateClass = builder.dimDateClass;
            this.fieldName = builder.fieldName;
            this.fieldType = builder.fieldType;
            this.geoClass = builder.geoClass;
            this.timeClass = builder.timeClass;
            this.typeClass = builder.typeClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataHeader create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return dimDateClass
         */
        public String getDimDateClass() {
            return this.dimDateClass;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return geoClass
         */
        public String getGeoClass() {
            return this.geoClass;
        }

        /**
         * @return timeClass
         */
        public String getTimeClass() {
            return this.timeClass;
        }

        /**
         * @return typeClass
         */
        public String getTypeClass() {
            return this.typeClass;
        }

        public static final class Builder {
            private String alias; 
            private String dimDateClass; 
            private String fieldName; 
            private String fieldType; 
            private String geoClass; 
            private String timeClass; 
            private String typeClass; 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * DimDateClass.
             */
            public Builder dimDateClass(String dimDateClass) {
                this.dimDateClass = dimDateClass;
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
             * FieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * GeoClass.
             */
            public Builder geoClass(String geoClass) {
                this.geoClass = geoClass;
                return this;
            }

            /**
             * TimeClass.
             */
            public Builder timeClass(String timeClass) {
                this.timeClass = timeClass;
                return this;
            }

            /**
             * TypeClass.
             */
            public Builder typeClass(String typeClass) {
                this.typeClass = typeClass;
                return this;
            }

            public DataHeader build() {
                return new DataHeader(this);
            } 

        } 

    }
    public static class AstExpr extends TeaModel {
        @NameInMap("Expr")
        private String expr;

        @NameInMap("ExprType")
        private String exprType;

        private AstExpr(Builder builder) {
            this.expr = builder.expr;
            this.exprType = builder.exprType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AstExpr create() {
            return builder().build();
        }

        /**
         * @return expr
         */
        public String getExpr() {
            return this.expr;
        }

        /**
         * @return exprType
         */
        public String getExprType() {
            return this.exprType;
        }

        public static final class Builder {
            private String expr; 
            private String exprType; 

            /**
             * Expr.
             */
            public Builder expr(String expr) {
                this.expr = expr;
                return this;
            }

            /**
             * ExprType.
             */
            public Builder exprType(String exprType) {
                this.exprType = exprType;
                return this;
            }

            public AstExpr build() {
                return new AstExpr(this);
            } 

        } 

    }
    public static class SelectedHeaders extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("DimDateClass")
        private String dimDateClass;

        @NameInMap("FieldName")
        private String fieldName;

        @NameInMap("FieldType")
        private String fieldType;

        @NameInMap("GeoClass")
        private String geoClass;

        @NameInMap("TimeClass")
        private String timeClass;

        private SelectedHeaders(Builder builder) {
            this.alias = builder.alias;
            this.dimDateClass = builder.dimDateClass;
            this.fieldName = builder.fieldName;
            this.fieldType = builder.fieldType;
            this.geoClass = builder.geoClass;
            this.timeClass = builder.timeClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelectedHeaders create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return dimDateClass
         */
        public String getDimDateClass() {
            return this.dimDateClass;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return geoClass
         */
        public String getGeoClass() {
            return this.geoClass;
        }

        /**
         * @return timeClass
         */
        public String getTimeClass() {
            return this.timeClass;
        }

        public static final class Builder {
            private String alias; 
            private String dimDateClass; 
            private String fieldName; 
            private String fieldType; 
            private String geoClass; 
            private String timeClass; 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * DimDateClass.
             */
            public Builder dimDateClass(String dimDateClass) {
                this.dimDateClass = dimDateClass;
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
             * FieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * GeoClass.
             */
            public Builder geoClass(String geoClass) {
                this.geoClass = geoClass;
                return this;
            }

            /**
             * TimeClass.
             */
            public Builder timeClass(String timeClass) {
                this.timeClass = timeClass;
                return this;
            }

            public SelectedHeaders build() {
                return new SelectedHeaders(this);
            } 

        } 

    }
    public static class QuerySetting extends TeaModel {
        @NameInMap("AstExpr")
        private java.util.List < AstExpr> astExpr;

        @NameInMap("SelectedHeaders")
        private java.util.List < SelectedHeaders> selectedHeaders;

        private QuerySetting(Builder builder) {
            this.astExpr = builder.astExpr;
            this.selectedHeaders = builder.selectedHeaders;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuerySetting create() {
            return builder().build();
        }

        /**
         * @return astExpr
         */
        public java.util.List < AstExpr> getAstExpr() {
            return this.astExpr;
        }

        /**
         * @return selectedHeaders
         */
        public java.util.List < SelectedHeaders> getSelectedHeaders() {
            return this.selectedHeaders;
        }

        public static final class Builder {
            private java.util.List < AstExpr> astExpr; 
            private java.util.List < SelectedHeaders> selectedHeaders; 

            /**
             * AstExpr.
             */
            public Builder astExpr(java.util.List < AstExpr> astExpr) {
                this.astExpr = astExpr;
                return this;
            }

            /**
             * SelectedHeaders.
             */
            public Builder selectedHeaders(java.util.List < SelectedHeaders> selectedHeaders) {
                this.selectedHeaders = selectedHeaders;
                return this;
            }

            public QuerySetting build() {
                return new QuerySetting(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AsyncExecute")
        private Boolean asyncExecute;

        @NameInMap("BeginTime")
        private Long beginTime;

        @NameInMap("CsvFileName")
        private String csvFileName;

        @NameInMap("CsvUrl")
        private String csvUrl;

        @NameInMap("DatasetId")
        private String datasetId;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Header")
        private java.util.List < DataHeader> header;

        @NameInMap("LongJobId")
        private String longJobId;

        @NameInMap("PageNo")
        private Integer pageNo;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("PreviewSize")
        private Integer previewSize;

        @NameInMap("QuerySetting")
        private QuerySetting querySetting;

        @NameInMap("Result")
        private java.util.List < java.util.Map<String, ?>> result;

        @NameInMap("ResultDataInString")
        private String resultDataInString;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.asyncExecute = builder.asyncExecute;
            this.beginTime = builder.beginTime;
            this.csvFileName = builder.csvFileName;
            this.csvUrl = builder.csvUrl;
            this.datasetId = builder.datasetId;
            this.endTime = builder.endTime;
            this.header = builder.header;
            this.longJobId = builder.longJobId;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.previewSize = builder.previewSize;
            this.querySetting = builder.querySetting;
            this.result = builder.result;
            this.resultDataInString = builder.resultDataInString;
            this.status = builder.status;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return asyncExecute
         */
        public Boolean getAsyncExecute() {
            return this.asyncExecute;
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return csvFileName
         */
        public String getCsvFileName() {
            return this.csvFileName;
        }

        /**
         * @return csvUrl
         */
        public String getCsvUrl() {
            return this.csvUrl;
        }

        /**
         * @return datasetId
         */
        public String getDatasetId() {
            return this.datasetId;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return header
         */
        public java.util.List < DataHeader> getHeader() {
            return this.header;
        }

        /**
         * @return longJobId
         */
        public String getLongJobId() {
            return this.longJobId;
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
         * @return previewSize
         */
        public Integer getPreviewSize() {
            return this.previewSize;
        }

        /**
         * @return querySetting
         */
        public QuerySetting getQuerySetting() {
            return this.querySetting;
        }

        /**
         * @return result
         */
        public java.util.List < java.util.Map<String, ?>> getResult() {
            return this.result;
        }

        /**
         * @return resultDataInString
         */
        public String getResultDataInString() {
            return this.resultDataInString;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Boolean asyncExecute; 
            private Long beginTime; 
            private String csvFileName; 
            private String csvUrl; 
            private String datasetId; 
            private Long endTime; 
            private java.util.List < DataHeader> header; 
            private String longJobId; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Integer previewSize; 
            private QuerySetting querySetting; 
            private java.util.List < java.util.Map<String, ?>> result; 
            private String resultDataInString; 
            private Integer status; 
            private Long totalCount; 

            /**
             * AsyncExecute.
             */
            public Builder asyncExecute(Boolean asyncExecute) {
                this.asyncExecute = asyncExecute;
                return this;
            }

            /**
             * BeginTime.
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * CsvFileName.
             */
            public Builder csvFileName(String csvFileName) {
                this.csvFileName = csvFileName;
                return this;
            }

            /**
             * CsvUrl.
             */
            public Builder csvUrl(String csvUrl) {
                this.csvUrl = csvUrl;
                return this;
            }

            /**
             * DatasetId.
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Header.
             */
            public Builder header(java.util.List < DataHeader> header) {
                this.header = header;
                return this;
            }

            /**
             * LongJobId.
             */
            public Builder longJobId(String longJobId) {
                this.longJobId = longJobId;
                return this;
            }

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
             * PreviewSize.
             */
            public Builder previewSize(Integer previewSize) {
                this.previewSize = previewSize;
                return this;
            }

            /**
             * QuerySetting.
             */
            public Builder querySetting(QuerySetting querySetting) {
                this.querySetting = querySetting;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(java.util.List < java.util.Map<String, ?>> result) {
                this.result = result;
                return this;
            }

            /**
             * ResultDataInString.
             */
            public Builder resultDataInString(String resultDataInString) {
                this.resultDataInString = resultDataInString;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
