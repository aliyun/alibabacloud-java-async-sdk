// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20210112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadSampleApiResponseBody} extends {@link TeaModel}
 *
 * <p>UploadSampleApiResponseBody</p>
 */
public class UploadSampleApiResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UploadSampleApiResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadSampleApiResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UploadSampleApiResponseBody build() {
            return new UploadSampleApiResponseBody(this);
        } 

    } 

}
