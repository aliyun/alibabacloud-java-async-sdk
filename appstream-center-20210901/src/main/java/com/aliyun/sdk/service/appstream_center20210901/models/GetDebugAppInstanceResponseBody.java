// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDebugAppInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetDebugAppInstanceResponseBody</p>
 */
public class GetDebugAppInstanceResponseBody extends TeaModel {
    @NameInMap("AppId")
    private String appId;

    @NameInMap("AppInstanceGroupId")
    private String appInstanceGroupId;

    @NameInMap("AppInstanceId")
    private String appInstanceId;

    @NameInMap("AppVersion")
    private String appVersion;

    @NameInMap("AuthCode")
    private String authCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserId")
    private String userId;

    private GetDebugAppInstanceResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceId = builder.appInstanceId;
        this.appVersion = builder.appVersion;
        this.authCode = builder.authCode;
        this.requestId = builder.requestId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDebugAppInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return appInstanceId
     */
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return authCode
     */
    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String appId; 
        private String appInstanceGroupId; 
        private String appInstanceId; 
        private String appVersion; 
        private String authCode; 
        private String requestId; 
        private String userId; 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * AppInstanceGroupId.
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * AppInstanceId.
         */
        public Builder appInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
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
         * AuthCode.
         */
        public Builder authCode(String authCode) {
            this.authCode = authCode;
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
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public GetDebugAppInstanceResponseBody build() {
            return new GetDebugAppInstanceResponseBody(this);
        } 

    } 

}
