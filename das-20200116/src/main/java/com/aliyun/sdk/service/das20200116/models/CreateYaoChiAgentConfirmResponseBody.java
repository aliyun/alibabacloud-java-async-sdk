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
 * {@link CreateYaoChiAgentConfirmResponseBody} extends {@link TeaModel}
 *
 * <p>CreateYaoChiAgentConfirmResponseBody</p>
 */
public class CreateYaoChiAgentConfirmResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Approved")
    private Boolean approved;

    @com.aliyun.core.annotation.NameInMap("ConfirmationId")
    private String confirmationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("ToolArgsReceived")
    private Boolean toolArgsReceived;

    private CreateYaoChiAgentConfirmResponseBody(Builder builder) {
        this.approved = builder.approved;
        this.confirmationId = builder.confirmationId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.toolArgsReceived = builder.toolArgsReceived;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateYaoChiAgentConfirmResponseBody create() {
        return builder().build();
    }

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
     * @return toolArgsReceived
     */
    public Boolean getToolArgsReceived() {
        return this.toolArgsReceived;
    }

    public static final class Builder {
        private Boolean approved; 
        private String confirmationId; 
        private String requestId; 
        private String status; 
        private Boolean toolArgsReceived; 

        private Builder() {
        } 

        private Builder(CreateYaoChiAgentConfirmResponseBody model) {
            this.approved = model.approved;
            this.confirmationId = model.confirmationId;
            this.requestId = model.requestId;
            this.status = model.status;
            this.toolArgsReceived = model.toolArgsReceived;
        } 

        /**
         * <p>The confirmation decision submitted in this request, which is the same as the Approved request parameter. A value of true indicates that the execution is approved, and false indicates that the execution is rejected. This does not indicate whether the tool operation is executed successfully.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder approved(Boolean approved) {
            this.approved = approved;
            return this;
        }

        /**
         * <p>The identifier of the operation for which the confirmation is submitted, which is the same as the ConfirmationId request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-42d3-a456-426614174000</p>
         */
        public Builder confirmationId(String confirmationId) {
            this.confirmationId = confirmationId;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which is used for troubleshooting and log tracing.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B23456</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status string. The example value success refers to the outer success status of the downstream confirmation callback response and is provided only for format demonstration. It does not mean that the Status field of the current operation actually returns this value. In the current version, this field may be empty or not returned. Do not rely on this field to determine whether the execution is approved or whether the tool is executed successfully.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Specifies whether custom tool parameters are received. A value of true indicates that non-null parameters are provided, and false indicates that no parameters are provided. This does not indicate that the parameters are applied or that the tool is executed successfully. In the current version, omit the ToolArgs request parameter, and this field normally returns false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder toolArgsReceived(Boolean toolArgsReceived) {
            this.toolArgsReceived = toolArgsReceived;
            return this;
        }

        public CreateYaoChiAgentConfirmResponseBody build() {
            return new CreateYaoChiAgentConfirmResponseBody(this);
        } 

    } 

}
