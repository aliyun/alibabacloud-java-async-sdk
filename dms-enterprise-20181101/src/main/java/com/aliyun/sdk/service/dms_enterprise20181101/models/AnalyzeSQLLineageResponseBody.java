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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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
         * LineageResult.
         */
        public Builder lineageResult(LineageResult lineageResult) {
            this.lineageResult = lineageResult;
            return this;
        }

        /**
         * Id of the request
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
             * CalWay.
             */
            public Builder calWay(String calWay) {
                this.calWay = calWay;
                return this;
            }

            /**
             * Code.
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
             * Dst.
             */
            public Builder dst(String dst) {
                this.dst = dst;
                return this;
            }

            /**
             * LineageType.
             */
            public Builder lineageType(String lineageType) {
                this.lineageType = lineageType;
                return this;
            }

            /**
             * OperType.
             */
            public Builder operType(String operType) {
                this.operType = operType;
                return this;
            }

            /**
             * ProcessDetail.
             */
            public Builder processDetail(ProcessDetail processDetail) {
                this.processDetail = processDetail;
                return this;
            }

            /**
             * Src.
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
             * Name.
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
             * Fields.
             */
            public Builder fields(java.util.List < Fields> fields) {
                this.fields = fields;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Type.
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
             * Lineages.
             */
            public Builder lineages(java.util.List < Lineages> lineages) {
                this.lineages = lineages;
                return this;
            }

            /**
             * ObjectMetadata.
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
