// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchApiResponseBody} extends {@link TeaModel}
 *
 * <p>SwitchApiResponseBody</p>
 */
public class SwitchApiResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private SwitchApiResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchApiResponseBody create() {
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
         * Switches the definition of an API in a specified runtime environment to a historical version.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SwitchApiResponseBody build() {
            return new SwitchApiResponseBody(this);
        } 

    } 

}
