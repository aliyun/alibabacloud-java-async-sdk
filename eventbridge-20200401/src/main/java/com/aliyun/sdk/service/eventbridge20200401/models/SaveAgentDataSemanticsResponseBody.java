// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link SaveAgentDataSemanticsResponseBody} extends {@link TeaModel}
 *
 * <p>SaveAgentDataSemanticsResponseBody</p>
 */
public class SaveAgentDataSemanticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.Map<String, ?> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SaveAgentDataSemanticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveAgentDataSemanticsResponseBody create() {
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
    public java.util.Map<String, ?> getData() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.Map<String, ?> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SaveAgentDataSemanticsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The update result. If the save is successful, an empty object is returned with no additional business fields. If none of the four knowledge categories are specified, the target state is all four categories empty: if a non-empty current version exists, an all-empty version is published. If the current version is already all empty or no current version exists, the operation succeeds idempotently and the current round of pending generation results is finalized.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder data(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message. If the call fails, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid data semantics request.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier that Alibaba Cloud generates for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5DAF96FB-A4DF-548C-B8A1-F2A8D2F4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SaveAgentDataSemanticsResponseBody build() {
            return new SaveAgentDataSemanticsResponseBody(this);
        } 

    } 

}
