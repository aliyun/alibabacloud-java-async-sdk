// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySessionByClientIdResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySessionByClientIdResponseBody</p>
 */
public class QuerySessionByClientIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OnlineStatus")
    private Boolean onlineStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QuerySessionByClientIdResponseBody(Builder builder) {
        this.onlineStatus = builder.onlineStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySessionByClientIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return onlineStatus
     */
    public Boolean getOnlineStatus() {
        return this.onlineStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean onlineStatus; 
        private String requestId; 

        /**
         * Indicates whether the ApsaraMQ for MQTT client is connected to the ApsaraMQ for MQTT broker. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder onlineStatus(Boolean onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }

        /**
         * The request ID. This parameter is a common parameter.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QuerySessionByClientIdResponseBody build() {
            return new QuerySessionByClientIdResponseBody(this);
        } 

    } 

}
