// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetFingerPrintTemplateDescriptionResponseBody} extends {@link TeaModel}
 *
 * <p>SetFingerPrintTemplateDescriptionResponseBody</p>
 */
public class SetFingerPrintTemplateDescriptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetFingerPrintTemplateDescriptionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetFingerPrintTemplateDescriptionResponseBody create() {
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

        public SetFingerPrintTemplateDescriptionResponseBody build() {
            return new SetFingerPrintTemplateDescriptionResponseBody(this);
        } 

    } 

}
