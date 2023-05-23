// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationListWithMetircsResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationListWithMetircsResponseBody</p>
 */
public class GetApplicationListWithMetircsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetApplicationListWithMetircsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationListWithMetircsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * cluster not found
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * mse-100-001
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * system error
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetApplicationListWithMetircsResponseBody build() {
            return new GetApplicationListWithMetircsResponseBody(this);
        } 

    } 

    public static class CurMetrics extends TeaModel {
        @NameInMap("BlockQps")
        private Double blockQps;

        @NameInMap("ExpQps")
        private Double expQps;

        @NameInMap("PassQps")
        private Double passQps;

        @NameInMap("Qps")
        private Double qps;

        @NameInMap("Rt")
        private Double rt;

        @NameInMap("Thread")
        private Double thread;

        @NameInMap("Timestamp")
        private Long timestamp;

        private CurMetrics(Builder builder) {
            this.blockQps = builder.blockQps;
            this.expQps = builder.expQps;
            this.passQps = builder.passQps;
            this.qps = builder.qps;
            this.rt = builder.rt;
            this.thread = builder.thread;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurMetrics create() {
            return builder().build();
        }

        /**
         * @return blockQps
         */
        public Double getBlockQps() {
            return this.blockQps;
        }

        /**
         * @return expQps
         */
        public Double getExpQps() {
            return this.expQps;
        }

        /**
         * @return passQps
         */
        public Double getPassQps() {
            return this.passQps;
        }

        /**
         * @return qps
         */
        public Double getQps() {
            return this.qps;
        }

        /**
         * @return rt
         */
        public Double getRt() {
            return this.rt;
        }

        /**
         * @return thread
         */
        public Double getThread() {
            return this.thread;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Double blockQps; 
            private Double expQps; 
            private Double passQps; 
            private Double qps; 
            private Double rt; 
            private Double thread; 
            private Long timestamp; 

            /**
             * BlockQps.
             */
            public Builder blockQps(Double blockQps) {
                this.blockQps = blockQps;
                return this;
            }

            /**
             * ExpQps.
             */
            public Builder expQps(Double expQps) {
                this.expQps = expQps;
                return this;
            }

            /**
             * PassQps.
             */
            public Builder passQps(Double passQps) {
                this.passQps = passQps;
                return this;
            }

            /**
             * Qps.
             */
            public Builder qps(Double qps) {
                this.qps = qps;
                return this;
            }

            /**
             * Rt.
             */
            public Builder rt(Double rt) {
                this.rt = rt;
                return this;
            }

            /**
             * Thread.
             */
            public Builder thread(Double thread) {
                this.thread = thread;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public CurMetrics build() {
                return new CurMetrics(this);
            } 

        } 

    }
    public static class CurMetricsFm extends TeaModel {
        @NameInMap("BlockQps")
        private Double blockQps;

        @NameInMap("ExpQps")
        private Double expQps;

        @NameInMap("PassQps")
        private Double passQps;

        @NameInMap("Qps")
        private Double qps;

        @NameInMap("Rt")
        private Double rt;

        @NameInMap("Thread")
        private Double thread;

        @NameInMap("Timestamp")
        private Long timestamp;

        private CurMetricsFm(Builder builder) {
            this.blockQps = builder.blockQps;
            this.expQps = builder.expQps;
            this.passQps = builder.passQps;
            this.qps = builder.qps;
            this.rt = builder.rt;
            this.thread = builder.thread;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurMetricsFm create() {
            return builder().build();
        }

        /**
         * @return blockQps
         */
        public Double getBlockQps() {
            return this.blockQps;
        }

        /**
         * @return expQps
         */
        public Double getExpQps() {
            return this.expQps;
        }

        /**
         * @return passQps
         */
        public Double getPassQps() {
            return this.passQps;
        }

        /**
         * @return qps
         */
        public Double getQps() {
            return this.qps;
        }

        /**
         * @return rt
         */
        public Double getRt() {
            return this.rt;
        }

        /**
         * @return thread
         */
        public Double getThread() {
            return this.thread;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Double blockQps; 
            private Double expQps; 
            private Double passQps; 
            private Double qps; 
            private Double rt; 
            private Double thread; 
            private Long timestamp; 

            /**
             * BlockQps.
             */
            public Builder blockQps(Double blockQps) {
                this.blockQps = blockQps;
                return this;
            }

            /**
             * ExpQps.
             */
            public Builder expQps(Double expQps) {
                this.expQps = expQps;
                return this;
            }

            /**
             * PassQps.
             */
            public Builder passQps(Double passQps) {
                this.passQps = passQps;
                return this;
            }

            /**
             * Qps.
             */
            public Builder qps(Double qps) {
                this.qps = qps;
                return this;
            }

            /**
             * Rt.
             */
            public Builder rt(Double rt) {
                this.rt = rt;
                return this;
            }

            /**
             * Thread.
             */
            public Builder thread(Double thread) {
                this.thread = thread;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public CurMetricsFm build() {
                return new CurMetricsFm(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("AppType")
        private Integer appType;

        @NameInMap("CurMetrics")
        private java.util.List < CurMetrics> curMetrics;

        @NameInMap("CurMetricsFm")
        private CurMetricsFm curMetricsFm;

        @NameInMap("ExtraInfo")
        private String extraInfo;

        @NameInMap("InstancesNumber")
        private Integer instancesNumber;

        @NameInMap("Language")
        private String language;

        @NameInMap("LicenseKey")
        private String licenseKey;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Source")
        private String source;

        @NameInMap("Status")
        private Long status;

        @NameInMap("Tags")
        private java.util.List < String > tags;

        @NameInMap("UserId")
        private String userId;

        private Result(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appType = builder.appType;
            this.curMetrics = builder.curMetrics;
            this.curMetricsFm = builder.curMetricsFm;
            this.extraInfo = builder.extraInfo;
            this.instancesNumber = builder.instancesNumber;
            this.language = builder.language;
            this.licenseKey = builder.licenseKey;
            this.namespace = builder.namespace;
            this.regionId = builder.regionId;
            this.source = builder.source;
            this.status = builder.status;
            this.tags = builder.tags;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appType
         */
        public Integer getAppType() {
            return this.appType;
        }

        /**
         * @return curMetrics
         */
        public java.util.List < CurMetrics> getCurMetrics() {
            return this.curMetrics;
        }

        /**
         * @return curMetricsFm
         */
        public CurMetricsFm getCurMetricsFm() {
            return this.curMetricsFm;
        }

        /**
         * @return extraInfo
         */
        public String getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return instancesNumber
         */
        public Integer getInstancesNumber() {
            return this.instancesNumber;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return licenseKey
         */
        public String getLicenseKey() {
            return this.licenseKey;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < String > getTags() {
            return this.tags;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private Integer appType; 
            private java.util.List < CurMetrics> curMetrics; 
            private CurMetricsFm curMetricsFm; 
            private String extraInfo; 
            private Integer instancesNumber; 
            private String language; 
            private String licenseKey; 
            private String namespace; 
            private String regionId; 
            private String source; 
            private Long status; 
            private java.util.List < String > tags; 
            private String userId; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AppType.
             */
            public Builder appType(Integer appType) {
                this.appType = appType;
                return this;
            }

            /**
             * CurMetrics.
             */
            public Builder curMetrics(java.util.List < CurMetrics> curMetrics) {
                this.curMetrics = curMetrics;
                return this;
            }

            /**
             * CurMetricsFm.
             */
            public Builder curMetricsFm(CurMetricsFm curMetricsFm) {
                this.curMetricsFm = curMetricsFm;
                return this;
            }

            /**
             * ExtraInfo.
             */
            public Builder extraInfo(String extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * InstancesNumber.
             */
            public Builder instancesNumber(Integer instancesNumber) {
                this.instancesNumber = instancesNumber;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * LicenseKey.
             */
            public Builder licenseKey(String licenseKey) {
                this.licenseKey = licenseKey;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < String > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Result")
        private java.util.List < Result> result;

        @NameInMap("TotalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.result = builder.result;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < Result> result; 
            private Integer totalSize; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * TotalSize.
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
