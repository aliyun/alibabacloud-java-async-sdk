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
 * {@link ModifyDialogueFlowResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDialogueFlowResponseBody</p>
 */
public class ModifyDialogueFlowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DialogueFlowDefinition")
    private String dialogueFlowDefinition;

    @com.aliyun.core.annotation.NameInMap("DialogueFlowId")
    private String dialogueFlowId;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ModifyDialogueFlowResponseBody(Builder builder) {
        this.code = builder.code;
        this.dialogueFlowDefinition = builder.dialogueFlowDefinition;
        this.dialogueFlowId = builder.dialogueFlowId;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDialogueFlowResponseBody create() {
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
        private String dialogueFlowDefinition; 
        private String dialogueFlowId; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ModifyDialogueFlowResponseBody model) {
            this.code = model.code;
            this.dialogueFlowDefinition = model.dialogueFlowDefinition;
            this.dialogueFlowId = model.dialogueFlowId;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
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

        public ModifyDialogueFlowResponseBody build() {
            return new ModifyDialogueFlowResponseBody(this);
        } 

    } 

}
