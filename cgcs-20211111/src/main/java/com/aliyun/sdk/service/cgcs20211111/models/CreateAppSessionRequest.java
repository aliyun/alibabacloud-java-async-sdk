// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppSessionRequest} extends {@link RequestModel}
 *
 * <p>CreateAppSessionRequest</p>
 */
public class CreateAppSessionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdapterFileId")
    private String adapterFileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIp")
    private String clientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomSessionId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String customSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomUserId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String customUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DistrictId")
    private String districtId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnablePostpaid")
    private Boolean enablePostpaid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartParameters")
    private java.util.List < StartParameters> startParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemInfo")
    private java.util.List < SystemInfo> systemInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Long timeout;

    private CreateAppSessionRequest(Builder builder) {
        super(builder);
        this.adapterFileId = builder.adapterFileId;
        this.appId = builder.appId;
        this.appVersion = builder.appVersion;
        this.clientIp = builder.clientIp;
        this.customSessionId = builder.customSessionId;
        this.customUserId = builder.customUserId;
        this.districtId = builder.districtId;
        this.enablePostpaid = builder.enablePostpaid;
        this.projectId = builder.projectId;
        this.startParameters = builder.startParameters;
        this.systemInfo = builder.systemInfo;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppSessionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adapterFileId
     */
    public String getAdapterFileId() {
        return this.adapterFileId;
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
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return customSessionId
     */
    public String getCustomSessionId() {
        return this.customSessionId;
    }

    /**
     * @return customUserId
     */
    public String getCustomUserId() {
        return this.customUserId;
    }

    /**
     * @return districtId
     */
    public String getDistrictId() {
        return this.districtId;
    }

    /**
     * @return enablePostpaid
     */
    public Boolean getEnablePostpaid() {
        return this.enablePostpaid;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return startParameters
     */
    public java.util.List < StartParameters> getStartParameters() {
        return this.startParameters;
    }

    /**
     * @return systemInfo
     */
    public java.util.List < SystemInfo> getSystemInfo() {
        return this.systemInfo;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<CreateAppSessionRequest, Builder> {
        private String adapterFileId; 
        private String appId; 
        private String appVersion; 
        private String clientIp; 
        private String customSessionId; 
        private String customUserId; 
        private String districtId; 
        private Boolean enablePostpaid; 
        private String projectId; 
        private java.util.List < StartParameters> startParameters; 
        private java.util.List < SystemInfo> systemInfo; 
        private Long timeout; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppSessionRequest request) {
            super(request);
            this.adapterFileId = request.adapterFileId;
            this.appId = request.appId;
            this.appVersion = request.appVersion;
            this.clientIp = request.clientIp;
            this.customSessionId = request.customSessionId;
            this.customUserId = request.customUserId;
            this.districtId = request.districtId;
            this.enablePostpaid = request.enablePostpaid;
            this.projectId = request.projectId;
            this.startParameters = request.startParameters;
            this.systemInfo = request.systemInfo;
            this.timeout = request.timeout;
        } 

        /**
         * 适配文件ID。此功能灰度开放，如未约定使用请勿传入。
         */
        public Builder adapterFileId(String adapterFileId) {
            this.putQueryParameter("AdapterFileId", adapterFileId);
            this.adapterFileId = adapterFileId;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.putQueryParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * ClientIp.
         */
        public Builder clientIp(String clientIp) {
            this.putQueryParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * CustomSessionId.
         */
        public Builder customSessionId(String customSessionId) {
            this.putQueryParameter("CustomSessionId", customSessionId);
            this.customSessionId = customSessionId;
            return this;
        }

        /**
         * CustomUserId.
         */
        public Builder customUserId(String customUserId) {
            this.putQueryParameter("CustomUserId", customUserId);
            this.customUserId = customUserId;
            return this;
        }

        /**
         * DistrictId.
         */
        public Builder districtId(String districtId) {
            this.putQueryParameter("DistrictId", districtId);
            this.districtId = districtId;
            return this;
        }

        /**
         * EnablePostpaid.
         */
        public Builder enablePostpaid(Boolean enablePostpaid) {
            this.putQueryParameter("EnablePostpaid", enablePostpaid);
            this.enablePostpaid = enablePostpaid;
            return this;
        }

        /**
         * 项目ID。如果已将应用关联到项目，创建会话时需填写正确的项目ID。
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * StartParameters.
         */
        public Builder startParameters(java.util.List < StartParameters> startParameters) {
            this.putQueryParameter("StartParameters", startParameters);
            this.startParameters = startParameters;
            return this;
        }

        /**
         * SystemInfo.
         */
        public Builder systemInfo(java.util.List < SystemInfo> systemInfo) {
            this.putQueryParameter("SystemInfo", systemInfo);
            this.systemInfo = systemInfo;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public CreateAppSessionRequest build() {
            return new CreateAppSessionRequest(this);
        } 

    } 

    public static class StartParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private StartParameters(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StartParameters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public StartParameters build() {
                return new StartParameters(this);
            } 

        } 

    }
    public static class SystemInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SystemInfo(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemInfo create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SystemInfo build() {
                return new SystemInfo(this);
            } 

        } 

    }
}
