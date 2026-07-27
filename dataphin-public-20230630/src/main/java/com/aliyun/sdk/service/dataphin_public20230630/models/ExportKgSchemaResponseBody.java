// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ExportKgSchemaResponseBody} extends {@link TeaModel}
 *
 * <p>ExportKgSchemaResponseBody</p>
 */
public class ExportKgSchemaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SchemaInfo")
    private SchemaInfo schemaInfo;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ExportKgSchemaResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.schemaInfo = builder.schemaInfo;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportKgSchemaResponseBody create() {
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
    public Integer getHttpStatusCode() {
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
     * @return schemaInfo
     */
    public SchemaInfo getSchemaInfo() {
        return this.schemaInfo;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private SchemaInfo schemaInfo; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ExportKgSchemaResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.schemaInfo = model.schemaInfo;
            this.success = model.success;
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
        public Builder httpStatusCode(Integer httpStatusCode) {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SchemaInfo.
         */
        public Builder schemaInfo(SchemaInfo schemaInfo) {
            this.schemaInfo = schemaInfo;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ExportKgSchemaResponseBody build() {
            return new ExportKgSchemaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExportKgSchemaResponseBody} extends {@link TeaModel}
     *
     * <p>ExportKgSchemaResponseBody</p>
     */
    public static class SchemaInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("OutputFormat")
        private String outputFormat;

        private SchemaInfo(Builder builder) {
            this.content = builder.content;
            this.outputFormat = builder.outputFormat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemaInfo create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return outputFormat
         */
        public String getOutputFormat() {
            return this.outputFormat;
        }

        public static final class Builder {
            private String content; 
            private String outputFormat; 

            private Builder() {
            } 

            private Builder(SchemaInfo model) {
                this.content = model.content;
                this.outputFormat = model.outputFormat;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * OutputFormat.
             */
            public Builder outputFormat(String outputFormat) {
                this.outputFormat = outputFormat;
                return this;
            }

            public SchemaInfo build() {
                return new SchemaInfo(this);
            } 

        } 

    }
}
