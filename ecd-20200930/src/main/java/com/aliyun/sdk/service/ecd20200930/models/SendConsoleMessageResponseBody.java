// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link SendConsoleMessageResponseBody} extends {@link TeaModel}
 *
 * <p>SendConsoleMessageResponseBody</p>
 */
public class SendConsoleMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SendConsoleMessageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendConsoleMessageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SendConsoleMessageResponseBody model) {
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The ID of the request. You can use the ID to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9F1D7E42-06A8-4B50-9A21-6E0C8D3F5B72</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is accepted. A value of true indicates success, and a value of false indicates failure. For asynchronous pushes, a successful acceptance does not mean that all targets have received the message.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SendConsoleMessageResponseBody build() {
            return new SendConsoleMessageResponseBody(this);
        } 

    } 

}
