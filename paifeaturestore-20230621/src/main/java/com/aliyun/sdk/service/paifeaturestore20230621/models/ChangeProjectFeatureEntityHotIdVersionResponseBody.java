// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeProjectFeatureEntityHotIdVersionResponseBody} extends {@link TeaModel}
 *
 * <p>ChangeProjectFeatureEntityHotIdVersionResponseBody</p>
 */
public class ChangeProjectFeatureEntityHotIdVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ChangeProjectFeatureEntityHotIdVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeProjectFeatureEntityHotIdVersionResponseBody create() {
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

        public ChangeProjectFeatureEntityHotIdVersionResponseBody build() {
            return new ChangeProjectFeatureEntityHotIdVersionResponseBody(this);
        } 

    } 

}
