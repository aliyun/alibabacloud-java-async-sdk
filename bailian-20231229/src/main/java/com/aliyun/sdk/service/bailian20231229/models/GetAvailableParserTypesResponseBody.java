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
 * {@link GetAvailableParserTypesResponseBody} extends {@link TeaModel}
 *
 * <p>GetAvailableParserTypesResponseBody</p>
 */
public class GetAvailableParserTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAvailableParserTypesResponseBody(Builder builder) {
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

    public static GetAvailableParserTypesResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAvailableParserTypesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>DataCenter.Throttling</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business data returned upon a successful request.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>User not authorized to operate on the specified resource</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17204B98-7734-4F9A-8464-2446XXXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status code returned by the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAvailableParserTypesResponseBody build() {
            return new GetAvailableParserTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAvailableParserTypesResponseBody} extends {@link TeaModel}
     *
     * <p>GetAvailableParserTypesResponseBody</p>
     */
    public static class ParserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Parser")
        private String parser;

        private ParserList(Builder builder) {
            this.displayName = builder.displayName;
            this.parser = builder.parser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParserList create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return parser
         */
        public String getParser() {
            return this.parser;
        }

        public static final class Builder {
            private String displayName; 
            private String parser; 

            private Builder() {
            } 

            private Builder(ParserList model) {
                this.displayName = model.displayName;
                this.parser = model.parser;
            } 

            /**
             * <p>The display name of the parsing method.</p>
             * 
             * <strong>example:</strong>
             * <p>Intelligent Document Parsing</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The parser code. Valid values:</p>
             * <ul>
             * <li>DOCMIND: Intelligent Document Parsing.</li>
             * <li>DOCMIND_DIGITAL: Electronic Document Parsing.</li>
             * <li>DOCMIND_LLM_VERSION: LLM-based Document Parsing.</li>
             * <li>DASH_QWEN_VL_PARSER: Qwen-VL Parsing.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DOCMIND</p>
             */
            public Builder parser(String parser) {
                this.parser = parser;
                return this;
            }

            public ParserList build() {
                return new ParserList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAvailableParserTypesResponseBody} extends {@link TeaModel}
     *
     * <p>GetAvailableParserTypesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("ParserList")
        private java.util.List<ParserList> parserList;

        private Data(Builder builder) {
            this.fileType = builder.fileType;
            this.parserList = builder.parserList;
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
         * @return parserList
         */
        public java.util.List<ParserList> getParserList() {
            return this.parserList;
        }

        public static final class Builder {
            private String fileType; 
            private java.util.List<ParserList> parserList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.fileType = model.fileType;
                this.parserList = model.parserList;
            } 

            /**
             * <p>The file type, which is the same as the FileType input parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>pdf</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The list of parsers supported for the specified file type.</p>
             */
            public Builder parserList(java.util.List<ParserList> parserList) {
                this.parserList = parserList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
