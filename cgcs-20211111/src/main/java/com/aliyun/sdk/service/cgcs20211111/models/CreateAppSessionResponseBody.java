// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppSessionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAppSessionResponseBody</p>
 */
public class CreateAppSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.NameInMap("CustomSessionId")
    private String customSessionId;

    @com.aliyun.core.annotation.NameInMap("PlatformSessionId")
    private String platformSessionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAppSessionResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.appVersion = builder.appVersion;
        this.customSessionId = builder.customSessionId;
        this.platformSessionId = builder.platformSessionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppSessionResponseBody create() {
        return builder().build();
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return customSessionId
     */
    public String getCustomSessionId() {
        return this.customSessionId;
    }

    /**
     * @return platformSessionId
     */
    public String getPlatformSessionId() {
        return this.platformSessionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String appId; 
        private String appVersion; 
        private String customSessionId; 
        private String platformSessionId; 
        private String requestId; 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }

        /**
         * CustomSessionId.
         */
        public Builder customSessionId(String customSessionId) {
            this.customSessionId = customSessionId;
            return this;
        }

        /**
         * PlatformSessionId.
         */
        public Builder platformSessionId(String platformSessionId) {
            this.platformSessionId = platformSessionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAppSessionResponseBody build() {
            return new CreateAppSessionResponseBody(this);
        } 

    } 

}
