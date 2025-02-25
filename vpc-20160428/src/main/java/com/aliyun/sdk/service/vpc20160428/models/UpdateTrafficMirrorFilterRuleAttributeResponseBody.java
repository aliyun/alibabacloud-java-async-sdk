// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link UpdateTrafficMirrorFilterRuleAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateTrafficMirrorFilterRuleAttributeResponseBody</p>
 */
public class UpdateTrafficMirrorFilterRuleAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateTrafficMirrorFilterRuleAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTrafficMirrorFilterRuleAttributeResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>02EB8585-D4DC-4E29-A0F4-7C588C82863C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateTrafficMirrorFilterRuleAttributeResponseBody build() {
            return new UpdateTrafficMirrorFilterRuleAttributeResponseBody(this);
        } 

    } 

}
