// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudwifi_pop20191118.models;

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
 * {@link NewJobOrderRequest} extends {@link RequestModel}
 *
 * <p>NewJobOrderRequest</p>
 */
public class NewJobOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String changeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientSystem")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientSystem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReferUrl")
    private String referUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private NewJobOrderRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.callbackUrl = builder.callbackUrl;
        this.changeType = builder.changeType;
        this.clientSystem = builder.clientSystem;
        this.clientUniqueId = builder.clientUniqueId;
        this.creator = builder.creator;
        this.params = builder.params;
        this.referUrl = builder.referUrl;
        this.requestId = builder.requestId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NewJobOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return changeType
     */
    public String getChangeType() {
        return this.changeType;
    }

    /**
     * @return clientSystem
     */
    public String getClientSystem() {
        return this.clientSystem;
    }

    /**
     * @return clientUniqueId
     */
    public String getClientUniqueId() {
        return this.clientUniqueId;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return params
     */
    public java.util.Map<String, ?> getParams() {
        return this.params;
    }

    /**
     * @return referUrl
     */
    public String getReferUrl() {
        return this.referUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<NewJobOrderRequest, Builder> {
        private String appCode; 
        private String appName; 
        private String callbackUrl; 
        private String changeType; 
        private String clientSystem; 
        private String clientUniqueId; 
        private String creator; 
        private java.util.Map<String, ?> params; 
        private String referUrl; 
        private String requestId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(NewJobOrderRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.callbackUrl = request.callbackUrl;
            this.changeType = request.changeType;
            this.clientSystem = request.clientSystem;
            this.clientUniqueId = request.clientUniqueId;
            this.creator = request.creator;
            this.params = request.params;
            this.referUrl = request.referUrl;
            this.requestId = request.requestId;
            this.title = request.title;
        } 

        /**
         * AppCode.
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * CallbackUrl.
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder changeType(String changeType) {
            this.putQueryParameter("ChangeType", changeType);
            this.changeType = changeType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clientSystem(String clientSystem) {
            this.putQueryParameter("ClientSystem", clientSystem);
            this.clientSystem = clientSystem;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clientUniqueId(String clientUniqueId) {
            this.putQueryParameter("ClientUniqueId", clientUniqueId);
            this.clientUniqueId = clientUniqueId;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.putQueryParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder params(java.util.Map<String, ?> params) {
            String paramsShrink = shrink(params, "Params", "json");
            this.putBodyParameter("Params", paramsShrink);
            this.params = params;
            return this;
        }

        /**
         * ReferUrl.
         */
        public Builder referUrl(String referUrl) {
            this.putQueryParameter("ReferUrl", referUrl);
            this.referUrl = referUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public NewJobOrderRequest build() {
            return new NewJobOrderRequest(this);
        } 

    } 

}
