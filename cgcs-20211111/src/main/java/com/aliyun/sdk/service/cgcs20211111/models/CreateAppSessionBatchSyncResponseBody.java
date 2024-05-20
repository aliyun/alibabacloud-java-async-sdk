// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppSessionBatchSyncResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAppSessionBatchSyncResponseBody</p>
 */
public class CreateAppSessionBatchSyncResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BatchId")
    private String batchId;

    @com.aliyun.core.annotation.NameInMap("FailedList")
    private java.util.List < FailedList> failedList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultList")
    private java.util.List < ResultList> resultList;

    private CreateAppSessionBatchSyncResponseBody(Builder builder) {
        this.batchId = builder.batchId;
        this.failedList = builder.failedList;
        this.requestId = builder.requestId;
        this.resultList = builder.resultList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppSessionBatchSyncResponseBody create() {
        return builder().build();
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * @return failedList
     */
    public java.util.List < FailedList> getFailedList() {
        return this.failedList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultList
     */
    public java.util.List < ResultList> getResultList() {
        return this.resultList;
    }

    public static final class Builder {
        private String batchId; 
        private java.util.List < FailedList> failedList; 
        private String requestId; 
        private java.util.List < ResultList> resultList; 

        /**
         * BatchId.
         */
        public Builder batchId(String batchId) {
            this.batchId = batchId;
            return this;
        }

        /**
         * FailedList.
         */
        public Builder failedList(java.util.List < FailedList> failedList) {
            this.failedList = failedList;
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
         * ResultList.
         */
        public Builder resultList(java.util.List < ResultList> resultList) {
            this.resultList = resultList;
            return this;
        }

        public CreateAppSessionBatchSyncResponseBody build() {
            return new CreateAppSessionBatchSyncResponseBody(this);
        } 

    } 

    public static class FailedInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        private FailedInfo(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedInfo create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            public FailedInfo build() {
                return new FailedInfo(this);
            } 

        } 

    }
    public static class FailedList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CustomSessionId")
        private String customSessionId;

        @com.aliyun.core.annotation.NameInMap("FailedInfo")
        private FailedInfo failedInfo;

        private FailedList(Builder builder) {
            this.appId = builder.appId;
            this.customSessionId = builder.customSessionId;
            this.failedInfo = builder.failedInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return customSessionId
         */
        public String getCustomSessionId() {
            return this.customSessionId;
        }

        /**
         * @return failedInfo
         */
        public FailedInfo getFailedInfo() {
            return this.failedInfo;
        }

        public static final class Builder {
            private String appId; 
            private String customSessionId; 
            private FailedInfo failedInfo; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
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
             * FailedInfo.
             */
            public Builder failedInfo(FailedInfo failedInfo) {
                this.failedInfo = failedInfo;
                return this;
            }

            public FailedList build() {
                return new FailedList(this);
            } 

        } 

    }
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessHost")
        private String accessHost;

        @com.aliyun.core.annotation.NameInMap("AccessPort")
        private String accessPort;

        @com.aliyun.core.annotation.NameInMap("DistrictId")
        private String districtId;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Endpoints(Builder builder) {
            this.accessHost = builder.accessHost;
            this.accessPort = builder.accessPort;
            this.districtId = builder.districtId;
            this.isp = builder.isp;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return accessHost
         */
        public String getAccessHost() {
            return this.accessHost;
        }

        /**
         * @return accessPort
         */
        public String getAccessPort() {
            return this.accessPort;
        }

        /**
         * @return districtId
         */
        public String getDistrictId() {
            return this.districtId;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String accessHost; 
            private String accessPort; 
            private String districtId; 
            private String isp; 
            private String name; 
            private String type; 

            /**
             * AccessHost.
             */
            public Builder accessHost(String accessHost) {
                this.accessHost = accessHost;
                return this;
            }

            /**
             * AccessPort.
             */
            public Builder accessPort(String accessPort) {
                this.accessPort = accessPort;
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
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    public static class BizInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Biz")
        private java.util.Map < String, ? > biz;

        @com.aliyun.core.annotation.NameInMap("Endpoints")
        private java.util.List < Endpoints> endpoints;

        private BizInfo(Builder builder) {
            this.biz = builder.biz;
            this.endpoints = builder.endpoints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizInfo create() {
            return builder().build();
        }

        /**
         * @return biz
         */
        public java.util.Map < String, ? > getBiz() {
            return this.biz;
        }

        /**
         * @return endpoints
         */
        public java.util.List < Endpoints> getEndpoints() {
            return this.endpoints;
        }

        public static final class Builder {
            private java.util.Map < String, ? > biz; 
            private java.util.List < Endpoints> endpoints; 

            /**
             * Biz.
             */
            public Builder biz(java.util.Map < String, ? > biz) {
                this.biz = biz;
                return this;
            }

            /**
             * Endpoints.
             */
            public Builder endpoints(java.util.List < Endpoints> endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            public BizInfo build() {
                return new BizInfo(this);
            } 

        } 

    }
    public static class ResultList extends TeaModel {
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

        private ResultList(Builder builder) {
            this.appId = builder.appId;
            this.appVersion = builder.appVersion;
            this.bizInfo = builder.bizInfo;
            this.customSessionId = builder.customSessionId;
            this.platformSessionId = builder.platformSessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultList create() {
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

        public static final class Builder {
            private String appId; 
            private String appVersion; 
            private BizInfo bizInfo; 
            private String customSessionId; 
            private String platformSessionId; 

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
             * BizInfo.
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

            public ResultList build() {
                return new ResultList(this);
            } 

        } 

    }
}
