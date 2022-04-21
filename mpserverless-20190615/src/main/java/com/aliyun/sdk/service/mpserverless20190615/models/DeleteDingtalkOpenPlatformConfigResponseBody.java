// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDingtalkOpenPlatformConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDingtalkOpenPlatformConfigResponseBody</p>
 */
public class DeleteDingtalkOpenPlatformConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteDingtalkOpenPlatformConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDingtalkOpenPlatformConfigResponseBody create() {
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

        public DeleteDingtalkOpenPlatformConfigResponseBody build() {
            return new DeleteDingtalkOpenPlatformConfigResponseBody(this);
        } 

    } 

}
