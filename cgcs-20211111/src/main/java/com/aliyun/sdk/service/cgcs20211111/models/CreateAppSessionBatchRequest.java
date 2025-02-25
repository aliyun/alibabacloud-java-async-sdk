// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppSessionBatchRequest} extends {@link RequestModel}
 *
 * <p>CreateAppSessionBatchRequest</p>
 */
public class CreateAppSessionBatchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInfos")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < AppInfos> appInfos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomTaskId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String customTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 4320, minimum = 1)
    private Integer timeout;

    private CreateAppSessionBatchRequest(Builder builder) {
        super(builder);
        this.appInfos = builder.appInfos;
        this.customTaskId = builder.customTaskId;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppSessionBatchRequest create() {
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
     * @return customTaskId
     */
    public String getCustomTaskId() {
        return this.customTaskId;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<CreateAppSessionBatchRequest, Builder> {
        private java.util.List < AppInfos> appInfos; 
        private String customTaskId; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppSessionBatchRequest request) {
            super(request);
            this.appInfos = request.appInfos;
            this.customTaskId = request.customTaskId;
            this.timeout = request.timeout;
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
         * CustomTaskId.
         */
        public Builder customTaskId(String customTaskId) {
            this.putQueryParameter("CustomTaskId", customTaskId);
            this.customTaskId = customTaskId;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public CreateAppSessionBatchRequest build() {
            return new CreateAppSessionBatchRequest(this);
        } 

    } 

    public static class StoreInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private StoreInfo(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StoreInfo create() {
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

            public StoreInfo build() {
                return new StoreInfo(this);
            } 

        } 

    }
    public static class ResultStore extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Need")
        private Boolean need;

        @com.aliyun.core.annotation.NameInMap("StoreInfo")
        private java.util.List < StoreInfo> storeInfo;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ResultStore(Builder builder) {
            this.need = builder.need;
            this.storeInfo = builder.storeInfo;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultStore create() {
            return builder().build();
        }

        /**
         * @return need
         */
        public Boolean getNeed() {
            return this.need;
        }

        /**
         * @return storeInfo
         */
        public java.util.List < StoreInfo> getStoreInfo() {
            return this.storeInfo;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean need; 
            private java.util.List < StoreInfo> storeInfo; 
            private String type; 

            /**
             * Need.
             */
            public Builder need(Boolean need) {
                this.need = need;
                return this;
            }

            /**
             * StoreInfo.
             */
            public Builder storeInfo(java.util.List < StoreInfo> storeInfo) {
                this.storeInfo = storeInfo;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ResultStore build() {
                return new ResultStore(this);
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

        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("DistrictId")
        private String districtId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ResultStore")
        private ResultStore resultStore;

        @com.aliyun.core.annotation.NameInMap("StartParameters")
        private java.util.List < StartParameters> startParameters;

        @com.aliyun.core.annotation.NameInMap("SystemInfo")
        private java.util.List < SystemInfo> systemInfo;

        private AppInfos(Builder builder) {
            this.adapterFileId = builder.adapterFileId;
            this.appId = builder.appId;
            this.appVersion = builder.appVersion;
            this.clientIp = builder.clientIp;
            this.customUserId = builder.customUserId;
            this.customerSessionId = builder.customerSessionId;
            this.datasetId = builder.datasetId;
            this.districtId = builder.districtId;
            this.projectId = builder.projectId;
            this.resultStore = builder.resultStore;
            this.startParameters = builder.startParameters;
            this.systemInfo = builder.systemInfo;
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
         * @return datasetId
         */
        public String getDatasetId() {
            return this.datasetId;
        }

        /**
         * @return districtId
         */
        public String getDistrictId() {
            return this.districtId;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return resultStore
         */
        public ResultStore getResultStore() {
            return this.resultStore;
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

        public static final class Builder {
            private String adapterFileId; 
            private String appId; 
            private String appVersion; 
            private String clientIp; 
            private String customUserId; 
            private String customerSessionId; 
            private String datasetId; 
            private String districtId; 
            private String projectId; 
            private ResultStore resultStore; 
            private java.util.List < StartParameters> startParameters; 
            private java.util.List < SystemInfo> systemInfo; 

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
             * DatasetId.
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
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
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ResultStore.
             */
            public Builder resultStore(ResultStore resultStore) {
                this.resultStore = resultStore;
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

            public AppInfos build() {
                return new AppInfos(this);
            } 

        } 

    }
}
