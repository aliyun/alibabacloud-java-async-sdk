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
         * <p>The dialog flow data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;transitions&quot;:[{&quot;id&quot;:&quot;a91c4023&quot;,&quot;index&quot;:1,&quot;source&quot;:&quot;cc31e02b&quot;,&quot;sourceAnchor&quot;:0,&quot;target&quot;:&quot;946045be&quot;,&quot;targetAnchor&quot;:0}],&quot;nodes&quot;:[{&quot;collectedNumberEnabled&quot;:false,&quot;content&quot;:{&quot;branches&quot;:[{&quot;branchId&quot;:&quot;f5450420-09ab-11ea-b107-e9059c6a79d8&quot;,&quot;branchName&quot;:&quot;Initiate conversation&quot;}]},&quot;coordinates&quot;:{&quot;x&quot;:180,&quot;y&quot;:134},&quot;id&quot;:&quot;cc31e02b&quot;,&quot;index&quot;:0,&quot;interruptible&quot;:false,&quot;nodeIndex&quot;:0,&quot;shape&quot;:&quot;start-html&quot;,&quot;size&quot;:&quot;170<em>34&quot;,&quot;type&quot;:&quot;start&quot;,&quot;x&quot;:180,&quot;y&quot;:134},{&quot;collectedNumberEnabled&quot;:false,&quot;content&quot;:{&quot;actionParams&quot;:&quot;&quot;,&quot;action&quot;:&quot;Hangup&quot;},&quot;coordinates&quot;:{&quot;x&quot;:487.65625,&quot;y&quot;:155},&quot;id&quot;:&quot;946045be&quot;,&quot;index&quot;:2,&quot;interruptible&quot;:false,&quot;labels&quot;:[],&quot;name&quot;:&quot;Function node&quot;,&quot;nodeIndex&quot;:1,&quot;questions&quot;:[&quot;OK, we have noted your situation. We will arrange a senior consultant to provide you with a more detailed study abroad assessment and academic guidance. Please stay available for the call.&quot;],&quot;script&quot;:&quot;OK, we have noted your situation. We will arrange a senior consultant to provide you with a more detailed study abroad assessment and academic guidance. Please stay available for the call.&quot;,&quot;shape&quot;:&quot;function-html&quot;,&quot;size&quot;:&quot;170</em>34&quot;,&quot;type&quot;:&quot;transfer&quot;,&quot;x&quot;:500,&quot;y&quot;:182}]}</p>
         */
        public Builder dialogueFlowDefinition(String dialogueFlowDefinition) {
            this.dialogueFlowDefinition = dialogueFlowDefinition;
            return this;
        }

        /**
         * <p>The dialog flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>390515b5-6115-4ccf-83e2-52d5bfaf2ddf</p>
         */
        public Builder dialogueFlowId(String dialogueFlowId) {
            this.dialogueFlowId = dialogueFlowId;
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
         * <p>Succcess</p>
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
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
