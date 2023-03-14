// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenDomainSlsConfigResponseBody} extends {@link TeaModel}
 *
 * <p>OpenDomainSlsConfigResponseBody</p>
 */
public class OpenDomainSlsConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private OpenDomainSlsConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenDomainSlsConfigResponseBody create() {
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

        public OpenDomainSlsConfigResponseBody build() {
            return new OpenDomainSlsConfigResponseBody(this);
        } 

    } 

}
