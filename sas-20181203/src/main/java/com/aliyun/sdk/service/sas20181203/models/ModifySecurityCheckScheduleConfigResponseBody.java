// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityCheckScheduleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySecurityCheckScheduleConfigResponseBody</p>
 */
public class ModifySecurityCheckScheduleConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifySecurityCheckScheduleConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecurityCheckScheduleConfigResponseBody create() {
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
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifySecurityCheckScheduleConfigResponseBody build() {
            return new ModifySecurityCheckScheduleConfigResponseBody(this);
        } 

    } 

}
