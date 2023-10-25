// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAccessLogsDownloadAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAccessLogsDownloadAttributeResponseBody</p>
 */
public class DeleteAccessLogsDownloadAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteAccessLogsDownloadAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAccessLogsDownloadAttributeResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteAccessLogsDownloadAttributeResponseBody build() {
            return new DeleteAccessLogsDownloadAttributeResponseBody(this);
        } 

    } 

}
