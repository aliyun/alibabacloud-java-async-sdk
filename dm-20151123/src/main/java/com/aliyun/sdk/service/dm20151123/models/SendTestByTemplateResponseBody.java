// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendTestByTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>SendTestByTemplateResponseBody</p>
 */
public class SendTestByTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * RequestId.
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
