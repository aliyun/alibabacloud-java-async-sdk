// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDiskMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>StopDiskMonitorResponseBody</p>
 */
public class StopDiskMonitorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private StopDiskMonitorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopDiskMonitorResponseBody create() {
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

        public StopDiskMonitorResponseBody build() {
            return new StopDiskMonitorResponseBody(this);
        } 

    } 

}
