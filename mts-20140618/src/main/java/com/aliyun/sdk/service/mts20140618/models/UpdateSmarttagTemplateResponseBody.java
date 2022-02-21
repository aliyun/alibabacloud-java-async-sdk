// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSmarttagTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSmarttagTemplateResponseBody</p>
 */
public class UpdateSmarttagTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateSmarttagTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSmarttagTemplateResponseBody create() {
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

        public UpdateSmarttagTemplateResponseBody build() {
            return new UpdateSmarttagTemplateResponseBody(this);
        } 

    } 

}
