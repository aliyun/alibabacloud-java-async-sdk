// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>PushMonitorResponseBody</p>
 */
public class PushMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Object data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private PushMonitorResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushMonitorResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Object getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Object data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PushMonitorResponseBody build() {
            return new PushMonitorResponseBody(this);
        } 

    } 

}
