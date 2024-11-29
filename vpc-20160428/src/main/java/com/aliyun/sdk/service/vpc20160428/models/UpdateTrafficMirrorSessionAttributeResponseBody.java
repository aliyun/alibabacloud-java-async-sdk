// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateTrafficMirrorSessionAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateTrafficMirrorSessionAttributeResponseBody</p>
 */
public class UpdateTrafficMirrorSessionAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateTrafficMirrorSessionAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTrafficMirrorSessionAttributeResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>64DCAF03-E2C7-479A-ACEA-38B79876B006</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateTrafficMirrorSessionAttributeResponseBody build() {
            return new UpdateTrafficMirrorSessionAttributeResponseBody(this);
        } 

    } 

}
