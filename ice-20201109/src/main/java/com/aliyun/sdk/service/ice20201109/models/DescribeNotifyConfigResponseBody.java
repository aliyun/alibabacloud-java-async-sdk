// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNotifyConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNotifyConfigResponseBody</p>
 */
public class DescribeNotifyConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.NameInMap("EnableNotify")
    private Boolean enableNotify;

    @com.aliyun.core.annotation.NameInMap("EventTypes")
    private String eventTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private DescribeNotifyConfigResponseBody(Builder builder) {
        this.callbackUrl = builder.callbackUrl;
        this.enableNotify = builder.enableNotify;
        this.eventTypes = builder.eventTypes;
        this.requestId = builder.requestId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNotifyConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return enableNotify
     */
    public Boolean getEnableNotify() {
        return this.enableNotify;
    }

    /**
     * @return eventTypes
     */
    public String getEventTypes() {
        return this.eventTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder {
        private String callbackUrl; 
        private Boolean enableNotify; 
        private String eventTypes; 
        private String requestId; 
        private String token; 

        /**
         * CallbackUrl.
         */
        public Builder callbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * EnableNotify.
         */
        public Builder enableNotify(Boolean enableNotify) {
            this.enableNotify = enableNotify;
            return this;
        }

        /**
         * EventTypes.
         */
        public Builder eventTypes(String eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public DescribeNotifyConfigResponseBody build() {
            return new DescribeNotifyConfigResponseBody(this);
        } 

    } 

}
