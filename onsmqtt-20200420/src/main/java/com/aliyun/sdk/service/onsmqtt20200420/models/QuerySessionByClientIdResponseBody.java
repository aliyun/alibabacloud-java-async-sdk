// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySessionByClientIdResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySessionByClientIdResponseBody</p>
 */
public class QuerySessionByClientIdResponseBody extends TeaModel {
    @NameInMap("OnlineStatus")
    private Boolean onlineStatus;

    @NameInMap("RequestId")
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
         * OnlineStatus.
         */
        public Builder onlineStatus(Boolean onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }

        /**
         * RequestId.
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
