// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link GetParseSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>GetParseSettingsResponseBody</p>
 */
public class GetParseSettingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetParseSettingsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetParseSettingsResponseBody create() {
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
     * @return data
     */
    public java.util.List<Data> getData() {
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetParseSettingsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data fields.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace id is null or invalid.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>35A267BF-xxxx-54DB-8394-AA3B0742D833</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetParseSettingsResponseBody build() {
            return new GetParseSettingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetParseSettingsResponseBody} extends {@link TeaModel}
     *
     * <p>GetParseSettingsResponseBody</p>
     */
    public static class ParserConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("ModelPrompt")
        private String modelPrompt;

        private ParserConfig(Builder builder) {
            this.modelName = builder.modelName;
            this.modelPrompt = builder.modelPrompt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParserConfig create() {
            return builder().build();
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return modelPrompt
         */
        public String getModelPrompt() {
            return this.modelPrompt;
        }

        public static final class Builder {
            private String modelName; 
            private String modelPrompt; 

            private Builder() {
            } 

            private Builder(ParserConfig model) {
                this.modelName = model.modelName;
                this.modelPrompt = model.modelPrompt;
            } 

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li>qwen-vl-max</li>
             * <li>qwen-vl-plus</li>
             * </ul>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>The prompt used for parsing.</p>
             * 
             * <strong>example:</strong>
             * <h1>Role</h1>
             * <p>You are a professional image content annotator, skilled in identifying and describing the contents of images.  </p>
             * <h1>Task Objective</h1>
             * <p>Based on the input image, provide a detailed description of its contents.</p>
             */
            public Builder modelPrompt(String modelPrompt) {
                this.modelPrompt = modelPrompt;
                return this;
            }

            public ParserConfig build() {
                return new ParserConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetParseSettingsResponseBody} extends {@link TeaModel}
     *
     * <p>GetParseSettingsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("Parser")
        private String parser;

        @com.aliyun.core.annotation.NameInMap("ParserConfig")
        private ParserConfig parserConfig;

        @com.aliyun.core.annotation.NameInMap("ParserDisplayName")
        private String parserDisplayName;

        private Data(Builder builder) {
            this.fileType = builder.fileType;
            this.parser = builder.parser;
            this.parserConfig = builder.parserConfig;
            this.parserDisplayName = builder.parserDisplayName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return parser
         */
        public String getParser() {
            return this.parser;
        }

        /**
         * @return parserConfig
         */
        public ParserConfig getParserConfig() {
            return this.parserConfig;
        }

        /**
         * @return parserDisplayName
         */
        public String getParserDisplayName() {
            return this.parserDisplayName;
        }

        public static final class Builder {
            private String fileType; 
            private String parser; 
            private ParserConfig parserConfig; 
            private String parserDisplayName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.fileType = model.fileType;
                this.parser = model.parser;
                this.parserConfig = model.parserConfig;
                this.parserDisplayName = model.parserDisplayName;
            } 

            /**
             * <p>The file type. Valid values are: pdf, docx, doc, etc. All supported file types in the category are listed here.</p>
             * 
             * <strong>example:</strong>
             * <p>pdf</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The parser used for files of the current type. Valid values:</p>
             * <ul>
             * <li>DOCMIND (Intelligent parsing)</li>
             * <li>DOCMIND_DIGITAL (Digital parsing)</li>
             * <li>DOCMIND_LLM_VERSION (LLM parsing)</li>
             * <li>DASH_QWEN_VL_PARSER (Qwen VL parsing)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DOCMIND</p>
             */
            public Builder parser(String parser) {
                this.parser = parser;
                return this;
            }

            /**
             * <p>The parser configuration. Currently, this is available only for Qwen VL parsing.</p>
             */
            public Builder parserConfig(ParserConfig parserConfig) {
                this.parserConfig = parserConfig;
                return this;
            }

            /**
             * <p>The display name of the parsing method.</p>
             * 
             * <strong>example:</strong>
             * <p>Digital parsing</p>
             */
            public Builder parserDisplayName(String parserDisplayName) {
                this.parserDisplayName = parserDisplayName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
