// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link SendTestByTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>SendTestByTemplateResponseBody</p>
 */
public class SendTestByTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SendTestByTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendTestByTemplateResponseBody create() {
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

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(SendTestByTemplateResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>10A1AD70-E48E-476D-98D9-39BD92193837</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SendTestByTemplateResponseBody build() {
            return new SendTestByTemplateResponseBody(this);
        } 

    } 

}
