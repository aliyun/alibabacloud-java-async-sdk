// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateHttpIncomingResponseHeaderModificationRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateHttpIncomingResponseHeaderModificationRuleResponseBody</p>
 */
public class UpdateHttpIncomingResponseHeaderModificationRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateHttpIncomingResponseHeaderModificationRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHttpIncomingResponseHeaderModificationRuleResponseBody create() {
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

        private Builder(UpdateHttpIncomingResponseHeaderModificationRuleResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateHttpIncomingResponseHeaderModificationRuleResponseBody build() {
            return new UpdateHttpIncomingResponseHeaderModificationRuleResponseBody(this);
        } 

    } 

}
