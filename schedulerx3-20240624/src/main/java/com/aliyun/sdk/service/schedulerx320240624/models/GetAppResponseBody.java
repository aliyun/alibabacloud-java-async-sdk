// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link GetAppResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppResponseBody</p>
 */
public class GetAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAppResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAppResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder data(Data data) {
            this.data = data;
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
         * RequestId.
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

        public GetAppResponseBody build() {
            return new GetAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAppResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessToken")
        private String accessToken;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private Integer appType;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("EnableLog")
        private Boolean enableLog;

        @com.aliyun.core.annotation.NameInMap("ExecutorNum")
        private Long executorNum;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("JobNum")
        private Integer jobNum;

        @com.aliyun.core.annotation.NameInMap("LabelRouteStrategy")
        private Integer labelRouteStrategy;

        @com.aliyun.core.annotation.NameInMap("Leader")
        private String leader;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
        private Integer maxConcurrency;

        @com.aliyun.core.annotation.NameInMap("MaxJobs")
        private Integer maxJobs;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Updater")
        private String updater;

        private Data(Builder builder) {
            this.accessToken = builder.accessToken;
            this.appName = builder.appName;
            this.appType = builder.appType;
            this.creator = builder.creator;
            this.enableLog = builder.enableLog;
            this.executorNum = builder.executorNum;
            this.id = builder.id;
            this.jobNum = builder.jobNum;
            this.labelRouteStrategy = builder.labelRouteStrategy;
            this.leader = builder.leader;
            this.maxConcurrency = builder.maxConcurrency;
            this.maxJobs = builder.maxJobs;
            this.title = builder.title;
            this.updater = builder.updater;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessToken
         */
        public String getAccessToken() {
            return this.accessToken;
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
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return enableLog
         */
        public Boolean getEnableLog() {
            return this.enableLog;
        }

        /**
         * @return executorNum
         */
        public Long getExecutorNum() {
            return this.executorNum;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return jobNum
         */
        public Integer getJobNum() {
            return this.jobNum;
        }

        /**
         * @return labelRouteStrategy
         */
        public Integer getLabelRouteStrategy() {
            return this.labelRouteStrategy;
        }

        /**
         * @return leader
         */
        public String getLeader() {
            return this.leader;
        }

        /**
         * @return maxConcurrency
         */
        public Integer getMaxConcurrency() {
            return this.maxConcurrency;
        }

        /**
         * @return maxJobs
         */
        public Integer getMaxJobs() {
            return this.maxJobs;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return updater
         */
        public String getUpdater() {
            return this.updater;
        }

        public static final class Builder {
            private String accessToken; 
            private String appName; 
            private Integer appType; 
            private String creator; 
            private Boolean enableLog; 
            private Long executorNum; 
            private Long id; 
            private Integer jobNum; 
            private Integer labelRouteStrategy; 
            private String leader; 
            private Integer maxConcurrency; 
            private Integer maxJobs; 
            private String title; 
            private String updater; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessToken = model.accessToken;
                this.appName = model.appName;
                this.appType = model.appType;
                this.creator = model.creator;
                this.enableLog = model.enableLog;
                this.executorNum = model.executorNum;
                this.id = model.id;
                this.jobNum = model.jobNum;
                this.labelRouteStrategy = model.labelRouteStrategy;
                this.leader = model.leader;
                this.maxConcurrency = model.maxConcurrency;
                this.maxJobs = model.maxJobs;
                this.title = model.title;
                this.updater = model.updater;
            } 

            /**
             * <p>AccessToken。</p>
             * 
             * <strong>example:</strong>
             * <p>2f4ddeab8e344ed68e0402cf9b8502ffv3</p>
             */
            public Builder accessToken(String accessToken) {
                this.accessToken = accessToken;
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
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * EnableLog.
             */
            public Builder enableLog(Boolean enableLog) {
                this.enableLog = enableLog;
                return this;
            }

            /**
             * ExecutorNum.
             */
            public Builder executorNum(Long executorNum) {
                this.executorNum = executorNum;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * JobNum.
             */
            public Builder jobNum(Integer jobNum) {
                this.jobNum = jobNum;
                return this;
            }

            /**
             * LabelRouteStrategy.
             */
            public Builder labelRouteStrategy(Integer labelRouteStrategy) {
                this.labelRouteStrategy = labelRouteStrategy;
                return this;
            }

            /**
             * Leader.
             */
            public Builder leader(String leader) {
                this.leader = leader;
                return this;
            }

            /**
             * MaxConcurrency.
             */
            public Builder maxConcurrency(Integer maxConcurrency) {
                this.maxConcurrency = maxConcurrency;
                return this;
            }

            /**
             * MaxJobs.
             */
            public Builder maxJobs(Integer maxJobs) {
                this.maxJobs = maxJobs;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Updater.
             */
            public Builder updater(String updater) {
                this.updater = updater;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
