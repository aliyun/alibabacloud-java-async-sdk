// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyEmgVulSubmitResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyEmgVulSubmitResponseBody</p>
 */
public class ModifyEmgVulSubmitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private ModifyEmgVulSubmitResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyEmgVulSubmitResponseBody create() {
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
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyEmgVulSubmitResponseBody build() {
            return new ModifyEmgVulSubmitResponseBody(this);
        } 

    } 

}
