// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryScriptWaveformsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryScriptWaveformsResponseBody</p>
 */
public class QueryScriptWaveformsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScriptWaveforms")
    private java.util.List < ScriptWaveforms> scriptWaveforms;

    @NameInMap("Success")
    private Boolean success;

    private QueryScriptWaveformsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.scriptWaveforms = builder.scriptWaveforms;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryScriptWaveformsResponseBody create() {
        return builder().build();
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
     * @return scriptWaveforms
     */
    public java.util.List < ScriptWaveforms> getScriptWaveforms() {
        return this.scriptWaveforms;
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
        private java.util.List < ScriptWaveforms> scriptWaveforms; 
        private Boolean success; 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScriptWaveforms.
         */
        public Builder scriptWaveforms(java.util.List < ScriptWaveforms> scriptWaveforms) {
            this.scriptWaveforms = scriptWaveforms;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryScriptWaveformsResponseBody build() {
            return new QueryScriptWaveformsResponseBody(this);
        } 

    } 

    public static class ScriptWaveforms extends TeaModel {
        @NameInMap("FileId")
        private String fileId;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("ScriptContent")
        private String scriptContent;

        @NameInMap("ScriptId")
        private String scriptId;

        @NameInMap("ScriptWaveformId")
        private String scriptWaveformId;

        private ScriptWaveforms(Builder builder) {
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.scriptContent = builder.scriptContent;
            this.scriptId = builder.scriptId;
            this.scriptWaveformId = builder.scriptWaveformId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScriptWaveforms create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return scriptContent
         */
        public String getScriptContent() {
            return this.scriptContent;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return scriptWaveformId
         */
        public String getScriptWaveformId() {
            return this.scriptWaveformId;
        }

        public static final class Builder {
            private String fileId; 
            private String fileName; 
            private String scriptContent; 
            private String scriptId; 
            private String scriptWaveformId; 

            /**
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
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
             * ScriptContent.
             */
            public Builder scriptContent(String scriptContent) {
                this.scriptContent = scriptContent;
                return this;
            }

            /**
             * ScriptId.
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * ScriptWaveformId.
             */
            public Builder scriptWaveformId(String scriptWaveformId) {
                this.scriptWaveformId = scriptWaveformId;
                return this;
            }

            public ScriptWaveforms build() {
                return new ScriptWaveforms(this);
            } 

        } 

    }
}
