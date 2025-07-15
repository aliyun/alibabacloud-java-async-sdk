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
 * {@link ModifyLiveMessageAppCallbackResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyLiveMessageAppCallbackResponseBody</p>
 */
public class ModifyLiveMessageAppCallbackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AppSign")
    private String appSign;

    @com.aliyun.core.annotation.NameInMap("EventCallbackNeedAuthentication")
    private Boolean eventCallbackNeedAuthentication;

    @com.aliyun.core.annotation.NameInMap("EventCallbackUrl")
    private String eventCallbackUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyLiveMessageAppCallbackResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.appSign = builder.appSign;
        this.eventCallbackNeedAuthentication = builder.eventCallbackNeedAuthentication;
        this.eventCallbackUrl = builder.eventCallbackUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLiveMessageAppCallbackResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appSign
     */
    public String getAppSign() {
        return this.appSign;
    }

    /**
     * @return eventCallbackNeedAuthentication
     */
    public Boolean getEventCallbackNeedAuthentication() {
        return this.eventCallbackNeedAuthentication;
    }

    /**
     * @return eventCallbackUrl
     */
    public String getEventCallbackUrl() {
        return this.eventCallbackUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String appId; 
        private String appSign; 
        private Boolean eventCallbackNeedAuthentication; 
        private String eventCallbackUrl; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyLiveMessageAppCallbackResponseBody model) {
            this.appId = model.appId;
            this.appSign = model.appSign;
            this.eventCallbackNeedAuthentication = model.eventCallbackNeedAuthentication;
            this.eventCallbackUrl = model.eventCallbackUrl;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the interactive messaging application.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>The signature of the interactive messaging application. It is required by the interactive messaging SDK.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder appSign(String appSign) {
            this.appSign = appSign;
            return this;
        }

        /**
         * <p>Indicates whether authentication is required for event callbacks. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder eventCallbackNeedAuthentication(Boolean eventCallbackNeedAuthentication) {
            this.eventCallbackNeedAuthentication = eventCallbackNeedAuthentication;
            return this;
        }

        /**
         * <p>The callback URL for events such as user logon, logoff, joining a group, and leaving a group. This parameter is not returned if it has an empty value.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.aliyundoc.com/examplecallback">http://example.aliyundoc.com/examplecallback</a></p>
         */
        public Builder eventCallbackUrl(String eventCallbackUrl) {
            this.eventCallbackUrl = eventCallbackUrl;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1F0FFEAD-B7D5-1D4A-A6B9-8C63ADF6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyLiveMessageAppCallbackResponseBody build() {
            return new ModifyLiveMessageAppCallbackResponseBody(this);
        } 

    } 

}
