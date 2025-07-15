// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateLiveStreamMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLiveStreamMonitorResponseBody</p>
 */
public class CreateLiveStreamMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MonitorId")
    private String monitorId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateLiveStreamMonitorResponseBody model) {
            this.monitorId = model.monitorId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the monitoring session.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        public Builder monitorId(String monitorId) {
            this.monitorId = monitorId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5c6a2a0d-f228-4a64-af62-20e91b9676b3</p>
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
