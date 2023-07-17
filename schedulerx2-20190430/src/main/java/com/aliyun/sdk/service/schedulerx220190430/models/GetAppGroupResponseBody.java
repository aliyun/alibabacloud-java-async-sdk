// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppGroupResponseBody</p>
 */
public class GetAppGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        public GetAppGroupResponseBody build() {
            return new GetAppGroupResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppKey")
        private String appKey;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("CurJobs")
        private Integer curJobs;

        @NameInMap("Description")
        private String description;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("MaxJobs")
        private Integer maxJobs;

        @NameInMap("MonitorConfigJson")
        private String monitorConfigJson;

        private Data(Builder builder) {
            this.appKey = builder.appKey;
            this.appName = builder.appName;
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
            private Integer curJobs; 
            private String description; 
            private String groupId; 
            private Integer maxJobs; 
            private String monitorConfigJson; 

            /**
             * AppKey.
             */
            public Builder appKey(String appKey) {
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
             * CurJobs.
             */
            public Builder curJobs(Integer curJobs) {
                this.curJobs = curJobs;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
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
             * MonitorConfigJson.
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
