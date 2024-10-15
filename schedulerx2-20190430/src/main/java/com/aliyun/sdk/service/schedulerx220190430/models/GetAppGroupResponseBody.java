// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAppGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppGroupResponseBody</p>
 */
public class GetAppGroupResponseBody extends TeaModel {
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

    private GetAppGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppGroupResponseBody create() {
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

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the application group.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>app is not existed, groupId=xxxx, namesapce=xxxx</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>39090022-1F3B-4797-8518-6B61095F1AF0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAppGroupResponseBody build() {
            return new GetAppGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAppGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppGroupResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("CurJobs")
        private Integer curJobs;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("MaxJobs")
        private Integer maxJobs;

        @com.aliyun.core.annotation.NameInMap("MonitorConfigJson")
        private String monitorConfigJson;

        private Data(Builder builder) {
            this.appKey = builder.appKey;
            this.appName = builder.appName;
            this.appVersion = builder.appVersion;
            this.curJobs = builder.curJobs;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.maxJobs = builder.maxJobs;
            this.monitorConfigJson = builder.monitorConfigJson;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return curJobs
         */
        public Integer getCurJobs() {
            return this.curJobs;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return maxJobs
         */
        public Integer getMaxJobs() {
            return this.maxJobs;
        }

        /**
         * @return monitorConfigJson
         */
        public String getMonitorConfigJson() {
            return this.monitorConfigJson;
        }

        public static final class Builder {
            private String appKey; 
            private String appName; 
            private String appVersion; 
            private Integer curJobs; 
            private String description; 
            private String groupId; 
            private Integer maxJobs; 
            private String monitorConfigJson; 

            /**
             * <p>The AppKey of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>QI4lWMZ+xk1rNB67jFUhaw==</p>
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>DocTest</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The application version. 1: Basic version, 2: Professional version.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * <p>The number of jobs that are configured for the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder curJobs(Integer curJobs) {
                this.curJobs = curJobs;
                return this;
            }

            /**
             * <p>The description of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>testSchedulerx.defaultGroup</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The maximum number of jobs that can be configured for the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxJobs(Integer maxJobs) {
                this.maxJobs = maxJobs;
                return this;
            }

            /**
             * <p>The configuration of the alert. The value is a JSON string. For more information, see <strong>the additional information about response parameters below this table.</strong></p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;sendChannel&quot;:&quot;sms,mail,ding&quot;}</p>
             */
            public Builder monitorConfigJson(String monitorConfigJson) {
                this.monitorConfigJson = monitorConfigJson;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
