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
 * {@link ModifyLiveMessageAppCallbackRequest} extends {@link RequestModel}
 *
 * <p>ModifyLiveMessageAppCallbackRequest</p>
 */
public class ModifyLiveMessageAppCallbackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventCallbackUrl")
    private String eventCallbackUrl;

    private ModifyLiveMessageAppCallbackRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.dataCenter = builder.dataCenter;
        this.eventCallbackUrl = builder.eventCallbackUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLiveMessageAppCallbackRequest create() {
        return builder().build();
    }

@Override
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
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
    }

    /**
     * @return eventCallbackUrl
     */
    public String getEventCallbackUrl() {
        return this.eventCallbackUrl;
    }

    public static final class Builder extends Request.Builder<ModifyLiveMessageAppCallbackRequest, Builder> {
        private String appId; 
        private String dataCenter; 
        private String eventCallbackUrl; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLiveMessageAppCallbackRequest request) {
            super(request);
            this.appId = request.appId;
            this.dataCenter = request.dataCenter;
            this.eventCallbackUrl = request.eventCallbackUrl;
        } 

        /**
         * <p>The ID of the interactive messaging application whose callback settings you want to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a> operation to create the interactive messaging application. Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder dataCenter(String dataCenter) {
            this.putQueryParameter("DataCenter", dataCenter);
            this.dataCenter = dataCenter;
            return this;
        }

        /**
         * <p>The callback URL for events such as user logon, logoff, joining a group, and leaving a group. If you leave this parameter empty, callbacks are disabled. The callback URL must start with http:// or https:// and cannot contain a private IP address or a port number.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.aliyundoc.com/examplecallback">http://example.aliyundoc.com/examplecallback</a></p>
         */
        public Builder eventCallbackUrl(String eventCallbackUrl) {
            this.putQueryParameter("EventCallbackUrl", eventCallbackUrl);
            this.eventCallbackUrl = eventCallbackUrl;
            return this;
        }

        @Override
        public ModifyLiveMessageAppCallbackRequest build() {
            return new ModifyLiveMessageAppCallbackRequest(this);
        } 

    } 

}
