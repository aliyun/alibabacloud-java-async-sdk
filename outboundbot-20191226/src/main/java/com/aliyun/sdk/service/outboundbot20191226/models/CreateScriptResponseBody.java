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
 * {@link CreateScriptResponseBody} extends {@link TeaModel}
 *
 * <p>CreateScriptResponseBody</p>
 */
public class CreateScriptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Script")
    private Script script;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateScriptResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.script = builder.script;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScriptResponseBody create() {
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
     * @return script
     */
    public Script getScript() {
        return this.script;
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
        private Script script; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateScriptResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.script = model.script;
            this.success = model.success;
        } 

        /**
         * <p>Response code</p>
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
         * <p>Script information</p>
         */
        public Builder script(Script script) {
            this.script = script;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateScriptResponseBody build() {
            return new CreateScriptResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateScriptResponseBody} extends {@link TeaModel}
     *
     * <p>CreateScriptResponseBody</p>
     */
    public static class Script extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DebugStatus")
        private String debugStatus;

        @com.aliyun.core.annotation.NameInMap("Industry")
        private String industry;

        @com.aliyun.core.annotation.NameInMap("IsDebugDrafted")
        private Boolean isDebugDrafted;

        @com.aliyun.core.annotation.NameInMap("IsDrafted")
        private Boolean isDrafted;

        @com.aliyun.core.annotation.NameInMap("NluAccessType")
        private String nluAccessType;

        @com.aliyun.core.annotation.NameInMap("NluEngine")
        private String nluEngine;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("ScriptDescription")
        private String scriptDescription;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("ScriptName")
        private String scriptName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Script(Builder builder) {
            this.debugStatus = builder.debugStatus;
            this.industry = builder.industry;
            this.isDebugDrafted = builder.isDebugDrafted;
            this.isDrafted = builder.isDrafted;
            this.nluAccessType = builder.nluAccessType;
            this.nluEngine = builder.nluEngine;
            this.scene = builder.scene;
            this.scriptDescription = builder.scriptDescription;
            this.scriptId = builder.scriptId;
            this.scriptName = builder.scriptName;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Script create() {
            return builder().build();
        }

        /**
         * @return debugStatus
         */
        public String getDebugStatus() {
            return this.debugStatus;
        }

        /**
         * @return industry
         */
        public String getIndustry() {
            return this.industry;
        }

        /**
         * @return isDebugDrafted
         */
        public Boolean getIsDebugDrafted() {
            return this.isDebugDrafted;
        }

        /**
         * @return isDrafted
         */
        public Boolean getIsDrafted() {
            return this.isDrafted;
        }

        /**
         * @return nluAccessType
         */
        public String getNluAccessType() {
            return this.nluAccessType;
        }

        /**
         * @return nluEngine
         */
        public String getNluEngine() {
            return this.nluEngine;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return scriptDescription
         */
        public String getScriptDescription() {
            return this.scriptDescription;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return scriptName
         */
        public String getScriptName() {
            return this.scriptName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String debugStatus; 
            private String industry; 
            private Boolean isDebugDrafted; 
            private Boolean isDrafted; 
            private String nluAccessType; 
            private String nluEngine; 
            private String scene; 
            private String scriptDescription; 
            private String scriptId; 
            private String scriptName; 
            private String status; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Script model) {
                this.debugStatus = model.debugStatus;
                this.industry = model.industry;
                this.isDebugDrafted = model.isDebugDrafted;
                this.isDrafted = model.isDrafted;
                this.nluAccessType = model.nluAccessType;
                this.nluEngine = model.nluEngine;
                this.scene = model.scene;
                this.scriptDescription = model.scriptDescription;
                this.scriptId = model.scriptId;
                this.scriptName = model.scriptName;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>Script debug status</p>
             * 
             * <strong>example:</strong>
             * <p>DRAFTED</p>
             */
            public Builder debugStatus(String debugStatus) {
                this.debugStatus = debugStatus;
                return this;
            }

            /**
             * <p>Industry</p>
             * 
             * <strong>example:</strong>
             * <p>教育</p>
             */
            public Builder industry(String industry) {
                this.industry = industry;
                return this;
            }

            /**
             * <p>Is debug draft</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDebugDrafted(Boolean isDebugDrafted) {
                this.isDebugDrafted = isDebugDrafted;
                return this;
            }

            /**
             * <p>Is draft</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDrafted(Boolean isDrafted) {
                this.isDrafted = isDrafted;
                return this;
            }

            /**
             * <p>NLU access method (applicable only to Large Language Model (LLM) scenarios). Enumeration: Managed - Access using an Alibaba public account. This field is empty for non-LLM scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>Managed</p>
             */
            public Builder nluAccessType(String nluAccessType) {
                this.nluAccessType = nluAccessType;
                return this;
            }

            /**
             * <p>NLU engine (applicable only to Large Language Model (LLM) scenarios). Enumeration: Prompts - Large Language Model (LLM) scenario. This field is empty for non-LLM scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>Prompts</p>
             */
            public Builder nluEngine(String nluEngine) {
                this.nluEngine = nluEngine;
                return this;
            }

            /**
             * <p>Scenario</p>
             * 
             * <strong>example:</strong>
             * <p>回访</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>Script description</p>
             * 
             * <strong>example:</strong>
             * <p>课程满意度回访</p>
             */
            public Builder scriptDescription(String scriptDescription) {
                this.scriptDescription = scriptDescription;
                return this;
            }

            /**
             * <p>Script ID</p>
             * 
             * <strong>example:</strong>
             * <p>8c58d3e0-bf27-4685-a5a5-65872ec5abc4</p>
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * <p>Script name</p>
             * 
             * <strong>example:</strong>
             * <p>课程满意度回访</p>
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * <p>Job status. Valid values:</p>
             * <ul>
             * <li><p><strong>DRAFTED</strong>: Draft.</p>
             * </li>
             * <li><p><strong>INITIALIZE_IN_PROGRESS</strong>: Initializing.</p>
             * </li>
             * <li><p><strong>PUBLISHED</strong>: Published.</p>
             * </li>
             * <li><p><strong>PUBLISH_IN_PROGRESS</strong>: Publishing.</p>
             * </li>
             * <li><p><strong>ROLLBACK_IN_PROGRESS</strong>: Rolling back.</p>
             * </li>
             * <li><p><strong>EXAMINE_IN_PROGRESS</strong>: Pending review.</p>
             * </li>
             * <li><p><strong>PUBLISHED_AND_EXAMINE_IN_PROGRESS</strong>: Published and pending review.</p>
             * </li>
             * <li><p><strong>PUBLISH_FAILED</strong>: Publish failed.</p>
             * </li>
             * <li><p><strong>ROLLBACK_FAILED</strong>: Rollback failed.</p>
             * </li>
             * <li><p><strong>IMPORT_IN_PROGRESS</strong>: Importing.</p>
             * </li>
             * <li><p><strong>IMPORT_FAILED</strong>: Import failed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DRAFTED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Script update time (unit: milliseconds)</p>
             * 
             * <strong>example:</strong>
             * <p>1578474045152</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Script build() {
                return new Script(this);
            } 

        } 

    }
}
