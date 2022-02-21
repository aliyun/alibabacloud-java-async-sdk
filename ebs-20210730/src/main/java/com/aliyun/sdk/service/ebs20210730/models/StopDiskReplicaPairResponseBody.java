// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDiskReplicaPairResponseBody} extends {@link TeaModel}
 *
 * <p>StopDiskReplicaPairResponseBody</p>
 */
public class StopDiskReplicaPairResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private StopDiskReplicaPairResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopDiskReplicaPairResponseBody create() {
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

        public StopDiskReplicaPairResponseBody build() {
            return new StopDiskReplicaPairResponseBody(this);
        } 

    } 

}
