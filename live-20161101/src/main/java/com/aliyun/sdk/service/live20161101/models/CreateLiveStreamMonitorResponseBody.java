// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLiveStreamMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLiveStreamMonitorResponseBody</p>
 */
public class CreateLiveStreamMonitorResponseBody extends TeaModel {
    @NameInMap("MonitorId")
    private String monitorId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateLiveStreamMonitorResponseBody(Builder builder) {
        this.monitorId = builder.monitorId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLiveStreamMonitorResponseBody create() {
        return builder().build();
    }

    /**
     * @return monitorId
     */
    public String getMonitorId() {
        return this.monitorId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String monitorId; 
        private String requestId; 

        /**
         * MonitorId.
         */
        public Builder monitorId(String monitorId) {
            this.monitorId = monitorId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateLiveStreamMonitorResponseBody build() {
            return new CreateLiveStreamMonitorResponseBody(this);
        } 

    } 

}
