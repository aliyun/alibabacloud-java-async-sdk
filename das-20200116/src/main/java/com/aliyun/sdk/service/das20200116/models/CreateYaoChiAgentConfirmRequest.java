// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link CreateYaoChiAgentConfirmRequest} extends {@link RequestModel}
 *
 * <p>CreateYaoChiAgentConfirmRequest</p>
 */
public class CreateYaoChiAgentConfirmRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Approved")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean approved;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfirmationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String confirmationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToolArgs")
    private String toolArgs;

    private CreateYaoChiAgentConfirmRequest(Builder builder) {
        super(builder);
        this.approved = builder.approved;
        this.confirmationId = builder.confirmationId;
        this.sessionId = builder.sessionId;
        this.toolArgs = builder.toolArgs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateYaoChiAgentConfirmRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approved
     */
    public Boolean getApproved() {
        return this.approved;
    }

    /**
     * @return confirmationId
     */
    public String getConfirmationId() {
        return this.confirmationId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return toolArgs
     */
    public String getToolArgs() {
        return this.toolArgs;
    }

    public static final class Builder extends Request.Builder<CreateYaoChiAgentConfirmRequest, Builder> {
        private Boolean approved; 
        private String confirmationId; 
        private String sessionId; 
        private String toolArgs; 

        private Builder() {
            super();
        } 

        private Builder(CreateYaoChiAgentConfirmRequest request) {
            super(request);
            this.approved = request.approved;
            this.confirmationId = request.confirmationId;
            this.sessionId = request.sessionId;
            this.toolArgs = request.toolArgs;
        } 

        /**
         * <p>Specifies whether to approve the execution of the pending operation. Valid values:</p>
         * <ul>
         * <li>true: Approve the execution.</li>
         * <li>false: Reject the execution.</li>
         * </ul>
         * <p>This parameter is required. Rejection is also a valid confirmation response and does not indicate an operation call failure.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder approved(Boolean approved) {
            this.putQueryParameter("Approved", approved);
            this.approved = approved;
            return this;
        }

        /**
         * <p>The unique identifier of the pending operation. Use the confirmation_id returned by the operation confirmation event in the Alibaba Cloud ApsaraDB agent session. Do not generate it yourself. The format is a 36-character UUID that contains hyphens, such as xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-42d3-a456-426614174000</p>
         */
        public Builder confirmationId(String confirmationId) {
            this.putQueryParameter("ConfirmationId", confirmationId);
            this.confirmationId = confirmationId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud ApsaraDB agent session to which the pending operation belongs. It must be the same as the SessionId used when creating the session and initiating the chat, and must correspond to the session to which the ConfirmationId belongs. The format is a 36-character UUID that contains hyphens.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1b2c3d4-e5f6-4789-abcd-0123456789ab</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The custom parameters of the tool. The example shows the parameter structure of the tool for modifying instance descriptions. The instance ID and description are desensitized and provided only for format reference. The current version does not support modifying tool parameters through this operation. Omit this parameter in actual calls. Do not pass an empty string or a JSON string. When approving the execution, the original tool parameters generated by the assistant are used.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;db-instance-id&quot;:&quot;rm-bp1xxxxxxxxxxxxxx&quot;,&quot;db-instance-description&quot;:&quot;example-description&quot;,&quot;region&quot;:&quot;cn-hangzhou&quot;}</p>
         */
        public Builder toolArgs(String toolArgs) {
            this.putQueryParameter("ToolArgs", toolArgs);
            this.toolArgs = toolArgs;
            return this;
        }

        @Override
        public CreateYaoChiAgentConfirmRequest build() {
            return new CreateYaoChiAgentConfirmRequest(this);
        } 

    } 

}
