// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SendLiveSnapshotJobCommandResponseBody} extends {@link TeaModel}
 *
 * <p>SendLiveSnapshotJobCommandResponseBody</p>
 */
public class SendLiveSnapshotJobCommandResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SendLiveSnapshotJobCommandResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendLiveSnapshotJobCommandResponseBody create() {
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

        public SendLiveSnapshotJobCommandResponseBody build() {
            return new SendLiveSnapshotJobCommandResponseBody(this);
        } 

    } 

}
