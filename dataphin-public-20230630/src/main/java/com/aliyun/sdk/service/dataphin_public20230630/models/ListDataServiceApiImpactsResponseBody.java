// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDataServiceApiImpactsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataServiceApiImpactsResponseBody</p>
 */
public class ListDataServiceApiImpactsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDataServiceApiImpactsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataServiceApiImpactsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
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
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListDataServiceApiImpactsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageResult.
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
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

        public ListDataServiceApiImpactsResponseBody build() {
            return new ListDataServiceApiImpactsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataServiceApiImpactsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceApiImpactsResponseBody</p>
     */
    public static class ImpactList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private Long apiId;

        @com.aliyun.core.annotation.NameInMap("AppKey")
        private Long appKey;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("CallCount")
        private Long callCount;

        @com.aliyun.core.annotation.NameInMap("ClientFailCount")
        private Long clientFailCount;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("ErrorApiCount")
        private Long errorApiCount;

        @com.aliyun.core.annotation.NameInMap("ErrorCount")
        private Long errorCount;

        @com.aliyun.core.annotation.NameInMap("ErrorRate")
        private String errorRate;

        @com.aliyun.core.annotation.NameInMap("LastCallTime")
        private String lastCallTime;

        @com.aliyun.core.annotation.NameInMap("Minute")
        private String minute;

        @com.aliyun.core.annotation.NameInMap("OfflineCount")
        private Long offlineCount;

        @com.aliyun.core.annotation.NameInMap("SuccessTimeCost")
        private String successTimeCost;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalTimeCost")
        private String totalTimeCost;

        private ImpactList(Builder builder) {
            this.apiId = builder.apiId;
            this.appKey = builder.appKey;
            this.appName = builder.appName;
            this.callCount = builder.callCount;
            this.clientFailCount = builder.clientFailCount;
            this.clientIp = builder.clientIp;
            this.errorApiCount = builder.errorApiCount;
            this.errorCount = builder.errorCount;
            this.errorRate = builder.errorRate;
            this.lastCallTime = builder.lastCallTime;
            this.minute = builder.minute;
            this.offlineCount = builder.offlineCount;
            this.successTimeCost = builder.successTimeCost;
            this.totalCount = builder.totalCount;
            this.totalTimeCost = builder.totalTimeCost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImpactList create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public Long getApiId() {
            return this.apiId;
        }

        /**
         * @return appKey
         */
        public Long getAppKey() {
            return this.appKey;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return callCount
         */
        public Long getCallCount() {
            return this.callCount;
        }

        /**
         * @return clientFailCount
         */
        public Long getClientFailCount() {
            return this.clientFailCount;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return errorApiCount
         */
        public Long getErrorApiCount() {
            return this.errorApiCount;
        }

        /**
         * @return errorCount
         */
        public Long getErrorCount() {
            return this.errorCount;
        }

        /**
         * @return errorRate
         */
        public String getErrorRate() {
            return this.errorRate;
        }

        /**
         * @return lastCallTime
         */
        public String getLastCallTime() {
            return this.lastCallTime;
        }

        /**
         * @return minute
         */
        public String getMinute() {
            return this.minute;
        }

        /**
         * @return offlineCount
         */
        public Long getOfflineCount() {
            return this.offlineCount;
        }

        /**
         * @return successTimeCost
         */
        public String getSuccessTimeCost() {
            return this.successTimeCost;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalTimeCost
         */
        public String getTotalTimeCost() {
            return this.totalTimeCost;
        }

        public static final class Builder {
            private Long apiId; 
            private Long appKey; 
            private String appName; 
            private Long callCount; 
            private Long clientFailCount; 
            private String clientIp; 
            private Long errorApiCount; 
            private Long errorCount; 
            private String errorRate; 
            private String lastCallTime; 
            private String minute; 
            private Long offlineCount; 
            private String successTimeCost; 
            private Long totalCount; 
            private String totalTimeCost; 

            private Builder() {
            } 

            private Builder(ImpactList model) {
                this.apiId = model.apiId;
                this.appKey = model.appKey;
                this.appName = model.appName;
                this.callCount = model.callCount;
                this.clientFailCount = model.clientFailCount;
                this.clientIp = model.clientIp;
                this.errorApiCount = model.errorApiCount;
                this.errorCount = model.errorCount;
                this.errorRate = model.errorRate;
                this.lastCallTime = model.lastCallTime;
                this.minute = model.minute;
                this.offlineCount = model.offlineCount;
                this.successTimeCost = model.successTimeCost;
                this.totalCount = model.totalCount;
                this.totalTimeCost = model.totalTimeCost;
            } 

            /**
             * <p>apiNo</p>
             * 
             * <strong>example:</strong>
             * <p>2011</p>
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>appKey</p>
             * 
             * <strong>example:</strong>
             * <p>1101</p>
             */
            public Builder appKey(Long appKey) {
                this.appKey = appKey;
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
             * CallCount.
             */
            public Builder callCount(Long callCount) {
                this.callCount = callCount;
                return this;
            }

            /**
             * ClientFailCount.
             */
            public Builder clientFailCount(Long clientFailCount) {
                this.clientFailCount = clientFailCount;
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
             * ErrorApiCount.
             */
            public Builder errorApiCount(Long errorApiCount) {
                this.errorApiCount = errorApiCount;
                return this;
            }

            /**
             * ErrorCount.
             */
            public Builder errorCount(Long errorCount) {
                this.errorCount = errorCount;
                return this;
            }

            /**
             * ErrorRate.
             */
            public Builder errorRate(String errorRate) {
                this.errorRate = errorRate;
                return this;
            }

            /**
             * LastCallTime.
             */
            public Builder lastCallTime(String lastCallTime) {
                this.lastCallTime = lastCallTime;
                return this;
            }

            /**
             * Minute.
             */
            public Builder minute(String minute) {
                this.minute = minute;
                return this;
            }

            /**
             * OfflineCount.
             */
            public Builder offlineCount(Long offlineCount) {
                this.offlineCount = offlineCount;
                return this;
            }

            /**
             * SuccessTimeCost.
             */
            public Builder successTimeCost(String successTimeCost) {
                this.successTimeCost = successTimeCost;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalTimeCost.
             */
            public Builder totalTimeCost(String totalTimeCost) {
                this.totalTimeCost = totalTimeCost;
                return this;
            }

            public ImpactList build() {
                return new ImpactList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataServiceApiImpactsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceApiImpactsResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImpactList")
        private java.util.List<ImpactList> impactList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageResult(Builder builder) {
            this.impactList = builder.impactList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return impactList
         */
        public java.util.List<ImpactList> getImpactList() {
            return this.impactList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<ImpactList> impactList; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.impactList = model.impactList;
                this.totalCount = model.totalCount;
            } 

            /**
             * ImpactList.
             */
            public Builder impactList(java.util.List<ImpactList> impactList) {
                this.impactList = impactList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
