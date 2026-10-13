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
 * {@link ListDialogueFlowsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDialogueFlowsResponseBody</p>
 */
public class ListDialogueFlowsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DialogueFlows")
    private java.util.List<DialogueFlows> dialogueFlows;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
     * @return dialogueFlows
     */
    public java.util.List<DialogueFlows> getDialogueFlows() {
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
        private java.util.List<DialogueFlows> dialogueFlows; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListDialogueFlowsResponseBody model) {
            this.code = model.code;
            this.dialogueFlows = model.dialogueFlows;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>A list of dialogue flows.</p>
         */
        public Builder dialogueFlows(java.util.List<DialogueFlows> dialogueFlows) {
            this.dialogueFlows = dialogueFlows;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded.</p>
         * <ul>
         * <li><p><strong>true</strong>: The request succeeded.</p>
         * </li>
         * <li><p><strong>false</strong>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDialogueFlowsResponseBody build() {
            return new ListDialogueFlowsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDialogueFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDialogueFlowsResponseBody</p>
     */
    public static class DialogueFlows extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DialogueFlowDefinition")
        private String dialogueFlowDefinition;

        @com.aliyun.core.annotation.NameInMap("DialogueFlowId")
        private String dialogueFlowId;

        @com.aliyun.core.annotation.NameInMap("DialogueFlowName")
        private String dialogueFlowName;

        @com.aliyun.core.annotation.NameInMap("DialogueFlowType")
        private String dialogueFlowType;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("ScriptVersion")
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

            private Builder() {
            } 

            private Builder(DialogueFlows model) {
                this.dialogueFlowDefinition = model.dialogueFlowDefinition;
                this.dialogueFlowId = model.dialogueFlowId;
                this.dialogueFlowName = model.dialogueFlowName;
                this.dialogueFlowType = model.dialogueFlowType;
                this.scriptId = model.scriptId;
                this.scriptVersion = model.scriptVersion;
            } 

            /**
             * <p>The dialogue flow data, formatted as a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;transitions&quot;:[{&quot;source&quot;:&quot;cc31e02b&quot;,&quot;sourceAnchor&quot;:0,&quot;target&quot;:&quot;345700de&quot;,&quot;targetAnchor&quot;:0,&quot;id&quot;:&quot;16d37c6e&quot;,&quot;index&quot;:1}],&quot;nodes&quot;:[{&quot;shape&quot;:&quot;start-html&quot;,&quot;type&quot;:&quot;start&quot;,&quot;size&quot;:&quot;170<em>34&quot;,&quot;x&quot;:180,&quot;y&quot;:134,&quot;id&quot;:&quot;cc31e02b&quot;,&quot;index&quot;:0,&quot;nodeIndex&quot;:0,&quot;content&quot;:{&quot;branches&quot;:[{&quot;branchName&quot;:&quot;发起对话&quot;,&quot;branchId&quot;:&quot;3c50a880-a7bc-11e9-80fc-5917e4f31864&quot;}]},&quot;coordinates&quot;:{&quot;x&quot;:180,&quot;y&quot;:134}},{&quot;shape&quot;:&quot;function-html&quot;,&quot;type&quot;:&quot;transfer&quot;,&quot;size&quot;:&quot;170</em>34&quot;,&quot;x&quot;:606,&quot;y&quot;:134,&quot;id&quot;:&quot;345700de&quot;,&quot;nodeIndex&quot;:1,&quot;name&quot;:&quot;功能节点&quot;,&quot;script&quot;:&quot;你是 @name ma&quot;,&quot;content&quot;:{&quot;action&quot;:&quot;Hangup&quot;,&quot;actionParams&quot;:&quot;&quot;,&quot;label&quot;:[&quot;test1&quot;,&quot;test2&quot;,&quot;test3&quot;,&quot;test4&quot;,&quot;test5&quot;]},&quot;coordinates&quot;:{&quot;x&quot;:606,&quot;y&quot;:134},&quot;index&quot;:2,&quot;questions&quot;:[&quot;你是 @联系人姓名 ma&quot;]}]}</p>
             */
            public Builder dialogueFlowDefinition(String dialogueFlowDefinition) {
                this.dialogueFlowDefinition = dialogueFlowDefinition;
                return this;
            }

            /**
             * <p>The dialogue flow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dae01529-3c3e-458e-b07a-97643d09ebb9</p>
             */
            public Builder dialogueFlowId(String dialogueFlowId) {
                this.dialogueFlowId = dialogueFlowId;
                return this;
            }

            /**
             * <p>The dialogue flow name.</p>
             * 
             * <strong>example:</strong>
             * <p>主流程</p>
             */
            public Builder dialogueFlowName(String dialogueFlowName) {
                this.dialogueFlowName = dialogueFlowName;
                return this;
            }

            /**
             * <p>The flow type.</p>
             * <ul>
             * <li><p><code>SubFlow</code>: The subflow.</p>
             * </li>
             * <li><p><code>MainFlow</code>: The main flow.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MainFlow</p>
             */
            public Builder dialogueFlowType(String dialogueFlowType) {
                this.dialogueFlowType = dialogueFlowType;
                return this;
            }

            /**
             * <p>The outbound script ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2d5aa451-661f-4f08-b0c4-28eec78decc4</p>
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * <p>The script version.</p>
             * 
             * <strong>example:</strong>
             * <p>1569220563549</p>
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
