// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppSessionBatchSyncRequest} extends {@link RequestModel}
 *
 * <p>CreateAppSessionBatchSyncRequest</p>
 */
public class CreateAppSessionBatchSyncRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInfos")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < AppInfos> appInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String batchId;

    private CreateAppSessionBatchSyncRequest(Builder builder) {
        super(builder);
        this.appInfos = builder.appInfos;
        this.batchId = builder.batchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppSessionBatchSyncRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInfos
     */
    public java.util.List < AppInfos> getAppInfos() {
        return this.appInfos;
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    public static final class Builder extends Request.Builder<CreateAppSessionBatchSyncRequest, Builder> {
        private java.util.List < AppInfos> appInfos; 
        private String batchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppSessionBatchSyncRequest request) {
            super(request);
            this.appInfos = request.appInfos;
            this.batchId = request.batchId;
        } 

        /**
         * AppInfos.
         */
        public Builder appInfos(java.util.List < AppInfos> appInfos) {
            String appInfosShrink = shrink(appInfos, "AppInfos", "json");
            this.putQueryParameter("AppInfos", appInfosShrink);
            this.appInfos = appInfos;
            return this;
        }

        /**
         * BatchId.
         */
        public Builder batchId(String batchId) {
            this.putQueryParameter("BatchId", batchId);
            this.batchId = batchId;
            return this;
        }

        @Override
        public CreateAppSessionBatchSyncRequest build() {
            return new CreateAppSessionBatchSyncRequest(this);
        } 

    } 

    public static class MatchRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List < String > values;

        private MatchRules(Builder builder) {
            this.key = builder.key;
            this.type = builder.type;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchRules create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private String type; 
            private java.util.List < String > values; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public MatchRules build() {
                return new MatchRules(this);
            } 

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
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class AppInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdapterFileId")
        private String adapterFileId;

        @com.aliyun.core.annotation.NameInMap("AppId")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("CustomUserId")
        private String customUserId;

        @com.aliyun.core.annotation.NameInMap("CustomerSessionId")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
        private String customerSessionId;

        @com.aliyun.core.annotation.NameInMap("DistrictId")
        private String districtId;

        @com.aliyun.core.annotation.NameInMap("MatchRules")
        private java.util.List < MatchRules> matchRules;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("StartParameters")
        private java.util.List < StartParameters> startParameters;

        @com.aliyun.core.annotation.NameInMap("SystemInfo")
        private java.util.List < SystemInfo> systemInfo;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        private AppInfos(Builder builder) {
            this.adapterFileId = builder.adapterFileId;
            this.appId = builder.appId;
            this.appVersion = builder.appVersion;
            this.clientIp = builder.clientIp;
            this.customUserId = builder.customUserId;
            this.customerSessionId = builder.customerSessionId;
            this.districtId = builder.districtId;
            this.matchRules = builder.matchRules;
            this.projectId = builder.projectId;
            this.startParameters = builder.startParameters;
            this.systemInfo = builder.systemInfo;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInfos create() {
            return builder().build();
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
         * @return customUserId
         */
        public String getCustomUserId() {
            return this.customUserId;
        }

        /**
         * @return customerSessionId
         */
        public String getCustomerSessionId() {
            return this.customerSessionId;
        }

        /**
         * @return districtId
         */
        public String getDistrictId() {
            return this.districtId;
        }

        /**
         * @return matchRules
         */
        public java.util.List < MatchRules> getMatchRules() {
            return this.matchRules;
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
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String adapterFileId; 
            private String appId; 
            private String appVersion; 
            private String clientIp; 
            private String customUserId; 
            private String customerSessionId; 
            private String districtId; 
            private java.util.List < MatchRules> matchRules; 
            private String projectId; 
            private java.util.List < StartParameters> startParameters; 
            private java.util.List < SystemInfo> systemInfo; 
            private java.util.List < Tags> tags; 

            /**
             * AdapterFileId.
             */
            public Builder adapterFileId(String adapterFileId) {
                this.adapterFileId = adapterFileId;
                return this;
            }

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
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * CustomUserId.
             */
            public Builder customUserId(String customUserId) {
                this.customUserId = customUserId;
                return this;
            }

            /**
             * CustomerSessionId.
             */
            public Builder customerSessionId(String customerSessionId) {
                this.customerSessionId = customerSessionId;
                return this;
            }

            /**
             * DistrictId.
             */
            public Builder districtId(String districtId) {
                this.districtId = districtId;
                return this;
            }

            /**
             * MatchRules.
             */
            public Builder matchRules(java.util.List < MatchRules> matchRules) {
                this.matchRules = matchRules;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * StartParameters.
             */
            public Builder startParameters(java.util.List < StartParameters> startParameters) {
                this.startParameters = startParameters;
                return this;
            }

            /**
             * SystemInfo.
             */
            public Builder systemInfo(java.util.List < SystemInfo> systemInfo) {
                this.systemInfo = systemInfo;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public AppInfos build() {
                return new AppInfos(this);
            } 

        } 

    }
}
