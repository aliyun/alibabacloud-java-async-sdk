// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMonitorItemResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMonitorItemResponseBody</p>
 */
public class CreateMonitorItemResponseBody extends TeaModel {
    @NameInMap("MonitorItemId")
    private String monitorItemId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateMonitorItemResponseBody(Builder builder) {
        this.monitorItemId = builder.monitorItemId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorItemResponseBody create() {
        return builder().build();
    }

    /**
     * @return monitorItemId
     */
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String monitorItemId; 
        private String requestId; 

        /**
         * MonitorItemId.
         */
        public Builder monitorItemId(String monitorItemId) {
            this.monitorItemId = monitorItemId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMonitorItemResponseBody build() {
            return new CreateMonitorItemResponseBody(this);
        } 

    } 

}
