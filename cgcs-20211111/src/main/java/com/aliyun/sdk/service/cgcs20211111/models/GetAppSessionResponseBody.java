// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppSessionResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppSessionResponseBody</p>
 */
public class GetAppSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.NameInMap("BizInfo")
    private BizInfo bizInfo;

    @com.aliyun.core.annotation.NameInMap("CustomSessionId")
    private String customSessionId;

    @com.aliyun.core.annotation.NameInMap("PlatformSessionId")
    private String platformSessionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetAppSessionResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.appVersion = builder.appVersion;
        this.bizInfo = builder.bizInfo;
        this.customSessionId = builder.customSessionId;
        this.platformSessionId = builder.platformSessionId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppSessionResponseBody create() {
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
     * @return bizInfo
     */
    public BizInfo getBizInfo() {
        return this.bizInfo;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String appId; 
        private String appVersion; 
        private BizInfo bizInfo; 
        private String customSessionId; 
        private String platformSessionId; 
        private String requestId; 
        private String status; 

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
         * 业务特定的信息，如会话启动/停止时间。
         */
        public Builder bizInfo(BizInfo bizInfo) {
            this.bizInfo = bizInfo;
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

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetAppSessionResponseBody build() {
            return new GetAppSessionResponseBody(this);
        } 

    } 

    public static class BizInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StopTime")
        private String stopTime;

        private BizInfo(Builder builder) {
            this.startTime = builder.startTime;
            this.stopTime = builder.stopTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizInfo create() {
            return builder().build();
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return stopTime
         */
        public String getStopTime() {
            return this.stopTime;
        }

        public static final class Builder {
            private String startTime; 
            private String stopTime; 

            /**
             * 会话启动时间
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * 会话停止时间
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            public BizInfo build() {
                return new BizInfo(this);
            } 

        } 

    }
}
