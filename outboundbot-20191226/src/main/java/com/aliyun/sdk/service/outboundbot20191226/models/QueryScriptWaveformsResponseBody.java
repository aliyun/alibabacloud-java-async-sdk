// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link QueryScriptWaveformsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryScriptWaveformsResponseBody</p>
 */
public class QueryScriptWaveformsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScriptWaveforms")
    private java.util.List<ScriptWaveforms> scriptWaveforms;

    @com.aliyun.core.annotation.NameInMap("Success")
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
     * @return scriptWaveforms
     */
    public java.util.List<ScriptWaveforms> getScriptWaveforms() {
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
        private java.util.List<ScriptWaveforms> scriptWaveforms; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryScriptWaveformsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.scriptWaveforms = model.scriptWaveforms;
            this.success = model.success;
        } 

        /**
         * <p>API status code</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>API message</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Recording list of scenario voices</p>
         * <blockquote>
         * <p>Recording data is returned only when the voice type is recording. It is not returned when the voice is speech synthesis.</p>
         * </blockquote>
         */
        public Builder scriptWaveforms(java.util.List<ScriptWaveforms> scriptWaveforms) {
            this.scriptWaveforms = scriptWaveforms;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryScriptWaveformsResponseBody build() {
            return new QueryScriptWaveformsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryScriptWaveformsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryScriptWaveformsResponseBody</p>
     */
    public static class ScriptWaveforms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("ScriptContent")
        private String scriptContent;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("ScriptWaveformId")
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

            private Builder() {
            } 

            private Builder(ScriptWaveforms model) {
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.scriptContent = model.scriptContent;
                this.scriptId = model.scriptId;
                this.scriptWaveformId = model.scriptWaveformId;
            } 

            /**
             * <p>File key in OSS</p>
             * 
             * <strong>example:</strong>
             * <p>UPLOADED/RECORDING/a8xxxxx-2b26-4b6d-a54f-696b95xxx1/a6bf591a-cf6d-4xxxxxx.wav</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>Recording file name</p>
             * 
             * <strong>example:</strong>
             * <p>SHUKE_ZA_ol_32_邀约.wav</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>Scenario voice name</p>
             * 
             * <strong>example:</strong>
             * <p>测试</p>
             */
            public Builder scriptContent(String scriptContent) {
                this.scriptContent = scriptContent;
                return this;
            }

            /**
             * <p>Scenario ID</p>
             * 
             * <strong>example:</strong>
             * <p>25b26ce1-009c-4791-a720-e7ac4f9821a1</p>
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * <p>Scenario voice recording ID</p>
             * 
             * <strong>example:</strong>
             * <p>444df4-009c-4791-a720-e7ac4f9821a1</p>
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
