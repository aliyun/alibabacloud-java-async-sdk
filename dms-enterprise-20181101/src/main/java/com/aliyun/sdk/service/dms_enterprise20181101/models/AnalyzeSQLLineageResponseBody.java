// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AnalyzeSQLLineageResponseBody} extends {@link TeaModel}
 *
 * <p>AnalyzeSQLLineageResponseBody</p>
 */
public class AnalyzeSQLLineageResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("LineageResult")
    private LineageResult lineageResult;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private AnalyzeSQLLineageResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.lineageResult = builder.lineageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AnalyzeSQLLineageResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return lineageResult
     */
    public LineageResult getLineageResult() {
        return this.lineageResult;
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
        private String errorCode; 
        private String errorMessage; 
        private LineageResult lineageResult; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Returned data set of SQL lineage.
         */
        public Builder lineageResult(LineageResult lineageResult) {
            this.lineageResult = lineageResult;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AnalyzeSQLLineageResponseBody build() {
            return new AnalyzeSQLLineageResponseBody(this);
        } 

    } 

    public static class ProcessDetail extends TeaModel {
        @NameInMap("CalWay")
        private String calWay;

        @NameInMap("Code")
        private String code;

        private ProcessDetail(Builder builder) {
            this.calWay = builder.calWay;
            this.code = builder.code;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessDetail create() {
            return builder().build();
        }

        /**
         * @return calWay
         */
        public String getCalWay() {
            return this.calWay;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        public static final class Builder {
            private String calWay; 
            private String code; 

            /**
             * The calculating method. Valid values:
             * <p>
             * 
             * *   **DIRECT**: No function or expression is used.
             * *   **EXPR**: A function or expression is used.
             */
            public Builder calWay(String calWay) {
                this.calWay = calWay;
                return this;
            }

            /**
             * The SQL code snippet for field processing.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            public ProcessDetail build() {
                return new ProcessDetail(this);
            } 

        } 

    }
    public static class Lineages extends TeaModel {
        @NameInMap("Dst")
        private String dst;

        @NameInMap("LineageType")
        private String lineageType;

        @NameInMap("OperType")
        private String operType;

        @NameInMap("ProcessDetail")
        private ProcessDetail processDetail;

        @NameInMap("Src")
        private String src;

        private Lineages(Builder builder) {
            this.dst = builder.dst;
            this.lineageType = builder.lineageType;
            this.operType = builder.operType;
            this.processDetail = builder.processDetail;
            this.src = builder.src;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Lineages create() {
            return builder().build();
        }

        /**
         * @return dst
         */
        public String getDst() {
            return this.dst;
        }

        /**
         * @return lineageType
         */
        public String getLineageType() {
            return this.lineageType;
        }

        /**
         * @return operType
         */
        public String getOperType() {
            return this.operType;
        }

        /**
         * @return processDetail
         */
        public ProcessDetail getProcessDetail() {
            return this.processDetail;
        }

        /**
         * @return src
         */
        public String getSrc() {
            return this.src;
        }

        public static final class Builder {
            private String dst; 
            private String lineageType; 
            private String operType; 
            private ProcessDetail processDetail; 
            private String src; 

            /**
             * The target.
             */
            public Builder dst(String dst) {
                this.dst = dst;
                return this;
            }

            /**
             * The type of the lineage. Valid values:
             * <p>
             * 
             * *   **FIELD_DEPEND_FIELD**: Fields depend on fields.
             * *   **TABLE_DEPEND_TABLE**: Tables depend on tables.
             * *   **FIELD_INFLU_TABLE**: Fields influence tables.
             * *   **FIELD_INFLU_FIELD**: Fields influence fields.
             * *   **FIELD_INFLU_TABLE**: Tables influence fields.
             * *   **FIELD_JOIN_FIELD**: Fields are associated with fields.
             */
            public Builder lineageType(String lineageType) {
                this.lineageType = lineageType;
                return this;
            }

            /**
             * The operation type of the SQL statement in which the data lineage is generated. For example, if the operation type is SELECT, the data lineage is generated from a SELECT statement.
             * <p>
             * 
             * >  This field is an extended field which has no practical use.
             */
            public Builder operType(String operType) {
                this.operType = operType;
                return this;
            }

            /**
             * The handling details. This parameter is returned only when LineageType is FIELD_DEPEND_FIELD.
             */
            public Builder processDetail(ProcessDetail processDetail) {
                this.processDetail = processDetail;
                return this;
            }

            /**
             * The source.
             */
            public Builder src(String src) {
                this.src = src;
                return this;
            }

            public Lineages build() {
                return new Lineages(this);
            } 

        } 

    }
    public static class Fields extends TeaModel {
        @NameInMap("Name")
        private String name;

        private Fields(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            /**
             * The name of the field.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
    public static class ObjectMetadata extends TeaModel {
        @NameInMap("Fields")
        private java.util.List < Fields> fields;

        @NameInMap("Name")
        private String name;

        @NameInMap("Source")
        private String source;

        @NameInMap("Type")
        private String type;

        private ObjectMetadata(Builder builder) {
            this.fields = builder.fields;
            this.name = builder.name;
            this.source = builder.source;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObjectMetadata create() {
            return builder().build();
        }

        /**
         * @return fields
         */
        public java.util.List < Fields> getFields() {
            return this.fields;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < Fields> fields; 
            private String name; 
            private String source; 
            private String type; 

            /**
             * The fields in the metatable.
             */
            public Builder fields(java.util.List < Fields> fields) {
                this.fields = fields;
                return this;
            }

            /**
             * The object name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The source of metadata. Valid values:
             * <p>
             * 
             * *   **DDL**: The metadata comes from parsed SQL statements or definition of databases and tables collected by DMS.
             * *   **LINEAGE**: The metadata comes from lineage analysis results.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The object type. Valid values:
             * <p>
             * 
             * *   **TABLE**
             * *   **VIEW**
             * *   **TMP_TABLE**
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ObjectMetadata build() {
                return new ObjectMetadata(this);
            } 

        } 

    }
    public static class LineageResult extends TeaModel {
        @NameInMap("Lineages")
        private java.util.List < Lineages> lineages;

        @NameInMap("ObjectMetadata")
        private java.util.List < ObjectMetadata> objectMetadata;

        private LineageResult(Builder builder) {
            this.lineages = builder.lineages;
            this.objectMetadata = builder.objectMetadata;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LineageResult create() {
            return builder().build();
        }

        /**
         * @return lineages
         */
        public java.util.List < Lineages> getLineages() {
            return this.lineages;
        }

        /**
         * @return objectMetadata
         */
        public java.util.List < ObjectMetadata> getObjectMetadata() {
            return this.objectMetadata;
        }

        public static final class Builder {
            private java.util.List < Lineages> lineages; 
            private java.util.List < ObjectMetadata> objectMetadata; 

            /**
             * The details about the lineage.
             */
            public Builder lineages(java.util.List < Lineages> lineages) {
                this.lineages = lineages;
                return this;
            }

            /**
             * The table and field metadata information.
             */
            public Builder objectMetadata(java.util.List < ObjectMetadata> objectMetadata) {
                this.objectMetadata = objectMetadata;
                return this;
            }

            public LineageResult build() {
                return new LineageResult(this);
            } 

        } 

    }
}
