// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link AnalyzeSQLLineageResponseBody} extends {@link TeaModel}
 *
 * <p>AnalyzeSQLLineageResponseBody</p>
 */
public class AnalyzeSQLLineageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("LineageResult")
    private LineageResult lineageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Returned data set of SQL lineage.</p>
         */
        public Builder lineageResult(LineageResult lineageResult) {
            this.lineageResult = lineageResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4B07137-F6AE-4756-8474-7F92BB6C4E04</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AnalyzeSQLLineageResponseBody build() {
            return new AnalyzeSQLLineageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AnalyzeSQLLineageResponseBody} extends {@link TeaModel}
     *
     * <p>AnalyzeSQLLineageResponseBody</p>
     */
    public static class ProcessDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CalWay")
        private String calWay;

        @com.aliyun.core.annotation.NameInMap("Code")
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
             * <p>The calculating method. Valid values:</p>
             * <ul>
             * <li><strong>DIRECT</strong>: No function or expression is used.</li>
             * <li><strong>EXPR</strong>: A function or expression is used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DIRECT</p>
             */
            public Builder calWay(String calWay) {
                this.calWay = calWay;
                return this;
            }

            /**
             * <p>The SQL code snippet for field processing.</p>
             * 
             * <strong>example:</strong>
             * <p>dmstest.b.id</p>
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
    /**
     * 
     * {@link AnalyzeSQLLineageResponseBody} extends {@link TeaModel}
     *
     * <p>AnalyzeSQLLineageResponseBody</p>
     */
    public static class Lineages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dst")
        private String dst;

        @com.aliyun.core.annotation.NameInMap("LineageType")
        private String lineageType;

        @com.aliyun.core.annotation.NameInMap("OperType")
        private String operType;

        @com.aliyun.core.annotation.NameInMap("ProcessDetail")
        private ProcessDetail processDetail;

        @com.aliyun.core.annotation.NameInMap("Src")
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
             * <p>The target.</p>
             * 
             * <strong>example:</strong>
             * <p>dmstest.a.id</p>
             */
            public Builder dst(String dst) {
                this.dst = dst;
                return this;
            }

            /**
             * <p>The type of the lineage. Valid values:</p>
             * <ul>
             * <li><strong>FIELD_DEPEND_FIELD</strong>: Fields depend on fields.</li>
             * <li><strong>TABLE_DEPEND_TABLE</strong>: Tables depend on tables.</li>
             * <li><strong>FIELD_INFLU_TABLE</strong>: Fields influence tables.</li>
             * <li><strong>FIELD_INFLU_FIELD</strong>: Fields influence fields.</li>
             * <li><strong>FIELD_INFLU_TABLE</strong>: Tables influence fields.</li>
             * <li><strong>FIELD_JOIN_FIELD</strong>: Fields are associated with fields.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FIELD_DEPEND_FIELD</p>
             */
            public Builder lineageType(String lineageType) {
                this.lineageType = lineageType;
                return this;
            }

            /**
             * <p>The operation type of the SQL statement in which the data lineage is generated. For example, if the operation type is SELECT, the data lineage is generated from a SELECT statement.</p>
             * <blockquote>
             * <p> This field is an extended field which has no practical use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SELECT</p>
             */
            public Builder operType(String operType) {
                this.operType = operType;
                return this;
            }

            /**
             * <p>The handling details. This parameter is returned only when LineageType is FIELD_DEPEND_FIELD.</p>
             */
            public Builder processDetail(ProcessDetail processDetail) {
                this.processDetail = processDetail;
                return this;
            }

            /**
             * <p>The source.</p>
             * 
             * <strong>example:</strong>
             * <p>dmstest.b.id</p>
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
    /**
     * 
     * {@link AnalyzeSQLLineageResponseBody} extends {@link TeaModel}
     *
     * <p>AnalyzeSQLLineageResponseBody</p>
     */
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
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
             * <p>The name of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>dmstest.a.id</p>
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
    /**
     * 
     * {@link AnalyzeSQLLineageResponseBody} extends {@link TeaModel}
     *
     * <p>AnalyzeSQLLineageResponseBody</p>
     */
    public static class ObjectMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Fields")
        private java.util.List<Fields> fields;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Type")
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
        public java.util.List<Fields> getFields() {
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
            private java.util.List<Fields> fields; 
            private String name; 
            private String source; 
            private String type; 

            /**
             * <p>The fields in the metatable.</p>
             */
            public Builder fields(java.util.List<Fields> fields) {
                this.fields = fields;
                return this;
            }

            /**
             * <p>The object name.</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The source of metadata. Valid values:</p>
             * <ul>
             * <li><strong>DDL</strong>: The metadata comes from parsed SQL statements or definition of databases and tables collected by DMS.</li>
             * <li><strong>LINEAGE</strong>: The metadata comes from lineage analysis results.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DDL</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The object type. Valid values:</p>
             * <ul>
             * <li><strong>TABLE</strong></li>
             * <li><strong>VIEW</strong></li>
             * <li><strong>TMP_TABLE</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TABLE</p>
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
    /**
     * 
     * {@link AnalyzeSQLLineageResponseBody} extends {@link TeaModel}
     *
     * <p>AnalyzeSQLLineageResponseBody</p>
     */
    public static class LineageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Lineages")
        private java.util.List<Lineages> lineages;

        @com.aliyun.core.annotation.NameInMap("ObjectMetadata")
        private java.util.List<ObjectMetadata> objectMetadata;

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
        public java.util.List<Lineages> getLineages() {
            return this.lineages;
        }

        /**
         * @return objectMetadata
         */
        public java.util.List<ObjectMetadata> getObjectMetadata() {
            return this.objectMetadata;
        }

        public static final class Builder {
            private java.util.List<Lineages> lineages; 
            private java.util.List<ObjectMetadata> objectMetadata; 

            /**
             * <p>The details about the lineage.</p>
             */
            public Builder lineages(java.util.List<Lineages> lineages) {
                this.lineages = lineages;
                return this;
            }

            /**
             * <p>The table and field metadata information.</p>
             */
            public Builder objectMetadata(java.util.List<ObjectMetadata> objectMetadata) {
                this.objectMetadata = objectMetadata;
                return this;
            }

            public LineageResult build() {
                return new LineageResult(this);
            } 

        } 

    }
}
