// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssCallbackSettingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssCallbackSettingResponseBody</p>
 */
public class DescribeOssCallbackSettingResponseBody extends TeaModel {
    @NameInMap("AuditCallback")
    private Boolean auditCallback;

    @NameInMap("CallbackSeed")
    private String callbackSeed;

    @NameInMap("CallbackUrl")
    private String callbackUrl;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScanCallback")
    private Boolean scanCallback;

    @NameInMap("ScanCallbackSuggestions")
    private java.util.List < String > scanCallbackSuggestions;

    @NameInMap("ServiceModules")
    private java.util.List < String > serviceModules;

    private DescribeOssCallbackSettingResponseBody(Builder builder) {
        this.auditCallback = builder.auditCallback;
        this.callbackSeed = builder.callbackSeed;
        this.callbackUrl = builder.callbackUrl;
        this.requestId = builder.requestId;
        this.scanCallback = builder.scanCallback;
        this.scanCallbackSuggestions = builder.scanCallbackSuggestions;
        this.serviceModules = builder.serviceModules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssCallbackSettingResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
    public java.util.List < String > getScanCallbackSuggestions() {
        return this.scanCallbackSuggestions;
    }

    /**
     * @return serviceModules
     */
    public java.util.List < String > getServiceModules() {
        return this.serviceModules;
    }

    public static final class Builder {
        private Boolean auditCallback; 
        private String callbackSeed; 
        private String callbackUrl; 
        private String requestId; 
        private Boolean scanCallback; 
        private java.util.List < String > scanCallbackSuggestions; 
        private java.util.List < String > serviceModules; 

        /**
         * AuditCallback.
         */
        public Builder auditCallback(Boolean auditCallback) {
            this.auditCallback = auditCallback;
            return this;
        }

        /**
         * CallbackSeed.
         */
        public Builder callbackSeed(String callbackSeed) {
            this.callbackSeed = callbackSeed;
            return this;
        }

        /**
         * CallbackUrl.
         */
        public Builder callbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
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
         * ScanCallback.
         */
        public Builder scanCallback(Boolean scanCallback) {
            this.scanCallback = scanCallback;
            return this;
        }

        /**
         * ScanCallbackSuggestions.
         */
        public Builder scanCallbackSuggestions(java.util.List < String > scanCallbackSuggestions) {
            this.scanCallbackSuggestions = scanCallbackSuggestions;
            return this;
        }

        /**
         * ServiceModules.
         */
        public Builder serviceModules(java.util.List < String > serviceModules) {
            this.serviceModules = serviceModules;
            return this;
        }

        public DescribeOssCallbackSettingResponseBody build() {
            return new DescribeOssCallbackSettingResponseBody(this);
        } 

    } 

}
