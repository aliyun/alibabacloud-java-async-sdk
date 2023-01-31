// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDialogueFlowsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDialogueFlowsResponseBody</p>
 */
public class ListDialogueFlowsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DialogueFlows")
    private java.util.List < DialogueFlows> dialogueFlows;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListDialogueFlowsResponseBody(Builder builder) {
        this.code = builder.code;
        this.dialogueFlows = builder.dialogueFlows;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDialogueFlowsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dialogueFlows
     */
    public java.util.List < DialogueFlows> getDialogueFlows() {
        return this.dialogueFlows;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < DialogueFlows> dialogueFlows; 
        private Integer httpStatusCode; 
        private String message; 
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
         * DialogueFlows.
         */
        public Builder dialogueFlows(java.util.List < DialogueFlows> dialogueFlows) {
            this.dialogueFlows = dialogueFlows;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDialogueFlowsResponseBody build() {
            return new ListDialogueFlowsResponseBody(this);
        } 

    } 

    public static class DialogueFlows extends TeaModel {
        @NameInMap("DialogueFlowDefinition")
        private String dialogueFlowDefinition;

        @NameInMap("DialogueFlowId")
        private String dialogueFlowId;

        @NameInMap("DialogueFlowName")
        private String dialogueFlowName;

        @NameInMap("DialogueFlowType")
        private String dialogueFlowType;

        @NameInMap("ScriptId")
        private String scriptId;

        @NameInMap("ScriptVersion")
        private String scriptVersion;

        private DialogueFlows(Builder builder) {
            this.dialogueFlowDefinition = builder.dialogueFlowDefinition;
            this.dialogueFlowId = builder.dialogueFlowId;
            this.dialogueFlowName = builder.dialogueFlowName;
            this.dialogueFlowType = builder.dialogueFlowType;
            this.scriptId = builder.scriptId;
            this.scriptVersion = builder.scriptVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DialogueFlows create() {
            return builder().build();
        }

        /**
         * @return dialogueFlowDefinition
         */
        public String getDialogueFlowDefinition() {
            return this.dialogueFlowDefinition;
        }

        /**
         * @return dialogueFlowId
         */
        public String getDialogueFlowId() {
            return this.dialogueFlowId;
        }

        /**
         * @return dialogueFlowName
         */
        public String getDialogueFlowName() {
            return this.dialogueFlowName;
        }

        /**
         * @return dialogueFlowType
         */
        public String getDialogueFlowType() {
            return this.dialogueFlowType;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return scriptVersion
         */
        public String getScriptVersion() {
            return this.scriptVersion;
        }

        public static final class Builder {
            private String dialogueFlowDefinition; 
            private String dialogueFlowId; 
            private String dialogueFlowName; 
            private String dialogueFlowType; 
            private String scriptId; 
            private String scriptVersion; 

            /**
             * DialogueFlowDefinition.
             */
            public Builder dialogueFlowDefinition(String dialogueFlowDefinition) {
                this.dialogueFlowDefinition = dialogueFlowDefinition;
                return this;
            }

            /**
             * DialogueFlowId.
             */
            public Builder dialogueFlowId(String dialogueFlowId) {
                this.dialogueFlowId = dialogueFlowId;
                return this;
            }

            /**
             * DialogueFlowName.
             */
            public Builder dialogueFlowName(String dialogueFlowName) {
                this.dialogueFlowName = dialogueFlowName;
                return this;
            }

            /**
             * DialogueFlowType.
             */
            public Builder dialogueFlowType(String dialogueFlowType) {
                this.dialogueFlowType = dialogueFlowType;
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
             * ScriptVersion.
             */
            public Builder scriptVersion(String scriptVersion) {
                this.scriptVersion = scriptVersion;
                return this;
            }

            public DialogueFlows build() {
                return new DialogueFlows(this);
            } 

        } 

    }
}
