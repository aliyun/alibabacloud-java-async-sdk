// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOssCallbackSettingRequest} extends {@link RequestModel}
 *
 * <p>UpdateOssCallbackSettingRequest</p>
 */
public class UpdateOssCallbackSettingRequest extends Request {
    @Query
    @NameInMap("AuditCallback")
    private Boolean auditCallback;

    @Query
    @NameInMap("CallbackSeed")
    private String callbackSeed;

    @Query
    @NameInMap("CallbackUrl")
    private String callbackUrl;

    @Query
    @NameInMap("ScanCallback")
    private Boolean scanCallback;

    @Query
    @NameInMap("ScanCallbackSuggestions")
    private String scanCallbackSuggestions;

    @Query
    @NameInMap("ServiceModules")
    private String serviceModules;

    private UpdateOssCallbackSettingRequest(Builder builder) {
        super(builder);
        this.auditCallback = builder.auditCallback;
        this.callbackSeed = builder.callbackSeed;
        this.callbackUrl = builder.callbackUrl;
        this.scanCallback = builder.scanCallback;
        this.scanCallbackSuggestions = builder.scanCallbackSuggestions;
        this.serviceModules = builder.serviceModules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOssCallbackSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditCallback
     */
    public Boolean getAuditCallback() {
        return this.auditCallback;
    }

    /**
     * @return callbackSeed
     */
    public String getCallbackSeed() {
        return this.callbackSeed;
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return scanCallback
     */
    public Boolean getScanCallback() {
        return this.scanCallback;
    }

    /**
     * @return scanCallbackSuggestions
     */
    public String getScanCallbackSuggestions() {
        return this.scanCallbackSuggestions;
    }

    /**
     * @return serviceModules
     */
    public String getServiceModules() {
        return this.serviceModules;
    }

    public static final class Builder extends Request.Builder<UpdateOssCallbackSettingRequest, Builder> {
        private Boolean auditCallback; 
        private String callbackSeed; 
        private String callbackUrl; 
        private Boolean scanCallback; 
        private String scanCallbackSuggestions; 
        private String serviceModules; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOssCallbackSettingRequest request) {
            super(request);
            this.auditCallback = request.auditCallback;
            this.callbackSeed = request.callbackSeed;
            this.callbackUrl = request.callbackUrl;
            this.scanCallback = request.scanCallback;
            this.scanCallbackSuggestions = request.scanCallbackSuggestions;
            this.serviceModules = request.serviceModules;
        } 

        /**
         * AuditCallback.
         */
        public Builder auditCallback(Boolean auditCallback) {
            this.putQueryParameter("AuditCallback", auditCallback);
            this.auditCallback = auditCallback;
            return this;
        }

        /**
         * CallbackSeed.
         */
        public Builder callbackSeed(String callbackSeed) {
            this.putQueryParameter("CallbackSeed", callbackSeed);
            this.callbackSeed = callbackSeed;
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
         * ScanCallback.
         */
        public Builder scanCallback(Boolean scanCallback) {
            this.putQueryParameter("ScanCallback", scanCallback);
            this.scanCallback = scanCallback;
            return this;
        }

        /**
         * ScanCallbackSuggestions.
         */
        public Builder scanCallbackSuggestions(String scanCallbackSuggestions) {
            this.putQueryParameter("ScanCallbackSuggestions", scanCallbackSuggestions);
            this.scanCallbackSuggestions = scanCallbackSuggestions;
            return this;
        }

        /**
         * ServiceModules.
         */
        public Builder serviceModules(String serviceModules) {
            this.putQueryParameter("ServiceModules", serviceModules);
            this.serviceModules = serviceModules;
            return this;
        }

        @Override
        public UpdateOssCallbackSettingRequest build() {
            return new UpdateOssCallbackSettingRequest(this);
        } 

    } 

}
