// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGtmMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>AddGtmMonitorResponseBody</p>
 */
public class AddGtmMonitorResponseBody extends TeaModel {
    @NameInMap("MonitorConfigId")
    private String monitorConfigId;

    @NameInMap("RequestId")
    private String requestId;

    private AddGtmMonitorResponseBody(Builder builder) {
        this.monitorConfigId = builder.monitorConfigId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGtmMonitorResponseBody create() {
        return builder().build();
    }

    /**
     * @return monitorConfigId
     */
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String monitorConfigId; 
        private String requestId; 

        /**
         * MonitorConfigId.
         */
        public Builder monitorConfigId(String monitorConfigId) {
            this.monitorConfigId = monitorConfigId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddGtmMonitorResponseBody build() {
            return new AddGtmMonitorResponseBody(this);
        } 

    } 

}
