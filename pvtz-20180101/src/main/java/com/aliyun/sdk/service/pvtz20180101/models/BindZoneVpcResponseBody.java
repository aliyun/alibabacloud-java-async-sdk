// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindZoneVpcResponseBody} extends {@link TeaModel}
 *
 * <p>BindZoneVpcResponseBody</p>
 */
public class BindZoneVpcResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private BindZoneVpcResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindZoneVpcResponseBody create() {
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

        public BindZoneVpcResponseBody build() {
            return new BindZoneVpcResponseBody(this);
        } 

    } 

}
