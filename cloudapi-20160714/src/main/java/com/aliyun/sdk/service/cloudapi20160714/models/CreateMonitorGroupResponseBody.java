// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMonitorGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMonitorGroupResponseBody</p>
 */
public class CreateMonitorGroupResponseBody extends TeaModel {
    @NameInMap("MonitorGroupId")
    private Long monitorGroupId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateMonitorGroupResponseBody(Builder builder) {
        this.monitorGroupId = builder.monitorGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return monitorGroupId
     */
    public Long getMonitorGroupId() {
        return this.monitorGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long monitorGroupId; 
        private String requestId; 

        /**
         * The ID of the request.
         */
        public Builder monitorGroupId(Long monitorGroupId) {
            this.monitorGroupId = monitorGroupId;
            return this;
        }

        /**
         * auditing
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMonitorGroupResponseBody build() {
            return new CreateMonitorGroupResponseBody(this);
        } 

    } 

}
