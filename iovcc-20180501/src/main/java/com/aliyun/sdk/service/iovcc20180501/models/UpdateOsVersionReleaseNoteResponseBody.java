// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOsVersionReleaseNoteResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateOsVersionReleaseNoteResponseBody</p>
 */
public class UpdateOsVersionReleaseNoteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateOsVersionReleaseNoteResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOsVersionReleaseNoteResponseBody create() {
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

        public UpdateOsVersionReleaseNoteResponseBody build() {
            return new UpdateOsVersionReleaseNoteResponseBody(this);
        } 

    } 

}
